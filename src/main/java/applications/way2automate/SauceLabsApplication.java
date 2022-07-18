package applications.way2automate;

import applications.way2automate.components.HeaderNavbar;
import applications.way2automate.pages.SauceLabsLogin;
import applications.way2automate.pages.SauceLabsProductPage;
import org.openqa.selenium.WebDriver;

public class SauceLabsApplication {

    public SauceLabsLogin loginPage;
    public SauceLabsProductPage productPage;
    public HeaderNavbar headerNavbar;

    public SauceLabsApplication(WebDriver driver)
    {
        loginPage = new SauceLabsLogin(driver);
        productPage = new SauceLabsProductPage(driver);
        headerNavbar = new HeaderNavbar(driver);
    }
}
