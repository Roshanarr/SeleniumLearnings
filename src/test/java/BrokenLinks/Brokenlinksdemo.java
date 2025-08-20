package BrokenLinks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;

public class Brokenlinksdemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("http://www.deadlinkcity.com/");
        driver.manage().window().maximize();
        List<WebElement> links = driver.findElements(By.tagName("a"));
        int noOfBrokenLinks=0;
        for (WebElement linkelement : links) {
            String hrefattvalue = linkelement.getAttribute("href");
            if (hrefattvalue == null || hrefattvalue.isEmpty()) {
                System.out.println("href attribute is empty ");
                continue;

            }
            //2.hit the URL
            try {
                URL myurl = new URL(hrefattvalue);
                HttpURLConnection connURL = (HttpURLConnection) myurl.openConnection();
                //conenct to the server and send the request
                connURL.connect();

                //to extarct the sttaus code
                if (connURL.getResponseCode() >= 0) {
                    System.out.println(hrefattvalue + "===>Broken link");
                    noOfBrokenLinks++;
                } else {
                    System.out.println(hrefattvalue + "====>Not a broken link");
                }
            } catch (Exception e) {

            }


        }
        System.out.println("no of broken link "+noOfBrokenLinks);
    }
}
