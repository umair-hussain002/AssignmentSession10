package applications.way2automate.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public abstract class AbstractSauceLabsPage extends AbstractPage{
    public AbstractSauceLabsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void click(By by)
    {
        Actions action = new Actions(_driver);
        WebElement element = findOne(by);
        action.click(element).build().perform();
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
}
