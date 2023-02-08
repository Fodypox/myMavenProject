package com.technostudyB7.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MoreNavigations {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.seleniumeasy.com/");
        System.out.println(driver.getTitle().equals("Selenium Easy - Best Demo website to practice Selenium Webdriver Online"));
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.quit();
    }
}
