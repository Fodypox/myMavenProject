package seleniumTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5_Back_And_Forth_Navigation {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");

        //<a class="gb_p" aria-label="Gmail" data-pid="23"
        // href="https://mail.google.com/mail/&amp;ogbl" target="_top">Gmail</a>

        driver.findElement(By.className("gb_p")).click();

        Thread.sleep(2000);

        String actualTitle = driver.getTitle();
        String expectedTitle = "Gmail";

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Passed");
        }else {
            System.out.println("Fail");
        }

        driver.navigate().back();

        String actualGoogleTitle = driver.getTitle();

        if (actualGoogleTitle.equals("Google")){
            System.out.println("Passed");
        }else {
            System.out.println("Not passed");
        }
    }
}
