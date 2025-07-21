package Webdrivermethods.conditionalmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isdisplayeddemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/register");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        //isdisplayed()
        WebElement display = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
        System.out.println(display.isDisplayed());

    }
}
