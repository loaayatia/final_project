package steps;

import Base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.P01_register;
import Pages.HomePage;
import pages.P02_login;

public class D02_loginStepDef extends TestBase {
    HomePage HomePageobject = new HomePage(driver);
    P02_login P02_loginObject = new P02_login(driver);

    @Given("User Go To home page")
    public void user_go_to_home_page() {
        HomePageobject.navigateToHomePage();
    }
    @When("User Clicks on Login Button")
    public void user_clicks_on_login_button() {
        HomePageobject.clickOnLoginButton();
    }
    @When("User Enter Valid Email")
    public void user_enter_valid_email() {
        P02_loginObject.enterValidEmail();
    }
    @When("User Enter Valid Password")
    public void user_enter_valid_password() {
        P02_loginObject.enterPassword();
    }
    @Then("User Press on Login Button")
    public void user_press_on_login_button() {
        P02_loginObject.clickOnLoginButton();
        Assert.assertEquals(driver.findElement(By.xpath("//a[@class='ico-account']")).getText(),"My account");
    }
    @Given("User in home page")
    public void user_in_home_page() {
        HomePageobject.navigateToHomePage();
    }
    @When("User Enter on Login Button")
    public void userEnterOnLoginButton() {
        HomePageobject.clickOnLoginButton();
    }
    @When("User Enter InValid Email")
    public void user_enter_in_valid_email() {
        P02_loginObject.enterInvalidEmail();
    }
    @When("User Enter InValid Password")
    public void user_enter_in_valid_password() {
        P02_loginObject.enterPassword();
    }
    @Then("Press on Login Button")
    public void press_on_login_button() {
        P02_loginObject.clickOnLoginButton();
        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText(),"Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found");

    }



}
