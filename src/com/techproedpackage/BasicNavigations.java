package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String [] args) throws InterruptedException {
        //Calling the chromedriver and giving the path
        System.setProperty("webdriver.chrome.driver","C:\\Users\\atab\\Documents\\selenium\\chromedriver.exe");
        //creatinig driver object
        WebDriver driver= new ChromeDriver();

        //goinng to kinokrad.co
        driver.get("https://www.google.com");
        // on the same classs, navigate to amazon home page https://www.amazon.com/#ace-1541440903
        Thread.sleep(2000); // waiting 5 seconds
        driver.navigate().to("https://www.amazon.com");
        // Navigate back to googleLSEP
        Thread.sleep(2000);
        driver.navigate().back();
        //Navigate back to amazonLSEP
        Thread.sleep(2000);
        driver.navigate().forward();
        //Refresh th pageLSEP
        Thread.sleep(2000);
        driver.navigate().refresh();
        //Maximazie the windowLSEP
        Thread.sleep(2000);
        driver.manage().window().maximize();
        //Close/Quit the browser
        Thread.sleep(2000);
        //driver.close(); // closes th current open browser
        driver.quit(); // closes all open browsers

    }
}
