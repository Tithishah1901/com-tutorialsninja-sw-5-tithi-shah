package com.tutorialsninja.testsuit;

import com.tutorialsninja.customlisteners.CustomListeners;
import com.tutorialsninja.pages.DesktopsPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LaptopAndNoteBookPage;
import com.tutorialsninja.pages.MacBook;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class LaptopAndNoteBooksTest extends BaseTest {

    HomePage homePage;
    DesktopsPage desktopsPage;
    LaptopAndNoteBookPage laptopAndNoteBookPage;
    MacBook macBook;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        desktopsPage = new DesktopsPage();
        laptopAndNoteBookPage = new LaptopAndNoteBookPage();
        macBook = new MacBook();
    }

    @Test(groups = {"sanity"})
    public void verifyProductsPriceDisplayHighToLowSuccessfully() {
        //1.1 Mouse hover on Laptops & Notebooks Tab.and click
        homePage.clickOnLaptopAndNoteBook();
        //1.2 Click on “Show All Laptops & Notebooks”
        homePage.selectMenu("Show AllLaptops & Notebooks");
        //1.3 Select Sort By "Price (High > Low)"
        laptopAndNoteBookPage.selectPriceSorting("Price (High > Low)");
        //1.4 Verify the Product price will arrange in High to Low order.

    }

        @Test(groups = {"smoke","regression"})
        public void verifyThatUserPlaceOrderSuccessfully() {
        //2.1 Mouse hover on Laptops & Notebooks Tab and click
        homePage.clickOnLaptopAndNoteBook();
        //2.2 Click on “Show All Laptops & Notebooks”
        homePage.selectMenu("Show AllLaptops & Notebooks");
        //2.3 Select Sort By "Price (High > Low)"
        laptopAndNoteBookPage.selectPriceSorting("Price (High > Low)");
        //2.4 Select Product “MacBook”
        macBook.setSelectMacBook();
        //2.5 Verify the text “MacBook”
        macBook.setVerifyMackBookText();
        //2.6 Click on ‘Add To Cart’ button
            macBook.setClickOnAddToCart();
//2.7 Verify the message “Success: You have added MacBook to your shopping cart!”
            macBook.setVerifySuccessMessage();
//            2.8 Click on link “shopping cart” display into success message
            macBook.setClickingOnShoppingCartLink();
//2.9 Verify the text "Shopping Cart"
            macBook.setVerifyShoppingCartText();
//            2.10 Verify the Product name "MacBook"
            macBook.setVerifyProductNameMacBook();
//            2.11 Change Quantity "2"
            macBook.changeTheQuantity();
//            2.12 Click on “Update” Tab
            macBook.setClickOnUpDateButton();
//2.13 Verify the message “Success: You have modified your shopping cart!”
            macBook.setModifiedMessage();
//            2.14 Verify the Total £737.45
            macBook.setVerifyTotal();
//            2.15 Click on “Checkout” button
            macBook.setClickOnCheckOutButton();
//2.16 Verify the text “Checkout”
//            2.17 Verify the Text “New Customer”
//            2.18 Click on “Guest Checkout” radio button
//2.19 Click on “Continue” tab
//2.20 Fill the mandatory fields
//2.21 Click on “Continue” Button
//2.22 Add Comments About your order into text area
//2.23 Check the Terms & Conditions check box
//2.24 Click on “Continue” button
//2.25 Verify the message “Warning: Payment method required!”
    }
}
