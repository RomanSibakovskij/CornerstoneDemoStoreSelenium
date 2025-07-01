package com.mybigcommerce.demo.regpageinvalidscenarios;

import com.mybigcommerce.demo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class RegisterPageTooLongSingularInput extends BasePage{

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

    //invalid user register input data - too long singular input
    private String tooLongUserRegisterEmail;
    private String tooLongUserRegisterPassword;
    private String tooLongUserRegisterFirstName;
    private String tooLongUserRegisterLastName;
    private String tooLongUserRegisterAddress;
    private String tooLongUserRegisterCity;
    private int tooLongUserRegisterPostCode;

    public RegisterPageTooLongSingularInput(WebDriver driver) {super(driver);}

    //invalid user register data getter - too long user email (100 chars -> name, domain)
    public void invalidUserRegisterDataTooLongEmailGetter(){

        tooLongUserRegisterEmail = TestDataGenerator.generateRandomTooLongEmailAddress(100);
        validRegisterPassword = TestDataGenerator.generateRandomPassword();
        validRegisterConfirmPassword = validRegisterPassword;
        validRegisterFirstName = TestDataGenerator.getRandomFirstName();
        validRegisterLastName = TestDataGenerator.getRandomLastName();
        validRegisterAddress = TestDataGenerator.generateRandomAddress(6);
        validRegisterCity = TestDataGenerator.getRandomCity();
        validRegisterPostCode = TestDataGenerator.getRandomPostalCode();
        validRegisterPhone = TestDataGenerator.generatePhoneNumber(9);

        System.out.println("Invalid user register generated data (too long user email): " + "\n");

        logger.info("Too long user email address: " + tooLongUserRegisterEmail);
        logger.info("Valid generated user password (too long user email): " + validRegisterPassword);
        logger.info("Valid matching user confirm password (too long user email): " + validRegisterConfirmPassword);
        logger.info("Valid generated user first name (too long user email): " + validRegisterFirstName);
        logger.info("Valid generated user last name (too short user email): " + validRegisterLastName);
        logger.info("Valid generated user address (too short user email): " + validRegisterAddress);
        logger.info("Valid generated user city (too short user email): " + validRegisterCity);
        logger.info("Valid generated user post code (too short user email): " + validRegisterPostCode);
        logger.info("Valid generated user phone number (too short user email): " + validRegisterPhone);

        System.out.println("\n");
    }

    //invalid user register data getter - too long user password / confirm password (75 chars)
    public void invalidUserRegisterDataTooLongPasswordConfirmGetter(){

        validRegisterEmail = TestDataGenerator.generateRandomEmailAddress(6);
        tooLongUserRegisterPassword = "Rdsffhgfhsdegttgyujiilukfgdsfdgchjkliiuikyuiiopopiiu42345fgdgfdgrewrdffdhfd";
        validRegisterFirstName = TestDataGenerator.getRandomFirstName();
        validRegisterLastName = TestDataGenerator.getRandomLastName();
        validRegisterAddress = TestDataGenerator.generateRandomAddress(6);
        validRegisterCity = TestDataGenerator.getRandomCity();
        validRegisterPostCode = TestDataGenerator.getRandomPostalCode();
        validRegisterPhone = TestDataGenerator.generatePhoneNumber(9);

        System.out.println("Invalid user register generated data (too long user password / confirm password): " + "\n");

        logger.info("Valid generated user email address (too long user password / confirm password): " + validRegisterEmail);
        logger.info("Too long user password: " + tooLongUserRegisterPassword);
        logger.info("Too long matching user confirm password: " + tooLongUserRegisterPassword);
        logger.info("Valid generated user first name (too long user password / confirm password): " + validRegisterFirstName);
        logger.info("Valid generated user last name (too long user password / confirm password): " + validRegisterLastName);
        logger.info("Valid generated user address (too long user password / confirm password): " + validRegisterAddress);
        logger.info("Valid generated user city (too long user password / confirm password): " + validRegisterCity);
        logger.info("Valid generated user post code (too long user password / confirm password): " + validRegisterPostCode);
        logger.info("Valid generated user phone number (too long user password / confirm password): " + validRegisterPhone);

        System.out.println("\n");
    }

    //invalid user register data getter - too long user first name (100 chars)
    public void invalidUserRegisterDataTooLongFirstNameGetter(){

        validRegisterEmail = TestDataGenerator.generateRandomEmailAddress(6);
        validRegisterPassword = TestDataGenerator.generateRandomPassword();
        validRegisterConfirmPassword = validRegisterPassword;
        tooLongUserRegisterFirstName = "Phfgdsgdtwetrtjdsfgrfdgjhkjmngbfdsfgfhkjgsedhgtfgsdetgtujyhgdsfgdfhtgfsdfdrhfthdfsegtthtgfddxgdfhgdg";
        validRegisterLastName = TestDataGenerator.getRandomLastName();
        validRegisterAddress = TestDataGenerator.generateRandomAddress(6);
        validRegisterCity = TestDataGenerator.getRandomCity();
        validRegisterPostCode = TestDataGenerator.getRandomPostalCode();
        validRegisterPhone = TestDataGenerator.generatePhoneNumber(9);

        System.out.println("Invalid user register generated data (too long user first name): " + "\n");

        logger.info("Valid generated user email address (too long user first name): " + validRegisterEmail);
        logger.info("Valid generated user password (too long user first name): " + validRegisterPassword);
        logger.info("Valid matching user confirm password (too long user first name): " + validRegisterConfirmPassword);
        logger.info("Too long user first name: " + tooLongUserRegisterFirstName);
        logger.info("Valid generated user last name (too long user first name): " + validRegisterLastName);
        logger.info("Valid generated user address (too long user first name): " + validRegisterAddress);
        logger.info("Valid generated user city (too long user first name): " + validRegisterCity);
        logger.info("Valid generated user post code (too long user first name): " + validRegisterPostCode);
        logger.info("Valid generated user phone number (too long user first name): " + validRegisterPhone);

        System.out.println("\n");
    }

    //invalid user register data getter - too long user last name (100 chars)
    public void invalidUserRegisterDataTooLongLastNameGetter(){

        validRegisterEmail = TestDataGenerator.generateRandomEmailAddress(6);
        validRegisterPassword = TestDataGenerator.generateRandomPassword();
        validRegisterConfirmPassword = validRegisterPassword;
        validRegisterFirstName = TestDataGenerator.getRandomFirstName();
        tooLongUserRegisterLastName = "Phfgdsgdtwetrtjdsfgrfdgjhkjmngbfdsfgfhkjgsedhgtfgsdetgtujyhgdsfgdfhtgfsdfdrhfthdfsegtthtgfddxgdfhgdg";
        validRegisterAddress = TestDataGenerator.generateRandomAddress(6);
        validRegisterCity = TestDataGenerator.getRandomCity();
        validRegisterPostCode = TestDataGenerator.getRandomPostalCode();
        validRegisterPhone = TestDataGenerator.generatePhoneNumber(9);

        System.out.println("Invalid user register generated data (too long user last name): " + "\n");

        logger.info("Valid generated user email address (too long user last name): " + validRegisterEmail);
        logger.info("Valid generated user password (too long user last name): " + validRegisterPassword);
        logger.info("Valid matching user confirm password (too long user last name): " + validRegisterConfirmPassword);
        logger.info("Valid generated user first name (too long user last name): " + validRegisterFirstName);
        logger.info("Too long user last name: " + tooLongUserRegisterLastName);
        logger.info("Valid generated user address (too long user last name): " + validRegisterAddress);
        logger.info("Valid generated user city (too long user last name): " + validRegisterCity);
        logger.info("Valid generated user post code (too long user last name): " + validRegisterPostCode);
        logger.info("Valid generated user phone number (too long user last name): " + validRegisterPhone);

        System.out.println("\n");
    }

    //invalid user register data getter - too long user address (100 chars)
    public void invalidUserRegisterDataTooLongAddressGetter(){

        validRegisterEmail = TestDataGenerator.generateRandomEmailAddress(6);
        validRegisterPassword = TestDataGenerator.generateRandomPassword();
        validRegisterConfirmPassword = validRegisterPassword;
        validRegisterFirstName = TestDataGenerator.getRandomFirstName();
        validRegisterLastName = TestDataGenerator.getRandomLastName();
        tooLongUserRegisterAddress = TestDataGenerator.generateRandomAddress(93);
        validRegisterCity = TestDataGenerator.getRandomCity();
        validRegisterPostCode = TestDataGenerator.getRandomPostalCode();
        validRegisterPhone = TestDataGenerator.generatePhoneNumber(9);

        System.out.println("Invalid user register generated data (too long user address): " + "\n");

        logger.info("Valid generated user email address (too long user address): " + validRegisterEmail);
        logger.info("Valid generated user password (too long user address): " + validRegisterPassword);
        logger.info("Valid matching user confirm password (too long user address): " + validRegisterConfirmPassword);
        logger.info("Valid generated user first name (too long user address): " + validRegisterFirstName);
        logger.info("Valid generated user last name (too long user address): " + validRegisterLastName);
        logger.info("Too long user address: " + tooLongUserRegisterAddress);
        logger.info("Valid generated user city (too long user address): " + validRegisterCity);
        logger.info("Valid generated user post code (too long user address): " + validRegisterPostCode);
        logger.info("Valid generated user phone number (too long user address): " + validRegisterPhone);

        System.out.println("\n");
    }

    //invalid user register data getter - too long user city (100 chars)
    public void invalidUserRegisterDataTooLongCityGetter(){

        validRegisterEmail = TestDataGenerator.generateRandomEmailAddress(6);
        validRegisterPassword = TestDataGenerator.generateRandomPassword();
        validRegisterConfirmPassword = validRegisterPassword;
        validRegisterFirstName = TestDataGenerator.getRandomFirstName();
        validRegisterLastName = TestDataGenerator.getRandomLastName();
        validRegisterAddress = TestDataGenerator.generateRandomAddress(6);
        tooLongUserRegisterCity = "Phfgdsgdtwetrtjdsfgrfdgjhkjmngbfdsfgfhkjgsedhgtfgsdetgtujyhgdsfgdfhtgfsdfdrhfthdfsegtthtgfddxgdfhgdg";
        validRegisterPostCode = TestDataGenerator.getRandomPostalCode();
        validRegisterPhone = TestDataGenerator.generatePhoneNumber(9);

        System.out.println("Invalid user register generated data (too long user city): " + "\n");

        logger.info("Valid generated user email address (too long user city): " + validRegisterEmail);
        logger.info("Valid generated user password (too long user city): " + validRegisterPassword);
        logger.info("Valid matching user confirm password (too long user city): " + validRegisterConfirmPassword);
        logger.info("Valid generated user first name (too long user city): " + validRegisterFirstName);
        logger.info("Valid generated user last name (too long user city): " + validRegisterLastName);
        logger.info("Valid generated user address (too long user city): " + validRegisterAddress);
        logger.info("Too long user city: " + tooLongUserRegisterCity);
        logger.info("Valid generated user post code (too long user city): " + validRegisterPostCode);
        logger.info("Valid generated user phone number (too long user city): " + validRegisterPhone);

        System.out.println("\n");
    }

    //invalid user register data getter - too long user post code (6 digits)
    public void invalidUserRegisterDataTooLongPostCodeGetter(){

        validRegisterEmail = TestDataGenerator.generateRandomEmailAddress(6);
        validRegisterPassword = TestDataGenerator.generateRandomPassword();
        validRegisterConfirmPassword = validRegisterPassword;
        validRegisterFirstName = TestDataGenerator.getRandomFirstName();
        validRegisterLastName = TestDataGenerator.getRandomLastName();
        validRegisterAddress = TestDataGenerator.generateRandomAddress(6);
        validRegisterCity = TestDataGenerator.getRandomCity();
        tooLongUserRegisterPostCode = 616785;
        validRegisterPhone = TestDataGenerator.generatePhoneNumber(9);

        System.out.println("Invalid user register generated data (too long user post code): " + "\n");

        logger.info("Valid generated user email address (too long user post code): " + validRegisterEmail);
        logger.info("Valid generated user password (too long user post code): " + validRegisterPassword);
        logger.info("Valid matching user confirm password (too long user post code): " + validRegisterConfirmPassword);
        logger.info("Valid generated user first name (too long user post code): " + validRegisterFirstName);
        logger.info("Valid generated user last name (too long user post code): " + validRegisterLastName);
        logger.info("Valid generated user address (too long user post code): " + validRegisterAddress);
        logger.info("Valid generated user city (too long user post code): " + validRegisterCity);
        logger.info("Too long user post code: " + tooLongUserRegisterPostCode);
        logger.info("Valid generated user phone number (too long user post code): " + validRegisterPhone);

        System.out.println("\n");
    }

    //invalid register data input methods - too long singular input
    public void inputTooLongRegisterEmailIntoEmailInputField(){registerPageEmailInputField.sendKeys(tooLongUserRegisterEmail);}
    public void inputTooLongRegisterPasswordIntoPasswordInputField(){registerPagePasswordInputField.sendKeys(tooLongUserRegisterPassword);}
    public void inputTooLongRegisterConfirmPasswordIntoConfirmPasswordInputField(){registerPageConfirmPasswordInputField.sendKeys(tooLongUserRegisterPassword);}
    public void inputTooLongRegisterFirstNameIntoFirstNameInputField(){registerPageFirstNameInputField.sendKeys(tooLongUserRegisterFirstName);}
    public void inputTooLongRegisterLastNameIntoLastNameInputField(){registerPageLastNameInputField.sendKeys(tooLongUserRegisterLastName);}
    public void inputTooLongRegisterAddressIntoAddressInputField(){registerPageAddress1InputField.sendKeys(tooLongUserRegisterAddress);}
    public void inputTooLongRegisterCityIntoCityInputField(){registerPageCityInputField.sendKeys(tooLongUserRegisterCity);}
    public void inputTooLongRegisterPostCodeIntoPostCodeInputField(){registerPagePostCodeInputField.sendKeys(String.valueOf(tooLongUserRegisterPostCode));}

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
