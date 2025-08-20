package Assigments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Assignment13 {

    static void SelectDate1(WebDriver driver, String date){
        List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
        for(WebElement dt:dates){
            if(dt.getText().equals(date)){
                dt.click();
                break;
            }
        }
    }


    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name='SelectedDate']")).click();
       // driver.switchTo().frame(0);
        String year1 ="2026";
        String month1="Sep";
        //String date1="17";

        String date="17";
        WebElement mon = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select select2= new Select(mon);
        select2.selectByVisibleText("Oct");
      WebElement year=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select select1=new Select(year);
        select1.selectByVisibleText("2026");
        SelectDate1(driver,date);





    }
}
