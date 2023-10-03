package com.amazon.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultsPage {
	@FindBy(id = "filter_option")
    private WebElement filterOption;

	@FindBy(css = ".product-link")
    private WebElement productLink;

    public SearchResultsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void applyFilter(String category) {
        filterOption.click();
        
    }

    public void clickProduct(String productName) {
        
    }






	


}
