package KeyboardActions.KeyboardsActions1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class keyboardsactions1demo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://text-compare.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("Welcome to Selenium");
        Actions acy= new Actions(driver);
        //ctrl+A
        acy.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
        //control C
        acy.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
        //tab
        acy.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
        //Ctrl V
        acy.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
        driver.findElement(By.xpath("//button[@id='compareButton']")).click();

    }
}
