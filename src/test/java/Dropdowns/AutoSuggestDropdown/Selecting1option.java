package Dropdowns.AutoSuggestDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Selecting1option {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        //xpath for searchbox
        driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Selenium");



    }
}
