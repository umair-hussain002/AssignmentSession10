package applications.way2automate.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewPage extends AbstractPage{
    public NewPage(WebDriver driver)
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
