package Webtables.Staticwebtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class readdatafromallrowsandcolumns {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        //reading data from all rows and columns
        int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
        int col = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
        for (int r = 2; r <= rows; r++) {
            for (int c = 1; c <= col; c++) {
                WebElement data = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]"));
                System.out.println(data.getText());
            }
        }
    }
}
