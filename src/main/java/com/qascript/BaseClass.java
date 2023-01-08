package com.qascript;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.qascript.Utils.BrowserUtils.getBrowserDriver;

public class BaseClass {
    public static WebDriver driver;
    public static String browser="chrome";

    public static void initializeDriver()
    {
//        WebDriverManager.chromedriver().setup();
//        driver=new ChromeDriver();
        driver=getBrowserDriver(browser);
        driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
        driver.manage().window().maximize();
    }
    public static void closeDriver() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
