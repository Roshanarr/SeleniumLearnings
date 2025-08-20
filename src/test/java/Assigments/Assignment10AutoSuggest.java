package Assigments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Assignment10AutoSuggest {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.bjs.com/");
        driver.manage().window().maximize();
        Thread.sleep(6000);
        WebElement search = driver.findElement(By.xpath("//input[@placeholder='What are you looking for today?']"));
        search.click();
        search.sendKeys("eggs");

        List<WebElement> s = driver.findElements(By.xpath("//div[@class='col-6 col-md-4']//a"));
        System.out.println(s.size());
        for(WebElement sw:s){
            if(sw.getText().equals("brown eggs")){
                sw.click();
                break;
            }
        }
    }
}
