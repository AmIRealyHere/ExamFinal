package com.bigshop.steps;

import com.bigshop.utils.PageLoader;
import com.bigshop.utils.PropertyReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.bigshop.driver.CustomWebDriverManager.getDriver;

public class SearchProductSteps {

    private final WebDriver driver;
    private final PageLoader pageLoader;

    public SearchProductSteps() {
        this.driver = getDriver();
        this.pageLoader = new PageLoader(driver);
    }

    @Given("I am on the BigShop homepage")
    public void iAmOnTheBigShopHomepage() {
        driver.get(PropertyReader.getConfigProperty("url"));
        pageLoader.isElementPresent(By.id("homepage-identifier"));
    }

    @When("I search for {string}")
    public void iSearchFor(String product) {
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys(product);
        searchBox.submit();
    }

    @Then("I should see search results for {string}")
    public void iShouldSeeSearchResultsFor(String product) {
        List<WebElement> results = driver.findElements(By.cssSelector(".search-results .product-item"));
        pageLoader.isListVisible(results, 10);

        boolean found = results.stream().anyMatch(item -> item.getText().contains(product));
        assert found : "Product not found in search results";
    }
}
