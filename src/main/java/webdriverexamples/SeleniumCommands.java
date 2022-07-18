package webdriverexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SeleniumCommands {

    public WebDriver _driver;

    public SeleniumCommands(WebDriver driver)
    {
        this._driver = driver;
    }

    public void navigate(String url)
    {
        _driver.navigate().to(url);
    }

    //find an element
    public WebElement findOne(By by)
    {
        WebDriverWait wait = new WebDriverWait(_driver, Duration.ofSeconds(5));
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    //find elements
    public List<WebElement> find(By by)
    {
        WebDriverWait wait = new WebDriverWait(_driver, Duration.ofSeconds(5));
        return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
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


    public void selectFromCustomDropdown(By dropDown, By options, String text)
    {
        click(dropDown);
        var dropDownOptions = find(options);
        for(WebElement element : dropDownOptions)
        {
            if(element.getText().equals(text))
            {
                element.click();
            }
        }
    }

    public String getText(By by)
    {
        return findOne(by).getText();
    }
}
