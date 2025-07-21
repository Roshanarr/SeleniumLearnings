package BasicSeleniumscript;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* Test case1:
1)Launch Chrome Browser
2)Open URL https://tutorialsninja.com/demo/
3)Validate title should be "Your store"
4)Close Browser

 */
public class FirstSeleniumScript {
    public static void main(String[] args) throws InterruptedException {

        //1)Launch Chrome Browser
        WebDriver driver = new ChromeDriver();

        //2)Open URL https://tutorialsninja.com/demo/
        //to launch the url in the browser we use a method get
        driver.get("https://tutorialsninja.com/demo/");

        //3)Validate title should be "Your store"
        String act_title=driver.getTitle();
        if(act_title.equals("Your Store")){
            System.out.println("Test case passed ");
        }
        else{
            System.out.println("Test case failed ");
        }

        //4)Close Browser
        driver.quit();

    }
}
