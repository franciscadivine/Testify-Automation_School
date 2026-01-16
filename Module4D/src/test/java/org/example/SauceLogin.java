package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceLogin {

    WebDriver driver;

    public SauceLogin(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "input#user-name")
    private WebElement username;

    public WebElement getUsername() {
        return username;
    }


    @FindBy(css = "input[placeholder='Password'][name='password']")
    private WebElement Password;

    public WebElement getPassword() {
        return Password;
    }

    @FindBy(css = "input.submit-button.btn_action")
    private WebElement loginBtn;

    public WebElement getLoginBtn() {
        return loginBtn;
    }
}






