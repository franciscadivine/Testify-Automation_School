package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Task17 {
    WebDriver driver;

    @BeforeClass
    public void openUrl() {
                System.setProperty("webdriver.chromedriver","C:\\Users\\Francisca\\Testify-Automation_School\\Module4D\\src\\chromedriver.exe");;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
    }

    @Test
    public void elementTile() throws InterruptedException {
        driver.get("https://demoqa.com");
        JavascriptExecutor js =(JavascriptExecutor)driver;
        Thread.sleep(5000);
        js.executeScript("window.scrollBy(0,600)");
        //driver.findElement(By.xpath("//div@[class='ns-x5rpy-e-12 column-container text-button']")).click();
        driver.findElement(By.xpath("//h5[text()='Elements']/ancestor::div[contains(@class,'card')]")).click();
        String text = driver.findElement(By.xpath("//div[@class='main-header' and text()='Elements']")).getText();
        Thread.sleep(5000);
        System.out.println(text);
        Assert.assertEquals("text", "Elements");
    }
}
