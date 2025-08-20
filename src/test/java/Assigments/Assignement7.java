package Assigments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Assignement7 {
    public static void main(String[] args) {
        //https://mypage.rediff.com/login/dologin
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://mypage.rediff.com/login/dologin");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
        driver.switchTo().alert().accept();
    }
}
