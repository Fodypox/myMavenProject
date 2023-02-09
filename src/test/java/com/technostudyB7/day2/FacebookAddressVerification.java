package com.technostudyB7.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookAddressVerification {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        String email = "aslanbeksmailbox@gmail.com";
        String password = "qwerty123";

        driver.get("https://www.facebook.com");
        WebElement emailBox = driver.findElement(By.id("email"));
        emailBox.sendKeys(email);
        WebElement passwordBox = driver.findElement(By.cssSelector("input[type='password']"));
        passwordBox.sendKeys(password);
        Thread.sleep(2000);
        WebElement loginButton = driver.findElement(By.cssSelector("button[name='login']"));
        loginButton.click();
        Thread.sleep(2000);


        driver.quit();
    }
}
