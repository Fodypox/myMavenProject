package com.technostudyB7.day5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class DropDownMenu {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
        WebElement dropDown = driver.findElement(By.id("select-demo"));

//        Create Select class objects
        Select select = new Select(dropDown);
        select.selectByIndex(1);
        Thread.sleep(2000);
        select.selectByValue("Tuesday");
        Thread.sleep(2000);
        select.selectByVisibleText("Saturday");
        Thread.sleep(2000);
        String selectedOption = select.getFirstSelectedOption().getText();
        String expected = "Saturday";
        if (selectedOption.equals(expected)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }


        driver.quit();
    }
}
