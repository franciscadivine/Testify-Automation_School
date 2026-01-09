package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2facebook { public static void main(String[] args) {
    System.setProperty("webdriver.Chrome.driver", "C:\\Users\\Francisca\\Testify-Automation_School\\Module4D\\src\\chromedriver.exe");

    WebDriver driver = new ChromeDriver();
    //maximize page
    driver.manage().window().maximize();
    //launch url
    driver.get("https://www.facebook.com/");
    //driver.close();


}
}

