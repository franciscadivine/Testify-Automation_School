package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Task18 {
    WebDriver driver;

    @BeforeClass
    public void openUrl() {
        System.setProperty(
                "webdriver.geckodriver",
                "C:\\Users\\Francisca\\Testify-Automation_School\\Module4D\\src\\geckodriver.exe");
         driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
    }
    @Test
    public void loginTest() {
        driver.get("https://www.saucedemo.com/");
        SauceLogin login = new SauceLogin(driver);
        login.getUsername().sendKeys("standard_user");
        login.getPassword().sendKeys("secret_sauce");
        login.getLoginBtn().click();
    }

    @Test(dependsOnMethods = "loginTest")
    public void addProduct() {
        SauceProductPage product = new SauceProductPage(driver);
        product.getItem().click();
        product.getCarticon().click();

        String actualText = product.getInvtItem().getText();
        Assert.assertEquals(actualText, "Sauce Labs Backpack");
    }
      @Test(dependsOnMethods = "addProduct")
    public void  checkoutPage(){
        SauceCheckout checkout = new SauceCheckout(driver);
        checkout.getCheckoutBtn().click();
        checkout.getFirstName().sendKeys("Francisca");
        checkout.getLastName().sendKeys("Tester");
        checkout.getPostalCode().sendKeys("100001");
        checkout.getContinueBtn().click();
       String actualItem = checkout.getOverviewItemName().getText();
       Assert.assertEquals(actualItem, "Sauce Labs Backpack");


    }
    @Test(dependsOnMethods =  "checkoutPage")
        public void finishOrder(){
        SauceCheckout confirm = new SauceCheckout(driver);
        confirm.getFinishBtn().click();
       String actualText =  confirm.getSuccessMessage().getText();
       Assert.assertEquals(actualText, "Thank you for your order!");
    }

    }

