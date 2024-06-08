package com.bigshop.step_definitions;

import com.bigshop.steps.ProductSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ProductDefinitions {
    private final ProductSteps productSteps;

    @Given("the app is on product page")
    public void theAppIsOnProductPage() {
        productSteps.checkProductsOnPageAreDisplayed();
    }

    @When("the user adds {} to cart")
    public void theUserAddsProductToCart(String product) {
        productSteps.addProductToCart(product);
    }
}
