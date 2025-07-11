package com.mybigcommerce.demo.accountpageinvalidscenarios;

import com.mybigcommerce.demo.RegisterPage;
import com.mybigcommerce.demo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class AccountSettingsPageTooLongSingularInput extends BasePage{

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

    //invalid edited user account data  - too long singular input
    private String tooLongEditedUserFirstName;
    private String tooLongEditedUserLastName;
    private String tooLongEditedUserEmail;
    private String tooLongEditedUserPassword;
    private String tooLongEditedUserConfirmPassword;

    public AccountSettingsPageTooLongSingularInput(WebDriver driver) {super(driver);}

    //invalid edited user account data getter - too long edited first name (100 chars)
    public void invalidEditedUserAccountDataTooLongFirstNameGetter(){

        RegisterPage registerPage = new RegisterPage(driver);

        tooLongEditedUserFirstName = "Dhfgdsgdtwetrtjdsfgrfdgjhkjmngbfdsfgfhkjgsedhgtfgsdetgtujyhgdsfgdfhtgfsdfdrhfthdfsegtthtgfddxgdfhgdg";
        validEditedUserLastName = TestDataGenerator.getRandomLastName();
        validEditedUserEmail = TestDataGenerator.generateRandomEmailAddress(8);
        validUserCurrentPassword = registerPage.getPassword();

        System.out.println("Valid generated edited user account data (too long user first name): " + "\n");

        logger.info("Too long edited user first name: " + tooLongEditedUserFirstName);
        logger.info("Valid generated edited user last name (too long user first name): " + validEditedUserLastName);
        logger.info("Valid generated edited user email (too long user first name): " + validEditedUserEmail);
        logger.info("Valid current user password (too long user first name): " + validUserCurrentPassword);

        System.out.println("\n");

    }

    //invalid edited user account data getter - too long edited last name (100 chars)
    public void invalidEditedUserAccountDataTooLongLastNameGetter(){

        RegisterPage registerPage = new RegisterPage(driver);

        validEditedUserFirstName = TestDataGenerator.getRandomFirstName();
        tooLongEditedUserLastName = "Vhfgdsgdtwetrtjdsfgrfdgjhkjmngbfdsfgfhkjgsedhgtfgsdetgtujyhgdsfgdfhtgfsdfdrhfthdfsegtthtgfddxgdfhgdg";
        validEditedUserEmail = TestDataGenerator.generateRandomEmailAddress(8);
        validUserCurrentPassword = registerPage.getPassword();

        System.out.println("Valid generated edited user account data (too long user last name): " + "\n");

        logger.info("Valid generated edited user first name (too long user last name): " + validEditedUserFirstName);
        logger.info("Too long edited user last name: " + tooLongEditedUserLastName);
        logger.info("Valid generated edited user email (too long user last name): " + validEditedUserEmail);
        logger.info("Valid current user password (too long user last name): " + validUserCurrentPassword);

        System.out.println("\n");

    }

    //invalid edited user account data getter - too long edited email (100 chars -> name, domain)
    public void invalidEditedUserAccountDataTooLongEmailGetter(){

        RegisterPage registerPage = new RegisterPage(driver);

        validEditedUserFirstName = TestDataGenerator.getRandomFirstName();
        validEditedUserLastName = TestDataGenerator.getRandomLastName();
        tooLongEditedUserEmail = TestDataGenerator.generateRandomTooLongEmailAddress(93);
        validUserCurrentPassword = registerPage.getPassword();

        System.out.println("Valid generated edited user account data (too long user email): " + "\n");

        logger.info("Valid generated edited user first name (too long user email): " + validEditedUserFirstName);
        logger.info("Valid generated edited user last name (too long user email): " + validEditedUserLastName);
        logger.info("Too long edited user email: " + tooLongEditedUserEmail);
        logger.info("Valid current user password (too long user email): " + validUserCurrentPassword);

        System.out.println("\n");

    }

    //invalid edited user account data getter - too long new password / confirm password (75 chars)
    public void invalidEditedUserAccountDataTooLongPasswordConfirmGetter(){

        RegisterPage registerPage = new RegisterPage(driver);

        validEditedUserFirstName = TestDataGenerator.getRandomFirstName();
        validEditedUserLastName = TestDataGenerator.getRandomLastName();
        validUserCurrentPassword = registerPage.getPassword();
        tooLongEditedUserPassword = "Phfgdsgdtwetrtjdsfgrfdgjhkjmngbfdsf34hkjgsedhgtfgsdetgtujyhgdsfgdfhtgfsdfd4";
        tooLongEditedUserConfirmPassword = tooLongEditedUserPassword;

        System.out.println("Valid generated edited user account data (too long new password / confirm password): " + "\n");

        logger.info("Valid generated edited user first name (too long new password / confirm password): " + validEditedUserFirstName);
        logger.info("Valid generated edited user last name (too long new password / confirm password): " + validEditedUserLastName);
        logger.info("Valid current user password (too long new password / confirm password): " + validUserCurrentPassword);
        logger.info("Too long edited user password: " + tooLongEditedUserPassword);
        logger.info("Too long matching edited user confirm password: " + tooLongEditedUserConfirmPassword);

        System.out.println("\n");

    }

    //invalid edited user account data input methods - too long singular input
    public void inputTooLongEditedUserFirstNameIntoFirstNameInputField(){
        accountSettingsFirstNameInputField.clear();
        accountSettingsFirstNameInputField.sendKeys(tooLongEditedUserFirstName);
    }
    public void inputTooLongEditedUserLastNameIntoLastNameInputField(){
        accountSettingsLastNameInputField.clear();
        accountSettingsLastNameInputField.sendKeys(tooLongEditedUserLastName);
    }
    public void inputTooLongEditedUserEmailIntoEmailInputField(){
        accountSettingsEmailInputField.clear();
        accountSettingsEmailInputField.sendKeys(tooLongEditedUserEmail);
    }
    public void inputTooLongEditedUserPasswordIntoPasswordInputField(){
        accountSettingsPasswordInputField.clear();
        accountSettingsPasswordInputField.sendKeys(tooLongEditedUserPassword);
    }
    public void inputTooLongEditedUserConfirmPasswordIntoConfirmPasswordInputField(){
        accountSettingsConfirmPasswordInputField.clear();
        accountSettingsConfirmPasswordInputField.sendKeys(tooLongEditedUserConfirmPassword);
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
