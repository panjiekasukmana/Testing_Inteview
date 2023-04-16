package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.WebDriver;
import starter.Pages.InventoryPages;
import starter.Pages.LoginPages;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
import static org.junit.Assert.*;

public class LoginStepDef {

    WebDriver driver = getDriver();

    LoginPages loginPages;
    InventoryPages inventoryPages;
    
    @Given("I Already Login In Page")
    public void iAlreadyLoginInPage() {
        loginPages.open();
    }

    @When("I Input Username {string}")
    public void iInputUsername(String Username) {
        loginPages.InputUsername(Username);
    }

    @And("I Input Password {string}")
    public void iInputPassword(String Password) {
        loginPages.InputPassword(Password);
    }

    @And("I Click Login Button")
    public void iClickLoginButton() {
        loginPages.clickButton();
    }

    @Then("direct to inventory page")
    public void directToInventoryPage() {
        assertEquals(inventoryPages.Inventory_URL,driver.getCurrentUrl());
        assertEquals("$29.99", inventoryPages.getPrice());
    }
}
