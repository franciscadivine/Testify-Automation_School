package org.seleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PayBillScreen {
    WebDriver driver;
    public PayBillScreen(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(text(),'Bill Pay')]")
    private WebElement payBill;
    public WebElement getPayBill() {
        return payBill;
    }

    @FindBy(xpath = "//input[@name='payee.name']")
    private WebElement PayeeName;

    public WebElement getPayeeName() {
        return PayeeName;
    }

    @FindBy(xpath = "//input[@name='payee.address.street']")
    private WebElement PayeeAddress;

    public WebElement getPayeeAddress() {
        return PayeeAddress;
    }

    @FindBy(xpath = "//input[@name='payee.address.city']")
    private WebElement PayeeCity;

    public WebElement getPayeeCity() {
        return PayeeCity;
    }

    @FindBy(xpath = "//input[@name='payee.address.state']")
    private WebElement PayeeState;
    public WebElement getPayeeState(){
        return PayeeState;
    }
    @FindBy(xpath = "//input[@name='payee.address.zipCode']")
    private WebElement PayeeZipcode;

    public WebElement getPayeeZipcode() {
        return PayeeZipcode;

    }
    @FindBy(xpath = "//input[@name='payee.phoneNumber']")
    private WebElement PayeePhoneNum;

    public WebElement getPayeePhoneNum() {
        return PayeePhoneNum;
    }
    @FindBy(xpath = "//input[@name='payee.accountNumber']")
    private WebElement PayeeAcctNum;

    public WebElement getPayeeAcctNum() {
        return PayeeAcctNum;
    }
    @FindBy(xpath = "//input[@name='verifyAccount']")
    private WebElement VerifyAcct;

    public WebElement getVerifyAcct() {
        return VerifyAcct;
    }
    @FindBy(xpath = "//input[@name='amount']")
    private WebElement Amount;

    public WebElement getAmount() {
        return Amount;
    }
    @FindBy(xpath = "//input[@name='amount']")
    private WebElement SelectAcct;

    public WebElement getSelectAcct() {
        return SelectAcct;
    }
    @FindBy(xpath = "//input[@value='Send Payment']")
    private WebElement SendBtn;

    public WebElement getSendBtn() {
        return SendBtn;
    }


}

