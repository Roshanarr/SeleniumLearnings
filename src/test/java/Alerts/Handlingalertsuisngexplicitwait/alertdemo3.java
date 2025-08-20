package Alerts.Handlingalertsuisngexplicitwait;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class alertdemo3 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        //explict wait declration
        WebDriverWait mywait= new WebDriverWait(driver,Duration.ofSeconds(10));

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
        //normal alert with ok button
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        Alert alt = mywait.until(ExpectedConditions.alertIsPresent());
        alt.accept();
    }
}
