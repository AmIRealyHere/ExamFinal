package com.bigshop.driver;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverListener;

import java.util.Arrays;

@Slf4j
public class CustomListener implements WebDriverListener {
    @Override
    public void beforeClick(WebElement element) {
        log.info("Clicking on {}", getElement(element));
    }

    @Override
    public void beforeSendKeys(WebElement element, CharSequence[] keyToSend) {
        log.info("Changing value " + Arrays.toString(keyToSend) + "for {}" + getElement(element));
        System.out.println("Changing value " + Arrays.toString(keyToSend) + "for " + getElement(element));

    }

    private String getElement(WebElement element) {
        String text = element.getText();
        if (!text.isEmpty()) return text;
        if (!element.getAttribute("id").isEmpty()) return element.getAttribute("id");
        if (!element.getAttribute("class").isEmpty()) return element.getAttribute("class");
        if (!element.getAttribute("placeholder").isEmpty()) return element.getAttribute("placeholder");
        if (!element.getAttribute("name").isEmpty()) return element.getAttribute("name");
        return "";
    }
}

