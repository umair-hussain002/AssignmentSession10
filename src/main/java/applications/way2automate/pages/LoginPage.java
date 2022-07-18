package applications.way2automate.pages;

import applications.way2automate.models.Credential;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import webdriverexamples.Commands;
import webdriverexamples.SeleniumCommands;

import java.time.Duration;

public class LoginPage extends AbstractPage{
    public LoginPage(WebDriver driver)
    {
        super(driver);
    }
    public By customerLoginBtn = By.xpath("//button[text()='Customer Login']");
    public By customerSelect = By.id("userSelect");
    public By loginBtn = By.xpath("//button[text()='Login']");

    public void login(String username)
    {
        navigate("https://www.way2automation.com/angularjs-protractor/banking/#/login");
        click(customerLoginBtn);
        selectFromDropdown(customerSelect,username);
        click(loginBtn);
    }

}
