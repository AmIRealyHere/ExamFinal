package com.bigshop.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SearchDefinitions {
    @Given("I am on the BigShop homepage")
    public void iAmOnTheBigShopHomepage() {
    }

    @When("I enter {word} into the search bar")
    public void iEnterProductIntoTheSearchBar(String product) {
    }

    @And("I click the search button")
    public void iClickTheSearchButton() {
    }

    @Then("I should see a list of products")
    public void iShouldSeeAListOfProducts() {
    }
}
