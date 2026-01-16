package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Task13 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chromedriver", "C:\\Users\\Francisca\\Testify-Automation_School\\Module4D\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://selenium08.blogspot.com/");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@class='search-expand-text']")).click();
        driver.findElement(By.xpath("//input[@aria-label='Search this blog']")).sendKeys("demo");
        driver.findElement(By.xpath("//input[@aria-label='Search this blog']")).sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        driver.findElement(By.xpath("//a[contains(text(),'Demo Dropdown List')]")).click();
        WebElement country = driver.findElement(By.xpath("//select[@name='country']"));
        Select select = new Select(country);

        select.selectByVisibleText("Nigeria");
        Thread.sleep(5000);
        JavascriptExecutor ms = (JavascriptExecutor) driver;
        ms.executeScript("window.scrollBy(0,300)");
        driver.findElement(By.xpath("//option[contains(text(),'Month...')]")).click();
        //WebElement monthDropdown = driver.findElement(By.name("Month"));
       // Select monthSelect = new Select(monthDropdown);
        Actions actions = new Actions(driver);

        // Hold down SHIFT and use ARROW_DOWN to select multiple options
        actions.keyDown(Keys.SHIFT)
                .sendKeys(Keys.ARROW_DOWN) // selects the first option
                .sendKeys(Keys.ARROW_DOWN) // selects the second option
                .sendKeys(Keys.ARROW_DOWN) // selects the third option
                .keyUp(Keys.SHIFT)
                .build()
                .perform();

        //System.out.println("Is multiple: " + select.isMultiple());
        //select.selectByVisibleText("January");
       // select.selectByVisibleText("February");
        //select.selectByVisibleText("March");



    }

}
