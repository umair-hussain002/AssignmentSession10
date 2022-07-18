package applications.way2automate;

import applications.way2automate.pages.AccountPage;
import applications.way2automate.pages.LoginPage;
import com.beust.ah.A;
import org.openqa.selenium.WebDriver;

public class BankingApplication {

    public LoginPage loginPage;
    public AccountPage accountPage;

    public BankingApplication(WebDriver driver)
    {
        loginPage = new LoginPage(driver);
        accountPage = new AccountPage(driver);
    }
}
