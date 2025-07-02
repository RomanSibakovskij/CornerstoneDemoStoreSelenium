package com.mybigcommerce.demo.addaddresspageinvalidscenarios;

import com.mybigcommerce.demo.RegisterPage;
import com.mybigcommerce.demo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class AddAddressPageNoSingularInput extends BasePage{

    //input form
    @FindBy(xpath = "//input[@id='FormField_4_input']")
    private WebElement addAddressPageFirstNameInputField;
    @FindBy(xpath = "//input[@id='FormField_5_input']")
    private WebElement addAddressPageLastNameInputField;
    @FindBy(xpath = "//input[@id='FormField_8_input']")
    private WebElement addAddressPageAddress1InputField;
    @FindBy(xpath = "//input[@id='FormField_10_input']")
    private WebElement addAddressPageCityInputField;
    @FindBy(xpath = "//input[@id='FormField_13_input']")
    private WebElement addAddressPagePostCodeInputField;
    @FindBy(xpath = "//input[@id='FormField_7_input']")
    private WebElement addAddressPagePhoneInputField;

    public AddAddressPageNoSingularInput(WebDriver driver) {super(driver);}


}
