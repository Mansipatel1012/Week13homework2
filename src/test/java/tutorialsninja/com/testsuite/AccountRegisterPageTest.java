package tutorialsninja.com.testsuite;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import tutorialsninja.com.pages.AccountLoginPage;
import tutorialsninja.com.pages.AccountRegisterPage;
import tutorialsninja.com.testbase.BaseTest;

public class AccountRegisterPageTest extends BaseTest {

    AccountLoginPage accountLoginPage = new AccountLoginPage();
    AccountRegisterPage accountRegisterPage=new AccountRegisterPage();

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully(){
        //3.1 Clickr on My Account Link.
        accountLoginPage.clickOnMyAccount();
        //3.2 Call the method “selectMyAccountOptions” method and pass the parameter “Register”
        accountLoginPage.clickOnRegister();
        //3.3 Enter First Name
        accountRegisterPage.typeFirstName();
        //3.4 Enter Last Name
        accountRegisterPage.typeLastName();
        //3.5 Enter Email
        accountRegisterPage.typeEmail();
        //3.6 Enter Telephone
        accountRegisterPage.typeTelephone();
        //3.7 Enter Password
        accountRegisterPage.typePassword();
        //3.8 Enter Password Confirm
        accountRegisterPage.typeconfirmPassword();
        //3.9 Select Subscribe Yes radio button
        accountRegisterPage.clickSubscribe();
        //3.10 Click on Privacy Policy check box
        accountRegisterPage.clickOnPrivacy();
        //3.11 Click on Continue button
        accountRegisterPage.clickOnContinue();
        //3.12 Verify the message “Your Account Has Been Created!”
        verifyText(driver, By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]"),"Your Account Has Been Created!");
        //3.13 Click on Continue button
        accountRegisterPage.clickOncontinue2();
        //3.14 Click on My Account Link.
        accountLoginPage.clickOnMyAccount();
        //3.15 Call the method “selectMyAccountOptions” method and pass the parameter “Logout”
        accountRegisterPage.clickOnLogOut();
        //3.16 Verify the text “Account Logout”
        verifyText(driver,By.xpath("//h1[normalize-space()='Account Logout']"),"Account Logout");
        //3.17 Click on Continue button
        accountRegisterPage.clickOncontinue2();
    }
    @Test
    public void verifyThatUserShouldLoginAndLogoutSuccessfully(){
//        4.1 Click on My Account Link.
        accountLoginPage.clickOnMyAccount();
//        4.2 Call the method “selectMyAccountOptions” method and pass the parameter “Login”
        accountRegisterPage.clickOnLoginButton();
//        4.3 Enter Email address
        accountRegisterPage.typeEmail();
//        4.5 Enter Password
        accountRegisterPage.typePassword();
//        4.6 Click on Login button
        accountRegisterPage.clickOnLoginButton();
//        4.7 Verify text “My Account”
        verifyText(driver,By.xpath("//h2[contains(text(),'My Account')]"),"My Account");
//        4.8 Click on My Account Link.
        accountLoginPage.clickOnMyAccount();
//        4.9 Call the method “selectMyAccountOptions” method and pass the parameter“Logout”
        accountRegisterPage.clickOnLogOut();
//        4.10 Verify the text “Account Logout”
        verifyText(driver,By.xpath("//h1[contains(text(),'Account Logout')]"),"//h1[contains(text(),'Account Logout')]");
//        4.11 Click on Continue button
        accountRegisterPage.clickOncontinue2();
    }
}

