package MouseActions.DoubleClick;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class dblclickdemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement frame2 = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
        driver.switchTo().frame(frame2);
        WebElement box1=driver.findElement(By.xpath("//input[@id='field1']"));
        WebElement box2=driver.findElement(By.xpath("//input[@id='field2']"));
        WebElement btn4=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
        box1.clear();
        box1.sendKeys("Welcome");
        Actions act9=new Actions(driver);
        act9.doubleClick(btn4).perform();

        //Validation:box2 should same value as box1
        String text1 = box1.getAttribute("value");
        System.out.println("capture text from text1 is "+text1);
        String text2 = box2.getAttribute("value");
        System.out.println("capture text from text2 is "+text2);
        if(text2.equals(text1)){
            System.out.println("text copied successfully");
        }
        else{
            System.out.println("text not copied successfully");
        }






    }
}
