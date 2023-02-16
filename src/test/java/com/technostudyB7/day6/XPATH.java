package com.technostudyB7.day6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class XPATH {
    public static void main(String[] args) {
//        css locator = tagName[attribute='value']
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.worldometers.info/world-population/");
        WebElement populationCount = driver.findElement(By.xpath("//div[@id='maincounter-wrap']/div/span"));
        System.out.println(populationCount.getText());


        driver.quit();
    }
}
