package Locators.Xpath.xpthwithinnertextandtextmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathwithinnertextdemo2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://carzonwheel.com/?utm_source=cs&utm_medium=display&utm_campaign=I_M_July");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        //to use xpath with inner text we have use text()
        //Syntax:   //tagname[text()='value of inner text']
        driver.findElement(By.xpath("//a[text()='Cars']")).click();

    }
}
