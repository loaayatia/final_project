package steps;

import Base.TestBase;
import Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
public class D06_homeSlidersStepDef extends TestBase {
    HomePage P03_homePageObject = new HomePage(driver);
    @Given("User in Home Page")
    public void user_in_home_page() {
        P03_homePageObject.navigateToHomePage();
    }
    @When("User Click On Frist Slider")
    public void user_click_on_frist_slider() {
        P03_homePageObject.selectGalaxys22();
    }
    @Then("The Web Page Should Direct To the Nokia WebSite")
    public void the_web_page_should_direct_to_the_nokia_web_site() {
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/nokia-lumia-1020");
    }
    @Given("Go TO Website Home")
    public void go_to_website_home() {
        P03_homePageObject.navigateToHomePage();
    }
    @When("User Click On Second Slider")
    public void user_click_on_second_slider() {
        P03_homePageObject.selectIphone14Pro();
    }
    @Then("The Web Page Should Direct To the Iphone WebSite")
    public void the_web_page_should_direct_to_the_iphone_web_site() {
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/iphone-6");
    }
}
