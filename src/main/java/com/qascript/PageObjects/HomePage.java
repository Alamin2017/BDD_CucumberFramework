package com.qascript.PageObjects;

import com.qascript.Utils.BrowserUtils;
import org.testng.Assert;


public class HomePage {

    public static String myaccountText="//h2[normalize-space()='My Account']";
    //public static String expectedText="My Account";
    public static String linkLaptopAndNotebooks="//a[normalize-space()='Laptops & Notebooks']";
    public static String linkShowAllLaptopsAndNotebooks="//a[normalize-space()='Show All Laptops & Notebooks']";


    public static void validateText(String expectedText)
    {
        String actualText=BrowserUtils.getText(myaccountText);
        System.out.println("Text:"+actualText);
        Assert.assertEquals(expectedText,actualText);
    }
    public static void clickAllLaptopAndNotebooks()
    {
        //BrowserUtils.hoverAndClickOnElement(linkLaptopAndNotebooks,linkShowAllLaptopsAndNotebooks);
        BrowserUtils.clickElement(linkLaptopAndNotebooks);
        BrowserUtils.clickElement(linkShowAllLaptopsAndNotebooks);
    }


}
