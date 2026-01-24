package org.seleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registrationScreen {
    WebDriver driver;
    public registrationScreen(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(text(),'Register')]")
    private WebElement Regbtn;
    public WebElement getRegbtn() {
        return Regbtn;
    }

    @FindBy(xpath = "//input[@id='customer.firstName']")
    private WebElement firstName;

    public WebElement getFirstName() {
        return firstName;
    }

    @FindBy(xpath = "//input[@id='customer.lastName']")
    private WebElement lastName;

    public WebElement getLastName() {
        return lastName;
    }

    @FindBy(xpath = "//input[@id='customer.address.street']")
    private WebElement address;

    public WebElement getAddress() {
        return address;
    }

     @FindBy(xpath = "//input[@id='customer.address.city']")
      private WebElement city;
      public WebElement getCity(){
          return city;
}
    @FindBy(xpath = "//input[@id='customer.address.state']")
    private WebElement state;

    public WebElement getState() {
        return state;

    }
    @FindBy(xpath = "//input[@id='customer.address.zipCode']")
    private WebElement zipcode;

    public WebElement getZipcode() {
        return zipcode;
    }

    @FindBy(xpath = "//input[@id='customer.phoneNumber']")
    private WebElement phone;

    public WebElement getPhone() {
        return phone;

    }

    @FindBy(xpath = "//input[@id='customer.ssn']")
    private WebElement ssn;

    public WebElement getSsn() {
        return ssn;

    }
    @FindBy(xpath = "//input[@id='customer.username']")
    private WebElement userName;
    public WebElement getUserName(){
        return userName;
    }
    @FindBy(xpath = "//input[@id='customer.password']")
    private WebElement password;
    public WebElement getPassword(){
        return password;
    }
    @FindBy(xpath = "//input[@id='repeatedPassword']")
    private WebElement confirmPassword;
    public WebElement getConfirmPassword(){
        return confirmPassword;
    }
    @FindBy(xpath = "//td[@colspan='2']//input[@type='submit']")
    private WebElement Regbtnfinal;
    public WebElement getRegbtnfinal() {
        return Regbtnfinal;
    }
    @FindBy(xpath = "//h1[contains(text(),'Welcome')]")
    private WebElement accountCreationAssertion;
    public WebElement getAccountCreationAssertion(){
        return accountCreationAssertion;
    }



}


