package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

// Create a class: LocatorsIntro
public class LocatorsIntro {
    //Create a main method
    public static void main(String [] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\atab\\Documents\\selenium\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        // user goes to https://a.testaddressbook.com/sign_in
        driver.get("http://a.testaddressbook.com/sign_in");
        //Locate the elements of email textbox, password textbox, and signin button
        WebElement emailTextBox=driver.findElement(By.xpath("//input[@type='email']"));

        //WebElement emailTextBox=driver.findElement(By.id("session_email"));
        WebElement passwordTextBox=driver.findElement(By.id("session_password"));
        WebElement signinButton=driver.findElement(By.name("commit"));

        // Enter below username and password then click sign in button
        //Username: testtechproed@gmail.com
        //Password: Test1234!
        Thread.sleep(2000);
        emailTextBox.sendKeys("testtechproed@gmail.com");
        Thread.sleep(2000);
        passwordTextBox.sendKeys("Test1234!");
        Thread.sleep(2000);
        signinButton.click();

        // Then verify that the expected user id testtechproed@gmail.com
        Thread.sleep(2000);
        WebElement actualUser=driver.findElement(By.className("navbar-text"));
        if(actualUser.getText().equals("testtechproed@gmail.com")){
            System.out.println("PASS");
        }
        else{
            System.out.println("Fail");
            System.out.println("Expected: testtechproed@gmail.com");
            System.out.println("Actual: "+actualUser.getText());
        }

        WebElement signout=driver.findElement(By.linkText("Sign out"));
        Thread.sleep(500);
        WebElement addresses=driver.findElement(By.linkText("Addresses"));

        Thread.sleep(2000);
        //Verify the addresses and sign out texts are displayed

        if(addresses.getText().equals("Addresses")){
            System.out.println("PASS");
        }
        else{
            System.out.println("Fail");
            System.out.println("Expected: Addresses");
            System.out.println("Actual: "+addresses.getText());
        }

        if(signout.getText().equals("Sign out")){
            System.out.println("PASS");
        }
        else{
            System.out.println("Fail");
            System.out.println("Expected: Sign Out");
            System.out.println("Actual: "+signout.getText());
        }


        // find the number of total link on the page

        Thread.sleep(2000);
        //List<WebElement> links = driver.findElements(By.tagName("a"));
        List<WebElement> links = driver.findElements(By.className("nav-link"));
        System.out.println("The number of links on the page is " + links.size());
        for(WebElement link:links){
            System.out.println(link.getText());
        }
        Thread.sleep(2000);
        List<WebElement> linksA = driver.findElements(By.xpath("//div/a[3]"));
        System.out.println("The number of links on the page is " + linksA.size());
        for(WebElement link:linksA){
            System.out.println(link.getText());
        }


        // Sign out from th  e page
        signout.click();

        Thread.sleep(2000);
        //driver.quit();
    }
}
