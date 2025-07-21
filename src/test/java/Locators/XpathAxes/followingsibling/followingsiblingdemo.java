package Locators.XpathAxes.followingsibling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class followingsiblingdemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        List<WebElement> folowingsibling = driver.findElements(By.xpath("//a[text()='Hindustan Unilever L']/ancestor::tr/following-sibling::tr"));
        System.out.println("The no of following  are" + folowingsibling.size());
    }
}
