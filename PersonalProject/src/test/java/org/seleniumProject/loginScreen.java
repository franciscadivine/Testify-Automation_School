package org.seleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;

public class loginScreen {
    WebDriver driver;
    public loginScreen(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='login']//input[@type='text']")
    private WebElement usernamelogin;

    public WebElement getUsernamelogin() {
        return usernamelogin;
    }


    @FindBy(xpath = "//div[@class='login']//input[@type='password']")
    private WebElement Passwordlogin;

    public WebElement getPasswordlogin() {
        return Passwordlogin;
    }

    @FindBy(xpath = "//div[@class='login']//input[@type='submit']")
    private WebElement loginBtn;

    public WebElement getLoginBtn() {
        return loginBtn;
    }


}

