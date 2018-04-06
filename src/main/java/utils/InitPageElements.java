package utils;

import org.openqa.selenium.support.PageFactory;

public class InitPageElements extends PageFactory {
    public InitPageElements(){
        PageFactory.initElements(WebDriverManager.driver, this);
    }
}
