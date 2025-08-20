package Webtables.Staticwebtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class findingnoofrowsstatic {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        //finding total no of rows
        //Approach1:
        List<WebElement> rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
        System.out.println("The no of rows in a table are "+rows.size());


    }
}
