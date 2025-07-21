package Locators.XpathAxes.ancestor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ancestordemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        String ancestors = driver.findElement(By.xpath("//a[text()='Hindustan Unilever L']/ancestor::tr")).getText();
        System.out.println(ancestors);
    }
}
