package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task9 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.geckodriver", "C:\\Users\\Francisca\\Testify-Automation_School\\Module4D\\src\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/ ");
        driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("input[placeholder='Password'][name='password']")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("input.submit-button.btn_action")).click();
        //driver.findElement()
        driver.navigate().back();

        String name = driver.findElement(By.xpath("//input[@id='login-button']")).getAttribute("id");
        System.out.println(name);

        Thread.sleep(5000);
        driver.navigate().forward();

       String product =  driver.findElement(By.xpath("//div[contains(text(),'Sauce Labs Bolt T-Shirt')]")).getText();
        System.out.println(product);

    }
}
