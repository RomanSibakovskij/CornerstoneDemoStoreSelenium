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
    private String noShopCartShipPostCode = "";

    //invalid input shipping data - too short singular input
    private String tooShortShopCartShipCity = "K"; //1 char
    private int tooShortShopCartShipPostCode = 4563; //4 digits

    //invalid input shipping data - too long singular input
    private String tooLongShopCartShipCity = "Jhfgdsgdtwetrtjdsfgrfdgjhkjmngbfdsfffhkjgsedhgtfgsdetgtujyhgdsfgdfhtgfsdfdffgdsgfgfdgdsfgfdhgfdhgdfd"; //100 chars
    private int tooLongShopCartShipPostCode = 784563; //6 digits

    //invalid input shipping data - invalid singular input format
    private String invalidShopCartShipCityFormat = "@$#$%^%*&^&"; //special symbols only

    public ShoppingCartPageInvalidScenarios(WebDriver driver) {super(driver);}

    //input no shipping city into shipping city input field method
    public void inputNoShippingCityIntoShippingCityInputField() {
        logger.info("No shipping city (shopping cart): " + noShopCartShipCity);
        shoppingCartPageShippingCityInputField.sendKeys(noShopCartShipCity);
    }
    //input no shipping post code into shipping post code input field method
    public void inputNoShippingPostCodeIntoShippingPostCodeInputField() {
        logger.info("No shipping post code (shopping cart): " + noShopCartShipPostCode);
        shoppingCartPageShippingPostCodeInputField.sendKeys(noShopCartShipPostCode);
    }

    //input too short shipping city into shipping city input field method
    public void inputTooShortShippingCityIntoShippingCityInputField() {
        logger.info("Too short shipping city (shopping cart): " + tooShortShopCartShipCity);
        shoppingCartPageShippingCityInputField.sendKeys(tooShortShopCartShipCity);
    }
    //input too short shipping post code into shipping post code input field method
    public void inputTooShortShippingPostCodeIntoShippingPostCodeInputField() {
        logger.info("Too short shipping post code (shopping cart): " + tooShortShopCartShipPostCode);
        shoppingCartPageShippingPostCodeInputField.sendKeys(String.valueOf(tooShortShopCartShipPostCode));
    }

    //input too long shipping city into shipping city input field method
    public void inputTooLongShippingCityIntoShippingCityInputField() {
        logger.info("Too long shipping city (shopping cart): " + tooLongShopCartShipCity);
        shoppingCartPageShippingCityInputField.sendKeys(tooLongShopCartShipCity);
    }
    //input too long shipping post code into shipping post code input field method
    public void inputTooLongShippingPostCodeIntoShippingPostCodeInputField() {
        logger.info("Too long shipping post code (shopping cart): " + tooLongShopCartShipPostCode);
        shoppingCartPageShippingPostCodeInputField.sendKeys(String.valueOf(tooLongShopCartShipPostCode));
    }

    //input invalid shipping city format into shipping city input field method
    public void inputInvalidShippingCityFormatIntoShippingCityInputField() {
        logger.info("Invalid shipping city format (shopping cart): " + invalidShopCartShipCityFormat);
        shoppingCartPageShippingCityInputField.sendKeys(invalidShopCartShipCityFormat);
    }

}
