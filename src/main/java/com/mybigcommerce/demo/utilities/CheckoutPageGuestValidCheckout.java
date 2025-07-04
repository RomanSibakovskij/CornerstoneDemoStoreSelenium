package com.mybigcommerce.demo.utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class CheckoutPageGuestValidCheckout extends BasePage{

    //checkout page web elements (relevant web element only)
    //checkout section
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[1]//input[@id='email']")
    private WebElement checkoutPageGuestEmailInputField; //guest will have this element only
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
    //billing address section
    //input form
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[3]//input[@id='firstNameInput']")
    private WebElement checkoutPageBillingFirstNameInputField;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[3]//input[@id='lastNameInput']")
    private WebElement checkoutPageBillingLastNameInputField;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[3]//input[@id='addressLine1Input']")
    private WebElement checkoutPageBillingAddressInputField;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[3]//input[@id='cityInput']")
    private WebElement checkoutPageBillingCityInputField;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[3]//input[@id='postCodeInput']")
    private WebElement checkoutPageBillingPostCodeInputField;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[3]//input[@id='phoneInput']")
    private WebElement checkoutPageBillingPhoneInputField;
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

    //valid guest shipping address input data
    private String validGuestEmail;
    private String validShippingGuestFirstName;
    private String validShippingGuestLastName;
    private String validShippingGuestAddress;
    private String validShippingGuestPhone;

    //valid guest billing address input data
    private String validBillingGuestFirstName;
    private String validBillingGuestLastName;
    private String validBillingGuestAddress;
    private String validBillingGuestCity;
    private String validBillingGuestPostCode;
    private String validBillingGuestPhone;

    //valid guest payment section input data
    private String validTestCreditCardNumber = "4111 1111 1111 1111"; //only this number is functional
    private String validGuestCreditCardExpDate;
    private String validGuestCreditCardName;
    private String validGuestCreditCardCVVNumber;

    public CheckoutPageGuestValidCheckout(WebDriver driver) {super(driver);}

    //valid guest email address input data getter
    public void validGuestEmailInputDataGetter(){

        validGuestEmail = TestDataGenerator.generateRandomEmailAddress(7);

        System.out.println("Valid generated checkout guest email address: " + "\n");

        logger.info("Valid guest shipping address email: " + validGuestEmail);

        System.out.println("\n");

    }

    //valid guest email address input method
    public void inputValidGuestEmailIntoEmailInputField(){checkoutPageGuestEmailInputField.sendKeys(validGuestEmail);}

    //valid guest shipping address input data getter (except city and post code since the webpage keeps the records entered previously in shopping cart page)
    public void validGuestShipAddressInputDataGetter(){

        validShippingGuestFirstName = TestDataGenerator.getRandomFirstName();
        validShippingGuestLastName = TestDataGenerator.getRandomLastName();
        validShippingGuestAddress = TestDataGenerator.generateRandomAddress(8);
        validShippingGuestPhone = TestDataGenerator.generatePhoneNumber(9);

        System.out.println("Valid generated checkout guest shipping address input data: " + "\n");

        logger.info("Valid guest shipping address first name: " + validShippingGuestFirstName);
        logger.info("Valid guest shipping address last name: " + validShippingGuestLastName);
        logger.info("Valid guest shipping address: " + validShippingGuestAddress);
        logger.info("Valid guest shipping address phone number: " + validShippingGuestPhone);

        System.out.println("\n");

    }

    //valid guest shipping data input methods
    public void inputValidShippingGuestFirstNameIntoFirstNameInputField(){checkoutPageShippingFirstNameInputField.sendKeys(validShippingGuestFirstName);}
    public void inputValidShippingGuestLastNameIntoLastNameInputField(){checkoutPageShippingLastNameInputField.sendKeys(validShippingGuestLastName);}
    public void inputValidShippingGuestAddressIntoAddressInputField(){checkoutPageShippingAddressInputField.sendKeys(validShippingGuestAddress);}
    public void inputValidShippingGuestPhoneIntoPhoneInputField(){checkoutPageShippingPhoneInputField.sendKeys(validShippingGuestPhone);}

    //valid guest billing address input data getter
    public void validGuestBillAddressInputDataGetter(){

        validBillingGuestFirstName = validShippingGuestFirstName;
        validBillingGuestLastName = validShippingGuestLastName;
        validBillingGuestAddress = TestDataGenerator.generateRandomAddress(8);
        validBillingGuestCity = TestDataGenerator.getRandomCity();
        validBillingGuestPostCode = String.valueOf(TestDataGenerator.getRandomPostalCode());
        validBillingGuestPhone = TestDataGenerator.generatePhoneNumber(9);

        System.out.println("Valid generated checkout guest billing address input data: " + "\n");

        logger.info("Valid guest billing address first name: " + validBillingGuestFirstName);
        logger.info("Valid guest billing address last name: " + validBillingGuestLastName);
        logger.info("Valid guest billing address: " + validBillingGuestAddress);
        logger.info("Valid guest billing address city: " + validBillingGuestCity);
        logger.info("Valid guest billing address post code: " + validBillingGuestPostCode);
        logger.info("Valid guest billing address phone number: " + validShippingGuestPhone);

        System.out.println("\n");

    }

    //valid guest billing address data input methods
    public void inputValidBillingGuestFirstNameIntoFirstNameInputField(){checkoutPageBillingFirstNameInputField.sendKeys(validShippingGuestFirstName);}
    public void inputValidBillingGuestLastNameIntoLastNameInputField(){checkoutPageBillingLastNameInputField.sendKeys(validShippingGuestLastName);}
    public void inputValidBillingGuestAddressIntoAddressInputField(){
        checkoutPageBillingAddressInputField.clear();
        checkoutPageBillingAddressInputField.sendKeys(validBillingGuestAddress);
    }
    public void inputValidBillingGuestCityIntoCityInputField(){
        checkoutPageBillingCityInputField.clear();
        checkoutPageBillingCityInputField.sendKeys(validBillingGuestCity);
    }
    public void inputValidBillingGuestPostCodeIntoPostCodeInputField(){
        checkoutPageBillingPostCodeInputField.clear();
        checkoutPageBillingPostCodeInputField.sendKeys(validBillingGuestPostCode);
    }
    public void inputValidBillingGuestPhoneIntoPhoneInputField(){
        checkoutPageBillingPhoneInputField.clear();
        checkoutPageBillingPhoneInputField.sendKeys(validBillingGuestPhone);
    }

    //valid guest payment input data getter
    public void validGuestPaymentInputDataGetter(){

        validGuestCreditCardExpDate = TestDataGenerator.generateExpirationDate();
        validGuestCreditCardName = validShippingGuestFirstName + " " + validShippingGuestLastName;
        validGuestCreditCardCVVNumber = TestDataGenerator.generateCVV();

        System.out.println("Valid generated checkout guest payment input data: " + "\n");

        logger.info("Valid test credit card number: " + validTestCreditCardNumber);
        logger.info("Valid test credit card expiration date: " + validGuestCreditCardExpDate);
        logger.info("Valid guest credit card full name: " + validGuestCreditCardName);
        logger.info("Valid guest credit card CVV number: " + validGuestCreditCardCVVNumber);

        System.out.println("\n");

    }

    //valid guest payment data input methods
    public void inputValidPaymentTestCreditCardNumberIntoCreditCardNumberInputField(){checkoutPagePaymentCreditCardNumberInputField.sendKeys(validTestCreditCardNumber);}
    public void inputValidPaymentGuestCreditCardNameIntoCreditCardNameInputField(){checkoutPagePaymentCreditCardNameInputField.sendKeys(validGuestCreditCardName);}
    public void inputValidPaymentGuestCreditCardExpDateIntoCreditCardExpDateInputField(){checkoutPagePaymentCreditCardExpDateInputField.sendKeys(validGuestCreditCardExpDate);}
    public void inputValidPaymentGuestCreditCardCVVIntoCreditCardCVVInputField(){checkoutPagePaymentCVVNumberInputField.sendKeys(validGuestCreditCardCVVNumber);}

}
