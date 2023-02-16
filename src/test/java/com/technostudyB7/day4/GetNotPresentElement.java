package com.technostudyB7.day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetNotPresentElement {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://the-internet.herokuapp.com/dynamic_loading/2");
        /*<div id="start">
        <button>Start</button>
        </div>*/
        driver.findElement(By.cssSelector("#start>button")).click();
        Thread.sleep(5000);
        /*<div id="finish" style=""><h4>Hello World!</h4></div>*/
        String expectedText = driver.findElement(By.cssSelector("#finish>h4")).getText();
        System.out.println(expectedText);




        Thread.sleep(5000);
        driver.quit();
    }
}
