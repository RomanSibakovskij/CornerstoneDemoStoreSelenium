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

    //invalid input shipping data - no singular input
    private String noShopCartShipCity = "";

    public ShoppingCartPageInvalidScenarios(WebDriver driver) {super(driver);}

    //input no shipping city into shipping city input field method
    public void inputNoShippingCityIntoShippingCityInputField() {
        logger.info("No shipping city (shopping cart): " + noShopCartShipCity);
        shoppingCartPageShippingCityInputField.sendKeys(noShopCartShipCity);
    }


}
