package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ParametersXml {

    WebDriver driver;
    WebElement element;
    //String sUrl="http://tutorialsninja.com/demo/index.php?route=account/register";

    @Test
    @Parameters({"username","lastname","email","phone","pass","confirm","sUrl"})
    public void ParametreGir(String username,String lastname,String email,String phone,String pass,String confirm,String sUrl) throws InterruptedException {
        System.out.println("Sayfa Açılıyor.");

        //System.setProperty("webdriver.chrome.driver", "C:/Users/FATMA/Selenium/ChromeDriver/chromedriver.exe");
        System.setProperty("webdriver.edge.driver", "C:/Users/FATMA/Selenium/MsedgeDriver/msedgedriver.exe");
      //  System.out.println("The thread ID for Chrome is " + Thread.currentThread().getId());
        driver = new EdgeDriver();
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(sUrl);
        Thread.sleep(50);

        driver.findElement(By.cssSelector("#input-firstname")).sendKeys(username);
        driver.findElement(By.cssSelector("#input-lastname")).sendKeys(lastname);
        driver.findElement(By.cssSelector("#input-email")).sendKeys(email);
        driver.findElement(By.cssSelector("#input-telephone")).sendKeys(phone);
        driver.findElement(By.cssSelector("#input-password")).sendKeys(pass);
        driver.findElement(By.cssSelector("#input-confirm")).sendKeys(confirm);
        Thread.sleep(50);
    }
}
