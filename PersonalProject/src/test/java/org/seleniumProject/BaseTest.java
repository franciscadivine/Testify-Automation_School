package org.seleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseTest {


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
    @AfterClass
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}
