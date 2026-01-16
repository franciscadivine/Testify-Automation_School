package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class Task16 {
    WebDriver driver;

    @BeforeClass
    public void openUrl() {
        System.setProperty(
                "webdriver.geckodriver",
                "C:\\Users\\Francisca\\Testify-Automation_School\\Module4D\\src\\geckodriver.exe");
        driver = new FirefoxDriver();


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
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys(Keys.ENTER);
       String ContactInfo = driver.findElement(By.xpath("//a[contains(text(),'info@testifyltd.com')]")).getText();
        System.out.println(ContactInfo);
        Assert.assertEquals("ContactInfo","info@testifyltd.com");
        SoftAssert sa = new SoftAssert();
        sa.assertAll();
        sa.assertEquals("info@testifyltd.com", "info@testifyltd.com");
        String phoneNumber = driver.findElement(By.xpath("info@testifyltd.com")).getText();
        System.out.println(phoneNumber);
        Assert.assertEquals("phoneNumber", "(+234)909-136-6160");
        String country = driver.findElement(By.xpath("//p[@class='text-white text-sm font-semibold']")).getText();
        System.out.println(country);
        Assert.assertEquals("country", "From Nigeria to the world");


    }
}
