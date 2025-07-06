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
    private String invalidShippingGuestPostCodeFormat;
    private String invalidShippingGuestPhoneFormat;

    //valid guest billing address input data (for remaining inputs)
    private String validBillingGuestFirstName;
    private String validBillingGuestLastName;
    private String validBillingGuestAddress;
    private String validBillingGuestCity;
    private String validBillingGuestPostCode;
    private String validBillingGuestPhone;

    //invalid guest billing address input data - invalid singular input format
    private String invalidBillingGuestFirstNameFormat;
    private String invalidBillingGuestLastNameFormat;
    private String invalidBillingGuestAddressFormat;
    private String invalidBillingGuestCityFormat;
    private String invalidBillingGuestPostCodeFormat;
    private String invalidBillingGuestPhoneFormat;

    //valid guest payment section input data (for remaining inputs)
    private String validTestCreditCardNumber; //only this number is functional
    private String validGuestCreditCardExpDate;
    private String validGuestCreditCardName;
    private String validGuestCreditCardCVVNumber;

    //invalid guest payment section input data - invalid singular input format
    private String invalidTestCreditCardNumber;//any other than test number
    private String invalidTestCreditCardNumberFormat;
    private String invalidGuestCreditCardExpDateFormat;
    private String invalidGuestCreditCardReversedExpDate;
    private String invalidGuestCreditCardNameFormat;

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

    //invalid guest shipping address input data getter - invalid shipping post code format (special symbols only)
    public void invalidGuestShipAddressInputDataInvalidPostCodeFormatGetter(){

        validShippingGuestFirstName = TestDataGenerator.getRandomFirstName();
        validShippingGuestLastName = TestDataGenerator.getRandomLastName();
        validShippingGuestAddress = TestDataGenerator.generateRandomAddress(8);
        invalidShippingGuestPostCodeFormat = "@$#$^$%&^%$";
        validShippingGuestPhone = TestDataGenerator.generatePhoneNumber(9);

        System.out.println("Invalid generated checkout guest shipping address input data (invalid shipping post code format): " + "\n");

        logger.info("Valid guest shipping address first name (invalid shipping post code format): " + validShippingGuestFirstName);
        logger.info("Valid guest shipping address last name (invalid shipping post code format): " + validShippingGuestLastName);
        logger.info("Valid guest shipping address (invalid shipping post code format): " + validShippingGuestAddress);
        logger.info("Invalid shipping post code format: " + invalidShippingGuestPostCodeFormat);
        logger.info("Valid guest shipping address phone number (invalid shipping post code format): " + validShippingGuestPhone);

        System.out.println("\n");

    }

    //invalid guest shipping address input data getter - invalid shipping phone format (special symbols only)
    public void invalidGuestShipAddressInputDataInvalidPhoneFormatGetter(){

        validShippingGuestFirstName = TestDataGenerator.getRandomFirstName();
        validShippingGuestLastName = TestDataGenerator.getRandomLastName();
        validShippingGuestAddress = TestDataGenerator.generateRandomAddress(8);
        invalidShippingGuestPhoneFormat = "@$#$^%&^";

        System.out.println("Invalid generated checkout guest shipping address input data (invalid shipping phone format): " + "\n");

        logger.info("Valid guest shipping address first name (invalid shipping phone format): " + validShippingGuestFirstName);
        logger.info("Valid guest shipping address last name (invalid shipping phone format): " + validShippingGuestLastName);
        logger.info("Valid guest shipping address (invalid shipping phone format): " + validShippingGuestAddress);
        logger.info("Invalid shipping address phone format: " + invalidShippingGuestPhoneFormat);

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
    public void inputInvalidShippingGuestPostCodeFormatIntoPostCodeInputField(){
        checkoutPageShippingPostCodeInputField.clear();
        checkoutPageShippingPostCodeInputField.sendKeys(invalidShippingGuestPostCodeFormat);
    }

    public void inputInvalidShippingGuestPhoneFormatIntoPhoneInputField(){checkoutPageShippingPhoneInputField.sendKeys(invalidShippingGuestPhoneFormat);}

    //billing address input

    //invalid guest billing address input data getter - invalid billing first name format (special symbols only)
    public void invalidGuestBillAddressInputDataInvalidFirstNameFormatGetter(){

        invalidBillingGuestFirstNameFormat = "@$#$%^$%&^%";
        validBillingGuestLastName = TestDataGenerator.getRandomLastName();
        validBillingGuestAddress = TestDataGenerator.generateRandomAddress(8);
        validBillingGuestCity = TestDataGenerator.getRandomCity();
        validBillingGuestPostCode = String.valueOf(TestDataGenerator.getRandomPostalCode());
        validBillingGuestPhone = TestDataGenerator.generatePhoneNumber(9);

        System.out.println("Invalid generated checkout guest billing address input data (invalid billing first name format): " + "\n");

        logger.info("Invalid billing address first name format: " + invalidBillingGuestFirstNameFormat);
        logger.info("Valid guest billing address last name (invalid billing first name format): " + validBillingGuestLastName);
        logger.info("Valid guest billing address (invalid billing first name format): " + validBillingGuestAddress);
        logger.info("Valid guest billing address city (invalid billing first name format): " + validBillingGuestCity);
        logger.info("Valid guest billing address post code (invalid billing first name format): " + validBillingGuestPostCode);
        logger.info("Valid guest billing address phone number (invalid billing first name format): " + validBillingGuestPhone);

        System.out.println("\n");

    }

    //invalid guest billing address input data getter - invalid billing last name format (special symbols only)
    public void invalidGuestBillAddressInputDataInvalidLastNameFormatGetter(){

        validBillingGuestFirstName = TestDataGenerator.getRandomFirstName();
        invalidBillingGuestLastNameFormat = "!@$@#$%$#^";
        validBillingGuestAddress = TestDataGenerator.generateRandomAddress(8);
        validBillingGuestCity = TestDataGenerator.getRandomCity();
        validBillingGuestPostCode = String.valueOf(TestDataGenerator.getRandomPostalCode());
        validBillingGuestPhone = TestDataGenerator.generatePhoneNumber(9);

        System.out.println("Invalid generated checkout guest billing address input data (invalid billing last name format): " + "\n");

        logger.info("Valid guest billing address first name (invalid billing last name format): " + validBillingGuestFirstName);
        logger.info("Invalid billing address last name format: " + invalidBillingGuestLastNameFormat);
        logger.info("Valid guest billing address (invalid billing last name format): " + validBillingGuestAddress);
        logger.info("Valid guest billing address city (invalid billing last name format): " + validBillingGuestCity);
        logger.info("Valid guest billing address post code (invalid billing last name format): " + validBillingGuestPostCode);
        logger.info("Valid guest billing address phone number (invalid billing last name format): " + validBillingGuestPhone);

        System.out.println("\n");

    }

    //invalid guest billing address input data getter - invalid billing address format (special symbols only)
    public void invalidGuestBillAddressInputDataInvalidAddressFormatGetter(){

        validBillingGuestFirstName = TestDataGenerator.getRandomFirstName();
        validBillingGuestLastName = TestDataGenerator.getRandomLastName();
        invalidBillingGuestAddressFormat = TestDataGenerator.generateRandomAddress(93);
        validBillingGuestCity = TestDataGenerator.getRandomCity();
        validBillingGuestPostCode = String.valueOf(TestDataGenerator.getRandomPostalCode());
        validBillingGuestPhone = TestDataGenerator.generatePhoneNumber(9);

        System.out.println("Invalid generated checkout guest billing address input data (invalid billing address format): " + "\n");

        logger.info("Valid guest billing address first name (invalid billing address format): " + validBillingGuestFirstName);
        logger.info("Valid guest billing address last name (invalid billing address format): " + validBillingGuestLastName);
        logger.info("Invalid billing address format: " + invalidBillingGuestAddressFormat);
        logger.info("Valid guest billing address city (invalid billing address format): " + validBillingGuestCity);
        logger.info("Valid guest billing address post code (invalid billing address format): " + validBillingGuestPostCode);
        logger.info("Valid guest billing address phone number (invalid billing address format): " + validBillingGuestPhone);

        System.out.println("\n");

    }

    //invalid guest billing address input data getter - invalid billing city (special symbols only)
    public void invalidGuestBillAddressInputDataInvalidCityFormatGetter(){

        validBillingGuestFirstName = TestDataGenerator.getRandomFirstName();
        validBillingGuestLastName = TestDataGenerator.getRandomLastName();
        validBillingGuestAddress = TestDataGenerator.generateRandomAddress(8);
        invalidBillingGuestCityFormat = "@$#%^$%^$%";
        validBillingGuestPostCode = String.valueOf(TestDataGenerator.getRandomPostalCode());
        validBillingGuestPhone = TestDataGenerator.generatePhoneNumber(9);

        System.out.println("Invalid generated checkout guest billing address input data (invalid billing city format): " + "\n");

        logger.info("Valid guest billing address first name (invalid billing city format): " + validBillingGuestFirstName);
        logger.info("Valid guest billing address last name (invalid billing city format): " + validBillingGuestLastName);
        logger.info("Valid guest billing address (invalid billing city format): " + validBillingGuestAddress);
        logger.info("Invalid billing address city format: " + invalidBillingGuestCityFormat);
        logger.info("Valid guest billing address post code (invalid billing city format): " + validBillingGuestPostCode);
        logger.info("Valid guest billing address phone number (invalid billing city format): " + validBillingGuestPhone);

        System.out.println("\n");

    }

    //invalid guest billing address input data getter - invalid billing post code format (special symbols only)
    public void invalidGuestBillAddressInputDataInvalidPostCodeFormatGetter(){

        validBillingGuestFirstName = TestDataGenerator.getRandomFirstName();
        validBillingGuestLastName = TestDataGenerator.getRandomLastName();
        validBillingGuestAddress = TestDataGenerator.generateRandomAddress(8);
        validBillingGuestCity = TestDataGenerator.getRandomCity();
        invalidBillingGuestPostCodeFormat = "@##$%$#^%^%";
        validBillingGuestPhone = TestDataGenerator.generatePhoneNumber(9);

        System.out.println("Invalid generated checkout guest billing address input data (invalid billing post code format): " + "\n");

        logger.info("Valid guest billing address first name (invalid billing post code format): " + validBillingGuestFirstName);
        logger.info("Valid guest billing address last name (invalid billing post code format): " + validBillingGuestLastName);
        logger.info("Valid guest billing address (invalid billing post code format): " + validBillingGuestAddress);
        logger.info("Valid guest billing address city (invalid billing post code format): " + validBillingGuestCity);
        logger.info("Invalid billing address post code format: " + invalidBillingGuestPostCodeFormat);
        logger.info("Valid guest billing address phone number (invalid billing post code format): " + validBillingGuestPhone);

        System.out.println("\n");

    }

    //invalid guest billing address input data getter - invalid billing phone (special symbols only)
    public void invalidGuestBillAddressInputDataInvalidPhoneFormatGetter(){

        validBillingGuestFirstName = TestDataGenerator.getRandomFirstName();
        validBillingGuestLastName = TestDataGenerator.getRandomLastName();
        validBillingGuestAddress = TestDataGenerator.generateRandomAddress(8);
        validBillingGuestCity = TestDataGenerator.getRandomCity();
        validBillingGuestPostCode = String.valueOf(TestDataGenerator.getRandomPostalCode());
        invalidBillingGuestPhoneFormat = "@$#$^&%^*";

        System.out.println("Invalid generated checkout guest billing address input data (invalid billing phone format): " + "\n");

        logger.info("Valid guest billing address first name (invalid billing phone format): " + validBillingGuestFirstName);
        logger.info("Valid guest billing address last name (invalid billing phone format): " + validBillingGuestLastName);
        logger.info("Valid guest billing address (invalid billing phone format): " + validBillingGuestAddress);
        logger.info("Valid guest billing address city (invalid billing phone format): " + validBillingGuestCity);
        logger.info("Valid guest billing address post code (invalid billing phone format): " + validBillingGuestPostCode);
        logger.info("Invalid billing address phone format: " + invalidBillingGuestPhoneFormat);

        System.out.println("\n");

    }

    //invalid guest billing address data input methods - invalid singular input format
    public void inputInvalidBillingGuestFirstNameFormatIntoFirstNameInputField(){checkoutPageBillingFirstNameInputField.sendKeys(invalidBillingGuestFirstNameFormat);}
    public void inputInvalidBillingGuestLastNameFormatIntoLastNameInputField(){checkoutPageBillingLastNameInputField.sendKeys(invalidBillingGuestLastNameFormat);}

    public void inputInvalidBillingGuestAddressFormatIntoAddressInputField(){
        checkoutPageBillingAddressInputField.clear();
        checkoutPageBillingAddressInputField.sendKeys(invalidBillingGuestAddressFormat);
    }
    public void inputInvalidBillingGuestCityFormatIntoCityInputField(){
        checkoutPageBillingCityInputField.clear();
        checkoutPageBillingCityInputField.sendKeys(invalidBillingGuestCityFormat);
    }
    public void inputInvalidBillingGuestPostCodeFormatIntoPostCodeInputField(){
        checkoutPageBillingPostCodeInputField.clear();
        checkoutPageBillingPostCodeInputField.sendKeys(String.valueOf(invalidBillingGuestPostCodeFormat));
    }
    public void inputInvalidBillingGuestPhoneFormatIntoPhoneInputField(){
        checkoutPageBillingPhoneInputField.clear();
        checkoutPageBillingPhoneInputField.sendKeys(String.valueOf(invalidBillingGuestPhoneFormat));
    }

    //valid input methods

    //valid guest email address input method (for remaining inputs)
    public void inputValidGuestEmailIntoEmailInputField(){checkoutPageGuestEmailInputField.sendKeys(validGuestEmail);}

    //valid guest shipping data input methods (for remaining inputs)
    public void inputValidShippingGuestFirstNameIntoFirstNameInputField(){checkoutPageShippingFirstNameInputField.sendKeys(validShippingGuestFirstName);}
    public void inputValidShippingGuestLastNameIntoLastNameInputField(){checkoutPageShippingLastNameInputField.sendKeys(validShippingGuestLastName);}
    public void inputValidShippingGuestAddressIntoAddressInputField(){checkoutPageShippingAddressInputField.sendKeys(validShippingGuestAddress);}
    public void inputValidShippingGuestPhoneIntoPhoneInputField(){checkoutPageShippingPhoneInputField.sendKeys(validShippingGuestPhone);}

    //valid guest billing address data input methods (for remaining inputs)
    public void inputValidBillingGuestFirstNameIntoFirstNameInputField(){checkoutPageBillingFirstNameInputField.sendKeys(validBillingGuestFirstName);}
    public void inputValidBillingGuestLastNameIntoLastNameInputField(){checkoutPageBillingLastNameInputField.sendKeys(validBillingGuestLastName);}
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

    //credit card input data

    //invalid guest payment input data getter - invalid guest credit card number (any other than test number)
    public void invalidGuestPaymentInputDataInvalidCredCardNumberGetter(){

        invalidTestCreditCardNumber = "3423 1234 6785 4346";
        validGuestCreditCardExpDate = TestDataGenerator.generateExpirationDate();
        validGuestCreditCardName = TestDataGenerator.getRandomFirstName() + " " + TestDataGenerator.getRandomLastName();
        validGuestCreditCardCVVNumber = TestDataGenerator.generateCVV();

        System.out.println("Invalid generated checkout guest payment input data (invalid guest credit card number): " + "\n");

        logger.info("Invalid test credit card number: " + invalidTestCreditCardNumber);
        logger.info("Valid guest credit card expiration date (invalid guest credit card number): " + validGuestCreditCardExpDate);
        logger.info("Valid guest credit card full name (invalid guest credit card number): " + validGuestCreditCardName);
        logger.info("Valid guest credit card CVV number (invalid guest credit card number): " + validGuestCreditCardCVVNumber);

        System.out.println("\n");

    }

    //invalid guest payment input data getter - invalid guest credit card number format (chars only)
    public void invalidGuestPaymentInputDataInvalidCredCardNumberFormatGetter(){

        invalidTestCreditCardNumberFormat = "sadfdfdsgfg";
        validGuestCreditCardExpDate = TestDataGenerator.generateExpirationDate();
        validGuestCreditCardName = TestDataGenerator.getRandomFirstName() + " " + TestDataGenerator.getRandomLastName();
        validGuestCreditCardCVVNumber = TestDataGenerator.generateCVV();

        System.out.println("Invalid generated checkout guest payment input data (invalid guest credit card number format): " + "\n");

        logger.info("Invalid test credit card number format: " + invalidTestCreditCardNumberFormat);
        logger.info("Valid guest credit card expiration date (invalid guest credit card number format): " + validGuestCreditCardExpDate);
        logger.info("Valid guest credit card full name (invalid guest credit card number format): " + validGuestCreditCardName);
        logger.info("Valid guest credit card CVV number (invalid guest credit card number format): " + validGuestCreditCardCVVNumber);

        System.out.println("\n");

    }

    //invalid guest payment input data getter - invalid guest credit card exp date format (chars only)
    public void invalidGuestPaymentInputDataInvalidCredCardExpDateFormatGetter(){

        validTestCreditCardNumber = "4111 1111 1111 1111";
        invalidGuestCreditCardExpDateFormat = "er/sd";
        validGuestCreditCardName = TestDataGenerator.getRandomFirstName() + " " + TestDataGenerator.getRandomLastName();
        validGuestCreditCardCVVNumber = TestDataGenerator.generateCVV();

        System.out.println("Invalid generated checkout guest payment input data (invalid guest credit card exp date format): " + "\n");

        logger.info("Valid test credit card number (invalid guest credit card exp date format): " + validTestCreditCardNumber);
        logger.info("Invalid guest credit card expiration date format: " + invalidGuestCreditCardExpDateFormat);
        logger.info("Valid guest credit card full name (invalid guest credit card exp date format): " + validGuestCreditCardName);
        logger.info("Valid guest credit card CVV number (invalid guest credit card exp date format): " + validGuestCreditCardCVVNumber);

        System.out.println("\n");

    }

    //invalid guest payment input data getter - reversed guest credit card exp date format
    public void invalidGuestPaymentInputDataReversedCredCardExpDateFormatGetter(){

        validTestCreditCardNumber = "4111 1111 1111 1111";
        invalidGuestCreditCardReversedExpDate = "29/11";
        validGuestCreditCardName = TestDataGenerator.getRandomFirstName() + " " + TestDataGenerator.getRandomLastName();
        validGuestCreditCardCVVNumber = TestDataGenerator.generateCVV();

        System.out.println("Invalid generated checkout guest payment input data (reversed guest credit card exp date format): " + "\n");

        logger.info("Valid test credit card number (reversed guest credit card exp date format): " + validTestCreditCardNumber);
        logger.info("Reversed guest credit card expiration date format: " + invalidGuestCreditCardReversedExpDate);
        logger.info("Valid guest credit card full name (reversed guest credit card exp date format): " + validGuestCreditCardName);
        logger.info("Valid guest credit card CVV number (reversed guest credit card exp date format): " + validGuestCreditCardCVVNumber);

        System.out.println("\n");

    }

    //invalid guest payment input data getter - invalid guest credit card name format (special symbols only)
    public void invalidGuestPaymentInputDataInvalidCreditCardNameFormatGetter(){

        validTestCreditCardNumber = "4111 1111 1111 1111";
        validGuestCreditCardExpDate = TestDataGenerator.generateExpirationDate();
        invalidGuestCreditCardNameFormat =  "#%$%^%$^%" ;
        validGuestCreditCardCVVNumber = TestDataGenerator.generateCVV();

        System.out.println("Invalid generated checkout guest payment input data (invalid guest credit card name format): " + "\n");

        logger.info("Valid test credit card number (invalid guest credit card name format): " + validTestCreditCardNumber);
        logger.info("Valid guest credit card expiration date (invalid guest credit card name format): " + validGuestCreditCardExpDate);
        logger.info("Invalid credit card full name format: " + invalidGuestCreditCardNameFormat);
        logger.info("Valid guest credit card CVV number (invalid guest credit card name format): " + validGuestCreditCardCVVNumber);

        System.out.println("\n");

    }

    //invalid guest payment data input methods - invalid singular input
    public void inputInvalidPaymentTestCreditCardNumberIntoCreditCardNumberInputField(){checkoutPagePaymentCreditCardNumberInputField.sendKeys(invalidTestCreditCardNumber);}
    public void inputInvalidPaymentTestCreditCardNumberFormatIntoCreditCardNumberInputField(){checkoutPagePaymentCreditCardNumberInputField.sendKeys(invalidTestCreditCardNumberFormat);}
    public void inputInvalidPaymentGuestCreditCardExpDateFormatIntoCreditCardExpDateInputField(){checkoutPagePaymentCreditCardExpDateInputField.sendKeys(invalidGuestCreditCardExpDateFormat);}
    public void inputInvalidPaymentGuestCreditCardReversedExpDateIntoCreditCardExpDateInputField(){checkoutPagePaymentCreditCardExpDateInputField.sendKeys(invalidGuestCreditCardReversedExpDate);}
    public void inputInvalidPaymentGuestCreditCardNameFormatIntoCreditCardNameInputField(){checkoutPagePaymentCreditCardNameInputField.sendKeys(invalidGuestCreditCardNameFormat);}

    //valid guest payment data input methods
    public void inputValidPaymentTestCreditCardNumberIntoCreditCardNumberInputField(){checkoutPagePaymentCreditCardNumberInputField.sendKeys(validTestCreditCardNumber);}
    public void inputValidPaymentGuestCreditCardNameIntoCreditCardNameInputField(){checkoutPagePaymentCreditCardNameInputField.sendKeys(validGuestCreditCardName);}
    public void inputValidPaymentGuestCreditCardExpDateIntoCreditCardExpDateInputField(){checkoutPagePaymentCreditCardExpDateInputField.sendKeys(validGuestCreditCardExpDate);}
    public void inputValidPaymentGuestCreditCardCVVIntoCreditCardCVVInputField(){checkoutPagePaymentCVVNumberInputField.sendKeys(validGuestCreditCardCVVNumber);}

}
