package com.mybigcommerce.demo.checkoutpageguestinvalidscenarios;

import com.mybigcommerce.demo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class CheckoutPageGuestTooShortSingularInput extends BasePage{

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

    //invalid guest shipping address input data - too short singular input
    private String tooShortGuestEmail;
    private String tooShortShippingGuestFirstName;
    private String tooShortShippingGuestLastName;
    private String tooShortShippingGuestAddress;
    private String tooShortShippingGuestCity;
    private int tooShortShippingGuestPostCode;
    private int tooShortShippingGuestPhone;

    //valid guest billing address input data (for remaining inputs)
    private String validBillingGuestFirstName;
    private String validBillingGuestLastName;
    private String validBillingGuestAddress;
    private String validBillingGuestCity;
    private String validBillingGuestPostCode;
    private String validBillingGuestPhone;

    //invalid guest billing address input data - too short singular input
    private String tooShortBillingGuestFirstName;
    private String tooShortBillingGuestLastName;

    public CheckoutPageGuestTooShortSingularInput(WebDriver driver) {super(driver);}

    //invalid guest email address input data getter - too short email (1 char -> name, domain)
    public void invalidGuestTooShortEmailInputDataGetter(){

        tooShortGuestEmail = TestDataGenerator.generateRandomTooShortEmailAddress(1);

        System.out.println("Invalid generated checkout guest email address (too short guest email): " + "\n");

        logger.info("Too short guest shipping address email: " + tooShortGuestEmail);

        System.out.println("\n");

    }

    //invalid guest email address input method - too short guest email
    public void inputTooShortGuestEmailIntoEmailInputField(){checkoutPageGuestEmailInputField.sendKeys(tooShortGuestEmail);}

    //shipping address input

    //invalid guest shipping address input data getter - too short shipping first name (1 char)
    public void invalidGuestShipAddressInputDataTooShortFirstNameGetter(){

        tooShortShippingGuestFirstName = "S";
        validShippingGuestLastName = TestDataGenerator.getRandomLastName();
        validShippingGuestAddress = TestDataGenerator.generateRandomAddress(8);
        validShippingGuestPhone = TestDataGenerator.generatePhoneNumber(9);

        System.out.println("Invalid generated checkout guest shipping address input data (too short shipping first name): " + "\n");

        logger.info("Too short shipping address first name: " + tooShortShippingGuestFirstName);
        logger.info("Valid guest shipping address last name (too short shipping first name): " + validShippingGuestLastName);
        logger.info("Valid guest shipping address (too short shipping first name): " + validShippingGuestAddress);
        logger.info("Valid guest shipping address phone number (too short shipping first name): " + validShippingGuestPhone);

        System.out.println("\n");

    }

    //invalid guest shipping address input data getter - too short shipping last name
    public void invalidGuestShipAddressInputDataTooShortLastNameGetter(){

        validShippingGuestFirstName = TestDataGenerator.getRandomFirstName();
        tooShortShippingGuestLastName = "A";
        validShippingGuestAddress = TestDataGenerator.generateRandomAddress(8);
        validShippingGuestPhone = TestDataGenerator.generatePhoneNumber(9);

        System.out.println("Invalid generated checkout guest shipping address input data (too short shipping last name): " + "\n");

        logger.info("Valid guest shipping address first name (too short shipping last name): " + validShippingGuestFirstName);
        logger.info("Too short shipping address last name: " + tooShortShippingGuestLastName);
        logger.info("Valid guest shipping address (too short shipping last name): " + validShippingGuestAddress);
        logger.info("Valid guest shipping address phone number (too short shipping last name): " + validShippingGuestPhone);

        System.out.println("\n");

    }

    //invalid guest shipping address input data getter - too short shipping address (3 chars)
    public void invalidGuestShipAddressInputDataTooShortAddressGetter(){

        validShippingGuestFirstName = TestDataGenerator.getRandomFirstName();
        validShippingGuestLastName = TestDataGenerator.getRandomLastName();
        tooShortShippingGuestAddress = "2.R";
        validShippingGuestPhone = TestDataGenerator.generatePhoneNumber(9);

        System.out.println("Invalid generated checkout guest shipping address input data (too short shipping address): " + "\n");

        logger.info("Valid guest shipping address first name (too short shipping address): " + validShippingGuestFirstName);
        logger.info("Valid guest shipping address last name (too short shipping address): " + validShippingGuestLastName);
        logger.info("Too short shipping address: " + tooShortShippingGuestAddress);
        logger.info("Valid guest shipping address phone number (too short shipping address): " + validShippingGuestPhone);

        System.out.println("\n");

    }

    //invalid guest shipping address input data getter - too short shipping city (1 char)
    public void invalidGuestShipAddressInputDataTooShortCityGetter(){

        validShippingGuestFirstName = TestDataGenerator.getRandomFirstName();
        validShippingGuestLastName = TestDataGenerator.getRandomLastName();
        validShippingGuestAddress = TestDataGenerator.generateRandomAddress(8);
        tooShortShippingGuestCity = "R";
        validShippingGuestPhone = TestDataGenerator.generatePhoneNumber(9);

        System.out.println("Invalid generated checkout guest shipping address input data (too short shipping city): " + "\n");

        logger.info("Valid guest shipping address first name (too short shipping city): " + validShippingGuestFirstName);
        logger.info("Valid guest shipping address last name (too short shipping city): " + validShippingGuestLastName);
        logger.info("Valid guest shipping address (too short shipping city): " + validShippingGuestAddress);
        logger.info("Too short shipping city: " + tooShortShippingGuestCity);
        logger.info("Valid guest shipping address phone number (too short shipping city): " + validShippingGuestPhone);

        System.out.println("\n");

    }

    //invalid guest shipping address input data getter - too short shipping post code (4 digits)
    public void invalidGuestShipAddressInputDataTooShortPostCodeGetter(){

        validShippingGuestFirstName = TestDataGenerator.getRandomFirstName();
        validShippingGuestLastName = TestDataGenerator.getRandomLastName();
        validShippingGuestAddress = TestDataGenerator.generateRandomAddress(8);
        tooShortShippingGuestPostCode = 5643;
        validShippingGuestPhone = TestDataGenerator.generatePhoneNumber(9);

        System.out.println("Invalid generated checkout guest shipping address input data (too short shipping post code): " + "\n");

        logger.info("Valid guest shipping address first name (too short shipping post code): " + validShippingGuestFirstName);
        logger.info("Valid guest shipping address last name (too short shipping post code): " + validShippingGuestLastName);
        logger.info("Valid guest shipping address (too short shipping post code): " + validShippingGuestAddress);
        logger.info("Too short shipping post code: " + tooShortShippingGuestPostCode);
        logger.info("Valid guest shipping address phone number (too short shipping post code): " + validShippingGuestPhone);

        System.out.println("\n");

    }

    //invalid guest shipping address input data getter - too short shipping phone (2 digits)
    public void invalidGuestShipAddressInputDataTooShortPhoneGetter(){

        validShippingGuestFirstName = TestDataGenerator.getRandomFirstName();
        validShippingGuestLastName = TestDataGenerator.getRandomLastName();
        validShippingGuestAddress = TestDataGenerator.generateRandomAddress(8);
        tooShortShippingGuestPhone = 45;

        System.out.println("Invalid generated checkout guest shipping address input data (too short shipping phone): " + "\n");

        logger.info("Valid guest shipping address first name (too short shipping phone): " + validShippingGuestFirstName);
        logger.info("Valid guest shipping address last name (too short shipping phone): " + validShippingGuestLastName);
        logger.info("Valid guest shipping address (too short shipping phone): " + validShippingGuestAddress);
        logger.info("Too short shipping address phone number: " + tooShortShippingGuestPhone);

        System.out.println("\n");

    }

    //invalid guest shipping data input methods - too short singular input
    public void inputTooShortShippingGuestFirstNameIntoFirstNameInputField(){checkoutPageShippingFirstNameInputField.sendKeys(tooShortShippingGuestFirstName);}
    public void inputTooShortShippingGuestLastNameIntoLastNameInputField(){checkoutPageShippingLastNameInputField.sendKeys(tooShortShippingGuestLastName);}
    public void inputTooShortShippingGuestAddressIntoAddressInputField(){checkoutPageShippingAddressInputField.sendKeys(tooShortShippingGuestAddress);}

    public void inputTooShortShippingGuestCityIntoCityInputField(){
        checkoutPageShippingCityInputField.clear();
        checkoutPageShippingCityInputField.sendKeys(tooShortShippingGuestCity);
    }
    public void inputTooShortShippingGuestPostCodeIntoPostCodeInputField(){
        checkoutPageShippingPostCodeInputField.clear();
        checkoutPageShippingPostCodeInputField.sendKeys(String.valueOf(tooShortShippingGuestPostCode));
    }

    public void inputTooShortShippingGuestPhoneIntoPhoneInputField(){checkoutPageShippingPhoneInputField.sendKeys(String.valueOf(tooShortShippingGuestPhone));}

    //valid guest email address input method (for remaining inputs)
    public void inputValidGuestEmailIntoEmailInputField(){checkoutPageGuestEmailInputField.sendKeys(validGuestEmail);}

    //valid guest shipping data input methods (for remaining inputs)
    public void inputValidShippingGuestFirstNameIntoFirstNameInputField(){checkoutPageShippingFirstNameInputField.sendKeys(validShippingGuestFirstName);}
    public void inputValidShippingGuestLastNameIntoLastNameInputField(){checkoutPageShippingLastNameInputField.sendKeys(validShippingGuestLastName);}
    public void inputValidShippingGuestAddressIntoAddressInputField(){checkoutPageShippingAddressInputField.sendKeys(validShippingGuestAddress);}
    public void inputValidShippingGuestPhoneIntoPhoneInputField(){checkoutPageShippingPhoneInputField.sendKeys(validShippingGuestPhone);}

    //billing address input

    //invalid guest billing address input data getter - too short billing first name (1 char)
    public void invalidGuestBillAddressInputDataTooShortFirstNameGetter(){

        tooShortBillingGuestFirstName = "D";
        validBillingGuestLastName = TestDataGenerator.getRandomLastName();
        validBillingGuestAddress = TestDataGenerator.generateRandomAddress(8);
        validBillingGuestCity = TestDataGenerator.getRandomCity();
        validBillingGuestPostCode = String.valueOf(TestDataGenerator.getRandomPostalCode());
        validBillingGuestPhone = TestDataGenerator.generatePhoneNumber(9);

        System.out.println("Invalid generated checkout guest billing address input data (too short billing first name): " + "\n");

        logger.info("Too short billing address first name: " + tooShortBillingGuestFirstName);
        logger.info("Valid guest billing address last name (too short billing first name): " + validBillingGuestLastName);
        logger.info("Valid guest billing address (too short billing first name): " + validBillingGuestAddress);
        logger.info("Valid guest billing address city (too short billing first name): " + validBillingGuestCity);
        logger.info("Valid guest billing address post code (too short billing first name): " + validBillingGuestPostCode);
        logger.info("Valid guest billing address phone number (too short billing first name): " + validBillingGuestPhone);

        System.out.println("\n");

    }

    //invalid guest billing address input data getter - too short billing last name (1 char)
    public void invalidGuestBillAddressInputDataTooShortLastNameGetter(){

        validBillingGuestFirstName = TestDataGenerator.getRandomFirstName();
        tooShortBillingGuestLastName = "S";
        validBillingGuestAddress = TestDataGenerator.generateRandomAddress(8);
        validBillingGuestCity = TestDataGenerator.getRandomCity();
        validBillingGuestPostCode = String.valueOf(TestDataGenerator.getRandomPostalCode());
        validBillingGuestPhone = TestDataGenerator.generatePhoneNumber(9);

        System.out.println("Invalid generated checkout guest billing address input data (too short billing last name): " + "\n");

        logger.info("Valid guest billing address first name (too short billing last name): " + validBillingGuestFirstName);
        logger.info("Too short billing address last name: " + tooShortBillingGuestLastName);
        logger.info("Valid guest billing address (too short billing last name): " + validBillingGuestAddress);
        logger.info("Valid guest billing address city (too short billing last name): " + validBillingGuestCity);
        logger.info("Valid guest billing address post code (too short billing last name): " + validBillingGuestPostCode);
        logger.info("Valid guest billing address phone number (too short billing last name): " + validBillingGuestPhone);

        System.out.println("\n");

    }

    //invalid guest billing address data input methods - too short singular input
    public void inputTooShortBillingGuestFirstNameIntoFirstNameInputField(){checkoutPageBillingFirstNameInputField.sendKeys(tooShortBillingGuestFirstName);}
    public void inputTooShortBillingGuestLastNameIntoLastNameInputField(){checkoutPageBillingLastNameInputField.sendKeys(tooShortBillingGuestLastName);}

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

}
