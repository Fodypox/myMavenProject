package com.technostudyB7.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingElements {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techno.study");
        Thread.sleep(2000);
        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
//        finding the webelement on facebook page
        WebElement sloganText = driver.findElement(By.className("_8eso"));
        String expectedText = "Connect with friends and the world around you on Facebook.";
        String actualText = sloganText.getText();
        if (expectedText.equals(actualText)){
            System.out.println("Verification is done : PASS");
        }else {
            System.out.println("Verification is failed");
            System.out.println("Actual slogan text is : "+actualText);
        }
        driver.findElement(By.id("email")).sendKeys("Aslanbek");
        Thread.sleep(2000);
        driver.quit();
    }
}
