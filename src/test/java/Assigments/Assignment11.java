package Assigments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class Assignment11 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://blazedemo.com/");
        driver.manage().window().maximize();
        //arrival
        WebElement drop = driver.findElement(By.xpath("//select[@name='fromPort']"));
        Select myselect = new Select(drop);
        myselect.selectByVisibleText("Boston");
        //departure
        WebElement depart = driver.findElement(By.xpath("//select[@name='toPort']"));
        Select myselect1 = new Select(depart);
        myselect1.selectByVisibleText("Rome");
        //button
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        //finding prices
        int rows1 = driver.findElements(By.xpath("//table[@class='table']//tbody//tr")).size();
        //System.out.println(rows1);
        //printing all the prices
        String pricesArr[]=new String[rows1];   //0-4

        for(int r=1;r<=rows1;r++)
        {
            String price=driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+r+"]/td[6]")).getText();
            pricesArr[r-1]=price; //adding price into array
        }

        //7- Sort prices then find lower price value

        for(String arrvalue:pricesArr)
        {
            System.out.println(arrvalue);
        }

        Arrays.sort(pricesArr); // this will able to sort strings. so no need to convert to number
        String lowestPrice=pricesArr[0];
        System.out.println("Lower price:"+lowestPrice);

        for(int r=1;r<=rows1;r++)
        {
            String price=driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+r+"]/td[6]")).getText();

            if(price.equals(lowestPrice))
            {
                driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+r+"]/td[1]//input")).click();
                break;
            }

        }

        //9 - Fill the details then click on Purchase Flight button

        driver.findElement(By.id("inputName")).sendKeys("John");
        driver.findElement(By.id("address")).sendKeys("1403 American Beauty Ln");
        driver.findElement(By.id("city")).sendKeys("Columbus");
        driver.findElement(By.id("state")).sendKeys("OH");
        driver.findElement(By.id("zipCode")).sendKeys("43240");
        driver.findElement(By.id("creditCardNumber")).sendKeys("6789067345231267");
        driver.findElement(By.id("creditCardYear")).clear();
        driver.findElement(By.id("creditCardYear")).sendKeys("2023");
        driver.findElement(By.id("nameOnCard")).sendKeys("John Canedy");
        driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();

        //10 - validation
        String msg=driver.findElement(By.xpath("//h1")).getText();

        if(msg.contains("Thank you for your purchase"))
        {
            System.out.println("Success !! Passed");
        }
        else
        {
            System.out.println("Failed");
        }

        driver.quit();

    }

}
