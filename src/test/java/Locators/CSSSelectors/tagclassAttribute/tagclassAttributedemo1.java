package Locators.CSSSelectors.tagclassAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagclassAttributedemo1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        //to launch the browser use get()
        driver.get("https://demoblaze.com/index.html");
        //to maximize the window
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("a.hrefch[href='prod.html?idp_=7']")).click();
    }

}
