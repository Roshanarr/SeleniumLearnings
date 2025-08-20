package Assigments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

/*
Handle country dropdown with  using Select class:
       https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/
			a) count total number of options
			b) print all the options
		       c) select one option

 */
public class Assignment8usingselectclass {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
        driver.manage().window().maximize();
        WebElement con = driver.findElement(By.xpath("//select[@id='country-list']"));
        Select mycon= new Select(con);
        //mycon.selectByVisibleText("India");
        List<WebElement> mycon1 = driver.findElements(By.xpath("//select[@id='country-list']/option"));
        System.out.println(mycon1.size());
        //printing all the options
        for(WebElement mycon2:mycon1){
            System.out.println(mycon2.getText());
        }
    }
}
