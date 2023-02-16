package com.technostudyB7.day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitByTryCatch {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://the-internet.herokuapp.com/dynamic_loading/2");
        /*<div id="start">
        <button>Start</button>
        </div>*/
        driver.findElement(By.cssSelector("#start>button")).click();
        String text = "";
        int count = 0;
        while (text.equals("")) {
            try {
                WebElement hiddenText = driver.findElement(By.cssSelector("#finish>h4"));
                text = hiddenText.getText();
            } catch (NoSuchElementException ex) {
                count++;
            }
        }

        /*<div id="finish" style=""><h4>Hello World!</h4></div>*/
        System.out.println(text);
        System.out.println(count);


        Thread.sleep(5000);
        driver.quit();
    }
}
