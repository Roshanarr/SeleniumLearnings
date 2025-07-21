package Checkboxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
//selecy last 3 checkboxes
public class checkboxcase5 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        List<WebElement> totalcount = driver.findElements
                (By.xpath("//input[@type='checkbox' and @class='form-check-input']"));
        System.out.println(totalcount.size());
        for(int i=4;i<totalcount.size();i++){
            totalcount.get(i).click();

        }
    }
}
