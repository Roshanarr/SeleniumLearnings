package Locators.name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class namedemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        //to pass the URL we must use get()
        driver.get("https://tutorialsninja.com/demo/");
        //to maximize the windows we must use the below
        driver.manage().window().maximize();
        //to use the name locator we must use and to send text we must use sendKeys
        driver.findElement(By.name("search")).sendKeys("Mac");
    }
}
