package com.mybigcommerce.demo.regpageinvalidscenarios;

import com.mybigcommerce.demo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class RegisterPageTooShortSingularInput extends BasePage{

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

    //invalid user register input data - too short singular input
    private String tooShortUserRegisterEmail;
    private String tooShortUserRegisterPassword;
    private String tooShortUserRegisterFirstName;
    private String tooShortUserRegisterLastName;
    private String tooShortUserRegisterAddress;
    private String tooShortUserRegisterCity;

    public RegisterPageTooShortSingularInput(WebDriver driver) {super(driver);}

    //invalid user register data getter - too short user email (1 char -> name, domain)
    public void invalidUserRegisterDataTooShortEmailGetter(){

        tooShortUserRegisterEmail = TestDataGenerator.generateRandomTooShortEmailAddress(1);
        validRegisterPassword = TestDataGenerator.generateRandomPassword();
        validRegisterConfirmPassword = validRegisterPassword;
        validRegisterFirstName = TestDataGenerator.getRandomFirstName();
        validRegisterLastName = TestDataGenerator.getRandomLastName();
        validRegisterAddress = TestDataGenerator.generateRandomAddress(6);
        validRegisterCity = TestDataGenerator.getRandomCity();
        validRegisterPostCode = TestDataGenerator.getRandomPostalCode();
        validRegisterPhone = TestDataGenerator.generatePhoneNumber(9);

        System.out.println("Invalid user register generated data (too short user email): " + "\n");

        logger.info("Too short user email address: " + tooShortUserRegisterEmail);
        logger.info("Valid generated user password (too short user email): " + validRegisterPassword);
        logger.info("Valid matching user confirm password (too short user email): " + validRegisterConfirmPassword);
        logger.info("Valid generated user first name (too short user email): " + validRegisterFirstName);
        logger.info("Valid generated user last name (too short user email): " + validRegisterLastName);
        logger.info("Valid generated user address (too short user email): " + validRegisterAddress);
        logger.info("Valid generated user city (too short user email): " + validRegisterCity);
        logger.info("Valid generated user post code (too short user email): " + validRegisterPostCode);
        logger.info("Valid generated user phone number (too short user email): " + validRegisterPhone);

        System.out.println("\n");
    }

    //invalid user register data getter - too short user password / confirm password (6 chars)
    public void invalidUserRegisterDataTooShortPasswordConfirmGetter(){

        validRegisterEmail = TestDataGenerator.generateRandomEmailAddress(6);
        tooShortUserRegisterPassword = "fgthy3";
        validRegisterFirstName = TestDataGenerator.getRandomFirstName();
        validRegisterLastName = TestDataGenerator.getRandomLastName();
        validRegisterAddress = TestDataGenerator.generateRandomAddress(6);
        validRegisterCity = TestDataGenerator.getRandomCity();
        validRegisterPostCode = TestDataGenerator.getRandomPostalCode();
        validRegisterPhone = TestDataGenerator.generatePhoneNumber(9);

        System.out.println("Invalid user register generated data (too short user password / confirm password): " + "\n");

        logger.info("Valid generated user email address (too short user password / confirm password): " + validRegisterEmail);
        logger.info("Too short user password: " + tooShortUserRegisterPassword);
        logger.info("Too short matching user confirm password: " + tooShortUserRegisterPassword);
        logger.info("Valid generated user first name (too short user password / confirm password): " + validRegisterFirstName);
        logger.info("Valid generated user last name (too short user password / confirm password): " + validRegisterLastName);
        logger.info("Valid generated user address ((too short user password / confirm password): " + validRegisterAddress);
        logger.info("Valid generated user city (too short user password / confirm password): " + validRegisterCity);
        logger.info("Valid generated user post code (too short user password / confirm password): " + validRegisterPostCode);
        logger.info("Valid generated user phone number (too short user password / confirm password): " + validRegisterPhone);

        System.out.println("\n");
    }

    //invalid user register data getter - too short user first name (1 char)
    public void invalidUserRegisterDataTooShortFirstNameGetter(){

        validRegisterEmail = TestDataGenerator.generateRandomEmailAddress(6);
        validRegisterPassword = TestDataGenerator.generateRandomPassword();
        validRegisterConfirmPassword = validRegisterPassword;
        tooShortUserRegisterFirstName = "G";
        validRegisterLastName = TestDataGenerator.getRandomLastName();
        validRegisterAddress = TestDataGenerator.generateRandomAddress(6);
        validRegisterCity = TestDataGenerator.getRandomCity();
        validRegisterPostCode = TestDataGenerator.getRandomPostalCode();
        validRegisterPhone = TestDataGenerator.generatePhoneNumber(9);

        System.out.println("Invalid user register generated data (too short user first name): " + "\n");

        logger.info("Valid generated user email address (too short user first name): " + validRegisterEmail);
        logger.info("Valid generated user password (too short user first name): " + validRegisterPassword);
        logger.info("Valid matching user confirm password (too short user first name): " + validRegisterConfirmPassword);
        logger.info("Too short user first name: " + tooShortUserRegisterFirstName);
        logger.info("Valid generated user last name (too short user first name): " + validRegisterLastName);
        logger.info("Valid generated user address (too short user first name): " + validRegisterAddress);
        logger.info("Valid generated user city (too short user first name): " + validRegisterCity);
        logger.info("Valid generated user post code (too short user first name): " + validRegisterPostCode);
        logger.info("Valid generated user phone number (too short user first name): " + validRegisterPhone);

        System.out.println("\n");
    }

    //invalid user register data getter - too short user last name (1 char)
    public void invalidUserRegisterDataTooShortLastNameGetter(){

        validRegisterEmail = TestDataGenerator.generateRandomEmailAddress(6);
        validRegisterPassword = TestDataGenerator.generateRandomPassword();
        validRegisterConfirmPassword = validRegisterPassword;
        validRegisterFirstName = TestDataGenerator.getRandomFirstName();
        tooShortUserRegisterLastName = "K";
        validRegisterAddress = TestDataGenerator.generateRandomAddress(6);
        validRegisterCity = TestDataGenerator.getRandomCity();
        validRegisterPostCode = TestDataGenerator.getRandomPostalCode();
        validRegisterPhone = TestDataGenerator.generatePhoneNumber(9);

        System.out.println("Invalid user register generated data (too short user last name): " + "\n");

        logger.info("Valid generated user email address (too short user last name): " + validRegisterEmail);
        logger.info("Valid generated user password (too short user last name): " + validRegisterPassword);
        logger.info("Valid matching user confirm password (too short user last name): " + validRegisterConfirmPassword);
        logger.info("Valid generated user first name (too short user last name): " + validRegisterFirstName);
        logger.info("Too short user last name: " + tooShortUserRegisterLastName);
        logger.info("Valid generated user address (too short user last name): " + validRegisterAddress);
        logger.info("Valid generated user city (too short user last name): " + validRegisterCity);
        logger.info("Valid generated user post code (too short user last name): " + validRegisterPostCode);
        logger.info("Valid generated user phone number (too short user last name): " + validRegisterPhone);

        System.out.println("\n");
    }

    //invalid user register data getter - too short user address (3 chars)
    public void invalidUserRegisterDataTooShortAddressGetter(){

        validRegisterEmail = TestDataGenerator.generateRandomEmailAddress(6);
        validRegisterPassword = TestDataGenerator.generateRandomPassword();
        validRegisterConfirmPassword = validRegisterPassword;
        validRegisterFirstName = TestDataGenerator.getRandomFirstName();
        validRegisterLastName = TestDataGenerator.getRandomLastName();
        tooShortUserRegisterAddress = "3.R";
        validRegisterCity = TestDataGenerator.getRandomCity();
        validRegisterPostCode = TestDataGenerator.getRandomPostalCode();
        validRegisterPhone = TestDataGenerator.generatePhoneNumber(9);

        System.out.println("Invalid user register generated data (too short user address): " + "\n");

        logger.info("Valid generated user email address (too short user address): " + validRegisterEmail);
        logger.info("Valid generated user password (too short user address): " + validRegisterPassword);
        logger.info("Valid matching user confirm password (too short user address): " + validRegisterConfirmPassword);
        logger.info("Valid generated user first name (too short user address): " + validRegisterFirstName);
        logger.info("Valid generated user last name (too short user address): " + validRegisterLastName);
        logger.info("Too short user address: " + tooShortUserRegisterAddress);
        logger.info("Valid generated user city (too short user address): " + validRegisterCity);
        logger.info("Valid generated user post code (too short user address): " + validRegisterPostCode);
        logger.info("Valid generated user phone number (too short user address): " + validRegisterPhone);

        System.out.println("\n");
    }

    //invalid user register data getter - too short user city (1 char)
    public void invalidUserRegisterDataTooShortCityGetter(){

        validRegisterEmail = TestDataGenerator.generateRandomEmailAddress(6);
        validRegisterPassword = TestDataGenerator.generateRandomPassword();
        validRegisterConfirmPassword = validRegisterPassword;
        validRegisterFirstName = TestDataGenerator.getRandomFirstName();
        validRegisterLastName = TestDataGenerator.getRandomLastName();
        validRegisterAddress = TestDataGenerator.generateRandomAddress(6);
        tooShortUserRegisterCity = "D";
        validRegisterPostCode = TestDataGenerator.getRandomPostalCode();
        validRegisterPhone = TestDataGenerator.generatePhoneNumber(9);

        System.out.println("Invalid user register generated data (too short user city): " + "\n");

        logger.info("Valid generated user email address (too short user city): " + validRegisterEmail);
        logger.info("Valid generated user password (too short user city): " + validRegisterPassword);
        logger.info("Valid matching user confirm password (too short user city): " + validRegisterConfirmPassword);
        logger.info("Valid generated user first name (too short user city): " + validRegisterFirstName);
        logger.info("Valid generated user last name (too short user city): " + validRegisterLastName);
        logger.info("Valid generated user address (too short user city): " + validRegisterAddress);
        logger.info("Too short user city: " + tooShortUserRegisterCity);
        logger.info("Valid generated user post code (too short user city): " + validRegisterPostCode);
        logger.info("Valid generated user phone number (too short user city): " + validRegisterPhone);

        System.out.println("\n");
    }

    //invalid register data input methods - too short singular input
    public void inputTooShortRegisterEmailIntoEmailInputField(){registerPageEmailInputField.sendKeys(tooShortUserRegisterEmail);}
    public void inputTooShortRegisterPasswordIntoPasswordInputField(){registerPagePasswordInputField.sendKeys(tooShortUserRegisterPassword);}
    public void inputTooShortRegisterConfirmPasswordIntoConfirmPasswordInputField(){registerPageConfirmPasswordInputField.sendKeys(tooShortUserRegisterPassword);}
    public void inputTooShortRegisterFirstNameIntoFirstNameInputField(){registerPageFirstNameInputField.sendKeys(tooShortUserRegisterFirstName);}
    public void inputTooShortRegisterLastNameIntoLastNameInputField(){registerPageLastNameInputField.sendKeys(tooShortUserRegisterLastName);}
    public void inputTooShortRegisterAddressIntoAddressInputField(){registerPageAddress1InputField.sendKeys(tooShortUserRegisterAddress);}
    public void inputTooShortRegisterCityIntoCityInputField(){registerPageCityInputField.sendKeys(tooShortUserRegisterCity);}

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
