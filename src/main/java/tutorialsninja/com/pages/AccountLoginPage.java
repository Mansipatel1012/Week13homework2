package tutorialsninja.com.pages;

import org.openqa.selenium.By;
import tutorialsninja.com.utilities.Utility;

public class AccountLoginPage extends Utility {
    By myAccount = By.xpath("//span[normalize-space()='My Account']");
    By login = By.linkText("Login");
    By register = By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Register']");
    By registerAccountText = By.xpath("//h1[contains(text(),'Register Account')]");
    By returningCustomerText = By.xpath("//h2[contains(text(),'Returning Customer')]");

    public void clickOnMyAccount(){
        clickOnElement(myAccount);
    }
    public void clickOnRegister(){
        clickOnElement(register);
    }
    public void clickOnLogin(){
        clickOnElement(login);
    }
    public String getRegisterAccountText(){
        return getTextFromElement(registerAccountText);
    }
    public String getReturningAccountText(){
        return getTextFromElement(returningCustomerText);
    }

}

