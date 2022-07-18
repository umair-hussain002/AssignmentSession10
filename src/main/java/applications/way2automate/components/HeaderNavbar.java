package applications.way2automate.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderNavbar extends AbstractComponent{

    public HeaderNavbar(WebDriver driver) {
        super(driver);
    }

    @Override
    public By scopedLocator() {
        return By.xpath("//div[@class='primary_header']");
    }

    private By burgerMenu = By.id("react-burger-menu-btn");
    private By logoutBtn = By.xpath(".//a[text()='Logout']");
    private By cartIcon = By.xpath(".//a[@class='shopping_cart_link']");

    public void logOut()
    {
        click(burgerMenu);
        click(logoutBtn);
    }

    public void openCart()
    {
        click(cartIcon);
    }
}
