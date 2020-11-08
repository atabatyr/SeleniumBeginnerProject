package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyURLTest {
    //Create a new class: VerifyURL Test
    //Navigate to google homepage
    // Verify if google homepage url is "www.google.com"
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\atab\\Documents\\selenium\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        String actualHomePage=driver.getCurrentUrl();
        String expectedHomePage="www.google.com";
        if(actualHomePage.equals(expectedHomePage)){
            System.out.println("PASSES");
        }
        else{
            System.out.println("FAIL");
            System.out.println("Expected "+expectedHomePage);
            System.out.println("Actual "+actualHomePage);
        }
        driver.quit();
    }
}
