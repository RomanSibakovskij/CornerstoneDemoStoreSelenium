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

    public AccountSettingsPageNoSingularInput(WebDriver driver) {super(driver);}


}
