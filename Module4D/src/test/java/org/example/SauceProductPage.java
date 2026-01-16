package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceProductPage {

        WebDriver driver;

        public SauceProductPage(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }

        @FindBy(css = "button[data-test='add-to-cart-sauce-labs-backpack']")
        private WebElement item;

        public WebElement getItem() {
            return item;
        }


        @FindBy(xpath = "//a[@class='shopping_cart_link']")
        private WebElement carticon;

        public WebElement getCarticon() {
            return carticon;
        }

        @FindBy(xpath = "//div[@class='inventory_item_name']")
        private WebElement invtItem;

        public WebElement getInvtItem() {
            return invtItem;
        }
    }

