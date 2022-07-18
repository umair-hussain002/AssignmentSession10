package applications.way2automate.pages;

import applications.way2automate.models.Transaction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import webdriverexamples.SeleniumCommands;

public class AccountPage extends AbstractPage{
    private By depositLink = By.xpath("//button[contains(.,'Deposit')]");
    private By depositInput= By.xpath("//label[text()='Amount to be Deposited :']/following-sibling::input");
    private By depositBtn = By.xpath("//button[text()='Deposit']");
    private By successMessage = By.xpath("//span[text()='Deposit Successful']");
    private By accountSelector = By.id("accountSelect");

    public AccountPage(WebDriver driver) {
        super(driver);
    }

    public boolean makeDeposit(int amount)
    {
        click(depositLink);
        sendKeys(depositInput, amount+"");
        click(depositBtn);
        return findOne(successMessage).isDisplayed();
    }

    public boolean makeDeposit(Transaction transaction)
    {
        selectFromDropdown(accountSelector,transaction.account);
        click(depositLink);
        sendKeys(depositInput, transaction.amount+"");
        click(depositBtn);
        return findOne(successMessage).isDisplayed();
    }

    public boolean makeWithdrawal(Transaction transaction)
    {
        return true;
    }
}
