package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceCheckout {
    WebDriver driver;

    public SauceCheckout(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "checkout")
    private WebElement checkoutBtn;
    public WebElement getCheckoutBtn() {
        return checkoutBtn;
    }


    @FindBy(id = "first-name")
    private WebElement firstName;

    public WebElement getFirstName() {
        return firstName;
    }

    @FindBy(id = "last-name")
    private WebElement lastName;

    public WebElement getLastName() {
        return lastName;
    }
    @FindBy(id = "postal-code")
    private WebElement postalCode;
    public WebElement getPostalCode(){
        return postalCode;
    }
    @FindBy(id = "continue")
    private WebElement continueBtn;
    public WebElement getContinueBtn(){
        return continueBtn;
    }
    @FindBy(className = "inventory_item_name")
    private WebElement overviewItemName;
    public WebElement getOverviewItemName(){
        return overviewItemName;
    }
    public void clickCheckout() {
        checkoutBtn.click();
    }
    @FindBy(id = "finish")
    private WebElement finishBtn;
    public WebElement getFinishBtn(){
        return finishBtn;
    }
    @FindBy(className = "complete-header")
    private WebElement successMessage;
    public WebElement getSuccessMessage(){
        return successMessage;
    }

}
