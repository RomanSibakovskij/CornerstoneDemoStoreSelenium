package com.mybigcommerce.demo.shopcartinvalidscenarios;

import com.mybigcommerce.demo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPageInvalidScenarios extends BasePage{

    //shipping section
    @FindBy(xpath = "//input[@id='shipping-city']")
    private WebElement shoppingCartPageShippingCityInputField;
    @FindBy(xpath = "//input[@id='shipping-zip']")
    private WebElement shoppingCartPageShippingPostCodeInputField;

    public ShoppingCartPageInvalidScenarios(WebDriver driver) {super(driver);}


}
