package seleniumTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4_Facebook_Create_Page_Link_Verification {
    public static void main(String[] args) {
        /*TC #4: Facebook "create a page" link verification
        1. Open Chrome browser
        2. Go to https://www.facebook.com
        3. Verify “Create a page” link href value contains text:
        Expected: “registration_form”*/
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");
        /*<a href="/pages/create/?ref_type=registration_form" class="_8esh">Create a Page</a>*/
        String linkText = driver.findElement(By.className("_8esh")).getAttribute("href");
        String expectedResult = "registration_form";

        if (linkText.contains(expectedResult)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }



        driver.quit();
    }
}
