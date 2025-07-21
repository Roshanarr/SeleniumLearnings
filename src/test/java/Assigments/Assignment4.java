package Assigments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
Open Application "https://demoblaze.com/index.html"
click any product link using link text
 */
public class Assignment4 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoblaze.com/index.html");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Nokia lumia 1520")).click();
        Thread.sleep(3000);
    }
}
