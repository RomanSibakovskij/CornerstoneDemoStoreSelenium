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
    private static String validEditedUserPassword;
    private String validEditedUserConfirmPassword;
    private String validUserCurrentPassword;

    //invalid edited user account data  - invalid singular input format
    private String invalidEditedUserFirstNameFormat;

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

    //invalid edited user account data input methods - invalid singular input format
    public void inputInvalidEditedUserFirstNameFormatIntoFirstNameInputField(){
        accountSettingsFirstNameInputField.clear();
        accountSettingsFirstNameInputField.sendKeys(invalidEditedUserFirstNameFormat);
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
