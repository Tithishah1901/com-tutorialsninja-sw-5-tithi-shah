package com.tutorialsninja.testsuit;

import com.tutorialsninja.customlisteners.CustomListeners;
import com.tutorialsninja.pages.DesktopsPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.ProductPage;
import com.tutorialsninja.testbase.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import resources.testdata.TestData;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Listeners(CustomListeners.class)
public class DeskTopsTest extends BaseTest {

    HomePage homePage;
    DesktopsPage desktopsPage;
    ProductPage productPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        desktopsPage = new DesktopsPage();
        productPage = new ProductPage();
    }

    @Test(groups = {"sanity"})
    public void verifyProductArrangeInAlphaBaticalOrder() {
        //1.1 Mouse hover on Desktops Tab. and click
        homePage.clickOnDesktops();
        //1.2 Click on “Show All Desktops”
        homePage.selectMenu("Show AllDesktops");
        //1.3 Select Sort By position "Name: Z to A"
        List<WebElement> products1 = getListOfElements(By.xpath("//h4/a"));
        ArrayList<String> originalProductsName = new ArrayList<>();
        for (WebElement e : products1) {
            originalProductsName.add(e.getText());
        }
        System.out.println(originalProductsName);
        // Sort By Reverse order
        Collections.reverse(originalProductsName);
        System.out.println(originalProductsName);
        desktopsPage.selectProductSorting("Name (Z - A)");
        //1.4 Verify the Product will arrange in Descending order.
        List<WebElement> products = getListOfElements(By.xpath("//h4/a"));
        ArrayList<String> afterSortByZToAProductsName = new ArrayList<>();
        for (WebElement e : products) {
            afterSortByZToAProductsName.add(e.getText());
        }
        System.out.println(afterSortByZToAProductsName);
        Assert.assertEquals(originalProductsName, afterSortByZToAProductsName, "Product is not sorted");

    }

    @Test(dataProvider = "productList", dataProviderClass = TestData.class)
    public void verifyProductAddedToShoppingCartSuccessFully(String product, String qty, String successMessage, String productName, String model, String total) {
        //2.1 Mouse hover on Currency Dropdown and click
        homePage.clickOnCurrency();
        //2.2 Mouse hover on £Pound Sterling and click
        homePage.clickOnPoundSterling();
        //2.3 Mouse hover on Desktops Tab .
        homePage.clickOnDesktops();
        //2.4 Click on “Show All Desktops”
        homePage.selectMenu("Show AllDesktops");
        //2.5 Select Sort By position "Name: A to Z"
        desktopsPage.selectProductSorting("Name (A - Z)");
        //2.6 Select product <product>
        productPage.selectProductFromDropDown(product);
        //2.7 Enter Qty <qty> using Select class.
        productPage.setEnterQuantity(qty);
       //2.8 Click on “Add to Cart” button
       productPage.setClickOnAddToCart();
       //2.9 Verify the Message <successMessage>
        productPage.getSuccessMessage(successMessage);
      //2.10 Click on link “shopping cart” display into success message
        productPage.setShoppingCart();
      //2.11 Verify the text "Shopping Cart"
         productPage.setShoppingCart();
      //2.12 Verify the Product name <productName>
      productPage.getProductName(productName);
     //2.13 Verify the Model <model>
        productPage.verifyModelName(model);
     //2.14 Verify the Total <total>
        productPage.verifyTotal(total);


    }
}
