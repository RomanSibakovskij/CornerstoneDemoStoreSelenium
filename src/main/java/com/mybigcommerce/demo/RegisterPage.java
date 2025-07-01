package com.mybigcommerce.demo;

import com.mybigcommerce.demo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;
import java.util.*;
import java.util.stream.Collectors;

public class RegisterPage extends BasePage{

    //register page web elements
    @FindBy(xpath = "//h1")
    private WebElement registerPageTitle;
    //input form
    @FindBy(xpath = "//label[@for='FormField_1_input']")
    private WebElement registerPageEmailSubtext;
    @FindBy(xpath = "//input[@id='FormField_1_input']")
    private WebElement registerPageEmailInputField;
    @FindBy(xpath = "//label[@for='FormField_2_input']")
    private WebElement registerPagePasswordSubtext;
    @FindBy(xpath = "//input[@id='FormField_2_input']")
    private WebElement registerPagePasswordInputField;
    @FindBy(xpath = "//label[@for='FormField_3_input']")
    private WebElement registerPageConfirmPasswordSubtext;
    @FindBy(xpath = "//input[@id='FormField_3_input']")
    private WebElement registerPageConfirmPasswordInputField;
    @FindBy(xpath = "//label[@for='FormField_11_select']")
    private WebElement registerPageCountrySubtext;
    @FindBy(xpath = "//select[@id='FormField_11_select']")
    private WebElement registerPageCountryDropdownMenu;
    @FindBy(xpath = "//select[@id='FormField_11_select']/option[1]")
    private WebElement registerPageSelectCountryOption;
    @FindBy(xpath = "//label[@for='FormField_4_input']")
    private WebElement registerPageFirstNameSubtext;
    @FindBy(xpath = "//input[@id='FormField_4_input']")
    private WebElement registerPageFirstNameInputField;
    @FindBy(xpath = "//label[@for='FormField_5_input']")
    private WebElement registerPageLastNameSubtext;
    @FindBy(xpath = "//input[@id='FormField_5_input']")
    private WebElement registerPageLastNameInputField;
    @FindBy(xpath = "//label[@for='FormField_8_input']")
    private WebElement registerPageAddress1Subtext;
    @FindBy(xpath = "//input[@id='FormField_8_input']")
    private WebElement registerPageAddress1InputField;
    @FindBy(xpath = "//label[@for='FormField_9_input']")
    private WebElement registerPageAddress2Subtext;
    @FindBy(xpath = "//input[@id='FormField_9_input']")
    private WebElement registerPageAddress2InputField;
    @FindBy(xpath = "//label[@for='FormField_6_input']")
    private WebElement registerPageCompanySubtext;
    @FindBy(xpath = "//input[@id='FormField_6_input']")
    private WebElement registerPageCompanyInputField;
    @FindBy(xpath = "//label[@for='FormField_10_input']")
    private WebElement registerPageCitySubtext;
    @FindBy(xpath = "//input[@id='FormField_10_input']")
    private WebElement registerPageCityInputField;
    @FindBy(xpath = "//label[@for='FormField_12_select']")
    private WebElement registerPageStateSubtext;
    @FindBy(xpath = "//select[@id='FormField_12_select']")
    private WebElement registerPageStateDropdownMenu;
    @FindBy(xpath = "//select[@id='FormField_12_select']/option[@value='Illinois']")
    private WebElement registerPageIllinoisStateOption;
    @FindBy(xpath = "//label[@for='FormField_13_input']")
    private WebElement registerPagePostCodeSubtext;
    @FindBy(xpath = "//input[@id='FormField_13_input']")
    private WebElement registerPagePostCodeInputField;
    @FindBy(xpath = "//label[@for='FormField_7_input']")
    private WebElement registerPagePhoneSubtext;
    @FindBy(xpath = "//input[@id='FormField_7_input']")
    private WebElement registerPagePhoneInputField;
    @FindBy(xpath = "//input[@class='button button--primary']")
    private WebElement registerPageCreateAccountButton;
    //list elements
    @FindBy(xpath = "//small")
    private List<WebElement> registerPageRequiredTagElements;
    //account creation success message elements
    @FindBy(xpath = "//section[@class='page-content page-content--textCenter']/h1")
    private WebElement accountCreationSuccessMessageTitle;
    @FindBy(xpath = "//section[@class='page-content page-content--textCenter']/p")
    private WebElement accountCreationSuccessMessage;
    //singular input error message elements
    @FindBy(xpath = "//span[@class='form-inlineMessage']")
    private WebElement registerPageSingularInputError;
    @FindBy(xpath = "//span[@id='alertBox-message-text']")
    private WebElement registerPageSingularInputErrorBox;

    //valid user register data
    private static String validRegisterEmail;
    private static String validRegisterPassword;
    private String validRegisterConfirmPassword;
    private static String validRegisterFirstName;
    private static String validRegisterLastName;
    private static String validRegisterAddress;
    private String validRegisterCity;
    private int validRegisterPostCode;
    private String validRegisterPhone;

    public RegisterPage(WebDriver driver) {super(driver);}

    //valid user register data getter
    public void validUserRegisterDataGetter(){

        validRegisterEmail = TestDataGenerator.generateRandomEmailAddress(8);
        validRegisterPassword = TestDataGenerator.generateRandomPassword();
        validRegisterConfirmPassword = validRegisterPassword;
        validRegisterFirstName = TestDataGenerator.getRandomFirstName();
        validRegisterLastName = TestDataGenerator.getRandomLastName();
        validRegisterAddress = TestDataGenerator.generateRandomAddress(6);
        validRegisterCity = TestDataGenerator.getRandomCity();
        validRegisterPostCode = TestDataGenerator.getRandomPostalCode();
        validRegisterPhone = TestDataGenerator.generatePhoneNumber(9);

        System.out.println("Valid user register generated data: " + "\n");

        logger.info("Valid generated user email address: " + validRegisterEmail);
        logger.info("Valid generated user password: " + validRegisterPassword);
        logger.info("Valid matching user confirm password: " + validRegisterConfirmPassword);
        logger.info("Valid generated user first name: " + validRegisterFirstName);
        logger.info("Valid generated user last name: " + validRegisterLastName);
        logger.info("Valid generated user address: " + validRegisterAddress);
        logger.info("Valid generated user city: " + validRegisterCity);
        logger.info("Valid generated user post code: " + validRegisterPostCode);
        logger.info("Valid generated user phone number: " + validRegisterPhone);

        System.out.println("\n");
    }

    //valid register data input methods
    public void inputValidRegisterEmailIntoEmailInputField(){registerPageEmailInputField.sendKeys(validRegisterEmail);}
    public void inputValidRegisterPasswordIntoPasswordInputField(){registerPagePasswordInputField.sendKeys(validRegisterPassword);}
    public void inputValidRegisterConfirmPasswordIntoConfirmPasswordInputField(){registerPageConfirmPasswordInputField.sendKeys(validRegisterConfirmPassword);}
    public void inputValidRegisterFirstNameIntoFirstNameInputField(){registerPageFirstNameInputField.sendKeys(validRegisterFirstName);}
    public void inputValidRegisterLastNameIntoLastNameInputField(){registerPageLastNameInputField.sendKeys(validRegisterLastName);}
    public void inputValidRegisterAddressIntoAddressInputField(){registerPageAddress1InputField.sendKeys(validRegisterAddress);}
    public void inputValidRegisterCityIntoCityInputField(){registerPageCityInputField.sendKeys(validRegisterCity);}
    public void inputValidRegisterPostCodeIntoPostCodeInputField(){registerPagePostCodeInputField.sendKeys(String.valueOf(validRegisterPostCode));}
    public void inputValidRegisterPhoneIntoPhoneNumberInputField(){registerPagePhoneInputField.sendKeys(validRegisterPhone);}

    //click 'Country' dropdown menu method
    public void clickCountryDropdownMenu(){
        Actions action = new Actions(driver);
        action.moveToElement(registerPageCountryDropdownMenu).click().perform();
    }

    //select 'Select country' option method
    public void selectCountryOption(){registerPageSelectCountryOption.click();}

    //click 'State' dropdown menu method
    public void clickStateDropdownMenu(){
        Actions action = new Actions(driver);
        action.moveToElement(registerPageStateDropdownMenu).click().perform();
    }

    //select 'Illinois' option method
    public void selectIllinoisOption(){registerPageIllinoisStateOption.click();}

    //click 'Create account' button method
    public void clickCreateAccountButton(){
        Actions action = new Actions(driver);
        action.moveToElement(registerPageCreateAccountButton).click().perform();
    }

    //private variable getters
    public String getValidRegisterFirstName(){return validRegisterFirstName;}
    public String getValidRegisterLastName(){return validRegisterLastName;}
    public String getValidRegisterAddress(){return validRegisterAddress;}
    public String getPassword(){return validRegisterPassword;}
    public String getEmail(){return validRegisterEmail;}

    //register page text element getters
    public String getRegisterPageTitle() {return registerPageTitle.getText();}
    public String getRegisterPageEmailSubtext() {return registerPageEmailSubtext.getText().trim().split("\\n")[0];}
    public String getRegisterPagePasswordSubtext() {return registerPagePasswordSubtext.getText().trim().split("\\n")[0];}
    public String getRegisterPageConfirmPasswordSubtext() {return registerPageConfirmPasswordSubtext.getText().trim().split("\\n")[0];}
    public String getRegisterPageCountrySubtext() {return registerPageCountrySubtext.getText().trim().split("\\n")[0];}
    public String getRegisterPageFirstNameSubtext() {return registerPageFirstNameSubtext.getText().trim().split("\\n")[0];}
    public String getRegisterPageLastNameSubtext() {return registerPageLastNameSubtext.getText().trim().split("\\n")[0];}
    public String getRegisterPageAddress1Subtext() {return registerPageAddress1Subtext.getText().trim().split("\\n")[0];}
    public String getRegisterPageAddress2Subtext() {return registerPageAddress2Subtext.getText();}
    public String getRegisterPageCompanySubtext() {return registerPageCompanySubtext.getText();}
    public String getRegisterPageCitySubtext() {return registerPageCitySubtext.getText().trim().split("\\n")[0];}
    public String getRegisterPageStateSubtext() {return registerPageStateSubtext.getText().trim().split("\\n")[0];}
    public String getRegisterPagePostCodeSubtext() {return registerPagePostCodeSubtext.getText().trim().split("\\n")[0];}
    public String getRegisterPagePhoneSubtext() {return registerPagePhoneSubtext.getText().trim().split("\\n")[0];}
    //required tag elements
    public List<String> getRegisterPageRequiredTagElements() {return registerPageRequiredTagElements.stream().map(WebElement::getText).collect(Collectors.toList());}

    //account creation success message element getters
    public String getAccountCreationSuccessMessageTitle() {return accountCreationSuccessMessageTitle.getText();}
    public String getAccountCreationSuccessMessage() {return accountCreationSuccessMessage.getText();}

    //register page web element assert methods
    public boolean isRegisterPageTitleDisplayed(){return registerPageTitle.isDisplayed();}
    //input form
    public boolean isRegisterPageEmailSubtextDisplayed(){return registerPageEmailSubtext.isDisplayed();}
    public boolean isRegisterPageEmailInputFieldDisplayed(){return registerPageEmailInputField.isDisplayed();}
    public boolean isRegisterPagePasswordSubtextDisplayed(){return registerPagePasswordSubtext.isDisplayed();}
    public boolean isRegisterPagePasswordInputFieldDisplayed(){return registerPagePasswordInputField.isDisplayed();}
    public boolean isRegisterPageConfirmPasswordSubtextDisplayed(){return registerPageConfirmPasswordSubtext.isDisplayed();}
    public boolean isRegisterPageConfirmPasswordInputFieldDisplayed(){return registerPageConfirmPasswordInputField.isDisplayed();}
    public boolean isRegisterPageCountrySubtextDisplayed(){return registerPageCountrySubtext.isDisplayed();}
    public boolean isRegisterPageCountryDropdownMenuDisplayed(){return registerPageCountryDropdownMenu.isDisplayed();}
    public boolean isRegisterPageFirstNameSubtextDisplayed(){return registerPageFirstNameSubtext.isDisplayed();}
    public boolean isRegisterPageFirstNameInputFieldDisplayed(){return registerPageFirstNameInputField.isDisplayed();}
    public boolean isRegisterPageLastNameSubtextDisplayed(){return registerPageLastNameSubtext.isDisplayed();}
    public boolean isRegisterPageLastNameInputFieldDisplayed(){return registerPageLastNameInputField.isDisplayed();}
    public boolean isRegisterPageAddress1SubtextDisplayed(){return registerPageAddress1Subtext.isDisplayed();}
    public boolean isRegisterPageAddress1InputFieldDisplayed(){return registerPageAddress1InputField.isDisplayed();}
    public boolean isRegisterPageAddress2SubtextDisplayed(){return registerPageAddress2Subtext.isDisplayed();}
    public boolean isRegisterPageAddress2InputFieldDisplayed(){return registerPageAddress2InputField.isDisplayed();}
    public boolean isRegisterPageCompanySubtextDisplayed(){return registerPageCompanySubtext.isDisplayed();}
    public boolean isRegisterPageCompanyInputFieldDisplayed(){return registerPageCompanyInputField.isDisplayed();}
    public boolean isRegisterPageCitySubtextDisplayed(){return registerPageCitySubtext.isDisplayed();}
    public boolean isRegisterPageCityInputFieldDisplayed(){return registerPageCityInputField.isDisplayed();}
    public boolean isRegisterPageStateSubtextDisplayed(){return registerPageStateSubtext.isDisplayed();}
    public boolean isRegisterPageStateDropdownMenuDisplayed(){return registerPageStateDropdownMenu.isDisplayed();}
    public boolean isRegisterPagePostCodeSubtextDisplayed(){return registerPagePostCodeSubtext.isDisplayed();}
    public boolean isRegisterPagePostCodeInputFieldDisplayed(){return registerPagePostCodeInputField.isDisplayed();}
    public boolean isRegisterPagePhoneSubtextDisplayed(){return registerPagePhoneSubtext.isDisplayed();}
    public boolean isRegisterPagePhoneInputFieldDisplayed(){return registerPagePhoneInputField.isDisplayed();}
    public boolean isRegisterPageCreateAccountButtonDisplayed(){return registerPageCreateAccountButton.isDisplayed();}

    public boolean isRegisterPageRequiredTagDisplayed() {
        return registerPageRequiredTagElements.stream()
                .allMatch(WebElement::isDisplayed);
    }

}
