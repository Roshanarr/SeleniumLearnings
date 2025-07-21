package Locators.Xpath.containsmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathwithcontainsmethoddemo1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://carzonwheel.com/?utm_source=cs&utm_medium=display&utm_campaign=I_M_July");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        //syntax://tagname[contains(@attribute,'attributevalue')]
        driver.findElement(By.xpath("//input[contains(@placeholder,'Dream Car')]")).sendKeys("Kia");
    }
}
