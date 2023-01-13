package com.qascript.StepDefs;

import com.qascript.PageObjects.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductStepDefs {
    @Given("user clicks on Show All Notebooks and Laptops link")
    public void userClicksOnShowAllNotebooksAndLaptopsLink() {
        HomePage.clickAllLaptopAndNotebooks();
    }

    @When("user clicks on Add to Cart button for Macbook product")
    public void userClicksOnAddToCartButtonForMacbookProduct() {
    }

    @Then("Macbook product is added to the shopping cart")
    public void macbookProductIsAddedToTheShoppingCart() {
    }
}
