package Locators.CSSSelectors.TagandID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagandIdDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        //to launch the browser use get()
        driver.get("https://demo.nopcommerce.com/");
        //to maximize the window
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");
    }
}
