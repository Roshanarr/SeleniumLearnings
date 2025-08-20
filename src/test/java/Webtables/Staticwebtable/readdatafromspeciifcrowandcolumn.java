package Webtables.Staticwebtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class readdatafromspeciifcrowandcolumn {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        //read data from specific row and column
        WebElement data = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]"));
        System.out.println(data.getText());
    }
}
