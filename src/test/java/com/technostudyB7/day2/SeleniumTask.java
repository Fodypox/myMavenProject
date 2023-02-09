package com.technostudyB7.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTask {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String seleniumURL = "https://demo.seleniumeasy.com/basic-first-form-demo.html";
        driver.get(seleniumURL);
        WebElement inputText = driver.findElement(By.id("user-message"));
        inputText.sendKeys("Aslanbek");
        WebElement button = driver.findElement(By.cssSelector("button[class='btn btn-default']"));
        button.click();

        WebElement result = driver.findElement(By.cssSelector("span[id='display']"));
        String actualResult = result.getText();
        String expectedResult = "Aslanbek";
        if (actualResult.equals(expectedResult)){
            System.out.println("Verification is successful : PASS");
        }else {
            System.out.println("Verification failed");
            System.out.println("Expected result is : "+expectedResult);
        }
        Thread.sleep(2000);


        driver.quit();
    }
}
