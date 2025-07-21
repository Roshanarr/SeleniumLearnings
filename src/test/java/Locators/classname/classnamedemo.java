package Locators.classname;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class classnamedemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/");
        driver.manage().window().maximize();
        //classname
        //we have to use findElements using list of webelements
        List<WebElement> header_links = driver.findElements(By.className("dropdown"));
        System.out.println(header_links.size());

    }
}
