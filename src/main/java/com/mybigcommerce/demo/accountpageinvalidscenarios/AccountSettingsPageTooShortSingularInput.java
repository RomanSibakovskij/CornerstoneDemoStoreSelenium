package com.mybigcommerce.demo.accountpageinvalidscenarios;

import com.mybigcommerce.demo.RegisterPage;
import com.mybigcommerce.demo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class AccountSettingsPageTooShortSingularInput extends BasePage{

    //input form
    @FindBy(xpath = "//input[@id='account_firstname']")
    private WebElement accountSettingsFirstNameInputField;
    @FindBy(xpath = "//input[@id='account_lastname']")
    private WebElement accountSettingsLastNameInputField;
    @FindBy(xpath = "//input[@id='account_companyname']")
    private WebElement accountSettingsCompanyInputField;
    @FindBy(xpath = "//input[@id='account_phone']")
    private WebElement accountSettingsPhoneInputField;
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
    private static String validEditedUserPassword;
    private String validEditedUserConfirmPassword;
    private String validUserCurrentPassword;

    //invalid edited user account data  - too short singular input
    private String tooShortEditedUserFirstName;
    private String tooShortEditedUserLastName;
    private String tooShortEditedUserEmail;

    public AccountSettingsPageTooShortSingularInput(WebDriver driver) {super(driver);}

    //invalid edited user account data getter - too short edited first name (1 char)
    public void invalidEditedUserAccountDataTooShortFirstNameGetter(){

        RegisterPage registerPage = new RegisterPage(driver);

        tooShortEditedUserFirstName = "D";
        validEditedUserLastName = TestDataGenerator.getRandomLastName();
        validEditedUserEmail = TestDataGenerator.generateRandomEmailAddress(8);
        validUserCurrentPassword = registerPage.getPassword();

        System.out.println("Valid generated edited user account data (too short user first name): " + "\n");

        logger.info("Too short edited user first name: " + tooShortEditedUserFirstName);
        logger.info("Valid generated edited user last name (too short user first name): " + validEditedUserLastName);
        logger.info("Valid generated edited user email (too short user first name): " + validEditedUserEmail);
        logger.info("Valid current user password (too short user first name): " + validUserCurrentPassword);

        System.out.println("\n");

    }

    //invalid edited user account data getter - too short edited last name (1 char)
    public void invalidEditedUserAccountDataTooShortLastNameGetter(){

        RegisterPage registerPage = new RegisterPage(driver);

        validEditedUserFirstName = TestDataGenerator.getRandomFirstName();
        tooShortEditedUserLastName = "V";
        validEditedUserEmail = TestDataGenerator.generateRandomEmailAddress(8);
        validUserCurrentPassword = registerPage.getPassword();

        System.out.println("Valid generated edited user account data (too short user last name): " + "\n");

        logger.info("Valid generated edited user first name (too short user last name): " + validEditedUserFirstName);
        logger.info("Too short edited user last name: " + tooShortEditedUserLastName);
        logger.info("Valid generated edited user email (too short user last name): " + validEditedUserEmail);
        logger.info("Valid current user password (too short user last name): " + validUserCurrentPassword);

        System.out.println("\n");

    }

    //invalid edited user account data getter - too short edited email (1 char -> name, domain)
    public void invalidEditedUserAccountDataTooShortEmailGetter(){

        RegisterPage registerPage = new RegisterPage(driver);

        validEditedUserFirstName = TestDataGenerator.getRandomFirstName();
        validEditedUserLastName = TestDataGenerator.getRandomLastName();
        tooShortEditedUserEmail = TestDataGenerator.generateRandomTooShortEmailAddress(1);
        validUserCurrentPassword = registerPage.getPassword();

        System.out.println("Valid generated edited user account data (too short user email): " + "\n");

        logger.info("Valid generated edited user first name (too short user email): " + validEditedUserFirstName);
        logger.info("Valid generated edited user last name (too short user email): " + validEditedUserLastName);
        logger.info("Too short edited user email: " + tooShortEditedUserEmail);
        logger.info("Valid current user password (too short user email): " + validUserCurrentPassword);

        System.out.println("\n");

    }

    //invalid edited user account data input methods - too short singular input
    public void inputTooShortEditedUserFirstNameIntoFirstNameInputField(){
        accountSettingsFirstNameInputField.clear();
        accountSettingsFirstNameInputField.sendKeys(tooShortEditedUserFirstName);
    }
    public void inputTooShortEditedUserLastNameIntoLastNameInputField(){
        accountSettingsLastNameInputField.clear();
        accountSettingsLastNameInputField.sendKeys(tooShortEditedUserLastName);
    }
    public void inputTooShortEditedUserEmailIntoEmailInputField(){
        accountSettingsEmailInputField.clear();
        accountSettingsEmailInputField.sendKeys(tooShortEditedUserEmail);
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
    public void inputEditedUserPasswordIntoPasswordInputField(){
        accountSettingsPasswordInputField.clear();
        accountSettingsPasswordInputField.sendKeys(validEditedUserPassword);
    }
    public void inputEditedUserConfirmPasswordIntoConfirmPasswordInputField(){
        accountSettingsConfirmPasswordInputField.clear();
        accountSettingsConfirmPasswordInputField.sendKeys(validEditedUserConfirmPassword);
    }

}
