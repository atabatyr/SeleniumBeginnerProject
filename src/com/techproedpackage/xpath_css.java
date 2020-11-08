package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_css {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\atab\\Documents\\selenium\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        // User goes to http://a.testaddressbook.com/sign_inLSEP
        driver.get("http://a.testaddressbook.com/sign_in");
        // Locate the elements of email textbox, password textbox, and signin buttonLSEP
        WebElement emailTextBox=driver.findElement(By.xpath("//input[@type='email']"));
        WebElement passwordTextBox=driver.findElement(By.xpath("//input[@name='session[password]']"));
        WebElement signInButton=driver.findElement(By.xpath("//input[@value='Sign in']"));
        emailTextBox.sendKeys("testtechproed@gmail.com");
        Thread.sleep(2000);
        passwordTextBox.sendKeys("Test1234!");
        Thread.sleep(2000);
        // Enter below username and password then click sign in buttonLSEP
        //Username: NBSP testtechproed@gmail.comLSEP
        //Password: Test1234!LSEP

        signInButton.click();
        Thread.sleep(2000);
        driver.manage().window().maximize();

        // Then verify that the expected user idNBSP testtechproed@gmail.com
//1.find the webelement fo the testtechproed@gmail.com
        //2. get the text of the webelement using getText() method
        //3. We canassertion- verify tht result
        String expectedIDText="testtechproed@gmail.com";
        WebElement currentUser=driver.findElement(By.xpath("//span[@data-test='current-user']"));
        String actualUserIdText=currentUser.getText();
        if(actualUserIdText.equals(expectedIDText)){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAILED");
            System.out.println("Expected ID :" + expectedIDText);
            System.out.println("Actual ID: "+actualUserIdText);
        }

        //Sign out from the page
        //WebElement signOut=driver.findElement(By.xpath("//a[@href='/sign_out']"));
        WebElement signOut=driver.findElement(By.xpath("(//a[@class='nav-item nav-link'])[2]"));
        signOut.click();
        Thread.sleep(2000);
        //I am checking if signInButton elemeent is visible after clicking on sign Out
        WebElement signIn=driver.findElement(By.xpath("//input[@value='Sign in']"));
        //isDisplayed() ==> This method is used to check is the element is on the page or not. It Returned boolean
        // If the element is on the page, this returns true if the element is not on the page, this returns false
        if(signIn.isDisplayed()){
            System.out.println("PASS.  YOU ARE IN SIGN IN PAGE");
        }
        else{
            System.out.println("FAILED. YOU ARE NOT IN SIGN IN PAGE");
        }


        //CSS

        WebElement emailTextBoxCSS=driver.findElement(By.cssSelector("input[type='email']"));
        WebElement passwordTextBoxCSS=driver.findElement(By.cssSelector("input[name='session[password]']"));
        WebElement signInButtonCSS=driver.findElement(By.cssSelector("input[value='Sign in']"));
        emailTextBoxCSS.sendKeys("testtechproed@gmail.com");
        Thread.sleep(2000);
        passwordTextBoxCSS.sendKeys("Test1234!");
        Thread.sleep(2000);
        signInButtonCSS.click();

        WebElement currentUserCSS=driver.findElement(By.cssSelector("span[data-test='current-user']"));
        String actualUserIdTextCSS=currentUserCSS.getText();
        if(actualUserIdTextCSS.equals(expectedIDText)){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAILED");
            System.out.println("Expected ID :" + expectedIDText);
            System.out.println("Actual ID: "+actualUserIdTextCSS);
        }
        Thread.sleep(2000);
        WebElement signOutCSS=driver.findElement(By.cssSelector("a[href='/sign_out']"));
        signOutCSS.click();
        driver.close();






    }


}
