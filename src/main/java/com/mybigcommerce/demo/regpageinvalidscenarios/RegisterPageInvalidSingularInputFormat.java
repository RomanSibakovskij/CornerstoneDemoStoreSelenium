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
    private String invalidUserRegisterPasswordFormat;
    private String mismatchingUserConfirmPasswordFormat;
    private String invalidUserRegisterFirstNameFormat;
    private String invalidUserRegisterLastNameFormat;
    private String invalidUserRegisterAddressFormat;
    private String invalidUserRegisterCityFormat;
    private String invalidUserRegisterPostCodeFormat;
    private String invalidUserRegisterPhoneFormat;

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

    //invalid user register data getter - invalid user password / confirm password (string chars only)
    public void invalidUserRegisterDataInvalidPasswordConfirmFormatGetter(){

        validRegisterEmail = TestDataGenerator.generateRandomEmailAddress(6);
        invalidUserRegisterPasswordFormat = "Stokersdesx";
        validRegisterFirstName = TestDataGenerator.getRandomFirstName();
        validRegisterLastName = TestDataGenerator.getRandomLastName();
        validRegisterAddress = TestDataGenerator.generateRandomAddress(6);
        validRegisterCity = TestDataGenerator.getRandomCity();
        validRegisterPostCode = TestDataGenerator.getRandomPostalCode();
        validRegisterPhone = TestDataGenerator.generatePhoneNumber(9);

        System.out.println("Invalid user register generated data (invalid user password / confirm password): " + "\n");

        logger.info("Valid generated user email address (too long user password / confirm password): " + validRegisterEmail);
        logger.info("Invalid user password format: " + invalidUserRegisterPasswordFormat);
        logger.info("Invalid matching user confirm password format: " + invalidUserRegisterPasswordFormat);
        logger.info("Valid generated user first name (too long user password / confirm password): " + validRegisterFirstName);
        logger.info("Valid generated user last name (too long user password / confirm password): " + validRegisterLastName);
        logger.info("Valid generated user address (too long user password / confirm password): " + validRegisterAddress);
        logger.info("Valid generated user city (too long user password / confirm password): " + validRegisterCity);
        logger.info("Valid generated user post code (too long user password / confirm password): " + validRegisterPostCode);
        logger.info("Valid generated user phone number (too long user password / confirm password): " + validRegisterPhone);

        System.out.println("\n");
    }

    //invalid user register data getter - mismatching confirm password (string chars only)
    public void invalidUserRegisterDataMismatchConfirmPasswordGetter(){

        validRegisterEmail = TestDataGenerator.generateRandomEmailAddress(6);
        validRegisterPassword = TestDataGenerator.generateRandomPassword();
        mismatchingUserConfirmPasswordFormat = "frggderttfd";
        validRegisterFirstName = TestDataGenerator.getRandomFirstName();
        validRegisterLastName = TestDataGenerator.getRandomLastName();
        validRegisterAddress = TestDataGenerator.generateRandomAddress(6);
        validRegisterCity = TestDataGenerator.getRandomCity();
        validRegisterPostCode = TestDataGenerator.getRandomPostalCode();
        validRegisterPhone = TestDataGenerator.generatePhoneNumber(9);

        System.out.println("Invalid user register generated data (mismatching confirm password): " + "\n");

        logger.info("Valid generated user email address (mismatching confirm password): " + validRegisterEmail);
        logger.info("Valid user password: " + invalidUserRegisterPasswordFormat);
        logger.info("Mismatching user confirm password format: " + mismatchingUserConfirmPasswordFormat);
        logger.info("Valid generated user first name (mismatching confirm password): " + validRegisterFirstName);
        logger.info("Valid generated user last name (mismatching confirm password): " + validRegisterLastName);
        logger.info("Valid generated user address (mismatching confirm password): " + validRegisterAddress);
        logger.info("Valid generated user city (mismatching confirm password): " + validRegisterCity);
        logger.info("Valid generated user post code (mismatching confirm password): " + validRegisterPostCode);
        logger.info("Valid generated user phone number (mismatching confirm password): " + validRegisterPhone);

        System.out.println("\n");
    }

    //invalid user register data getter - invalid user first name format (special symbols only)
    public void invalidUserRegisterDataInvalidFirstNameFormatGetter(){

        validRegisterEmail = TestDataGenerator.generateRandomEmailAddress(6);
        validRegisterPassword = TestDataGenerator.generateRandomPassword();
        validRegisterConfirmPassword = validRegisterPassword;
        invalidUserRegisterFirstNameFormat = "@$#%$%^%$&";
        validRegisterLastName = TestDataGenerator.getRandomLastName();
        validRegisterAddress = TestDataGenerator.generateRandomAddress(6);
        validRegisterCity = TestDataGenerator.getRandomCity();
        validRegisterPostCode = TestDataGenerator.getRandomPostalCode();
        validRegisterPhone = TestDataGenerator.generatePhoneNumber(9);

        System.out.println("Invalid user register generated data (invalid user first name format): " + "\n");

        logger.info("Valid generated user email address (invalid user first name format): " + validRegisterEmail);
        logger.info("Valid generated user password (invalid user first name format): " + validRegisterPassword);
        logger.info("Valid matching user confirm password (invalid user first name format): " + validRegisterConfirmPassword);
        logger.info("Invalid user first name format: " + invalidUserRegisterFirstNameFormat);
        logger.info("Valid generated user last name (too long user first name): " + validRegisterLastName);
        logger.info("Valid generated user address (too long user first name): " + validRegisterAddress);
        logger.info("Valid generated user city (too long user first name): " + validRegisterCity);
        logger.info("Valid generated user post code (too long user first name): " + validRegisterPostCode);
        logger.info("Valid generated user phone number (too long user first name): " + validRegisterPhone);

        System.out.println("\n");
    }

    //invalid user register data getter - invalid user last name format (special symbols only)
    public void invalidUserRegisterDataInvalidLastNameFormatGetter(){

        validRegisterEmail = TestDataGenerator.generateRandomEmailAddress(6);
        validRegisterPassword = TestDataGenerator.generateRandomPassword();
        validRegisterConfirmPassword = validRegisterPassword;
        validRegisterFirstName = TestDataGenerator.getRandomFirstName();
        invalidUserRegisterLastNameFormat = "*^%^%$%^$%";
        validRegisterAddress = TestDataGenerator.generateRandomAddress(6);
        validRegisterCity = TestDataGenerator.getRandomCity();
        validRegisterPostCode = TestDataGenerator.getRandomPostalCode();
        validRegisterPhone = TestDataGenerator.generatePhoneNumber(9);

        System.out.println("Invalid user register generated data (invalid user last name format): " + "\n");

        logger.info("Valid generated user email address (invalid user last name format): " + validRegisterEmail);
        logger.info("Valid generated user password (invalid user last name format): " + validRegisterPassword);
        logger.info("Valid matching user confirm password (invalid user last name format): " + validRegisterConfirmPassword);
        logger.info("Valid generated user first name (invalid user last name format): " + validRegisterFirstName);
        logger.info("Invalid user last name format: " + invalidUserRegisterLastNameFormat);
        logger.info("Valid generated user address (invalid user last name format): " + validRegisterAddress);
        logger.info("Valid generated user city (invalid user last name format): " + validRegisterCity);
        logger.info("Valid generated user post code (invalid user last name format): " + validRegisterPostCode);
        logger.info("Valid generated user phone number (invalid user last name format): " + validRegisterPhone);

        System.out.println("\n");
    }

    //invalid user register data getter - invalid user address format (special symbols only)
    public void invalidUserRegisterDataInvalidAddressFormatGetter(){

        validRegisterEmail = TestDataGenerator.generateRandomEmailAddress(6);
        validRegisterPassword = TestDataGenerator.generateRandomPassword();
        validRegisterConfirmPassword = validRegisterPassword;
        validRegisterFirstName = TestDataGenerator.getRandomFirstName();
        validRegisterLastName = TestDataGenerator.getRandomLastName();
        invalidUserRegisterAddressFormat = "@$@#$^%$";
        validRegisterCity = TestDataGenerator.getRandomCity();
        validRegisterPostCode = TestDataGenerator.getRandomPostalCode();
        validRegisterPhone = TestDataGenerator.generatePhoneNumber(9);

        System.out.println("Invalid user register generated data (invalid user address format): " + "\n");

        logger.info("Valid generated user email address (invalid user address format): " + validRegisterEmail);
        logger.info("Valid generated user password (invalid user address format): " + validRegisterPassword);
        logger.info("Valid matching user confirm password (invalid user address format): " + validRegisterConfirmPassword);
        logger.info("Valid generated user first name (invalid user address format): " + validRegisterFirstName);
        logger.info("Valid generated user last name (invalid user address format): " + validRegisterLastName);
        logger.info("Invalid user address format: " + invalidUserRegisterAddressFormat);
        logger.info("Valid generated user city (invalid user address format): " + validRegisterCity);
        logger.info("Valid generated user post code (invalid user address format): " + validRegisterPostCode);
        logger.info("Valid generated user phone number (invalid user address format): " + validRegisterPhone);

        System.out.println("\n");
    }

    //invalid user register data getter - invalid user city format (special symbols only)
    public void invalidUserRegisterDataInvalidCityFormatGetter(){

        validRegisterEmail = TestDataGenerator.generateRandomEmailAddress(6);
        validRegisterPassword = TestDataGenerator.generateRandomPassword();
        validRegisterConfirmPassword = validRegisterPassword;
        validRegisterFirstName = TestDataGenerator.getRandomFirstName();
        validRegisterLastName = TestDataGenerator.getRandomLastName();
        validRegisterAddress = TestDataGenerator.generateRandomAddress(6);
        invalidUserRegisterCityFormat = "#%$#^%&^^%";
        validRegisterPostCode = TestDataGenerator.getRandomPostalCode();
        validRegisterPhone = TestDataGenerator.generatePhoneNumber(9);

        System.out.println("Invalid user register generated data (invalid user city format): " + "\n");

        logger.info("Valid generated user email address (invalid user city format): " + validRegisterEmail);
        logger.info("Valid generated user password (invalid user city format): " + validRegisterPassword);
        logger.info("Valid matching user confirm password (invalid user city format): " + validRegisterConfirmPassword);
        logger.info("Valid generated user first name (invalid user city format): " + validRegisterFirstName);
        logger.info("Valid generated user last name (invalid user city format): " + validRegisterLastName);
        logger.info("Valid generated user address (invalid user city format): " + validRegisterAddress);
        logger.info("Invalid user city format: " + invalidUserRegisterCityFormat);
        logger.info("Valid generated user post code (invalid user city format): " + validRegisterPostCode);
        logger.info("Valid generated user phone number (invalid user city format): " + validRegisterPhone);

        System.out.println("\n");
    }

    //invalid user register data getter - invalid user post code format (special symbols only)
    public void invalidUserRegisterDataInvalidPostCodeFormatGetter(){

        validRegisterEmail = TestDataGenerator.generateRandomEmailAddress(6);
        validRegisterPassword = TestDataGenerator.generateRandomPassword();
        validRegisterConfirmPassword = validRegisterPassword;
        validRegisterFirstName = TestDataGenerator.getRandomFirstName();
        validRegisterLastName = TestDataGenerator.getRandomLastName();
        validRegisterAddress = TestDataGenerator.generateRandomAddress(6);
        validRegisterCity = TestDataGenerator.getRandomCity();
        invalidUserRegisterPostCodeFormat = "@#$@$%$#^";
        validRegisterPhone = TestDataGenerator.generatePhoneNumber(9);

        System.out.println("Invalid user register generated data (invalid user post code format): " + "\n");

        logger.info("Valid generated user email address (invalid user post code format): " + validRegisterEmail);
        logger.info("Valid generated user password (invalid user post code format): " + validRegisterPassword);
        logger.info("Valid matching user confirm password (invalid user post code format): " + validRegisterConfirmPassword);
        logger.info("Valid generated user first name (invalid user post code format): " + validRegisterFirstName);
        logger.info("Valid generated user last name (invalid user post code format): " + validRegisterLastName);
        logger.info("Valid generated user address (invalid user post code format): " + validRegisterAddress);
        logger.info("Valid generated user city (invalid user post code format): " + validRegisterCity);
        logger.info("Invalid user post code format: " + invalidUserRegisterPostCodeFormat);
        logger.info("Valid generated user phone number (invalid user post code format): " + validRegisterPhone);

        System.out.println("\n");
    }

    //invalid user register data getter - invalid user phone format (special symbols only)
    public void invalidUserRegisterDataInvalidPhoneFormatGetter(){

        validRegisterEmail = TestDataGenerator.generateRandomEmailAddress(6);
        validRegisterPassword = TestDataGenerator.generateRandomPassword();
        validRegisterConfirmPassword = validRegisterPassword;
        validRegisterFirstName = TestDataGenerator.getRandomFirstName();
        validRegisterLastName = TestDataGenerator.getRandomLastName();
        validRegisterAddress = TestDataGenerator.generateRandomAddress(6);
        validRegisterCity = TestDataGenerator.getRandomCity();
        validRegisterPostCode = TestDataGenerator.getRandomPostalCode();
        invalidUserRegisterPhoneFormat = "@$#@%$^&";

        System.out.println("Invalid user register generated data (invalid user phone format): " + "\n");

        logger.info("Valid generated user email address (invalid user phone format): " + validRegisterEmail);
        logger.info("Valid generated user password (invalid user phone format): " + validRegisterPassword);
        logger.info("Valid matching user confirm password (invalid user phone format): " + validRegisterConfirmPassword);
        logger.info("Valid generated user first name (invalid user phone format): " + validRegisterFirstName);
        logger.info("Valid generated user last name (invalid user phone format): " + validRegisterLastName);
        logger.info("Valid generated user address (invalid user phone format): " + validRegisterAddress);
        logger.info("Valid generated user city (invalid user phone format): " + validRegisterCity);
        logger.info("Valid generated user post code (invalid user phone format): " + validRegisterPostCode);
        logger.info("Invalid user phone number format: " + invalidUserRegisterPhoneFormat);

        System.out.println("\n");
    }

    //invalid register data input methods - invalid singular input format
    public void inputInvalidRegisterEmailFormatIntoEmailInputField(){registerPageEmailInputField.sendKeys(invalidUserRegisterEmailFormat);}
    public void inputExistingRegEmailFormatIntoEmailInputField(){registerPageEmailInputField.sendKeys(invalidUserExistingEmail);}
    public void inputInvalidRegisterPasswordFormatIntoPasswordInputField(){registerPagePasswordInputField.sendKeys(invalidUserRegisterPasswordFormat);}
    public void inputInvalidRegisterConfirmPasswordFormatIntoConfirmPasswordInputField(){registerPageConfirmPasswordInputField.sendKeys(invalidUserRegisterPasswordFormat);}
    public void inputMismatchRegisterConfirmPasswordIntoConfirmPasswordInputField(){registerPageConfirmPasswordInputField.sendKeys(mismatchingUserConfirmPasswordFormat);}
    public void inputInvalidRegisterFirstNameFormatIntoFirstNameInputField(){registerPageFirstNameInputField.sendKeys(invalidUserRegisterFirstNameFormat);}
    public void inputInvalidRegisterLastNameFormatIntoLastNameInputField(){registerPageLastNameInputField.sendKeys(invalidUserRegisterLastNameFormat);}
    public void inputInvalidRegisterAddressFormatIntoAddressInputField(){registerPageAddress1InputField.sendKeys(invalidUserRegisterAddressFormat);}
    public void inputInvalidRegisterCityFormatIntoCityInputField(){registerPageCityInputField.sendKeys(invalidUserRegisterCityFormat);}
    public void inputInvalidRegisterPostCodeFormatIntoPostCodeInputField(){registerPagePostCodeInputField.sendKeys(invalidUserRegisterPostCodeFormat);}
    public void inputInvalidRegisterPhoneFormatIntoPhoneNumberInputField(){registerPagePhoneInputField.sendKeys(invalidUserRegisterPhoneFormat);}

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
