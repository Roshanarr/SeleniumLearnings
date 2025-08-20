package Assigments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

/*Handle country dropdown with  using Select class:
https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/
a) count total number of options
b) print all the options
c) select one option

 */
public class Assignment9withoutusingselectlcass {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
        driver.manage().window().maximize();
        //driver.findElement(By.id("country-list")).click();
        List<WebElement> country=driver.findElements(By.xpath("//select[@id='country-list']//option"));
        System.out.println(country.size());
    }
}
