package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task8 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chromedriver","C:\\Users\\Francisca\\Testify-Automation_School\\Module4D\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://idorenyinankoh.github.io/loginPage/ ");
       boolean status = driver.findElement(By.xpath("//button[@id='create']")).isEnabled();
        System.out.println(status);
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Joy");
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Uria");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Uria@gmail.com");
        driver.findElement(By.xpath("//input[@id='male']")).click();
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Test123");
        driver.findElement(By.xpath("//input[@id='confirmPass']")).sendKeys("Test123");
        driver.findElement(By.cssSelector("#xpLevel")).sendKeys("i am me");
        //boolean status = driver.findElement(By.xpath("//button[@id='create']")).isEnabled();
        System.out.println(status);
    }

}
