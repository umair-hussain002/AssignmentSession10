package applications.way2automate.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryItem extends AbstractComponent{
    public InventoryItem(WebDriver driver, String itemName) {
        super(driver);
        this._itemName = itemName;
    }

    private String _itemName;
    @Override
    public By scopedLocator() {
        return By.xpath("//div[text()='"+_itemName+"']/ancestor::div[@class='inventory_item']");
    }

    private By addToCart = By.xpath(".//button[text()='Add to cart']");

    public void addItemToCart() throws InterruptedException {
        click(addToCart);
        Thread.sleep(500);
    }


}
