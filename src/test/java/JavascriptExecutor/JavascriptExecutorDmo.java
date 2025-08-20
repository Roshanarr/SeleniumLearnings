package JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
//using senKeys
public class JavascriptExecutorDmo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://testautomationpractice.blogspot.com/#");
        driver.manage().window().maximize();
        //input field using sendkeys
        WebElement inputbox=driver.findElement(By.xpath("//input[@id='name']"));
        //using JavascriptExecutor we will enter text
        //step1:create variable for Javascript executor
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('value','John')",inputbox);


    }
}
