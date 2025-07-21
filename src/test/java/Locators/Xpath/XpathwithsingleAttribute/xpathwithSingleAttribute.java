package Locators.Xpath.XpathwithsingleAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathwithSingleAttribute {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/");
        driver.manage().window().maximize();
        //xpath - //[@attribute="value"]
        //searchbox
        //xpath with single attribute
        driver.findElement(By.xpath("//input[@name='search']")).sendKeys("abc");
    }
}
