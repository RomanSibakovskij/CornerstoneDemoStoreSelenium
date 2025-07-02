package com.mybigcommerce.demo.accountpageinvalidscenarios;

import com.mybigcommerce.demo.RegisterPage;
import com.mybigcommerce.demo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class AccountSettingsPageNoSingularInput extends BasePage{

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

    //invalid edited user account data  - no singular input
    private String noEditedUserFirstName;

    public AccountSettingsPageNoSingularInput(WebDriver driver) {super(driver);}

    //invalid edited user account data getter - no edited first name
    public void invalidEditedUserAccountDataNoFirstNameGetter(){

        noEditedUserFirstName = "";
        validEditedUserLastName = TestDataGenerator.getRandomLastName();
        validEditedUserEmail = TestDataGenerator.generateRandomEmailAddress(8);

        System.out.println("Valid generated edited user account data (no user first name): " + "\n");

        logger.info("No edited user first name: " + noEditedUserFirstName);
        logger.info("Valid generated edited user last name (no user first name): " + validEditedUserLastName);
        logger.info("Valid generated edited user email (no user first name): " + validEditedUserEmail);

        System.out.println("\n");

    }

    //invalid edited user account data input methods - no singular input
    public void inputNoEditedUserFirstNameIntoFirstNameInputField(){
        accountSettingsFirstNameInputField.clear();
        accountSettingsFirstNameInputField.sendKeys(noEditedUserFirstName);
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
