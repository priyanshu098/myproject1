package com.amazon.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {

	// Define web elements for the Home Page
	@FindBy(id = "nav-link-accountList")
    private WebElement signInButton;
	
	@FindBy(id = "twotabsearchtextbox")
    private WebElement searchBox;

    // Constructor to initialize the PageFactory
    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    // Create methods to interact with these web elements
    public void clickSignIn() {
        signInButton.click();
    }

    public void searchProduct(CharSequence[] productName) {
        searchBox.sendKeys(productName);
        searchBox.submit();
    }

	public void searchProduct(String string) {
		// TODO Auto-generated method stub
		
	}
}
