package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello World..!");
        System.setProperty("webdriver.com.driver","C:\\driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        //        driver.close();
       try {
           WebElement emailField = driver.findElement(By.xpath("//input[@name='email']"));
           System.out.println(emailField.isDisplayed());
           emailField.sendKeys("priti..");
       }
       catch (Exception e){
           System.out.println(e);

       }
       System.out.println("Done...");
        Thread.sleep(1000);

        driver.close();
    }

}
