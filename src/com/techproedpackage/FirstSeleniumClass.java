package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumClass {
    public static void main(String[] args) {


        WebDriver driver=new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","C:\\Users\\atab\\Documents\\selenium\\chromedriver.exe");
        //Create our driver object
        driver.get("https://www.google.com/search?q=hello+w norld&sxsrf=ALeKk005fxpD-YtUGd0lOAtZRRO8mkdTzA:1597599326474&source=lnms&tbm=isch&sa=X&ved=2ahUKEwiR4-OioaDrAhVSOKwKHf9-CYsQ_AUoAnoECBMQBA&biw=1280&bih=619&dpr=1.5");


    }
}
