package Checkboxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Checkboxcase2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        //case2:adding conditions
        WebElement checkbox = driver.findElement(By.xpath("//input[@id='sunday']"));
        System.out.println("Before selected?"+checkbox.isSelected());
        checkbox.click();
        System.out.println("After selection?"+checkbox.isSelected());
    }
}
