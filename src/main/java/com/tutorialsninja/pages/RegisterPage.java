package com.tutorialsninja.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.customlisteners.CustomListeners;
import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Utility {

    @CacheLookup
    @FindBy(id = "input-firstname")
    WebElement enterFirstName;

    @CacheLookup
    @FindBy(id = "input-firstname")
    WebElement enterLastName;

    @CacheLookup
    @FindBy(id = "input-email")
    WebElement enterEmail;

    @CacheLookup
    @FindBy(id = "input-telephone")
    WebElement enterTelephone;

    @CacheLookup
    @FindBy(id = "input-password")
    WebElement enterPassword;

    @CacheLookup
    @FindBy(id = "input-confirm")
    WebElement enterConfirmPassword;

    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='Yes']")
    WebElement selectYesRadioButton;

    @CacheLookup
    @FindBy(xpath = "//input[@name='agree']")
    WebElement selectPrivacyCheckBox;

    @CacheLookup
    @FindBy(xpath = "//input[@value='Continue']")
    WebElement clickOnContinue;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
    WebElement verifyYourAccountCreatedText;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Continue']")
    WebElement clickOnContinueButton;

    @CacheLookup
    @FindBy(xpath = "//body/nav[@id='top']/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[5]/a[1]")
    WebElement verifyAccountLogout;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement clickOnContinueTab;


    public void setEnterFirstName(String name){
        sendTextToElement(enterFirstName,name);
        CustomListeners.test.log(Status.PASS,"Enter first name" + name);

    }
    public void setEnterLastName(String lastName){
        sendTextToElement(enterLastName,lastName);
        CustomListeners.test.log(Status.PASS,"Enter last name" + lastName);
    }
    public void setEnterEmail(String email){
        sendTextToElement(enterEmail,email);
        CustomListeners.test.log(Status.PASS,"Enter email in email filed" + email);
    }
    public void setEnterTelephone(String telephone){
        sendTextToElement(enterTelephone,telephone);
        CustomListeners.test.log(Status.PASS,"Enter telephone in telephone filed" + telephone);
    }
    public void setEnterPassword(String password){
        sendTextToElement(enterPassword, password);
        CustomListeners.test.log(Status.PASS,"Enter password in password filed" + password);
    }
    public void setEnterConfirmPassword(String confirmPassword){
        sendTextToElement(enterConfirmPassword, confirmPassword);
        CustomListeners.test.log(Status.PASS,"Enter confirm password in confirm password filed" + confirmPassword);
    }
    public void setSelectYesRadioButton(){
        clickOnElement(selectYesRadioButton);
        CustomListeners.test.log(Status.PASS,"Select radio yes button");
    }
    public void setSelectPrivacyCheckBox(){
        clickOnElement(selectPrivacyCheckBox);
        CustomListeners.test.log(Status.PASS,"Select privacy checkbox button");
    }
    public void setClickOnContinueButton(){
        clickOnElement(clickOnContinue);
        CustomListeners.test.log(Status.PASS,"Click on continue button");
    }
    public String setVerifyYourAccountCreatedText(){
        String message = getTextFromElement(verifyYourAccountCreatedText);
        CustomListeners.test.log(Status.PASS,"Verify the account created text");
        return message;
    }
    public void setClickOnContinue(){
        clickOnElement(clickOnContinueButton);
        CustomListeners.test.log(Status.PASS,"clicking on continue button");
    }
    public void setVerifyAccountLogout(){
        String message = getTextFromElement(verifyAccountLogout);
        CustomListeners.test.log(Status.PASS,"verify the account logout text");
    }
    public void setClickOnContinueTab(){
        clickOnElement(clickOnContinueTab);
        CustomListeners.test.log(Status.PASS, "Clicking on continue tab");
    }
}
