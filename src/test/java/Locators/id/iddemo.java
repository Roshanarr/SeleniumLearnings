package Locators.id;
//id
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iddemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/");
       boolean displayed= driver.findElement(By.id("logo")).isDisplayed();
        System.out.println(displayed);

    }



}
