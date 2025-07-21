package Assigments;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
https://testautomationpractice.blogspot.com/
checck for webdriver methods

 */
public class Assignemt5 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        //get methods
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        String title=driver.getTitle();
        System.out.println(title);
        String url=driver.getCurrentUrl();
        System.out.println(url);
         String page = driver.getPageSource();
        System.out.println(page);
        String handle = driver.getWindowHandle();
        System.out.println(handle);

        //conditional methods
        WebElement displayed = driver.findElement(By.xpath("//button[@name='start']"));
        System.out.println(displayed.isDisplayed());
        WebElement enabled = driver.findElement(By.xpath("//input[@id='phone']"));
        System.out.println(enabled.isEnabled());
        System.out.println("before selection");
        WebElement selected = driver.findElement(By.xpath("//input[@id='monday']"));
        System.out.println("before selection"+selected.isSelected());

        System.out.println("After selection");
        Thread.sleep(3000);
        selected.click();
        System.out.println("after  selection"+selected.isSelected());

        //browser methods
        //driver.close();
        driver.quit();



    }
}
