package Webdrivermethods.browsermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class closedemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        //get(url)-opens the URL on the browser
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        //getWindowHndles()-returns IDs of multiple Browser windows
        driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
        driver.quit();
    }
}
