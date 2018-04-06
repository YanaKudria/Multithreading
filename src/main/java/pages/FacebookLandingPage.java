package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.InitPageElements;
import utils.WebDriverManager;

public class FacebookLandingPage extends InitPageElements{

    @FindBy(css="input[type=email]")
    private WebElement emailField;

    @FindBy(css = "input[type=password]")
    private WebElement passwordField;

    @FindBy(css = "input[type=submit]")
    private WebElement buttonLogIn;

    public HomePage submitForWithCredentials(String login, String password){
        emailField.sendKeys(login);
        passwordField.sendKeys(password);
        buttonLogIn.click();
        return PageFactory.initElements(WebDriverManager.driver, HomePage.class);
  }
}
