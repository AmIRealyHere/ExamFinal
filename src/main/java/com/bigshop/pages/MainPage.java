package com.bigshop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MainPage extends BasePage {

    @FindBy(className = "header_secondary_container")
    private WebElement pageTitle;

    @FindBy(id = "react-burger-menu-btn")
    private WebElement menuBtn;

    @FindBy(id = "logout_sidebar_link")
    private WebElement logoutBtn;

    @FindBy(className = "shopping_cart_badge")
    private List<WebElement> cartCount;

    public boolean isTitleDisplayed() {
        return pageTitle.isDisplayed();
    }

    public void logout() {
        menuBtn.click();
        logoutBtn.click();
    }

    public int getProductCountInCart() {
        if (cartCount.isEmpty()) return 0;
        return Integer.parseInt(cartCount.get(0).getText());
    }
}
