package org.example.stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.LoginPage;

public class LoginPageStepDef {
    private WebDriver driver;
    private LoginPage loginPage;

    @Before
    public  void  setup( ){
        driver=new ChromeDriver();
    }

    @After
    public  void  teardown( ){
        if (driver!=null){
            driver.quit();
        }
    }


        @Given("I am on the login page")
        public void I_am_on_the_login_page() {
            // Write code here that turns the phrase above into concrete actions
            driver.get("https://www.saucedemo.com/");
            loginPage=new LoginPage(driver);

        }
        @Given("user enters valid username and password")
        public void user_enters_valid_username_and_password () {
            // Write code here that turns the phrase above into concrete actions
            loginPage.enterUsername("standard_user");
            loginPage.enterUserPwd("secret_sauce");

        }
        @When("I click on login button")
        public void i_click_on_login_button() {
            // Write code here that turns the phrase above into concrete actions
            loginPage.clickLogin();

        }
        @Then("user navigated to home page")
        public void user_navigated_to_home_page () {
            // Write code here that turns the phrase above into concrete actions
            Assert.assertEquals(loginPage.checklogoutlink(),true);
        }

    @Then("I should see an error message indicating {string}")
    public void iShouldSeeAnErrorMessageIndicating(String arg0) {
    }

    @Given("I have entered invalid {string} and {string}")
    public void iHaveEnteredInvalidAnd(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterUserPwd(password);
    }
}

