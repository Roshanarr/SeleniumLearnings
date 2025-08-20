package Alerts.confirmbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class confirmboxdemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
        //confirm box with ok and cancel
        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
        //if you want to click on okay button  then use accept
        //driver.switchTo().alert().accept();
        //if you want to click on cancel button  then use dismiss
        driver.switchTo().alert().dismiss();
    }
}
