package KeyboardActions.Sliders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class slidersdemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
        driver.manage().window().maximize();
        Actions ac89= new Actions(driver);
        //min slider
        WebElement min_slider=driver.findElement(By.xpath("//div[@id='slider-range']//span[1]"));
        //This will get the complete location of x and y
        System.out.println("The location of the min slider before moving  is "+min_slider.getLocation());
        //to get only the location of X
        System.out.println("The location of the X  is "+min_slider.getLocation().getX());
        //to get only the location of Y
        System.out.println("The location of the Y  is "+min_slider.getLocation().getY());
        ac89.dragAndDropBy(min_slider,100,250).perform();
        System.out.println("The location of the min slider after moving  is "+min_slider.getLocation());
        //max_slider
        WebElement max_slider=driver.findElement(By.xpath("//div[@id='slider-range']//span[2]"));
        System.out.println("The location of the max slider before moving  is "+max_slider.getLocation());
        ac89.dragAndDropBy(max_slider,-100,250).perform();
        System.out.println("The location of the max slider after moving  is "+max_slider.getLocation());




    }
}
