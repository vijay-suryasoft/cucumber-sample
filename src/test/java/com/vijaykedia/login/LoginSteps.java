package com.vijaykedia.login;
/*
 * Created by IntelliJ IDEA.
 * User: Vijay Kedia
 * Date: 27 June 2018
 * Time: 02:42 PM
 */

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginSteps {

    private static final WebDriver driver;

    static {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
    }

    @Given("^open login page$")
    public void openLoginPage() {
        driver.get("https://www.clarinsusa.com");
    }

    @When("^login and password are provided$")
    public void provideLoginAndPassword() {

    }

    @Then("^Check for successful login$")
    public void checkForSuccessfulLogin() {

    }

}
