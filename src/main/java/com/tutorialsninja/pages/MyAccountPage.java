package com.tutorialsninja.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.customlisteners.CustomListeners;
import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MyAccountPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register Account')]")
    WebElement verifyRegisterAccountText;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Returning Customer')]")
    WebElement returningCustomerText;

    public void selectMyAccountOptions(String option) {
        List<WebElement> myAccountList = getListOfElements(By.xpath("//div[@id='top-links']//li[contains(@class,'open')]/ul/li"));
        try {
            for (WebElement options : myAccountList) {
                if (options.getText().equalsIgnoreCase(option)) {
                    options.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            myAccountList = getListOfElements(By.xpath("//div[@id='top-links']//li[contains(@class,'open')]/ul/li"));
        }
    }
    public void setVerifyRegisterAccountText(){
        getTextFromElement(verifyRegisterAccountText);
        CustomListeners.test.log(Status.PASS,"Verify the register account text");
    }
    public void setVerifyReturningCustomerText(){
        getTextFromElement(returningCustomerText);
        CustomListeners.test.log(Status.PASS,"Verify the Returning Customer text");
    }


}
