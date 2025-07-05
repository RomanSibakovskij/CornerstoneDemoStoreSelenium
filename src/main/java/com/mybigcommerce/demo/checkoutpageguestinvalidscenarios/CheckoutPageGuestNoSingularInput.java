package com.mybigcommerce.demo.checkoutpageguestinvalidscenarios;

import com.mybigcommerce.demo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class CheckoutPageGuestNoSingularInput extends BasePage {

    //checkout page web elements (relevant web element only)
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

    //invalid guest shipping address input data - no singular input (for remaining inputs)
    private String noGuestEmail;
    private String noShippingGuestFirstName;
    private String noShippingGuestLastName;
    private String noShippingGuestAddress;
    private String noShippingGuestCity;
    private String noShippingGuestPostCode;
    private String noShippingGuestPhone;

    //valid guest billing address input data (for remaining inputs)
    private String validBillingGuestFirstName;
    private String validBillingGuestLastName;
    private String validBillingGuestAddress;
    private String validBillingGuestCity;
    private String validBillingGuestPostCode;
    private String validBillingGuestPhone;

    //invalid guest billing address input data - no singular input (for remaining inputs)
    private String noBillingGuestFirstName;
    private String noBillingGuestLastName;
    private String noBillingGuestAddress;
    private String noBillingGuestCity;

    public CheckoutPageGuestNoSingularInput(WebDriver driver) {super(driver);}

    //invalid guest email address input data getter - no email
    public void invalidGuestNoEmailInputDataGetter(){

        noGuestEmail = "";

        System.out.println("Invalid generated checkout guest email address (no guest email): " + "\n");

        logger.info("No guest shipping address email: " + noGuestEmail);

        System.out.println("\n");

    }

    //invalid guest email address input method - no guest email
    public void inputNoGuestEmailIntoEmailInputField(){checkoutPageGuestEmailInputField.sendKeys(noGuestEmail);}

    //shipping address input

    //invalid guest shipping address input data getter - no shipping first name
    public void invalidGuestShipAddressInputDataNoFirstNameGetter(){

        noShippingGuestFirstName = "";
        validShippingGuestLastName = TestDataGenerator.getRandomLastName();
        validShippingGuestAddress = TestDataGenerator.generateRandomAddress(8);
        validShippingGuestPhone = TestDataGenerator.generatePhoneNumber(9);

        System.out.println("Invalid generated checkout guest shipping address input data (no shipping first name): " + "\n");

        logger.info("No shipping address first name: " + noShippingGuestFirstName);
        logger.info("Valid guest shipping address last name (no shipping first name): " + validShippingGuestLastName);
        logger.info("Valid guest shipping address (no shipping first name): " + validShippingGuestAddress);
        logger.info("Valid guest shipping address phone number (no shipping first name): " + validShippingGuestPhone);

        System.out.println("\n");

    }

    //invalid guest shipping address input data getter - no shipping last name
    public void invalidGuestShipAddressInputDataNoLastNameGetter(){

        validShippingGuestFirstName = TestDataGenerator.getRandomFirstName();
        noShippingGuestLastName = "";
        validShippingGuestAddress = TestDataGenerator.generateRandomAddress(8);
        validShippingGuestPhone = TestDataGenerator.generatePhoneNumber(9);

        System.out.println("Invalid generated checkout guest shipping address input data (no shipping last name): " + "\n");

        logger.info("Valid guest shipping address first name (no shipping last name): " + validShippingGuestFirstName);
        logger.info("No shipping address last name: " + noShippingGuestLastName);
        logger.info("Valid guest shipping address (no shipping last name): " + validShippingGuestAddress);
        logger.info("Valid guest shipping address phone number (no shipping last name): " + validShippingGuestPhone);

        System.out.println("\n");

    }

    //invalid guest shipping address input data getter - no shipping address
    public void invalidGuestShipAddressInputDataNoAddressGetter(){

        validShippingGuestFirstName = TestDataGenerator.getRandomFirstName();
        validShippingGuestLastName = TestDataGenerator.getRandomLastName();
        noShippingGuestAddress = "";
        validShippingGuestPhone = TestDataGenerator.generatePhoneNumber(9);

        System.out.println("Invalid generated checkout guest shipping address input data (no shipping address): " + "\n");

        logger.info("Valid guest shipping address first name (no shipping address): " + validShippingGuestFirstName);
        logger.info("Valid guest shipping address last name (no shipping address): " + validShippingGuestLastName);
        logger.info("No shipping address: " + noShippingGuestAddress);
        logger.info("Valid guest shipping address phone number (no shipping address): " + validShippingGuestPhone);

        System.out.println("\n");

    }

    //invalid guest shipping address input data getter - no shipping city
    public void invalidGuestShipAddressInputDataNoCityGetter(){

        validShippingGuestFirstName = TestDataGenerator.getRandomFirstName();
        validShippingGuestLastName = TestDataGenerator.getRandomLastName();
        validShippingGuestAddress = TestDataGenerator.generateRandomAddress(8);
        noShippingGuestCity = "";
        validShippingGuestPhone = TestDataGenerator.generatePhoneNumber(9);

        System.out.println("Invalid generated checkout guest shipping address input data (no shipping city): " + "\n");

        logger.info("Valid guest shipping address first name (no shipping city): " + validShippingGuestFirstName);
        logger.info("Valid guest shipping address last name (no shipping city): " + validShippingGuestLastName);
        logger.info("Valid guest shipping address (no shipping city): " + validShippingGuestAddress);
        logger.info("No shipping city: " +noShippingGuestCity);
        logger.info("Valid guest shipping address phone number (no shipping city): " + validShippingGuestPhone);

        System.out.println("\n");

    }

    //invalid guest shipping address input data getter - no shipping post code
    public void invalidGuestShipAddressInputDataNoPostCodeGetter(){

        validShippingGuestFirstName = TestDataGenerator.getRandomFirstName();
        validShippingGuestLastName = TestDataGenerator.getRandomLastName();
        validShippingGuestAddress = TestDataGenerator.generateRandomAddress(8);
        noShippingGuestPostCode = "";
        validShippingGuestPhone = TestDataGenerator.generatePhoneNumber(9);

        System.out.println("Invalid generated checkout guest shipping address input data (no shipping post code): " + "\n");

        logger.info("Valid guest shipping address first name (no shipping post code): " + validShippingGuestFirstName);
        logger.info("Valid guest shipping address last name (no shipping post code): " + validShippingGuestLastName);
        logger.info("Valid guest shipping address (no shipping post code): " + validShippingGuestAddress);
        logger.info("No shipping post code: " +noShippingGuestPostCode);
        logger.info("Valid guest shipping address phone number (no shipping post code): " + validShippingGuestPhone);

        System.out.println("\n");

    }

    //invalid guest shipping address input data getter - no shipping phone
    public void invalidGuestShipAddressInputDataNoPhoneGetter(){

        validShippingGuestFirstName = TestDataGenerator.getRandomFirstName();
        validShippingGuestLastName = TestDataGenerator.getRandomLastName();
        validShippingGuestAddress = TestDataGenerator.generateRandomAddress(8);
        noShippingGuestPhone = "";

        System.out.println("Invalid generated checkout guest shipping address input data (no shipping phone): " + "\n");

        logger.info("Valid guest shipping address first name (no shipping phone): " + validShippingGuestFirstName);
        logger.info("Valid guest shipping address last name (no shipping phone): " + validShippingGuestLastName);
        logger.info("Valid guest shipping address (no shipping phone): " + validShippingGuestAddress);
        logger.info("No shipping address phone number: " + noShippingGuestPhone);

        System.out.println("\n");

    }

    //invalid guest shipping data input methods - no singular input
    public void inputNoShippingGuestFirstNameIntoFirstNameInputField(){checkoutPageShippingFirstNameInputField.sendKeys(noShippingGuestFirstName);}
    public void inputNoShippingGuestLastNameIntoLastNameInputField(){checkoutPageShippingLastNameInputField.sendKeys(noShippingGuestLastName);}
    public void inputNoShippingGuestAddressIntoAddressInputField(){checkoutPageShippingAddressInputField.sendKeys(noShippingGuestAddress);}

    public void inputNoShippingGuestCityIntoCityInputField(){
        checkoutPageShippingCityInputField.clear();
        checkoutPageShippingCityInputField.sendKeys(noShippingGuestCity);
    }
    public void inputNoShippingGuestPostCodeIntoPostCodeInputField(){
        checkoutPageShippingPostCodeInputField.clear();
        checkoutPageShippingPostCodeInputField.sendKeys(noShippingGuestPostCode);
    }

    public void inputNoShippingGuestPhoneIntoPhoneInputField(){checkoutPageShippingPhoneInputField.sendKeys(noShippingGuestPhone);}

    //valid input methods

    //valid guest email address input method (for remaining inputs)
    public void inputValidGuestEmailIntoEmailInputField(){checkoutPageGuestEmailInputField.sendKeys(validGuestEmail);}

    //valid guest shipping data input methods (for remaining inputs)
    public void inputValidShippingGuestFirstNameIntoFirstNameInputField(){checkoutPageShippingFirstNameInputField.sendKeys(validShippingGuestFirstName);}
    public void inputValidShippingGuestLastNameIntoLastNameInputField(){checkoutPageShippingLastNameInputField.sendKeys(validShippingGuestLastName);}
    public void inputValidShippingGuestAddressIntoAddressInputField(){checkoutPageShippingAddressInputField.sendKeys(validShippingGuestAddress);}
    public void inputValidShippingGuestPhoneIntoPhoneInputField(){checkoutPageShippingPhoneInputField.sendKeys(validShippingGuestPhone);}

    //billing address input

    //invalid guest billing address input data getter - no billing first name
    public void invalidGuestBillAddressInputDataNoFirstNameGetter(){

        noBillingGuestFirstName = "";
        validBillingGuestLastName = TestDataGenerator.getRandomLastName();
        validBillingGuestAddress = TestDataGenerator.generateRandomAddress(8);
        validBillingGuestCity = TestDataGenerator.getRandomCity();
        validBillingGuestPostCode = String.valueOf(TestDataGenerator.getRandomPostalCode());
        validBillingGuestPhone = TestDataGenerator.generatePhoneNumber(9);

        System.out.println("Invalid generated checkout guest billing address input data (no billing first name): " + "\n");

        logger.info("No billing address first name: " + noBillingGuestFirstName);
        logger.info("Valid guest billing address last name (no billing first name): " + validBillingGuestLastName);
        logger.info("Valid guest billing address (no billing first name): " + validBillingGuestAddress);
        logger.info("Valid guest billing address city (no billing first name): " + validBillingGuestCity);
        logger.info("Valid guest billing address post code (no billing first name): " + validBillingGuestPostCode);
        logger.info("Valid guest billing address phone number (no billing first name): " + validBillingGuestPhone);

        System.out.println("\n");

    }

    //invalid guest billing address input data getter - no billing last name
    public void invalidGuestBillAddressInputDataNoLastNameGetter(){

        validBillingGuestFirstName = TestDataGenerator.getRandomFirstName();
        noBillingGuestLastName = "";
        validBillingGuestAddress = TestDataGenerator.generateRandomAddress(8);
        validBillingGuestCity = TestDataGenerator.getRandomCity();
        validBillingGuestPostCode = String.valueOf(TestDataGenerator.getRandomPostalCode());
        validBillingGuestPhone = TestDataGenerator.generatePhoneNumber(9);

        System.out.println("Invalid generated checkout guest billing address input data (no billing last name): " + "\n");

        logger.info("Valid guest billing address first name (no billing last name): " + validBillingGuestFirstName);
        logger.info("No billing address last name: " + noBillingGuestLastName);
        logger.info("Valid guest billing address (no billing last name): " + validBillingGuestAddress);
        logger.info("Valid guest billing address city (no billing last name): " + validBillingGuestCity);
        logger.info("Valid guest billing address post code (no billing last name): " + validBillingGuestPostCode);
        logger.info("Valid guest billing address phone number (no billing last name): " + validBillingGuestPhone);

        System.out.println("\n");

    }

    //invalid guest billing address input data getter - no billing address
    public void invalidGuestBillAddressInputDataNoAddressGetter(){

        validBillingGuestFirstName = TestDataGenerator.getRandomFirstName();
        validBillingGuestLastName = TestDataGenerator.getRandomLastName();
        noBillingGuestAddress = "";
        validBillingGuestCity = TestDataGenerator.getRandomCity();
        validBillingGuestPostCode = String.valueOf(TestDataGenerator.getRandomPostalCode());
        validBillingGuestPhone = TestDataGenerator.generatePhoneNumber(9);

        System.out.println("Invalid generated checkout guest billing address input data (no billing address): " + "\n");

        logger.info("Valid guest billing address first name (no billing address): " + validBillingGuestFirstName);
        logger.info("Valid guest billing address last name (no billing address): " + validBillingGuestLastName);
        logger.info("No billing address: " + noBillingGuestAddress);
        logger.info("Valid guest billing address city (no billing address): " + validBillingGuestCity);
        logger.info("Valid guest billing address post code (no billing address): " + validBillingGuestPostCode);
        logger.info("Valid guest billing address phone number (no billing address): " + validBillingGuestPhone);

        System.out.println("\n");

    }

    //invalid guest billing address input data getter - no billing city
    public void invalidGuestBillAddressInputDataNoCityGetter(){

        validBillingGuestFirstName = TestDataGenerator.getRandomFirstName();
        validBillingGuestLastName = TestDataGenerator.getRandomLastName();
        validBillingGuestAddress = TestDataGenerator.generateRandomAddress(8);
        noBillingGuestCity = "";
        validBillingGuestPostCode = String.valueOf(TestDataGenerator.getRandomPostalCode());
        validBillingGuestPhone = TestDataGenerator.generatePhoneNumber(9);

        System.out.println("Invalid generated checkout guest billing address input data (no billing city): " + "\n");

        logger.info("Valid guest billing address first name (no billing city): " + validBillingGuestFirstName);
        logger.info("Valid guest billing address last name (no billing city): " + validBillingGuestLastName);
        logger.info("Valid guest billing address (no billing city): " + validBillingGuestAddress);
        logger.info("No billing address city: " + noBillingGuestCity);
        logger.info("Valid guest billing address post code (no billing city): " + validBillingGuestPostCode);
        logger.info("Valid guest billing address phone number (no billing city): " + validBillingGuestPhone);

        System.out.println("\n");

    }

    //invalid guest billing address data input methods - no singular input
    public void inputNoBillingGuestFirstNameIntoFirstNameInputField(){checkoutPageBillingFirstNameInputField.sendKeys(noBillingGuestFirstName);}
    public void inputNoBillingGuestLastNameIntoLastNameInputField(){checkoutPageBillingLastNameInputField.sendKeys(noBillingGuestLastName);}

    public void inputNoBillingGuestAddressIntoAddressInputField(){
        checkoutPageBillingAddressInputField.clear();
        checkoutPageBillingAddressInputField.sendKeys(noBillingGuestAddress);
    }
    public void inputNoBillingGuestCityIntoCityInputField(){
        checkoutPageBillingCityInputField.clear();
        checkoutPageBillingCityInputField.sendKeys(noBillingGuestCity);
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

}
