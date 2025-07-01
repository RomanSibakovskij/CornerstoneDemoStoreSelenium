package com.mybigcommerce.demo.regpageinvalidscenarios;

import com.mybigcommerce.demo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class RegisterPageInvalidSingularInputFormat extends BasePage{

    //register page web elements (relevant ones)
    @FindBy(xpath = "//input[@id='FormField_1_input']")
    private WebElement registerPageEmailInputField;
    @FindBy(xpath = "//input[@id='FormField_2_input']")
    private WebElement registerPagePasswordInputField;
    @FindBy(xpath = "//input[@id='FormField_3_input']")
    private WebElement registerPageConfirmPasswordInputField;
    @FindBy(xpath = "//input[@id='FormField_4_input']")
    private WebElement registerPageFirstNameInputField;
    @FindBy(xpath = "//input[@id='FormField_5_input']")
    private WebElement registerPageLastNameInputField;
    @FindBy(xpath = "//input[@id='FormField_8_input']")
    private WebElement registerPageAddress1InputField;
    @FindBy(xpath = "//input[@id='FormField_10_input']")
    private WebElement registerPageCityInputField;
    @FindBy(xpath = "//input[@id='FormField_13_input']")
    private WebElement registerPagePostCodeInputField;
    @FindBy(xpath = "//input[@id='FormField_7_input']")
    private WebElement registerPagePhoneInputField;

    //valid user register data (for remaining inputs)
    private static String validRegisterEmail;
    private static String validRegisterPassword;
    private String validRegisterConfirmPassword;
    private static String validRegisterFirstName;
    private static String validRegisterLastName;
    private static String validRegisterAddress;
    private String validRegisterCity;
    private int validRegisterPostCode;
    private String validRegisterPhone;

    //invalid user register input data - invalid singular input
    private String invalidUserRegisterEmailFormat;
    private String invalidUserExistingEmail;


    public RegisterPageInvalidSingularInputFormat(WebDriver driver) {super(driver);}

    //invalid user register data getter - invalid user email input format(missing '@')
    public void invalidUserRegisterDataInvalidEmailFormatGetter(){

        invalidUserRegisterEmailFormat = "cfrgexample.com";
        validRegisterPassword = TestDataGenerator.generateRandomPassword();
        validRegisterConfirmPassword = validRegisterPassword;
        validRegisterFirstName = TestDataGenerator.getRandomFirstName();
        validRegisterLastName = TestDataGenerator.getRandomLastName();
        validRegisterAddress = TestDataGenerator.generateRandomAddress(6);
        validRegisterCity = TestDataGenerator.getRandomCity();
        validRegisterPostCode = TestDataGenerator.getRandomPostalCode();
        validRegisterPhone = TestDataGenerator.generatePhoneNumber(9);

        System.out.println("Invalid user register generated data (invalid user email address input format): " + "\n");

        logger.info("Invalid user email address input format: " + invalidUserRegisterEmailFormat);
        logger.info("Valid generated user password (invalid user email address input format): " + validRegisterPassword);
        logger.info("Valid matching user confirm password (invalid user email address input format): " + validRegisterConfirmPassword);
        logger.info("Valid generated user first name (invalid user email address input format): " + validRegisterFirstName);
        logger.info("Valid generated user last name (invalid user email address input format): " + validRegisterLastName);
        logger.info("Valid generated user address (invalid user email address input format): " + validRegisterAddress);
        logger.info("Valid generated user city (invalid user email address input format): " + validRegisterCity);
        logger.info("Valid generated user post code (invalid user email address input format): " + validRegisterPostCode);
        logger.info("Valid generated user phone number (invalid user email address input format): " + validRegisterPhone);

        System.out.println("\n");
    }

    //invalid user register data getter - pre-existing user email (used beforehand in manual testing)
    public void invalidUserRegisterDataExistingEmailGetter(){

        invalidUserExistingEmail = "m1@fakemail.com";
        validRegisterPassword = TestDataGenerator.generateRandomPassword();
        validRegisterConfirmPassword = validRegisterPassword;
        validRegisterFirstName = TestDataGenerator.getRandomFirstName();
        validRegisterLastName = TestDataGenerator.getRandomLastName();
        validRegisterAddress = TestDataGenerator.generateRandomAddress(6);
        validRegisterCity = TestDataGenerator.getRandomCity();
        validRegisterPostCode = TestDataGenerator.getRandomPostalCode();
        validRegisterPhone = TestDataGenerator.generatePhoneNumber(9);

        System.out.println("Invalid user register generated data (pre-existing email address input): " + "\n");

        logger.info("Pre-existing email address input: " + invalidUserExistingEmail);
        logger.info("Valid generated user password (pre-existing email address input): " + validRegisterPassword);
        logger.info("Valid matching user confirm password (pre-existing email address input): " + validRegisterConfirmPassword);
        logger.info("Valid generated user first name (pre-existing email address input): " + validRegisterFirstName);
        logger.info("Valid generated user last name (pre-existing email address input): " + validRegisterLastName);
        logger.info("Valid generated user address (pre-existing email address input): " + validRegisterAddress);
        logger.info("Valid generated user city (pre-existing email address input): " + validRegisterCity);
        logger.info("Valid generated user post code (pre-existing email address input): " + validRegisterPostCode);
        logger.info("Valid generated user phone number (pre-existing email address input): " + validRegisterPhone);

        System.out.println("\n");
    }

    //invalid register data input methods - invalid singular input format
    public void inputInvalidRegisterEmailFormatIntoEmailInputField(){registerPageEmailInputField.sendKeys(invalidUserRegisterEmailFormat);}
    public void inputExistingRegEmailFormatIntoEmailInputField(){registerPageEmailInputField.sendKeys(invalidUserExistingEmail);}

    //valid register data input methods (for remaining inputs)
    public void inputValidRegisterEmailIntoEmailInputField(){registerPageEmailInputField.sendKeys(validRegisterEmail);}
    public void inputValidRegisterPasswordIntoPasswordInputField(){registerPagePasswordInputField.sendKeys(validRegisterPassword);}
    public void inputValidRegisterConfirmPasswordIntoConfirmPasswordInputField(){registerPageConfirmPasswordInputField.sendKeys(validRegisterConfirmPassword);}
    public void inputValidRegisterFirstNameIntoFirstNameInputField(){registerPageFirstNameInputField.sendKeys(validRegisterFirstName);}
    public void inputValidRegisterLastNameIntoLastNameInputField(){registerPageLastNameInputField.sendKeys(validRegisterLastName);}
    public void inputValidRegisterAddressIntoAddressInputField(){registerPageAddress1InputField.sendKeys(validRegisterAddress);}
    public void inputValidRegisterCityIntoCityInputField(){registerPageCityInputField.sendKeys(validRegisterCity);}
    public void inputValidRegisterPostCodeIntoPostCodeInputField(){registerPagePostCodeInputField.sendKeys(String.valueOf(validRegisterPostCode));}
    public void inputValidRegisterPhoneIntoPhoneNumberInputField(){registerPagePhoneInputField.sendKeys(validRegisterPhone);}

}
