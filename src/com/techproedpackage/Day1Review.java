package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class Day1Review {
    /*
    Create a new Class :Day1Review
    Using chromeDriver, Go to youtube and verify if page title is "youtube", if not print the correct title.
    Verify if the page URL contains youtube if not, print the right url
    Then Navigagte to https://www.amazon.com/
    Navigate back to youtube
    Refresh the page
    Navigate forward to amazon
    Maximize the window
    Then Verify if page title includes "Amazon", if not, print the correct title
    Verify if the page URL is "https://www.amazon.com/", if not print the correct url
    Quit the browser
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\atab\\Documents\\selenium\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.youtube.com");
        String youtubeTitle=driver.getTitle();
        if(youtubeTitle.equals("youtube")){
            System.out.println("Title is youtube, true");
        }
        else{
            System.out.println("False YTitle: "+youtubeTitle);
        }
        String youtubeURL=driver.getCurrentUrl();
        if(youtubeURL.contains("youtube")){
            System.out.println("URL containes youtube, true");
        }
        else{
            System.out.println("URL doesn't contain youtube, false");
        }
        driver.navigate().to("https://www.amazon.com/");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
        driver.manage().window().maximize();
        Thread.sleep(3000);
        String amazonTitle= driver.getTitle();
        if(amazonTitle.contains("Amazon")){
            System.out.println("PageTitle includes 'Amazon', true");
        }
        else{
            System.out.println("Amazon title doesn't contain 'Amazon', actual Title is  "+ amazonTitle+" ,false");
        }
        String amazonURL=driver.getCurrentUrl();
        if(amazonURL.equals("https://www.amazon.com/")){
            System.out.println("amazon URL is https://www.amazon.com/, true");
        }
        else{
            System.out.println("Fail, actual amazon URL is "+amazonURL);
        }




        driver.quit();
    }
}
