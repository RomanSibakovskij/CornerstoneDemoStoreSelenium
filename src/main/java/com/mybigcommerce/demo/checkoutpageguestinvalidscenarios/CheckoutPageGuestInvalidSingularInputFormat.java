package com.mybigcommerce.demo.checkoutpageguestinvalidscenarios;

import com.mybigcommerce.demo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class CheckoutPageGuestInvalidSingularInputFormat extends BasePage{

    //checkout page web elements (relevant web elements only)
    //checkout section
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[1]//input[@id='email']")
    private WebElement checkoutPageGuestEmailInputField;
    //shipping section
    //input form
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[2]//input[@id='firstNameInput']")
    private WebElement checkoutPageShippingFirstNameInputField;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[2]//input[@id='lastNameInput']")
    private WebElement checkoutPageShippingLastNameInputField;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[2]//input[@id='addressLine1Input']")
    private WebElement checkoutPageShippingAddressInputField;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[2]//input[@id='cityInput']")
    private WebElement checkoutPageShippingCityInputField;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[2]//input[@id='postCodeInput']")
    private WebElement checkoutPageShippingPostCodeInputField;
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

    //valid guest shipping address input data (for remaining inputs)
    private String validGuestEmail;
    private String validShippingGuestFirstName;
    private String validShippingGuestLastName;
    private String validShippingGuestAddress;
    private String validShippingGuestPhone;

    //invalid guest shipping address input data - invalid singular input format
    private String invalidGuestEmailFormat;
    private String invalidShippingGuestFirstNameFormat;
    private String invalidShippingGuestLastNameFormat;
    private String invalidShippingGuestAddressFormat;
    private String invalidShippingGuestCityFormat;

    public CheckoutPageGuestInvalidSingularInputFormat(WebDriver driver) {super(driver);}

    //invalid guest email address input data getter - invalid email format (missing '@')
    public void invalidGuestInputDataInvalidEmailFormatGetter(){

        invalidGuestEmailFormat = "mfgddsfakemail.com";

        System.out.println("Invalid generated checkout guest email address (invalid guest email format): " + "\n");

        logger.info("Invalid guest shipping address email format: " + invalidGuestEmailFormat);

        System.out.println("\n");

    }

    //invalid guest email address input method - invalid guest email format
    public void inputInvalidGuestEmailFormatIntoEmailInputField(){checkoutPageGuestEmailInputField.sendKeys(invalidGuestEmailFormat);}

    //shipping address input

    //invalid guest shipping address input data getter - invalid shipping first name format (special symbols only)
    public void invalidGuestShipAddressInputDataInvalidFirstNameFormatGetter(){

        invalidShippingGuestFirstNameFormat = "#$#$^%";
        validShippingGuestLastName = TestDataGenerator.getRandomLastName();
        validShippingGuestAddress = TestDataGenerator.generateRandomAddress(8);
        validShippingGuestPhone = TestDataGenerator.generatePhoneNumber(9);

        System.out.println("Invalid generated checkout guest shipping address input data (invalid shipping first name format): " + "\n");

        logger.info("Invalid shipping address first name format: " + invalidShippingGuestFirstNameFormat);
        logger.info("Valid guest shipping address last name (invalid shipping first name format): " + validShippingGuestLastName);
        logger.info("Valid guest shipping address (invalid shipping first name format): " + validShippingGuestAddress);
        logger.info("Valid guest shipping address phone number (invalid shipping first name format): " + validShippingGuestPhone);

        System.out.println("\n");

    }

    //invalid guest shipping address input data getter - invalid shipping last name format (special symbols only)
    public void invalidGuestShipAddressInputDataInvalidLastNameFormatGetter(){

        validShippingGuestFirstName = TestDataGenerator.getRandomFirstName();
        invalidShippingGuestLastNameFormat = "@$##%^%$^";
        validShippingGuestAddress = TestDataGenerator.generateRandomAddress(8);
        validShippingGuestPhone = TestDataGenerator.generatePhoneNumber(9);

        System.out.println("Invalid generated checkout guest shipping address input data (invalid shipping last name format): " + "\n");

        logger.info("Valid guest shipping address first name (invalid shipping last name format): " + validShippingGuestFirstName);
        logger.info("Invalid shipping address last name format: " + invalidShippingGuestLastNameFormat);
        logger.info("Valid guest shipping address (invalid shipping last name format): " + validShippingGuestAddress);
        logger.info("Valid guest shipping address phone number (invalid shipping last name format): " + validShippingGuestPhone);

        System.out.println("\n");

    }

    //invalid guest shipping address input data getter - invalid shipping address format (special symbols only)
    public void invalidGuestShipAddressInputDataInvalidAddressFormatGetter(){

        validShippingGuestFirstName = TestDataGenerator.getRandomFirstName();
        validShippingGuestLastName = TestDataGenerator.getRandomLastName();
        invalidShippingGuestAddressFormat = "#$%&^%#$";
        validShippingGuestPhone = TestDataGenerator.generatePhoneNumber(9);

        System.out.println("Invalid generated checkout guest shipping address input data (invalid shipping address format): " + "\n");

        logger.info("Valid guest shipping address first name (invalid shipping address format): " + validShippingGuestFirstName);
        logger.info("Valid guest shipping address last name (invalid shipping address format): " + validShippingGuestLastName);
        logger.info("Invalid shipping address format: " + invalidShippingGuestAddressFormat);
        logger.info("Valid guest shipping address phone number (invalid shipping address format): " + validShippingGuestPhone);

        System.out.println("\n");

    }

    //invalid guest shipping address input data getter - invalid shipping city format (special symbols only)
    public void invalidGuestShipAddressInputDataInvalidCityFormatGetter(){

        validShippingGuestFirstName = TestDataGenerator.getRandomFirstName();
        validShippingGuestLastName = TestDataGenerator.getRandomLastName();
        validShippingGuestAddress = TestDataGenerator.generateRandomAddress(8);
        invalidShippingGuestCityFormat = "@$#$%$^";
        validShippingGuestPhone = TestDataGenerator.generatePhoneNumber(9);

        System.out.println("Invalid generated checkout guest shipping address input data (invalid shipping city format): " + "\n");

        logger.info("Valid guest shipping address first name (invalid shipping city format): " + validShippingGuestFirstName);
        logger.info("Valid guest shipping address last name (invalid shipping city format): " + validShippingGuestLastName);
        logger.info("Valid guest shipping address (invalid shipping city format): " + validShippingGuestAddress);
        logger.info("Invalid shipping city format: " + invalidShippingGuestCityFormat);
        logger.info("Valid guest shipping address phone number (invalid shipping city format): " + validShippingGuestPhone);

        System.out.println("\n");

    }

    //invalid guest shipping data input methods - invalid singular input format
    public void inputInvalidShippingGuestFirstNameFormatIntoFirstNameInputField(){checkoutPageShippingFirstNameInputField.sendKeys(invalidShippingGuestFirstNameFormat);}
    public void inputInvalidShippingGuestLastNameFormatIntoLastNameInputField(){checkoutPageShippingLastNameInputField.sendKeys(invalidShippingGuestLastNameFormat);}
    public void inputInvalidShippingGuestAddressFormatIntoAddressInputField(){checkoutPageShippingAddressInputField.sendKeys(invalidShippingGuestAddressFormat);}

    public void inputInvalidShippingGuestCityFormatIntoCityInputField(){
        checkoutPageShippingCityInputField.clear();
        checkoutPageShippingCityInputField.sendKeys(invalidShippingGuestCityFormat);
    }

    //valid input methods

    //valid guest email address input method (for remaining inputs)
    public void inputValidGuestEmailIntoEmailInputField(){checkoutPageGuestEmailInputField.sendKeys(validGuestEmail);}

    //valid guest shipping data input methods (for remaining inputs)
    public void inputValidShippingGuestFirstNameIntoFirstNameInputField(){checkoutPageShippingFirstNameInputField.sendKeys(validShippingGuestFirstName);}
    public void inputValidShippingGuestLastNameIntoLastNameInputField(){checkoutPageShippingLastNameInputField.sendKeys(validShippingGuestLastName);}
    public void inputValidShippingGuestAddressIntoAddressInputField(){checkoutPageShippingAddressInputField.sendKeys(validShippingGuestAddress);}
    public void inputValidShippingGuestPhoneIntoPhoneInputField(){checkoutPageShippingPhoneInputField.sendKeys(validShippingGuestPhone);}

}
