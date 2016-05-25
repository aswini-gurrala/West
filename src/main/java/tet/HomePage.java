package tet;




public class HomePage extends BasePage {
    public static void onHomePage(){

        driver.manage().deleteAllCookies();
        driver.navigate().to("http://www.notonthehighstreet.com/");


    }

}
