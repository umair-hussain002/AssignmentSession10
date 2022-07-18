package webdriverexamples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCreation {

    public static WebDriver chromeDriverStatic()
    {
        // System Property for Chrome Driver
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/main/resources/chromedriver");

        // Instantiate a ChromeDriver class.
        WebDriver driver=new ChromeDriver();

        WebElement element = driver.findElement(By.xpath("//div[text()='Sauce Labs Bike Light']/ancestor::div[@class='inventory_item']"));
        WebElement addToCart = element.findElement(By.xpath(".//button[text()='Add to cart']"));
        addToCart.click();
        return driver;
    }

    public static WebDriver chromeDriverManager()
    {
        var wdm = WebDriverManager.chromedriver();
        wdm.browserVersion("103");
        wdm.setup();
        wdm.getDownloadedDriverPath();

        return new ChromeDriver();
    }

    public void example()
    {

    }

}
