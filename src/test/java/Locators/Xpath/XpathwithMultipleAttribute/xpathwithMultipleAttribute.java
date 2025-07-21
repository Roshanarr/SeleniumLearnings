package Locators.Xpath.XpathwithMultipleAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathwithMultipleAttribute {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/");
        driver.manage().window().maximize();
        //xpath with multiple attribute - //tagname[@attribute="value"][@attribute="value"]
        driver.findElement(By.xpath("//img[@alt='MacBook'][@title='MacBook']")).click();
    }
}
