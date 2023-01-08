package com.qascript.Utils;

import com.qascript.BaseClass;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BrowserUtils extends BaseClass {

   public static WebElement findAndWaitForElement(String xpath)
   {
       WebElement element=null;
       try{
          // WebDriverWait wait=new WebDriverWait(driver,30);
           WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
           element=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(xpath))));
       }
       catch (Exception e)
       {
           System.out.println("Element not found");
       }
       return element;
   }
   public static void clickElement(String element)
   {
       findAndWaitForElement(element).click();
   }
   public static void enterText(String element,String text)
   {
       findAndWaitForElement(element).sendKeys(text);
   }
   public static String getText(String element)
   {
       return findAndWaitForElement(element).getText();
   }
   public static WebDriver getBrowserDriver(String browser)
   {
       if(browser!=null)
       {
           if(browser.equalsIgnoreCase("chrome")){
               WebDriverManager.chromedriver().setup();
               driver=new ChromeDriver();
           }
       }
       return driver;
   }

}
