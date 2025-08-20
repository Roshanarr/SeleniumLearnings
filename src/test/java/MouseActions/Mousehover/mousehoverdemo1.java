package MouseActions.Mousehover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class mousehoverdemo1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        //Computers
        WebElement comp=driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']"));
        Thread.sleep(3000);
        WebElement note=driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Software']"));
        Actions act1= new Actions(driver);
        act1.moveToElement(comp).moveToElement(note).click().build().perform();

    }
}
