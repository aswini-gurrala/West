package tet;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class BasePage {
    public BasePage(){
        PageFactory.initElements(driver,this);
    }
    public static WebDriver driver=new FirefoxDriver();
    @Before
    public static void openBroswer(){
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);



    }
    @After
    public static void closeBrowser(){
        driver.close();
    }
}
