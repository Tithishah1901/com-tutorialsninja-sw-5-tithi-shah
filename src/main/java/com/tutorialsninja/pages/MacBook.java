package com.tutorialsninja.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.customlisteners.CustomListeners;
import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class MacBook extends Utility {

    @CacheLookup
    @FindBy(linkText = "MacBook" )
    WebElement selectMacBook;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='MacBook']")
    WebElement verifyMackBookText;

    @CacheLookup
    @FindBy(xpath = "//button[@id='button-cart']")
    WebElement clickOnAddToCart;

    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement verifySuccessMessage;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']" )
    WebElement clickingOnShoppingCartLink;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping Cart')]")
    WebElement verifyShoppingCartText;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[2]/div[2]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]")
    WebElement verifyProductNameMacBook;

    @CacheLookup
    @FindBy(xpath = "//button[contains(@data-original-title, 'Update')]")
    WebElement clickOnUpDateButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement modifiedMessage;

    @CacheLookup
    @FindBy(xpath = "//tbody/tr[1]/td[6]")
    WebElement verifyTotal;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Checkout')]")
    WebElement checkOutButton;

    public void setSelectMacBook(){
        clickOnElement(selectMacBook);
        CustomListeners.test.log(Status.PASS,"Clicking on macbook");
        Reporter.log("Clicking on Mackbook"+ selectMacBook.toString());
    }
    public void setClickOnAddToCart(){
        clickOnElement(clickOnAddToCart);
        CustomListeners.test.log(Status.PASS,"Clicking on add to cart button");
    }

    public void setVerifyMackBookText(){
        getTextFromElement(verifyMackBookText);
        CustomListeners.test.log(Status.PASS,"Verifying mackbook text");
    }
    public void setVerifySuccessMessage(){
        getTextFromElement(verifySuccessMessage);
        CustomListeners.test.log(Status.PASS,"Verify success message");
    }
    public void setClickingOnShoppingCartLink(){
        clickOnElement(clickingOnShoppingCartLink);
        CustomListeners.test.log(Status.PASS, "Clicking on shopping cart link");
    }
    public void setVerifyShoppingCartText(){
        getTextFromElement(verifyShoppingCartText);
        CustomListeners.test.log(Status.PASS,"Verify shopping cart text");
    }
    public void setVerifyProductNameMacBook(){
        getTextFromElement(verifyProductNameMacBook);
        CustomListeners.test.log(Status.PASS,"Verify product name is macbook");
    }
    public void changeTheQuantity(){
        driver.findElement(By.xpath("//tbody/tr[1]/td[4]/div[1]/input[1]")).clear();
        driver.findElement(By.xpath("//tbody/tr[1]/td[4]/div[1]/input[1]")).sendKeys("2");
        CustomListeners.test.log(Status.PASS,"changing the quantity");
    }
    public void setClickOnUpDateButton(){
        clickOnElement(clickOnUpDateButton);
        CustomListeners.test.log(Status.PASS,"Clicking on update button");
    }
    public void setModifiedMessage(){
        getTextFromElement(modifiedMessage);
        CustomListeners.test.log(Status.PASS,"Modifiled messgae");
    }
    public void setVerifyTotal(){
        getTextFromElement(verifyTotal);
        CustomListeners.test.log(Status.PASS,"Verify the total");
    }
    public void setClickOnCheckOutButton(){
        clickOnElement(checkOutButton);
        CustomListeners.test.log(Status.PASS,"Clicking on checkout button");
    }


}
