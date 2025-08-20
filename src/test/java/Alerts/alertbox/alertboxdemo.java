package Alerts.alertbox;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class alertboxdemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
        //normal alert with ok button
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        Alert myalert = driver.switchTo().alert();
        myalert.accept();
        //if you want to write in a single lne
        //driver.switchTo().alert().accept();
    }
}
