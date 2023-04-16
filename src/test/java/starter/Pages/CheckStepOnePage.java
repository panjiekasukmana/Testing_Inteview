package starter.Pages;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class CheckStepOnePage extends PageObject {

    @Managed
    WebDriver driver = getDriver();

    public static String pageURL = "https://www.saucedemo.com/checkout-step-one.html";

    private final By firstnameField = By.id("first-name");
    private final By lastnameField = By.id("last-name");
    private final By postalCodeField = By.id("postal-code");
    private final By continueButton = By.id("continue");
    private final By productname = By.className("inventory_item_name");
    private final By finishButton = By.id("finish");




    public void inputFirstname(String firstname) {
        driver.findElement(firstnameField).sendKeys(firstname);
    }

    public void inputLastname(String lastname) {
        driver.findElement(lastnameField).sendKeys(lastname);
    }

    public void inputPostalCode(String postalcode) {
        driver.findElement(postalCodeField).sendKeys(postalcode);
    }
    public void clickContinueButton(){
        driver.findElement(continueButton).click();
    }
    public String getProductname() {
        return driver.findElement(productname).getAttribute("innerHTML");
    }
    public void clickFinishButton(){
        driver.findElement(finishButton).click();
    }
}
