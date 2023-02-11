package seleniumTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task9_Zero_Bank_Link_Text_Verification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://zero.webappsecurity.com/login.html");

        //<a href="/index.html" class="brand">Zero Bank</a>

        String actualResult = driver.findElement(By.className("brand")).getText();

        String expectedResult = "Zero Bank";

        if (expectedResult.equals(actualResult)) {
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }

        String actualHref = driver.findElement(By.className("brand")).getAttribute("href");
        String expectedHref = "index.html";

        if (actualHref.contains(expectedHref)){
            System.out.println("Passed");
        }else {
            System.out.println("Failed");
        }

    }
}
