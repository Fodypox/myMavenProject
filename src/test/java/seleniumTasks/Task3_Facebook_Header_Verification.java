package seleniumTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3_Facebook_Header_Verification {
    public static void main(String[] args) throws InterruptedException {
        /*1. Open Chrome browser
        2. Go to https://www.facebook.com
        3. Verify header text is as expected:
        Expected: “Connect with friends and the world around you on Facebook.”*/
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");
        /*<h2 class="_8eso">Connect with friends and the world around you on Facebook.</h2>*/
        String actualHeader = driver.findElement(By.className("_8eso")).getText();
        String expectedHeader = "Connect with friends and the world around you on Facebook.";

        if (expectedHeader.equals(actualHeader)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }

        Thread.sleep(5000);
        driver.quit();
    }
}
