package pages;

import Pages.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P02_login extends PageBase {
    By emailField = By.id("Email");
    By passwordField = By.id("Password");
    By loginButton = By.xpath("//button[@class='button-1 login-button']");
    public P02_login(WebDriver driver) {
        super(driver);
    }
    public void enterValidEmail(){
        setelementtext(emailField,"test@example.com");
    }
    public void enterInvalidEmail(){
        setelementtext(emailField, "wrong@example.com");
    }
    public void enterPassword(){
        setelementtext(passwordField,"P@ssw0rd");
    }
    public void clickOnLoginButton(){
        clickOnelement(loginButton);
    }
}
