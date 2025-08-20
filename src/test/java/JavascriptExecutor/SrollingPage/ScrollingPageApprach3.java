package JavascriptExecutor.SrollingPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ScrollingPageApprach3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        JavascriptExecutor js= (JavascriptExecutor) driver;
        //Appraoch2:Sroll till the end of thepage
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        System.out.println(js.executeScript("return window.pageYOffset;"));
        Thread.sleep(3000);
        //to go abck to top of page
        js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");

    }
}
