package com.technostudyB7.day5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWait {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");
        WebElement displayButton = driver.findElement(By.cssSelector("#start>button"));
        WebElement isDisplayedElement =driver.findElement(By.cssSelector("#finish>h4"));
        System.out.println(isDisplayedElement.isDisplayed());
        displayButton.click();
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(isDisplayedElement));
        System.out.println(isDisplayedElement.getText());


        driver.quit();
    }
}
