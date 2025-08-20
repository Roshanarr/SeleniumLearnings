package JavascriptExecutor.FileUpload.MultipleFileUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class multifileuploaddemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
        driver.manage().window().maximize();
        String file1="D:\\test1.txt";
        String file2="D:\\test2.txt";
        driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);
       int nofoFiles= driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
       //validaton1-no of files
       if(nofoFiles==2){
           System.out.println("All files uplaoded");
       }
       else{
           System.out.println("files missing");
       }
       //validation2
        if(driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("test1.txt")
                && ((driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("test2.txt")))){
            System.out.println("Files matching");
        }
        else{
            System.out.println("files not matching");
        }
    }
}
