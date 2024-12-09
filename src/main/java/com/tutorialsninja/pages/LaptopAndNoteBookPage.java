package com.tutorialsninja.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.customlisteners.CustomListeners;
import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LaptopAndNoteBookPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Laptops & Notebooks']")
    WebElement verifyLaptopAndNoteBook;

    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement sortingPrice;



    public void setVerifyLaptopAndNoteBookText(){
        String message = getTextFromElement(verifyLaptopAndNoteBook);

    }
    public void selectPriceSorting(String type){
        selectByVisibleTextFromDropDown(sortingPrice, type);
        CustomListeners.test.log(Status.PASS,"Sorting price");
    }

}
