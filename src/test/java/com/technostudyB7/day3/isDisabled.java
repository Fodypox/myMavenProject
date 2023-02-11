package com.technostudyB7.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisabled {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://the-internet.herokuapp.com/dynamic_controls");
        WebElement checkIfDisabled = driver.findElement(By.cssSelector("#input-example>input"));
        WebElement button = driver.findElement(By.cssSelector("#input-example>button"));
        button.click();
        Thread.sleep(5000);
        if (checkIfDisabled.isEnabled()){
            System.out.println("verification passed : is enabled");
        }else {
            System.out.println("verification failed : is disabled");
        }
        System.out.println(checkIfDisabled.isEnabled());

        Thread.sleep(2000);
        driver.quit();
    }
}
