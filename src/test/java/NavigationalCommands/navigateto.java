package NavigationalCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class navigateto {
    public static void main(String[] args) throws MalformedURLException {
        WebDriver driver = new ChromeDriver();
        //type 1 get() we can only pass in string format
        //driver.get("https://demo.nopcommerce.com/");
        //type2:driver.navigate.to()- we can also pass in staring format
        //driver.navigate().to("https://demo.nopcommerce.com/");
        //type3:driver.navigate().to()-passing in URL object
        URL myurl= new URL("https://demo.nopcommerce.com/");
        driver.navigate().to(myurl);
        driver.manage().window().maximize();
    }
}
