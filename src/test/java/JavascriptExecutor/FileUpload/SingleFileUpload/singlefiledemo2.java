package JavascriptExecutor.FileUpload.SingleFileUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class singlefiledemo2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='singleFileInput']")).sendKeys("D:\\test1.txt");
        driver.findElement(By.xpath("//button[normalize-space()='Upload Single File']")).click();



    }
}
