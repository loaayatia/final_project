package steps;

import Base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import Pages.HomePage;
import pages.P01_register;
public class D01_RegisterStepDef extends TestBase {
    HomePage HomePageObject = new HomePage(driver);
    P01_register p01_RegisterObject = new P01_register(driver);

    @Given("navigate to home page page")
    public void navigate_to_home_page_page() {

    }
    @Given("User Clicks on Register Button")
    public void user_clicks_on_Register_button() {
        HomePageObject.clickOnRegisterButton();

    }
    @Given("user select gender type")
    public void user_select_gender_type() {
        p01_RegisterObject.setClickregisterbutton();

    }
    @Given("user enter first name")
    public void user_enter_first_name() {
        p01_RegisterObject.setFristname();
        p01_RegisterObject.setLastname();
    }
    @Given("user enter last name")
    public void user_enter_last_name() {
        p01_RegisterObject.setLastname();
    }
    @Given("user enter date of birth")
    public void user_enter_date_of_birth() {
        p01_RegisterObject.selectDay();
        p01_RegisterObject.selectMonthh();
        p01_RegisterObject.selectYear();

    }
    @Given("user enter email")
    public void user_enter_email() {
        p01_RegisterObject.setEmail();

    }
    @Given("user fills Password fields")
    public void user_fills_password_fields() {
        p01_RegisterObject.setPassword();
        p01_RegisterObject.setConfirmPassword();
    }
    @Given("user clicks on register button")
    public void user_clicks_on_register_button() {
        p01_RegisterObject.setClickregisterbutton();
    }
    @Then("success message is displayed")
    public void success_message_is_displayed() {
        Assert.assertEquals(driver.getTitle(),"Your registration completed");
    }
}
