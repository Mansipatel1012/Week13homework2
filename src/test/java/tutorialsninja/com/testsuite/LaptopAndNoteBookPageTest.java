package tutorialsninja.com.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import tutorialsninja.com.pages.AccountRegisterPage;
import tutorialsninja.com.pages.LaptopAndNotebookPage;
import tutorialsninja.com.testbase.BaseTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LaptopAndNoteBookPageTest extends BaseTest {
    LaptopAndNotebookPage laptopAndNotebookPage = new LaptopAndNotebookPage();
    AccountRegisterPage accountRegisterPage = new AccountRegisterPage();

    @Test
    public void verifyProductsPriceDisplayHighToLowSuccessfully() throws InterruptedException {

//    1.1 Mouse hover on Laptops & Notebooks Tab.and click
        laptopAndNotebookPage.mouseHoverOnLaptopsAndNotebooks();
//    1.2 Click on “Show All Laptops & Notebooks”
        laptopAndNotebookPage.clickOnAllLaptopsAndNotebooks();
//    1.3 Select Sort By "Price (High > Low)"
        laptopAndNotebookPage.sortByPriceHighToLow();
//    1.4 Verify the Product price will arrange in High to Low order.

        List<WebElement> products = driver.findElements(By.xpath("//p[@class ='price']"));
        List<Double> originalProductsPrice = new ArrayList<>();
        for (WebElement e : products) {
            System.out.println(e.getText());
            String[] arr = e.getText().split("Ex Tax:");
            originalProductsPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",", "")));
        }
        System.out.println(originalProductsPrice);
        // Sort By Reverse order
        Collections.sort(originalProductsPrice, Collections.reverseOrder());
        System.out.println(originalProductsPrice);
        //1.3 Select Sort By "Price (High > Low)"
        selectByVisibleTextFromDropDown(By.id("input-sort"), "Price (High > Low)");
        // After filter Price (High > Low) Get all the products price and stored into array list
        products = driver.findElements(By.xpath("//p[@class ='price']"));
        ArrayList<Double> afterSortByPrice = new ArrayList<>();
        for (WebElement e : products) {
            String[] arr = e.getText().split("Ex Tax:");
            afterSortByPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",", "")));
        }
        System.out.println(afterSortByPrice);
        //1.4 Verify the Product price will arrange in High to Low order.
        Assert.assertEquals(originalProductsPrice, String.valueOf(afterSortByPrice), "Product not sorted by price High to Low");

    }

    @Test
    public void verifyThatUserPlaceOrderSuccessfully() throws InterruptedException {
//        2.1 Mouse hover on Laptops & Notebooks Tab and click
        laptopAndNotebookPage.mouseHoverOnLaptopsAndNotebooks();
//        2.2 Click on “Show All Laptops & Notebooks”
        laptopAndNotebookPage.clickOnAllLaptopsAndNotebooks();
//        2.3 Select Sort By "Price (High > Low)"
        laptopAndNotebookPage.sortByPriceHighToLow();
//        2.4 Select Product “MacBook”
        laptopAndNotebookPage.clickOnMacbook();
//        2.5 Verify the text “MacBook”
        laptopAndNotebookPage.getMacbookText();
        String expectedMacbookText = "MacBook";
        String actualMacbookText = laptopAndNotebookPage.getMacbookText();
        Assert.assertEquals(actualMacbookText, expectedMacbookText, "MacBook Product not display");
//        2.6 Click on ‘Add To Cart’ button
        laptopAndNotebookPage.clickOnAddToCart();
//        2.7 Verify the message “Success: You have added MacBook to your shopping cart!”
        String expectedSuccessMessage = "Success: You have added MacBook to your shopping cart!\n×";
        String actualSuccessMessage = laptopAndNotebookPage.successMessageText();
        Assert.assertEquals(actualSuccessMessage, expectedSuccessMessage, "Product not added to cart");
//        2.8 Click on link “shopping cart” display into success message
        laptopAndNotebookPage.clickOnShoppingCart();
//        2.9 Verify the text "Shopping Cart"
        String actualShoppingCartText = laptopAndNotebookPage.shoppingCartText();
        String expectedShoppingCartText = "Shopping Cart  (0.00kg)";
        Assert.assertEquals(actualShoppingCartText, expectedShoppingCartText, "Shopping Cart Empty");
//        2.10 Verify the Product name "MacBook"
        String actualMacbookShopText = laptopAndNotebookPage.macbookShoppingCartText();
        String expectedMacbookShopText = "MacBook";
        Assert.assertEquals(actualMacbookShopText, expectedMacbookShopText, "Product name not matched");
//        2.11 Change Quantity "2"
        laptopAndNotebookPage.changeOrderQty();
//        2.12 Click on “Update” Tab
        laptopAndNotebookPage.clickOnUpdateButton();
//        2.13 Verify the message “Success: You have modified your shopping cart!”
//        2.14 Verify the Total £737.45
//        2.15 Click on “Checkout” button
        laptopAndNotebookPage.clickOnCheckoutButton();
//        2.16 Verify the text “Checkout”
        String expectedCheckoutText = "Checkout";
        String actualCheckoutText = laptopAndNotebookPage.checkoutText();
        Assert.assertEquals(actualCheckoutText, expectedCheckoutText, "Checkout page not found");
//        2.17 Verify the Text “New Customer”
        String expectedNewCustomerText = "New Customer";
        String actualNewCustomerText = laptopAndNotebookPage.newCustomerText();
        Assert.assertEquals(actualNewCustomerText, expectedNewCustomerText, "New Customer page not found");
//        2.18 Click on “Guest Checkout” radio button
        laptopAndNotebookPage.clickOnGuestCheckoutButton();
//        2.19 Click on “Continue” tab
        laptopAndNotebookPage.clickOnContinueButton();
        Thread.sleep(2000);
//        2.20 Fill the mandatory fields
        laptopAndNotebookPage.enterFirstName("Prime");
        laptopAndNotebookPage.enterLastName("Testing");
        laptopAndNotebookPage.enterEmail("prime00888@gmail.com");
        laptopAndNotebookPage.enterPassword("Prime123456");
        laptopAndNotebookPage.enterAddress("101,keats court, Wembley");
        laptopAndNotebookPage.enterCity("London");
        laptopAndNotebookPage.enterPostcode("HA0 3NZ");
        laptopAndNotebookPage.sortByDropDownCountry("United Kingdom");
        laptopAndNotebookPage.sortByDropDownRegion("Greater London");
//        2.21 Click on “Continue” Button
        laptopAndNotebookPage.clickOnGuestContinueButton();
//        2.22 Add Comments About your order into text area
        laptopAndNotebookPage.enterComments();
//        2.23 Check the Terms & Conditions check box
        laptopAndNotebookPage.clickOnCheckBox();
//        2.24 Click on “Continue” button
        laptopAndNotebookPage.clickOnContinue();
//        2.25 Verify the message “Warning: Payment method required!”
        String expectedWarningMessage = "Warning: No Payment options are available. Please contact us for assistance!";
        String actualWarningMessage = laptopAndNotebookPage.warningMessageText();
        Assert.assertEquals(actualWarningMessage, expectedWarningMessage, "Warning Message not found");
    }

}



