package Locators.CSSSelectors.tagclassAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagclassAttributedemo2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        //to launch the browser use get()
        driver.get("https://tutorialsninja.com/demo/");
        //to maximize the window
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("a.dropdown-toggle[title='My Account']")).click();
    }

}
