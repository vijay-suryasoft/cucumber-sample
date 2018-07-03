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
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginSteps {

    private static final WebDriver driver;

    static {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Given("^open login page$")
    public void openLoginPage() {

        driver.manage().window().maximize();
        driver.get("https://www.clarinsusa.com");

        new WebDriverWait(driver, 120).until(
                webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));

        driver.findElement(By.className("newsletter-overlay-container")).findElement(By.className("newsletter-overlay-close")).click();

        driver.findElement(By.className("user-account")).click();
    }

    @When("^login and password are provided$")
    public void provideLoginAndPassword() {
        driver.findElement(By.id("dwfrm_login")).findElement(By.xpath("//form/fieldset/div/input[@type='email']")).sendKeys("suvesh.ptw@gmail.com");
        driver.findElement(By.id("dwfrm_login")).findElement(By.xpath("//form/fieldset/div/input[@type='password']")).sendKeys("1241019115");

        driver.findElement(By.id("dwfrm_login")).findElement(By.xpath("//form/fieldset/div/button")).click();
    }

    @Then("^Check for successful login and exit$")
    public void checkForSuccessfulLogin() {
        try {

            System.out.print("Phase 3");

            ((JavascriptExecutor) driver).executeScript("document.getElementsByClassName(\"sign-out\")[0].getElementsByTagName(\"a\")[0].click();");

        } finally {
            driver.close();
            driver.quit();
        }
    }

}
