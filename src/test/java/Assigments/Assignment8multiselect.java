package Assigments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
/*
https://testautomationpractice.blogspot.com/
	colors multi select box
 */
public class Assignment8multiselect {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        List<WebElement> multi = driver.findElements(By.xpath("//select[@id='colors']/option"));
        for(WebElement multiselect:multi){
            if(multiselect.getText().equals("Blue")||multiselect.getText().equals("Green")){
                multiselect.click();
            }
        }


    }
}
