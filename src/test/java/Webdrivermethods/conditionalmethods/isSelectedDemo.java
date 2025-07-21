package Webdrivermethods.conditionalmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelectedDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/register");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        System.out.println("Before selection.....");
        //male
        WebElement male = driver.findElement(By.xpath("//input[@value='M']"));
        System.out.println("before selection:"+male.isSelected());

        WebElement female = driver.findElement(By.xpath("//input[@value='F']"));
        System.out.println("before selection:"+female.isSelected());
        Thread.sleep(3000);

        System.out.println("After selection");
        //male.click();
        female.click();
        //System.out.println("After  selection:"+male.isSelected());
        System.out.println("After  selection:"+female.isSelected());

    }
}
