package com.amazon.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainTest {

	public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "\"C:\\Users\\mrshu\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe\"");

        
        WebDriver driver = new ChromeDriver();

       
        HomePage homePage = new HomePage(driver);
        SignInPage signInPage = new SignInPage(driver);
        SearchResultsPage searchResultsPage = new SearchResultsPage(driver);
        ProductPage productPage = new ProductPage(driver);

	
	driver.get("https://www.amazon.in/");
	
    homePage.clickSignIn();

    signInPage.login("priyanshudwivedi422gmail.com", "Priyanshu@2002");

    
    homePage.searchProduct("iPhone 13");

    
    searchResultsPage.applyFilter("Mobiles");

    
    searchResultsPage.clickProduct("iPhone 13");

    
    productPage.addToWishlist();

    
    if (productPage.isConfirmationBoxDisplayed()) {
        System.out.println("Product added to wishlist successfully.");
    } else {
        System.out.println("Product was not added to wishlist.");
    }

    driver.quit();
	

}
}	
	
