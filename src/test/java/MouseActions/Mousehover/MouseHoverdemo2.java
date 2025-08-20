package MouseActions.Mousehover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class MouseHoverdemo2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://testautomationpractice.blogspot.com/#");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement btn=driver.findElement(By.xpath("//button[normalize-space()='Point Me']"));
        Thread.sleep(3000);
        WebElement Lap=driver.findElement(By.xpath("//a[normalize-space()='Laptops']"));
        Actions act3= new Actions(driver);
        act3.moveToElement(btn).moveToElement(Lap).click().perform();
    }
}
