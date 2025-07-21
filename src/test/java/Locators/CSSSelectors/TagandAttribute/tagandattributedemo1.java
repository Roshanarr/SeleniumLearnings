package Locators.CSSSelectors.TagandAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagandattributedemo1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        //to launch the browser use get()
        driver.get("https://magento.softwaretestingboard.com/");
        //to maximize the window
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("a[title='Radiant Tee']")).click();
    }
}
