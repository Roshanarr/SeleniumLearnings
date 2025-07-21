package Locators.CSSSelectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselectorscombodemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        //tagand id
        // driver.findElement(By.cssSelector("div#logo")).click();

        //tagandclassname
        //driver.findElement(By.cssSelector(" input.input-lg")).sendKeys("iphone");

        //tagclass Attribute
        //driver.findElement(By.cssSelector("a.dropdown-toggle[title='My Account']")).click();

        //tagAtribute
        driver.findElement(By.cssSelector("img[title='MacBook']")).click();




    }
}
