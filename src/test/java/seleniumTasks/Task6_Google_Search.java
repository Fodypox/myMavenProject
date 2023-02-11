package seleniumTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task6_Google_Search {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");

        //<input class="gLFyf" jsaction="paste:puy29d;" maxlength="2048"
        // name="q" type="text" aria-autocomplete="both" aria-haspopup="false"
        // autocapitalize="off" autocomplete="off" autocorrect="off"
        // autofocus="" role="combobox" spellcheck="false" title="Search" value=""
        // aria-label="Search" data-ved="0ahUKEwj27Ia9xYv9AhVjkGoFHeNWDTMQ39UDCAY">

        WebElement searchBox = driver.findElement(By.className("gLFyf"));

        searchBox.sendKeys("apple"+ Keys.ENTER);

        String expectedTitle = "apple";
        String actualTitle = driver.getTitle();

        if (actualTitle.startsWith(expectedTitle)){
            System.out.println("Passed");
        }else{
            System.out.println("failed");
        }


    }
}
