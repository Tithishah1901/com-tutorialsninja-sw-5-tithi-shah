package com.tutorialsninja.testsuit;

import com.tutorialsninja.customlisteners.CustomListeners;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LoginPage;
import com.tutorialsninja.pages.MyAccountPage;
import com.tutorialsninja.pages.RegisterPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class MyAccountTest extends BaseTest {

    HomePage homePage;
    MyAccountPage myAccountPage;
    RegisterPage registerPage;
    LoginPage loginPage;


    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        myAccountPage = new MyAccountPage();
        registerPage = new RegisterPage();
        loginPage = new LoginPage();
    }

    @Test(groups = {"sanity"})
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
        //1.1 Click on My Account Link.
        homePage.setClickOnMyAccountLink();
        //1.2 Call the method “selectMyAccountOptions” method and pass the parameter “Register”.
        myAccountPage.selectMyAccountOptions("Register");
        //1.3 Verify the text “Register Account”.
        myAccountPage.setVerifyRegisterAccountText();
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        //2.1 Click on My Account Link.
        homePage.setClickOnMyAccountLink();
        //2.2 Call the method “selectMyAccountOptions” method and pass the parameter “Login”
        myAccountPage.selectMyAccountOptions("Login");
        //2.3 Verify the text “Returning Customer”.
        myAccountPage.setVerifyReturningCustomerText();

    }

    @Test(groups = {"regression"})
    public void verifyThatUserRegisterAccountSuccessfully() {
        //3.1 Clickr on My Account Link.
        homePage.setClickOnMyAccountLink();
        //3.2 Call the method “selectMyAccountOptions” method and pass the parameter “Register”
        myAccountPage.selectMyAccountOptions("Register");
        //3.3 Enter First Name
        registerPage.setEnterFirstName("Tithi");
        //3.4 Enter Last Name
        registerPage.setEnterLastName("Shah");
        //3.5 Enter Email
        registerPage.setEnterEmail("Tit.123@gmail.com");
        //3.6 Enter Telephone
        registerPage.setEnterTelephone("07448585744");
        //3.7 Enter Password
        registerPage.setEnterPassword("tit1234");
        //3.8 Enter Password Confirm
        registerPage.setEnterConfirmPassword("tit1234");
        //3.9 Select Subscribe Yes radio button
        registerPage.setSelectYesRadioButton();
        //3.10 Click on Privacy Policy check box
        registerPage.setSelectPrivacyCheckBox();
        //3.11 Click on Continue button
        registerPage.setClickOnContinueButton();
        //3.12 Verify the message “Your Account Has Been Created!”
        registerPage.setVerifyYourAccountCreatedText();
        //3.13 Click on Continue button
        registerPage.setClickOnContinue();
        //3.14 Click on My Account Link.
        homePage.setClickOnMyAccountLink();
        //3.15 Call the method “selectMyAccountOptions” method and pass the parameter “Logout”
        myAccountPage.selectMyAccountOptions("Logout");
        //3.16 Verify the text “Account Logout”
        registerPage.setVerifyAccountLogout();
        //3.17 Click on Continue button
        registerPage.setClickOnContinueTab();
    }

    @Test(groups = {"regression"})
    public void verifyThatUserShouldLoginAndLogoutSuccessfully() {
    //4.1 Clickr on My Account Link.
        homePage.setClickOnMyAccountLink();
        //4.2 Call the method “selectMyAccountOptions” method and pass the parameter “Login”
        myAccountPage.selectMyAccountOptions("Login");
        //4.3 Enter Email address
        loginPage.setEnterEmailInEmailFiled("Tithi.123@Gmail.com");
        //4.4 Enter Last Name
        //4.5 Enter Password
        loginPage.setEnterPasswordInPasswordFiled("tithi1234");
        //4.6 Click on Login button
        loginPage.setClickOnLoginButton();
        //4.7 Verify text “My Account”
        //4.8 Clickr on My Account Link.
        homePage.setClickOnMyAccountLink();
        //4.9 Call the method “selectMyAccountOptions” method and pass the parameter “Logout”
        myAccountPage.selectMyAccountOptions("Logout");
      //4.10 Verify the text “Account Logout”
        registerPage.setVerifyAccountLogout();
     //4.11 Click on Continue button

    }
}
