package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class dataProvider {

    WebDriver driver;
    String sUrl="http://tutorialsninja.com/demo/index.php?route=account/login";

    @DataProvider
    public Object[][] getData(){
        Object[][] obje = new Object[3][2];

        obje[0][0]="emailBir";
        obje[0][1]="passBir";

        obje[1][0]="emailİki";
        obje[1][1]="passİki";

        obje[2][0]="emailUc";
        obje[2][1]="passUc";

        return obje;
    }

    @Test(dataProvider="getData")
    public void SetData(String username,String password) throws InterruptedException {

        System.setProperty("webdriver.edge.driver", "C:/Users/FATMA/Selenium/MsedgeDriver/msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(sUrl);
        Thread.sleep(50);

        driver.findElement(By.cssSelector("#input-email")).sendKeys(username);
        driver.findElement(By.cssSelector("#input-password")).sendKeys(password);

    }
    @AfterMethod
    public void CloseDriver(){
        driver.quit();
    }

}
