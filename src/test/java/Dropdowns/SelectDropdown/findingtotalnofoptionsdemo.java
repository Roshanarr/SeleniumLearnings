package Dropdowns.SelectDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class findingtotalnofoptionsdemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        WebElement country = driver.findElement(By.xpath("//select[@id='country']"));
        Select drp = new Select(country);
        //capture the options from the dropdown
        List<WebElement> option = drp.getOptions();
        System.out.println(option.size());
        

    }
}
