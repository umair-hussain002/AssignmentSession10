package applications.way2automate.pages;

import applications.way2automate.models.Credential;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceLabsLogin extends  AbstractSauceLabsPage{
    public SauceLabsLogin(WebDriver driver) {
        super(driver);
    }

    private By username = By.id("user-name");
    private By password = By.id("password");
    private By loginBtn = By.id("login-button");

    public void login(Credential credential)
    {
        navigate(credential.getUrl());
        sendKeys(username, credential.getUsername());
        sendKeys(password, credential.getPassword());
        click(loginBtn);
    }

    public boolean pageDisplayed()
    {
        return findOne(username).isDisplayed();
    }
}
