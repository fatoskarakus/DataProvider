package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Listeners(Utility.Listeners.class)
public class ParalelStoreDriver {
    WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor js;
    String url = "http://automationpractice.com/index.php";

    @Test
    @Parameters({"browser"})
    public void SetUpDrivers(@Optional("")String browser) throws InterruptedException {
        System.out.println("Sayfa Açılıyor.");

        if(browser.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", "C:/Users/FATMA/Selenium/ChromeDriver/chromedriver.exe");
            System.out.println("The thread ID for Chrome is " + Thread.currentThread().getId());
            driver = new ChromeDriver();
        }
        else if (browser.equals("edge")) {
            System.setProperty("webdriver.edge.driver", "C:/Users/FATMA/Selenium/MsedgeDriver/msedgedriver.exe");
            System.out.println("The thread ID for Edge is " + Thread.currentThread().getId());
            driver = new EdgeDriver();
        }

        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(url);
        Thread.sleep(50);



        Actions action = new Actions(driver);
        driver.navigate().refresh();
        List<WebElement> menuBars = driver.findElements(By.cssSelector(".sf-menu>li"));
        action.moveToElement(menuBars.get(0)).perform();



    }

}
