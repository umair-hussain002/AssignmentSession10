package applications.way2automate.components;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class AbstractComponent {

    public WebDriver _driver;

    public AbstractComponent(WebDriver driver)
    {
        this._driver = driver;
    }

    public abstract By scopedLocator();
    public WebElement scopedElement = null;

    public WebElement findOne(By by)
    {
        WebDriverWait wait = new WebDriverWait(_driver, Duration.ofSeconds(5));
        if(scopedElement == null)
        {
            scopedElement = wait.until(ExpectedConditions.presenceOfElementLocated(scopedLocator()));
        }

        try
        {
            return scopedElement.findElement(by);
        }
        catch(StaleElementReferenceException ex)
        {
            scopedElement = wait.until(ExpectedConditions.presenceOfElementLocated(scopedLocator()));
            return scopedElement.findElement(by);
        }
        catch(Exception ex)
        {
            throw ex;
        }
    }

    //click
    public void click(By by)
    {
        findOne(by).click();
    }

    //send keys
    public void sendKeys(By by, String text)
    {
        findOne(by).sendKeys(text);
    }

    //select from dropdown
    public void selectFromDropdown(By by, String text)
    {
        var select = new Select(findOne(by));
        select.selectByVisibleText(text);
    }

    public String getText(By by)
    {
        return findOne(by).getText();
    }
}
