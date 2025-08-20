package KeyboardActions.Sliders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class slidersdemo1 {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver=new ChromeDriver();

        driver.get("https://www.globalsqa.com/demoSite/practice/slider/steps.html");
        driver.manage().window().maximize();

        Actions act=new Actions(driver);

        //Min slider
        WebElement slider= driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
        System.out.println("Defualt Location of the min slider :"+slider.getLocation()); //(58, 249)= (x,y)
        //Thread.sleep(3000);
        act.dragAndDropBy(slider, 450, 47).perform();

    }
}
