package com.tutorialsninja.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.customlisteners.CustomListeners;
import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {

    @CacheLookup
    @FindBy(id = "input-email")
    WebElement enterEmailInEmailFiled;

    @CacheLookup
    @FindBy(id = "input-email")
    WebElement enterPasswordInEmailFiled;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement clickOnLoginButton;

    public void setEnterEmailInEmailFiled(String email){
        sendTextToElement(enterEmailInEmailFiled,email);
        CustomListeners.test.log(Status.PASS,"Enter email in email filed" + email);
    }
    public void setEnterPasswordInPasswordFiled(String password){
        sendTextToElement(enterPasswordInEmailFiled,password);
        CustomListeners.test.log(Status.PASS,"Enter email in email filed" + password);
    }
    public void setClickOnLoginButton(){
        clickOnElement(clickOnLoginButton);
        CustomListeners.test.log(Status.PASS,"clicking on login button");
    }
}
