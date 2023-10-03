package com.amazon.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

	
    @FindBy(id = "add-to-wishlist-button")
    private WebElement wishlistButton;

    @FindBy(id = "confirmation-box")
    private WebElement confirmationBox;

    public ProductPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void addToWishlist() {
        wishlistButton.click();
    }

    public boolean isConfirmationBoxDisplayed() {
       
        return false; 
    }
}
