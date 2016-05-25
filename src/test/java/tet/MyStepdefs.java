package tet;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;



public class MyStepdefs {
HomePage home=new HomePage();
    SearchItem search=new SearchItem();
    Assertions cartAssertion=new Assertions();


    WebDriver driver;

    //customer should be able to add the item to the cart for purchasing
    @Given("^the customer is on home page$")
    public void theCustomerIsOnHomePage() {
        driver= BasePage.driver;
        home.onHomePage();


    }

    @When("^he chooses to add an \"([^\"]*)\" to the cart$")
    public void heChoosesToAddAnItemToTheCart(String item) {
        search.searchItemExamples(item);

    }


    @Then("^he should be able to do so with by \"([^\"]*)\" on the item and adding it to the to cart button$")
    public void heShouldBeAbleToDoSoWithByOnTheItemAndAddingItToTheToCartButton(String clicking) {
        search.clickingOnItemExamples(clicking);
    }


    @And("^the cart window opens with the item added$")
    public void theCartWindowOpensWithTheItemAdded() {
        //cartAssertion.assertItemAddedToCart();

    }


    //customer should not be able to add item to the cart with out selecting all the required details




    @When("^he searches for an item$")
    public void heSearchesForAnItem() {
        search.searchItem();

    }

    @And("^adds it to the basket before entering the required details$")
    public void addsItToTheBasketBeforeEnteringTheRequiredDetails() {
        search.clickingOnItem();

    }

    @Then("^the item should fail to be added to the cart$")
    public void theItemShouldFailToBeAddedToTheCart() {
        //cartAssertion.addingCartFailed();




    }
}







