package com.technostudyB7.day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class JSAlert {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://the-internet.herokuapp.com/javascript_alerts");
        /*<button onclick="jsAlert()">Click for JS Alert</button>*/
        WebElement jsAlert = driver.findElement(By.cssSelector("button[onclick='jsAlert()']"));
        jsAlert.click();
        String jsAlertText = driver.switchTo().alert().getText();
        System.out.println(jsAlertText);
        driver.switchTo().alert().accept();

        /*<button onclick="jsConfirm()">Click for JS Confirm</button>*/
        WebElement jsConfirm = driver.findElement(By.cssSelector("button[onclick='jsConfirm()']"));
        jsConfirm.click();
        String jsConfirmText = driver.switchTo().alert().getText();
        System.out.println(jsConfirmText);
        driver.switchTo().alert().dismiss();
        /*<p id="result" style="color:green">You clicked: Cancel</p>*/
        System.out.println(driver.findElement(By.id("result")).getText());

        /*<button onclick="jsPrompt()">Click for JS Prompt</button>*/
        WebElement jsPrompt = driver.findElement(By.cssSelector("button[onclick='jsPrompt()']"));
        jsPrompt.click();
        String jsPromptText = driver.switchTo().alert().getText();
        System.out.println(jsPromptText);
        driver.switchTo().alert().sendKeys("Aslanbek"+Keys.ENTER);

        /*<p id="result" style="color:green">You clicked: Cancel</p>*/



        driver.quit();
    }
}
