package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class Task12a {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chromedriver","C:\\Users\\Francisca\\Testify-Automation_School\\Module4D\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/resizable/");
        WebElement resizableMenu = driver.findElement(By.linkText("Resizable"));
        resizableMenu.click();;

        Thread.sleep(500);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");
        driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
        WebElement resizeHandle = driver.findElement(By.cssSelector(".ui-resizable-se"));
        Actions mouse = new Actions(driver);
        mouse.clickAndHold(resizeHandle)
                .moveByOffset(100, 50)
                .release()
                .build()
                .perform();


    }
}
