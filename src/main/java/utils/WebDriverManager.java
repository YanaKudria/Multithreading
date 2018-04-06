package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverManager {
    public static WebDriver driver;

    public  static void openBrowser(){
        System.setProperty("webdriver.chrome.driver", "D:/Yana/QA/Drivers/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
    public static void closeBrowser(){
        driver.quit();
    }
}
