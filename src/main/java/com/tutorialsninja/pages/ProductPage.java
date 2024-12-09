package com.tutorialsninja.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.customlisteners.CustomListeners;
import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ProductPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//img[@class='img-responsive']")
    WebElement productDropDown;

    @CacheLookup
    @FindBy(id = "input-quantity")
    WebElement enterQuantity;

    @CacheLookup
    @FindBy(id = "button-cart")
    WebElement clickOnAddToCart;

    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement successMessage;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Shopping Cart']")
    WebElement shoppingCart;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='HTC Touch HD']")
    WebElement productName;

    @CacheLookup
    @FindBy(xpath = "//li[normalize-space()='Product Code:Product 1']")
    WebElement modelName;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='£74.73']")
    WebElement getTotal;

    public void selectProductFromDropDown(String product){
        selectByVisibleTextFromDropDown(productDropDown, product);
        CustomListeners.test.log(Status.PASS, "selecting product from dropdown");
        Reporter.log("Selecting product from dropdown" +product +"to product filed"+ productDropDown.toString()+ "<br>");

    }
    public void setEnterQuantity(String qty){
        Reporter.log("Enter email " +qty+ " to qty filed "+ enterQuantity.toString()+ "<br>");
        sendTextToElement(enterQuantity, qty);
    }
    public void setClickOnAddToCart(){
        Reporter.log("Clicking on Login Button " + clickOnAddToCart.toString()+ "<br>");
        clickOnElement(clickOnAddToCart);
    }
    public void getSuccessMessage(String successMessage){
        Reporter.log("Get success text"+ successMessage+ " to sucess message" + successMessage.toString()+"<br>");

    }
    public void setShoppingCart(){
        Reporter.log("Click on Shopping Cart Link" + shoppingCart.toString()+ "<br>");
        clickOnElement(shoppingCart);
    }
    public void getProductName(String productName){
        Reporter.log("Get product name" + productName+ "to product name" + productName.toString()+"<br>");
    }
    public String verifyModelName(String model){
        Reporter.log("Get product 1 name"+ model+ "to model name"+ modelName.toString()+"<br>");
        return getTextFromElement(modelName);
    }
    public void verifyTotal(String total){
        Reporter.log("Verifying total"+total+" to total"+total.toString()+ "<br>");

    }
}
