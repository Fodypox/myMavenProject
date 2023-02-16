package com.technostudyB7.day7;

import com.technostudyB7.Utilities.UtilityClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsClick extends UtilityClass {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://demoqa.com/buttons");
        WebElement doubleClickBtn = driver.findElement(By.id("doubleClickBtn"));
        WebElement rightClickBtn = driver.findElement(By.id("rightClickBtn"));
        WebElement oneClickBtn = driver.findElement(By.xpath("//button[text()='Click Me']"));
        Actions actions = new Actions(driver);
        Action doubleClickAction = actions.moveToElement(doubleClickBtn).doubleClick().build();//actions.doubleClick(doubleClickBtn).build();
        doubleClickAction.perform();
        Action rightClickAction = actions.contextClick(rightClickBtn).build();
        rightClickAction.perform();
        Action singleClickAction = actions.click(oneClickBtn).build();
        singleClickAction.perform();

        Thread.sleep(5000);
        driver.quit();

    }
}
