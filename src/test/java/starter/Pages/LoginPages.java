package starter.Pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://www.saucedemo.com/")
public class LoginPages extends PageObject{
    @Managed
    WebDriver driver = getDriver();

    private final By fieldUsername = By.id("user-name");
    private final By fieldPassword = By.id("password");
    private final By loginButton = By.id("login-button");



    public void InputUsername(String Username){
        driver.findElement(fieldUsername).sendKeys(Username);
    }

    public void InputPassword(String Password){
        driver.findElement(fieldPassword).sendKeys(Password);
    }

    public void clickButton(){
        driver.findElement(loginButton).click();
    }

}
