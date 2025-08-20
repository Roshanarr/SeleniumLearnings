package Dropdowns.Bootstrapdropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class sizeofdropdown {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://testautomationcentral.com/demo/multi_select_dropdown.html#google_vignette");
        driver.manage().window().maximize();
        //clickig on the button
        driver.findElement(By.xpath("//button[contains(@class,'form-input w-full')]")).click();
        //selecting all the  option
        List<WebElement> items = driver.findElements(By.xpath("//ul[@id='dropdown-menu']//label"));
        System.out.println("No of values in the dropdown is:"+items.size());

    }
}
