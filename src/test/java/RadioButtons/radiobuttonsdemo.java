package RadioButtons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class radiobuttonsdemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        WebElement male = driver.findElement(By.xpath("//input[@id='male']"));
        WebElement female = driver.findElement(By.xpath("//input[@id='female']"));
        System.out.println("IS Selected"+ male.isSelected());
        System.out.println("IS Selected"+ female.isSelected());
        male.click();
        System.out.println("IS Selected"+ male.isSelected());


    }
}
