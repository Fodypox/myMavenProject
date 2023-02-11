package seleniumTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task10_Etsy_Search_Test {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.etsy.com/");
        String expectedTitle = "bamboo pen";
        //<input id="global-enhancements-search-query" data-id="search-query"
        // data-search-input="" type="text" name="search_query"
        // class="wt-input wt-input-btn-group__input global-enhancements-search-input-btn-group__input
        //    wt-pr-xs-7
        //   " placeholder="Search for anything" value="" autocomplete="off" autocorrect="off" autocapitalize="off">

        WebElement searchBox = driver.findElement(By.id("global-enhancements-search-query"));
        searchBox.sendKeys(expectedTitle+ Keys.ENTER);

        String actualTitle = driver.getTitle().toLowerCase();

        if (actualTitle.startsWith(expectedTitle)){
            System.out.println("Passed");
        }else {
            System.out.println("Failed");
        }


        // <span class="wt-display-table-cell wt-text-left-xs">Gifts for Every Valentine</span>

        driver.findElement(By.className("wt-display-table-cell")).click();
        //<h1 class="wt-text-display-01 wt-pb-xs-2 wt-text-black">Valentine's Day Gifts</h1>

        String actualText = driver.findElement(By.tagName("h1")).getText();

        String expectedText = "Gifts for Every Valentine";

        if (actualText.equals(expectedText)){
            System.out.println("Passed");
        }else {
            System.out.println("failed");
        }
        Thread.sleep(3000);
        driver.quit();

    }
}
