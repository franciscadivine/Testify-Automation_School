package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v137.indexeddb.model.Key;
import org.testng.Assert;

public class Task11 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chromedriver","C:\\Users\\Francisca\\Testify-Automation_School\\Module4D\\src\\geckodriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("testify ltd");
        driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys(Keys.ENTER);

        driver.findElement(By.xpath("//div[@class='tF2Cxc']//div[@class='yuRUbf']//div[@class='b8lM7']//span[@class='V9tjod']//a[@class='zReHs']//div[@class='notranslate ESMNde HGLrXd ojE3Fb']//div[@class='q0vns']//div[@class='CA5RN']//div//span[@class='VuuXrf'][contains(text(),'Testify Limited')]")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,5000)");
        driver.findElement(By.xpath("//a[@href='https://www.linkedin.com/company/testifyorg']")).click();
        driver.findElement(By.xpath("//a[@id='ember348']")).click();
        String text = driver.findElement(By.xpath("//h2[@class='UhTMnxhsoIuFualmaZbIxTNlsZCBwehXsE']")).getText();
        System.out.println(text);
        Assert.assertEquals(text, "Overview");

    }
}
