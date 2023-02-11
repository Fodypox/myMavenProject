package seleniumTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2_Facebook_Incorrect_Login_Title_Verification {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");
        /*<input type="text" class="inputtext _55r1 _6luy" name="email" id="email" data-testid="royal_email"
        placeholder="Email or phone number" autofocus="1" aria-label="Email or phone number">*/

        /*<input type="password" class="inputtext _55r1 _6luy _9npi" name="pass" id="pass" data-testid="royal_pass" placeholder="Password" aria-label="Password">*/
        String username = "Aslanbek";
        String password = "12345";

        driver.findElement(By.id("email")).sendKeys(username);
        driver.findElement(By.id("pass")).sendKeys(password+Keys.ENTER);
        Thread.sleep(6000);
        String actualTitle = driver.getTitle();
        String expectedTitle = "Log into Facebook";

        if (actualTitle.equals(expectedTitle)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }

        driver.quit();
    }
}
