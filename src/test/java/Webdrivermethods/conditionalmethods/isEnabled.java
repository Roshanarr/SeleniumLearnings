package Webdrivermethods.conditionalmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabled {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/register");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        //isEnabled
        WebElement enable = driver.findElement(By.xpath("//input[@id='LastName']"));
        System.out.println(enable.isEnabled());
    }
}
