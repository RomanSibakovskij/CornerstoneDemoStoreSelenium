package com.mybigcommerce.demo.addaddresspageinvalidscenarios;

import com.mybigcommerce.demo.RegisterPage;
import com.mybigcommerce.demo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class AddAddressPageInvalidSingularInputFormat extends BasePage{

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

    //invalid user address data - invalid singular input format
    private String invalidEditAddressFirstNameFormat;
    private String invalidEditAddressLastNameFormat;
    private String invalidEditAddressFormat;
    private String invalidEditAddressCityFormat;

    public AddAddressPageInvalidSingularInputFormat(WebDriver driver) {super(driver);}

    //invalid user edited address data getter - invalid user first name format (special symbols only)
    public void invalidUserEditedAddressDataInvalidFirstNameFormatGetter(){

        RegisterPage registerPage = new RegisterPage(driver);

        invalidEditAddressFirstNameFormat = "@#$%$%&%^&";
        validAddressLastName = registerPage.getValidRegisterLastName();; //add address page requires the input, while edit address page has the input by default
        validAddress = TestDataGenerator.generateRandomAddress(9);
        validAddressCity = TestDataGenerator.getRandomCity();
        validAddressPostCode = TestDataGenerator.getRandomPostalCode();
        validAddressPhone = TestDataGenerator.generatePhoneNumber(8);

        System.out.println("Invalid user edited address generated data (invalid user first name format): " + "\n");

        logger.info("Invalid edited user first name format: " + invalidEditAddressFirstNameFormat);
        logger.info("Valid generated edited user address (invalid user first name format): " + validAddress);
        logger.info("Valid generated edited user city (invalid user first name format): " + validAddressCity);
        logger.info("Valid generated edited user post code (invalid user first name format): " + validAddressPostCode);
        logger.info("Valid generated edited user phone (invalid user first name format): " + validAddressPhone);

        System.out.println("\n");

    }

    //invalid user edited address data getter - invalid user last name format (special symbols only)
    public void invalidUserEditedAddressDataInvalidLastNameFormatGetter(){

        RegisterPage registerPage = new RegisterPage(driver);

        validAddressFirstName = registerPage.getValidRegisterFirstName();; //add address page requires the input, while edit address page has the input by default
        invalidEditAddressLastNameFormat = "*(&*^^%";
        validAddress = TestDataGenerator.generateRandomAddress(9);
        validAddressCity = TestDataGenerator.getRandomCity();
        validAddressPostCode = TestDataGenerator.getRandomPostalCode();
        validAddressPhone = TestDataGenerator.generatePhoneNumber(8);

        System.out.println("Invalid user edited address generated data (invalid user last name format): " + "\n");

        logger.info("Invalid edited user last name format: " + invalidEditAddressLastNameFormat);
        logger.info("Valid generated edited user address (invalid user last name format): " + validAddress);
        logger.info("Valid generated edited user city (invalid user last name format): " + validAddressCity);
        logger.info("Valid generated edited user post code (invalid user last name format): " + validAddressPostCode);
        logger.info("Valid generated edited user phone (invalid user last name format): " + validAddressPhone);

        System.out.println("\n");

    }

    //invalid user edited address data getter - invalid user address format (special symbols only)
    public void invalidUserEditedAddressDataInvalidAddressFormatGetter(){

        RegisterPage registerPage = new RegisterPage(driver);

        validAddressFirstName = registerPage.getValidRegisterFirstName();; //add address page requires the input, while edit address page has the input by default
        validAddressLastName = registerPage.getValidRegisterLastName();; //add address page requires the input, while edit address page has the input by default
        invalidEditAddressFormat = "@$#@#$%^";
        validAddressCity = TestDataGenerator.getRandomCity();
        validAddressPostCode = TestDataGenerator.getRandomPostalCode();
        validAddressPhone = TestDataGenerator.generatePhoneNumber(8);

        System.out.println("Invalid user edited address generated data (invalid user address format): " + "\n");

        logger.info("Invalid edited user address format: " + invalidEditAddressFormat);
        logger.info("Valid generated edited user city (invalid user address format): " + validAddressCity);
        logger.info("Valid generated edited user post code (invalid user address format): " + validAddressPostCode);
        logger.info("Valid generated edited user phone (invalid user address format): " + validAddressPhone);

        System.out.println("\n");

    }

    //invalid user edited address data getter - invalid user city format (special symbols only)
    public void invalidUserEditedAddressDataInvalidCityFormatGetter(){

        RegisterPage registerPage = new RegisterPage(driver);

        validAddressFirstName = registerPage.getValidRegisterFirstName();; //add address page requires the input, while edit address page has the input by default
        validAddressLastName = registerPage.getValidRegisterLastName();; //add address page requires the input, while edit address page has the input by default
        validAddress = TestDataGenerator.generateRandomAddress(9);
        invalidEditAddressCityFormat = "$#%^&^&*";
        validAddressPostCode = TestDataGenerator.getRandomPostalCode();
        validAddressPhone = TestDataGenerator.generatePhoneNumber(8);

        System.out.println("Invalid user edited address generated data (invalid user city format): " + "\n");

        logger.info("Valid generated edited user address (invalid user city format): " + validAddress);
        logger.info("Invalid edited user city format: " + invalidEditAddressCityFormat);
        logger.info("Valid generated edited user post code (invalid user city format): " + validAddressPostCode);
        logger.info("Valid generated edited user phone (invalid user city format): " + validAddressPhone);

        System.out.println("\n");

    }

    //invalid user address input methods - invalid singular input format
    public void inputInvalidUserFirstNameFormatIntoFirstNameInputField(){
        addAddressPageFirstNameInputField.clear();
        addAddressPageFirstNameInputField.sendKeys(invalidEditAddressFirstNameFormat);
    }
    public void inputInvalidUserLastNameFormatIntoLastNameInputField(){
        addAddressPageLastNameInputField.clear();
        addAddressPageLastNameInputField.sendKeys(invalidEditAddressLastNameFormat);
    }
    public void inputInvalidUserAddressFormatIntoAddress1InputField(){
        addAddressPageAddress1InputField.clear();
        addAddressPageAddress1InputField.sendKeys(invalidEditAddressFormat);
    }
    public void inputInvalidUserCityFormatIntoCityInputField(){
        addAddressPageCityInputField.clear();
        addAddressPageCityInputField.sendKeys(invalidEditAddressCityFormat);
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
