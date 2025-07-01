package com.mybigcommerce.demo.regpageinvalidscenarios;

import com.mybigcommerce.demo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class RegisterPageNoSingularInput extends BasePage{

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

    //invalid user register input data - no singular input
    private String noUserRegisterEmail;
    private String noUserRegisterPassword;
    private String noUserRegisterFirstName;
    private String noUserRegisterLastName;
    private String noUserRegisterAddress;
    private String noUserRegisterCity;
    private String noUserRegisterPostCode;

    public RegisterPageNoSingularInput(WebDriver driver) {super(driver);}

    //invalid user register data getter - no user email
    public void invalidUserRegisterDataNoEmailGetter(){

        noUserRegisterEmail = "";
        validRegisterPassword = TestDataGenerator.generateRandomPassword();
        validRegisterConfirmPassword = validRegisterPassword;
        validRegisterFirstName = TestDataGenerator.getRandomFirstName();
        validRegisterLastName = TestDataGenerator.getRandomLastName();
        validRegisterAddress = TestDataGenerator.generateRandomAddress(6);
        validRegisterCity = TestDataGenerator.getRandomCity();
        validRegisterPostCode = TestDataGenerator.getRandomPostalCode();
        validRegisterPhone = TestDataGenerator.generatePhoneNumber(9);

        System.out.println("Invalid user register generated data (no user email): " + "\n");

        logger.info("No user email address: " + noUserRegisterEmail);
        logger.info("Valid generated user password (no user email): " + validRegisterPassword);
        logger.info("Valid matching user confirm password (no user email): " + validRegisterConfirmPassword);
        logger.info("Valid generated user first name (no user email): " + validRegisterFirstName);
        logger.info("Valid generated user last name (no user email): " + validRegisterLastName);
        logger.info("Valid generated user address (no user email): " + validRegisterAddress);
        logger.info("Valid generated user city (no user email): " + validRegisterCity);
        logger.info("Valid generated user post code (no user email): " + validRegisterPostCode);
        logger.info("Valid generated user phone number (no user email): " + validRegisterPhone);

        System.out.println("\n");
    }

    //invalid user register data getter - no user password and confirm password
    public void invalidUserRegisterDataNoPasswordConfirmGetter(){

        validRegisterEmail = TestDataGenerator.generateRandomEmailAddress(6);
        noUserRegisterPassword = "";
        validRegisterFirstName = TestDataGenerator.getRandomFirstName();
        validRegisterLastName = TestDataGenerator.getRandomLastName();
        validRegisterAddress = TestDataGenerator.generateRandomAddress(6);
        validRegisterCity = TestDataGenerator.getRandomCity();
        validRegisterPostCode = TestDataGenerator.getRandomPostalCode();
        validRegisterPhone = TestDataGenerator.generatePhoneNumber(9);

        System.out.println("Invalid user register generated data (no user password and confirm password): " + "\n");

        logger.info("Valid generated user email address (no user password and confirm password): " + validRegisterEmail);
        logger.info("No user password: " + noUserRegisterPassword);
        logger.info("No user confirm password: " + noUserRegisterPassword);
        logger.info("Valid generated user first name (no user password and confirm password): " + validRegisterFirstName);
        logger.info("Valid generated user last name (no user password and confirm password): " + validRegisterLastName);
        logger.info("Valid generated user address (no user password and confirm password): " + validRegisterAddress);
        logger.info("Valid generated user city (no user password and confirm password): " + validRegisterCity);
        logger.info("Valid generated user post code (no user password and confirm password): " + validRegisterPostCode);
        logger.info("Valid generated user phone number (no user password and confirm password): " + validRegisterPhone);

        System.out.println("\n");
    }

    //invalid user register data getter - no user first name
    public void invalidUserRegisterDataNoFirstNameGetter(){

        validRegisterEmail = TestDataGenerator.generateRandomEmailAddress(6);
        validRegisterPassword = TestDataGenerator.generateRandomPassword();
        validRegisterConfirmPassword = validRegisterPassword;
        noUserRegisterFirstName = "";
        validRegisterLastName = TestDataGenerator.getRandomLastName();
        validRegisterAddress = TestDataGenerator.generateRandomAddress(6);
        validRegisterCity = TestDataGenerator.getRandomCity();
        validRegisterPostCode = TestDataGenerator.getRandomPostalCode();
        validRegisterPhone = TestDataGenerator.generatePhoneNumber(9);

        System.out.println("Invalid user register generated data (no user first name): " + "\n");

        logger.info("Valid generated user email address (no user first name): " + validRegisterEmail);
        logger.info("Valid generated user password (no user first name): " + validRegisterPassword);
        logger.info("Valid generated user confirm password (no user first name): " + validRegisterConfirmPassword);
        logger.info("No user first name: " + noUserRegisterFirstName);
        logger.info("Valid generated user last name (no user first name): " + validRegisterLastName);
        logger.info("Valid generated user address (no user first name): " + validRegisterAddress);
        logger.info("Valid generated user city (no user first name): " + validRegisterCity);
        logger.info("Valid generated user post code (no user first name): " + validRegisterPostCode);
        logger.info("Valid generated user phone number (no user first name): " + validRegisterPhone);

        System.out.println("\n");
    }

    //invalid user register data getter - no user last name
    public void invalidUserRegisterDataNoLastNameGetter(){

        validRegisterEmail = TestDataGenerator.generateRandomEmailAddress(6);
        validRegisterPassword = TestDataGenerator.generateRandomPassword();
        validRegisterConfirmPassword = validRegisterPassword;
        validRegisterFirstName = TestDataGenerator.getRandomFirstName();
        noUserRegisterLastName = "";
        validRegisterAddress = TestDataGenerator.generateRandomAddress(6);
        validRegisterCity = TestDataGenerator.getRandomCity();
        validRegisterPostCode = TestDataGenerator.getRandomPostalCode();
        validRegisterPhone = TestDataGenerator.generatePhoneNumber(9);

        System.out.println("Invalid user register generated data (no user last name): " + "\n");

        logger.info("Valid generated user email address (no user last name): " + validRegisterEmail);
        logger.info("Valid generated user password (no user last name): " + validRegisterPassword);
        logger.info("Valid generated user confirm password (no user last name): " + validRegisterConfirmPassword);
        logger.info("Valid generated user first name (no user last name): " + validRegisterFirstName);
        logger.info("No user last name: " + noUserRegisterLastName);
        logger.info("Valid generated user address (no user last name): " + validRegisterAddress);
        logger.info("Valid generated user city (no user last name): " + validRegisterCity);
        logger.info("Valid generated user post code (no user last name): " + validRegisterPostCode);
        logger.info("Valid generated user phone number (no user last name): " + validRegisterPhone);

        System.out.println("\n");
    }

    //invalid user register data getter - no user address
    public void invalidUserRegisterDataNoAddressGetter(){

        validRegisterEmail = TestDataGenerator.generateRandomEmailAddress(6);
        validRegisterPassword = TestDataGenerator.generateRandomPassword();
        validRegisterConfirmPassword = validRegisterPassword;
        validRegisterFirstName = TestDataGenerator.getRandomFirstName();
        validRegisterLastName = TestDataGenerator.getRandomLastName();
        noUserRegisterAddress = "";
        validRegisterCity = TestDataGenerator.getRandomCity();
        validRegisterPostCode = TestDataGenerator.getRandomPostalCode();
        validRegisterPhone = TestDataGenerator.generatePhoneNumber(9);

        System.out.println("Invalid user register generated data (no user address): " + "\n");

        logger.info("Valid generated user email address (no user address): " + validRegisterEmail);
        logger.info("Valid generated user password (no user address): " + validRegisterPassword);
        logger.info("Valid generated user confirm password (no user address): " + validRegisterConfirmPassword);
        logger.info("Valid generated user first name (no user address): " + validRegisterFirstName);
        logger.info("Valid generated user last name (no user address): " + validRegisterLastName);
        logger.info("No user address: " + noUserRegisterAddress);
        logger.info("Valid generated user city (no user address): " + validRegisterCity);
        logger.info("Valid generated user post code (no user address): " + validRegisterPostCode);
        logger.info("Valid generated user phone number (no user address): " + validRegisterPhone);

        System.out.println("\n");
    }

    //invalid user register data getter - no user city
    public void invalidUserRegisterDataNoCityGetter(){

        validRegisterEmail = TestDataGenerator.generateRandomEmailAddress(6);
        validRegisterPassword = TestDataGenerator.generateRandomPassword();
        validRegisterConfirmPassword = validRegisterPassword;
        validRegisterFirstName = TestDataGenerator.getRandomFirstName();
        validRegisterLastName = TestDataGenerator.getRandomLastName();
        validRegisterAddress = TestDataGenerator.generateRandomAddress(6);
        noUserRegisterCity = "";
        validRegisterPostCode = TestDataGenerator.getRandomPostalCode();
        validRegisterPhone = TestDataGenerator.generatePhoneNumber(9);

        System.out.println("Invalid user register generated data (no user city): " + "\n");

        logger.info("Valid generated user email address (no user city): " + validRegisterEmail);
        logger.info("Valid generated user password (no user city): " + validRegisterPassword);
        logger.info("Valid generated user confirm password (no user city): " + validRegisterConfirmPassword);
        logger.info("Valid generated user first name (no user city): " + validRegisterFirstName);
        logger.info("Valid generated user last name (no user city): " + validRegisterLastName);
        logger.info("Valid generated user address (no user city): " + validRegisterAddress);
        logger.info("No user city: " + noUserRegisterCity);
        logger.info("Valid generated user post code (no user city): " + validRegisterPostCode);
        logger.info("Valid generated user phone number (no user city): " + validRegisterPhone);

        System.out.println("\n");
    }

    //invalid user register data getter - no user post code
    public void invalidUserRegisterDataNoPostCodeGetter(){

        validRegisterEmail = TestDataGenerator.generateRandomEmailAddress(6);
        validRegisterPassword = TestDataGenerator.generateRandomPassword();
        validRegisterConfirmPassword = validRegisterPassword;
        validRegisterFirstName = TestDataGenerator.getRandomFirstName();
        validRegisterLastName = TestDataGenerator.getRandomLastName();
        validRegisterAddress = TestDataGenerator.generateRandomAddress(6);
        validRegisterCity = TestDataGenerator.getRandomCity();
        noUserRegisterPostCode = "";
        validRegisterPhone = TestDataGenerator.generatePhoneNumber(9);

        System.out.println("Invalid user register generated data (no user post code): " + "\n");

        logger.info("Valid generated user email address (no user post code): " + validRegisterEmail);
        logger.info("Valid generated user password (no user post code): " + validRegisterPassword);
        logger.info("Valid generated user confirm password (no user post code): " + validRegisterConfirmPassword);
        logger.info("Valid generated user first name (no user post code): " + validRegisterFirstName);
        logger.info("Valid generated user last name (no user post code): " + validRegisterLastName);
        logger.info("Valid generated user address (no user post code): " + validRegisterAddress);
        logger.info("Valid generated user city (no user post code): " + validRegisterCity);
        logger.info("No user post code: " + noUserRegisterPostCode);
        logger.info("Valid generated user phone number (no user post code): " + validRegisterPhone);

        System.out.println("\n");
    }

    //invalid register data input methods - no singular input
    public void inputNoRegisterEmailIntoEmailInputField(){registerPageEmailInputField.sendKeys(noUserRegisterEmail);}
    public void inputNoRegisterPasswordIntoPasswordInputField(){registerPagePasswordInputField.sendKeys(noUserRegisterPassword);}
    public void inputNoRegisterConfirmPasswordIntoConfirmPasswordInputField(){registerPageConfirmPasswordInputField.sendKeys(noUserRegisterPassword);}
    public void inputNoRegisterFirstNameIntoFirstNameInputField(){registerPageFirstNameInputField.sendKeys(noUserRegisterFirstName);}
    public void inputNoRegisterLastNameIntoLastNameInputField(){registerPageLastNameInputField.sendKeys(noUserRegisterLastName);}
    public void inputNoRegisterAddressIntoAddressInputField(){registerPageAddress1InputField.sendKeys(noUserRegisterAddress);}
    public void inputNoRegisterCityIntoCityInputField(){registerPageCityInputField.sendKeys(noUserRegisterCity);}
    public void inputNoRegisterPostCodeIntoPostCodeInputField(){registerPagePostCodeInputField.sendKeys(noUserRegisterPostCode);}

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
