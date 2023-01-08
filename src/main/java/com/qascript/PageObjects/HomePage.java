package com.qascript.PageObjects;

import com.qascript.Utils.BrowserUtils;
import org.testng.Assert;


public class HomePage {

    public static String myaccountText="//h2[normalize-space()='My Account']";
    //public static String expectedText="My Account";

    public static void validateText(String expectedText)
    {
        String actualText=BrowserUtils.getText(myaccountText);
        System.out.println("Text:"+actualText);
        Assert.assertEquals(expectedText,actualText);

    }

}
