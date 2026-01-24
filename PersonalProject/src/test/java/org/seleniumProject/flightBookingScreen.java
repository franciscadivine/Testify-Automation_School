package org.seleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class flightBookingScreen {
    WebDriver driver;

    public flightBookingScreen(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    @FindBy(xpath = "//body/div[@class='container']/form[@action='reserve.php']/select[1]")
    private WebElement selectDeparture;

    public WebElement getSelectDeparture() {
        return selectDeparture;
    }
    @FindBy(xpath = "//body/div[@class='container']/form[@action='reserve.php']/select[2]")
    private WebElement selectArrival;

    public WebElement getSelectArrival() {
        return selectArrival;
    }
    @FindBy(xpath = "//input[@type='submit']")
    private WebElement submitBth;
    public  WebElement getSubmitBth(){
        return submitBth;
    }
    @FindBy(xpath = "//td[contains(text(),'United Airlines')]")
    private WebElement unitedAirline;
    public  WebElement getUnitedAirline(){
        return unitedAirline;
    }
    @FindBy(xpath = "//body/div[@class='container']/table[@class='table']/tbody/tr[2]/td[1]/input[1]")
    private WebElement choseFlight;
    public  WebElement getChoseFlight(){
        return choseFlight;
    }
    @FindBy(xpath = "//input[@id='inputName']")
    private WebElement Name;
    public  WebElement getName(){
        return Name;
    }
    @FindBy(xpath = "//input[@id='address']")
    private WebElement Address;
    public  WebElement getAddress(){
        return Address;
    }
    @FindBy(xpath = "//input[@id='city']")
    private WebElement City;
    public  WebElement getCity(){
        return City;
    }
    @FindBy(xpath = "//input[@id='state']")
    private WebElement State;
    public  WebElement getState(){
        return State;
    }
    @FindBy(xpath = "//p[contains(text(),'Flight Number: UA954')]")
    private WebElement fightNum;
    public  WebElement getFightNum(){
        return fightNum;
    }
    @FindBy(xpath = "//input[@id='zipCode']")
    private WebElement Zipcode;
    public  WebElement getZipcode(){
        return Zipcode;
    }
    @FindBy(xpath = "//select[@id='cardType']")
    private WebElement cardType;
    public  WebElement getCardType(){
        return cardType;
    }
    @FindBy(xpath = "//input[@id='creditCardNumber']")
    private WebElement creditCardNum;
    public  WebElement getCreditCardNum(){
        return creditCardNum;
    }
    @FindBy(xpath = "//input[@id='creditCardMonth']")
    private WebElement Month;
    public  WebElement getMonth(){
        return Month;
    }
    @FindBy(xpath = "//input[@id='creditCardYear']")
    private WebElement Year;
    public  WebElement getYear(){
        return Year;
    }
    @FindBy(xpath = "//input[@id='nameOnCard']")
    private WebElement nameOnCard;
    public  WebElement getNameOnCard(){
        return nameOnCard;
    }
    @FindBy(xpath = "//input[@id='rememberMe']")
    private WebElement rememberMe;
    public  WebElement getRememberMe(){
        return rememberMe;
    }
    @FindBy(xpath = "//input[@type='submit']")
    private WebElement Purchasebtn;
    public  WebElement getPurchasebtn(){
        return Purchasebtn;
    }


}
