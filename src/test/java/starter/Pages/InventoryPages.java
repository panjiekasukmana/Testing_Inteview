package starter.Pages;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPages extends PageObject {
    @Managed
    WebDriver driver = getDriver();

    public static String Inventory_URL = "https://www.saucedemo.com/inventory.html";

    private final By Price = By.className("inventory_item_price");
    private final By getItem = By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]");
    private final By cartButton = By.className("shopping_cart_link");
    private final By checkoutButton = By.id("checkout");




    public String getPrice() {
        return driver.findElement(Price).getAttribute("innerHTML");
    }

    public void getItem() {
        driver.findElement(getItem).click();
    }

    public void addtocart() {
        driver.findElement(cartButton).click();
    }

    public void checkOut() {
        driver.findElement(checkoutButton).click();
    }

}