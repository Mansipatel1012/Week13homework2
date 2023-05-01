package tutorialsninja.com.testsuite;

import org.testng.Assert;
import org.testng.annotations.Test;
import tutorialsninja.com.pages.DesktopPage;
import tutorialsninja.com.pages.LaptopAndNotebookPage;
import tutorialsninja.com.testbase.BaseTest;

public class TopMenuTest extends BaseTest {
    DesktopPage desktopPage = new DesktopPage();
    LaptopAndNotebookPage laptopAndNotebook = new LaptopAndNotebookPage();
    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        //1.1 Mouse hover on “Desktops” Tab and click
        desktopPage.mouseHoverDesktops();
        //1.2 call selectMenu method and pass the menu = “Show All Desktops”
        desktopPage.clickOnShowAllDesktops();
        //1.3 Verify the text ‘Desktops’
        String expectedText = "Desktops";
        String actualText = desktopPage.getDesktopText();
        Assert.assertEquals(actualText, expectedText, "Show All Desktop page not found");

    }

    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully() {
//        2.1 Mouse hover on “Laptops & Notebooks” Tab and click
        desktopPage.mouseHoverLaptopsAndNotebooks();
//        2.2 call selectMenu method and pass the menu = “Show All Laptops & Notebooks”
        laptopAndNotebook.clickOnAllLaptopsAndNotebooks();
//        2.3 Verify the text ‘Laptops & Notebooks’
        String expectedText = "Laptops & Notebooks";
        String actualText = desktopPage.getlaptopsAndNotebooksText();
        Assert.assertEquals(actualText, expectedText, "Show All Laptops & Notebooks page not found");
    }

    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully() {
//        3.1 Mouse hover on “Components” Tab and click
        desktopPage.mouseHoverComponents();
//        3.2 call selectMenu method and pass the menu = “Show All Components”
        desktopPage.clickOnShowAllComponents();
//        3.3 Verify the text ‘Components’
        String expectedText = "Components";
        String actualText = desktopPage.getcomponentsText();
        Assert.assertEquals(actualText, expectedText, "Show All Components page not found");
    }


}
