package tet;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;




public class Assertions extends BasePage {

    @FindBy(xpath ="//*[@id='basket_title']/h2")
     WebElement basket;

    @FindBy(xpath = "//*[@id='product_options']/li/span[1]/span")
    WebElement cartAdditionFailed;





    public void assertItemAddedToCart(){
        String text = basket.getText();
        Assert.assertEquals(text, "item added to basket");
    }
    public void addingCartFailed(){
        String text=cartAdditionFailed.getText();
        Assert.assertEquals(text,"Please enter a value");
        driver.quit();
    }
}
