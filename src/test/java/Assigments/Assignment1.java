package Assigments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
1)Launch Browser(Chrome)
2)Open URL:https://demo.nopcommerce.com/
3)Validate title should be "nopCommerce demo store"
4)close page
 */
public class Assignment1 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        String title1= driver.getTitle();
        System.out.println(title1);
        if(title1.equals("nopCommerce demo store. Home page title")){
            System.out.println("Test case passed");
        }
        else{
            System.out.println("test case fail");
        }
        //driver.quit();
    }
}
