package com.mybigcommerce.demo.accountpageinvalidscenarios;

import com.mybigcommerce.demo.RegisterPage;
import com.mybigcommerce.demo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class AccountSettingPageInvalidSingularInputFormat extends BasePage{

    //input form
    @FindBy(xpath = "//input[@id='account_firstname']")
    private WebElement accountSettingsFirstNameInputField;
    @FindBy(xpath = "//input[@id='account_lastname']")
    private WebElement accountSettingsLastNameInputField;
    @FindBy(xpath = "//input[@id='FormField_1_input']")
    private WebElement accountSettingsEmailInputField;
    @FindBy(xpath = "//input[@id='FormField_2_input']")
    private WebElement accountSettingsPasswordInputField;
    @FindBy(xpath = "//input[@id='FormField_3_input']")
    private WebElement accountSettingsConfirmPasswordInputField;
    @FindBy(xpath = "//input[@id='FormField_24_input']")
    private WebElement accountSettingsCurrentPasswordInputField;

    //valid edited user account data (for remaining inputs)
    private String validEditedUserFirstName;
    private String validEditedUserLastName;
    private static String validEditedUserEmail;
    private String validUserCurrentPassword;

    //invalid edited user account data  - invalid singular input format
    private String invalidEditedUserFirstNameFormat;
    private String invalidEditedUserLastNameFormat;
    private String invalidEditedUserEmailFormat;
    private String existingEditedUserEmail;

    public AccountSettingPageInvalidSingularInputFormat(WebDriver driver) {super(driver);}

    //invalid edited user account data getter - invalid edited first name format (special symbols only)
    public void invalidEditedUserAccountDataInvalidFirstNameFormatGetter(){

        RegisterPage registerPage = new RegisterPage(driver);

        invalidEditedUserFirstNameFormat = "#%$$%^%";
        validEditedUserLastName = TestDataGenerator.getRandomLastName();
        validEditedUserEmail = TestDataGenerator.generateRandomEmailAddress(8);
        validUserCurrentPassword = registerPage.getPassword();

        System.out.println("Valid generated edited user account data (invalid user first name format): " + "\n");

        logger.info("Invalid edited user first name format: " + invalidEditedUserFirstNameFormat);
        logger.info("Valid generated edited user last name (invalid user first name format): " + validEditedUserLastName);
        logger.info("Valid generated edited user email (invalid user first name format): " + validEditedUserEmail);
        logger.info("Valid current user password (invalid user first name format): " + validUserCurrentPassword);

        System.out.println("\n");

    }

    //invalid edited user account data getter - invalid edited last name format (special symbols only)
    public void invalidEditedUserAccountDataInvalidLastNameFormatGetter(){

        RegisterPage registerPage = new RegisterPage(driver);

        validEditedUserFirstName = TestDataGenerator.getRandomFirstName();
        invalidEditedUserLastNameFormat = "@$#$%";
        validEditedUserEmail = TestDataGenerator.generateRandomEmailAddress(8);
        validUserCurrentPassword = registerPage.getPassword();

        System.out.println("Valid generated edited user account data (invalid user last name format): " + "\n");

        logger.info("Valid generated edited user first name (invalid user last name format): " + validEditedUserFirstName);
        logger.info("Invalid edited user last name format: " + invalidEditedUserLastNameFormat);
        logger.info("Valid generated edited user email (invalid user last name format): " + validEditedUserEmail);
        logger.info("Valid current user password (invalid user last name format): " + validUserCurrentPassword);

        System.out.println("\n");

    }

    //invalid edited user account data getter - invalid edited email format (missing '@')
    public void invalidEditedUserAccountDataInvalidEmailFormatGetter(){

        RegisterPage registerPage = new RegisterPage(driver);

        validEditedUserFirstName = TestDataGenerator.getRandomFirstName();
        validEditedUserLastName = TestDataGenerator.getRandomLastName();
        invalidEditedUserEmailFormat = "fddfdsexample.com";
        validUserCurrentPassword = registerPage.getPassword();

        System.out.println("Valid generated edited user account data (invalid user email format): " + "\n");

        logger.info("Valid generated edited user first name (invalid user email format): " + validEditedUserFirstName);
        logger.info("Valid generated edited user last name (invalid user email format): " + validEditedUserLastName);
        logger.info("Invalid edited user email format: " + invalidEditedUserEmailFormat);
        logger.info("Valid current user password (invalid user email format): " + validUserCurrentPassword);

        System.out.println("\n");

    }

    //invalid edited user account data getter - pre-existing email (used beforehand in manual testing)
    public void invalidEditedUserAccountDataExistingEmailGetter(){

        RegisterPage registerPage = new RegisterPage(driver);

        validEditedUserFirstName = TestDataGenerator.getRandomFirstName();
        validEditedUserLastName = TestDataGenerator.getRandomLastName();
        existingEditedUserEmail = "m1@fakemail.com";
        validUserCurrentPassword = registerPage.getPassword();

        System.out.println("Valid generated edited user account data (pre-existing user email): " + "\n");

        logger.info("Valid generated edited user first name (pre-existing user email): " + validEditedUserFirstName);
        logger.info("Valid generated edited user last name (pre-existing user email): " + validEditedUserLastName);
        logger.info("Pre-existing edited user email: " + existingEditedUserEmail);
        logger.info("Valid current user password (pre-existing user email): " + validUserCurrentPassword);

        System.out.println("\n");

    }

    //invalid edited user account data input methods - invalid singular input format
    public void inputInvalidEditedUserFirstNameFormatIntoFirstNameInputField(){
        accountSettingsFirstNameInputField.clear();
        accountSettingsFirstNameInputField.sendKeys(invalidEditedUserFirstNameFormat);
    }
    public void inputInvalidEditedUserLastNameFormatIntoLastNameInputField(){
        accountSettingsLastNameInputField.clear();
        accountSettingsLastNameInputField.sendKeys(invalidEditedUserLastNameFormat);
    }
    public void inputInvalidEditedUserEmailFormatIntoEmailInputField(){
        accountSettingsEmailInputField.clear();
        accountSettingsEmailInputField.sendKeys(invalidEditedUserEmailFormat);
    }
    public void inputExistingEditedUserEmailIntoEmailInputField(){
        accountSettingsEmailInputField.clear();
        accountSettingsEmailInputField.sendKeys(existingEditedUserEmail);
    }

    //valid edited user account data input methods (for remaining inputs)
    public void inputEditedUserFirstNameIntoFirstNameInputField(){
        accountSettingsFirstNameInputField.clear();
        accountSettingsFirstNameInputField.sendKeys(validEditedUserFirstName);
    }
    public void inputEditedUserLastNameIntoLastNameInputField(){
        accountSettingsLastNameInputField.clear();
        accountSettingsLastNameInputField.sendKeys(validEditedUserLastName);
    }
    public void inputEditedUserEmailIntoEmailInputField(){
        accountSettingsEmailInputField.clear();
        accountSettingsEmailInputField.sendKeys(validEditedUserEmail);
    }
    public void inputCurrentUserPasswordIntoCurrentPasswordInputField(){
        accountSettingsCurrentPasswordInputField.clear();
        accountSettingsCurrentPasswordInputField.sendKeys(validUserCurrentPassword);
    }

}
