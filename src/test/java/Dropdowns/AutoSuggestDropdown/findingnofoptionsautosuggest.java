package Dropdowns.AutoSuggestDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class findingnofoptionsautosuggest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        //xpath for searchbox
        driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Selenium");
        List<WebElement> sele = driver.findElements(By.xpath("//ul[@role='listbox']//li//span"));
        System.out.println(sele.size());
        Thread.sleep(5000);
        for(WebElement abc:sele){
            if(abc.getText().equals("selenium")){
                abc.click();
                break;
            }
        }
    }
}
