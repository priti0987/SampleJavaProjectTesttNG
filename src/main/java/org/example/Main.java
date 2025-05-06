package org.example;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello World..!");
        System.setProperty("webdriver.com.driver","C:\\driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
//        driver.close();
    }
}
