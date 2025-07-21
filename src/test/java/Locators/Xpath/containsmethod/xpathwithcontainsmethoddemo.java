package Locators.Xpath.containsmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathwithcontainsmethoddemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        //syntax://tagname[contains(@attribute,'attributevalue')]
        driver.findElement(By.xpath("//input[contains(@name,'search')]")).sendKeys("abc");
    }
}
