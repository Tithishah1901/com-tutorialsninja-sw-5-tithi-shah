package com.tutorialsninja.testsuit;

import com.tutorialsninja.customlisteners.CustomListeners;
import com.tutorialsninja.pages.ComponentsPage;
import com.tutorialsninja.pages.DesktopsPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LaptopAndNoteBookPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class TopMenuTest extends BaseTest {

    HomePage homePage;
    DesktopsPage desktopsPage;
    LaptopAndNoteBookPage laptopAndNoteBookPage;
    ComponentsPage componentsPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        desktopsPage = new DesktopsPage();
        laptopAndNoteBookPage = new LaptopAndNoteBookPage();
        componentsPage = new ComponentsPage();
    }

    @Test(groups = {"sanity"})
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        //1.1 Mouse hover on “Desktops” Tab and click
        homePage.clickOnDesktops();
        //1.2 call selectMenu method and pass the menu = “Show All Desktops”
        homePage.selectMenu("Show AllDesktops");
        //1.3 Verify the text ‘Desktops’
        desktopsPage.setVerifyDesktopsText();
    }

    @Test(groups = {"smoke"})
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully() {
        //2.1 Mouse hover on “Laptops & Notebooks” Tab and click
        homePage.clickOnLaptopAndNoteBook();
        //2.2 call selectMenu method and pass the menu = “Show All Laptops & Notebooks”
        homePage.selectMenu("Show AllLaptops & NoteBooks");
        //2.3 Verify the text ‘Laptops & Notebooks’
        laptopAndNoteBookPage.setVerifyLaptopAndNoteBookText();

    }

    @Test(groups = {"regression"})
    public void verifyUserShouldNavigateToComponentsPageSuccessfully() {
        //3.1 Mouse hover on “Components” Tab and click
        homePage.clickOnComponents();
        //3.2 call selectMenu method and pass the menu = “Show All Components”
        homePage.selectMenu("Show AllComponents");
        //3.3 Verify the text ‘Components’
        componentsPage.setVerifyComponentsTextText();



    }
}
