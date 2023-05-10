package com.saucedemo.pages;

import com.aventstack.extentreports.Status;
import com.saucedemo.customlisteners.CustomListeners;
import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

public class ProductPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Products')]")
    WebElement productText;

    public String getProductText() {
        String message = getTextFromElement(productText);
        CustomListeners.test.log(Status.PASS, "Get Text");
        return message;
    }

    @CacheLookup
    @FindBy(className = "inventory_item")
    List<WebElement> productsCount;

    public int getActualNumberOfProducts() {
        List<WebElement> productCount = productsCount;
        CustomListeners.test.log(Status.PASS,"counting products");
        return productCount.size();
    }
}
