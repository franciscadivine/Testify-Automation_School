package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task7 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chromedriver","C:\\Users\\Francisca\\Testify-Automation_School\\Module4D\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://worldweather.wmo.int/en/home.html");
        driver.findElement(By.cssSelector("#q_search")).sendKeys("Austria");
        Thread.sleep(10000);
        driver.findElement(By.xpath("//input[@name='submit']")).click();
        Thread.sleep(10000);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,200)");
        driver.findElement(By.xpath("//div[@class='col_name fs0']//a[contains(text(),'Vienna')]")).click();
     WebElement date =   driver.findElement(By.xpath("//body/div[@class='wrapper']/div[@class='row']/div[@class='col-7 city_right_side']/div[@class='col-12 city_fc_block']/div[@class='city_fc_block_mask']/div[@class='city_container']/div[1]/div[1]/div[1]"));
        System.out.println("Today is " +  date.getText());
      WebElement Description =  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[6]/div[5]/div[2]/div[2]/div[1]/div[1]/div[4]"));
        System.out.println("The wealther is " + Description.getText());
    }
}
