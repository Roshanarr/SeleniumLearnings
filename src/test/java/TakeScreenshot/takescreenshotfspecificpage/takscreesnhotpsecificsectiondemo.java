package TakeScreenshot.takescreenshotfspecificpage;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.Duration;

public class takscreesnhotpsecificsectiondemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        //full page
        WebElement feature=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
        File sourcefile1 = feature.getScreenshotAs(OutputType.FILE);
        File targetfile1= new File(System.getProperty("user.dir")+"\\Screenshots\\featured.png");
        sourcefile1.renameTo(targetfile1);
    }
}
