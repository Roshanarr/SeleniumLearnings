package MouseActions.Mousehover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class mousehoverdemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://tutorialsninja.com/demo/");
        driver.manage().window().maximize();
        //desktop
        Thread.sleep(3000);
        WebElement desktop=driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
        Thread.sleep(3000);
        WebElement mac=driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
        //Action class
        //here we must pass driver as  argument for action class
        Actions act1= new Actions(driver);
        act1.moveToElement(desktop).moveToElement(mac).click().build().perform();

    }
}
