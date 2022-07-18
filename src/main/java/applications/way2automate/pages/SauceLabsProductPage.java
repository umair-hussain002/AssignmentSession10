package applications.way2automate.pages;

import applications.way2automate.components.HeaderNavbar;
import applications.way2automate.components.InventoryItem;
import org.apache.hc.core5.http.Header;
import org.openqa.selenium.WebDriver;

public class SauceLabsProductPage extends AbstractPage{

    public HeaderNavbar headerNavbar;
    public SauceLabsProductPage(WebDriver driver) {
        super(driver);
        headerNavbar = new HeaderNavbar(driver);
    }

    public void addItemToCart(String itemName) throws InterruptedException {
        InventoryItem item = new InventoryItem(_driver, itemName);
        item.addItemToCart();
    }

    public void addItemsToCart(String[] items) throws InterruptedException
    {
        for(String item : items)
        {
            InventoryItem invItem = new InventoryItem(_driver, item);
            invItem.addItemToCart();
        }
        headerNavbar.openCart();
    }
}
