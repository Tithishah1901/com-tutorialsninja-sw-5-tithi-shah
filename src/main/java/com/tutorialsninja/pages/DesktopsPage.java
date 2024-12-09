package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class DesktopsPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Desktops']")
    WebElement verifyDesktopsText;

    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement sortingProduct;

    public void setVerifyDesktopsText(){
        String message = getTextFromElement(verifyDesktopsText);
    }
    public void selectProductSorting(String type){
        selectByVisibleTextFromDropDown(sortingProduct, type);
        Reporter.log("sorting from dropdown  menu A to Z" + sortingProduct.toString());
    }
}
