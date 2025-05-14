package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException, AWTException {
        System.out.println("Hello World..!");
        System.setProperty("webdriver.com.driver","C:\\driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().maximize();
        Thread.sleep(1000);


        String filePath = "C:\\Python\\NEWS.txt";

        WebElement file_element = driver.findElement(By.xpath("//input[@id='myFile']"));
        System.out.println(file_element.isEnabled());
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", file_element);


        file_element.sendKeys(filePath);


        //        driver.close();
//       try {
//           //Number of Elements
//           //input elements
//           List <WebElement>inputElements = driver.findElements(By.tagName("input"));
//           System.out.println("input elements = " + inputElements.size());
//           for (WebElement element : inputElements) {
//               System.out.println("Paragraph text:" + element.getAttribute("class"));
//           }
//
//           WebElement emailField = driver.findElement(By.xpath("//input[@name='email']"));
//           System.out.println(emailField.isDisplayed());
//           emailField.sendKeys("priti..");
//       }
//       catch (Exception e){
//           System.out.println(e);
//
//       }
       System.out.println("Done...");
        Thread.sleep(1000);

        //driver.close();
    }

}
