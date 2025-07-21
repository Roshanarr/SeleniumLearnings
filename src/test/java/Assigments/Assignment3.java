package Assigments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/*
Open Application "https://demoblaze.com/index.html"
find total number of images and print them
 */
public class Assignment3 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoblaze.com/index.html");
        driver.manage().window().maximize();
        List<WebElement> img6 = driver.findElements(By.tagName("img"));
        System.out.println("Total number of images are "+img6.size());
    }
}
