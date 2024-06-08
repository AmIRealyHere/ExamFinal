package com.bigshop.pages;

import com.bigshop.driver.CustomWebDriverManager;
import com.bigshop.utils.PageLoader;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

@Getter
public abstract class BasePage {
    private final WebDriver driver;
    private final PageLoader pageLoader;

    public BasePage() {
        driver = CustomWebDriverManager.getDriver();
        pageLoader = new PageLoader(driver);
        PageFactory.initElements(driver, this);
    }
}
