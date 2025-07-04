package com.mybigcommerce.demo.utilities;

import com.mybigcommerce.demo.RegisterPage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class CheckoutPageRegUserValidCheckout extends BasePage{

    //checkout page web elements (relevant web element only)
    //shipping section
    //input form
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[2]//input[@id='firstNameInput']")
    private WebElement checkoutPageShippingFirstNameInputField;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[2]//input[@id='lastNameInput']")
    private WebElement checkoutPageShippingLastNameInputField;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[2]//input[@id='addressLine1Input']")
    private WebElement checkoutPageShippingAddressInputField;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[2]//input[@id='phoneInput']")
    private WebElement checkoutPageShippingPhoneInputField;
    //payment section
    //input form
    @FindBy(xpath = "//div[@class='paymentMethod paymentMethod--creditCard']//input[@id='ccNumber']")
    private WebElement checkoutPagePaymentCreditCardNumberInputField; //input only 4111 1111 1111 1111, others don't work
    @FindBy(xpath = "//div[@class='paymentMethod paymentMethod--creditCard']//input[@id='ccExpiry']")
    private WebElement checkoutPagePaymentCreditCardExpDateInputField;
    @FindBy(xpath = "//div[@class='paymentMethod paymentMethod--creditCard']//input[@id='ccName']")
    private WebElement checkoutPagePaymentCreditCardNameInputField;
    @FindBy(xpath = "//div[@class='paymentMethod paymentMethod--creditCard']//input[@id='ccCvv']")
    private WebElement checkoutPagePaymentCVVNumberInputField;

    public CheckoutPageRegUserValidCheckout(WebDriver driver) {super(driver);}


}
