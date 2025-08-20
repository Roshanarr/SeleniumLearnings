package JavascriptExecutor.SrollingPage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ScrollingPageApproach1
{
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
        driver.manage().window().maximize();
        JavascriptExecutor js= (JavascriptExecutor) driver;
        //Appraoch1:Sroll down by pixel number
        js.executeScript("window.scrollBy(0,3000)","");
        System.out.println(js.executeScript("return window.pageYOffset;"));
    }

}
