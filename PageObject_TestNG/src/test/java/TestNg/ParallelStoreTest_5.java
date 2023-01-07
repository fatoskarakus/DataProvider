package TestNg;

import com.beust.jcommander.Parameter;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ParallelStoreTest_5 {

    WebDriver driver;
    WebDriver driverTwo;
    WebDriverWait wait;
    JavascriptExecutor js;
    String url = "http://automationpractice.com/index.php";

     @Parameters({"browser"})
    @Test
    public void SetUpEdge(String browser) throws InterruptedException {
        System.out.println("Sayfa Açılıyor.");
        System.setProperty("webdriver.edge.driver", "C:/Users/FATMA/Selenium/MsedgeDriver/msedgedriver.exe");
        System.out.println("The thread ID for Edge is " + Thread.currentThread().getId());
        driver = new EdgeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(url);
        Thread.sleep(50);


        Actions action = new Actions(driver);

        List<WebElement> menuBars = driver.findElements(By.cssSelector(".sf-menu>li"));
        action.moveToElement(menuBars.get(0)).perform();

        WebElement casualDrese = driver.findElement(By.xpath("(//a[@title='Casual Dresses'])[1]"));
        wait.until(ExpectedConditions.visibilityOf(casualDrese));
        casualDrese.click();


        driver.findElement(By.xpath("(//i[@class='icon-th-list'])")).click();
        Thread.sleep(1000);

        //a[@class='button lnk_view btn btn-default']
        driver.findElement(By.xpath("//a[@class='button lnk_view btn btn-default']")).click();
        ///////////////////////////////

        js = (JavascriptExecutor) driver;
        js.executeScript("javascript:window.scrollBy(0,350)");
        Thread.sleep(1000);


        List<WebElement> image = driver.findElements(By.cssSelector("#thumbs_list_frame>li"));

        for (int i = 0; i < image.size(); i++) {
            action.moveToElement(image.get(i)).perform();
            Thread.sleep(1000);
        }

        driver.findElement(By.cssSelector("#wishlist_button")).click();
        Thread.sleep(5000);
        WebElement messages = driver.findElement(By.cssSelector(".fancybox-error"));
        wait.until(ExpectedConditions.visibilityOf(messages));
        Assert.assertEquals(messages.getText(), "You must be logged in to manage your wishlist.");
        driver.quit();
    }
    @Parameters({"browser"})
    @Test
    public void SetUpChrome(String browser) throws InterruptedException {
        System.out.println("Sayfa Açılıyor.");

            System.setProperty("webdriver.chrome.driver", "C:/Users/FATMA/Selenium/ChromeDriver/chromedriver.exe");
            System.out.println("The thread ID for Chrome is " + Thread.currentThread().getId());
            driverTwo = new ChromeDriver();

        wait = new WebDriverWait(driverTwo, Duration.ofSeconds(20));
        driverTwo.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driverTwo.manage().window().maximize();
        driverTwo.get(url);
        wait = new WebDriverWait(driverTwo, Duration.ofSeconds(20));
        Thread.sleep(50);


        Actions action = new Actions(driverTwo);
        driverTwo.navigate().refresh();
        List<WebElement> menuBars = driverTwo.findElements(By.cssSelector(".sf-menu>li"));
        action.moveToElement(menuBars.get(0)).perform();

        WebElement casualDreses = driverTwo.findElement(By.xpath("(//a[@title='Casual Dresses'])[1]"));
        wait.until(ExpectedConditions.visibilityOf(casualDreses));
        casualDreses.click();


        driverTwo.findElement(By.xpath("(//i[@class='icon-th-list'])")).click();
        Thread.sleep(1000);

        //a[@class='button lnk_view btn btn-default']
        driverTwo.findElement(By.xpath("//a[@class='button lnk_view btn btn-default']")).click();
        ///////////////////////////////

        js = (JavascriptExecutor) driverTwo;
        js.executeScript("javascript:window.scrollBy(0,350)");
        Thread.sleep(1000);


        List<WebElement> images = driverTwo.findElements(By.cssSelector("#thumbs_list_frame>li"));

        for (int i = 0; i < images.size(); i++) {
            action.moveToElement(images.get(i)).perform();
            Thread.sleep(1000);
        }

        driverTwo.findElement(By.cssSelector("#wishlist_button")).click();
        Thread.sleep(5000);
        WebElement message = driverTwo.findElement(By.cssSelector(".fancybox-error"));
        wait.until(ExpectedConditions.visibilityOf(message));
        Assert.assertEquals(message.getText(), "You must be logged in to manage your wishlist.");
        driverTwo.quit();
    }

//    @Test
//    public void WalkingOnThePage() throws InterruptedException {
//
//        Actions action = new Actions(driver);
//        List<WebElement> menuBar = driver.findElements(By.cssSelector(".sf-menu>li"));
//        action.moveToElement(menuBar.get(0)).perform();
//
//        WebElement casualDreses = driver.findElement(By.xpath("(//a[@title='Casual Dresses'])[1]"));
//        wait.until(ExpectedConditions.visibilityOf(casualDreses));
//        casualDreses.click();
//
//        driver.findElement(By.xpath("(//i[@class='icon-th-list'])")).click();
//        Thread.sleep(1000);
//
//        //a[@class='button lnk_view btn btn-default']
//        driver.findElement(By.xpath("//a[@class='button lnk_view btn btn-default']")).click();
//       ///////////////////////////////
//
//        js = (JavascriptExecutor) driver;
//        js.executeScript("javascript:window.scrollBy(0,350)");
//        Thread.sleep(1000);
//
//
//        List<WebElement> images = driver.findElements(By.cssSelector("#thumbs_list_frame>li"));
//
//        for (int i = 0; i < images.size(); i++) {
//            action.moveToElement(images.get(i)).perform();
//            Thread.sleep(1000);
//        }
//
//        driver.findElement(By.cssSelector("#wishlist_button")).click();
//        Thread.sleep(5000);
//        WebElement message = driver.findElement(By.cssSelector(".fancybox-error"));
//        wait.until(ExpectedConditions.visibilityOf(message));
//        Assert.assertEquals(message.getText(),"You must be logged in to manage your wishlist.");
//    }

//    @Test(enabled = false)
//    public void CallMethod() throws InterruptedException {
//        String bro="chrome";
//        SetUp(bro);
//    }
//
//    @AfterClass
//    public void CloseDriver() {
//        System.out.println("The thread ID for Chrome is " + Thread.currentThread().getId());
//        driver.quit();
//    }

}
