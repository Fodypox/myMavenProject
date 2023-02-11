package com.technostudyB7.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayed {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");
        WebElement displayButton = driver.findElement(By.cssSelector("#start>button"));
        WebElement isDisplayedElement =driver.findElement(By.cssSelector("#finish>h4"));
        System.out.println(isDisplayedElement.isDisplayed());
        displayButton.click();
        Thread.sleep(5000);
        if (isDisplayedElement.isDisplayed()){
            System.out.println("Hello world is displayed : Pass");
        }else {
            System.out.println("Hello world is not displayed : Fail");
        }

        Thread.sleep(3000);
        driver.quit();
    }
}
