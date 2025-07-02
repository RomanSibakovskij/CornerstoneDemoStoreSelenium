package com.mybigcommerce.demo.addaddresspageinvalidscenarios;

import com.mybigcommerce.demo.RegisterPage;
import com.mybigcommerce.demo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class AddAddressPageTooLongSingularInput extends BasePage{

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

    //invalid user address data - too long singular input
    private String tooLongEditAddressFirstName;
    private String tooLongEditAddressLastName;
    private String tooLongEditAddress;
    private String tooLongEditAddressCity;
    private int tooLongEditAddressPostCode;

    public AddAddressPageTooLongSingularInput(WebDriver driver) {super(driver);}

    //invalid user edited address data getter - too long user first name (100 chars)
    public void invalidUserEditedAddressDataTooLongFirstNameGetter(){

        RegisterPage registerPage = new RegisterPage(driver);

        tooLongEditAddressFirstName = "Vhfgdsgdtwetrtjdsfgrfdgjhkjmngbfdsfffhkjgsedhgtfgsdetgtujyhgdsfgdfhtgfsdfdffgdsgfgfdgdsfgfdhgfdhgdfd";
        validAddressLastName = registerPage.getValidRegisterLastName();; //add address page requires the input, while edit address page has the input by default
        validAddress = TestDataGenerator.generateRandomAddress(9);
        validAddressCity = TestDataGenerator.getRandomCity();
        validAddressPostCode = TestDataGenerator.getRandomPostalCode();
        validAddressPhone = TestDataGenerator.generatePhoneNumber(8);

        System.out.println("Invalid user edited address generated data (too long user first name): " + "\n");

        logger.info("Too long edited user first name: " + tooLongEditAddressFirstName);
        logger.info("Valid generated edited user address (too long user first name): " + validAddress);
        logger.info("Valid generated edited user city (too long user first name): " + validAddressCity);
        logger.info("Valid generated edited user post code (too long user first name): " + validAddressPostCode);
        logger.info("Valid generated edited user phone (too long user first name): " + validAddressPhone);

        System.out.println("\n");

    }

    //invalid user edited address data getter - too long user last name (100 chars)
    public void invalidUserEditedAddressDataTooLongLastNameGetter(){

        RegisterPage registerPage = new RegisterPage(driver);

        validAddressFirstName = registerPage.getValidRegisterFirstName();; //add address page requires the input, while edit address page has the input by default
        tooLongEditAddressLastName = "Shfgdsgdtwetrtjdsfgrfdgjhkjmngbfdsfffhkjgsedhgtfgsdetgtujyhgdsfgdfhtgfsdfdffgdsgfgfdgdsfgfdhgfdhgdfd";
        validAddress = TestDataGenerator.generateRandomAddress(9);
        validAddressCity = TestDataGenerator.getRandomCity();
        validAddressPostCode = TestDataGenerator.getRandomPostalCode();
        validAddressPhone = TestDataGenerator.generatePhoneNumber(8);

        System.out.println("Invalid user edited address generated data (too long user last name): " + "\n");

        logger.info("Too long edited user last name: " + tooLongEditAddressLastName);
        logger.info("Valid generated edited user address (too long user last name): " + validAddress);
        logger.info("Valid generated edited user city (too long user last name): " + validAddressCity);
        logger.info("Valid generated edited user post code (too long user last name): " + validAddressPostCode);
        logger.info("Valid generated edited user phone (too long user last name): " + validAddressPhone);

        System.out.println("\n");

    }

    //invalid user edited address data getter - too long user address (100 chars)
    public void invalidUserEditedAddressDataTooLongAddressGetter(){

        RegisterPage registerPage = new RegisterPage(driver);

        validAddressFirstName = registerPage.getValidRegisterFirstName();; //add address page requires the input, while edit address page has the input by default
        validAddressLastName = registerPage.getValidRegisterLastName();; //add address page requires the input, while edit address page has the input by default
        tooLongEditAddress = TestDataGenerator.generateRandomEmailAddress(100);
        validAddressCity = TestDataGenerator.getRandomCity();
        validAddressPostCode = TestDataGenerator.getRandomPostalCode();
        validAddressPhone = TestDataGenerator.generatePhoneNumber(8);

        System.out.println("Invalid user edited address generated data (too long user address): " + "\n");

        logger.info("Too long edited user address: " + tooLongEditAddress);
        logger.info("Valid generated edited user city (too long user address): " + validAddressCity);
        logger.info("Valid generated edited user post code (too long user address): " + validAddressPostCode);
        logger.info("Valid generated edited user phone (too long user address): " + validAddressPhone);

        System.out.println("\n");

    }

    //invalid user edited address data getter - too long user city (100 chars)
    public void invalidUserEditedAddressDataTooLongCityGetter(){

        RegisterPage registerPage = new RegisterPage(driver);

        validAddressFirstName = registerPage.getValidRegisterFirstName();; //add address page requires the input, while edit address page has the input by default
        validAddressLastName = registerPage.getValidRegisterLastName();; //add address page requires the input, while edit address page has the input by default
        validAddress = TestDataGenerator.generateRandomAddress(9);
        tooLongEditAddressCity = "Jhfgdsgdtwetrtjdsfgrfdgjhkjmngbfdsfffhkjgsedhgtfgsdetgtujyhgdsfgdfhtgfsdfdffgdsgfgfdgdsfgfdhgfdhgdfd";
        validAddressPostCode = TestDataGenerator.getRandomPostalCode();
        validAddressPhone = TestDataGenerator.generatePhoneNumber(8);

        System.out.println("Invalid user edited address generated data (too long user city): " + "\n");

        logger.info("Valid generated edited user address (too long user city): " + validAddress);
        logger.info("Too long edited user city: " + tooLongEditAddressCity);
        logger.info("Valid generated edited user post code (too long user city): " + validAddressPostCode);
        logger.info("Valid generated edited user phone (too long user city): " + validAddressPhone);

        System.out.println("\n");

    }

    //invalid user edited address data getter - too long user post code (6 digits)
    public void invalidUserEditedAddressDataTooLongPostCodeGetter(){

        RegisterPage registerPage = new RegisterPage(driver);

        validAddressFirstName = registerPage.getValidRegisterFirstName();; //add address page requires the input, while edit address page has the input by default
        validAddressLastName = registerPage.getValidRegisterLastName();; //add address page requires the input, while edit address page has the input by default
        validAddress = TestDataGenerator.generateRandomAddress(9);
        validAddressCity = TestDataGenerator.getRandomCity();
        tooLongEditAddressPostCode = 567423;
        validAddressPhone = TestDataGenerator.generatePhoneNumber(8);

        System.out.println("Invalid user edited address generated data (too long user post code): " + "\n");

        logger.info("Valid generated edited user address (too long user post code): " + validAddress);
        logger.info("Valid generated edited user city (too long user post code): " + validAddressCity);
        logger.info("Too long edited user post code: " + tooLongEditAddressPostCode);
        logger.info("Valid generated edited user phone (too long user post code): " + validAddressPhone);

        System.out.println("\n");

    }

    //invalid user address input methods - too long singular input
    public void inputTooLongUserFirstNameIntoFirstNameInputField(){
        addAddressPageFirstNameInputField.clear();
        addAddressPageFirstNameInputField.sendKeys(tooLongEditAddressFirstName);
    }
    public void inputTooLongUserLastNameIntoLastNameInputField(){
        addAddressPageLastNameInputField.clear();
        addAddressPageLastNameInputField.sendKeys(tooLongEditAddressLastName);
    }
    public void inputTooLongUserAddressIntoAddress1InputField(){
        addAddressPageAddress1InputField.clear();
        addAddressPageAddress1InputField.sendKeys(tooLongEditAddress);
    }
    public void inputTooLongUserCityIntoCityInputField(){
        addAddressPageCityInputField.clear();
        addAddressPageCityInputField.sendKeys(tooLongEditAddressCity);
    }
    public void inputTooLongUserPostCodeIntoPostCodeInputField(){
        addAddressPagePostCodeInputField.clear();
        addAddressPagePostCodeInputField.sendKeys(String.valueOf(tooLongEditAddressPostCode));
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
