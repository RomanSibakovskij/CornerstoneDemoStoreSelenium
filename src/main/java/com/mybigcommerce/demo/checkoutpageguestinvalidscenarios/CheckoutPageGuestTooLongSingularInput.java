package com.mybigcommerce.demo.checkoutpageguestinvalidscenarios;

import com.mybigcommerce.demo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class CheckoutPageGuestTooLongSingularInput extends BasePage{

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

    //invalid guest shipping address input data - too long singular input
    private String tooLongGuestEmail;
    private String tooLongShippingGuestFirstName;
    private String tooLongShippingGuestLastName;
    private String tooLongShippingGuestAddress;
    private String tooLongShippingGuestCity;
    private int tooLongShippingGuestPostCode;
    private String tooLongShippingGuestPhone;

    //valid guest billing address input data (for remaining inputs)
    private String validBillingGuestFirstName;
    private String validBillingGuestLastName;
    private String validBillingGuestAddress;
    private String validBillingGuestCity;
    private String validBillingGuestPostCode;
    private String validBillingGuestPhone;

    //invalid guest billing address input data - too long singular input
    private String tooLongBillingGuestFirstName;
    private String tooLongBillingGuestLastName;
    private String tooLongBillingGuestAddress;
    private String tooLongBillingGuestCity;
    private int tooLongBillingGuestPostCode;
    private String tooLongBillingGuestPhone;

    //valid guest payment section input data (for remaining inputs)
    private String validTestCreditCardNumber = "4111 1111 1111 1111"; //only this number is functional
    private String validGuestCreditCardExpDate;
    private String validGuestCreditCardName;
    private String validGuestCreditCardCVVNumber;

    //invalid guest payment section input data - too long singular input
    private String tooLongTestCreditCardNumber ; //17 digits
    private String tooLongGuestCreditCardExpDate;
    private String tooLongGuestCreditCardName;
    private String tooLongGuestCreditCardCVVNumber;

    public CheckoutPageGuestTooLongSingularInput(WebDriver driver) {super(driver);}

    //invalid guest email address input data getter - too long email (100 chars -> name, domain)
    public void invalidGuestTooLongEmailInputDataGetter(){

        tooLongGuestEmail = TestDataGenerator.generateRandomTooLongEmailAddress(100);

        System.out.println("Invalid generated checkout guest email address (too long guest email): " + "\n");

        logger.info("Too long guest shipping address email: " + tooLongGuestEmail);

        System.out.println("\n");

    }

    //shipping address input

    //invalid guest shipping address input data getter - too long shipping first name (100 chars)
    public void invalidGuestShipAddressInputDataTooLongFirstNameGetter(){

        tooLongShippingGuestFirstName = "Shfgdsgdtwetrtjdsfgrfdgjhkjmngbfdsfffhkjgsedhgtfgsdetgtujyhgdsfgdfhtgfsdfdffgdsgfgfdgdsfgfdhgfdhgdfd";
        validShippingGuestLastName = TestDataGenerator.getRandomLastName();
        validShippingGuestAddress = TestDataGenerator.generateRandomAddress(8);
        validShippingGuestPhone = TestDataGenerator.generatePhoneNumber(9);

        System.out.println("Invalid generated checkout guest shipping address input data (too long shipping first name): " + "\n");

        logger.info("Too long shipping address first name: " + tooLongShippingGuestFirstName);
        logger.info("Valid guest shipping address last name (too long shipping first name): " + validShippingGuestLastName);
        logger.info("Valid guest shipping address (too long shipping first name): " + validShippingGuestAddress);
        logger.info("Valid guest shipping address phone number (too long shipping first name): " + validShippingGuestPhone);

        System.out.println("\n");

    }

    //invalid guest shipping address input data getter - too long shipping last name (100 chars)
    public void invalidGuestShipAddressInputDataTooLongLastNameGetter(){

        validShippingGuestFirstName = TestDataGenerator.getRandomFirstName();
        tooLongShippingGuestLastName = "Ahfgdsgdtwetrtjdsfgrfdgjhkjmngbfdsfffhkjgsedhgtfgsdetgtujyhgdsfgdfhtgfsdfdffgdsgfgfdgdsfgfdhgfdhgdfd";
        validShippingGuestAddress = TestDataGenerator.generateRandomAddress(8);
        validShippingGuestPhone = TestDataGenerator.generatePhoneNumber(9);

        System.out.println("Invalid generated checkout guest shipping address input data (too long shipping last name): " + "\n");

        logger.info("Valid guest shipping address first name (too long shipping last name): " + validShippingGuestFirstName);
        logger.info("Too long shipping address last name: " + tooLongShippingGuestLastName);
        logger.info("Valid guest shipping address (too long shipping last name): " + validShippingGuestAddress);
        logger.info("Valid guest shipping address phone number (too long shipping last name): " + validShippingGuestPhone);

        System.out.println("\n");

    }

    //invalid guest shipping address input data getter - too long shipping address (100 chars)
    public void invalidGuestShipAddressInputDataTooLongAddressGetter(){

        validShippingGuestFirstName = TestDataGenerator.getRandomFirstName();
        validShippingGuestLastName = TestDataGenerator.getRandomLastName();
        tooLongShippingGuestAddress = TestDataGenerator.generateRandomAddress(93);
        validShippingGuestPhone = TestDataGenerator.generatePhoneNumber(9);

        System.out.println("Invalid generated checkout guest shipping address input data (too long shipping address): " + "\n");

        logger.info("Valid guest shipping address first name (too long shipping address): " + validShippingGuestFirstName);
        logger.info("Valid guest shipping address last name (too long shipping address): " + validShippingGuestLastName);
        logger.info("Too long shipping address: " + tooLongShippingGuestAddress);
        logger.info("Valid guest shipping address phone number (too long shipping address): " + validShippingGuestPhone);

        System.out.println("\n");

    }

    //invalid guest shipping address input data getter - too long shipping city (100 chars)
    public void invalidGuestShipAddressInputDataTooLongCityGetter(){

        validShippingGuestFirstName = TestDataGenerator.getRandomFirstName();
        validShippingGuestLastName = TestDataGenerator.getRandomLastName();
        validShippingGuestAddress = TestDataGenerator.generateRandomAddress(8);
        tooLongShippingGuestCity = "Rhfgdsgdtwetrtjdsfgrfdgjhkjmngbfdsfffhkjgsedhgtfgsdetgtujyhgdsfgdfhtgfsdfdffgdsgfgfdgdsfgfdhgfdhgdfd";
        validShippingGuestPhone = TestDataGenerator.generatePhoneNumber(9);

        System.out.println("Invalid generated checkout guest shipping address input data (too long shipping city): " + "\n");

        logger.info("Valid guest shipping address first name (too short shipping city): " + validShippingGuestFirstName);
        logger.info("Valid guest shipping address last name (too short shipping city): " + validShippingGuestLastName);
        logger.info("Valid guest shipping address (too short shipping city): " + validShippingGuestAddress);
        logger.info("Too short shipping city: " + tooLongShippingGuestCity);
        logger.info("Valid guest shipping address phone number (too short shipping city): " + validShippingGuestPhone);

        System.out.println("\n");

    }

    //invalid guest shipping address input data getter - too long shipping post code (6 digits)
    public void invalidGuestShipAddressInputDataTooLongPostCodeGetter(){

        validShippingGuestFirstName = TestDataGenerator.getRandomFirstName();
        validShippingGuestLastName = TestDataGenerator.getRandomLastName();
        validShippingGuestAddress = TestDataGenerator.generateRandomAddress(8);
        tooLongShippingGuestPostCode = 925643;
        validShippingGuestPhone = TestDataGenerator.generatePhoneNumber(9);

        System.out.println("Invalid generated checkout guest shipping address input data (too long shipping post code): " + "\n");

        logger.info("Valid guest shipping address first name (too long shipping post code): " + validShippingGuestFirstName);
        logger.info("Valid guest shipping address last name (too long shipping post code): " + validShippingGuestLastName);
        logger.info("Valid guest shipping address (too long shipping post code): " + validShippingGuestAddress);
        logger.info("Too long shipping post code: " + tooLongShippingGuestPostCode);
        logger.info("Valid guest shipping address phone number (too long shipping post code): " + validShippingGuestPhone);

        System.out.println("\n");

    }

    //invalid guest shipping address input data getter - too long shipping phone (30 digits)
    public void invalidGuestShipAddressInputDataTooLongPhoneGetter(){

        validShippingGuestFirstName = TestDataGenerator.getRandomFirstName();
        validShippingGuestLastName = TestDataGenerator.getRandomLastName();
        validShippingGuestAddress = TestDataGenerator.generateRandomAddress(8);
        tooLongShippingGuestPhone = "234458723456789098765432345678";

        System.out.println("Invalid generated checkout guest shipping address input data (too long shipping phone): " + "\n");

        logger.info("Valid guest shipping address first name (too long shipping phone): " + validShippingGuestFirstName);
        logger.info("Valid guest shipping address last name (too long shipping phone): " + validShippingGuestLastName);
        logger.info("Valid guest shipping address (too long shipping phone): " + validShippingGuestAddress);
        logger.info("Too long shipping address phone number: " + tooLongShippingGuestPhone);

        System.out.println("\n");

    }

    //invalid guest email address input method - too long guest email
    public void inputTooLongGuestEmailIntoEmailInputField(){checkoutPageGuestEmailInputField.sendKeys(tooLongGuestEmail);}
    public void inputTooLongShippingGuestFirstNameIntoFirstNameInputField(){checkoutPageShippingFirstNameInputField.sendKeys(tooLongShippingGuestFirstName);}
    public void inputTooLongShippingGuestLastNameIntoLastNameInputField(){checkoutPageShippingLastNameInputField.sendKeys(tooLongShippingGuestLastName);}
    public void inputTooLongShippingGuestAddressIntoAddressInputField(){checkoutPageShippingAddressInputField.sendKeys(tooLongShippingGuestAddress);}

    public void inputTooLongShippingGuestCityIntoCityInputField(){
        checkoutPageShippingCityInputField.clear();
        checkoutPageShippingCityInputField.sendKeys(tooLongShippingGuestCity);
    }
    public void inputTooLongShippingGuestPostCodeIntoPostCodeInputField(){
        checkoutPageShippingPostCodeInputField.clear();
        checkoutPageShippingPostCodeInputField.sendKeys(String.valueOf(tooLongShippingGuestPostCode));
    }

    public void inputTooLongShippingGuestPhoneIntoPhoneInputField(){checkoutPageShippingPhoneInputField.sendKeys(String.valueOf(tooLongShippingGuestPhone));}

    //valid input methods

    //valid guest email address input method (for remaining inputs)
    public void inputValidGuestEmailIntoEmailInputField(){checkoutPageGuestEmailInputField.sendKeys(validGuestEmail);}

    //valid guest shipping data input methods (for remaining inputs)
    public void inputValidShippingGuestFirstNameIntoFirstNameInputField(){checkoutPageShippingFirstNameInputField.sendKeys(validShippingGuestFirstName);}
    public void inputValidShippingGuestLastNameIntoLastNameInputField(){checkoutPageShippingLastNameInputField.sendKeys(validShippingGuestLastName);}
    public void inputValidShippingGuestAddressIntoAddressInputField(){checkoutPageShippingAddressInputField.sendKeys(validShippingGuestAddress);}
    public void inputValidShippingGuestPhoneIntoPhoneInputField(){checkoutPageShippingPhoneInputField.sendKeys(validShippingGuestPhone);}

    //billing address input

    //invalid guest billing address input data getter - too long billing first name (100 chars)
    public void invalidGuestBillAddressInputDataTooLongFirstNameGetter(){

        tooLongBillingGuestFirstName = "Dhfgdsgdtwetrtjdsfgrfdgjhkjmngbfdsfffhkjgsedhgtfgsdetgtujyhgdsfgdfhtgfsdfdffgdsgfgfdgdsfgfdhgfdhgdfd";
        validBillingGuestLastName = TestDataGenerator.getRandomLastName();
        validBillingGuestAddress = TestDataGenerator.generateRandomAddress(8);
        validBillingGuestCity = TestDataGenerator.getRandomCity();
        validBillingGuestPostCode = String.valueOf(TestDataGenerator.getRandomPostalCode());
        validBillingGuestPhone = TestDataGenerator.generatePhoneNumber(9);

        System.out.println("Invalid generated checkout guest billing address input data (too long billing first name): " + "\n");

        logger.info("Too long billing address first name: " + tooLongBillingGuestFirstName);
        logger.info("Valid guest billing address last name (too long billing first name): " + validBillingGuestLastName);
        logger.info("Valid guest billing address (too long billing first name): " + validBillingGuestAddress);
        logger.info("Valid guest billing address city (too long billing first name): " + validBillingGuestCity);
        logger.info("Valid guest billing address post code (too long billing first name): " + validBillingGuestPostCode);
        logger.info("Valid guest billing address phone number (too long billing first name): " + validBillingGuestPhone);

        System.out.println("\n");

    }

    //invalid guest billing address input data getter - too long billing last name (100 chars)
    public void invalidGuestBillAddressInputDataTooLongLastNameGetter(){

        validBillingGuestFirstName = TestDataGenerator.getRandomFirstName();
        tooLongBillingGuestLastName = "Shfgdsgdtwetrtjdsfgrfdgjhkjmngbfdsfffhkjgsedhgtfgsdetgtujyhgdsfgdfhtgfsdfdffgdsgfgfdgdsfgfdhgfdhgdfd";
        validBillingGuestAddress = TestDataGenerator.generateRandomAddress(8);
        validBillingGuestCity = TestDataGenerator.getRandomCity();
        validBillingGuestPostCode = String.valueOf(TestDataGenerator.getRandomPostalCode());
        validBillingGuestPhone = TestDataGenerator.generatePhoneNumber(9);

        System.out.println("Invalid generated checkout guest billing address input data (too long billing last name): " + "\n");

        logger.info("Valid guest billing address first name (too long billing last name): " + validBillingGuestFirstName);
        logger.info("Too long billing address last name: " + tooLongBillingGuestLastName);
        logger.info("Valid guest billing address (too long billing last name): " + validBillingGuestAddress);
        logger.info("Valid guest billing address city (too long billing last name): " + validBillingGuestCity);
        logger.info("Valid guest billing address post code (too long billing last name): " + validBillingGuestPostCode);
        logger.info("Valid guest billing address phone number (too long billing last name): " + validBillingGuestPhone);

        System.out.println("\n");

    }

    //invalid guest billing address input data getter - too long billing address (100 chars)
    public void invalidGuestBillAddressInputDataTooLongAddressGetter(){

        validBillingGuestFirstName = TestDataGenerator.getRandomFirstName();
        validBillingGuestLastName = TestDataGenerator.getRandomLastName();
        tooLongBillingGuestAddress = TestDataGenerator.generateRandomAddress(93);
        validBillingGuestCity = TestDataGenerator.getRandomCity();
        validBillingGuestPostCode = String.valueOf(TestDataGenerator.getRandomPostalCode());
        validBillingGuestPhone = TestDataGenerator.generatePhoneNumber(9);

        System.out.println("Invalid generated checkout guest billing address input data (too long billing address): " + "\n");

        logger.info("Valid guest billing address first name (too long billing address): " + validBillingGuestFirstName);
        logger.info("Valid guest billing address last name (too long billing address): " + validBillingGuestLastName);
        logger.info("Too long billing address: " + tooLongBillingGuestAddress);
        logger.info("Valid guest billing address city (too long billing address): " + validBillingGuestCity);
        logger.info("Valid guest billing address post code (too long billing address): " + validBillingGuestPostCode);
        logger.info("Valid guest billing address phone number (too long billing address): " + validBillingGuestPhone);

        System.out.println("\n");

    }

    //invalid guest billing address input data getter - too long billing city (100 chars)
    public void invalidGuestBillAddressInputDataTooLongCityGetter(){

        validBillingGuestFirstName = TestDataGenerator.getRandomFirstName();
        validBillingGuestLastName = TestDataGenerator.getRandomLastName();
        validBillingGuestAddress = TestDataGenerator.generateRandomAddress(8);
        tooLongBillingGuestCity = "Shfgdsgdtwetrtjdsfgrfdgjhkjmngbfdsfffhkjgsedhgtfgsdetgtujyhgdsfgdfhtgfsdfdffgdsgfgfdgdsfgfdhgfdhgdfd";
        validBillingGuestPostCode = String.valueOf(TestDataGenerator.getRandomPostalCode());
        validBillingGuestPhone = TestDataGenerator.generatePhoneNumber(9);

        System.out.println("Invalid generated checkout guest billing address input data (too long billing city): " + "\n");

        logger.info("Valid guest billing address first name (too long billing city): " + validBillingGuestFirstName);
        logger.info("Valid guest billing address last name (too long billing city): " + validBillingGuestLastName);
        logger.info("Valid guest billing address (too long billing city): " + validBillingGuestAddress);
        logger.info("Too long billing address city: " + tooLongBillingGuestCity);
        logger.info("Valid guest billing address post code (too long billing city): " + validBillingGuestPostCode);
        logger.info("Valid guest billing address phone number (too long billing city): " + validBillingGuestPhone);

        System.out.println("\n");

    }

    //invalid guest billing address input data getter - too long billing post code (6 digits)
    public void invalidGuestBillAddressInputDataTooLongPostCodeGetter(){

        validBillingGuestFirstName = TestDataGenerator.getRandomFirstName();
        validBillingGuestLastName = TestDataGenerator.getRandomLastName();
        validBillingGuestAddress = TestDataGenerator.generateRandomAddress(8);
        validBillingGuestCity = TestDataGenerator.getRandomCity();
        tooLongBillingGuestPostCode = 786943;
        validBillingGuestPhone = TestDataGenerator.generatePhoneNumber(9);

        System.out.println("Invalid generated checkout guest billing address input data (too long billing post code): " + "\n");

        logger.info("Valid guest billing address first name (too long billing post code): " + validBillingGuestFirstName);
        logger.info("Valid guest billing address last name (too long billing post code): " + validBillingGuestLastName);
        logger.info("Valid guest billing address (too long billing post code): " + validBillingGuestAddress);
        logger.info("Valid guest billing address city (too long billing post code): " + validBillingGuestCity);
        logger.info("Too long billing address post code: " + tooLongBillingGuestPostCode);
        logger.info("Valid guest billing address phone number (too long billing post code): " + validBillingGuestPhone);

        System.out.println("\n");

    }

    //invalid guest billing address input data getter - too long billing phone (30 digits)
    public void invalidGuestBillAddressInputDataTooLongPhoneGetter(){

        validBillingGuestFirstName = TestDataGenerator.getRandomFirstName();
        validBillingGuestLastName = TestDataGenerator.getRandomLastName();
        validBillingGuestAddress = TestDataGenerator.generateRandomAddress(8);
        validBillingGuestCity = TestDataGenerator.getRandomCity();
        validBillingGuestPostCode = String.valueOf(TestDataGenerator.getRandomPostalCode());
        tooLongBillingGuestPhone = "234458723456789098765432345678";

        System.out.println("Invalid generated checkout guest billing address input data (too long billing phone): " + "\n");

        logger.info("Valid guest billing address first name (too long billing phone): " + validBillingGuestFirstName);
        logger.info("Valid guest billing address last name (too long billing phone): " + validBillingGuestLastName);
        logger.info("Valid guest billing address (too long billing phone): " + validBillingGuestAddress);
        logger.info("Valid guest billing address city (too long billing phone): " + validBillingGuestCity);
        logger.info("Valid guest billing address post code (too long billing phone): " + validBillingGuestPostCode);
        logger.info("Too long billing address phone number: " + tooLongBillingGuestPhone);

        System.out.println("\n");

    }

    //invalid guest billing address data input methods - too long singular inputs
    public void inputTooLongBillingGuestFirstNameIntoFirstNameInputField(){checkoutPageBillingFirstNameInputField.sendKeys(tooLongBillingGuestFirstName);}
    public void inputTooLongBillingGuestLastNameIntoLastNameInputField(){checkoutPageBillingLastNameInputField.sendKeys(tooLongBillingGuestLastName);}

    public void inputTooLongBillingGuestAddressIntoAddressInputField(){
        checkoutPageBillingAddressInputField.clear();
        checkoutPageBillingAddressInputField.sendKeys(tooLongBillingGuestAddress);
    }
    public void inputTooLongBillingGuestCityIntoCityInputField(){
        checkoutPageBillingCityInputField.clear();
        checkoutPageBillingCityInputField.sendKeys(tooLongBillingGuestCity);
    }
    public void inputTooLongBillingGuestPostCodeIntoPostCodeInputField(){
        checkoutPageBillingPostCodeInputField.clear();
        checkoutPageBillingPostCodeInputField.sendKeys(String.valueOf(tooLongBillingGuestPostCode));
    }
    public void inputTooLongBillingGuestPhoneIntoPhoneInputField(){
        checkoutPageBillingPhoneInputField.clear();
        checkoutPageBillingPhoneInputField.sendKeys(String.valueOf(tooLongBillingGuestPhone));
    }

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

    //invalid guest payment input data getter - too long guest credit card number (17 digits)
    public void invalidGuestPaymentInputDataTooLongCredCardNumberGetter(){

        tooLongTestCreditCardNumber = "41111111111111111";
        validGuestCreditCardExpDate = TestDataGenerator.generateExpirationDate();
        validGuestCreditCardName = TestDataGenerator.getRandomFirstName() + " " + TestDataGenerator.getRandomLastName();
        validGuestCreditCardCVVNumber = TestDataGenerator.generateCVV();

        System.out.println("Invalid generated checkout guest payment input data (too long guest credit card number): " + "\n");

        logger.info("Too long test credit card number: " + tooLongTestCreditCardNumber);
        logger.info("Valid guest credit card expiration date (too long guest credit card number): " + validGuestCreditCardExpDate);
        logger.info("Valid guest credit card full name (too long guest credit card number): " + validGuestCreditCardName);
        logger.info("Valid guest credit card CVV number (too long guest credit card number): " + validGuestCreditCardCVVNumber);

        System.out.println("\n");

    }

    //invalid guest payment input data getter - too long guest credit card exp date (5 digits)
    public void invalidGuestPaymentInputDataTooLongCredCardExpDateGetter(){

        tooLongGuestCreditCardExpDate = "11/119";
        validGuestCreditCardName = TestDataGenerator.getRandomFirstName() + " " + TestDataGenerator.getRandomLastName();
        validGuestCreditCardCVVNumber = TestDataGenerator.generateCVV();

        System.out.println("Invalid generated checkout guest payment input data (too long guest credit card exp date): " + "\n");

        logger.info("Valid test credit card number (too long guest credit card exp date): " + validTestCreditCardNumber);
        logger.info("Too long guest credit card expiration date: " + tooLongGuestCreditCardExpDate);
        logger.info("Valid guest credit card full name (too long guest credit card exp date): " + validGuestCreditCardName);
        logger.info("Valid guest credit card CVV number (too long guest credit card exp date): " + validGuestCreditCardCVVNumber);

        System.out.println("\n");

    }

    //invalid guest payment input data getter - too long guest credit card name (100 chars)
    public void invalidGuestPaymentInputDataTooLongCreditCardNameGetter(){

        validGuestCreditCardExpDate = TestDataGenerator.generateExpirationDate();
        tooLongGuestCreditCardName =  "Ghfgdsgdtwetrtjdsfgrfdgjhkjmngbfdsfffhkjgsedhgtfgsdetgtujyhgdsfgdfhtgfsdfdffgdsgfgfdgdsfgfdhgfdhgdfd" ;
        validGuestCreditCardCVVNumber = TestDataGenerator.generateCVV();

        System.out.println("Invalid generated checkout guest payment input data (too long guest credit card name): " + "\n");

        logger.info("Valid test credit card number (too long guest credit card name): " + validTestCreditCardNumber);
        logger.info("Valid guest credit card expiration date (too long guest credit card name): " + validGuestCreditCardExpDate);
        logger.info("Too long credit card full name: " + tooLongGuestCreditCardName);
        logger.info("Valid guest credit card CVV number (too long guest credit card name): " + validGuestCreditCardCVVNumber);

        System.out.println("\n");

    }

    //invalid guest payment input data getter - too long guest credit card CVV number (4 digits)
    public void invalidGuestPaymentInputDataTooLongCVVGetter(){

        validGuestCreditCardExpDate = TestDataGenerator.generateExpirationDate();
        validGuestCreditCardName = TestDataGenerator.getRandomFirstName() + " " + TestDataGenerator.getRandomLastName();
        tooLongGuestCreditCardCVVNumber = "3421";

        System.out.println("Invalid generated checkout guest payment input data (too long guest credit card CVV number): " + "\n");

        logger.info("Valid test credit card number (too long guest credit card CVV number): " + validTestCreditCardNumber);
        logger.info("Valid guest credit card expiration date (too long guest credit card CVV number): " + validGuestCreditCardExpDate);
        logger.info("Valid guest credit card full name (too long guest credit card CVV number): " + validGuestCreditCardName);
        logger.info("Too long guest credit card CVV number: " + tooLongGuestCreditCardCVVNumber);

        System.out.println("\n");

    }

    //invalid guest payment data input methods - too long singular input
    public void inputTooLongPaymentTestCreditCardNumberIntoCreditCardNumberInputField(){checkoutPagePaymentCreditCardNumberInputField.sendKeys(tooLongTestCreditCardNumber);}
    public void inputTooLongPaymentGuestCreditCardExpDateIntoCreditCardExpDateInputField(){checkoutPagePaymentCreditCardExpDateInputField.sendKeys(tooLongGuestCreditCardExpDate);}
    public void inputTooLongPaymentGuestCreditCardNameIntoCreditCardNameInputField(){checkoutPagePaymentCreditCardNameInputField.sendKeys(tooLongGuestCreditCardName);}
    public void inputTooLongPaymentGuestCreditCardCVVIntoCreditCardCVVInputField(){checkoutPagePaymentCVVNumberInputField.sendKeys(tooLongGuestCreditCardCVVNumber);}

    //valid guest payment data input methods
    public void inputValidPaymentTestCreditCardNumberIntoCreditCardNumberInputField(){checkoutPagePaymentCreditCardNumberInputField.sendKeys(validTestCreditCardNumber);}
    public void inputValidPaymentGuestCreditCardNameIntoCreditCardNameInputField(){checkoutPagePaymentCreditCardNameInputField.sendKeys(validGuestCreditCardName);}
    public void inputValidPaymentGuestCreditCardExpDateIntoCreditCardExpDateInputField(){checkoutPagePaymentCreditCardExpDateInputField.sendKeys(validGuestCreditCardExpDate);}
    public void inputValidPaymentGuestCreditCardCVVIntoCreditCardCVVInputField(){checkoutPagePaymentCVVNumberInputField.sendKeys(validGuestCreditCardCVVNumber);}

}
