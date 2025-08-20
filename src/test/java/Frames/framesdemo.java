package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class framesdemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://ui.vision/demo/webtest/frames/");
        driver.manage().window().maximize();
        //frame1
        WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
        driver.switchTo().frame(frame1);
        driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("welcome");

        //frame2
        //WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
        //driver.switchTo().frame(frame2);
        //driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Automation");
    }
}
