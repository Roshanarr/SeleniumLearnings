package TakeScreenshot.takescreenshotwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.Duration;

public class takescreenhotwebelementdemo1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        //full page
        WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
        File sourcefile2 = logo.getScreenshotAs(OutputType.FILE);
        File targetfile2= new File(System.getProperty("user.dir")+"\\Screenshots\\logo.png");
        sourcefile2.renameTo(targetfile2);
    }
}
