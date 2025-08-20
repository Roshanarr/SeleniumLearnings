package Webtables.Staticwebtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class printingbookname {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        //print book names whose author is mukesh
        int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
        int col = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
        for(int r=2;r<rows;r++){
            String author=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
            if(author.equals("Mukesh")){
                String authorname=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
                System.out.println(authorname);
            }
        }
    }
}
