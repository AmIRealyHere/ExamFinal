package com.bigshop.steps;

import com.bigshop.pages.ProductPage;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
public class ProductSteps {
    private final ProductPage productPage;

    public void checkProductsOnPageAreDisplayed() {
        log.info("Check products are displayed");
        productPage.waitUntilProductsAreDisplayed();
    }

    public void addProductToCart(String product) {
        log.info("Add product to cart");
        productPage.addProductToCart(product);
    }
}