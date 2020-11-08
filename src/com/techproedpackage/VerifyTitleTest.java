package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitleTest {
    //Create a new class: VerifyTitleTest
    //Navigate to google homepage
    // Verify if google title is "google"
    public static void main(String [] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\atab\\Documents\\selenium\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        //get the page title
        String expectedTitle="google";
        String actualTitle=driver.getTitle();
        Thread.sleep(2000);
        driver.quit();

        if(expectedTitle.equals(actualTitle)){
            System.out.println("PASSED");
        }
        else{
            System.out.println("FAIL");
            System.out.println("Expected:"+expectedTitle);
            System.out.println("Actual: "+actualTitle);
        }


    }

}
