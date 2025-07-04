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

    //valid registered user input data (in order to avoid redundancy only shipping address will be used sice guest branch already covers billing address validation)

    //shipping address section
    private String validRegUserShipFirstName;
    private String validRegUserShipLastName;
    private String validRegUserShipAddress;
    private String validRegUserShipPhone;

    //payment section
    private String validRegUserCreditCardExpDate;
    private String validRegUserCreditCardName;
    private String validRegUserCreditCardCVVNumber;

    public CheckoutPageRegUserValidCheckout(WebDriver driver) {super(driver);}

    //valid registered user shipping address input data getter (during automation run, the webpage fails to keep the previously input data (except from shopping cart page), so they have to be re-input again with getters)
    public void validRegUserShipAddressInputDataGetter(){

        RegisterPage registerPage = new RegisterPage(driver);

        validRegUserShipFirstName = registerPage.getValidRegisterFirstName();
        validRegUserShipLastName = registerPage.getValidRegisterLastName();
        validRegUserShipAddress = registerPage.getValidRegisterAddress();
        validRegUserShipPhone = TestDataGenerator.generatePhoneNumber(7);

        System.out.println("Valid registered user shipping address input data: " + "\n");

        logger.info("Valid registered user shipping address first name: " + validRegUserShipFirstName);
        logger.info("Valid registered user shipping last name: " + validRegUserShipLastName);
        logger.info("Valid registered user shipping address: " + validRegUserShipAddress);
        logger.info("Valid registered user shipping phone number: " + validRegUserShipPhone);

        System.out.println("\n");

    }

    //valid registered user shipping address input data methods
    public void inputValidRegUserShipAddressFirstNameIntoFirstNameInputField(){checkoutPageShippingFirstNameInputField.sendKeys(validRegUserShipFirstName);}
    public void inputValidRegUserShipAddressLastNameIntoLastNameInputField(){checkoutPageShippingLastNameInputField.sendKeys(validRegUserShipLastName);}
    public void inputValidRegUserShipAddressIntoAddressInputField(){checkoutPageShippingAddressInputField.sendKeys(validRegUserShipAddress);}
    public void inputValidRegUserShipPhoneIntoPhoneInputField(){checkoutPageShippingPhoneInputField.sendKeys(validRegUserShipPhone);}

    //valid registered user payment section input data getter
    public void validRegUserPaymentSectionInputDataGetter(){

        validRegUserCreditCardName = validRegUserShipFirstName + " " + validRegUserShipLastName;
        validRegUserCreditCardExpDate = TestDataGenerator.generateExpirationDate();
        validRegUserCreditCardCVVNumber = TestDataGenerator.generateCVV();

        System.out.println("Valid registered user generated payment section input data: " + "\n");

        logger.info("Valid registered user generated payment section credit card name: " + validRegUserCreditCardName);
        logger.info("Valid registered user generated payment section credit card expiration date: " + validRegUserCreditCardExpDate);
        logger.info("Valid registered user generated payment section credit card CVV number: " + validRegUserCreditCardCVVNumber);

        System.out.println("\n");

    }

    //valid registered user payment section data input methods
    public void inputValidRegUserCreditCardNameIntoCreditCardNameInputField(){checkoutPagePaymentCreditCardNameInputField.sendKeys(validRegUserCreditCardName);}
    public void inputValidRegUserCreditCardExpDateIntoCreditCardExpDateInputField(){checkoutPagePaymentCreditCardExpDateInputField.sendKeys(validRegUserCreditCardExpDate);}
    public void inputValidRegUserCreditCardCVVIntoCreditCardCVVInputField(){checkoutPagePaymentCVVNumberInputField.sendKeys(validRegUserCreditCardCVVNumber);}

}
