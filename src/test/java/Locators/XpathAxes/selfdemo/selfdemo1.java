package Locators.XpathAxes.selfdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selfdemo1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        //self node
       String text= driver.findElement(By.xpath("//a[text()='Hindustan Unilever L']/self::a")).getText();
        System.out.println(text);
    }
}
