package HeadlessTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class HeadlessTestingdemo {
    public static void main(String[] args) {
        ChromeOptions options= new ChromeOptions();
        options.addArguments("--headless=new");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        String title1= driver.getTitle();
        System.out.println(title1);
        if(title1.equals("GreenKart - veg and fruits kart")){
            System.out.println("Test case passed");
        }
        else{
            System.out.println("test case fail");
        }
        //driver.quit();

    }
}
