package tutorialsninja.com.pages;

import org.openqa.selenium.By;
import tutorialsninja.com.utilities.Utility;

public class LaptopAndNotebookPage extends Utility {
    By laptopAndNotebooks = By.xpath("//a[normalize-space()='Laptops & Notebooks']");
    By showAllLaptopsAndNotebooks = By.xpath("//a[contains(text(),'Show AllLaptops & Notebooks')]");
    By sortPrice = By.xpath("//select[@id='input-sort']");
    //*************************** Laptop Register Text ********************************
    By clickOnMacbook = By.linkText("MacBook");
    By macBookText = By.xpath("//h1[contains(text(),'MacBook')]");
    By clickOnAddToCart = By.xpath("//button[@id='button-cart']");
    By successMessage = By.cssSelector("body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible");
    By clickShoppingCartText =By.xpath("//a[contains(text(),'shopping cart')]");
    By shoppingCartText = By.xpath("//div[@id='content']//h1");
    By macbookShopCartText = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a");
    By orderQty = By.xpath("//input[contains(@name, 'quantity')]");
    By updateButton = By.xpath("//button[contains(@data-original-title, 'Update')]");
    By modifiedOrderQty = (By.xpath("//div[@id='checkout-cart']/div[1]"));
    By checkout = By.xpath("//a[contains(text(),'Checkout')]");
    By guestCheckout = By.xpath("//label[normalize-space()='Guest Checkout']");
    By continueTab = By.xpath("//input[@id='button-account']");
    By firstNameField = By.xpath("//input[@id='input-payment-firstname']");
    By lastNameField = By.xpath("//input[@id='input-payment-lastname']");
    By emailField = By.xpath("//input[@id='input-payment-email']");
    By passwordField = By.xpath("//input[@id='input-payment-telephone']");
    By addressField = By.xpath("//input[@id='input-payment-address-1']");
    By cityField = By.xpath("//input[@id='input-payment-city']");
    By postcodeField = By.xpath("//input[@id='input-payment-postcode']");
    By countryField = By.xpath("//select[@id='input-payment-country']");
    By regionField = By.xpath("//select[@name='zone_id']");
    By continueButton = By.xpath("//input[@id='button-account']");
    By comments = By.xpath("//body/div[@id='checkout-checkout']/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/p[2]/textarea[1]");
    By checkBox = By.xpath("//input[@name='agree']");
    By continueBtn = By.xpath("//input[@id='button-payment-method']");
    By checkoutText = By.xpath("//h1[contains(text(),'Checkout')]");
    By newCustomerText = By.xpath("//h2[contains(text(),'New Customer')]");
    By warningMessage = By.xpath("//body/div[@id='checkout-checkout']/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]");
    By guestButton = By.xpath("//input[@id='button-guest']");


    public void mouseHoverOnLaptopsAndNotebooks(){
        mouseHoverToElement(laptopAndNotebooks);
    }
    public void clickOnAllLaptopsAndNotebooks(){
        clickOnElement(showAllLaptopsAndNotebooks);
    }
    public void sortByPriceHighToLow(){
        selectByVisibleTextFromDropDown(sortPrice,"Price (High > Low)");
    }
    public void clickOnMacbook(){
        clickOnElement(clickOnMacbook);
    }
    public String getMacbookText(){
        return getTextFromElement(macBookText);
    }
    public void clickOnAddToCart(){
        clickOnElement(clickOnAddToCart);
    }
    public String successMessageText(){
        return getTextFromElement(successMessage);
    }
    public void clickOnShoppingCart(){
        clickOnElement(clickShoppingCartText);
    }
    public String shoppingCartText(){
        return getTextFromElement(shoppingCartText);
    }
    public String macbookShoppingCartText(){
        return getTextFromElement(macbookShopCartText);
    }
    public void changeOrderQty(){
        clearTextFromField(orderQty);
        sendTextToElement(orderQty,"2");
    }
    public void clickOnUpdateButton(){
        clickOnElement(updateButton);
    }
    //2.15 Click on “Checkout” button
    public void clickOnCheckoutButton() {
        clickOnElement(checkout);
    }

    //2.18 Click on “Guest Checkout” radio button
    public void clickOnGuestCheckoutButton() {
        clickOnElement(guestCheckout);
    }

    //2.19 Click on “Continue” tab
    public void clickOnContinueTab() {
        clickOnElement(continueTab);
    }
    //2.20 Fill the mandatory fields, enter email into email field
    public void enterFirstName(String firstName) {
        sendTextToElement(firstNameField, firstName);
    }

    public void enterLastName(String lastName) {
        sendTextToElement(lastNameField, lastName);
    }

    public void enterEmail(String email) {
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void enterAddress(String address) {
        sendTextToElement(addressField, address);
    }

    public void enterCity(String city) {
        sendTextToElement(cityField, city);
    }

    public void enterPostcode(String postcode) {
        sendTextToElement(postcodeField, postcode);
    }

    public void sortByDropDownCountry(String country) {
        selectByVisibleTextFromDropDown(countryField, country);
    }

    public void sortByDropDownRegion(String region) {
        selectByVisibleTextFromDropDown(regionField, region);
    }
    //2.21 Click on “Continue” Button
    public void clickOnContinueButton()  {
        clickOnElement(continueButton);
    }
    //2.22 Add Comments About your order into text area
    public void enterComments()  {
        sendTextToElement(comments, "Hi I am Prime Testing");
    }
    //2.23 Check the Terms & Conditions check box
    public void clickOnCheckBox() {
        clickOnElement(checkBox);
    }
    //2.24 Click on “Continue” button
    public void clickOnContinue() {
        clickOnElement(continueBtn);
    }
    public String checkoutText(){
        return getTextFromElement(checkoutText);
    }
    public String newCustomerText(){
        return getTextFromElement(newCustomerText);
    }
    public String warningMessageText(){
        return getTextFromElement(warningMessage);
    }
    public void clickOnGuestContinueButton(){
        clickOnElement(guestButton);
    }

}


