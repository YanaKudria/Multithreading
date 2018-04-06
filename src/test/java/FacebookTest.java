import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.Navigator;
import utils.WebDriverManager;

import java.sql.Driver;

public class FacebookTest {

    @BeforeMethod
    public void beforeTest() {
        WebDriverManager.openBrowser();
    }

    @Test
    public void successFacebookLoginTest(){
        Navigator.OpenMainFacebookPage().submitForWithCredentials("linevitch2010@yandex.ru", "Fantasy89!");
        Assert.assertTrue(HomePage.getUserName().equals("Яна Кудря"));
    }

    @AfterMethod
    public void afterTest(){
        WebDriverManager.closeBrowser();
    }
}
