package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Task15 {

    WebDriver driver;

    @BeforeClass
    public void openUrl() {
        System.setProperty(
                "webdriver.chromedriver",
                "C:\\Users\\Francisca\\Testify-Automation_School\\Module4D\\src\\chromedriver.exe"
        );

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
    }

    @Test
    public void googleSearch() throws InterruptedException {
        driver.get("https://www.google.com");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//textarea[@id='APjFqb']"))
                .sendKeys("testify ltd");
    }

    @Test
    public void mcdonaldOrderButtonColor() throws InterruptedException {
        driver.get("https://www.mcdonalds.com/us/en-us.html");
        Thread.sleep(5000); // better replaced with explicit wait

        String actualColor = driver
                .findElement(By.xpath("//a[@id='button-ordernow']"))
                .getCssValue("background-color");
        System.out.println(actualColor);

        // Expected color in rgba format
        String expectedColor = "rgba(255, 188, 13, 1)";

        Assert.assertEquals(actualColor, expectedColor,
                "Background color does not match!");
    }

    @AfterClass
    public void browserQuit() {
        driver.quit();
    }
}
