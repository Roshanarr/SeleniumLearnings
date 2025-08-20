package HandleSSL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class handleSSLdemo {
    public static void main(String[] args) {
        ChromeOptions option1=new ChromeOptions();
        option1.setAcceptInsecureCerts(true);
        WebDriver driver = new ChromeDriver(option1);
        driver.get("https://expired.badssl.com/");
        System.out.println("Title of the page"+driver.getTitle());
    }
}
