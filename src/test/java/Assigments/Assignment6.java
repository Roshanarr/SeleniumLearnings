package Assigments;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.Set;

/*
https://testautomationpractice.blogspot.com/
1)provide some string to search
2)count number of links
3)Click on each link using for loop
4)get windows ids for every browser window
5)Close specific browser window
 */
public class Assignment6 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@class='wikipedia-search-input']"))
                .sendKeys("selenium");
        driver.findElement(By.xpath("//input[@class='wikipedia-search-button']")).click();
        List<WebElement> links = driver.findElements(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']//div/a"));
        System.out.println(links.size());

        for(WebElement alllinks:links){
            alllinks.click();
            System.out.println(alllinks.getText());
        }
        Set<String> windows2 = driver.getWindowHandles();
        for(String windid3:windows2){
             String titr = driver.switchTo().window(windid3).getTitle();
            System.out.println(titr);

            if(titr.equals("Selenium in biology - Wikipedia")|| titr.equals("Selenium - Wikipedia")){
                driver.close();
            }
        }

    }
}
