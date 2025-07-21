package Locators.Xpath.getText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathgettextdemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        //to use xpath with inner text we have use text()
        //Syntax:   //tagname[text()='value of inner text']
        //isdisplayed checks if the element is present ot not
        String  display = driver.findElement(By.xpath("//h3[text()='Featured']")).
                getText();
        System.out.println(display);
    }
}
