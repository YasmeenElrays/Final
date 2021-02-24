package DriverBase;

import java.util.concurrent.TimeUnit;

import Pages.PageBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Base  {
    public static WebDriver driver;

    @BeforeClass
    public static void setupclass(){
        WebDriverManager.chromedriver().setup();
    }
    @BeforeSuite

    public void StartDriver() {
       {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(190, TimeUnit.SECONDS);
            driver.navigate().to("https://me.classera.com/");

        }

    }
//    @AfterSuite
//    public void QuitDriver(){
//
//        driver.quit();
//    }
}
