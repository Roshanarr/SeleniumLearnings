package Datepicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class usingdatepickertoselectpreviousdatemonyear {
    //select mon and year
    static void selectMonandYear(WebDriver driver, String month, String year) {
        while (true) {
            String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            String Curremtyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

            if (currentMonth.equals(month) && Curremtyear.equals(year)) {
                break;
            }
            //to click on previous arrow
            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
        }

    }

    static void SelectDate(WebDriver driver, String date) {
        List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
        for (WebElement dt : dates) {
            if (dt.getText().equals(date)) {
                dt.click();
                break;
            }
        }
    }

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();
        driver.switchTo().frame(0);
        //Method 2:using datepicker
        //expected data
        String year = "2023";
        String month = "May";
        String date = "10";

        //this will open the date picker
        driver.findElement(By.xpath("//input[@id='datepicker']")).click();

        //select mon and year
        selectMonandYear(driver, month, year);
        SelectDate(driver, date);
    }
}
