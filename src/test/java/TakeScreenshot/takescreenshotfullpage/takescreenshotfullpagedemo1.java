package TakeScreenshot.takescreenshotfullpage;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.Duration;

public class takescreenshotfullpagedemo1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        //full page
        TakesScreenshot ts= (TakesScreenshot) driver;
        File sourcefile = ts.getScreenshotAs(OutputType.FILE);
        File targetfile= new File(System.getProperty("user.dir")+"\\Screenshots\\fullpage.png");
        sourcefile.renameTo(targetfile);

    }
}
