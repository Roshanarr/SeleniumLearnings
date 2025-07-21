package Webdrivermethods.getmethods;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class getmethodsdemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        //get(url)-opens the URL on the browser
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        //getTitle()-returns the title of the webpage
        String title=driver.getTitle();
        System.out.println(title);
        //getCurrentUrl()-Returns the url of the webpage
        String url = driver.getCurrentUrl();
        System.out.println(url);
        //getPageSource()->returns source code of the webpage
        String source = driver.getPageSource();
        //System.out.println(source);

        //getWindowHandle()->returns Id of single browser window
        String window = driver.getWindowHandle();
        System.out.println(window);
        Thread.sleep(3000);
        //getWindowHndles()-returns IDs of multiple Browser windows
        driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
        Thread.sleep(3000);
        Set<String> windows = driver.getWindowHandles();
        System.out.println(windows);

    }
}
