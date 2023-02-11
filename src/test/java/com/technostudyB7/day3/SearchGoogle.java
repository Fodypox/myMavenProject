package com.technostudyB7.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchGoogle {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");
        /*<input class="gLFyf" jsaction="paste:puy29d;" maxlength="2048" name="q" type="text" aria-autocomplete="both"
        aria-haspopup="false" autocapitalize="off" autocomplete="off" autocorrect="off" autofocus="" role="combobox"
        spellcheck="false" title="Поиск" value="" aria-label="Найти" data-ved="0ahUKEwih86O8n4f9AhVsEVkFHT0xBXUQ39UDCAU">*/

        driver.findElement(By.className("gLFyf")).sendKeys("bamboo pen"+ Keys.ENTER);
        String actualTitle = driver.getTitle();
        String expectedTitle = "bamboo pen - Google Search";


        if (actualTitle.equals(expectedTitle)){
            System.out.println("verification is successful : PASS");
        }else {
            System.out.println("verification failed");
        }

        Thread.sleep(2000);
        driver.quit();
    }
}
