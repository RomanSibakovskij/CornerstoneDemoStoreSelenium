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

    public RegisterPageTooLongSingularInput(WebDriver driver) {super(driver);}


}
