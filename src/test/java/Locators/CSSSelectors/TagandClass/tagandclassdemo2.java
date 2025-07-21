package Locators.CSSSelectors.TagandClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagandclassdemo2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        //to launch the browser use get()
        driver.get("https://carzonwheel.com/?utm_source=cs&utm_medium=display&utm_campaign=I_M_July");
        //to maximize the window
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("input.text-sm")).sendKeys("creta");
    }
}
