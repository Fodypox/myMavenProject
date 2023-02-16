package com.technostudyB7.day7;

import com.technostudyB7.Utilities.UtilityClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GetCssValue extends UtilityClass{
    public static void main(String[] args) {

        driver.get("https://www.snapdeal.com/");
        WebElement searchInput = driver.findElement(By.id("inputValEnter"));
        System.out.println(searchInput.getAttribute("autocomplete"));
        System.out.println(searchInput.getAttribute("name"));
        System.out.println(searchInput.getAttribute("type"));
        System.out.println(searchInput.getAttribute("class"));
        System.out.println(searchInput.getAttribute("id"));
        System.out.println(searchInput.getAttribute("onkeypress"));
        System.out.println(searchInput.getAttribute("placeholder"));
        System.out.println();
        System.out.println(searchInput.getCssValue("background"));
        System.out.println(searchInput.getCssValue("font-family"));
        System.out.println(searchInput.getCssValue("color"));



        driver.quit();


    }
}
