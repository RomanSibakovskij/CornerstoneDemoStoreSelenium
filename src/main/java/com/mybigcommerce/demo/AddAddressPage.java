package com.mybigcommerce.demo;

import com.mybigcommerce.demo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.*;
import java.util.stream.Collectors;

public class AddAddressPage extends BasePage {

    //add address page web elements
    @FindBy(xpath = "//h2[@class='page-heading']")
    private WebElement addAddressPageTitle;
    //input form
    @FindBy(xpath = "//label[@for='FormField_11_select']")
    private WebElement addAddressPageCountrySubtext;
    @FindBy(xpath = "//select[@id='FormField_11_select']")
    private WebElement addAddressPageCountryDropdownMenu;
    @FindBy(xpath = "//select[@id='FormField_11_select']/option[1]")
    private WebElement addAddressPageSelectCountryOption;
    @FindBy(xpath = "//label[@for='FormField_4_input']")
    private WebElement addAddressPageFirstNameSubtext;
    @FindBy(xpath = "//input[@id='FormField_4_input']")
    private WebElement addAddressPageFirstNameInputField;
    @FindBy(xpath = "//label[@for='FormField_5_input']")
    private WebElement addAddressPageLastNameSubtext;
    @FindBy(xpath = "//input[@id='FormField_5_input']")
    private WebElement addAddressPageLastNameInputField;
    @FindBy(xpath = "//label[@for='FormField_8_input']")
    private WebElement addAddressPageAddress1Subtext;
    @FindBy(xpath = "//input[@id='FormField_8_input']")
    private WebElement addAddressPageAddress1InputField;
    @FindBy(xpath = "//label[@for='FormField_9_input']")
    private WebElement addAddressPageAddress2Subtext;
    @FindBy(xpath = "//input[@id='FormField_9_input']")
    private WebElement addAddressPageAddress2InputField;
    @FindBy(xpath = "//label[@for='FormField_6_input']")
    private WebElement addAddressPageCompanySubtext;
    @FindBy(xpath = "//input[@id='FormField_6_input']")
    private WebElement addAddressPageCompanyInputField;
    @FindBy(xpath = "//label[@for='FormField_10_input']")
    private WebElement addAddressPageCitySubtext;
    @FindBy(xpath = "//input[@id='FormField_10_input']")
    private WebElement addAddressPageCityInputField;
    @FindBy(xpath = "//label[@for='FormField_12_select']")
    private WebElement addAddressPageStateSubtext;
    @FindBy(xpath = "//select[@id='FormField_12_select']")
    private WebElement addAddressPageStateDropdownMenu;
    @FindBy(xpath = "//select[@id='FormField_12_select']/option[1]")
    private WebElement addAddressPageSelectStateOption;
    @FindBy(xpath = "//select[@id='FormField_12_select']/option[@value='Illinois']")
    private WebElement addAddressPageIllinoisStateOption;
    @FindBy(xpath = "//label[@for='FormField_13_input']")
    private WebElement addAddressPagePostCodeSubtext;
    @FindBy(xpath = "//input[@id='FormField_13_input']")
    private WebElement addAddressPagePostCodeInputField;
    @FindBy(xpath = "//label[@for='FormField_7_input']")
    private WebElement addAddressPagePhoneSubtext;
    @FindBy(xpath = "//input[@id='FormField_7_input']")
    private WebElement addAddressPagePhoneInputField;
    @FindBy(xpath = "//div[@class='form-actions']/input")
    private WebElement addAddressPageSaveAddressButton;
    @FindBy(xpath = "//div[@class='form-actions']/a")
    private WebElement addAddressPageCancelButton;
    //required tag elements (list)
    @FindBy(xpath = "//small")
    private List<WebElement> addAddressPageRequiredTagElements;
    //singular input error message elements
    @FindBy(xpath = "//span[@class='form-inlineMessage']")
    private WebElement addAddressPageSingularInputError;

    //valid user address data
    private String validAddressFirstName;
    private String validAddressLastName;
    private String validAddress;
    private String validAddressCity;
    private int validAddressPostCode;
    private String validAddressPhone;

    public AddAddressPage(WebDriver driver) {super(driver);}

    //valid user address data getter
    public void validUserAddressDataGetter(){

        RegisterPage registerPage = new RegisterPage(driver);

        validAddressFirstName = registerPage.getValidRegisterFirstName();
        validAddressLastName = registerPage.getValidRegisterLastName();
        validAddress = TestDataGenerator.generateRandomAddress(9);
        validAddressCity = TestDataGenerator.getRandomCity();
        validAddressPostCode = TestDataGenerator.getRandomPostalCode();
        validAddressPhone = TestDataGenerator.generatePhoneNumber(8);

        System.out.println("Valid user address generated data: " + "\n");

        logger.info("Valid generated user first name: " + validAddressFirstName);
        logger.info("Valid generated user last name: " + validAddressLastName);
        logger.info("Valid generated user address: " + validAddress);
        logger.info("Valid generated user city: " + validAddressCity);
        logger.info("Valid generated user post code: " + validAddressPostCode);
        logger.info("Valid generated user phone: " + validAddressPhone);

        System.out.println("\n");

    }

    //valid user edited address data getter
    public void validUserEditedAddressDataGetter(){

        validAddress = TestDataGenerator.generateRandomAddress(9);
        validAddressCity = TestDataGenerator.getRandomCity();
        validAddressPostCode = TestDataGenerator.getRandomPostalCode();
        validAddressPhone = TestDataGenerator.generatePhoneNumber(8);

        System.out.println("Valid user edited address generated data: " + "\n");

        logger.info("Valid generated edited user address: " + validAddress);
        logger.info("Valid generated edited user city: " + validAddressCity);
        logger.info("Valid generated edited user post code: " + validAddressPostCode);
        logger.info("Valid generated edited user phone: " + validAddressPhone);

        System.out.println("\n");

    }

    //valid user address input methods
    public void inputValidUserFirstNameIntoFirstNameInputField(){addAddressPageFirstNameInputField.sendKeys(validAddressFirstName);}
    public void inputValidUserLastNameIntoLastNameInputField(){addAddressPageLastNameInputField.sendKeys(validAddressLastName);}

    public void inputValidUserAddressIntoAddress1InputField(){
        addAddressPageAddress1InputField.clear();
        addAddressPageAddress1InputField.sendKeys(validAddress);
    }

    public void inputValidUserCityIntoCityInputField(){
        addAddressPageCityInputField.clear();
        addAddressPageCityInputField.sendKeys(validAddressCity);
    }
    public void inputValidUserPostCodeIntoPostCodeInputField(){
        addAddressPagePostCodeInputField.clear();
        addAddressPagePostCodeInputField.sendKeys(String.valueOf(validAddressPostCode));
    }
    public void inputValidUserPhoneIntoPhoneInputField(){
        addAddressPagePhoneInputField.clear();
        addAddressPagePhoneInputField.sendKeys(validAddressPhone);
    }

    //click 'Save address' button
    public void clickSaveAddressButton(){
        Actions action = new Actions(driver);
        action.moveToElement(addAddressPageSaveAddressButton).click().perform();
    }

    //click 'State' dropdown menu method
    public void clickStateDropdownMenu(){
        Actions action = new Actions(driver);
        action.moveToElement(addAddressPageStateDropdownMenu).click().perform();
    }

    //select 'Illinois' option method
    public void selectIllinoisOption(){addAddressPageIllinoisStateOption.click();}

    //select 'Choose a state' option method
    public void selectStateOption(){addAddressPageSelectStateOption.click();}

    //add address page text element getters
    public String getAddAddressPageTitle() {return addAddressPageTitle.getText();}
    public String getAddAddressPageCountrySubtext() {return addAddressPageCountrySubtext.getText().trim().split("\\n")[0];}
    public String getAddAddressPageFirstNameSubtext() {return addAddressPageFirstNameSubtext.getText().trim().split("\\n")[0];}
    public String getAddAddressPageLastNameSubtext() {return addAddressPageLastNameSubtext.getText().trim().split("\\n")[0];}
    public String getAddAddressPageAddress1Subtext() {return addAddressPageAddress1Subtext.getText().trim().split("\\n")[0];}
    public String getAddAddressPageAddress2Subtext() {return addAddressPageAddress2Subtext.getText().trim().split("\\n")[0];}
    public String getAddAddressPageCompanySubtext() {return addAddressPageCompanySubtext.getText();}
    public String getAddAddressPageCitySubtext() {return addAddressPageCitySubtext.getText().trim().split("\\n")[0];}
    public String getAddAddressPageStateSubtext() {return addAddressPageStateSubtext.getText().trim().split("\\n")[0];}
    public String getAddAddressPagePostCodeSubtext() {return addAddressPagePostCodeSubtext.getText().trim().split("\\n")[0];}
    public String getAddAddressPagePhoneSubtext() {return addAddressPagePhoneSubtext.getText().trim().split("\\n")[0];}
    //required tag elements
    public List<String> getAddAddressRequiredTagElements() {return addAddressPageRequiredTagElements.stream().map(WebElement::getText).collect(Collectors.toList());}

    //add address page singular input error message getter
    public String getAddAddressPageSingularInputError() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1000));
        wait.until(ExpectedConditions.visibilityOf(addAddressPageSingularInputError));
        return addAddressPageSingularInputError.getText();
    }

    //add address page web element assert methods
    public boolean isAddAddressPageTitleDisplayed() {return addAddressPageTitle.isDisplayed();}
    public boolean isAddAddressPageCountrySubtextDisplayed() {return addAddressPageCountrySubtext.isDisplayed();}
    public boolean isAddAddressPageCountryDropdownMenuDisplayed() {return addAddressPageCountryDropdownMenu.isDisplayed();}
    public boolean isAddAddressPageFirstNameSubtextDisplayed() {return addAddressPageFirstNameSubtext.isDisplayed();}
    public boolean isAddAddressPageFirstNameInputFieldDisplayed() {return addAddressPageFirstNameInputField.isDisplayed();}
    public boolean isAddAddressPageLastNameSubtextDisplayed() {return addAddressPageLastNameSubtext.isDisplayed();}
    public boolean isAddAddressPageLastNameInputFieldDisplayed() {return addAddressPageLastNameInputField.isDisplayed();}
    public boolean isAddAddressPageAddress1SubtextDisplayed() {return addAddressPageAddress1Subtext.isDisplayed();}
    public boolean isAddAddressPageAddress1InputFieldDisplayed() {return addAddressPageAddress1InputField.isDisplayed();}
    public boolean isAddAddressPageAddress2SubtextDisplayed() {return addAddressPageAddress2Subtext.isDisplayed();}
    public boolean isAddAddressPageAddress2InputFieldDisplayed() {return addAddressPageAddress2InputField.isDisplayed();}
    public boolean isAddAddressPageCompanySubtextDisplayed() {return addAddressPageCompanySubtext.isDisplayed();}
    public boolean isAddAddressPageCompanyInputFieldDisplayed() {return addAddressPageCompanyInputField.isDisplayed();}
    public boolean isAddAddressPageCitySubtextDisplayed() {return addAddressPageCitySubtext.isDisplayed();}
    public boolean isAddAddressPageCityInputFieldDisplayed() {return addAddressPageCityInputField.isDisplayed();}
    public boolean isAddAddressPageStateSubtextDisplayed() {return addAddressPageStateSubtext.isDisplayed();}
    public boolean isAddAddressPageStateDropdownMenuDisplayed() {return addAddressPageStateDropdownMenu.isDisplayed();}
    public boolean isAddAddressPagePostCodeSubtextDisplayed() {return addAddressPagePostCodeSubtext.isDisplayed();}
    public boolean isAddAddressPagePostCodeInputFieldDisplayed() {return addAddressPagePostCodeInputField.isDisplayed();}
    public boolean isAddAddressPagePhoneSubtextDisplayed() {return addAddressPagePhoneSubtext.isDisplayed();}
    public boolean isAddAddressPagePhoneInputFieldDisplayed() {return addAddressPagePhoneInputField.isDisplayed();}
    public boolean isAddAddressPageSaveAddressButtonDisplayed() {return addAddressPageSaveAddressButton.isDisplayed();}
    public boolean isAddAddressPageCancelButtonDisplayed() {return addAddressPageCancelButton.isDisplayed();}

    public boolean isAddAddressPageRequiredTagDisplayed() {
        return addAddressPageRequiredTagElements.stream()
                .allMatch(WebElement::isDisplayed);
    }

}
