package org.seleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


    public class openAccountScreen {
        WebDriver driver;

        public openAccountScreen(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }

        @FindBy(xpath = "//a[contains(text(),'Open New Account')]")
        private WebElement OpenNewAcct;

        public WebElement getOpenNewAcct() {
            return OpenNewAcct;
        }

        @FindBy(xpath = "//select[@id='type']")
        private WebElement acctType;

        public WebElement getAcctType() {
            return acctType;
        }

        @FindBy(xpath = "//select[@id='fromAccountId']")
        private WebElement acctId;

        public WebElement getAcctId() {
            return acctId;
        }

        @FindBy(xpath = "//input[@type='button']")
        private WebElement openNewAcctBtn;

        public WebElement getOpenNewAcctBtn() {
            return openNewAcctBtn;
        }
        @FindBy(xpath = "//a[contains(text(),'Log Out')]")
        private WebElement logOut;
        public WebElement getLogOut(){
            return logOut;
        }

    }