package com.mybigcommerce.demo;

import com.mybigcommerce.demo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class AccountSettingsPage extends BasePage {

    //account settings page web elements
    @FindBy(xpath = "//h2[@class='page-heading']")
    private WebElement accountSettingsPageTitle;
    //input form
    @FindBy(xpath = "//label[@for='account_firstname']")
    private WebElement accountSettingsFirstNameSubtext;
    @FindBy(xpath = "//input[@id='account_firstname']")
    private WebElement accountSettingsFirstNameInputField;
    @FindBy(xpath = "//label[@for='account_lastname']")
    private WebElement accountSettingsLastNameSubtext;
    @FindBy(xpath = "//input[@id='account_lastname']")
    private WebElement accountSettingsLastNameInputField;
    @FindBy(xpath = "//label[@for='account_companyname']")
    private WebElement accountSettingsCompanySubtext;
    @FindBy(xpath = "//input[@id='account_companyname']")
    private WebElement accountSettingsCompanyInputField;
    @FindBy(xpath = "//label[@for='account_phone']")
    private WebElement accountSettingsPhoneSubtext;
    @FindBy(xpath = "//input[@id='account_phone']")
    private WebElement accountSettingsPhoneInputField;
    @FindBy(xpath = "//label[@for='FormField_1_input']")
    private WebElement accountSettingsEmailSubtext;
    @FindBy(xpath = "//input[@id='FormField_1_input']")
    private WebElement accountSettingsEmailInputField;
    @FindBy(xpath = "//label[@for='FormField_2_input']")
    private WebElement accountSettingsPasswordSubtext;
    @FindBy(xpath = "//input[@id='FormField_2_input']")
    private WebElement accountSettingsPasswordInputField;
    @FindBy(xpath = "//label[@for='FormField_3_input']")
    private WebElement accountSettingsConfirmPasswordSubtext;
    @FindBy(xpath = "//input[@id='FormField_3_input']")
    private WebElement accountSettingsConfirmPasswordInputField;
    @FindBy(xpath = "//label[@for='FormField_24_input']")
    private WebElement accountSettingsCurrentPasswordSubtext;
    @FindBy(xpath = "//input[@id='FormField_24_input']")
    private WebElement accountSettingsCurrentPasswordInputField;
    @FindBy(xpath = "//button[@class='button button--primary']")
    private WebElement accountSettingsUpdateButton;
    //account update success message element
    @FindBy(xpath = "//p[@class='alertBox-column alertBox-message']")
    private WebElement accountSettingsUpdateSuccessMessage;
    //singular input error message elements
    @FindBy(xpath = "//span[@class='form-inlineMessage']")
    private WebElement accountSettingsPageSingularInputError;
    @FindBy(xpath = "//span[@id='alertBox-message-text']")
    private WebElement accountSettingsPageSingularInputErrorBox;

    //valid edited user account data
    private String validEditedUserFirstName;
    private String validEditedUserLastName;
    private String validEditedUserPhone;
    private static String validEditedUserEmail;
    private static String validEditedUserPassword;
    private String validEditedUserConfirmPassword;
    private String validUserCurrentPassword;

    public AccountSettingsPage(WebDriver driver) {super(driver);}

    //valid edited user account data getter (for login email)
    public void validEditedUserAccountDataForLoginEmailGetter(){

        RegisterPage registerPage = new RegisterPage(driver);

        validEditedUserFirstName = TestDataGenerator.getRandomFirstName();
        validEditedUserLastName = TestDataGenerator.getRandomLastName();
        validEditedUserPhone = TestDataGenerator.generatePhoneNumber(5);
        validEditedUserEmail = TestDataGenerator.generateRandomEmailAddress(8);
        validUserCurrentPassword = registerPage.getPassword();

        System.out.println("Valid generated edited user account data (with edited login email): " + "\n");

        logger.info("Valid generated edited user first name (with edited login email): " + validEditedUserFirstName);
        logger.info("Valid generated edited user last name (with edited login email): " + validEditedUserLastName);
        logger.info("Valid generated edited user phone number (with edited login email): " + validEditedUserPhone);
        logger.info("Valid generated edited user email (with edited login email): " + validEditedUserEmail);
        logger.info("Valid current user password (with edited login email): " + validUserCurrentPassword);

        System.out.println("\n");

    }

    //valid edited user account data getter (for login password)
    public void validEditedUserAccountDataForLoginPasswordGetter(){

        RegisterPage registerPage = new RegisterPage(driver);

        validEditedUserFirstName = TestDataGenerator.getRandomFirstName();
        validEditedUserLastName = TestDataGenerator.getRandomLastName();
        validEditedUserPhone = TestDataGenerator.generatePhoneNumber(5);
        validUserCurrentPassword = registerPage.getPassword();
        validEditedUserPassword = TestDataGenerator.generateRandomPassword();
        validEditedUserConfirmPassword = validEditedUserPassword;

        System.out.println("Valid generated edited user account data (with edited login password): " + "\n");

        logger.info("Valid generated edited user first name (with edited login password): " + validEditedUserFirstName);
        logger.info("Valid generated edited user last name (with edited login password): " + validEditedUserLastName);
        logger.info("Valid generated edited user phone number (with edited login password): " + validEditedUserPhone);
        logger.info("Valid current user password (with edited login password): " + validUserCurrentPassword);
        logger.info("Valid edited user password (with edited login password): " + validEditedUserPassword);
        logger.info("Valid matching edited user confirm password (with edited login password): " + validEditedUserConfirmPassword);

        System.out.println("\n");

    }

    //valid edited user account data input methods
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
    public void inputEditedUserPhoneIntoPhoneInputField(){
        accountSettingsPhoneInputField.clear();
        accountSettingsPhoneInputField.sendKeys(validEditedUserPhone);
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

    //click 'Update details' button method
    public void clickUpdateDetailsButton(){
        Actions action = new Actions(driver);
        action.moveToElement(accountSettingsUpdateButton).click().perform();
    }

    //private data getters
    public String getEditedLoginEmail(){return validEditedUserEmail;}
    public String getEditedLoginPassword(){return validEditedUserPassword;}

    //account setting page singular input error message getters
    public String getAccountSettingsPageSingularInputError() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1000));
        wait.until(ExpectedConditions.visibilityOf(accountSettingsPageSingularInputError));
        return accountSettingsPageSingularInputError.getText();
    }
    public String getAccountSettingsPageSingularInputErrorBoxText() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1000));
        wait.until(ExpectedConditions.visibilityOf(accountSettingsPageSingularInputErrorBox));
        return accountSettingsPageSingularInputErrorBox.getText();
    }

    //account settings page text element getters
    public String getAccountSettingsPageTitle() {return accountSettingsPageTitle.getText();}
    public String getAccountSettingsPageFirstNameSubtext() {return accountSettingsFirstNameSubtext.getText().trim().split("\\n")[0];}
    public String getAccountSettingsPageLastNameSubtext() {return accountSettingsLastNameSubtext.getText().trim().split("\\n")[0];}
    public String getAccountSettingsPageCompanySubtext() {return accountSettingsCompanySubtext.getText();}
    public String getAccountSettingsPagePhoneSubtext() {return accountSettingsPhoneSubtext.getText().trim().split("\\n")[0];}
    public String getAccountSettingsPageEmailSubtext() {return accountSettingsEmailSubtext.getText().trim().split("\\n")[0];}
    public String getAccountSettingsPagePasswordSubtext() {return accountSettingsPasswordSubtext.getText();}
    public String getAccountSettingsPageConfirmPasswordSubtext() {return accountSettingsConfirmPasswordSubtext.getText();}
    public String getAccountSettingsPageCurrentPasswordSubtext() {return accountSettingsCurrentPasswordSubtext.getText();}

    //account settings update success message getter
    public String getAccountSettingsUpdateSuccessMessage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1850));
        wait.until(ExpectedConditions.visibilityOf(accountSettingsUpdateSuccessMessage));
        return accountSettingsUpdateSuccessMessage.getText();
    }

    //account settings page web element assert methods
    public boolean isAccountSettingsPageTitleDisplayed() {return accountSettingsPageTitle.isDisplayed();}
    public boolean isAccountSettingsPageFirstNameSubtextDisplayed() {return accountSettingsFirstNameSubtext.isDisplayed();}
    public boolean isAccountSettingsPageFirstNameInputFieldDisplayed() {return accountSettingsFirstNameInputField.isDisplayed();}
    public boolean isAccountSettingsPageLastNameSubtextDisplayed() {return accountSettingsLastNameSubtext.isDisplayed();}
    public boolean isAccountSettingsPageLastNameInputFieldDisplayed() {return accountSettingsLastNameInputField.isDisplayed();}
    public boolean isAccountSettingsPageCompanySubtextDisplayed() {return accountSettingsCompanySubtext.isDisplayed();}
    public boolean isAccountSettingsPageCompanyInputFieldDisplayed() {return accountSettingsCompanyInputField.isDisplayed();}
    public boolean isAccountSettingsPagePhoneSubtextDisplayed() {return accountSettingsPhoneSubtext.isDisplayed();}
    public boolean isAccountSettingsPagePhoneInputFieldDisplayed() {return accountSettingsPhoneInputField.isDisplayed();}
    public boolean isAccountSettingsPageEmailSubtextDisplayed() {return accountSettingsEmailSubtext.isDisplayed();}
    public boolean isAccountSettingsPageEmailInputFieldDisplayed() {return accountSettingsEmailInputField.isDisplayed();}
    public boolean isAccountSettingsPagePasswordSubtextDisplayed() {return accountSettingsPasswordSubtext.isDisplayed();}
    public boolean isAccountSettingsPagePasswordInputFieldDisplayed() {return accountSettingsPasswordInputField.isDisplayed();}
    public boolean isAccountSettingsPageConfirmPasswordSubtextDisplayed() {return accountSettingsConfirmPasswordSubtext.isDisplayed();}
    public boolean isAccountSettingsPageConfirmPasswordInputFieldDisplayed() {return accountSettingsConfirmPasswordInputField.isDisplayed();}
    public boolean isAccountSettingsPageCurrentPasswordSubtextDisplayed() {return accountSettingsCurrentPasswordSubtext.isDisplayed();}
    public boolean isAccountSettingsPageCurrentPasswordInputFieldDisplayed() {return accountSettingsCurrentPasswordInputField.isDisplayed();}
    public boolean isAccountSettingsPageUpdateAccountButtonDisplayed() {return accountSettingsUpdateButton.isDisplayed();}

}
