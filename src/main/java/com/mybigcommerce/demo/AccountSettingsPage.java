package com.mybigcommerce.demo;

import com.mybigcommerce.demo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

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

    public AccountSettingsPage(WebDriver driver) {super(driver);}


}
