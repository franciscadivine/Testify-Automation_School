package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task10 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chromedriver","C:\\Users\\Francisca\\Testify-Automation_School\\Module4D\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/");
        driver.findElement(By.xpath("//a[contains(text(),'Droppable')]")).click();

    }
}
