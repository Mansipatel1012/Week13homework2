package tutorialsninja.com.testsuite;

import org.testng.Assert;
import org.testng.annotations.Test;
import tutorialsninja.com.pages.AccountLoginPage;
import tutorialsninja.com.testbase.BaseTest;

public class AccountLoginPageTest extends BaseTest {
    AccountLoginPage accountLoginPage = new AccountLoginPage();

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
        accountLoginPage.clickOnMyAccount();
        accountLoginPage.clickOnRegister();
        //accountLoginPage.clickOnRegister();
        String exptectedText = "Register Account";
        String actualText = accountLoginPage.getRegisterAccountText();
        Assert.assertEquals(actualText, exptectedText,"Register page not displayed");
    }
    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully(){
        accountLoginPage.clickOnMyAccount();
        accountLoginPage.clickOnLogin();
        //accountLoginPage.clickOnLogin();
        String expectedText = "Returning Customer";
        String actualText = accountLoginPage.getReturningAccountText();
        Assert.assertEquals(actualText,expectedText,"Returning Customer page note displayed");

    }

}


