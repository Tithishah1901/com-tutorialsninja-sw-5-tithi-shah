package com.tutorialsninja.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.customlisteners.CustomListeners;
import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

public class HomePage extends Utility {

    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement desktops;

    @CacheLookup
    @FindBy(linkText = "Laptops & Notebooks")
    WebElement laptopAndNoteBook;

    @CacheLookup
    @FindBy(linkText = "Components")
    WebElement components;

    @CacheLookup
    @FindBy(xpath = "//button[@class='btn btn-link dropdown-toggle']" )
    WebElement currency;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='£Pound Sterling']")
    WebElement poundSterling;

     @CacheLookup
     @FindBy(xpath = "//span[contains(text(),'My Account')]")
     WebElement clickOnMyAccountLink;

    public void selectMenu(String menu) {
        List<WebElement> topMenuList = getListOfElements(By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"));
        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            topMenuList = getListOfElements(By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"));
        }
    }
    public void clickOnDesktops(){
        clickOnElement(desktops);
        CustomListeners.test.log(Status.PASS,"Clicking on desktops");
        Reporter.log("Clicking On desktops tab " + desktops.toString());
    }
    public void clickOnLaptopAndNoteBook(){
        clickOnElement(laptopAndNoteBook);
        CustomListeners.test.log(Status.PASS,"Clicking on laptopAndNoteBook");
    }
    public void clickOnComponents(){
        clickOnElement(components);
        CustomListeners.test.log(Status.PASS,"Clicking on Components");
    }

    public void clickOnCurrency(){
    clickOnElement(currency);
    CustomListeners.test.log(Status.PASS, "clicking on currency");
        Reporter.log("clicking on currency link " + currency.toString());
    }

    public  void clickOnPoundSterling(){
        clickOnElement(poundSterling);
        CustomListeners.test.log(Status.PASS, "Clicking On Pound streling currency");
        Reporter.log("Clicking On Pound Sterling currency " + poundSterling.toString());
    }

    public void setClickOnMyAccountLink(){
        clickOnElement(clickOnMyAccountLink);
        CustomListeners.test.log(Status.PASS,"Clicking on my account link");
    }



}
