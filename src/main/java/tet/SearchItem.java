package tet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SearchItem extends BasePage {

    @FindBy(xpath ="//*[@id='term']" )
    WebElement searchBox;

    @FindBy(xpath ="//*[@id='header']/div[4]/div/div/form/input" )
    WebElement searchBoxClick;

    @FindBy(id = "add_to_cart")
    WebElement addToCart;

    @FindBy (xpath = "//*[@id='item_list']/div[2]/div/div[1]/div/div[3]/a")
    WebElement clickOnItem;





    public void searchItemExamples(String item){
        searchBox.sendKeys(item);
        searchBoxClick.click();
    }
    public void clickingOnItemExamples(String clicking){
        driver.findElement(By.xpath(clicking)).click();
        addToCart.click();
    }

    public void searchItem(){
        searchBox.sendKeys("Vintage Style Birdcage Noticeboard Table Plan");
        searchBoxClick.click();
    }
    public void clickingOnItem(){
        clickOnItem.click();
        addToCart.click();
    }
}
