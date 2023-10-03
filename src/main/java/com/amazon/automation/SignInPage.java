package com.amazon.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

	 @FindBy(id = "ap_email")
	    private WebElement emailField;

	    @FindBy(id = "ap_password")
	    private WebElement passwordField;

	    public SignInPage(WebDriver driver) {
	        PageFactory.initElements(driver, this);
	    }

	    public void login(String email, String password) {
	        emailField.sendKeys(email);
	        passwordField.sendKeys(password);
	        passwordField.submit();
	    }

}
