package Assigments;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/*
Open Application "https://demoblaze.com/index.html"
find total number of links and print them
 */
public class Assignment2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoblaze.com/index.html");
        driver.manage().window().maximize();
        //to find the total no of links
        List<WebElement> links1 = driver.findElements(By.tagName("a"));
        System.out.println("Total no of links are"+links1.size());

    }
}
