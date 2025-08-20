package MouseActions.DragandDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class draganddropdemo2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://demo.guru99.com/test/drag_drop.html");
        driver.manage().window().maximize();
       WebElement bank= driver.findElement(By.xpath("//li[@id='credit2']"));
       WebElement destination=driver.findElement(By.xpath("//ol[@id='bank']"));
       Actions act78= new Actions(driver);
       act78.dragAndDrop(bank,destination).perform();
       WebElement balance=driver.findElement(By.xpath("//div[@id='products']//li[4]"));
       WebElement amount=driver.findElement(By.xpath("//ol[@id='amt7']"));
       act78.dragAndDrop(balance,amount).perform();
       WebElement sales=driver.findElement(By.xpath("//div[@id='products']//li[6]"));
       WebElement loam=driver.findElement(By.xpath("//ol[@id='loan']"));
       act78.dragAndDrop(sales,loam).perform();
       WebElement sales1=driver.findElement(By.xpath("//div[@id='products']//li[2]"));
       WebElement  loan1=driver.findElement(By.xpath("//ol[@id='amt8']"));
       act78.dragAndDrop(sales1,loan1).perform();
        String per = driver.findElement(By.xpath("//a[normalize-space()='Perfect!']")).getText();
        System.out.println(per);
    }
}
