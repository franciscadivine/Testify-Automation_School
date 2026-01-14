package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task6 {  public static void main(String[] args) {
    System.setProperty("webdriver.chromedriver","C:\\Users\\Francisca\\Testify-Automation_School\\Module4D\\src\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.saucedemo.com/ ");
    driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
    driver.findElement(By.cssSelector("input[placeholder='Password'][name='password']")).sendKeys("secret_sauce");
    driver.findElement(By.cssSelector("input.submit-button.btn_action")).click();

    driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-bolt-t-shirt")).click();
    driver.findElement(By.cssSelector("a.shopping_cart_link")).click();



}

}
