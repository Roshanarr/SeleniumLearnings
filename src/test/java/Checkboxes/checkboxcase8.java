package Checkboxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class checkboxcase8 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        List<WebElement> totalcount = driver.findElements
                (By.xpath("//input[@type='checkbox' and @class='form-check-input']"));
        System.out.println(totalcount.size());
        for(int i=0;i<3;i++) {
            totalcount.get(i).click();
        }
        for (WebElement checkbox:totalcount){
             checkbox.click();
        }
    }
}
