package com.mybigcommerce.demo.addaddresspageinvalidscenarios;

import com.mybigcommerce.demo.RegisterPage;
import com.mybigcommerce.demo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class AddAddressPageTooShortSingularInput extends BasePage{

    //input form
    @FindBy(xpath = "//input[@id='FormField_4_input']")
    private WebElement addAddressPageFirstNameInputField;
    @FindBy(xpath = "//input[@id='FormField_5_input']")
    private WebElement addAddressPageLastNameInputField;
    @FindBy(xpath = "//input[@id='FormField_8_input']")
    private WebElement addAddressPageAddress1InputField;
    @FindBy(xpath = "//input[@id='FormField_10_input']")
    private WebElement addAddressPageCityInputField;
    @FindBy(xpath = "//input[@id='FormField_13_input']")
    private WebElement addAddressPagePostCodeInputField;
    @FindBy(xpath = "//input[@id='FormField_7_input']")
    private WebElement addAddressPagePhoneInputField;

    //valid user address data
    private String validAddressFirstName;
    private String validAddressLastName;
    private String validAddress;
    private String validAddressCity;
    private int validAddressPostCode;
    private String validAddressPhone;

    //invalid user address data - too short singular input
    private String tooShortEditAddressFirstName;
    private String tooShortEditAddressLastName;
    private String tooShortEditAddress;
    private String tooShortEditAddressCity;
    private int tooShortEditAddressPostCode;
    private int tooShortEditAddressPhone;

    public AddAddressPageTooShortSingularInput(WebDriver driver) {super(driver);}

    //invalid user edited address data getter - too short user first name (1 char)
    public void invalidUserEditedAddressDataTooShortFirstNameGetter(){

        RegisterPage registerPage = new RegisterPage(driver);

        tooShortEditAddressFirstName = "V";
        validAddressLastName = registerPage.getValidRegisterLastName();; //add address page requires the input, while edit address page has the input by default
        validAddress = TestDataGenerator.generateRandomAddress(9);
        validAddressCity = TestDataGenerator.getRandomCity();
        validAddressPostCode = TestDataGenerator.getRandomPostalCode();
        validAddressPhone = TestDataGenerator.generatePhoneNumber(8);

        System.out.println("Invalid user edited address generated data (too short user first name): " + "\n");

        logger.info("Too short edited user first name: " + tooShortEditAddressFirstName);
        logger.info("Valid generated edited user address (too short user first name): " + validAddress);
        logger.info("Valid generated edited user city (too short user first name): " + validAddressCity);
        logger.info("Valid generated edited user post code (too short user first name): " + validAddressPostCode);
        logger.info("Valid generated edited user phone (too short user first name): " + validAddressPhone);

        System.out.println("\n");

    }

    //invalid user edited address data getter - too short user last name (1 char)
    public void invalidUserEditedAddressDataTooShortLastNameGetter(){

        RegisterPage registerPage = new RegisterPage(driver);

        validAddressFirstName = registerPage.getValidRegisterFirstName();; //add address page requires the input, while edit address page has the input by default
        tooShortEditAddressLastName = "S";
        validAddress = TestDataGenerator.generateRandomAddress(9);
        validAddressCity = TestDataGenerator.getRandomCity();
        validAddressPostCode = TestDataGenerator.getRandomPostalCode();
        validAddressPhone = TestDataGenerator.generatePhoneNumber(8);

        System.out.println("Invalid user edited address generated data (too short user last name): " + "\n");

        logger.info("Too short edited user last name: " + tooShortEditAddressLastName);
        logger.info("Valid generated edited user address (too short user last name): " + validAddress);
        logger.info("Valid generated edited user city (too short user last name): " + validAddressCity);
        logger.info("Valid generated edited user post code (too short user last name): " + validAddressPostCode);
        logger.info("Valid generated edited user phone (too short user last name): " + validAddressPhone);

        System.out.println("\n");

    }

    //invalid user edited address data getter - too short user address (3 chars)
    public void invalidUserEditedAddressDataTooShortAddressGetter(){

        RegisterPage registerPage = new RegisterPage(driver);

        validAddressFirstName = registerPage.getValidRegisterFirstName();; //add address page requires the input, while edit address page has the input by default
        validAddressLastName = registerPage.getValidRegisterLastName();; //add address page requires the input, while edit address page has the input by default
        tooShortEditAddress = "3.D";
        validAddressCity = TestDataGenerator.getRandomCity();
        validAddressPostCode = TestDataGenerator.getRandomPostalCode();
        validAddressPhone = TestDataGenerator.generatePhoneNumber(8);

        System.out.println("Invalid user edited address generated data (too short user address): " + "\n");

        logger.info("Too short edited user address: " + tooShortEditAddress);
        logger.info("Valid generated edited user city (too short user address): " + validAddressCity);
        logger.info("Valid generated edited user post code (too short user address): " + validAddressPostCode);
        logger.info("Valid generated edited user phone (too short user address): " + validAddressPhone);

        System.out.println("\n");

    }

    //invalid user edited address data getter - too short user city (1 char)
    public void invalidUserEditedAddressDataTooShortCityGetter(){

        RegisterPage registerPage = new RegisterPage(driver);

        validAddressFirstName = registerPage.getValidRegisterFirstName();; //add address page requires the input, while edit address page has the input by default
        validAddressLastName = registerPage.getValidRegisterLastName();; //add address page requires the input, while edit address page has the input by default
        validAddress = TestDataGenerator.generateRandomAddress(9);
        tooShortEditAddressCity = "J";
        validAddressPostCode = TestDataGenerator.getRandomPostalCode();
        validAddressPhone = TestDataGenerator.generatePhoneNumber(8);

        System.out.println("Invalid user edited address generated data (too short user city): " + "\n");

        logger.info("Valid generated edited user address (too short user city): " + validAddress);
        logger.info("Too short edited user city: " + tooShortEditAddressCity);
        logger.info("Valid generated edited user post code (too short user city): " + validAddressPostCode);
        logger.info("Valid generated edited user phone (too short user city): " + validAddressPhone);

        System.out.println("\n");

    }

    //invalid user edited address data getter - too short user post code (4 digits)
    public void invalidUserEditedAddressDataTooShortPostCodeGetter(){

        RegisterPage registerPage = new RegisterPage(driver);

        validAddressFirstName = registerPage.getValidRegisterFirstName();; //add address page requires the input, while edit address page has the input by default
        validAddressLastName = registerPage.getValidRegisterLastName();; //add address page requires the input, while edit address page has the input by default
        validAddress = TestDataGenerator.generateRandomAddress(9);
        validAddressCity = TestDataGenerator.getRandomCity();
        tooShortEditAddressPostCode = 5674;
        validAddressPhone = TestDataGenerator.generatePhoneNumber(8);

        System.out.println("Invalid user edited address generated data (too short user post code): " + "\n");

        logger.info("Valid generated edited user address (too short user post code): " + validAddress);
        logger.info("Valid generated edited user city (too short user post code): " + validAddressCity);
        logger.info("Too short edited user post code: " + tooShortEditAddressPostCode);
        logger.info("Valid generated edited user phone (too short user post code): " + validAddressPhone);

        System.out.println("\n");

    }

    //invalid user edited address data getter - too short user phone (2 digits)
    public void invalidUserEditedAddressDataTooShortPhoneGetter(){

        RegisterPage registerPage = new RegisterPage(driver);

        validAddressFirstName = registerPage.getValidRegisterFirstName();; //add address page requires the input, while edit address page has the input by default
        validAddressLastName = registerPage.getValidRegisterLastName();; //add address page requires the input, while edit address page has the input by default
        validAddress = TestDataGenerator.generateRandomAddress(9);
        validAddressCity = TestDataGenerator.getRandomCity();
        validAddressPostCode = TestDataGenerator.getRandomPostalCode();
        tooShortEditAddressPhone = 78;

        System.out.println("Invalid user edited address generated data (too short user phone): " + "\n");

        logger.info("Valid generated edited user address (too short user phone): " + validAddress);
        logger.info("Valid generated edited user city (too short user phone): " + validAddressCity);
        logger.info("Valid generated edited user post code (too short user phone): " + validAddressPostCode);
        logger.info("Too short edited user phone: " + tooShortEditAddressPhone);

        System.out.println("\n");

    }

    //invalid user address input methods - too short singular input
    public void inputTooShortUserFirstNameIntoFirstNameInputField(){
        addAddressPageFirstNameInputField.clear();
        addAddressPageFirstNameInputField.sendKeys(tooShortEditAddressFirstName);
    }
    public void inputTooShortUserLastNameIntoLastNameInputField(){
        addAddressPageLastNameInputField.clear();
        addAddressPageLastNameInputField.sendKeys(tooShortEditAddressLastName);
    }
    public void inputTooShortUserAddressIntoAddress1InputField(){
        addAddressPageAddress1InputField.clear();
        addAddressPageAddress1InputField.sendKeys(tooShortEditAddress);
    }
    public void inputTooShortUserCityIntoCityInputField(){
        addAddressPageCityInputField.clear();
        addAddressPageCityInputField.sendKeys(tooShortEditAddressCity);
    }
    public void inputTooShortUserPostCodeIntoPostCodeInputField(){
        addAddressPagePostCodeInputField.clear();
        addAddressPagePostCodeInputField.sendKeys(String.valueOf(tooShortEditAddressPostCode));
    }
    public void inputTooShortUserPhoneIntoPhoneInputField(){
        addAddressPagePhoneInputField.clear();
        addAddressPagePhoneInputField.sendKeys(String.valueOf(tooShortEditAddressPhone));
    }

    //valid user address input methods (for remaining inputs)
    public void inputValidUserFirstNameIntoFirstNameInputField(){addAddressPageFirstNameInputField.sendKeys(validAddressFirstName);}
    public void inputValidUserLastNameIntoLastNameInputField(){addAddressPageLastNameInputField.sendKeys(validAddressLastName);}

    public void inputValidUserAddressIntoAddress1InputField(){
        addAddressPageAddress1InputField.clear();
        addAddressPageAddress1InputField.sendKeys(validAddress);
    }

    public void inputValidUserCityIntoCityInputField(){
        addAddressPageCityInputField.clear();
        addAddressPageCityInputField.sendKeys(validAddressCity);
    }
    public void inputValidUserPostCodeIntoPostCodeInputField(){
        addAddressPagePostCodeInputField.clear();
        addAddressPagePostCodeInputField.sendKeys(String.valueOf(validAddressPostCode));
    }
    public void inputValidUserPhoneIntoPhoneInputField(){
        addAddressPagePhoneInputField.clear();
        addAddressPagePhoneInputField.sendKeys(validAddressPhone);
    }

}
