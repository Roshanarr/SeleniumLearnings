package Locators.tagname;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

//to capture all the images
public class tagnamedemo2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/");
        driver.manage().window().maximize();
        List<WebElement> im = driver.findElements(By.tagName("img"));
        System.out.println("The total number ofimages are "+im.size());
    }
}
