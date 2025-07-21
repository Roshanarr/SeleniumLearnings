package Checkboxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
//selecting 1st , 3rd and 5th checkbox
public class checkboxcase7 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        List<WebElement> totalcount = driver.findElements
                (By.xpath("//input[@type='checkbox' and @class='form-check-input']"));
        System.out.println(totalcount.size());
        for (int i = 0; i < totalcount.size(); i++) {
            if (i == 1 || i == 3 || i == 6) {
                totalcount.get(i).click();
            }
        }
    }
}
