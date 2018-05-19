import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.Navigator;
import utils.WebDriverManager;



public class FacebookTest {

    @BeforeMethod
    public void beforeTest() {
        WebDriverManager.openBrowser();
    }

    @Test
    public void successFacebookLoginTest(){
        Navigator.OpenMainFacebookPage().submitForWithCredentials("", "");
        Assert.assertTrue(HomePage.getUserName().equals("Яна"));
    }

    @AfterMethod
    public void afterTest(){
        WebDriverManager.closeBrowser();
    }
}
