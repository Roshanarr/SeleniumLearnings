package JavascriptExecutor.ZoominZoomout;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ZOOMZOomoutdemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        JavascriptExecutor js= (JavascriptExecutor) driver;
        //Appraoch4:zoominandzoomout
        js.executeScript("document.body.style.zoom='50%'");  // set zoom level 50%
        Thread.sleep(3000);

        js.executeScript("document.body.style.zoom='80%'");  // set zoom level 50%
        Thread.sleep(3000);



    }
}
