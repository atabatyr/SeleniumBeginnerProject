package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {
    public static void main(String [] args) throws InterruptedException {
        //1. Create a new class :  GoogleSearchTest
        /*2. Create main method and compleete the following task.
        When user goes to https://www.google.com
        Search for "porcelain teapot"
        And print how many related results displayed on Google
        And click on Shopping
        Then verify the texts :  Home, Stores, Departments
        * */


        System.setProperty("webdriver.chrome.driver","C:\\Users\\atab\\Documents\\selenium\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        WebElement searchText=driver.findElement(By.xpath("//input[@name='q']"));
        Thread.sleep(2000);
        searchText.sendKeys("porcelain teapot");
        //this one gonna enter directly after entering text "porcelain teapot"
        //searchText.sendKeys("porcelain teapot"+ Keys.ENTER);
        Thread.sleep(2000);
        WebElement searchButton=driver.findElement(By.cssSelector("input[value='Google Search']"));
        searchButton.click();
        Thread.sleep(2000);
        WebElement resultText=driver.findElement(By.id("result-stats"));
        String str=resultText.getText();
        String[] sp=str.split(" ");
        System.out.println("Results : "+sp[1]);
        WebElement shoppingButton=driver.findElement(By.linkText("Shopping"));
        shoppingButton.click();
        WebElement home=driver.findElement(By.linkText("Home"));
        String actualHomeText=home.getText();
        String expectedHomeText="Home";
        if(actualHomeText.equals(expectedHomeText)){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAIL");
        }
    }
}
