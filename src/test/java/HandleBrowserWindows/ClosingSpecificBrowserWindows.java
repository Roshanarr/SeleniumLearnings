package HandleBrowserWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class ClosingSpecificBrowserWindows {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
        Set<String> windowID = driver.getWindowHandles();

        for(String winid:windowID){
            String title=driver.switchTo().window(winid).getTitle();
            System.out.println(title);

            if(title.equals("OrangeHRM") || title.equals("Human Resources Management Software | OrangeHRM HR Software"))
            {
                driver.close();
            }


        }
    }
}
