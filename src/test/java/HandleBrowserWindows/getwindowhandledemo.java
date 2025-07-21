package HandleBrowserWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class getwindowhandledemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
        Set<String> windowID = driver.getWindowHandles();

        //Approach1:converting set collection to list collection
        List<String> windowList= new ArrayList(windowID);
        String parentId = windowList.get(0);
        String childID = windowList.get(1);

        //to switch to child window
        driver.switchTo().window(childID);
        System.out.println(driver.getTitle());

        //switch to parent window
        driver.switchTo().window(parentId);
        System.out.println(driver.getTitle());
        
    }
}
