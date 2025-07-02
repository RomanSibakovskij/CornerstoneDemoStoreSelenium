package com.mybigcommerce.demo.addaddresspageinvalidscenarios;

import com.mybigcommerce.demo.RegisterPage;
import com.mybigcommerce.demo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class AddAddressPageNoSingularInput extends BasePage{

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

    //valid user address data (for remaining inputs)
    private String validAddressFirstName;
    private String validAddressLastName;
    private String validAddress;
    private String validAddressCity;
    private int validAddressPostCode;
    private String validAddressPhone;

    //invalid edited user address data - no singular input
    private String noEditAddressFirstName;
    private String noEditAddressLastName;
    private String noEditAddress;
    private String noEditAddressCity;

    public AddAddressPageNoSingularInput(WebDriver driver) {super(driver);}

    //invalid user edited address data getter - no user first name
    public void invalidUserEditedAddressDataNoFirstNameGetter(){

        RegisterPage registerPage = new RegisterPage(driver);

        noEditAddressFirstName = "";
        validAddressLastName = registerPage.getValidRegisterLastName();; //add address page requires the input, while edit address page has the input by default
        validAddress = TestDataGenerator.generateRandomAddress(9);
        validAddressCity = TestDataGenerator.getRandomCity();
        validAddressPostCode = TestDataGenerator.getRandomPostalCode();
        validAddressPhone = TestDataGenerator.generatePhoneNumber(8);

        System.out.println("Invalid user edited address generated data (no user first name): " + "\n");

        logger.info("No edited user first name: " + noEditAddressFirstName);
        logger.info("Valid generated edited user address (no user first name): " + validAddress);
        logger.info("Valid generated edited user city (no user first name): " + validAddressCity);
        logger.info("Valid generated edited user post code (no user first name): " + validAddressPostCode);
        logger.info("Valid generated edited user phone (no user first name): " + validAddressPhone);

        System.out.println("\n");

    }

    //invalid user edited address data getter - no user last name
    public void invalidUserEditedAddressDataNoLastNameGetter(){

        RegisterPage registerPage = new RegisterPage(driver);

        validAddressFirstName = registerPage.getValidRegisterFirstName();; //add address page requires the input, while edit address page has the input by default
        noEditAddressLastName = "";
        validAddress = TestDataGenerator.generateRandomAddress(9);
        validAddressCity = TestDataGenerator.getRandomCity();
        validAddressPostCode = TestDataGenerator.getRandomPostalCode();
        validAddressPhone = TestDataGenerator.generatePhoneNumber(8);

        System.out.println("Invalid user edited address generated data (no user last name): " + "\n");

        logger.info("No edited user last name: " + noEditAddressLastName);
        logger.info("Valid generated edited user address (no user last name): " + validAddress);
        logger.info("Valid generated edited user city (no user last name): " + validAddressCity);
        logger.info("Valid generated edited user post code (no user last name): " + validAddressPostCode);
        logger.info("Valid generated edited user phone (no user last name): " + validAddressPhone);

        System.out.println("\n");

    }

    //invalid user edited address data getter - no user address
    public void invalidUserEditedAddressDataNoAddressGetter(){

        RegisterPage registerPage = new RegisterPage(driver);

        validAddressFirstName = registerPage.getValidRegisterFirstName();; //add address page requires the input, while edit address page has the input by default
        validAddressLastName = registerPage.getValidRegisterLastName();; //add address page requires the input, while edit address page has the input by default
        noEditAddress = "";
        validAddressCity = TestDataGenerator.getRandomCity();
        validAddressPostCode = TestDataGenerator.getRandomPostalCode();
        validAddressPhone = TestDataGenerator.generatePhoneNumber(8);

        System.out.println("Invalid user edited address generated data (no user address): " + "\n");

        logger.info("No edited user address: " + noEditAddress);
        logger.info("Valid generated edited user city (no user address): " + validAddressCity);
        logger.info("Valid generated edited user post code (no user address): " + validAddressPostCode);
        logger.info("Valid generated edited user phone (no user address): " + validAddressPhone);

        System.out.println("\n");

    }

    //invalid user edited address data getter - no user city
    public void invalidUserEditedAddressDataNoCityGetter(){

        RegisterPage registerPage = new RegisterPage(driver);

        validAddressFirstName = registerPage.getValidRegisterFirstName();; //add address page requires the input, while edit address page has the input by default
        validAddressLastName = registerPage.getValidRegisterLastName();; //add address page requires the input, while edit address page has the input by default
        validAddress = TestDataGenerator.generateRandomAddress(9);
        noEditAddressCity = "";
        validAddressPostCode = TestDataGenerator.getRandomPostalCode();
        validAddressPhone = TestDataGenerator.generatePhoneNumber(8);

        System.out.println("Invalid user edited address generated data (no user city): " + "\n");

        logger.info("Valid generated edited user address (no user city): " + validAddress);
        logger.info("No edited user city: " + noEditAddressCity);
        logger.info("Valid generated edited user post code (no user city): " + validAddressPostCode);
        logger.info("Valid generated edited user phone (no user city): " + validAddressPhone);

        System.out.println("\n");

    }

    //invalid user address input methods - no singular input
    public void inputNoUserFirstNameIntoFirstNameInputField(){
        addAddressPageFirstNameInputField.clear();
        addAddressPageFirstNameInputField.sendKeys(noEditAddressFirstName);
    }
    public void inputNoUserLastNameIntoLastNameInputField(){
        addAddressPageLastNameInputField.clear();
        addAddressPageLastNameInputField.sendKeys(noEditAddressLastName);
    }
    public void inputNoUserAddressIntoAddress1InputField(){
        addAddressPageAddress1InputField.clear();
        addAddressPageAddress1InputField.sendKeys(noEditAddress);
    }
    public void inputNoUserCityIntoCityInputField(){
        addAddressPageCityInputField.clear();
        addAddressPageCityInputField.sendKeys(noEditAddressCity);
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
