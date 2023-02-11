package com.technostudyB7.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
        WebElement checkBox = driver.findElement(By.id("isAgeSelected"));
        checkBox.click();
        if (checkBox.isSelected()){
            System.out.println("checkbox is selected : PASS");
        }else {
            System.out.println("checkbox is not selected : FAILED");
        }


        Thread.sleep(2000);
        driver.quit();
    }
}
