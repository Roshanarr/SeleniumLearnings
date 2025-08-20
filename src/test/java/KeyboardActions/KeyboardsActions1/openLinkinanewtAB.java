package KeyboardActions.KeyboardsActions1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class openLinkinanewtAB {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://testautomationpractice.blogspot.com/#");
        driver.manage().window().maximize();
        WebElement reg = driver.findElement(By.xpath("//a[normalize-space()='Blog']"));
        Actions act8 = new Actions(driver);
        act8.keyDown(Keys.CONTROL).click(reg).keyUp(Keys.CONTROL).perform();
        //switching to registeration page
        List<String> ids=new ArrayList(driver.getWindowHandles());
        driver.switchTo().window(ids.get(1));
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium");
        driver.switchTo().window(ids.get(0));
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Pavan");
    }
}
