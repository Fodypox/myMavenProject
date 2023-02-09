package com.technostudyB7.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTask_2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        String seleniumURL = "https://demo.seleniumeasy.com/basic-first-form-demo.html";
        driver.get(seleniumURL);
        WebElement firstNumber = driver.findElement(By.id("sum1"));
        WebElement secondNumber = driver.findElement(By.id("sum2"));
        firstNumber.sendKeys(String.valueOf(5));
        secondNumber.sendKeys(String.valueOf(8));
        WebElement resultButton = driver.findElement(By.xpath("//button[contains(text(),'Get Total')]"));
        resultButton.click();
        WebElement result = driver.findElement(By.id("displayvalue"));
        String expectedResult = "13";
        String actualResult = result.getText();
        System.out.println(actualResult);

        if (expectedResult.equals(actualResult)) {
            System.out.println("verification passed");
        } else {
            System.out.println("verification failed");
        }

        driver.quit();
    }
}
