package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import starter.Pages.CheckStepOnePage;
import starter.Pages.InventoryPages;
import starter.Pages.LoginPages;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
import static org.junit.Assert.*;

public class CheckOutStepDef {

    WebDriver driver = getDriver();
    LoginPages loginPages;
    InventoryPages inventoryPages;
    CheckStepOnePage checkStepOnePage;
    @Given("I already logged in")
    public void ilreadyLoggedIn() {
        loginPages.open();
        loginPages.InputUsername("standard_user");
        loginPages.InputPassword("secret_sauce");
        loginPages.clickButton();
    }

    @When("I'm on the inventory page")
    public void imOnTheInventoryPage() {
        assertEquals(inventoryPages.Inventory_URL,driver.getCurrentUrl());
    }

    @And("I click add to cart button on sauce labs back")
    public void iClickAddToCartButtonOnSauceLabsBack() {
        inventoryPages.getItem();
    }

    @And("I click on cart button")
    public void iClickOnCartButton() {
        inventoryPages.addtocart();
    }

    @Then("Price same with inventorypage {string}")
    public void isOnTheCartList(String itemname) {
        assertEquals(itemname,inventoryPages.getPrice());
    }

    @And("I click checkout button")
    public void iClickCheckoutButton() {
        inventoryPages.checkOut();
    }

    @And("I am directed to checkout page")
    public void iAmDirectedToCheckoutPage() {
        assertEquals(checkStepOnePage.pageURL,driver.getCurrentUrl());
    }

    @And("I input firstname with {string}")
    public void iInputFirstnameWith(String First) {
        checkStepOnePage.inputFirstname(First);
    }

    @And("I input lastname with {string}")
    public void iInputLastnameWith(String Last) {
        checkStepOnePage.inputLastname(Last);
    }

    @And("I input postal code with {string}")
    public void iInputPostalCodeWith(String Code) {
        checkStepOnePage.inputPostalCode(Code);
    }

    @And("I click on continue button")
    public void iClickOnContinueButton() {
        checkStepOnePage.clickContinueButton();
    }

    @And("summary of checkout is appear product name {string}")
    public void summaryOfCheckoutIsAppearProductName(String productName) {
        assertEquals(productName,checkStepOnePage.getProductname());
    }

    @And("I click finish button")
    public void iClickFinishButton() {
        checkStepOnePage.clickFinishButton();
    }

    @Then("checkout process completed")
    public void checkoutProcessCompleted() {
        assertEquals("https://www.saucedemo.com/checkout-complete.html",driver.getCurrentUrl());
    }
}
