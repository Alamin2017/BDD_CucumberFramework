package com.qascript.PageObjects;

import com.qascript.BaseClass;
import com.qascript.Utils.BrowserUtils;
import org.openqa.selenium.By;
import org.testng.Assert;

public class LoginPage  {

    private static String txtEmail="//input[@id='input-email']";
    private static String txtPass="//input[@id='input-password']";
    private static String btnLogin="//input[@value='Login']";
    private static String linkForgottenPassword="//div[@class='form-group']//a[normalize-space()='Forgotten Password']";
    private static String alertLoginError="//div[@class='alert alert-danger alert-dismissible']";
    public static void enterUsername(String username)
    {
        BrowserUtils.enterText(txtEmail,username);
    }
    public static void enterPassword(String password)
    {
        BrowserUtils.enterText(txtPass,password);
    }
    public static void clickLogin()
    {
        BrowserUtils.clickElement(btnLogin);
    }
    public static void clickForgottenPassword()
    {
        BrowserUtils.clickElement(linkForgottenPassword);
    }
    public static void validateInvalidLogin(String Expected_Error_message)
    {
        String LoginErrorMsg=BrowserUtils.getText(alertLoginError);
        Assert.assertEquals(Expected_Error_message,LoginErrorMsg);
    }






}
