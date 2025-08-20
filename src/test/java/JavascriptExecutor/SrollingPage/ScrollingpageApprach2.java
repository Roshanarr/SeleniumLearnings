package JavascriptExecutor.SrollingPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ScrollingpageApprach2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
       WebElement poll= driver.findElement(By.xpath("//strong[normalize-space()='Community poll']"));
        JavascriptExecutor js= (JavascriptExecutor) driver;
        //Appraoch2:Sroll till the element is visible
        js.executeScript("arguments[0].scrollIntoView();",poll);
        System.out.println(js.executeScript("return window.pageYOffset;"));
    }
}
