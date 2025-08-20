package MouseActions.DragandDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Draganddropdemo1 {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://testautomationpractice.blogspot.com/#");
        driver.manage().window().maximize();
       WebElement source=driver.findElement(By.xpath("//div[@id='draggable']"));
       WebElement destination=driver.findElement(By.xpath("//div[@id='droppable']"));
       Actions act7= new Actions(driver);
        act7.dragAndDrop(source,destination).perform();
    }
}
