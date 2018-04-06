package utils;

import pages.FacebookLandingPage;

public class Navigator {

    public static FacebookLandingPage OpenMainFacebookPage(){
        WebDriverManager.driver.get("https://www.facebook.com/");
        return new FacebookLandingPage();
    }
}
