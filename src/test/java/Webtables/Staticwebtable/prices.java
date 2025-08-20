package Webtables.Staticwebtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class prices {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
        int col = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
        int sum=0;
        for(int r=2;r<rows;r++){
            String priced1 = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[4]")).getText();
            sum=sum+Integer.parseInt(priced1);
        }
        System.out.println("The total is "+sum);
    }
}
