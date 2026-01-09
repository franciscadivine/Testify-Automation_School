package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {
    public static void main(String[] args) {
        System.setProperty("webdriver.Chrome.driver", "C:\\Users\\Francisca\\Testify-Automation_School\\Module4D\\src\\chromedriver.exe");
        //Navigate to url
        WebDriver driver = new ChromeDriver();
        //maximize page
        driver.manage().window().maximize();
        //launch url
        driver.get("http://demo.guru99.com/ ");
        driver.findElement(By.name("emailid")).sendKeys("yello@gmail.com");
        driver.findElement(By.name("btnLogin")).click();
        //driver.close();
    }
}
