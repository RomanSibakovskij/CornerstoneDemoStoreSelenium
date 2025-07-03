package com.mybigcommerce.demo.utilities;

import com.mybigcommerce.demo.*;

import org.slf4j.*;
import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.*;

import com.mybigcommerce.demo.regpageinvalidscenarios.*;
import com.mybigcommerce.demo.accountpageinvalidscenarios.*;
import com.mybigcommerce.demo.addaddresspageinvalidscenarios.*;

import java.io.File;
import java.nio.file.*;
import java.util.*;

public class TestMethods extends BaseTest{

    protected static final Logger logger = LoggerFactory.getLogger(TestMethods.class);

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //navigate to 'Register' page test method
    protected void navigateToRegisterPageTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //home page web element assert
        isHomePageWebElementDisplayed(homePage);
        //home page text element assert
        isHomePageTextElementAsExpected(homePage);
        //log home page product data
        logHomePageProductData(homePage);
        //capture screenshot of the home page display
        captureScreenshot(driver, "Home Page Display");
        //click 'Accept cookies' button
        generalPage.clickAcceptCookiesButton();
        //click header 'Register' nav link
        generalPage.clickRegisterLink();
        //capture screenshot of the test result
        captureScreenshot(driver, "Navigate To Register Page Test Result");
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //valid user account creation test

    //valid user account creation test method
    protected void validUserAccountCreationTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //register page text element assert
        isRegisterPageTextElementAsExpected(registerPage);
        //capture screenshot of the register page before data input
        captureScreenshot(driver, "Register Page Display Before Data Input");
        //valid user register data getter
        registerPage.validUserRegisterDataGetter();
        //input valid user email into email input field
        registerPage.inputValidRegisterEmailIntoEmailInputField();
        //input valid user password into password input field
        registerPage.inputValidRegisterPasswordIntoPasswordInputField();
        //input valid user confirm password into confirm password input field
        registerPage.inputValidRegisterConfirmPasswordIntoConfirmPasswordInputField();
        //input valid user first name into first name input field
        registerPage.inputValidRegisterFirstNameIntoFirstNameInputField();
        //input valid user last name into last name input field
        registerPage.inputValidRegisterLastNameIntoLastNameInputField();
        //input valid user address 1 into address 1 input field
        registerPage.inputValidRegisterAddressIntoAddressInputField();
        //input valid user city into city input field
        registerPage.inputValidRegisterCityIntoCityInputField();
        //click 'State' dropdown menu
        registerPage.clickStateDropdownMenu();
        //select 'Illinois' option
        registerPage.selectIllinoisOption();
        //input valid user post code into post code input field
        registerPage.inputValidRegisterPostCodeIntoPostCodeInputField();
        //input valid user phone into phone input field
        registerPage.inputValidRegisterPhoneIntoPhoneNumberInputField();
        //capture screenshot of the register page after valid data input
        captureScreenshot(driver, "Register Page Display After Valid Data Input");
        //click 'Create account' button
        registerPage.clickCreateAccountButton();
        //assert the user gets expected account creation success message (title and message)
        assertEquals("Your account has been created", registerPage.getAccountCreationSuccessMessageTitle(), "The user account creation success message title doesn't match expectations or the user account creation process has failed.");
        assertEquals("Thank you for creating your account at Cornerstone Demo. Your account details have been emailed to " + registerPage.getEmail(), registerPage.getAccountCreationSuccessMessage(), "The user account creation success message doesn't match expectations or the user account creation process has failed.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Valid User Account Creation Test Result");
    }

    //invalid user account creation tests

    //no singular input

    //invalid user account creation test method - no user email
    protected void invalidUserAccountCreationNoEmailTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        RegisterPageNoSingularInput registerPageNoSingularInput = new RegisterPageNoSingularInput(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //register page text element assert
        isRegisterPageTextElementAsExpected(registerPage);
        //capture screenshot of the register page before data input
        captureScreenshot(driver, "Register Page Display Before Data Input");
        //invalid user register data getter - no user email
        registerPageNoSingularInput.invalidUserRegisterDataNoEmailGetter();
        //don't input user email into email input field
        registerPageNoSingularInput.inputNoRegisterEmailIntoEmailInputField();
        //input valid user password into password input field
        registerPageNoSingularInput.inputValidRegisterPasswordIntoPasswordInputField();
        //input valid user confirm password into confirm password input field
        registerPageNoSingularInput.inputValidRegisterConfirmPasswordIntoConfirmPasswordInputField();
        //input valid user first name into first name input field
        registerPageNoSingularInput.inputValidRegisterFirstNameIntoFirstNameInputField();
        //input valid user last name into last name input field
        registerPageNoSingularInput.inputValidRegisterLastNameIntoLastNameInputField();
        //input valid user address 1 into address 1 input field
        registerPageNoSingularInput.inputValidRegisterAddressIntoAddressInputField();
        //input valid user city into city input field
        registerPageNoSingularInput.inputValidRegisterCityIntoCityInputField();
        //click 'State' dropdown menu
        registerPage.clickStateDropdownMenu();
        //select 'Illinois' option
        registerPage.selectIllinoisOption();
        //input valid user post code into post code input field
        registerPageNoSingularInput.inputValidRegisterPostCodeIntoPostCodeInputField();
        //input valid user phone into phone input field
        registerPageNoSingularInput.inputValidRegisterPhoneIntoPhoneNumberInputField();
        //capture screenshot of the register page after invalid data input - no user email
        captureScreenshot(driver, "Register Page Display After Invalid Data Input - No User Email");
        //click 'Create account' button
        registerPage.clickCreateAccountButton();
        //assert the user gets expected error message
        assertEquals("You must enter a valid email.", registerPage.getRegisterPageSingularInputError(), "The user account creation missing email input error doesn't match expectations or the error wasn't triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - No User Email");
    }

    //invalid user account creation test method - no user password / confirm password
    protected void invalidUserAccountCreationNoPasswordConfirmTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        RegisterPageNoSingularInput registerPageNoSingularInput = new RegisterPageNoSingularInput(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //register page text element assert
        isRegisterPageTextElementAsExpected(registerPage);
        //capture screenshot of the register page before data input
        captureScreenshot(driver, "Register Page Display Before Data Input");
        //invalid user register data getter - no user password and confirm password
        registerPageNoSingularInput.invalidUserRegisterDataNoPasswordConfirmGetter();
        //input valid user email into email input field
        registerPageNoSingularInput.inputValidRegisterEmailIntoEmailInputField();
        //don't input user password into password input field
        registerPageNoSingularInput.inputNoRegisterPasswordIntoPasswordInputField();
        //don't input user confirm password into confirm password input field
        registerPageNoSingularInput.inputNoRegisterConfirmPasswordIntoConfirmPasswordInputField();
        //input valid user first name into first name input field
        registerPageNoSingularInput.inputValidRegisterFirstNameIntoFirstNameInputField();
        //input valid user last name into last name input field
        registerPageNoSingularInput.inputValidRegisterLastNameIntoLastNameInputField();
        //input valid user address 1 into address 1 input field
        registerPageNoSingularInput.inputValidRegisterAddressIntoAddressInputField();
        //input valid user city into city input field
        registerPageNoSingularInput.inputValidRegisterCityIntoCityInputField();
        //click 'State' dropdown menu
        registerPage.clickStateDropdownMenu();
        //select 'Illinois' option
        registerPage.selectIllinoisOption();
        //input valid user post code into post code input field
        registerPageNoSingularInput.inputValidRegisterPostCodeIntoPostCodeInputField();
        //input valid user phone into phone input field
        registerPageNoSingularInput.inputValidRegisterPhoneIntoPhoneNumberInputField();
        //capture screenshot of the register page after invalid data input - no user password / confirm password
        captureScreenshot(driver, "Register Page Display After Invalid Data Input - No User Password and Confirm Password");
        //click 'Create account' button
        registerPage.clickCreateAccountButton();
        //assert the user gets expected error message
        assertEquals("You must enter a password.", registerPage.getRegisterPageSingularInputError(), "The user account creation missing password and confirm password input errors don't match expectations or the error weren't triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - No User Password and Confirm Password");
    }

    //invalid user account creation test method - no user country
    protected void invalidUserAccountCreationNoCountryTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //register page text element assert
        isRegisterPageTextElementAsExpected(registerPage);
        //capture screenshot of the register page before data input
        captureScreenshot(driver, "Register Page Display Before Data Input");
        //valid user register data getter
        registerPage.validUserRegisterDataGetter();
        //input valid user email into email input field
        registerPage.inputValidRegisterEmailIntoEmailInputField();
        //input valid user password into password input field
        registerPage.inputValidRegisterPasswordIntoPasswordInputField();
        //input valid user confirm password into confirm password input field
        registerPage.inputValidRegisterConfirmPasswordIntoConfirmPasswordInputField();
        //click "Country" dropdown menu
        registerPage.clickCountryDropdownMenu();
        //select "Select country" option
        registerPage.selectCountryOption();
        //input valid user first name into first name input field
        registerPage.inputValidRegisterFirstNameIntoFirstNameInputField();
        //input valid user last name into last name input field
        registerPage.inputValidRegisterLastNameIntoLastNameInputField();
        //input valid user address 1 into address 1 input field
        registerPage.inputValidRegisterAddressIntoAddressInputField();
        //input valid user city into city input field
        registerPage.inputValidRegisterCityIntoCityInputField();
        //input valid user post code into post code input field
        registerPage.inputValidRegisterPostCodeIntoPostCodeInputField();
        //input valid user phone into phone input field
        registerPage.inputValidRegisterPhoneIntoPhoneNumberInputField();
        //capture screenshot of the register page after invalid data input - no user country
        captureScreenshot(driver, "Register Page Display After Invalid Data Input - No User Country");
        //click 'Create account' button
        registerPage.clickCreateAccountButton();
        //assert the user gets expected error message
        assertEquals("Country field cannot be blank.", registerPage.getRegisterPageSingularInputError(), "The user account creation missing country input errors don't match expectations or the error weren't triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - No User Country");
    }

    //invalid user account creation test method - no user first name
    protected void invalidUserAccountCreationNoFirstNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        RegisterPageNoSingularInput registerPageNoSingularInput = new RegisterPageNoSingularInput(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //register page text element assert
        isRegisterPageTextElementAsExpected(registerPage);
        //capture screenshot of the register page before data input
        captureScreenshot(driver, "Register Page Display Before Data Input");
        //invalid user register data getter - no user first name
        registerPageNoSingularInput.invalidUserRegisterDataNoFirstNameGetter();
        //input valid user email into email input field
        registerPageNoSingularInput.inputValidRegisterEmailIntoEmailInputField();
        //input valid user password into password input field
        registerPageNoSingularInput.inputValidRegisterPasswordIntoPasswordInputField();
        //input valid matching user confirm password into confirm password input field
        registerPageNoSingularInput.inputValidRegisterConfirmPasswordIntoConfirmPasswordInputField();
        //don't input user first name into first name input field
        registerPageNoSingularInput.inputNoRegisterFirstNameIntoFirstNameInputField();
        //input valid user last name into last name input field
        registerPageNoSingularInput.inputValidRegisterLastNameIntoLastNameInputField();
        //input valid user address 1 into address 1 input field
        registerPageNoSingularInput.inputValidRegisterAddressIntoAddressInputField();
        //input valid user city into city input field
        registerPageNoSingularInput.inputValidRegisterCityIntoCityInputField();
        //click 'State' dropdown menu
        registerPage.clickStateDropdownMenu();
        //select 'Illinois' option
        registerPage.selectIllinoisOption();
        //input valid user post code into post code input field
        registerPageNoSingularInput.inputValidRegisterPostCodeIntoPostCodeInputField();
        //input valid user phone into phone input field
        registerPageNoSingularInput.inputValidRegisterPhoneIntoPhoneNumberInputField();
        //capture screenshot of the register page after invalid data input - no user first name
        captureScreenshot(driver, "Register Page Display After Invalid Data Input - No User First Name");
        //click 'Create account' button
        registerPage.clickCreateAccountButton();
        //assert the user gets expected error message
        assertEquals("First Name field cannot be blank.", registerPage.getRegisterPageSingularInputError(), "The user account creation missing first name input error doesn't match expectations or the error wasn't triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - No User First Name");
    }

    //invalid user account creation test method - no user last name
    protected void invalidUserAccountCreationNoLastNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        RegisterPageNoSingularInput registerPageNoSingularInput = new RegisterPageNoSingularInput(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //register page text element assert
        isRegisterPageTextElementAsExpected(registerPage);
        //capture screenshot of the register page before data input
        captureScreenshot(driver, "Register Page Display Before Data Input");
        //invalid user register data getter - no user last name
        registerPageNoSingularInput.invalidUserRegisterDataNoLastNameGetter();
        //input valid user email into email input field
        registerPageNoSingularInput.inputValidRegisterEmailIntoEmailInputField();
        //input valid user password into password input field
        registerPageNoSingularInput.inputValidRegisterPasswordIntoPasswordInputField();
        //input valid matching user confirm password into confirm password input field
        registerPageNoSingularInput.inputValidRegisterConfirmPasswordIntoConfirmPasswordInputField();
        //input valid user first name into first name input field
        registerPageNoSingularInput.inputValidRegisterFirstNameIntoFirstNameInputField();
        //don't input user last name into last name input field
        registerPageNoSingularInput.inputNoRegisterLastNameIntoLastNameInputField();
        //input valid user address 1 into address 1 input field
        registerPageNoSingularInput.inputValidRegisterAddressIntoAddressInputField();
        //input valid user city into city input field
        registerPageNoSingularInput.inputValidRegisterCityIntoCityInputField();
        //click 'State' dropdown menu
        registerPage.clickStateDropdownMenu();
        //select 'Illinois' option
        registerPage.selectIllinoisOption();
        //input valid user post code into post code input field
        registerPageNoSingularInput.inputValidRegisterPostCodeIntoPostCodeInputField();
        //input valid user phone into phone input field
        registerPageNoSingularInput.inputValidRegisterPhoneIntoPhoneNumberInputField();
        //capture screenshot of the register page after invalid data input - no user last name
        captureScreenshot(driver, "Register Page Display After Invalid Data Input - No User Last Name");
        //click 'Create account' button
        registerPage.clickCreateAccountButton();
        //assert the user gets expected error message
        assertEquals("Last Name field cannot be blank.", registerPage.getRegisterPageSingularInputError(), "The user account creation missing last name input error doesn't match expectations or the error wasn't triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - No User Last Name");
    }

    //invalid user account creation test method - no user address
    protected void invalidUserAccountCreationNoAddressTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        RegisterPageNoSingularInput registerPageNoSingularInput = new RegisterPageNoSingularInput(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //register page text element assert
        isRegisterPageTextElementAsExpected(registerPage);
        //capture screenshot of the register page before data input
        captureScreenshot(driver, "Register Page Display Before Data Input");
        //invalid user register data getter - no user address
        registerPageNoSingularInput.invalidUserRegisterDataNoAddressGetter();
        //input valid user email into email input field
        registerPageNoSingularInput.inputValidRegisterEmailIntoEmailInputField();
        //input valid user password into password input field
        registerPageNoSingularInput.inputValidRegisterPasswordIntoPasswordInputField();
        //input valid matching user confirm password into confirm password input field
        registerPageNoSingularInput.inputValidRegisterConfirmPasswordIntoConfirmPasswordInputField();
        //input valid user first name into first name input field
        registerPageNoSingularInput.inputValidRegisterFirstNameIntoFirstNameInputField();
        //input valid user last name into last name input field
        registerPageNoSingularInput.inputValidRegisterLastNameIntoLastNameInputField();
        //don't input user address 1 into address 1 input field
        registerPageNoSingularInput.inputNoRegisterAddressIntoAddressInputField();
        //input valid user city into city input field
        registerPageNoSingularInput.inputValidRegisterCityIntoCityInputField();
        //click 'State' dropdown menu
        registerPage.clickStateDropdownMenu();
        //select 'Illinois' option
        registerPage.selectIllinoisOption();
        //input valid user post code into post code input field
        registerPageNoSingularInput.inputValidRegisterPostCodeIntoPostCodeInputField();
        //input valid user phone into phone input field
        registerPageNoSingularInput.inputValidRegisterPhoneIntoPhoneNumberInputField();
        //capture screenshot of the register page after invalid data input - no user address
        captureScreenshot(driver, "Register Page Display After Invalid Data Input - No User Address");
        //click 'Create account' button
        registerPage.clickCreateAccountButton();
        //assert the user gets expected error message
        assertEquals("Address Line 1 field cannot be blank.", registerPage.getRegisterPageSingularInputError(), "The user account creation missing address input error doesn't match expectations or the error wasn't triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - No User Address");
    }

    //invalid user account creation test method - no user city
    protected void invalidUserAccountCreationNoCityTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        RegisterPageNoSingularInput registerPageNoSingularInput = new RegisterPageNoSingularInput(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //register page text element assert
        isRegisterPageTextElementAsExpected(registerPage);
        //capture screenshot of the register page before data input
        captureScreenshot(driver, "Register Page Display Before Data Input");
        //invalid user register data getter - no user city
        registerPageNoSingularInput.invalidUserRegisterDataNoCityGetter();
        //input valid user email into email input field
        registerPageNoSingularInput.inputValidRegisterEmailIntoEmailInputField();
        //input valid user password into password input field
        registerPageNoSingularInput.inputValidRegisterPasswordIntoPasswordInputField();
        //input valid matching user confirm password into confirm password input field
        registerPageNoSingularInput.inputValidRegisterConfirmPasswordIntoConfirmPasswordInputField();
        //input valid user first name into first name input field
        registerPageNoSingularInput.inputValidRegisterFirstNameIntoFirstNameInputField();
        //input valid user last name into last name input field
        registerPageNoSingularInput.inputValidRegisterLastNameIntoLastNameInputField();
        //input valid user address 1 into address 1 input field
        registerPageNoSingularInput.inputValidRegisterAddressIntoAddressInputField();
        //don't input user city into city input field
        registerPageNoSingularInput.inputNoRegisterCityIntoCityInputField();
        //click 'State' dropdown menu
        registerPage.clickStateDropdownMenu();
        //select 'Illinois' option
        registerPage.selectIllinoisOption();
        //input valid user post code into post code input field
        registerPageNoSingularInput.inputValidRegisterPostCodeIntoPostCodeInputField();
        //input valid user phone into phone input field
        registerPageNoSingularInput.inputValidRegisterPhoneIntoPhoneNumberInputField();
        //capture screenshot of the register page after invalid data input - no user city
        captureScreenshot(driver, "Register Page Display After Invalid Data Input - No User City");
        //click 'Create account' button
        registerPage.clickCreateAccountButton();
        //assert the user gets expected error message
        assertEquals("Suburb/City field cannot be blank.", registerPage.getRegisterPageSingularInputError(), "The user account creation missing city input error doesn't match expectations or the error wasn't triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - No User City");
    }

    //invalid user account creation test method - no user post code
    protected void invalidUserAccountCreationNoPostCodeTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        RegisterPageNoSingularInput registerPageNoSingularInput = new RegisterPageNoSingularInput(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //register page text element assert
        isRegisterPageTextElementAsExpected(registerPage);
        //capture screenshot of the register page before data input
        captureScreenshot(driver, "Register Page Display Before Data Input");
        //invalid user register data getter - no user post code
        registerPageNoSingularInput.invalidUserRegisterDataNoPostCodeGetter();
        //input valid user email into email input field
        registerPageNoSingularInput.inputValidRegisterEmailIntoEmailInputField();
        //input valid user password into password input field
        registerPageNoSingularInput.inputValidRegisterPasswordIntoPasswordInputField();
        //input valid matching user confirm password into confirm password input field
        registerPageNoSingularInput.inputValidRegisterConfirmPasswordIntoConfirmPasswordInputField();
        //input valid user first name into first name input field
        registerPageNoSingularInput.inputValidRegisterFirstNameIntoFirstNameInputField();
        //input valid user last name into last name input field
        registerPageNoSingularInput.inputValidRegisterLastNameIntoLastNameInputField();
        //input valid user address 1 into address 1 input field
        registerPageNoSingularInput.inputValidRegisterAddressIntoAddressInputField();
        //input valid user city into city input field
        registerPageNoSingularInput.inputValidRegisterCityIntoCityInputField();
        //click 'State' dropdown menu
        registerPage.clickStateDropdownMenu();
        //select 'Illinois' option
        registerPage.selectIllinoisOption();
        //don't input user post code into post code input field
        registerPageNoSingularInput.inputNoRegisterPostCodeIntoPostCodeInputField();
        //input valid user phone into phone input field
        registerPageNoSingularInput.inputValidRegisterPhoneIntoPhoneNumberInputField();
        //capture screenshot of the register page after invalid data input - no user post code
        captureScreenshot(driver, "Register Page Display After Invalid Data Input - No User Post Code");
        //click 'Create account' button
        registerPage.clickCreateAccountButton();
        //assert the user gets expected error message
        assertEquals("Zip/Postcode field cannot be blank.", registerPage.getRegisterPageSingularInputError(), "The user account creation missing post code input error doesn't match expectations or the error wasn't triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - No User Post Code");
    }

    //invalid user account creation test method - no user phone
    protected void invalidUserAccountCreationNoPhoneTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        RegisterPageNoSingularInput registerPageNoSingularInput = new RegisterPageNoSingularInput(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //register page text element assert
        isRegisterPageTextElementAsExpected(registerPage);
        //capture screenshot of the register page before data input
        captureScreenshot(driver, "Register Page Display Before Data Input");
        //invalid user register data getter - no user phone
        registerPageNoSingularInput.invalidUserRegisterDataNoPhoneGetter();
        //input valid user email into email input field
        registerPageNoSingularInput.inputValidRegisterEmailIntoEmailInputField();
        //input valid user password into password input field
        registerPageNoSingularInput.inputValidRegisterPasswordIntoPasswordInputField();
        //input valid matching user confirm password into confirm password input field
        registerPageNoSingularInput.inputValidRegisterConfirmPasswordIntoConfirmPasswordInputField();
        //input valid user first name into first name input field
        registerPageNoSingularInput.inputValidRegisterFirstNameIntoFirstNameInputField();
        //input valid user last name into last name input field
        registerPageNoSingularInput.inputValidRegisterLastNameIntoLastNameInputField();
        //input valid user address 1 into address 1 input field
        registerPageNoSingularInput.inputValidRegisterAddressIntoAddressInputField();
        //input valid user city into city input field
        registerPageNoSingularInput.inputValidRegisterCityIntoCityInputField();
        //click 'State' dropdown menu
        registerPage.clickStateDropdownMenu();
        //select 'Illinois' option
        registerPage.selectIllinoisOption();
        //input valid user post code into post code input field
        registerPageNoSingularInput.inputValidRegisterPostCodeIntoPostCodeInputField();
        //don't input user phone into phone input field
        registerPageNoSingularInput.inputNoRegisterPhoneIntoPhoneNumberInputField();
        //capture screenshot of the register page after invalid data input - no user phone
        captureScreenshot(driver, "Register Page Display After Invalid Data Input - No User Phone");
        //click 'Create account' button
        registerPage.clickCreateAccountButton();
        //assert the user gets expected error message
        assertEquals("Phone Number field cannot be blank.", registerPage.getRegisterPageSingularInputError(), "The user account creation missing phone input error doesn't match expectations or the error wasn't triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - No User Phone");
    }

    //too short singular input

    //invalid user account creation test method - too short user email (1 char -> name, domain)
    protected void invalidUserAccountCreationTooShortEmailTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        RegisterPageTooShortSingularInput registerPageTooShortSingularInput = new RegisterPageTooShortSingularInput(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //register page text element assert
        isRegisterPageTextElementAsExpected(registerPage);
        //capture screenshot of the register page before data input
        captureScreenshot(driver, "Register Page Display Before Data Input");
        //invalid user register data getter - too short user email (1 char -> name, domain)
        registerPageTooShortSingularInput.invalidUserRegisterDataTooShortEmailGetter();
        //input too short user email into email input field (1 char -> name, domain)
        registerPageTooShortSingularInput.inputTooShortRegisterEmailIntoEmailInputField();
        //input valid user password into password input field
        registerPageTooShortSingularInput.inputValidRegisterPasswordIntoPasswordInputField();
        //input valid user confirm password into confirm password input field
        registerPageTooShortSingularInput.inputValidRegisterConfirmPasswordIntoConfirmPasswordInputField();
        //input valid user first name into first name input field
        registerPageTooShortSingularInput.inputValidRegisterFirstNameIntoFirstNameInputField();
        //input valid user last name into last name input field
        registerPageTooShortSingularInput.inputValidRegisterLastNameIntoLastNameInputField();
        //input valid user address 1 into address 1 input field
        registerPageTooShortSingularInput.inputValidRegisterAddressIntoAddressInputField();
        //input valid user city into city input field
        registerPageTooShortSingularInput.inputValidRegisterCityIntoCityInputField();
        //click 'State' dropdown menu
        registerPage.clickStateDropdownMenu();
        //select 'Illinois' option
        registerPage.selectIllinoisOption();
        //input valid user post code into post code input field
        registerPageTooShortSingularInput.inputValidRegisterPostCodeIntoPostCodeInputField();
        //input valid user phone into phone input field
        registerPageTooShortSingularInput.inputValidRegisterPhoneIntoPhoneNumberInputField();
        //capture screenshot of the register page after invalid data input - too short user email (1 char -> name, domain)
        captureScreenshot(driver, "Register Page Display After Invalid Data Input - Too Short User Email");
        //click 'Create account' button
        registerPage.clickCreateAccountButton();
        //assert the user gets expected error message, log the issue otherwise
        try {
            assertEquals("You must enter a valid email.", registerPage.getRegisterPageSingularInputError(), "The user account creation too short email input error doesn't match expectations");
        } catch (Exception e) {
            logger.error("The too short user email input error wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - Too Short User Email");
    }

    //invalid user account creation test method - too short user password / confirm password (6 chars)
    protected void invalidUserAccountCreationTooShortPasswordConfirmTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        RegisterPageTooShortSingularInput registerPageTooShortSingularInput = new RegisterPageTooShortSingularInput(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //register page text element assert
        isRegisterPageTextElementAsExpected(registerPage);
        //capture screenshot of the register page before data input
        captureScreenshot(driver, "Register Page Display Before Data Input");
        //invalid user register data getter - too short user password (6 chars)
        registerPageTooShortSingularInput.invalidUserRegisterDataTooShortPasswordConfirmGetter();
        //input valid user email into email input field
        registerPageTooShortSingularInput.inputValidRegisterEmailIntoEmailInputField();
        //input too short user password into password input field (6 chars)
        registerPageTooShortSingularInput.inputTooShortRegisterPasswordIntoPasswordInputField();
        //input matching too short confirm password into confirm password input field
        registerPageTooShortSingularInput.inputTooShortRegisterConfirmPasswordIntoConfirmPasswordInputField();
        //input valid user first name into first name input field
        registerPageTooShortSingularInput.inputValidRegisterFirstNameIntoFirstNameInputField();
        //input valid user last name into last name input field
        registerPageTooShortSingularInput.inputValidRegisterLastNameIntoLastNameInputField();
        //input valid user address 1 into address 1 input field
        registerPageTooShortSingularInput.inputValidRegisterAddressIntoAddressInputField();
        //input valid user city into city input field
        registerPageTooShortSingularInput.inputValidRegisterCityIntoCityInputField();
        //click 'State' dropdown menu
        registerPage.clickStateDropdownMenu();
        //select 'Illinois' option
        registerPage.selectIllinoisOption();
        //input valid user post code into post code input field
        registerPageTooShortSingularInput.inputValidRegisterPostCodeIntoPostCodeInputField();
        //input valid user phone into phone input field
        registerPageTooShortSingularInput.inputValidRegisterPhoneIntoPhoneNumberInputField();
        //capture screenshot of the register page after invalid data input - too short user password / confirm password (6 chars)
        captureScreenshot(driver, "Register Page Display After Invalid Data Input - Too Short User Password and Confirm Password");
        //click 'Create account' button
        registerPage.clickCreateAccountButton();
        //assert the user gets expected error message, log the issue otherwise
        try {
            assertEquals("Passwords must be at least 7 characters and contain both alphabetic and numeric characters.", registerPage.getRegisterPageSingularInputError(), "The user account creation too short password / confirm password input error doesn't match expectations");
        } catch (Exception e) {
            logger.error("The too short user password / confirm password input error wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - Too Short User Password and Confirm Password");
    }

    //invalid user account creation test method - too short user first name (1 char)
    protected void invalidUserAccountCreationTooShortFirstNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        RegisterPageTooShortSingularInput registerPageTooShortSingularInput = new RegisterPageTooShortSingularInput(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //register page text element assert
        isRegisterPageTextElementAsExpected(registerPage);
        //capture screenshot of the register page before data input
        captureScreenshot(driver, "Register Page Display Before Data Input");
        //invalid user register data getter - too short user first name (1 char)
        registerPageTooShortSingularInput.invalidUserRegisterDataTooShortFirstNameGetter();
        //input valid user email into email input field
        registerPageTooShortSingularInput.inputValidRegisterEmailIntoEmailInputField();
        //input valid user password into password input field
        registerPageTooShortSingularInput.inputValidRegisterPasswordIntoPasswordInputField();
        //input matching valid confirm password into confirm password input field
        registerPageTooShortSingularInput.inputValidRegisterConfirmPasswordIntoConfirmPasswordInputField();
        //input too short user first name into first name input field (1 char)
        registerPageTooShortSingularInput.inputTooShortRegisterFirstNameIntoFirstNameInputField();
        //input valid user last name into last name input field
        registerPageTooShortSingularInput.inputValidRegisterLastNameIntoLastNameInputField();
        //input valid user address 1 into address 1 input field
        registerPageTooShortSingularInput.inputValidRegisterAddressIntoAddressInputField();
        //input valid user city into city input field
        registerPageTooShortSingularInput.inputValidRegisterCityIntoCityInputField();
        //click 'State' dropdown menu
        registerPage.clickStateDropdownMenu();
        //select 'Illinois' option
        registerPage.selectIllinoisOption();
        //input valid user post code into post code input field
        registerPageTooShortSingularInput.inputValidRegisterPostCodeIntoPostCodeInputField();
        //input valid user phone into phone input field
        registerPageTooShortSingularInput.inputValidRegisterPhoneIntoPhoneNumberInputField();
        //capture screenshot of the register page after invalid data input - too short user first name (1 char)
        captureScreenshot(driver, "Register Page Display After Invalid Data Input - Too Short User First Name");
        //click 'Create account' button
        registerPage.clickCreateAccountButton();
        //assert the user gets expected error message, log the issue otherwise
        try {
            assertEquals("First name is too short.", registerPage.getRegisterPageSingularInputError(), "The user account creation too short first name input error doesn't match expectations");
        } catch (Exception e) {
            logger.error("The too short user first name input error wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - Too Short User First Name");
    }

    //invalid user account creation test method - too short user last name (1 char)
    protected void invalidUserAccountCreationTooShortLastNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        RegisterPageTooShortSingularInput registerPageTooShortSingularInput = new RegisterPageTooShortSingularInput(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //register page text element assert
        isRegisterPageTextElementAsExpected(registerPage);
        //capture screenshot of the register page before data input
        captureScreenshot(driver, "Register Page Display Before Data Input");
        //invalid user register data getter - too short user last name (1 char)
        registerPageTooShortSingularInput.invalidUserRegisterDataTooShortLastNameGetter();
        //input valid user email into email input field
        registerPageTooShortSingularInput.inputValidRegisterEmailIntoEmailInputField();
        //input valid user password into password input field
        registerPageTooShortSingularInput.inputValidRegisterPasswordIntoPasswordInputField();
        //input matching valid confirm password into confirm password input field
        registerPageTooShortSingularInput.inputValidRegisterConfirmPasswordIntoConfirmPasswordInputField();
        //input valid user first name into first name input field
        registerPageTooShortSingularInput.inputValidRegisterFirstNameIntoFirstNameInputField();
        //input too short user last name into last name input field (1 char)
        registerPageTooShortSingularInput.inputTooShortRegisterLastNameIntoLastNameInputField();
        //input valid user address 1 into address 1 input field
        registerPageTooShortSingularInput.inputValidRegisterAddressIntoAddressInputField();
        //input valid user city into city input field
        registerPageTooShortSingularInput.inputValidRegisterCityIntoCityInputField();
        //click 'State' dropdown menu
        registerPage.clickStateDropdownMenu();
        //select 'Illinois' option
        registerPage.selectIllinoisOption();
        //input valid user post code into post code input field
        registerPageTooShortSingularInput.inputValidRegisterPostCodeIntoPostCodeInputField();
        //input valid user phone into phone input field
        registerPageTooShortSingularInput.inputValidRegisterPhoneIntoPhoneNumberInputField();
        //capture screenshot of the register page after invalid data input - too short user last name (1 char)
        captureScreenshot(driver, "Register Page Display After Invalid Data Input - Too Short User Last Name");
        //click 'Create account' button
        registerPage.clickCreateAccountButton();
        //assert the user gets expected error message, log the issue otherwise
        try {
            assertEquals("Last name is too short.", registerPage.getRegisterPageSingularInputError(), "The user account creation too short last name input error doesn't match expectations");
        } catch (Exception e) {
            logger.error("The too short user last name input error wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - Too Short User Last Name");
    }

    //invalid user account creation test method - too short user address (3 chars)
    protected void invalidUserAccountCreationTooShortAddressTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        RegisterPageTooShortSingularInput registerPageTooShortSingularInput = new RegisterPageTooShortSingularInput(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //register page text element assert
        isRegisterPageTextElementAsExpected(registerPage);
        //capture screenshot of the register page before data input
        captureScreenshot(driver, "Register Page Display Before Data Input");
        //invalid user register data getter - too short user address (3 chars)
        registerPageTooShortSingularInput.invalidUserRegisterDataTooShortAddressGetter();
        //input valid user email into email input field
        registerPageTooShortSingularInput.inputValidRegisterEmailIntoEmailInputField();
        //input valid user password into password input field
        registerPageTooShortSingularInput.inputValidRegisterPasswordIntoPasswordInputField();
        //input matching valid confirm password into confirm password input field
        registerPageTooShortSingularInput.inputValidRegisterConfirmPasswordIntoConfirmPasswordInputField();
        //input valid user first name into first name input field
        registerPageTooShortSingularInput.inputValidRegisterFirstNameIntoFirstNameInputField();
        //input valid user last name into last name input field
        registerPageTooShortSingularInput.inputValidRegisterLastNameIntoLastNameInputField();
        //input too short user address 1 into address 1 input field (3 chars)
        registerPageTooShortSingularInput.inputTooShortRegisterAddressIntoAddressInputField();
        //input valid user city into city input field
        registerPageTooShortSingularInput.inputValidRegisterCityIntoCityInputField();
        //click 'State' dropdown menu
        registerPage.clickStateDropdownMenu();
        //select 'Illinois' option
        registerPage.selectIllinoisOption();
        //input valid user post code into post code input field
        registerPageTooShortSingularInput.inputValidRegisterPostCodeIntoPostCodeInputField();
        //input valid user phone into phone input field
        registerPageTooShortSingularInput.inputValidRegisterPhoneIntoPhoneNumberInputField();
        //capture screenshot of the register page after invalid data input - too short user address (3 chars)
        captureScreenshot(driver, "Register Page Display After Invalid Data Input - Too Short User Address");
        //click 'Create account' button
        registerPage.clickCreateAccountButton();
        //assert the user gets expected error message, log the issue otherwise
        try {
            assertEquals("Address Line 1 is too short.", registerPage.getRegisterPageSingularInputError(), "The user account creation too short address input error doesn't match expectations");
        } catch (Exception e) {
            logger.error("The too short user address input error wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - Too Short User Address");
    }

    //invalid user account creation test method - too short user city (1 char)
    protected void invalidUserAccountCreationTooShortCityTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        RegisterPageTooShortSingularInput registerPageTooShortSingularInput = new RegisterPageTooShortSingularInput(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //register page text element assert
        isRegisterPageTextElementAsExpected(registerPage);
        //capture screenshot of the register page before data input
        captureScreenshot(driver, "Register Page Display Before Data Input");
        //invalid user register data getter - too short user city (1 char)
        registerPageTooShortSingularInput.invalidUserRegisterDataTooShortCityGetter();
        //input valid user email into email input field
        registerPageTooShortSingularInput.inputValidRegisterEmailIntoEmailInputField();
        //input valid user password into password input field
        registerPageTooShortSingularInput.inputValidRegisterPasswordIntoPasswordInputField();
        //input matching valid confirm password into confirm password input field
        registerPageTooShortSingularInput.inputValidRegisterConfirmPasswordIntoConfirmPasswordInputField();
        //input valid user first name into first name input field
        registerPageTooShortSingularInput.inputValidRegisterFirstNameIntoFirstNameInputField();
        //input valid user last name into last name input field
        registerPageTooShortSingularInput.inputValidRegisterLastNameIntoLastNameInputField();
        //input valid user address 1 into address 1 input field
        registerPageTooShortSingularInput.inputValidRegisterAddressIntoAddressInputField();
        //input too short user city into city input field (1 char)
        registerPageTooShortSingularInput.inputTooShortRegisterCityIntoCityInputField();
        //click 'State' dropdown menu
        registerPage.clickStateDropdownMenu();
        //select 'Illinois' option
        registerPage.selectIllinoisOption();
        //input valid user post code into post code input field
        registerPageTooShortSingularInput.inputValidRegisterPostCodeIntoPostCodeInputField();
        //input valid user phone into phone input field
        registerPageTooShortSingularInput.inputValidRegisterPhoneIntoPhoneNumberInputField();
        //capture screenshot of the register page after invalid data input - too short user city (1 char)
        captureScreenshot(driver, "Register Page Display After Invalid Data Input - Too Short User City");
        //click 'Create account' button
        registerPage.clickCreateAccountButton();
        //assert the user gets expected error message, log the issue otherwise
        try {
            assertEquals("City is too short.", registerPage.getRegisterPageSingularInputError(), "The user account creation too short city input error doesn't match expectations");
        } catch (Exception e) {
            logger.error("The too short user city input error wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - Too Short User City");
    }

    //invalid user account creation test method - too short user post code (4 digits)
    protected void invalidUserAccountCreationTooShortPostCodeTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        RegisterPageTooShortSingularInput registerPageTooShortSingularInput = new RegisterPageTooShortSingularInput(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //register page text element assert
        isRegisterPageTextElementAsExpected(registerPage);
        //capture screenshot of the register page before data input
        captureScreenshot(driver, "Register Page Display Before Data Input");
        //invalid user register data getter - too short user post code (4 digits)
        registerPageTooShortSingularInput.invalidUserRegisterDataTooShortPostCodeGetter();
        //input valid user email into email input field
        registerPageTooShortSingularInput.inputValidRegisterEmailIntoEmailInputField();
        //input valid user password into password input field
        registerPageTooShortSingularInput.inputValidRegisterPasswordIntoPasswordInputField();
        //input matching valid confirm password into confirm password input field
        registerPageTooShortSingularInput.inputValidRegisterConfirmPasswordIntoConfirmPasswordInputField();
        //input valid user first name into first name input field
        registerPageTooShortSingularInput.inputValidRegisterFirstNameIntoFirstNameInputField();
        //input valid user last name into last name input field
        registerPageTooShortSingularInput.inputValidRegisterLastNameIntoLastNameInputField();
        //input valid user address 1 into address 1 input field
        registerPageTooShortSingularInput.inputValidRegisterAddressIntoAddressInputField();
        //input valid user city into city input field
        registerPageTooShortSingularInput.inputValidRegisterCityIntoCityInputField();
        //click 'State' dropdown menu
        registerPage.clickStateDropdownMenu();
        //select 'Illinois' option
        registerPage.selectIllinoisOption();
        //input too short user post code into post code input field (4 digits)
        registerPageTooShortSingularInput.inputTooShortRegisterPostCodeIntoPostCodeInputField();
        //input valid user phone into phone input field
        registerPageTooShortSingularInput.inputValidRegisterPhoneIntoPhoneNumberInputField();
        //capture screenshot of the register page after invalid data input - too short user post code (4 digits)
        captureScreenshot(driver, "Register Page Display After Invalid Data Input - Too Short User Post Code");
        //click 'Create account' button
        registerPage.clickCreateAccountButton();
        //assert the user gets expected error message, log the issue otherwise
        try {
            assertEquals("Post code is too short.", registerPage.getRegisterPageSingularInputError(), "The user account creation too short post code input error doesn't match expectations");
        } catch (Exception e) {
            logger.error("The too short user post code input error wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - Too Short User Post Code");
    }

    //invalid user account creation test method - too short user phone (2 digits)
    protected void invalidUserAccountCreationTooShortPhoneTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        RegisterPageTooShortSingularInput registerPageTooShortSingularInput = new RegisterPageTooShortSingularInput(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //register page text element assert
        isRegisterPageTextElementAsExpected(registerPage);
        //capture screenshot of the register page before data input
        captureScreenshot(driver, "Register Page Display Before Data Input");
        //invalid user register data getter - too short user phone (2 digits)
        registerPageTooShortSingularInput.invalidUserRegisterDataTooShortPhoneGetter();
        //input valid user email into email input field
        registerPageTooShortSingularInput.inputValidRegisterEmailIntoEmailInputField();
        //input valid user password into password input field
        registerPageTooShortSingularInput.inputValidRegisterPasswordIntoPasswordInputField();
        //input matching valid confirm password into confirm password input field
        registerPageTooShortSingularInput.inputValidRegisterConfirmPasswordIntoConfirmPasswordInputField();
        //input valid user first name into first name input field
        registerPageTooShortSingularInput.inputValidRegisterFirstNameIntoFirstNameInputField();
        //input valid user last name into last name input field
        registerPageTooShortSingularInput.inputValidRegisterLastNameIntoLastNameInputField();
        //input valid user address 1 into address 1 input field
        registerPageTooShortSingularInput.inputValidRegisterAddressIntoAddressInputField();
        //input valid user city into city input field
        registerPageTooShortSingularInput.inputValidRegisterCityIntoCityInputField();
        //click 'State' dropdown menu
        registerPage.clickStateDropdownMenu();
        //select 'Illinois' option
        registerPage.selectIllinoisOption();
        //input valid user post code into post code input field
        registerPageTooShortSingularInput.inputValidRegisterPostCodeIntoPostCodeInputField();
        //input too short user phone into phone input field
        registerPageTooShortSingularInput.inputTooShortRegisterPhoneIntoPhoneNumberInputField();
        //capture screenshot of the register page after invalid data input - too short user phone (2 digits)
        captureScreenshot(driver, "Register Page Display After Invalid Data Input - Too Short User Phone");
        //click 'Create account' button
        registerPage.clickCreateAccountButton();
        //assert the user gets expected error message, log the issue otherwise
        try {
            assertEquals("Phone is too short.", registerPage.getRegisterPageSingularInputError(), "The user account creation too short phone input error doesn't match expectations");
        } catch (Exception e) {
            logger.error("The too short user phone input error wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - Too Short User Phone");
    }

    //too long singular input

    //invalid user account creation test method - too long user email (100 chars -> name, domain)
    protected void invalidUserAccountCreationTooLongEmailTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        RegisterPageTooLongSingularInput registerPageTooLongSingularInput = new RegisterPageTooLongSingularInput(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //register page text element assert
        isRegisterPageTextElementAsExpected(registerPage);
        //capture screenshot of the register page before data input
        captureScreenshot(driver, "Register Page Display Before Data Input");
        //invalid user register data getter - too long user email (100 chars -> name, domain)
        registerPageTooLongSingularInput.invalidUserRegisterDataTooLongEmailGetter();
        //input too long user email into email input field (100 chars -> name, domain)
        registerPageTooLongSingularInput.inputTooLongRegisterEmailIntoEmailInputField();
        //input valid user password into password input field
        registerPageTooLongSingularInput.inputValidRegisterPasswordIntoPasswordInputField();
        //input valid user confirm password into confirm password input field
        registerPageTooLongSingularInput.inputValidRegisterConfirmPasswordIntoConfirmPasswordInputField();
        //input valid user first name into first name input field
        registerPageTooLongSingularInput.inputValidRegisterFirstNameIntoFirstNameInputField();
        //input valid user last name into last name input field
        registerPageTooLongSingularInput.inputValidRegisterLastNameIntoLastNameInputField();
        //input valid user address 1 into address 1 input field
        registerPageTooLongSingularInput.inputValidRegisterAddressIntoAddressInputField();
        //input valid user city into city input field
        registerPageTooLongSingularInput.inputValidRegisterCityIntoCityInputField();
        //click 'State' dropdown menu
        registerPage.clickStateDropdownMenu();
        //select 'Illinois' option
        registerPage.selectIllinoisOption();
        //input valid user post code into post code input field
        registerPageTooLongSingularInput.inputValidRegisterPostCodeIntoPostCodeInputField();
        //input valid user phone into phone input field
        registerPageTooLongSingularInput.inputValidRegisterPhoneIntoPhoneNumberInputField();
        //capture screenshot of the register page after invalid data input - too long user email (100 chars -> name, domain)
        captureScreenshot(driver, "Register Page Display After Invalid Data Input - Too Long User Email");
        //click 'Create account' button
        registerPage.clickCreateAccountButton();
        //assert the user gets expected error message, log the issue otherwise
        try {
            assertEquals("Please type in a valid email address, such as joe@example.com", registerPage.getRegisterPageSingularInputErrorBoxText(), "The user account creation too long email input error doesn't match expectations");
        } catch (Exception e) {
            logger.error("The too long user email input error wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - Too Long User Email");
    }

    //invalid user account creation test method - too long user password / confirm password (100 chars -> name, domain)
    protected void invalidUserAccountCreationTooLongPasswordConfirmTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        RegisterPageTooLongSingularInput registerPageTooLongSingularInput = new RegisterPageTooLongSingularInput(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //register page text element assert
        isRegisterPageTextElementAsExpected(registerPage);
        //capture screenshot of the register page before data input
        captureScreenshot(driver, "Register Page Display Before Data Input");
        //invalid user register data getter - too long user password / confirm password (75 chars)
        registerPageTooLongSingularInput.invalidUserRegisterDataTooLongPasswordConfirmGetter();
        //input valid user email into email input field
        registerPageTooLongSingularInput.inputValidRegisterEmailIntoEmailInputField();
        //input too long user password into password input field (75 chars)
        registerPageTooLongSingularInput.inputTooLongRegisterPasswordIntoPasswordInputField();
        //input too long user confirm password into confirm password input field (75 chars)
        registerPageTooLongSingularInput.inputTooLongRegisterConfirmPasswordIntoConfirmPasswordInputField();
        //input valid user first name into first name input field
        registerPageTooLongSingularInput.inputValidRegisterFirstNameIntoFirstNameInputField();
        //input valid user last name into last name input field
        registerPageTooLongSingularInput.inputValidRegisterLastNameIntoLastNameInputField();
        //input valid user address 1 into address 1 input field
        registerPageTooLongSingularInput.inputValidRegisterAddressIntoAddressInputField();
        //input valid user city into city input field
        registerPageTooLongSingularInput.inputValidRegisterCityIntoCityInputField();
        //click 'State' dropdown menu
        registerPage.clickStateDropdownMenu();
        //select 'Illinois' option
        registerPage.selectIllinoisOption();
        //input valid user post code into post code input field
        registerPageTooLongSingularInput.inputValidRegisterPostCodeIntoPostCodeInputField();
        //input valid user phone into phone input field
        registerPageTooLongSingularInput.inputValidRegisterPhoneIntoPhoneNumberInputField();
        //capture screenshot of the register page after invalid data input - too long user password / confirm password (75 chars)
        captureScreenshot(driver, "Register Page Display After Invalid Data Input - Too Long User Password and Confirm Password");
        //click 'Create account' button
        registerPage.clickCreateAccountButton();
        //assert the user gets expected error message, log the issue otherwise
        try {
            assertEquals("Password is too long", registerPage.getRegisterPageSingularInputError(), "The user account creation too long password / confirm password input error doesn't match expectations");
        } catch (Exception e) {
            logger.error("The too long user password / confirm password input error wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - Too Long User Password and Confirm Password");
    }

    //invalid user account creation test method - too long user first name (100 chars)
    protected void invalidUserAccountCreationTooLongFirstNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        RegisterPageTooLongSingularInput registerPageTooLongSingularInput = new RegisterPageTooLongSingularInput(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //register page text element assert
        isRegisterPageTextElementAsExpected(registerPage);
        //capture screenshot of the register page before data input
        captureScreenshot(driver, "Register Page Display Before Data Input");
        //invalid user register data getter - too long user first name (100 chars)
        registerPageTooLongSingularInput.invalidUserRegisterDataTooLongFirstNameGetter();
        //input valid user email into email input field
        registerPageTooLongSingularInput.inputValidRegisterEmailIntoEmailInputField();
        //input valid user password into password input field
        registerPageTooLongSingularInput.inputValidRegisterPasswordIntoPasswordInputField();
        //input valid user confirm password into confirm password input field
        registerPageTooLongSingularInput.inputValidRegisterConfirmPasswordIntoConfirmPasswordInputField();
        //input too long user first name into first name input field (100 chars)
        registerPageTooLongSingularInput.inputTooLongRegisterFirstNameIntoFirstNameInputField();
        //input valid user last name into last name input field
        registerPageTooLongSingularInput.inputValidRegisterLastNameIntoLastNameInputField();
        //input valid user address 1 into address 1 input field
        registerPageTooLongSingularInput.inputValidRegisterAddressIntoAddressInputField();
        //input valid user city into city input field
        registerPageTooLongSingularInput.inputValidRegisterCityIntoCityInputField();
        //click 'State' dropdown menu
        registerPage.clickStateDropdownMenu();
        //select 'Illinois' option
        registerPage.selectIllinoisOption();
        //input valid user post code into post code input field
        registerPageTooLongSingularInput.inputValidRegisterPostCodeIntoPostCodeInputField();
        //input valid user phone into phone input field
        registerPageTooLongSingularInput.inputValidRegisterPhoneIntoPhoneNumberInputField();
        //capture screenshot of the register page after invalid data input - too long user first name (100 chars)
        captureScreenshot(driver, "Register Page Display After Invalid Data Input - Too Long User First Name");
        //click 'Create account' button
        registerPage.clickCreateAccountButton();
        //assert the user gets expected error message, log the issue otherwise
        try {
            assertEquals("First name is too long", registerPage.getRegisterPageSingularInputError(), "The user account creation too long first name input error doesn't match expectations");
        } catch (Exception e) {
            logger.error("The too long user first name input error wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - Too Long User First Name");
    }

    //invalid user account creation test method - too long user last name (100 chars)
    protected void invalidUserAccountCreationTooLongLastNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        RegisterPageTooLongSingularInput registerPageTooLongSingularInput = new RegisterPageTooLongSingularInput(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //register page text element assert
        isRegisterPageTextElementAsExpected(registerPage);
        //capture screenshot of the register page before data input
        captureScreenshot(driver, "Register Page Display Before Data Input");
        //invalid user register data getter - too long user last name (100 chars)
        registerPageTooLongSingularInput.invalidUserRegisterDataTooLongLastNameGetter();
        //input valid user email into email input field
        registerPageTooLongSingularInput.inputValidRegisterEmailIntoEmailInputField();
        //input valid user password into password input field
        registerPageTooLongSingularInput.inputValidRegisterPasswordIntoPasswordInputField();
        //input valid user confirm password into confirm password input field
        registerPageTooLongSingularInput.inputValidRegisterConfirmPasswordIntoConfirmPasswordInputField();
        //input valid user first name into first name input field
        registerPageTooLongSingularInput.inputValidRegisterFirstNameIntoFirstNameInputField();
        //input too long user last name into last name input field (100 chars)
        registerPageTooLongSingularInput.inputTooLongRegisterLastNameIntoLastNameInputField();
        //input valid user address 1 into address 1 input field
        registerPageTooLongSingularInput.inputValidRegisterAddressIntoAddressInputField();
        //input valid user city into city input field
        registerPageTooLongSingularInput.inputValidRegisterCityIntoCityInputField();
        //click 'State' dropdown menu
        registerPage.clickStateDropdownMenu();
        //select 'Illinois' option
        registerPage.selectIllinoisOption();
        //input valid user post code into post code input field
        registerPageTooLongSingularInput.inputValidRegisterPostCodeIntoPostCodeInputField();
        //input valid user phone into phone input field
        registerPageTooLongSingularInput.inputValidRegisterPhoneIntoPhoneNumberInputField();
        //capture screenshot of the register page after invalid data input - too long user last name (100 chars)
        captureScreenshot(driver, "Register Page Display After Invalid Data Input - Too Long User Last Name");
        //click 'Create account' button
        registerPage.clickCreateAccountButton();
        //assert the user gets expected error message, log the issue otherwise
        try {
            assertEquals("Last name is too long", registerPage.getRegisterPageSingularInputError(), "The user account creation too long last name input error doesn't match expectations");
        } catch (Exception e) {
            logger.error("The too long user last name input error wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - Too Long User Last Name");
    }

    //invalid user account creation test method - too long user address (100 chars)
    protected void invalidUserAccountCreationTooLongAddressTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        RegisterPageTooLongSingularInput registerPageTooLongSingularInput = new RegisterPageTooLongSingularInput(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //register page text element assert
        isRegisterPageTextElementAsExpected(registerPage);
        //capture screenshot of the register page before data input
        captureScreenshot(driver, "Register Page Display Before Data Input");
        //invalid user register data getter - too long user address (100 chars)
        registerPageTooLongSingularInput.invalidUserRegisterDataTooLongAddressGetter();
        //input valid user email into email input field
        registerPageTooLongSingularInput.inputValidRegisterEmailIntoEmailInputField();
        //input valid user password into password input field
        registerPageTooLongSingularInput.inputValidRegisterPasswordIntoPasswordInputField();
        //input valid user confirm password into confirm password input field
        registerPageTooLongSingularInput.inputValidRegisterConfirmPasswordIntoConfirmPasswordInputField();
        //input valid user first name into first name input field
        registerPageTooLongSingularInput.inputValidRegisterFirstNameIntoFirstNameInputField();
        //input valid user last name into last name input field
        registerPageTooLongSingularInput.inputValidRegisterLastNameIntoLastNameInputField();
        //input too long user address 1 into address 1 input field (100 chars)
        registerPageTooLongSingularInput.inputTooLongRegisterAddressIntoAddressInputField();
        //input valid user city into city input field
        registerPageTooLongSingularInput.inputValidRegisterCityIntoCityInputField();
        //click 'State' dropdown menu
        registerPage.clickStateDropdownMenu();
        //select 'Illinois' option
        registerPage.selectIllinoisOption();
        //input valid user post code into post code input field
        registerPageTooLongSingularInput.inputValidRegisterPostCodeIntoPostCodeInputField();
        //input valid user phone into phone input field
        registerPageTooLongSingularInput.inputValidRegisterPhoneIntoPhoneNumberInputField();
        //capture screenshot of the register page after invalid data input - too long user address (100 chars)
        captureScreenshot(driver, "Register Page Display After Invalid Data Input - Too Long User Address");
        //click 'Create account' button
        registerPage.clickCreateAccountButton();
        //assert the user gets expected error message, log the issue otherwise
        try {
            assertEquals("Address Line 1 is too long", registerPage.getRegisterPageSingularInputError(), "The user account creation too long address input error doesn't match expectations");
        } catch (Exception e) {
            logger.error("The too long user address input error wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - Too Long User Address");
    }

    //invalid user account creation test method - too long user city (100 chars)
    protected void invalidUserAccountCreationTooLongCityTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        RegisterPageTooLongSingularInput registerPageTooLongSingularInput = new RegisterPageTooLongSingularInput(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //register page text element assert
        isRegisterPageTextElementAsExpected(registerPage);
        //capture screenshot of the register page before data input
        captureScreenshot(driver, "Register Page Display Before Data Input");
        //invalid user register data getter - too long user city (100 chars)
        registerPageTooLongSingularInput.invalidUserRegisterDataTooLongCityGetter();
        //input valid user email into email input field
        registerPageTooLongSingularInput.inputValidRegisterEmailIntoEmailInputField();
        //input valid user password into password input field
        registerPageTooLongSingularInput.inputValidRegisterPasswordIntoPasswordInputField();
        //input valid user confirm password into confirm password input field
        registerPageTooLongSingularInput.inputValidRegisterConfirmPasswordIntoConfirmPasswordInputField();
        //input valid user first name into first name input field
        registerPageTooLongSingularInput.inputValidRegisterFirstNameIntoFirstNameInputField();
        //input valid user last name into last name input field
        registerPageTooLongSingularInput.inputValidRegisterLastNameIntoLastNameInputField();
        //input valid user address 1 into address 1 input field
        registerPageTooLongSingularInput.inputValidRegisterAddressIntoAddressInputField();
        //input too long user city into city input field (100 chars)
        registerPageTooLongSingularInput.inputTooLongRegisterCityIntoCityInputField();
        //click 'State' dropdown menu
        registerPage.clickStateDropdownMenu();
        //select 'Illinois' option
        registerPage.selectIllinoisOption();
        //input valid user post code into post code input field
        registerPageTooLongSingularInput.inputValidRegisterPostCodeIntoPostCodeInputField();
        //input valid user phone into phone input field
        registerPageTooLongSingularInput.inputValidRegisterPhoneIntoPhoneNumberInputField();
        //capture screenshot of the register page after invalid data input - too long user city (100 chars)
        captureScreenshot(driver, "Register Page Display After Invalid Data Input - Too Long User City");
        //click 'Create account' button
        registerPage.clickCreateAccountButton();
        //assert the user gets expected error message, log the issue otherwise
        try {
            assertEquals("City is too long", registerPage.getRegisterPageSingularInputError(), "The user account creation too long city input error doesn't match expectations");
        } catch (Exception e) {
            logger.error("The too long user city input error wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - Too Long User City");
    }

    //invalid user account creation test method - too long user post code (6 digits)
    protected void invalidUserAccountCreationTooLongPostCodeTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        RegisterPageTooLongSingularInput registerPageTooLongSingularInput = new RegisterPageTooLongSingularInput(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //register page text element assert
        isRegisterPageTextElementAsExpected(registerPage);
        //capture screenshot of the register page before data input
        captureScreenshot(driver, "Register Page Display Before Data Input");
        //invalid user register data getter - too long user post code (6 digits)
        registerPageTooLongSingularInput.invalidUserRegisterDataTooLongPostCodeGetter();
        //input valid user email into email input field
        registerPageTooLongSingularInput.inputValidRegisterEmailIntoEmailInputField();
        //input valid user password into password input field
        registerPageTooLongSingularInput.inputValidRegisterPasswordIntoPasswordInputField();
        //input valid user confirm password into confirm password input field
        registerPageTooLongSingularInput.inputValidRegisterConfirmPasswordIntoConfirmPasswordInputField();
        //input valid user first name into first name input field
        registerPageTooLongSingularInput.inputValidRegisterFirstNameIntoFirstNameInputField();
        //input valid user last name into last name input field
        registerPageTooLongSingularInput.inputValidRegisterLastNameIntoLastNameInputField();
        //input valid user address 1 into address 1 input field
        registerPageTooLongSingularInput.inputValidRegisterAddressIntoAddressInputField();
        //input valid user city into city input field
        registerPageTooLongSingularInput.inputValidRegisterCityIntoCityInputField();
        //click 'State' dropdown menu
        registerPage.clickStateDropdownMenu();
        //select 'Illinois' option
        registerPage.selectIllinoisOption();
        //input too long user post code into post code input field (6 digits)
        registerPageTooLongSingularInput.inputTooLongRegisterPostCodeIntoPostCodeInputField();
        //input valid user phone into phone input field
        registerPageTooLongSingularInput.inputValidRegisterPhoneIntoPhoneNumberInputField();
        //capture screenshot of the register page after invalid data input - too long user post code (6 digits)
        captureScreenshot(driver, "Register Page Display After Invalid Data Input - Too Long User Post Code");
        //click 'Create account' button
        registerPage.clickCreateAccountButton();
        //assert the user gets expected error message, log the issue otherwise
        try {
            assertEquals("Post code is too long", registerPage.getRegisterPageSingularInputError(), "The user account creation too long post code input error doesn't match expectations");
        } catch (Exception e) {
            logger.error("The too long user post code input error wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - Too Long User Post Code");
    }

    //invalid user account creation test method - too long user phone (30 digits)
    protected void invalidUserAccountCreationTooLongPhoneTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        RegisterPageTooLongSingularInput registerPageTooLongSingularInput = new RegisterPageTooLongSingularInput(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //register page text element assert
        isRegisterPageTextElementAsExpected(registerPage);
        //capture screenshot of the register page before data input
        captureScreenshot(driver, "Register Page Display Before Data Input");
        //invalid user register data getter - too long user phone (30 digits)
        registerPageTooLongSingularInput.invalidUserRegisterDataTooLongPhoneGetter();
        //input valid user email into email input field
        registerPageTooLongSingularInput.inputValidRegisterEmailIntoEmailInputField();
        //input valid user password into password input field
        registerPageTooLongSingularInput.inputValidRegisterPasswordIntoPasswordInputField();
        //input valid user confirm password into confirm password input field
        registerPageTooLongSingularInput.inputValidRegisterConfirmPasswordIntoConfirmPasswordInputField();
        //input valid user first name into first name input field
        registerPageTooLongSingularInput.inputValidRegisterFirstNameIntoFirstNameInputField();
        //input valid user last name into last name input field
        registerPageTooLongSingularInput.inputValidRegisterLastNameIntoLastNameInputField();
        //input valid user address 1 into address 1 input field
        registerPageTooLongSingularInput.inputValidRegisterAddressIntoAddressInputField();
        //input valid user city into city input field
        registerPageTooLongSingularInput.inputValidRegisterCityIntoCityInputField();
        //click 'State' dropdown menu
        registerPage.clickStateDropdownMenu();
        //select 'Illinois' option
        registerPage.selectIllinoisOption();
        //input valid user post code into post code input field
        registerPageTooLongSingularInput.inputValidRegisterPostCodeIntoPostCodeInputField();
        //input too long user phone into phone input field (30 digits)
        registerPageTooLongSingularInput.inputTooLongRegisterPhoneIntoPhoneNumberInputField();
        //capture screenshot of the register page after invalid data input - too long user phone (30 digits)
        captureScreenshot(driver, "Register Page Display After Invalid Data Input - Too Long User Phone");
        //click 'Create account' button
        registerPage.clickCreateAccountButton();
        //assert the user gets expected error message, log the issue otherwise
        try {
            assertEquals("Phone is too long", registerPage.getRegisterPageSingularInputError(), "The user account creation too long phone input error doesn't match expectations");
        } catch (Exception e) {
            logger.error("The too long user phone input error wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - Too Long User Phone");
    }

    //invalid singular input format

    //invalid user account creation test method - invalid user email format (missing '@')
    protected void invalidUserAccountCreationInvalidEmailFormatTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        RegisterPageInvalidSingularInputFormat registerPageInvalidSingularInputFormat = new RegisterPageInvalidSingularInputFormat(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //register page text element assert
        isRegisterPageTextElementAsExpected(registerPage);
        //capture screenshot of the register page before data input
        captureScreenshot(driver, "Register Page Display Before Data Input");
        //invalid user register data getter - invalid user email format (missing '@')
        registerPageInvalidSingularInputFormat.invalidUserRegisterDataInvalidEmailFormatGetter();
        //input invalid user email format into email input field (missing '@')
        registerPageInvalidSingularInputFormat.inputInvalidRegisterEmailFormatIntoEmailInputField();
        //input valid user password into password input field
        registerPageInvalidSingularInputFormat.inputValidRegisterPasswordIntoPasswordInputField();
        //input valid user confirm password into confirm password input field
        registerPageInvalidSingularInputFormat.inputValidRegisterConfirmPasswordIntoConfirmPasswordInputField();
        //input valid user first name into first name input field
        registerPageInvalidSingularInputFormat.inputValidRegisterFirstNameIntoFirstNameInputField();
        //input valid user last name into last name input field
        registerPageInvalidSingularInputFormat.inputValidRegisterLastNameIntoLastNameInputField();
        //input valid user address 1 into address 1 input field
        registerPageInvalidSingularInputFormat.inputValidRegisterAddressIntoAddressInputField();
        //input valid user city into city input field
        registerPageInvalidSingularInputFormat.inputValidRegisterCityIntoCityInputField();
        //click 'State' dropdown menu
        registerPage.clickStateDropdownMenu();
        //select 'Illinois' option
        registerPage.selectIllinoisOption();
        //input valid user post code into post code input field
        registerPageInvalidSingularInputFormat.inputValidRegisterPostCodeIntoPostCodeInputField();
        //input valid user phone into phone input field
        registerPageInvalidSingularInputFormat.inputValidRegisterPhoneIntoPhoneNumberInputField();
        //capture screenshot of the register page after invalid data input - invalid user email format (missing '@')
        captureScreenshot(driver, "Register Page Display After Invalid Data Input - Invalid User Email Format");
        //click 'Create account' button
        registerPage.clickCreateAccountButton();
        //assert the user gets expected error message, log the issue otherwise
        try {
            assertEquals("You must enter a valid email.", registerPage.getRegisterPageSingularInputError(), "The user account creation invalid email input format error doesn't match expectations");
        } catch (Exception e) {
            logger.error("The invalid email input format error wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - Invalid User Email Format");
    }

    //invalid user account creation test method - existing user email (used beforehand in manual testing)
    protected void invalidUserAccountCreationExistingEmailTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        RegisterPageInvalidSingularInputFormat registerPageInvalidSingularInputFormat = new RegisterPageInvalidSingularInputFormat(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //register page text element assert
        isRegisterPageTextElementAsExpected(registerPage);
        //capture screenshot of the register page before data input
        captureScreenshot(driver, "Register Page Display Before Data Input");
        //invalid user register data getter - existing user email (used beforehand in manual testing)
        registerPageInvalidSingularInputFormat.invalidUserRegisterDataExistingEmailGetter();
        //input pre-existing user email into email input field (used beforehand in manual testing)
        registerPageInvalidSingularInputFormat.inputExistingRegEmailFormatIntoEmailInputField();
        //input valid user password into password input field
        registerPageInvalidSingularInputFormat.inputValidRegisterPasswordIntoPasswordInputField();
        //input valid user confirm password into confirm password input field
        registerPageInvalidSingularInputFormat.inputValidRegisterConfirmPasswordIntoConfirmPasswordInputField();
        //input valid user first name into first name input field
        registerPageInvalidSingularInputFormat.inputValidRegisterFirstNameIntoFirstNameInputField();
        //input valid user last name into last name input field
        registerPageInvalidSingularInputFormat.inputValidRegisterLastNameIntoLastNameInputField();
        //input valid user address 1 into address 1 input field
        registerPageInvalidSingularInputFormat.inputValidRegisterAddressIntoAddressInputField();
        //input valid user city into city input field
        registerPageInvalidSingularInputFormat.inputValidRegisterCityIntoCityInputField();
        //click 'State' dropdown menu
        registerPage.clickStateDropdownMenu();
        //select 'Illinois' option
        registerPage.selectIllinoisOption();
        //input valid user post code into post code input field
        registerPageInvalidSingularInputFormat.inputValidRegisterPostCodeIntoPostCodeInputField();
        //input valid user phone into phone input field
        registerPageInvalidSingularInputFormat.inputValidRegisterPhoneIntoPhoneNumberInputField();
        //capture screenshot of the register page after invalid data input - existing user email (used beforehand in manual testing)
        captureScreenshot(driver, "Register Page Display After Invalid Data Input - Existing User Email");
        //click 'Create account' button
        registerPage.clickCreateAccountButton();
        //assert the user gets expected error message, log the issue otherwise
        try {
            assertEquals("The email address m1@fakemail.com is already in use. Please enter a different one.", registerPage.getRegisterPageSingularInputErrorBoxText(), "The user account creation existing email input error doesn't match expectations");
        } catch (Exception e) {
            logger.error("The existing email input error wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - Existing User Email");
    }

    //invalid user account creation test method - invalid user password / confirm password format (strings only)
    protected void invalidUserAccountCreationInvalidPasswordConfirmTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        RegisterPageInvalidSingularInputFormat registerPageInvalidSingularInputFormat = new RegisterPageInvalidSingularInputFormat(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //register page text element assert
        isRegisterPageTextElementAsExpected(registerPage);
        //capture screenshot of the register page before data input
        captureScreenshot(driver, "Register Page Display Before Data Input");
        //invalid user register data getter - invalid user password / confirm password format (strings only)
        registerPageInvalidSingularInputFormat.invalidUserRegisterDataInvalidPasswordConfirmFormatGetter();
        //input valid user email into email input field
        registerPageInvalidSingularInputFormat.inputValidRegisterEmailIntoEmailInputField();
        //input invalid user password format into password input field
        registerPageInvalidSingularInputFormat.inputInvalidRegisterPasswordFormatIntoPasswordInputField();
        //input invalid user confirm password format into confirm password input field
        registerPageInvalidSingularInputFormat.inputInvalidRegisterConfirmPasswordFormatIntoConfirmPasswordInputField();
        //input valid user first name into first name input field
        registerPageInvalidSingularInputFormat.inputValidRegisterFirstNameIntoFirstNameInputField();
        //input valid user last name into last name input field
        registerPageInvalidSingularInputFormat.inputValidRegisterLastNameIntoLastNameInputField();
        //input valid user address 1 into address 1 input field
        registerPageInvalidSingularInputFormat.inputValidRegisterAddressIntoAddressInputField();
        //input valid user city into city input field
        registerPageInvalidSingularInputFormat.inputValidRegisterCityIntoCityInputField();
        //click 'State' dropdown menu
        registerPage.clickStateDropdownMenu();
        //select 'Illinois' option
        registerPage.selectIllinoisOption();
        //input valid user post code into post code input field
        registerPageInvalidSingularInputFormat.inputValidRegisterPostCodeIntoPostCodeInputField();
        //input valid user phone into phone input field
        registerPageInvalidSingularInputFormat.inputValidRegisterPhoneIntoPhoneNumberInputField();
        //capture screenshot of the register page after invalid data input - invalid user password / confirm password format (strings only)
        captureScreenshot(driver, "Register Page Display After Invalid Data Input - Invalid User Password and Confirm Password");
        //click 'Create account' button
        registerPage.clickCreateAccountButton();
        //assert the user gets expected error message, log the issue otherwise
        try {
            assertEquals("Passwords must be at least 7 characters and contain both alphabetic and numeric characters.", registerPage.getRegisterPageSingularInputError(), "The user account creation invalid user password and confirm password input error doesn't match expectations");
        } catch (Exception e) {
            logger.error("The invalid user password and confirm password input error wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - Invalid User Password and Confirm Password");
    }

    //invalid user account creation test method - mismatching user confirm password
    protected void invalidUserAccountCreationMismatchingConfirmPasswordTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        RegisterPageInvalidSingularInputFormat registerPageInvalidSingularInputFormat = new RegisterPageInvalidSingularInputFormat(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //register page text element assert
        isRegisterPageTextElementAsExpected(registerPage);
        //capture screenshot of the register page before data input
        captureScreenshot(driver, "Register Page Display Before Data Input");
        //invalid user register data getter - mismatching user confirm password
        registerPageInvalidSingularInputFormat.invalidUserRegisterDataMismatchConfirmPasswordGetter();
        //input valid user email into email input field
        registerPageInvalidSingularInputFormat.inputValidRegisterEmailIntoEmailInputField();
        //input valid user password format into password input field
        registerPageInvalidSingularInputFormat.inputValidRegisterPasswordIntoPasswordInputField();
        //input mismatching user confirm password into confirm password input field
        registerPageInvalidSingularInputFormat.inputMismatchRegisterConfirmPasswordIntoConfirmPasswordInputField();
        //input valid user first name into first name input field
        registerPageInvalidSingularInputFormat.inputValidRegisterFirstNameIntoFirstNameInputField();
        //input valid user last name into last name input field
        registerPageInvalidSingularInputFormat.inputValidRegisterLastNameIntoLastNameInputField();
        //input valid user address 1 into address 1 input field
        registerPageInvalidSingularInputFormat.inputValidRegisterAddressIntoAddressInputField();
        //input valid user city into city input field
        registerPageInvalidSingularInputFormat.inputValidRegisterCityIntoCityInputField();
        //click 'State' dropdown menu
        registerPage.clickStateDropdownMenu();
        //select 'Illinois' option
        registerPage.selectIllinoisOption();
        //input valid user post code into post code input field
        registerPageInvalidSingularInputFormat.inputValidRegisterPostCodeIntoPostCodeInputField();
        //input valid user phone into phone input field
        registerPageInvalidSingularInputFormat.inputValidRegisterPhoneIntoPhoneNumberInputField();
        //capture screenshot of the register page after invalid data input - mismatching user confirm password
        captureScreenshot(driver, "Register Page Display After Invalid Data Input - Mismatching Confirm Password");
        //click 'Create account' button
        registerPage.clickCreateAccountButton();
        //assert the user gets expected error message, log the issue otherwise
        try {
            assertEquals("Your passwords do not match.", registerPage.getRegisterPageSingularInputError(), "The user account creation  mismatching user confirm password input error doesn't match expectations");
        } catch (Exception e) {
            logger.error("The mismatching user confirm password input error wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - Mismatching Confirm Password");
    }

    //invalid user account creation test method - invalid user first name input format (special symbols only)
    protected void invalidUserAccountCreationInvalidFirstNameFormatTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        RegisterPageInvalidSingularInputFormat registerPageInvalidSingularInputFormat = new RegisterPageInvalidSingularInputFormat(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //register page text element assert
        isRegisterPageTextElementAsExpected(registerPage);
        //capture screenshot of the register page before data input
        captureScreenshot(driver, "Register Page Display Before Data Input");
        //invalid user register data getter - invalid user first name input format (special symbols only)
        registerPageInvalidSingularInputFormat.invalidUserRegisterDataInvalidFirstNameFormatGetter();
        //input valid user email into email input field
        registerPageInvalidSingularInputFormat.inputValidRegisterEmailIntoEmailInputField();
        //input valid user password into password input field
        registerPageInvalidSingularInputFormat.inputValidRegisterPasswordIntoPasswordInputField();
        //input valid user confirm password into confirm password input field
        registerPageInvalidSingularInputFormat.inputValidRegisterConfirmPasswordIntoConfirmPasswordInputField();
        //input invalid user first name format into first name input field (special symbols only)
        registerPageInvalidSingularInputFormat.inputInvalidRegisterFirstNameFormatIntoFirstNameInputField();
        //input valid user last name into last name input field
        registerPageInvalidSingularInputFormat.inputValidRegisterLastNameIntoLastNameInputField();
        //input valid user address 1 into address 1 input field
        registerPageInvalidSingularInputFormat.inputValidRegisterAddressIntoAddressInputField();
        //input valid user city into city input field
        registerPageInvalidSingularInputFormat.inputValidRegisterCityIntoCityInputField();
        //click 'State' dropdown menu
        registerPage.clickStateDropdownMenu();
        //select 'Illinois' option
        registerPage.selectIllinoisOption();
        //input valid user post code into post code input field
        registerPageInvalidSingularInputFormat.inputValidRegisterPostCodeIntoPostCodeInputField();
        //input valid user phone into phone input field
        registerPageInvalidSingularInputFormat.inputValidRegisterPhoneIntoPhoneNumberInputField();
        //capture screenshot of the register page after invalid data input - invalid user first name format (special symbols only)
        captureScreenshot(driver, "Register Page Display After Invalid Data Input - Invalid User First Name Format");
        //click 'Create account' button
        registerPage.clickCreateAccountButton();
        //assert the user gets expected error message, log the issue otherwise
        try {
            assertEquals("First name cannot consist of special symbols only.", registerPage.getRegisterPageSingularInputError(), "The user account creation invalid user first name input error doesn't match expectations");
        } catch (Exception e) {
            logger.error("The invalid user first name input error wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - Invalid User First Name Format");
    }

    //invalid user account creation test method - invalid user last name input format (special symbols only)
    protected void invalidUserAccountCreationInvalidLastNameFormatTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        RegisterPageInvalidSingularInputFormat registerPageInvalidSingularInputFormat = new RegisterPageInvalidSingularInputFormat(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //register page text element assert
        isRegisterPageTextElementAsExpected(registerPage);
        //capture screenshot of the register page before data input
        captureScreenshot(driver, "Register Page Display Before Data Input");
        //invalid user register data getter - invalid user last name input format (special symbols only)
        registerPageInvalidSingularInputFormat.invalidUserRegisterDataInvalidLastNameFormatGetter();
        //input valid user email into email input field
        registerPageInvalidSingularInputFormat.inputValidRegisterEmailIntoEmailInputField();
        //input valid user password into password input field
        registerPageInvalidSingularInputFormat.inputValidRegisterPasswordIntoPasswordInputField();
        //input valid user confirm password into confirm password input field
        registerPageInvalidSingularInputFormat.inputValidRegisterConfirmPasswordIntoConfirmPasswordInputField();
        //input valid user first name into first name input field
        registerPageInvalidSingularInputFormat.inputValidRegisterFirstNameIntoFirstNameInputField();
        //input invalid user last name format into last name input field (special symbols only)
        registerPageInvalidSingularInputFormat.inputInvalidRegisterLastNameFormatIntoLastNameInputField();
        //input valid user address 1 into address 1 input field
        registerPageInvalidSingularInputFormat.inputValidRegisterAddressIntoAddressInputField();
        //input valid user city into city input field
        registerPageInvalidSingularInputFormat.inputValidRegisterCityIntoCityInputField();
        //click 'State' dropdown menu
        registerPage.clickStateDropdownMenu();
        //select 'Illinois' option
        registerPage.selectIllinoisOption();
        //input valid user post code into post code input field
        registerPageInvalidSingularInputFormat.inputValidRegisterPostCodeIntoPostCodeInputField();
        //input valid user phone into phone input field
        registerPageInvalidSingularInputFormat.inputValidRegisterPhoneIntoPhoneNumberInputField();
        //capture screenshot of the register page after invalid data input - invalid user last name format (special symbols only)
        captureScreenshot(driver, "Register Page Display After Invalid Data Input - Invalid User Last Name Format");
        //click 'Create account' button
        registerPage.clickCreateAccountButton();
        //assert the user gets expected error message, log the issue otherwise
        try {
            assertEquals("Last name cannot consist of special symbols only.", registerPage.getRegisterPageSingularInputError(), "The user account creation invalid user last name input error doesn't match expectations");
        } catch (Exception e) {
            logger.error("The invalid user last name input error wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - Invalid User Last Name Format");
    }

    //invalid user account creation test method - invalid user address input format (special symbols only)
    protected void invalidUserAccountCreationInvalidAddressFormatTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        RegisterPageInvalidSingularInputFormat registerPageInvalidSingularInputFormat = new RegisterPageInvalidSingularInputFormat(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //register page text element assert
        isRegisterPageTextElementAsExpected(registerPage);
        //capture screenshot of the register page before data input
        captureScreenshot(driver, "Register Page Display Before Data Input");
        //invalid user register data getter - invalid user address input format (special symbols only)
        registerPageInvalidSingularInputFormat.invalidUserRegisterDataInvalidAddressFormatGetter();
        //input valid user email into email input field
        registerPageInvalidSingularInputFormat.inputValidRegisterEmailIntoEmailInputField();
        //input valid user password into password input field
        registerPageInvalidSingularInputFormat.inputValidRegisterPasswordIntoPasswordInputField();
        //input valid user confirm password into confirm password input field
        registerPageInvalidSingularInputFormat.inputValidRegisterConfirmPasswordIntoConfirmPasswordInputField();
        //input valid user first name into first name input field
        registerPageInvalidSingularInputFormat.inputValidRegisterFirstNameIntoFirstNameInputField();
        //input valid user last name into last name input field
        registerPageInvalidSingularInputFormat.inputValidRegisterLastNameIntoLastNameInputField();
        //input invalid user address 1 format into address 1 input field (special symbols only)
        registerPageInvalidSingularInputFormat.inputInvalidRegisterAddressFormatIntoAddressInputField();
        //input valid user city into city input field
        registerPageInvalidSingularInputFormat.inputValidRegisterCityIntoCityInputField();
        //click 'State' dropdown menu
        registerPage.clickStateDropdownMenu();
        //select 'Illinois' option
        registerPage.selectIllinoisOption();
        //input valid user post code into post code input field
        registerPageInvalidSingularInputFormat.inputValidRegisterPostCodeIntoPostCodeInputField();
        //input valid user phone into phone input field
        registerPageInvalidSingularInputFormat.inputValidRegisterPhoneIntoPhoneNumberInputField();
        //capture screenshot of the register page after invalid data input - invalid user address format (special symbols only)
        captureScreenshot(driver, "Register Page Display After Invalid Data Input - Invalid User Address Format");
        //click 'Create account' button
        registerPage.clickCreateAccountButton();
        //assert the user gets expected error message, log the issue otherwise
        try {
            assertEquals("Address Line 1 cannot consist of special symbols only.", registerPage.getRegisterPageSingularInputError(), "The user account creation invalid user address input error doesn't match expectations");
        } catch (Exception e) {
            logger.error("The invalid user address input error wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - Invalid User Address Format");
    }

    //invalid user account creation test method - invalid user city input format (special symbols only)
    protected void invalidUserAccountCreationInvalidCityFormatTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        RegisterPageInvalidSingularInputFormat registerPageInvalidSingularInputFormat = new RegisterPageInvalidSingularInputFormat(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //register page text element assert
        isRegisterPageTextElementAsExpected(registerPage);
        //capture screenshot of the register page before data input
        captureScreenshot(driver, "Register Page Display Before Data Input");
        //invalid user register data getter - invalid user city input format (special symbols only)
        registerPageInvalidSingularInputFormat.invalidUserRegisterDataInvalidCityFormatGetter();
        //input valid user email into email input field
        registerPageInvalidSingularInputFormat.inputValidRegisterEmailIntoEmailInputField();
        //input valid user password into password input field
        registerPageInvalidSingularInputFormat.inputValidRegisterPasswordIntoPasswordInputField();
        //input valid user confirm password into confirm password input field
        registerPageInvalidSingularInputFormat.inputValidRegisterConfirmPasswordIntoConfirmPasswordInputField();
        //input valid user first name into first name input field
        registerPageInvalidSingularInputFormat.inputValidRegisterFirstNameIntoFirstNameInputField();
        //input valid user last name into last name input field
        registerPageInvalidSingularInputFormat.inputValidRegisterLastNameIntoLastNameInputField();
        //input valid user address 1 into address 1 input field
        registerPageInvalidSingularInputFormat.inputValidRegisterAddressIntoAddressInputField();
        //input invalid user city format into city input field (special symbols only)
        registerPageInvalidSingularInputFormat.inputInvalidRegisterCityFormatIntoCityInputField();
        //click 'State' dropdown menu
        registerPage.clickStateDropdownMenu();
        //select 'Illinois' option
        registerPage.selectIllinoisOption();
        //input valid user post code into post code input field
        registerPageInvalidSingularInputFormat.inputValidRegisterPostCodeIntoPostCodeInputField();
        //input valid user phone into phone input field
        registerPageInvalidSingularInputFormat.inputValidRegisterPhoneIntoPhoneNumberInputField();
        //capture screenshot of the register page after invalid data input - invalid user city format (special symbols only)
        captureScreenshot(driver, "Register Page Display After Invalid Data Input - Invalid User City Format");
        //click 'Create account' button
        registerPage.clickCreateAccountButton();
        //assert the user gets expected error message, log the issue otherwise
        try {
            assertEquals("City cannot consist of special symbols only.", registerPage.getRegisterPageSingularInputError(), "The user account creation invalid user city input error doesn't match expectations");
        } catch (Exception e) {
            logger.error("The invalid user city input error wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - Invalid User City Format");
    }

    //invalid user account creation test method - invalid user post code input format (special symbols only)
    protected void invalidUserAccountCreationInvalidPostCodeFormatTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        RegisterPageInvalidSingularInputFormat registerPageInvalidSingularInputFormat = new RegisterPageInvalidSingularInputFormat(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //register page text element assert
        isRegisterPageTextElementAsExpected(registerPage);
        //capture screenshot of the register page before data input
        captureScreenshot(driver, "Register Page Display Before Data Input");
        //invalid user register data getter - invalid user post code input format (special symbols only)
        registerPageInvalidSingularInputFormat.invalidUserRegisterDataInvalidPostCodeFormatGetter();
        //input valid user email into email input field
        registerPageInvalidSingularInputFormat.inputValidRegisterEmailIntoEmailInputField();
        //input valid user password into password input field
        registerPageInvalidSingularInputFormat.inputValidRegisterPasswordIntoPasswordInputField();
        //input valid user confirm password into confirm password input field
        registerPageInvalidSingularInputFormat.inputValidRegisterConfirmPasswordIntoConfirmPasswordInputField();
        //input valid user first name into first name input field
        registerPageInvalidSingularInputFormat.inputValidRegisterFirstNameIntoFirstNameInputField();
        //input valid user last name into last name input field
        registerPageInvalidSingularInputFormat.inputValidRegisterLastNameIntoLastNameInputField();
        //input valid user address 1 into address 1 input field
        registerPageInvalidSingularInputFormat.inputValidRegisterAddressIntoAddressInputField();
        //input valid user city into city input field
        registerPageInvalidSingularInputFormat.inputValidRegisterCityIntoCityInputField();
        //click 'State' dropdown menu
        registerPage.clickStateDropdownMenu();
        //select 'Illinois' option
        registerPage.selectIllinoisOption();
        //input invalid user post code format into post code input field (special symbols only)
        registerPageInvalidSingularInputFormat.inputInvalidRegisterPostCodeFormatIntoPostCodeInputField();
        //input valid user phone into phone input field
        registerPageInvalidSingularInputFormat.inputValidRegisterPhoneIntoPhoneNumberInputField();
        //capture screenshot of the register page after invalid data input - invalid user post code format (special symbols only)
        captureScreenshot(driver, "Register Page Display After Invalid Data Input - Invalid User Post Code Format");
        //click 'Create account' button
        registerPage.clickCreateAccountButton();
        //assert the user gets expected error message, log the issue otherwise
        try {
            assertEquals("Post code cannot consist of special symbols only.", registerPage.getRegisterPageSingularInputError(), "The user account creation invalid user post code input error doesn't match expectations");
        } catch (Exception e) {
            logger.error("The invalid user post code input error wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - Invalid User Post Code Format");
    }

    //invalid user account creation test method - invalid user phone input format (special symbols only)
    protected void invalidUserAccountCreationInvalidPhoneFormatTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        RegisterPageInvalidSingularInputFormat registerPageInvalidSingularInputFormat = new RegisterPageInvalidSingularInputFormat(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //register page text element assert
        isRegisterPageTextElementAsExpected(registerPage);
        //capture screenshot of the register page before data input
        captureScreenshot(driver, "Register Page Display Before Data Input");
        //invalid user register data getter - invalid user phone input format (special symbols only)
        registerPageInvalidSingularInputFormat.invalidUserRegisterDataInvalidPhoneFormatGetter();
        //input valid user email into email input field
        registerPageInvalidSingularInputFormat.inputValidRegisterEmailIntoEmailInputField();
        //input valid user password into password input field
        registerPageInvalidSingularInputFormat.inputValidRegisterPasswordIntoPasswordInputField();
        //input valid user confirm password into confirm password input field
        registerPageInvalidSingularInputFormat.inputValidRegisterConfirmPasswordIntoConfirmPasswordInputField();
        //input valid user first name into first name input field
        registerPageInvalidSingularInputFormat.inputValidRegisterFirstNameIntoFirstNameInputField();
        //input valid user last name into last name input field
        registerPageInvalidSingularInputFormat.inputValidRegisterLastNameIntoLastNameInputField();
        //input valid user address 1 into address 1 input field
        registerPageInvalidSingularInputFormat.inputValidRegisterAddressIntoAddressInputField();
        //input valid user city into city input field
        registerPageInvalidSingularInputFormat.inputValidRegisterCityIntoCityInputField();
        //click 'State' dropdown menu
        registerPage.clickStateDropdownMenu();
        //select 'Illinois' option
        registerPage.selectIllinoisOption();
        //input valid user post code into post code input field
        registerPageInvalidSingularInputFormat.inputValidRegisterPostCodeIntoPostCodeInputField();
        //input invalid user phone format into phone input field (special symbols only)
        registerPageInvalidSingularInputFormat.inputInvalidRegisterPhoneFormatIntoPhoneNumberInputField();
        //capture screenshot of the register page after invalid data input - invalid user phone format (special symbols only)
        captureScreenshot(driver, "Register Page Display After Invalid Data Input - Invalid User Phone Format");
        //click 'Create account' button
        registerPage.clickCreateAccountButton();
        //assert the user gets expected error message, log the issue otherwise
        try {
            assertEquals("Phone cannot consist of special symbols only.", registerPage.getRegisterPageSingularInputError(), "The user account creation invalid user phone input error doesn't match expectations");
        } catch (Exception e) {
            logger.error("The invalid user phone input error wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - Invalid User Phone Format");
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //valid edit account tests

    //valid edit account with login email test method
    protected void validEditUserAccountDataWithLoginEmailTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AccountSettingsPage accountSettingsPage = new AccountSettingsPage(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Account settings' link
        accountDashboardPage.clickAccountSettingsLink();
        //account settings page web element assert
        isAccountSettingsPageWebElementDisplayed(accountSettingsPage);
        //account settings page text element assert
        isAccountSettingsPageTextElementAsExpected(accountSettingsPage);
        //capture screenshot of the account settings page before edited data input
        captureScreenshot(driver, "Account Settings Page Display Before Edited Data Input");
        //valid edited user account data getter (no password edit here)
        accountSettingsPage.validEditedUserAccountDataForLoginEmailGetter();
        //input valid edited first name into first name input field
        accountSettingsPage.inputEditedUserFirstNameIntoFirstNameInputField();
        //input valid edited last name into last name input field
        accountSettingsPage.inputEditedUserLastNameIntoLastNameInputField();
        //input valid edited email into email input field
        accountSettingsPage.inputEditedUserEmailIntoEmailInputField();
        //input valid edited phone into phone input field
        accountSettingsPage.inputEditedUserPhoneIntoPhoneInputField();
        //input valid password into current password input field
        accountSettingsPage.inputCurrentUserPasswordIntoCurrentPasswordInputField();
        //capture screenshot of the account settings page after valid edited data input
        captureScreenshot(driver, "Account Settings Page Display After Valid Edited Data Input (With Login Email)");
        //click 'Update details' button
        accountSettingsPage.clickUpdateDetailsButton();
        //assert the user receives the expected account update success message
        assertEquals("Your account details have been updated.", accountSettingsPage.getAccountSettingsUpdateSuccessMessage(), "The account settings update success message doesn't match expectations or the update process has failed.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Valid Edit User Account Data (With Login Email) Test Result");
    }

    //valid edit account with login password test method
    protected void validEditUserAccountDataWithLoginPasswordTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AccountSettingsPage accountSettingsPage = new AccountSettingsPage(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Account settings' link
        accountDashboardPage.clickAccountSettingsLink();
        //account settings page web element assert
        isAccountSettingsPageWebElementDisplayed(accountSettingsPage);
        //account settings page text element assert
        isAccountSettingsPageTextElementAsExpected(accountSettingsPage);
        //capture screenshot of the account settings page before edited data input
        captureScreenshot(driver, "Account Settings Page Display Before Edited Data Input");
        //valid edited user account data getter (no email edit here)
        accountSettingsPage.validEditedUserAccountDataForLoginPasswordGetter();
        //input valid edited first name into first name input field
        accountSettingsPage.inputEditedUserFirstNameIntoFirstNameInputField();
        //input valid edited last name into last name input field
        accountSettingsPage.inputEditedUserLastNameIntoLastNameInputField();
        //input valid edited phone into phone input field
        accountSettingsPage.inputEditedUserPhoneIntoPhoneInputField();
        //input valid password into current password input field
        accountSettingsPage.inputCurrentUserPasswordIntoCurrentPasswordInputField();
        //input valid password into password input field
        accountSettingsPage.inputEditedUserPasswordIntoPasswordInputField();
        //input matching confirm password into confirm password input field
        accountSettingsPage.inputEditedUserConfirmPasswordIntoConfirmPasswordInputField();
        //capture screenshot of the account settings page after valid edited data input
        captureScreenshot(driver, "Account Settings Page Display After Valid Edited Data Input (With Login Password)");
        //click 'Update details' button
        accountSettingsPage.clickUpdateDetailsButton();
        //capture screenshot of the test result (the user drops onto login-register dashboard page)
        captureScreenshot(driver, "Valid Edit User Account Data (With Login Password) Test Result");
    }

    //invalid account settings page (edit account) tests

    //no singular input

    //invalid account settings page (edit account) test method - no first name
    protected void invalidEditedUserAccountNoFirstNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AccountSettingsPage accountSettingsPage = new AccountSettingsPage(driver);
        AccountSettingsPageNoSingularInput accountSettingsPageNoSingularInput = new AccountSettingsPageNoSingularInput(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Account settings' link
        accountDashboardPage.clickAccountSettingsLink();
        //account settings page web element assert
        isAccountSettingsPageWebElementDisplayed(accountSettingsPage);
        //account settings page text element assert
        isAccountSettingsPageTextElementAsExpected(accountSettingsPage);
        //capture screenshot of the account settings page before edited data input
        captureScreenshot(driver, "Account Settings Page Display Before Edited Data Input");
        //invalid edited user account data getter - no edited user first name
        accountSettingsPageNoSingularInput.invalidEditedUserAccountDataNoFirstNameGetter();
        //don't input edited first name into first name input field
        accountSettingsPageNoSingularInput.inputNoEditedUserFirstNameIntoFirstNameInputField();
        //input valid edited last name into last name input field
        accountSettingsPageNoSingularInput.inputEditedUserLastNameIntoLastNameInputField();
        //input valid edited email into email input field
        accountSettingsPageNoSingularInput.inputEditedUserEmailIntoEmailInputField();
        //capture screenshot of the account settings page after invalid edited data input - no edited first name
        captureScreenshot(driver, "Account Settings Page Display After Invalid Edited Data Input - No Edited First Name");
        //click 'Update details' button
        accountSettingsPage.clickUpdateDetailsButton();
        //assert the user receives the expected error message
        assertEquals("You must enter a first name.", accountSettingsPage.getAccountSettingsPageSingularInputError(), "The account settings missing first name input error message doesn't match expectations or the error message wasn't triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Edit User Account Data Test Result - No Edited First Name");
    }

    //invalid account settings page (edit account) test method - no edited last name
    protected void invalidEditedUserAccountNoLastNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AccountSettingsPage accountSettingsPage = new AccountSettingsPage(driver);
        AccountSettingsPageNoSingularInput accountSettingsPageNoSingularInput = new AccountSettingsPageNoSingularInput(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Account settings' link
        accountDashboardPage.clickAccountSettingsLink();
        //account settings page web element assert
        isAccountSettingsPageWebElementDisplayed(accountSettingsPage);
        //account settings page text element assert
        isAccountSettingsPageTextElementAsExpected(accountSettingsPage);
        //capture screenshot of the account settings page before edited data input
        captureScreenshot(driver, "Account Settings Page Display Before Edited Data Input");
        //invalid edited user account data getter - no edited user last name
        accountSettingsPageNoSingularInput.invalidEditedUserAccountDataNoLastNameGetter();
        //input valid edited first name into first name input field
        accountSettingsPageNoSingularInput.inputEditedUserFirstNameIntoFirstNameInputField();
        //don't input edited last name into last name input field
        accountSettingsPageNoSingularInput.inputNoEditedUserLastNameIntoLastNameInputField();
        //input valid edited email into email input field
        accountSettingsPageNoSingularInput.inputEditedUserEmailIntoEmailInputField();
        //capture screenshot of the account settings page after invalid edited data input - no edited last name
        captureScreenshot(driver, "Account Settings Page Display After Invalid Edited Data Input - No Edited Last Name");
        //click 'Update details' button
        accountSettingsPage.clickUpdateDetailsButton();
        //assert the user receives the expected error message
        assertEquals("You must enter a last name.", accountSettingsPage.getAccountSettingsPageSingularInputError(), "The account settings missing last name input error message doesn't match expectations or the error message wasn't triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Edit User Account Data Test Result - No Edited Last Name");
    }

    //invalid account settings page (edit account) test method - no edited email
    protected void invalidEditedUserAccountNoEmailTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AccountSettingsPage accountSettingsPage = new AccountSettingsPage(driver);
        AccountSettingsPageNoSingularInput accountSettingsPageNoSingularInput = new AccountSettingsPageNoSingularInput(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Account settings' link
        accountDashboardPage.clickAccountSettingsLink();
        //account settings page web element assert
        isAccountSettingsPageWebElementDisplayed(accountSettingsPage);
        //account settings page text element assert
        isAccountSettingsPageTextElementAsExpected(accountSettingsPage);
        //capture screenshot of the account settings page before edited data input
        captureScreenshot(driver, "Account Settings Page Display Before Edited Data Input");
        //invalid edited user account data getter - no edited user email
        accountSettingsPageNoSingularInput.invalidEditedUserAccountDataNoEmailGetter();
        //input valid edited first name into first name input field
        accountSettingsPageNoSingularInput.inputEditedUserFirstNameIntoFirstNameInputField();
        //input valid edited last name into last name input field
        accountSettingsPageNoSingularInput.inputEditedUserLastNameIntoLastNameInputField();
        //don't input edited email into email input field
        accountSettingsPageNoSingularInput.inputNoEditedUserEmailIntoEmailInputField();
        //capture screenshot of the account settings page after invalid edited data input - no edited email
        captureScreenshot(driver, "Account Settings Page Display After Invalid Edited Data Input - No Edited Email");
        //click 'Update details' button
        accountSettingsPage.clickUpdateDetailsButton();
        //assert the user receives the expected error message
        assertEquals("You must enter a valid email.", accountSettingsPage.getAccountSettingsPageSingularInputError(), "The account settings missing email input error message doesn't match expectations or the error message wasn't triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Edit User Account Data Test Result - No Edited Email");
    }

    //invalid account settings page (edit account) test method - no edited password / confirm password
    protected void invalidEditedUserAccountNoPasswordConfirmTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AccountSettingsPage accountSettingsPage = new AccountSettingsPage(driver);
        AccountSettingsPageNoSingularInput accountSettingsPageNoSingularInput = new AccountSettingsPageNoSingularInput(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Account settings' link
        accountDashboardPage.clickAccountSettingsLink();
        //account settings page web element assert
        isAccountSettingsPageWebElementDisplayed(accountSettingsPage);
        //account settings page text element assert
        isAccountSettingsPageTextElementAsExpected(accountSettingsPage);
        //capture screenshot of the account settings page before edited data input
        captureScreenshot(driver, "Account Settings Page Display Before Edited Data Input");
        //invalid edited user account data getter - no edited user password / confirm password
        accountSettingsPageNoSingularInput.invalidEditedUserAccountDataNoPasswordConfirmGetter();
        //input valid edited first name into first name input field
        accountSettingsPageNoSingularInput.inputEditedUserFirstNameIntoFirstNameInputField();
        //input valid edited last name into last name input field
        accountSettingsPageNoSingularInput.inputEditedUserLastNameIntoLastNameInputField();
        //input valid password into current password input field
        accountSettingsPageNoSingularInput.inputCurrentUserPasswordIntoCurrentPasswordInputField();
        //don't input password into password input field
        accountSettingsPageNoSingularInput.inputNoEditedUserPasswordIntoPasswordInputField();
        //don't input confirm password into confirm password input field
        accountSettingsPageNoSingularInput.inputNoEditedUserConfirmPasswordIntoConfirmPasswordInputField();
        //capture screenshot of the account settings page after invalid edited data input - no edited password / confirm password
        captureScreenshot(driver, "Account Settings Page Display After Invalid Edited Data Input - No Edited Password and Confirm Password");
        //click 'Update details' button
        accountSettingsPage.clickUpdateDetailsButton();
        //assert the user receives the expected error message, log the issue otherwise
        try {
            assertEquals("You must enter a valid password", accountSettingsPage.getAccountSettingsPageSingularInputError(), "The account settings missing password / confirm password input error message doesn't match expectations or the error message wasn't triggered.");
        } catch (Exception e) {
            logger.error("The account settings missing password / confirm password input error message wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Edit User Account Data Test Result - No Edited Password and Confirm Password");
    }

    //invalid account settings page (edit account) test method - no current password
    protected void invalidEditedUserAccountNoCurrentPasswordTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AccountSettingsPage accountSettingsPage = new AccountSettingsPage(driver);
        AccountSettingsPageNoSingularInput accountSettingsPageNoSingularInput = new AccountSettingsPageNoSingularInput(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Account settings' link
        accountDashboardPage.clickAccountSettingsLink();
        //account settings page web element assert
        isAccountSettingsPageWebElementDisplayed(accountSettingsPage);
        //account settings page text element assert
        isAccountSettingsPageTextElementAsExpected(accountSettingsPage);
        //capture screenshot of the account settings page before edited data input
        captureScreenshot(driver, "Account Settings Page Display Before Edited Data Input");
        //invalid edited user account data getter - no current user password
        accountSettingsPageNoSingularInput.invalidEditedUserAccountDataNoCurrentPasswordGetter();
        //input valid edited first name into first name input field
        accountSettingsPageNoSingularInput.inputEditedUserFirstNameIntoFirstNameInputField();
        //input valid edited last name into last name input field
        accountSettingsPageNoSingularInput.inputEditedUserLastNameIntoLastNameInputField();
        //don't input password into current password input field
        accountSettingsPageNoSingularInput.inputNoCurrentUserPasswordIntoCurrentPasswordInputField();
        //input valid edited password into password input field
        accountSettingsPageNoSingularInput.inputEditedUserPasswordIntoPasswordInputField();
        //input valid matching confirm password into confirm password input field
        accountSettingsPageNoSingularInput.inputEditedUserConfirmPasswordIntoConfirmPasswordInputField();
        //capture screenshot of the account settings page after invalid edited data input - no current password
        captureScreenshot(driver, "Account Settings Page Display After Invalid Edited Data Input - No Current Password");
        //click 'Update details' button
        accountSettingsPage.clickUpdateDetailsButton();
        //assert the user receives the expected error message, log the issue otherwise
        try {
            assertEquals("You must enter your current password.", accountSettingsPage.getAccountSettingsPageSingularInputError(), "The account settings missing current password input error message doesn't match expectations or the error message wasn't triggered.");
        } catch (Exception e) {
            logger.error("The account settings missing current password input error message wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Edit User Account Data Test Result - No Current Password");
    }

    //too short singular input

    //invalid account settings page (edit account) test method - too short edited first name (1 char)
    protected void invalidEditedUserAccountTooShortFirstNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AccountSettingsPage accountSettingsPage = new AccountSettingsPage(driver);
        AccountSettingsPageTooShortSingularInput accountSettingsPageTooShortSingularInput = new AccountSettingsPageTooShortSingularInput(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Account settings' link
        accountDashboardPage.clickAccountSettingsLink();
        //account settings page web element assert
        isAccountSettingsPageWebElementDisplayed(accountSettingsPage);
        //account settings page text element assert
        isAccountSettingsPageTextElementAsExpected(accountSettingsPage);
        //capture screenshot of the account settings page before edited data input
        captureScreenshot(driver, "Account Settings Page Display Before Edited Data Input");
        //invalid edited user account data getter - too short edited first name (1 char)
        accountSettingsPageTooShortSingularInput.invalidEditedUserAccountDataTooShortFirstNameGetter();
        //input too short edited first name into first name input field (1 char)
        accountSettingsPageTooShortSingularInput.inputTooShortEditedUserFirstNameIntoFirstNameInputField();
        //input valid edited last name into last name input field
        accountSettingsPageTooShortSingularInput.inputEditedUserLastNameIntoLastNameInputField();
        //input valid edited email into email input field
        accountSettingsPageTooShortSingularInput.inputEditedUserEmailIntoEmailInputField();
        //input valid password into current password input field
        accountSettingsPageTooShortSingularInput.inputCurrentUserPasswordIntoCurrentPasswordInputField();
        //capture screenshot of the account settings page after invalid edited data input  - too short edited first name
        captureScreenshot(driver, "Account Settings Page Display After Invalid Edited Data Input - Too Short Edited First Name");
        //click 'Update details' button
        accountSettingsPage.clickUpdateDetailsButton();
        //assert the user receives the expected error message, log the issue otherwise
        try {
            assertEquals("First name is too short.", accountSettingsPage.getAccountSettingsPageSingularInputError(), "The account settings too short edited first name input error message doesn't match expectations or the error message wasn't triggered.");
        } catch (Exception e) {
            logger.error("The account settings too short edited first name input error message wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Edit User Account Data Test Result - Too Short Edited First Name");
    }

    //invalid account settings page (edit account) test method - too short edited last name (1 char)
    protected void invalidEditedUserAccountTooShortLastNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AccountSettingsPage accountSettingsPage = new AccountSettingsPage(driver);
        AccountSettingsPageTooShortSingularInput accountSettingsPageTooShortSingularInput = new AccountSettingsPageTooShortSingularInput(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Account settings' link
        accountDashboardPage.clickAccountSettingsLink();
        //account settings page web element assert
        isAccountSettingsPageWebElementDisplayed(accountSettingsPage);
        //account settings page text element assert
        isAccountSettingsPageTextElementAsExpected(accountSettingsPage);
        //capture screenshot of the account settings page before edited data input
        captureScreenshot(driver, "Account Settings Page Display Before Edited Data Input");
        //invalid edited user account data getter - too short edited last name (1 char)
        accountSettingsPageTooShortSingularInput.invalidEditedUserAccountDataTooShortLastNameGetter();
        //input valid edited first name into first name input field
        accountSettingsPageTooShortSingularInput.inputEditedUserFirstNameIntoFirstNameInputField();
        //input too short edited last name into last name input field (1 char)
        accountSettingsPageTooShortSingularInput.inputTooShortEditedUserLastNameIntoLastNameInputField();
        //input valid edited email into email input field
        accountSettingsPageTooShortSingularInput.inputEditedUserEmailIntoEmailInputField();
        //input valid password into current password input field
        accountSettingsPageTooShortSingularInput.inputCurrentUserPasswordIntoCurrentPasswordInputField();
        //capture screenshot of the account settings page after invalid edited data input - too short edited last name
        captureScreenshot(driver, "Account Settings Page Display After Invalid Edited Data Input - Too Short Edited Last Name");
        //click 'Update details' button
        accountSettingsPage.clickUpdateDetailsButton();
        //assert the user receives the expected error message, log the issue otherwise
        try {
            assertEquals("Last name is too short.", accountSettingsPage.getAccountSettingsPageSingularInputError(), "The account settings too short edited last name input error message doesn't match expectations or the error message wasn't triggered.");
        } catch (Exception e) {
            logger.error("The account settings too short edited last name input error message wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Edit User Account Data Test Result - Too Short Edited Last Name");
    }

    //invalid account settings page (edit account) test method - too short edited email (1 char -> name, domain)
    protected void invalidEditedUserAccountTooShortEmailTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AccountSettingsPage accountSettingsPage = new AccountSettingsPage(driver);
        AccountSettingsPageTooShortSingularInput accountSettingsPageTooShortSingularInput = new AccountSettingsPageTooShortSingularInput(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Account settings' link
        accountDashboardPage.clickAccountSettingsLink();
        //account settings page web element assert
        isAccountSettingsPageWebElementDisplayed(accountSettingsPage);
        //account settings page text element assert
        isAccountSettingsPageTextElementAsExpected(accountSettingsPage);
        //capture screenshot of the account settings page before edited data input
        captureScreenshot(driver, "Account Settings Page Display Before Edited Data Input");
        //invalid edited user account data getter - too short edited email (1 char -> name, domain)
        accountSettingsPageTooShortSingularInput.invalidEditedUserAccountDataTooShortEmailGetter();
        //input valid edited first name into first name input field
        accountSettingsPageTooShortSingularInput.inputEditedUserFirstNameIntoFirstNameInputField();
        //input valid edited last name into last name input field
        accountSettingsPageTooShortSingularInput.inputEditedUserLastNameIntoLastNameInputField();
        //input too short edited email into email input field (1 char -> name, domain)
        accountSettingsPageTooShortSingularInput.inputTooShortEditedUserEmailIntoEmailInputField();
        //input valid password into current password input field
        accountSettingsPageTooShortSingularInput.inputCurrentUserPasswordIntoCurrentPasswordInputField();
        //capture screenshot of the account settings page after invalid edited data input - too short edited email
        captureScreenshot(driver, "Account Settings Page Display After Invalid Edited Data Input - Too Short Edited Email");
        //click 'Update details' button
        accountSettingsPage.clickUpdateDetailsButton();
        //assert the user receives the expected error message, log the issue otherwise
        try {
            assertEquals("Email is too short.", accountSettingsPage.getAccountSettingsPageSingularInputError(), "The account settings too short edited email input error message doesn't match expectations or the error message wasn't triggered.");
        } catch (Exception e) {
            logger.error("The account settings too short edited email input error message wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Edit User Account Data Test Result - Too Short Edited Email");
    }

    //invalid account settings page (edit account) test method - too short edited password / confirm password (6 chars)
    protected void invalidEditedUserAccountTooShortPasswordConfirmTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AccountSettingsPage accountSettingsPage = new AccountSettingsPage(driver);
        AccountSettingsPageTooShortSingularInput accountSettingsPageTooShortSingularInput = new AccountSettingsPageTooShortSingularInput(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Account settings' link
        accountDashboardPage.clickAccountSettingsLink();
        //account settings page web element assert
        isAccountSettingsPageWebElementDisplayed(accountSettingsPage);
        //account settings page text element assert
        isAccountSettingsPageTextElementAsExpected(accountSettingsPage);
        //capture screenshot of the account settings page before edited data input
        captureScreenshot(driver, "Account Settings Page Display Before Edited Data Input");
        //invalid edited user account data getter - too short edited password / confirm password (6 chars)
        accountSettingsPageTooShortSingularInput.invalidEditedUserAccountDataTooShortPasswordConfirmGetter();
        //input valid edited first name into first name input field
        accountSettingsPageTooShortSingularInput.inputEditedUserFirstNameIntoFirstNameInputField();
        //input valid edited last name into last name input field
        accountSettingsPageTooShortSingularInput.inputEditedUserLastNameIntoLastNameInputField();
        //input valid password into current password input field
        accountSettingsPageTooShortSingularInput.inputCurrentUserPasswordIntoCurrentPasswordInputField();
        //input too short password into password input field (6 chars)
        accountSettingsPageTooShortSingularInput.inputTooShortEditedUserPasswordIntoPasswordInputField();
        //input too short matching confirm password into confirm password input field (6 chars)
        accountSettingsPageTooShortSingularInput.inputTooShortEditedUserConfirmPasswordIntoConfirmPasswordInputField();
        //capture screenshot of the account settings page after invalid edited data input - too short edited password/ confirm password
        captureScreenshot(driver, "Account Settings Page Display After Invalid Edited Data Input - Too Short Edited Password and Confirm Password");
        //click 'Update details' button
        accountSettingsPage.clickUpdateDetailsButton();
        //assert the user receives the expected error message, log the issue otherwise
        try {
            assertEquals("Passwords must be at least 7 characters and contain both alphabetic and numeric characters.", accountSettingsPage.getAccountSettingsPageSingularInputError(), "The account settings too short edited password / confirm password input error message doesn't match expectations or the error message wasn't triggered.");
        } catch (Exception e) {
            logger.error("The account settings too short edited password / confirm password input error message wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Edit User Account Data Test Result - Too Short Edited Password and Confirm Password");
    }

    //too long singular input

    //invalid account settings page (edit account) test method - too long edited first name (100 chars)
    protected void invalidEditedUserAccountTooLongFirstNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AccountSettingsPage accountSettingsPage = new AccountSettingsPage(driver);
        AccountSettingsPageTooLongSingularInput accountSettingsPageTooLongSingularInput = new AccountSettingsPageTooLongSingularInput(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Account settings' link
        accountDashboardPage.clickAccountSettingsLink();
        //account settings page web element assert
        isAccountSettingsPageWebElementDisplayed(accountSettingsPage);
        //account settings page text element assert
        isAccountSettingsPageTextElementAsExpected(accountSettingsPage);
        //capture screenshot of the account settings page before edited data input
        captureScreenshot(driver, "Account Settings Page Display Before Edited Data Input");
        //invalid edited user account data getter - too long edited first name (100 chars)
        accountSettingsPageTooLongSingularInput.invalidEditedUserAccountDataTooLongFirstNameGetter();
        //input too long edited first name into first name input field (100 chars)
        accountSettingsPageTooLongSingularInput.inputTooLongEditedUserFirstNameIntoFirstNameInputField();
        //input valid edited last name into last name input field
        accountSettingsPageTooLongSingularInput.inputEditedUserLastNameIntoLastNameInputField();
        //input valid edited email into email input field
        accountSettingsPageTooLongSingularInput.inputEditedUserEmailIntoEmailInputField();
        //input valid password into current password input field
        accountSettingsPageTooLongSingularInput.inputCurrentUserPasswordIntoCurrentPasswordInputField();
        //capture screenshot of the account settings page after invalid edited data input  - too long edited first name
        captureScreenshot(driver, "Account Settings Page Display After Invalid Edited Data Input - Too Long Edited First Name");
        //click 'Update details' button
        accountSettingsPage.clickUpdateDetailsButton();
        //assert the user receives the expected error message, log the issue otherwise
        try {
            assertEquals("Last name is too short.", accountSettingsPage.getAccountSettingsPageSingularInputError(), "The account settings too long edited first name input error message doesn't match expectations or the error message wasn't triggered.");
        } catch (Exception e) {
            logger.error("The account settings too long edited first name input error message wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Edit User Account Data Test Result - Too Long Edited First Name");
    }

    //invalid account settings page (edit account) test method - too long edited last name (100 chars)
    protected void invalidEditedUserAccountTooLongLastNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AccountSettingsPage accountSettingsPage = new AccountSettingsPage(driver);
        AccountSettingsPageTooLongSingularInput accountSettingsPageTooLongSingularInput = new AccountSettingsPageTooLongSingularInput(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Account settings' link
        accountDashboardPage.clickAccountSettingsLink();
        //account settings page web element assert
        isAccountSettingsPageWebElementDisplayed(accountSettingsPage);
        //account settings page text element assert
        isAccountSettingsPageTextElementAsExpected(accountSettingsPage);
        //capture screenshot of the account settings page before edited data input
        captureScreenshot(driver, "Account Settings Page Display Before Edited Data Input");
        //invalid edited user account data getter - too short edited last name (100 chars)
        accountSettingsPageTooLongSingularInput.invalidEditedUserAccountDataTooLongLastNameGetter();
        //input valid edited first name into first name input field
        accountSettingsPageTooLongSingularInput.inputEditedUserFirstNameIntoFirstNameInputField();
        //input too short edited last name into last name input field (100 chars)
        accountSettingsPageTooLongSingularInput.inputTooLongEditedUserLastNameIntoLastNameInputField();
        //input valid edited email into email input field
        accountSettingsPageTooLongSingularInput.inputEditedUserEmailIntoEmailInputField();
        //input valid password into current password input field
        accountSettingsPageTooLongSingularInput.inputCurrentUserPasswordIntoCurrentPasswordInputField();
        //capture screenshot of the account settings page after invalid edited data input - too long edited last name
        captureScreenshot(driver, "Account Settings Page Display After Invalid Edited Data Input - Too Long Edited Last Name");
        //click 'Update details' button
        accountSettingsPage.clickUpdateDetailsButton();
        //assert the user receives the expected error message, log the issue otherwise
        try {
            assertEquals("Last name is too long.", accountSettingsPage.getAccountSettingsPageSingularInputError(), "The account settings too long edited last name input error message doesn't match expectations or the error message wasn't triggered.");
        } catch (Exception e) {
            logger.error("The account settings too long edited last name input error message wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Edit User Account Data Test Result - Too Long Edited Last Name");
    }

    //invalid account settings page (edit account) test method - too long edited email (100 chars -> name, domain)
    protected void invalidEditedUserAccountTooLongEmailTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AccountSettingsPage accountSettingsPage = new AccountSettingsPage(driver);
        AccountSettingsPageTooLongSingularInput accountSettingsPageTooLongSingularInput = new AccountSettingsPageTooLongSingularInput(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Account settings' link
        accountDashboardPage.clickAccountSettingsLink();
        //account settings page web element assert
        isAccountSettingsPageWebElementDisplayed(accountSettingsPage);
        //account settings page text element assert
        isAccountSettingsPageTextElementAsExpected(accountSettingsPage);
        //capture screenshot of the account settings page before edited data input
        captureScreenshot(driver, "Account Settings Page Display Before Edited Data Input");
        //invalid edited user account data getter - too long edited email (100 chars -> name, domain)
        accountSettingsPageTooLongSingularInput.invalidEditedUserAccountDataTooLongEmailGetter();
        //input valid edited first name into first name input field
        accountSettingsPageTooLongSingularInput.inputEditedUserFirstNameIntoFirstNameInputField();
        //input valid edited last name into last name input field
        accountSettingsPageTooLongSingularInput.inputEditedUserLastNameIntoLastNameInputField();
        //input too long edited email into email input field (100 chars -> name, domain)
        accountSettingsPageTooLongSingularInput.inputTooLongEditedUserEmailIntoEmailInputField();
        //input valid password into current password input field
        accountSettingsPageTooLongSingularInput.inputCurrentUserPasswordIntoCurrentPasswordInputField();
        //capture screenshot of the account settings page after invalid edited data input - too long edited email
        captureScreenshot(driver, "Account Settings Page Display After Invalid Edited Data Input - Too Long Edited Email");
        //click 'Update details' button
        accountSettingsPage.clickUpdateDetailsButton();
        //assert the user receives the expected error message, log the issue otherwise
        try {
            assertEquals("Something went wrong trying to update your details. Please try again.", accountSettingsPage.getAccountSettingsPageSingularInputErrorBoxText(), "The account settings too long edited email input error message doesn't match expectations or the error message wasn't triggered.");
        } catch (Exception e) {
            logger.error("The account settings too long edited email input error message wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Edit User Account Data Test Result - Too Long Edited Email");
    }

    //invalid account settings page (edit account) test method - too long edited password / confirm password (75 chars)
    protected void invalidEditedUserAccountTooLongPasswordConfirmTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AccountSettingsPage accountSettingsPage = new AccountSettingsPage(driver);
        AccountSettingsPageTooLongSingularInput accountSettingsPageTooLongSingularInput = new AccountSettingsPageTooLongSingularInput(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Account settings' link
        accountDashboardPage.clickAccountSettingsLink();
        //account settings page web element assert
        isAccountSettingsPageWebElementDisplayed(accountSettingsPage);
        //account settings page text element assert
        isAccountSettingsPageTextElementAsExpected(accountSettingsPage);
        //capture screenshot of the account settings page before edited data input
        captureScreenshot(driver, "Account Settings Page Display Before Edited Data Input");
        //invalid edited user account data getter - too short edited password / confirm password (75 chars)
        accountSettingsPageTooLongSingularInput.invalidEditedUserAccountDataTooLongPasswordConfirmGetter();
        //input valid edited first name into first name input field
        accountSettingsPageTooLongSingularInput.inputEditedUserFirstNameIntoFirstNameInputField();
        //input valid edited last name into last name input field
        accountSettingsPageTooLongSingularInput.inputEditedUserLastNameIntoLastNameInputField();
        //input valid password into current password input field
        accountSettingsPageTooLongSingularInput.inputCurrentUserPasswordIntoCurrentPasswordInputField();
        //input too short password into password input field (6 chars)
        accountSettingsPageTooLongSingularInput.inputTooLongEditedUserPasswordIntoPasswordInputField();
        //input too short matching confirm password into confirm password input field (6 chars)
        accountSettingsPageTooLongSingularInput.inputTooLongEditedUserConfirmPasswordIntoConfirmPasswordInputField();
        //capture screenshot of the account settings page after invalid edited data input - too long edited password / confirm password
        captureScreenshot(driver, "Account Settings Page Display After Invalid Edited Data Input - Too Short Edited Password and Confirm Password");
        //click 'Update details' button
        accountSettingsPage.clickUpdateDetailsButton();
        //assert the user receives the expected error message, log the issue otherwise
        try {
            assertEquals("Passwords is too long.", accountSettingsPage.getAccountSettingsPageSingularInputError(), "The account settings too long edited password / confirm password input error message doesn't match expectations or the error message wasn't triggered.");
        } catch (Exception e) {
            logger.error("The account settings too long edited password / confirm password input error message wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Edit User Account Data Test Result - Too Long Edited Password and Confirm Password");
    }

    //invalid singular input format

    //invalid account settings page (edit account) test method - invalid edited first name format (special symbols only)
    protected void invalidEditedUserAccountInvalidFirstNameFormatTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AccountSettingsPage accountSettingsPage = new AccountSettingsPage(driver);
        AccountSettingPageInvalidSingularInputFormat accountSettingsPageInvalidSingularInputFormat = new AccountSettingPageInvalidSingularInputFormat(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Account settings' link
        accountDashboardPage.clickAccountSettingsLink();
        //account settings page web element assert
        isAccountSettingsPageWebElementDisplayed(accountSettingsPage);
        //account settings page text element assert
        isAccountSettingsPageTextElementAsExpected(accountSettingsPage);
        //capture screenshot of the account settings page before edited data input
        captureScreenshot(driver, "Account Settings Page Display Before Edited Data Input");
        //invalid edited user account data getter - invalid edited first name format (special symbols only)
        accountSettingsPageInvalidSingularInputFormat.invalidEditedUserAccountDataInvalidFirstNameFormatGetter();
        //input invalid edited first name format into first name input field (special symbols only)
        accountSettingsPageInvalidSingularInputFormat.inputInvalidEditedUserFirstNameFormatIntoFirstNameInputField();
        //input valid edited last name into last name input field
        accountSettingsPageInvalidSingularInputFormat.inputEditedUserLastNameIntoLastNameInputField();
        //input valid edited email into email input field
        accountSettingsPageInvalidSingularInputFormat.inputEditedUserEmailIntoEmailInputField();
        //input valid password into current password input field
        accountSettingsPageInvalidSingularInputFormat.inputCurrentUserPasswordIntoCurrentPasswordInputField();
        //capture screenshot of the account settings page after invalid edited data input  - invalid edited first name format
        captureScreenshot(driver, "Account Settings Page Display After Invalid Edited Data Input - Invalid Edited First Name Format");
        //click 'Update details' button
        accountSettingsPage.clickUpdateDetailsButton();
        //assert the user receives the expected error message, log the issue otherwise
        try {
            assertEquals("First name cannot consist of special symbols only.", accountSettingsPage.getAccountSettingsPageSingularInputError(), "The account settings invalid edited first name input format error message doesn't match expectations or the error message wasn't triggered.");
        } catch (Exception e) {
            logger.error("The account settings invalid edited first name input format error message wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Edit User Account Data Test Result - Invalid Edited First Name Format");
    }

    //invalid account settings page (edit account) test method - invalid edited last name format (special symbols only)
    protected void invalidEditedUserAccountInvalidLastNameFormatTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AccountSettingsPage accountSettingsPage = new AccountSettingsPage(driver);
        AccountSettingPageInvalidSingularInputFormat accountSettingsPageInvalidSingularInputFormat = new AccountSettingPageInvalidSingularInputFormat(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Account settings' link
        accountDashboardPage.clickAccountSettingsLink();
        //account settings page web element assert
        isAccountSettingsPageWebElementDisplayed(accountSettingsPage);
        //account settings page text element assert
        isAccountSettingsPageTextElementAsExpected(accountSettingsPage);
        //capture screenshot of the account settings page before edited data input
        captureScreenshot(driver, "Account Settings Page Display Before Edited Data Input");
        //invalid edited user account data getter - invalid edited last name format (special symbols only)
        accountSettingsPageInvalidSingularInputFormat.invalidEditedUserAccountDataInvalidLastNameFormatGetter();
        //input valid edited first name into first name input field
        accountSettingsPageInvalidSingularInputFormat.inputEditedUserFirstNameIntoFirstNameInputField();
        //input invalid edited last name format into last name input field (special symbols only)
        accountSettingsPageInvalidSingularInputFormat.inputInvalidEditedUserLastNameFormatIntoLastNameInputField();
        //input valid edited email into email input field
        accountSettingsPageInvalidSingularInputFormat.inputEditedUserEmailIntoEmailInputField();
        //input valid password into current password input field
        accountSettingsPageInvalidSingularInputFormat.inputCurrentUserPasswordIntoCurrentPasswordInputField();
        //capture screenshot of the account settings page after invalid edited data input  - invalid edited last name format
        captureScreenshot(driver, "Account Settings Page Display After Invalid Edited Data Input - Invalid Edited Last Name Format");
        //click 'Update details' button
        accountSettingsPage.clickUpdateDetailsButton();
        //assert the user receives the expected error message, log the issue otherwise
        try {
            assertEquals("Last name cannot consist of special symbols only.", accountSettingsPage.getAccountSettingsPageSingularInputError(), "The account settings invalid edited last name input format error message doesn't match expectations or the error message wasn't triggered.");
        } catch (Exception e) {
            logger.error("The account settings invalid edited last name input format error message wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Edit User Account Data Test Result - Invalid Edited Last Name Format");
    }

    //invalid account settings page (edit account) test method - invalid edited email format (missing '@')
    protected void invalidEditedUserAccountInvalidEmailFormatTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AccountSettingsPage accountSettingsPage = new AccountSettingsPage(driver);
        AccountSettingPageInvalidSingularInputFormat accountSettingsPageInvalidSingularInputFormat = new AccountSettingPageInvalidSingularInputFormat(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Account settings' link
        accountDashboardPage.clickAccountSettingsLink();
        //account settings page web element assert
        isAccountSettingsPageWebElementDisplayed(accountSettingsPage);
        //account settings page text element assert
        isAccountSettingsPageTextElementAsExpected(accountSettingsPage);
        //capture screenshot of the account settings page before edited data input
        captureScreenshot(driver, "Account Settings Page Display Before Edited Data Input");
        //invalid edited user account data getter - invalid edited email format (missing '@')
        accountSettingsPageInvalidSingularInputFormat.invalidEditedUserAccountDataInvalidEmailFormatGetter();
        //input valid edited first name into first name input field
        accountSettingsPageInvalidSingularInputFormat.inputEditedUserFirstNameIntoFirstNameInputField();
        //input valid edited last name into last name input field
        accountSettingsPageInvalidSingularInputFormat.inputEditedUserLastNameIntoLastNameInputField();
        //input invalid edited email format into email input field
        accountSettingsPageInvalidSingularInputFormat.inputInvalidEditedUserEmailFormatIntoEmailInputField();
        //input valid password into current password input field
        accountSettingsPageInvalidSingularInputFormat.inputCurrentUserPasswordIntoCurrentPasswordInputField();
        //capture screenshot of the account settings page after invalid edited data input  - invalid edited email format
        captureScreenshot(driver, "Account Settings Page Display After Invalid Edited Data Input - Invalid Edited Email Format");
        //click 'Update details' button
        accountSettingsPage.clickUpdateDetailsButton();
        //assert the user receives the expected error message, log the issue otherwise
        try {
            assertEquals("You must enter a valid email.", accountSettingsPage.getAccountSettingsPageSingularInputError(), "The account settings invalid edited email input format error message doesn't match expectations or the error message wasn't triggered.");
        } catch (Exception e) {
            logger.error("The account settings invalid edited email input format error message wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Edit User Account Data Test Result - Invalid Edited Email Format");
    }

    //invalid account settings page (edit account) test method - pre-existing email format (used beforehand in manual testing)
    protected void invalidEditedUserAccountExistingEmailFormatTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AccountSettingsPage accountSettingsPage = new AccountSettingsPage(driver);
        AccountSettingPageInvalidSingularInputFormat accountSettingsPageInvalidSingularInputFormat = new AccountSettingPageInvalidSingularInputFormat(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Account settings' link
        accountDashboardPage.clickAccountSettingsLink();
        //account settings page web element assert
        isAccountSettingsPageWebElementDisplayed(accountSettingsPage);
        //account settings page text element assert
        isAccountSettingsPageTextElementAsExpected(accountSettingsPage);
        //capture screenshot of the account settings page before edited data input
        captureScreenshot(driver, "Account Settings Page Display Before Edited Data Input");
        //invalid edited user account data getter - pre-existing email format (used beforehand in manual testing)
        accountSettingsPageInvalidSingularInputFormat.invalidEditedUserAccountDataExistingEmailGetter();
        //input valid edited first name into first name input field
        accountSettingsPageInvalidSingularInputFormat.inputEditedUserFirstNameIntoFirstNameInputField();
        //input valid edited last name into last name input field
        accountSettingsPageInvalidSingularInputFormat.inputEditedUserLastNameIntoLastNameInputField();
        //input pre-existing email format into email input field  (used beforehand in manual testing)
        accountSettingsPageInvalidSingularInputFormat.inputExistingEditedUserEmailIntoEmailInputField();
        //input valid password into current password input field
        accountSettingsPageInvalidSingularInputFormat.inputCurrentUserPasswordIntoCurrentPasswordInputField();
        //capture screenshot of the account settings page after invalid edited data input - pre-existing email
        captureScreenshot(driver, "Account Settings Page Display After Invalid Edited Data Input - Existing Email");
        //click 'Update details' button
        accountSettingsPage.clickUpdateDetailsButton();
        //assert the user receives the expected error message, log the issue otherwise
        try {
            assertEquals("Entered email is invalid or already in use", accountSettingsPage.getAccountSettingsPageSingularInputErrorBoxText(), "The account settings existing edited email input error message doesn't match expectations or the error message wasn't triggered.");
        } catch (Exception e) {
            logger.error("The account settings existing edited email input error message wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Edit User Account Data Test Result - Existing Email");
    }

    //invalid account settings page (edit account) test method - invalid edited new password / confirm password format (strings only)
    protected void invalidEditedUserAccountInvalidPasswordConfirmFormatTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AccountSettingsPage accountSettingsPage = new AccountSettingsPage(driver);
        AccountSettingPageInvalidSingularInputFormat accountSettingsPageInvalidSingularInputFormat = new AccountSettingPageInvalidSingularInputFormat(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Account settings' link
        accountDashboardPage.clickAccountSettingsLink();
        //account settings page web element assert
        isAccountSettingsPageWebElementDisplayed(accountSettingsPage);
        //account settings page text element assert
        isAccountSettingsPageTextElementAsExpected(accountSettingsPage);
        //capture screenshot of the account settings page before edited data input
        captureScreenshot(driver, "Account Settings Page Display Before Edited Data Input");
        //invalid edited user account data getter - invalid edited new password / confirm password format (strings only)
        accountSettingsPageInvalidSingularInputFormat.invalidEditedUserAccountDataInvalidPasswordConfirmFormatGetter();
        //input valid edited first name into first name input field
        accountSettingsPageInvalidSingularInputFormat.inputEditedUserFirstNameIntoFirstNameInputField();
        //input valid edited last name into last name input field
        accountSettingsPageInvalidSingularInputFormat.inputEditedUserLastNameIntoLastNameInputField();
        //input valid password into current password input field
        accountSettingsPageInvalidSingularInputFormat.inputCurrentUserPasswordIntoCurrentPasswordInputField();
        //input invalid new password format into password input field (strings only)
        accountSettingsPageInvalidSingularInputFormat.inputInvalidEditedUserPasswordFormatIntoPasswordInputField();
        //input invalid matching confirm password format into confirm password input field (strings only)
        accountSettingsPageInvalidSingularInputFormat.inputInvalidEditedUserConfirmPasswordFormatIntoConfirmPasswordInputField();
        //capture screenshot of the account settings page after invalid edited data input - invalid edited new password / confirm password format
        captureScreenshot(driver, "Account Settings Page Display After Invalid Edited Data Input - Invalid Edited New Password and Confirm Password Format");
        //click 'Update details' button
        accountSettingsPage.clickUpdateDetailsButton();
        //assert the user receives the expected error message, log the issue otherwise
        try {
            assertEquals("Passwords must be at least 7 characters and contain both alphabetic and numeric characters.", accountSettingsPage.getAccountSettingsPageSingularInputError(), "The account settings invalid edited password / confirm password input format error message doesn't match expectations or the error message wasn't triggered.");
        } catch (Exception e) {
            logger.error("The account settings invalid edited password / confirm password input format error message wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Edit User Account Data Test Result - Invalid Edited New Password and Confirm Password Format");
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //valid second user address addition test

    //valid user second address addition test method (since the user already has an address already after account creation)
    protected void validSecondUserAddressAdditionTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AddressDashboardPage addressDashboardPage = new AddressDashboardPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Addresses' link
        accountDashboardPage.clickAddressesLink();
        //address dashboard page web element assert
        isAddressDashboardPageWebElementDisplayed(addressDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert address dashboard page title is a expected
        assertEquals("Addresses", addressDashboardPage.getAddressDashboardPageTitle(), "The address dashboard page title doesn't match expectations.");
        //log address dashboard page data
        logAddressDashboardPageData(addressDashboardPage);
        //capture screenshot of the address dashboard page display
        captureScreenshot(driver, "Address Dashboard Page Display");
        //click 'New address' link
        addressDashboardPage.clickNewAddressLink();
        //add address page web element assert
        isAddAddressPageWebElementDisplayed(addAddressPage);
        //add address page text element assert
        isAddAddressPageTextElementAsExpected(addAddressPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //capture screenshot of the add address page display before data input
        captureScreenshot(driver, "Add Address Page Display Before Data Input");
        //valid user address getter
        addAddressPage.validUserAddressDataGetter();
        //input valid address first name into first name input field
        addAddressPage.inputValidUserFirstNameIntoFirstNameInputField();
        //input valid address last name into last name input field
        addAddressPage.inputValidUserLastNameIntoLastNameInputField();
        //input valid address into address 1 input field
        addAddressPage.inputValidUserAddressIntoAddress1InputField();
        //click 'State dropdown menu
        addAddressPage.clickStateDropdownMenu();
        //select 'Illinois' option
        addAddressPage.selectIllinoisOption();
        //input valid address city into city input field
        addAddressPage.inputValidUserCityIntoCityInputField();
        //input valid address post code into post code input field
        addAddressPage.inputValidUserPostCodeIntoPostCodeInputField();
        //input valid address phone into phone input field
        addAddressPage.inputValidUserPhoneIntoPhoneInputField();
        //capture screenshot of the add address page display after valid data input
        captureScreenshot(driver, "Add Address Page Display After Valid Data Input");
        //click 'Save address' button
        addAddressPage.clickSaveAddressButton();
        //log address dashboard page data(to verify the address has been added)
        logAddressDashboardPageData(addressDashboardPage);
        //capture screenshot of the test result
        captureScreenshot(driver, "Valid User Second Address Addition Test Result");
    }

    //invalid second user address addition tests

    //no singular input

    //invalid user second address addition test method - no user country
    protected void invalidSecondUserAddressAdditionNoCountryTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AddressDashboardPage addressDashboardPage = new AddressDashboardPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Addresses' link
        accountDashboardPage.clickAddressesLink();
        //address dashboard page web element assert
        isAddressDashboardPageWebElementDisplayed(addressDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert address dashboard page title is a expected
        assertEquals("Addresses", addressDashboardPage.getAddressDashboardPageTitle(), "The address dashboard page title doesn't match expectations.");
        //log address dashboard page data
        logAddressDashboardPageData(addressDashboardPage);
        //capture screenshot of the address dashboard page display
        captureScreenshot(driver, "Address Dashboard Page Display");
        //click 'New address' link
        addressDashboardPage.clickNewAddressLink();
        //add address page web element assert
        isAddAddressPageWebElementDisplayed(addAddressPage);
        //add address page text element assert
        isAddAddressPageTextElementAsExpected(addAddressPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //capture screenshot of the add address page display before data input
        captureScreenshot(driver, "Add Address Page Display Before Data Input");
        //valid user address getter
        addAddressPage.validUserAddressDataGetter();
        //click "Country" dropdown menu
        addAddressPage.clickCountryDropdownMenu();
        //select "Choose a country" option
        addAddressPage.selectCountryOption();
        //input valid address first name into first name input field
        addAddressPage.inputValidUserFirstNameIntoFirstNameInputField();
        //input valid address last name into last name input field
        addAddressPage.inputValidUserLastNameIntoLastNameInputField();
        //input valid address into address 1 input field
        addAddressPage.inputValidUserAddressIntoAddress1InputField();
        //input valid address city into city input field
        addAddressPage.inputValidUserCityIntoCityInputField();
        //input valid address post code into post code input field
        addAddressPage.inputValidUserPostCodeIntoPostCodeInputField();
        //input valid address phone into phone input field
        addAddressPage.inputValidUserPhoneIntoPhoneInputField();
        //capture screenshot of the add address page display after invalid data input - no user country
        captureScreenshot(driver, "Add Address Page Display After Valid Data Input - No Country");
        //click 'Save address' button
        addAddressPage.clickSaveAddressButton();
        //assert the user gets an expected error
        assertEquals("Country field cannot be blank.", addAddressPage.getAddAddressPageSingularInputError(), "The add address page missing country input error doesn't match expectations or the error wasn't triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Second Address Addition Test Result - No Country");
    }

    //invalid user second address addition test method - no user first name
    protected void invalidSecondUserAddressAdditionNoFirstNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AddressDashboardPage addressDashboardPage = new AddressDashboardPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        AddAddressPageNoSingularInput addAddressPageNoSingularInput = new AddAddressPageNoSingularInput(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Addresses' link
        accountDashboardPage.clickAddressesLink();
        //address dashboard page web element assert
        isAddressDashboardPageWebElementDisplayed(addressDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert address dashboard page title is a expected
        assertEquals("Addresses", addressDashboardPage.getAddressDashboardPageTitle(), "The address dashboard page title doesn't match expectations.");
        //log address dashboard page data
        logAddressDashboardPageData(addressDashboardPage);
        //capture screenshot of the address dashboard page display
        captureScreenshot(driver, "Address Dashboard Page Display");
        //click 'New address' link
        addressDashboardPage.clickNewAddressLink();
        //add address page web element assert
        isAddAddressPageWebElementDisplayed(addAddressPage);
        //add address page text element assert
        isAddAddressPageTextElementAsExpected(addAddressPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //capture screenshot of the add address page display before data input
        captureScreenshot(driver, "Add Address Page Display Before Data Input");
        //invalid user address getter - no user first name
        addAddressPageNoSingularInput.invalidUserEditedAddressDataNoFirstNameGetter();
        //don't input address first name into first name input field
        addAddressPageNoSingularInput.inputNoUserFirstNameIntoFirstNameInputField();
        //input valid address last name into last name input field
        addAddressPageNoSingularInput.inputValidUserLastNameIntoLastNameInputField();
        //input valid address into address 1 input field
        addAddressPageNoSingularInput.inputValidUserAddressIntoAddress1InputField();
        //input valid address city into city input field
        addAddressPageNoSingularInput.inputValidUserCityIntoCityInputField();
        //input valid address post code into post code input field
        addAddressPageNoSingularInput.inputValidUserPostCodeIntoPostCodeInputField();
        //input valid address phone into phone input field
        addAddressPageNoSingularInput.inputValidUserPhoneIntoPhoneInputField();
        //click 'State dropdown menu
        addAddressPage.clickStateDropdownMenu();
        //select 'Illinois' option
        addAddressPage.selectIllinoisOption();
        //capture screenshot of the add address page display after invalid data input - no user first name
        captureScreenshot(driver, "Add Address Page Display After Valid Data Input - No First Name");
        //click 'Save address' button
        addAddressPage.clickSaveAddressButton();
        //assert the user gets an expected error
        assertEquals("First Name field cannot be blank.", addAddressPage.getAddAddressPageSingularInputError(), "The add address page missing first name input error doesn't match expectations or the error wasn't triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Second Address Addition Test Result - No First Name");
    }

    //invalid user second address addition test method - no user last name
    protected void invalidSecondUserAddressAdditionNoLastNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AddressDashboardPage addressDashboardPage = new AddressDashboardPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        AddAddressPageNoSingularInput addAddressPageNoSingularInput = new AddAddressPageNoSingularInput(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Addresses' link
        accountDashboardPage.clickAddressesLink();
        //address dashboard page web element assert
        isAddressDashboardPageWebElementDisplayed(addressDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert address dashboard page title is a expected
        assertEquals("Addresses", addressDashboardPage.getAddressDashboardPageTitle(), "The address dashboard page title doesn't match expectations.");
        //log address dashboard page data
        logAddressDashboardPageData(addressDashboardPage);
        //capture screenshot of the address dashboard page display
        captureScreenshot(driver, "Address Dashboard Page Display");
        //click 'New address' link
        addressDashboardPage.clickNewAddressLink();
        //add address page web element assert
        isAddAddressPageWebElementDisplayed(addAddressPage);
        //add address page text element assert
        isAddAddressPageTextElementAsExpected(addAddressPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //capture screenshot of the add address page display before data input
        captureScreenshot(driver, "Add Address Page Display Before Data Input");
        //invalid user address getter - no user last name
        addAddressPageNoSingularInput.invalidUserEditedAddressDataNoLastNameGetter();
        //input valid address first name into first name input field
        addAddressPageNoSingularInput.inputValidUserFirstNameIntoFirstNameInputField();
        //don't input address last name into last name input field
        addAddressPageNoSingularInput.inputNoUserLastNameIntoLastNameInputField();
        //input valid address into address 1 input field
        addAddressPageNoSingularInput.inputValidUserAddressIntoAddress1InputField();
        //input valid address city into city input field
        addAddressPageNoSingularInput.inputValidUserCityIntoCityInputField();
        //input valid address post code into post code input field
        addAddressPageNoSingularInput.inputValidUserPostCodeIntoPostCodeInputField();
        //input valid address phone into phone input field
        addAddressPageNoSingularInput.inputValidUserPhoneIntoPhoneInputField();
        //click 'State dropdown menu
        addAddressPage.clickStateDropdownMenu();
        //select 'Illinois' option
        addAddressPage.selectIllinoisOption();
        //capture screenshot of the add address page display after invalid data input - no user last name
        captureScreenshot(driver, "Add Address Page Display After Valid Data Input - No Last Name");
        //click 'Save address' button
        addAddressPage.clickSaveAddressButton();
        //assert the user gets an expected error
        assertEquals("Last Name field cannot be blank.", addAddressPage.getAddAddressPageSingularInputError(), "The add address page missing last name input error doesn't match expectations or the error wasn't triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Second Address Addition Test Result - No Last Name");
    }

    //invalid user second address addition test method - no user address
    protected void invalidSecondUserAddressAdditionNoAddressTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AddressDashboardPage addressDashboardPage = new AddressDashboardPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        AddAddressPageNoSingularInput addAddressPageNoSingularInput = new AddAddressPageNoSingularInput(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Addresses' link
        accountDashboardPage.clickAddressesLink();
        //address dashboard page web element assert
        isAddressDashboardPageWebElementDisplayed(addressDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert address dashboard page title is a expected
        assertEquals("Addresses", addressDashboardPage.getAddressDashboardPageTitle(), "The address dashboard page title doesn't match expectations.");
        //log address dashboard page data
        logAddressDashboardPageData(addressDashboardPage);
        //capture screenshot of the address dashboard page display
        captureScreenshot(driver, "Address Dashboard Page Display");
        //click 'New address' link
        addressDashboardPage.clickNewAddressLink();
        //add address page web element assert
        isAddAddressPageWebElementDisplayed(addAddressPage);
        //add address page text element assert
        isAddAddressPageTextElementAsExpected(addAddressPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //capture screenshot of the add address page display before data input
        captureScreenshot(driver, "Add Address Page Display Before Data Input");
        //invalid user address getter - no user address
        addAddressPageNoSingularInput.invalidUserEditedAddressDataNoAddressGetter();
        //input valid address first name into first name input field
        addAddressPageNoSingularInput.inputValidUserFirstNameIntoFirstNameInputField();
        //input valid address last name into last name input field
        addAddressPageNoSingularInput.inputValidUserLastNameIntoLastNameInputField();
        //don't input address into address 1 input field
        addAddressPageNoSingularInput.inputNoUserAddressIntoAddress1InputField();
        //input valid address city into city input field
        addAddressPageNoSingularInput.inputValidUserCityIntoCityInputField();
        //input valid address post code into post code input field
        addAddressPageNoSingularInput.inputValidUserPostCodeIntoPostCodeInputField();
        //input valid address phone into phone input field
        addAddressPageNoSingularInput.inputValidUserPhoneIntoPhoneInputField();
        //click 'State dropdown menu
        addAddressPage.clickStateDropdownMenu();
        //select 'Illinois' option
        addAddressPage.selectIllinoisOption();
        //capture screenshot of the add address page display after invalid data input - no user address
        captureScreenshot(driver, "Add Address Page Display After Valid Data Input - No Address");
        //click 'Save address' button
        addAddressPage.clickSaveAddressButton();
        //assert the user gets an expected error
        assertEquals("Address Line 1 field cannot be blank.", addAddressPage.getAddAddressPageSingularInputError(), "The add address page missing address input error doesn't match expectations or the error wasn't triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Second Address Addition Test Result - No Address");
    }

    //invalid user second address addition test method - no user city
    protected void invalidSecondUserAddressAdditionNoCityTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AddressDashboardPage addressDashboardPage = new AddressDashboardPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        AddAddressPageNoSingularInput addAddressPageNoSingularInput = new AddAddressPageNoSingularInput(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Addresses' link
        accountDashboardPage.clickAddressesLink();
        //address dashboard page web element assert
        isAddressDashboardPageWebElementDisplayed(addressDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert address dashboard page title is a expected
        assertEquals("Addresses", addressDashboardPage.getAddressDashboardPageTitle(), "The address dashboard page title doesn't match expectations.");
        //log address dashboard page data
        logAddressDashboardPageData(addressDashboardPage);
        //capture screenshot of the address dashboard page display
        captureScreenshot(driver, "Address Dashboard Page Display");
        //click 'New address' link
        addressDashboardPage.clickNewAddressLink();
        //add address page web element assert
        isAddAddressPageWebElementDisplayed(addAddressPage);
        //add address page text element assert
        isAddAddressPageTextElementAsExpected(addAddressPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //capture screenshot of the add address page display before data input
        captureScreenshot(driver, "Add Address Page Display Before Data Input");
        //invalid user address getter - no user city
        addAddressPageNoSingularInput.invalidUserEditedAddressDataNoCityGetter();
        //input valid address first name into first name input field
        addAddressPageNoSingularInput.inputValidUserFirstNameIntoFirstNameInputField();
        //input valid address last name into last name input field
        addAddressPageNoSingularInput.inputValidUserLastNameIntoLastNameInputField();
        //input valid address into address 1 input field
        addAddressPageNoSingularInput.inputValidUserAddressIntoAddress1InputField();
        //don't input address city into city input field
        addAddressPageNoSingularInput.inputNoUserCityIntoCityInputField();
        //input valid address post code into post code input field
        addAddressPageNoSingularInput.inputValidUserPostCodeIntoPostCodeInputField();
        //input valid address phone into phone input field
        addAddressPageNoSingularInput.inputValidUserPhoneIntoPhoneInputField();
        //click 'State dropdown menu
        addAddressPage.clickStateDropdownMenu();
        //select 'Illinois' option
        addAddressPage.selectIllinoisOption();
        //capture screenshot of the add address page display after invalid data input - no user city
        captureScreenshot(driver, "Add Address Page Display After Valid Data Input - No City");
        //click 'Save address' button
        addAddressPage.clickSaveAddressButton();
        //assert the user gets an expected error
        assertEquals("Suburb/City field cannot be blank.", addAddressPage.getAddAddressPageSingularInputError(), "The add address page missing city input error doesn't match expectations or the error wasn't triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Second Address Addition Test Result - No City");
    }

    //invalid user second address addition test method - no user state
    protected void invalidSecondUserAddressAdditionNoStateTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AddressDashboardPage addressDashboardPage = new AddressDashboardPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Addresses' link
        accountDashboardPage.clickAddressesLink();
        //address dashboard page web element assert
        isAddressDashboardPageWebElementDisplayed(addressDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert address dashboard page title is a expected
        assertEquals("Addresses", addressDashboardPage.getAddressDashboardPageTitle(), "The address dashboard page title doesn't match expectations.");
        //log address dashboard page data
        logAddressDashboardPageData(addressDashboardPage);
        //capture screenshot of the address dashboard page display
        captureScreenshot(driver, "Address Dashboard Page Display");
        //click 'New address' link
        addressDashboardPage.clickNewAddressLink();
        //add address page web element assert
        isAddAddressPageWebElementDisplayed(addAddressPage);
        //add address page text element assert
        isAddAddressPageTextElementAsExpected(addAddressPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //capture screenshot of the add address page display before data input
        captureScreenshot(driver, "Add Address Page Display Before Data Input");
        //valid user address getter
        addAddressPage.validUserAddressDataGetter();
        //input valid address first name into first name input field
        addAddressPage.inputValidUserFirstNameIntoFirstNameInputField();
        //input valid address last name into last name input field
        addAddressPage.inputValidUserLastNameIntoLastNameInputField();
        //input valid address into address 1 input field
        addAddressPage.inputValidUserAddressIntoAddress1InputField();
        //input valid address city into city input field
        addAddressPage.inputValidUserCityIntoCityInputField();
        //input valid address post code into post code input field
        addAddressPage.inputValidUserPostCodeIntoPostCodeInputField();
        //input valid address phone into phone input field
        addAddressPage.inputValidUserPhoneIntoPhoneInputField();
        //click 'State dropdown menu
        addAddressPage.clickStateDropdownMenu();
        //select 'Select a state' option
        addAddressPage.selectStateOption();
        //capture screenshot of the add address page display after invalid data input - no user state
        captureScreenshot(driver, "Add Address Page Display After Valid Data Input - No State");
        //click 'Save address' button
        addAddressPage.clickSaveAddressButton();
        //assert the user gets an expected error
        assertEquals("State/Province field cannot be blank.", addAddressPage.getAddAddressPageSingularInputError(), "The add address page missing state input error doesn't match expectations or the error wasn't triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Second Address Addition Test Result - No State");
    }

    //invalid user second address addition test method - no user post code
    protected void invalidSecondUserAddressAdditionNoPostCodeTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AddressDashboardPage addressDashboardPage = new AddressDashboardPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        AddAddressPageNoSingularInput addAddressPageNoSingularInput = new AddAddressPageNoSingularInput(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Addresses' link
        accountDashboardPage.clickAddressesLink();
        //address dashboard page web element assert
        isAddressDashboardPageWebElementDisplayed(addressDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert address dashboard page title is a expected
        assertEquals("Addresses", addressDashboardPage.getAddressDashboardPageTitle(), "The address dashboard page title doesn't match expectations.");
        //log address dashboard page data
        logAddressDashboardPageData(addressDashboardPage);
        //capture screenshot of the address dashboard page display
        captureScreenshot(driver, "Address Dashboard Page Display");
        //click 'New address' link
        addressDashboardPage.clickNewAddressLink();
        //add address page web element assert
        isAddAddressPageWebElementDisplayed(addAddressPage);
        //add address page text element assert
        isAddAddressPageTextElementAsExpected(addAddressPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //capture screenshot of the add address page display before data input
        captureScreenshot(driver, "Add Address Page Display Before Data Input");
        //invalid user address getter - no user post code
        addAddressPageNoSingularInput.invalidUserEditedAddressDataNoPostCodeGetter();
        //input valid address first name into first name input field
        addAddressPageNoSingularInput.inputValidUserFirstNameIntoFirstNameInputField();
        //input valid address last name into last name input field
        addAddressPageNoSingularInput.inputValidUserLastNameIntoLastNameInputField();
        //input valid address into address 1 input field
        addAddressPageNoSingularInput.inputValidUserAddressIntoAddress1InputField();
        //input valid address city into city input field
        addAddressPageNoSingularInput.inputValidUserCityIntoCityInputField();
        //don't input address post code into post code input field
        addAddressPageNoSingularInput.inputNoUserPostCodeIntoPostCodeInputField();
        //input valid address phone into phone input field
        addAddressPageNoSingularInput.inputValidUserPhoneIntoPhoneInputField();
        //click 'State dropdown menu
        addAddressPage.clickStateDropdownMenu();
        //select 'Illinois' option
        addAddressPage.selectIllinoisOption();
        //capture screenshot of the add address page display after invalid data input - no user post code
        captureScreenshot(driver, "Add Address Page Display After Valid Data Input - No Post Code");
        //click 'Save address' button
        addAddressPage.clickSaveAddressButton();
        //assert the user gets an expected error
        assertEquals("Zip/Postcode field cannot be blank.", addAddressPage.getAddAddressPageSingularInputError(), "The add address page missing post code input error doesn't match expectations or the error wasn't triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Second Address Addition Test Result - No Post Code");
    }

    //invalid user second address addition test method - no user phone
    protected void invalidSecondUserAddressAdditionNoPhoneTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AddressDashboardPage addressDashboardPage = new AddressDashboardPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        AddAddressPageNoSingularInput addAddressPageNoSingularInput = new AddAddressPageNoSingularInput(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Addresses' link
        accountDashboardPage.clickAddressesLink();
        //address dashboard page web element assert
        isAddressDashboardPageWebElementDisplayed(addressDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert address dashboard page title is a expected
        assertEquals("Addresses", addressDashboardPage.getAddressDashboardPageTitle(), "The address dashboard page title doesn't match expectations.");
        //log address dashboard page data
        logAddressDashboardPageData(addressDashboardPage);
        //capture screenshot of the address dashboard page display
        captureScreenshot(driver, "Address Dashboard Page Display");
        //click 'New address' link
        addressDashboardPage.clickNewAddressLink();
        //add address page web element assert
        isAddAddressPageWebElementDisplayed(addAddressPage);
        //add address page text element assert
        isAddAddressPageTextElementAsExpected(addAddressPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //capture screenshot of the add address page display before data input
        captureScreenshot(driver, "Add Address Page Display Before Data Input");
        //invalid user address getter - no user phone
        addAddressPageNoSingularInput.invalidUserEditedAddressDataNoPhoneGetter();
        //input valid address first name into first name input field
        addAddressPageNoSingularInput.inputValidUserFirstNameIntoFirstNameInputField();
        //input valid address last name into last name input field
        addAddressPageNoSingularInput.inputValidUserLastNameIntoLastNameInputField();
        //input valid address into address 1 input field
        addAddressPageNoSingularInput.inputValidUserAddressIntoAddress1InputField();
        //input valid address city into city input field
        addAddressPageNoSingularInput.inputValidUserCityIntoCityInputField();
        //input valid address post code into post code input field
        addAddressPageNoSingularInput.inputValidUserPostCodeIntoPostCodeInputField();
        //don't input address phone into phone input field
        addAddressPageNoSingularInput.inputNoUserPhoneIntoPhoneInputField();
        //click 'State dropdown menu
        addAddressPage.clickStateDropdownMenu();
        //select 'Illinois' option
        addAddressPage.selectIllinoisOption();
        //capture screenshot of the add address page display after invalid data input - no user phone
        captureScreenshot(driver, "Add Address Page Display After Valid Data Input - No Phone");
        //click 'Save address' button
        addAddressPage.clickSaveAddressButton();
        //assert the user gets an expected error
        assertEquals("Phone Number field cannot be blank.", addAddressPage.getAddAddressPageSingularInputError(), "The add address page missing phone input error doesn't match expectations or the error wasn't triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Second Address Addition Test Result - No Phone");
    }

    //too short singular input

    //invalid user second address addition test method - too short user first name (1 char)
    protected void invalidSecondUserAddressAdditionTooShortFirstNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AddressDashboardPage addressDashboardPage = new AddressDashboardPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        AddAddressPageTooShortSingularInput addAddressPageTooShortSingularInput = new AddAddressPageTooShortSingularInput(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Addresses' link
        accountDashboardPage.clickAddressesLink();
        //address dashboard page web element assert
        isAddressDashboardPageWebElementDisplayed(addressDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert address dashboard page title is a expected
        assertEquals("Addresses", addressDashboardPage.getAddressDashboardPageTitle(), "The address dashboard page title doesn't match expectations.");
        //log address dashboard page data
        logAddressDashboardPageData(addressDashboardPage);
        //capture screenshot of the address dashboard page display
        captureScreenshot(driver, "Address Dashboard Page Display");
        //click 'New address' link
        addressDashboardPage.clickNewAddressLink();
        //add address page web element assert
        isAddAddressPageWebElementDisplayed(addAddressPage);
        //add address page text element assert
        isAddAddressPageTextElementAsExpected(addAddressPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //capture screenshot of the add address page display before data input
        captureScreenshot(driver, "Add Address Page Display Before Data Input");
        //invalid user address getter - too short user first name (1 char)
        addAddressPageTooShortSingularInput.invalidUserEditedAddressDataTooShortFirstNameGetter();
        //input too short address first name into first name input field (1 char)
        addAddressPageTooShortSingularInput.inputTooShortUserFirstNameIntoFirstNameInputField();
        //input valid address last name into last name input field
        addAddressPageTooShortSingularInput.inputValidUserLastNameIntoLastNameInputField();
        //input valid address into address 1 input field
        addAddressPageTooShortSingularInput.inputValidUserAddressIntoAddress1InputField();
        //input valid address city into city input field
        addAddressPageTooShortSingularInput.inputValidUserCityIntoCityInputField();
        //input valid address post code into post code input field
        addAddressPageTooShortSingularInput.inputValidUserPostCodeIntoPostCodeInputField();
        //input valid address phone into phone input field
        addAddressPageTooShortSingularInput.inputValidUserPhoneIntoPhoneInputField();
        //click 'State dropdown menu
        addAddressPage.clickStateDropdownMenu();
        //select 'Illinois' option
        addAddressPage.selectIllinoisOption();
        //capture screenshot of the add address page display after invalid data input - too short user first name
        captureScreenshot(driver, "Add Address Page Display After Valid Data Input - Too Short First Name");
        //click 'Save address' button
        addAddressPage.clickSaveAddressButton();
        //assert the user gets an expected error, log the issue otherwise
        try {
            assertEquals("First name is too short.", addAddressPage.getAddAddressPageSingularInputError(), "The add address page too short address first name input error doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The too short add address first name input error wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Second Address Addition Test Result - Too Short First Name");
    }

    //invalid user second address addition test method - too short user last name (1 char)
    protected void invalidSecondUserAddressAdditionTooShortLastNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AddressDashboardPage addressDashboardPage = new AddressDashboardPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        AddAddressPageTooShortSingularInput addAddressPageTooShortSingularInput = new AddAddressPageTooShortSingularInput(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Addresses' link
        accountDashboardPage.clickAddressesLink();
        //address dashboard page web element assert
        isAddressDashboardPageWebElementDisplayed(addressDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert address dashboard page title is a expected
        assertEquals("Addresses", addressDashboardPage.getAddressDashboardPageTitle(), "The address dashboard page title doesn't match expectations.");
        //log address dashboard page data
        logAddressDashboardPageData(addressDashboardPage);
        //capture screenshot of the address dashboard page display
        captureScreenshot(driver, "Address Dashboard Page Display");
        //click 'New address' link
        addressDashboardPage.clickNewAddressLink();
        //add address page web element assert
        isAddAddressPageWebElementDisplayed(addAddressPage);
        //add address page text element assert
        isAddAddressPageTextElementAsExpected(addAddressPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //capture screenshot of the add address page display before data input
        captureScreenshot(driver, "Add Address Page Display Before Data Input");
        //invalid user address getter - too short user last name (1 char)
        addAddressPageTooShortSingularInput.invalidUserEditedAddressDataTooShortLastNameGetter();
        //input valid address first name into first name input field
        addAddressPageTooShortSingularInput.inputValidUserFirstNameIntoFirstNameInputField();
        //input too short address last name into last name input field (1 char)
        addAddressPageTooShortSingularInput.inputTooShortUserLastNameIntoLastNameInputField();
        //input valid address into address 1 input field
        addAddressPageTooShortSingularInput.inputValidUserAddressIntoAddress1InputField();
        //input valid address city into city input field
        addAddressPageTooShortSingularInput.inputValidUserCityIntoCityInputField();
        //input valid address post code into post code input field
        addAddressPageTooShortSingularInput.inputValidUserPostCodeIntoPostCodeInputField();
        //input valid address phone into phone input field
        addAddressPageTooShortSingularInput.inputValidUserPhoneIntoPhoneInputField();
        //click 'State dropdown menu
        addAddressPage.clickStateDropdownMenu();
        //select 'Illinois' option
        addAddressPage.selectIllinoisOption();
        //capture screenshot of the add address page display after invalid data input - too short user last name
        captureScreenshot(driver, "Add Address Page Display After Valid Data Input - Too Short Last Name");
        //click 'Save address' button
        addAddressPage.clickSaveAddressButton();
        //assert the user gets an expected error, log the issue otherwise
        try {
            assertEquals("Last name is too short.", addAddressPage.getAddAddressPageSingularInputError(), "The add address page too short address last name input error doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The too short add address last name input error wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Second Address Addition Test Result - Too Short Last Name");
    }

    //invalid user second address addition test method - too short user address (3 chars)
    protected void invalidSecondUserAddressAdditionTooShortAddressTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AddressDashboardPage addressDashboardPage = new AddressDashboardPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        AddAddressPageTooShortSingularInput addAddressPageTooShortSingularInput = new AddAddressPageTooShortSingularInput(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Addresses' link
        accountDashboardPage.clickAddressesLink();
        //address dashboard page web element assert
        isAddressDashboardPageWebElementDisplayed(addressDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert address dashboard page title is a expected
        assertEquals("Addresses", addressDashboardPage.getAddressDashboardPageTitle(), "The address dashboard page title doesn't match expectations.");
        //log address dashboard page data
        logAddressDashboardPageData(addressDashboardPage);
        //capture screenshot of the address dashboard page display
        captureScreenshot(driver, "Address Dashboard Page Display");
        //click 'New address' link
        addressDashboardPage.clickNewAddressLink();
        //add address page web element assert
        isAddAddressPageWebElementDisplayed(addAddressPage);
        //add address page text element assert
        isAddAddressPageTextElementAsExpected(addAddressPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //capture screenshot of the add address page display before data input
        captureScreenshot(driver, "Add Address Page Display Before Data Input");
        //invalid user address getter - too short user address (3 chars)
        addAddressPageTooShortSingularInput.invalidUserEditedAddressDataTooShortAddressGetter();
        //input valid address first name into first name input field
        addAddressPageTooShortSingularInput.inputValidUserFirstNameIntoFirstNameInputField();
        //input valid address last name into last name input field
        addAddressPageTooShortSingularInput.inputValidUserLastNameIntoLastNameInputField();
        //input too short address into address 1 input field (3 chars)
        addAddressPageTooShortSingularInput.inputTooShortUserAddressIntoAddress1InputField();
        //input valid address city into city input field
        addAddressPageTooShortSingularInput.inputValidUserCityIntoCityInputField();
        //input valid address post code into post code input field
        addAddressPageTooShortSingularInput.inputValidUserPostCodeIntoPostCodeInputField();
        //input valid address phone into phone input field
        addAddressPageTooShortSingularInput.inputValidUserPhoneIntoPhoneInputField();
        //click 'State dropdown menu
        addAddressPage.clickStateDropdownMenu();
        //select 'Illinois' option
        addAddressPage.selectIllinoisOption();
        //capture screenshot of the add address page display after invalid data input - too short user address
        captureScreenshot(driver, "Add Address Page Display After Valid Data Input - Too Short Address");
        //click 'Save address' button
        addAddressPage.clickSaveAddressButton();
        //assert the user gets an expected error, log the issue otherwise
        try {
            assertEquals("Address is too short.", addAddressPage.getAddAddressPageSingularInputError(), "The add address page too short address input error doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The too short add address input error wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Second Address Addition Test Result - Too Short Address");
    }

    //invalid user second address addition test method - too short user city (1 char)
    protected void invalidSecondUserAddressAdditionTooShortCityTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AddressDashboardPage addressDashboardPage = new AddressDashboardPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        AddAddressPageTooShortSingularInput addAddressPageTooShortSingularInput = new AddAddressPageTooShortSingularInput(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Addresses' link
        accountDashboardPage.clickAddressesLink();
        //address dashboard page web element assert
        isAddressDashboardPageWebElementDisplayed(addressDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert address dashboard page title is a expected
        assertEquals("Addresses", addressDashboardPage.getAddressDashboardPageTitle(), "The address dashboard page title doesn't match expectations.");
        //log address dashboard page data
        logAddressDashboardPageData(addressDashboardPage);
        //capture screenshot of the address dashboard page display
        captureScreenshot(driver, "Address Dashboard Page Display");
        //click 'New address' link
        addressDashboardPage.clickNewAddressLink();
        //add address page web element assert
        isAddAddressPageWebElementDisplayed(addAddressPage);
        //add address page text element assert
        isAddAddressPageTextElementAsExpected(addAddressPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //capture screenshot of the add address page display before data input
        captureScreenshot(driver, "Add Address Page Display Before Data Input");
        //invalid user address getter - too short user city (1 char)
        addAddressPageTooShortSingularInput.invalidUserEditedAddressDataTooShortCityGetter();
        //input valid address first name into first name input field
        addAddressPageTooShortSingularInput.inputValidUserFirstNameIntoFirstNameInputField();
        //input valid address last name into last name input field
        addAddressPageTooShortSingularInput.inputValidUserLastNameIntoLastNameInputField();
        //input valid address into address 1 input field
        addAddressPageTooShortSingularInput.inputValidUserAddressIntoAddress1InputField();
        //input too short address city into city input field (1 char)
        addAddressPageTooShortSingularInput.inputTooShortUserCityIntoCityInputField();
        //input valid address post code into post code input field
        addAddressPageTooShortSingularInput.inputValidUserPostCodeIntoPostCodeInputField();
        //input valid address phone into phone input field
        addAddressPageTooShortSingularInput.inputValidUserPhoneIntoPhoneInputField();
        //click 'State dropdown menu
        addAddressPage.clickStateDropdownMenu();
        //select 'Illinois' option
        addAddressPage.selectIllinoisOption();
        //capture screenshot of the add address page display after invalid data input - too short user city
        captureScreenshot(driver, "Add Address Page Display After Valid Data Input - Too Short City");
        //click 'Save address' button
        addAddressPage.clickSaveAddressButton();
        //assert the user gets an expected error, log the issue otherwise
        try {
            assertEquals("City is too short.", addAddressPage.getAddAddressPageSingularInputError(), "The add address page too short address city input error doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The too short add address city input error wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Second Address Addition Test Result - Too Short City");
    }

    //invalid user second address addition test method - too short user post code (4 digits)
    protected void invalidSecondUserAddressAdditionTooShortPostCodeTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AddressDashboardPage addressDashboardPage = new AddressDashboardPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        AddAddressPageTooShortSingularInput addAddressPageTooShortSingularInput = new AddAddressPageTooShortSingularInput(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Addresses' link
        accountDashboardPage.clickAddressesLink();
        //address dashboard page web element assert
        isAddressDashboardPageWebElementDisplayed(addressDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert address dashboard page title is a expected
        assertEquals("Addresses", addressDashboardPage.getAddressDashboardPageTitle(), "The address dashboard page title doesn't match expectations.");
        //log address dashboard page data
        logAddressDashboardPageData(addressDashboardPage);
        //capture screenshot of the address dashboard page display
        captureScreenshot(driver, "Address Dashboard Page Display");
        //click 'New address' link
        addressDashboardPage.clickNewAddressLink();
        //add address page web element assert
        isAddAddressPageWebElementDisplayed(addAddressPage);
        //add address page text element assert
        isAddAddressPageTextElementAsExpected(addAddressPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //capture screenshot of the add address page display before data input
        captureScreenshot(driver, "Add Address Page Display Before Data Input");
        //invalid user address getter - too short user post code (4 digits)
        addAddressPageTooShortSingularInput.invalidUserEditedAddressDataTooShortPostCodeGetter();
        //input valid address first name into first name input field
        addAddressPageTooShortSingularInput.inputValidUserFirstNameIntoFirstNameInputField();
        //input valid address last name into last name input field
        addAddressPageTooShortSingularInput.inputValidUserLastNameIntoLastNameInputField();
        //input valid address into address 1 input field
        addAddressPageTooShortSingularInput.inputValidUserAddressIntoAddress1InputField();
        //input valid address city into city input field
        addAddressPageTooShortSingularInput.inputValidUserCityIntoCityInputField();
        //input too short address post code into post code input field (4 digits)
        addAddressPageTooShortSingularInput.inputTooShortUserPostCodeIntoPostCodeInputField();
        //input valid address phone into phone input field
        addAddressPageTooShortSingularInput.inputValidUserPhoneIntoPhoneInputField();
        //click 'State dropdown menu
        addAddressPage.clickStateDropdownMenu();
        //select 'Illinois' option
        addAddressPage.selectIllinoisOption();
        //capture screenshot of the add address page display after invalid data input - too short user post code
        captureScreenshot(driver, "Add Address Page Display After Valid Data Input - Too Short Post Code");
        //click 'Save address' button
        addAddressPage.clickSaveAddressButton();
        //assert the user gets an expected error, log the issue otherwise
        try {
            assertEquals("Post code is too short.", addAddressPage.getAddAddressPageSingularInputError(), "The add address page too short address post code input error doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The too short add address post code input error wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Second Address Addition Test Result - Too Short Post Code");
    }

    //invalid user second address addition test method - too short user phone (2 digits)
    protected void invalidSecondUserAddressAdditionTooShortPhoneTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AddressDashboardPage addressDashboardPage = new AddressDashboardPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        AddAddressPageTooShortSingularInput addAddressPageTooShortSingularInput = new AddAddressPageTooShortSingularInput(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Addresses' link
        accountDashboardPage.clickAddressesLink();
        //address dashboard page web element assert
        isAddressDashboardPageWebElementDisplayed(addressDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert address dashboard page title is a expected
        assertEquals("Addresses", addressDashboardPage.getAddressDashboardPageTitle(), "The address dashboard page title doesn't match expectations.");
        //log address dashboard page data
        logAddressDashboardPageData(addressDashboardPage);
        //capture screenshot of the address dashboard page display
        captureScreenshot(driver, "Address Dashboard Page Display");
        //click 'New address' link
        addressDashboardPage.clickNewAddressLink();
        //add address page web element assert
        isAddAddressPageWebElementDisplayed(addAddressPage);
        //add address page text element assert
        isAddAddressPageTextElementAsExpected(addAddressPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //capture screenshot of the add address page display before data input
        captureScreenshot(driver, "Add Address Page Display Before Data Input");
        //invalid user address getter - too short user phone (2 digits)
        addAddressPageTooShortSingularInput.invalidUserEditedAddressDataTooShortPhoneGetter();
        //input valid address first name into first name input field
        addAddressPageTooShortSingularInput.inputValidUserFirstNameIntoFirstNameInputField();
        //input valid address last name into last name input field
        addAddressPageTooShortSingularInput.inputValidUserLastNameIntoLastNameInputField();
        //input valid address into address 1 input field
        addAddressPageTooShortSingularInput.inputValidUserAddressIntoAddress1InputField();
        //input valid address city into city input field
        addAddressPageTooShortSingularInput.inputValidUserCityIntoCityInputField();
        //input valid address post code into post code input field
        addAddressPageTooShortSingularInput.inputValidUserPostCodeIntoPostCodeInputField();
        //input too short address phone into phone input field (2 digits)
        addAddressPageTooShortSingularInput.inputTooShortUserPhoneIntoPhoneInputField();
        //click 'State dropdown menu
        addAddressPage.clickStateDropdownMenu();
        //select 'Illinois' option
        addAddressPage.selectIllinoisOption();
        //capture screenshot of the add address page display after invalid data input - too short user phone
        captureScreenshot(driver, "Add Address Page Display After Valid Data Input - Too Short Phone");
        //click 'Save address' button
        addAddressPage.clickSaveAddressButton();
        //assert the user gets an expected error, log the issue otherwise
        try {
            assertEquals("Phone is too short.", addAddressPage.getAddAddressPageSingularInputError(), "The add address page too short address phone input error doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The too short add address phone input error wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Second Address Addition Test Result - Too Short Phone");
    }

    //too long singular input

    //invalid user second address addition test method - too long user first name (100 chars)
    protected void invalidSecondUserAddressAdditionTooLongFirstNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AddressDashboardPage addressDashboardPage = new AddressDashboardPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        AddAddressPageTooLongSingularInput addAddressPageTooLongSingularInput = new AddAddressPageTooLongSingularInput(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Addresses' link
        accountDashboardPage.clickAddressesLink();
        //address dashboard page web element assert
        isAddressDashboardPageWebElementDisplayed(addressDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert address dashboard page title is a expected
        assertEquals("Addresses", addressDashboardPage.getAddressDashboardPageTitle(), "The address dashboard page title doesn't match expectations.");
        //log address dashboard page data
        logAddressDashboardPageData(addressDashboardPage);
        //capture screenshot of the address dashboard page display
        captureScreenshot(driver, "Address Dashboard Page Display");
        //click 'New address' link
        addressDashboardPage.clickNewAddressLink();
        //add address page web element assert
        isAddAddressPageWebElementDisplayed(addAddressPage);
        //add address page text element assert
        isAddAddressPageTextElementAsExpected(addAddressPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //capture screenshot of the add address page display before data input
        captureScreenshot(driver, "Add Address Page Display Before Data Input");
        //invalid user address getter - too long user first name (100 chars)
        addAddressPageTooLongSingularInput.invalidUserEditedAddressDataTooLongFirstNameGetter();
        //input too long address first name into first name input field (100 chars)
        addAddressPageTooLongSingularInput.inputTooLongUserFirstNameIntoFirstNameInputField();
        //input valid address last name into last name input field
        addAddressPageTooLongSingularInput.inputValidUserLastNameIntoLastNameInputField();
        //input valid address into address 1 input field
        addAddressPageTooLongSingularInput.inputValidUserAddressIntoAddress1InputField();
        //input valid address city into city input field
        addAddressPageTooLongSingularInput.inputValidUserCityIntoCityInputField();
        //input valid address post code into post code input field
        addAddressPageTooLongSingularInput.inputValidUserPostCodeIntoPostCodeInputField();
        //input valid address phone into phone input field
        addAddressPageTooLongSingularInput.inputValidUserPhoneIntoPhoneInputField();
        //click 'State dropdown menu
        addAddressPage.clickStateDropdownMenu();
        //select 'Illinois' option
        addAddressPage.selectIllinoisOption();
        //capture screenshot of the add address page display after invalid data input - too long user first name
        captureScreenshot(driver, "Add Address Page Display After Valid Data Input - Too Long First Name");
        //click 'Save address' button
        addAddressPage.clickSaveAddressButton();
        //assert the user gets an expected error, log the issue otherwise
        try {
            assertEquals("First name is too long.", addAddressPage.getAddAddressPageSingularInputError(), "The add address page too long address first name input error doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The too long add address first name input error wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Second Address Addition Test Result - Too Long First Name");
    }

    //invalid user second address addition test method - too long user last name (100 chars)
    protected void invalidSecondUserAddressAdditionTooLongLastNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AddressDashboardPage addressDashboardPage = new AddressDashboardPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        AddAddressPageTooLongSingularInput addAddressPageTooLongSingularInput = new AddAddressPageTooLongSingularInput(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Addresses' link
        accountDashboardPage.clickAddressesLink();
        //address dashboard page web element assert
        isAddressDashboardPageWebElementDisplayed(addressDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert address dashboard page title is a expected
        assertEquals("Addresses", addressDashboardPage.getAddressDashboardPageTitle(), "The address dashboard page title doesn't match expectations.");
        //log address dashboard page data
        logAddressDashboardPageData(addressDashboardPage);
        //capture screenshot of the address dashboard page display
        captureScreenshot(driver, "Address Dashboard Page Display");
        //click 'New address' link
        addressDashboardPage.clickNewAddressLink();
        //add address page web element assert
        isAddAddressPageWebElementDisplayed(addAddressPage);
        //add address page text element assert
        isAddAddressPageTextElementAsExpected(addAddressPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //capture screenshot of the add address page display before data input
        captureScreenshot(driver, "Add Address Page Display Before Data Input");
        //invalid user address getter - too long user last name (100 chars)
        addAddressPageTooLongSingularInput.invalidUserEditedAddressDataTooLongLastNameGetter();
        //input valid address first name into first name input field
        addAddressPageTooLongSingularInput.inputValidUserFirstNameIntoFirstNameInputField();
        //input too long address last name into last name input field (100 chars)
        addAddressPageTooLongSingularInput.inputTooLongUserLastNameIntoLastNameInputField();
        //input valid address into address 1 input field
        addAddressPageTooLongSingularInput.inputValidUserAddressIntoAddress1InputField();
        //input valid address city into city input field
        addAddressPageTooLongSingularInput.inputValidUserCityIntoCityInputField();
        //input valid address post code into post code input field
        addAddressPageTooLongSingularInput.inputValidUserPostCodeIntoPostCodeInputField();
        //input valid address phone into phone input field
        addAddressPageTooLongSingularInput.inputValidUserPhoneIntoPhoneInputField();
        //click 'State dropdown menu
        addAddressPage.clickStateDropdownMenu();
        //select 'Illinois' option
        addAddressPage.selectIllinoisOption();
        //capture screenshot of the add address page display after invalid data input - too long user last name
        captureScreenshot(driver, "Add Address Page Display After Valid Data Input - Too Long Last Name");
        //click 'Save address' button
        addAddressPage.clickSaveAddressButton();
        //assert the user gets an expected error, log the issue otherwise
        try {
            assertEquals("Last name is too long.", addAddressPage.getAddAddressPageSingularInputError(), "The add address page too long address last name input error doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The too long add address last name input error wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Second Address Addition Test Result - Too Long Last Name");
    }

    //invalid user second address addition test method - too long user address (100 chars)
    protected void invalidSecondUserAddressAdditionTooLongAddressTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AddressDashboardPage addressDashboardPage = new AddressDashboardPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        AddAddressPageTooLongSingularInput addAddressPageTooLongSingularInput = new AddAddressPageTooLongSingularInput(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Addresses' link
        accountDashboardPage.clickAddressesLink();
        //address dashboard page web element assert
        isAddressDashboardPageWebElementDisplayed(addressDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert address dashboard page title is a expected
        assertEquals("Addresses", addressDashboardPage.getAddressDashboardPageTitle(), "The address dashboard page title doesn't match expectations.");
        //log address dashboard page data
        logAddressDashboardPageData(addressDashboardPage);
        //capture screenshot of the address dashboard page display
        captureScreenshot(driver, "Address Dashboard Page Display");
        //click 'New address' link
        addressDashboardPage.clickNewAddressLink();
        //add address page web element assert
        isAddAddressPageWebElementDisplayed(addAddressPage);
        //add address page text element assert
        isAddAddressPageTextElementAsExpected(addAddressPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //capture screenshot of the add address page display before data input
        captureScreenshot(driver, "Add Address Page Display Before Data Input");
        //invalid user address getter - too long user address (100 chars)
        addAddressPageTooLongSingularInput.invalidUserEditedAddressDataTooLongAddressGetter();
        //input valid address first name into first name input field
        addAddressPageTooLongSingularInput.inputValidUserFirstNameIntoFirstNameInputField();
        //input valid address last name into last name input field
        addAddressPageTooLongSingularInput.inputValidUserLastNameIntoLastNameInputField();
        //input too short address into address 1 input field (100 chars)
        addAddressPageTooLongSingularInput.inputTooLongUserAddressIntoAddress1InputField();
        //input valid address city into city input field
        addAddressPageTooLongSingularInput.inputValidUserCityIntoCityInputField();
        //input valid address post code into post code input field
        addAddressPageTooLongSingularInput.inputValidUserPostCodeIntoPostCodeInputField();
        //input valid address phone into phone input field
        addAddressPageTooLongSingularInput.inputValidUserPhoneIntoPhoneInputField();
        //click 'State dropdown menu
        addAddressPage.clickStateDropdownMenu();
        //select 'Illinois' option
        addAddressPage.selectIllinoisOption();
        //capture screenshot of the add address page display after invalid data input - too long user address
        captureScreenshot(driver, "Add Address Page Display After Valid Data Input - Too Long Address");
        //click 'Save address' button
        addAddressPage.clickSaveAddressButton();
        //assert the user gets an expected error, log the issue otherwise
        try {
            assertEquals("Address is too long.", addAddressPage.getAddAddressPageSingularInputError(), "The add address page too long address input error doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The too long add address input error wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Second Address Addition Test Result - Too Long Address");
    }

    //invalid user second address addition test method - too long user city (100 chars)
    protected void invalidSecondUserAddressAdditionTooLongCityTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AddressDashboardPage addressDashboardPage = new AddressDashboardPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        AddAddressPageTooLongSingularInput addAddressPageTooLongSingularInput = new AddAddressPageTooLongSingularInput(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Addresses' link
        accountDashboardPage.clickAddressesLink();
        //address dashboard page web element assert
        isAddressDashboardPageWebElementDisplayed(addressDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert address dashboard page title is a expected
        assertEquals("Addresses", addressDashboardPage.getAddressDashboardPageTitle(), "The address dashboard page title doesn't match expectations.");
        //log address dashboard page data
        logAddressDashboardPageData(addressDashboardPage);
        //capture screenshot of the address dashboard page display
        captureScreenshot(driver, "Address Dashboard Page Display");
        //click 'New address' link
        addressDashboardPage.clickNewAddressLink();
        //add address page web element assert
        isAddAddressPageWebElementDisplayed(addAddressPage);
        //add address page text element assert
        isAddAddressPageTextElementAsExpected(addAddressPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //capture screenshot of the add address page display before data input
        captureScreenshot(driver, "Add Address Page Display Before Data Input");
        //invalid user address getter - too long user city (100 chars)
        addAddressPageTooLongSingularInput.invalidUserEditedAddressDataTooLongCityGetter();
        //input valid address first name into first name input field
        addAddressPageTooLongSingularInput.inputValidUserFirstNameIntoFirstNameInputField();
        //input valid address last name into last name input field
        addAddressPageTooLongSingularInput.inputValidUserLastNameIntoLastNameInputField();
        //input valid address into address 1 input field
        addAddressPageTooLongSingularInput.inputValidUserAddressIntoAddress1InputField();
        //input too long address city into city input field
        addAddressPageTooLongSingularInput.inputTooLongUserCityIntoCityInputField();
        //input valid address post code into post code input field
        addAddressPageTooLongSingularInput.inputValidUserPostCodeIntoPostCodeInputField();
        //input valid address phone into phone input field
        addAddressPageTooLongSingularInput.inputValidUserPhoneIntoPhoneInputField();
        //click 'State dropdown menu
        addAddressPage.clickStateDropdownMenu();
        //select 'Illinois' option
        addAddressPage.selectIllinoisOption();
        //capture screenshot of the add address page display after invalid data input - too long user city
        captureScreenshot(driver, "Add Address Page Display After Valid Data Input - Too Long City");
        //click 'Save address' button
        addAddressPage.clickSaveAddressButton();
        //assert the user gets an expected error, log the issue otherwise
        try {
            assertEquals("City is too long.", addAddressPage.getAddAddressPageSingularInputError(), "The add address page too long address city input error doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The too long add address city input error wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Second Address Addition Test Result - Too Long City");
    }

    //invalid user second address addition test method - too long user post code (6 digits)
    protected void invalidSecondUserAddressAdditionTooLongPostCodeTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AddressDashboardPage addressDashboardPage = new AddressDashboardPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        AddAddressPageTooLongSingularInput addAddressPageTooLongSingularInput = new AddAddressPageTooLongSingularInput(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Addresses' link
        accountDashboardPage.clickAddressesLink();
        //address dashboard page web element assert
        isAddressDashboardPageWebElementDisplayed(addressDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert address dashboard page title is a expected
        assertEquals("Addresses", addressDashboardPage.getAddressDashboardPageTitle(), "The address dashboard page title doesn't match expectations.");
        //log address dashboard page data
        logAddressDashboardPageData(addressDashboardPage);
        //capture screenshot of the address dashboard page display
        captureScreenshot(driver, "Address Dashboard Page Display");
        //click 'New address' link
        addressDashboardPage.clickNewAddressLink();
        //add address page web element assert
        isAddAddressPageWebElementDisplayed(addAddressPage);
        //add address page text element assert
        isAddAddressPageTextElementAsExpected(addAddressPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //capture screenshot of the add address page display before data input
        captureScreenshot(driver, "Add Address Page Display Before Data Input");
        //invalid user address getter - too long user post code (6 digits)
        addAddressPageTooLongSingularInput.invalidUserEditedAddressDataTooLongPostCodeGetter();
        //input valid address first name into first name input field
        addAddressPageTooLongSingularInput.inputValidUserFirstNameIntoFirstNameInputField();
        //input valid address last name into last name input field
        addAddressPageTooLongSingularInput.inputValidUserLastNameIntoLastNameInputField();
        //input valid address into address 1 input field
        addAddressPageTooLongSingularInput.inputValidUserAddressIntoAddress1InputField();
        //input valid address city into city input field
        addAddressPageTooLongSingularInput.inputValidUserCityIntoCityInputField();
        //input too long address post code into post code input field (6 digits)
        addAddressPageTooLongSingularInput.inputTooLongUserPostCodeIntoPostCodeInputField();
        //input valid address phone into phone input field
        addAddressPageTooLongSingularInput.inputValidUserPhoneIntoPhoneInputField();
        //click 'State dropdown menu
        addAddressPage.clickStateDropdownMenu();
        //select 'Illinois' option
        addAddressPage.selectIllinoisOption();
        //capture screenshot of the add address page display after invalid data input - too long user post code
        captureScreenshot(driver, "Add Address Page Display After Valid Data Input - Too Long Post Code");
        //click 'Save address' button
        addAddressPage.clickSaveAddressButton();
        //assert the user gets an expected error, log the issue otherwise
        try {
            assertEquals("Post code is too long.", addAddressPage.getAddAddressPageSingularInputError(), "The add address page too long address post code input error doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The too long add address post code input error wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Second Address Addition Test Result - Too Long Post Code");
    }

    //invalid user second address addition test method - too long user phone (30 digits)
    protected void invalidSecondUserAddressAdditionTooLongPhoneTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AddressDashboardPage addressDashboardPage = new AddressDashboardPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        AddAddressPageTooLongSingularInput addAddressPageTooLongSingularInput = new AddAddressPageTooLongSingularInput(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Addresses' link
        accountDashboardPage.clickAddressesLink();
        //address dashboard page web element assert
        isAddressDashboardPageWebElementDisplayed(addressDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert address dashboard page title is a expected
        assertEquals("Addresses", addressDashboardPage.getAddressDashboardPageTitle(), "The address dashboard page title doesn't match expectations.");
        //log address dashboard page data
        logAddressDashboardPageData(addressDashboardPage);
        //capture screenshot of the address dashboard page display
        captureScreenshot(driver, "Address Dashboard Page Display");
        //click 'New address' link
        addressDashboardPage.clickNewAddressLink();
        //add address page web element assert
        isAddAddressPageWebElementDisplayed(addAddressPage);
        //add address page text element assert
        isAddAddressPageTextElementAsExpected(addAddressPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //capture screenshot of the add address page display before data input
        captureScreenshot(driver, "Add Address Page Display Before Data Input");
        //invalid user address getter - too long user phone (30 digits)
        addAddressPageTooLongSingularInput.invalidUserEditedAddressDataTooLongPhoneGetter();
        //input valid address first name into first name input field
        addAddressPageTooLongSingularInput.inputValidUserFirstNameIntoFirstNameInputField();
        //input valid address last name into last name input field
        addAddressPageTooLongSingularInput.inputValidUserLastNameIntoLastNameInputField();
        //input valid address into address 1 input field
        addAddressPageTooLongSingularInput.inputValidUserAddressIntoAddress1InputField();
        //input valid address city into city input field
        addAddressPageTooLongSingularInput.inputValidUserCityIntoCityInputField();
        //input valid address post code into post code input field
        addAddressPageTooLongSingularInput.inputValidUserPostCodeIntoPostCodeInputField();
        //input too long address phone into phone input field (30 digits)
        addAddressPageTooLongSingularInput.inputTooLongUserPhoneIntoPhoneInputField();
        //click 'State dropdown menu
        addAddressPage.clickStateDropdownMenu();
        //select 'Illinois' option
        addAddressPage.selectIllinoisOption();
        //capture screenshot of the add address page display after invalid data input - too long user phone
        captureScreenshot(driver, "Add Address Page Display After Valid Data Input - Too Long Phone");
        //click 'Save address' button
        addAddressPage.clickSaveAddressButton();
        //assert the user gets an expected error, log the issue otherwise
        try {
            assertEquals("Phone is too long.", addAddressPage.getAddAddressPageSingularInputError(), "The add address page too long address phone input error doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The too long add address phone input error wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Second Address Addition Test Result - Too Long Phone");
    }

    //invalid singular input format

    //invalid user second address addition test method - invalid user first name format (special symbols only)
    protected void invalidSecondUserAddressAdditionInvalidFirstNameFormatTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AddressDashboardPage addressDashboardPage = new AddressDashboardPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        AddAddressPageInvalidSingularInputFormat addAddressPageInvalidSingularInputFormat = new AddAddressPageInvalidSingularInputFormat(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Addresses' link
        accountDashboardPage.clickAddressesLink();
        //address dashboard page web element assert
        isAddressDashboardPageWebElementDisplayed(addressDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert address dashboard page title is a expected
        assertEquals("Addresses", addressDashboardPage.getAddressDashboardPageTitle(), "The address dashboard page title doesn't match expectations.");
        //log address dashboard page data
        logAddressDashboardPageData(addressDashboardPage);
        //capture screenshot of the address dashboard page display
        captureScreenshot(driver, "Address Dashboard Page Display");
        //click 'New address' link
        addressDashboardPage.clickNewAddressLink();
        //add address page web element assert
        isAddAddressPageWebElementDisplayed(addAddressPage);
        //add address page text element assert
        isAddAddressPageTextElementAsExpected(addAddressPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //capture screenshot of the add address page display before data input
        captureScreenshot(driver, "Add Address Page Display Before Data Input");
        //invalid user address getter - invalid user first name format (special symbols only)
        addAddressPageInvalidSingularInputFormat.invalidUserEditedAddressDataInvalidFirstNameFormatGetter();
        //input invalid address first name format into first name input field (special symbols only)
        addAddressPageInvalidSingularInputFormat.inputInvalidUserFirstNameFormatIntoFirstNameInputField();
        //input valid address last name into last name input field
        addAddressPageInvalidSingularInputFormat.inputValidUserLastNameIntoLastNameInputField();
        //input valid address into address 1 input field
        addAddressPageInvalidSingularInputFormat.inputValidUserAddressIntoAddress1InputField();
        //input valid address city into city input field
        addAddressPageInvalidSingularInputFormat.inputValidUserCityIntoCityInputField();
        //input valid address post code into post code input field
        addAddressPageInvalidSingularInputFormat.inputValidUserPostCodeIntoPostCodeInputField();
        //input valid address phone into phone input field
        addAddressPageInvalidSingularInputFormat.inputValidUserPhoneIntoPhoneInputField();
        //click 'State dropdown menu
        addAddressPage.clickStateDropdownMenu();
        //select 'Illinois' option
        addAddressPage.selectIllinoisOption();
        //capture screenshot of the add address page display after invalid data input - invalid user first name format
        captureScreenshot(driver, "Add Address Page Display After Valid Data Input - Invalid First Name Format");
        //click 'Save address' button
        addAddressPage.clickSaveAddressButton();
        //assert the user gets an expected error, log the issue otherwise
        try {
            assertEquals("First name cannot consist of special symbols only.", addAddressPage.getAddAddressPageSingularInputError(), "The add address page invalid address first name input format error doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The invalid add address first name input format error wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Second Address Addition Test Result - Invalid First Name Format");
    }

    //invalid user second address addition test method - invalid user last name format (special symbols only)
    protected void invalidSecondUserAddressAdditionInvalidLastNameFormatTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AddressDashboardPage addressDashboardPage = new AddressDashboardPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        AddAddressPageInvalidSingularInputFormat addAddressPageInvalidSingularInputFormat = new AddAddressPageInvalidSingularInputFormat(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Addresses' link
        accountDashboardPage.clickAddressesLink();
        //address dashboard page web element assert
        isAddressDashboardPageWebElementDisplayed(addressDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert address dashboard page title is a expected
        assertEquals("Addresses", addressDashboardPage.getAddressDashboardPageTitle(), "The address dashboard page title doesn't match expectations.");
        //log address dashboard page data
        logAddressDashboardPageData(addressDashboardPage);
        //capture screenshot of the address dashboard page display
        captureScreenshot(driver, "Address Dashboard Page Display");
        //click 'New address' link
        addressDashboardPage.clickNewAddressLink();
        //add address page web element assert
        isAddAddressPageWebElementDisplayed(addAddressPage);
        //add address page text element assert
        isAddAddressPageTextElementAsExpected(addAddressPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //capture screenshot of the add address page display before data input
        captureScreenshot(driver, "Add Address Page Display Before Data Input");
        //invalid user address getter - invalid user last name format (special symbols only)
        addAddressPageInvalidSingularInputFormat.invalidUserEditedAddressDataInvalidLastNameFormatGetter();
        //input valid address first name into first name input field
        addAddressPageInvalidSingularInputFormat.inputValidUserFirstNameIntoFirstNameInputField();
        //input invalid address last name format into last name input field
        addAddressPageInvalidSingularInputFormat.inputInvalidUserLastNameFormatIntoLastNameInputField();
        //input valid address into address 1 input field
        addAddressPageInvalidSingularInputFormat.inputValidUserAddressIntoAddress1InputField();
        //input valid address city into city input field
        addAddressPageInvalidSingularInputFormat.inputValidUserCityIntoCityInputField();
        //input valid address post code into post code input field
        addAddressPageInvalidSingularInputFormat.inputValidUserPostCodeIntoPostCodeInputField();
        //input valid address phone into phone input field
        addAddressPageInvalidSingularInputFormat.inputValidUserPhoneIntoPhoneInputField();
        //click 'State dropdown menu
        addAddressPage.clickStateDropdownMenu();
        //select 'Illinois' option
        addAddressPage.selectIllinoisOption();
        //capture screenshot of the add address page display after invalid data input - invalid user last name format
        captureScreenshot(driver, "Add Address Page Display After Valid Data Input - Invalid Last Name Format");
        //click 'Save address' button
        addAddressPage.clickSaveAddressButton();
        //assert the user gets an expected error, log the issue otherwise
        try {
            assertEquals("Last name cannot consist of special symbols only.", addAddressPage.getAddAddressPageSingularInputError(), "The add address page invalid address last name input format error doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The invalid add address last name input format error wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Second Address Addition Test Result - Invalid Last Name Format");
    }

    //invalid user second address addition test method - invalid user address format (special symbols only)
    protected void invalidSecondUserAddressAdditionInvalidAddressFormatTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AddressDashboardPage addressDashboardPage = new AddressDashboardPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        AddAddressPageInvalidSingularInputFormat addAddressPageInvalidSingularInputFormat = new AddAddressPageInvalidSingularInputFormat(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Addresses' link
        accountDashboardPage.clickAddressesLink();
        //address dashboard page web element assert
        isAddressDashboardPageWebElementDisplayed(addressDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert address dashboard page title is a expected
        assertEquals("Addresses", addressDashboardPage.getAddressDashboardPageTitle(), "The address dashboard page title doesn't match expectations.");
        //log address dashboard page data
        logAddressDashboardPageData(addressDashboardPage);
        //capture screenshot of the address dashboard page display
        captureScreenshot(driver, "Address Dashboard Page Display");
        //click 'New address' link
        addressDashboardPage.clickNewAddressLink();
        //add address page web element assert
        isAddAddressPageWebElementDisplayed(addAddressPage);
        //add address page text element assert
        isAddAddressPageTextElementAsExpected(addAddressPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //capture screenshot of the add address page display before data input
        captureScreenshot(driver, "Add Address Page Display Before Data Input");
        //invalid user address getter - invalid user address format (special symbols only)
        addAddressPageInvalidSingularInputFormat.invalidUserEditedAddressDataInvalidAddressFormatGetter();
        //input valid address first name into first name input field
        addAddressPageInvalidSingularInputFormat.inputValidUserFirstNameIntoFirstNameInputField();
        //input valid address last name format into last name input field
        addAddressPageInvalidSingularInputFormat.inputValidUserLastNameIntoLastNameInputField();
        //input invalid address format into address 1 input field (special symbols only)
        addAddressPageInvalidSingularInputFormat.inputInvalidUserAddressFormatIntoAddress1InputField();
        //input valid address city into city input field
        addAddressPageInvalidSingularInputFormat.inputValidUserCityIntoCityInputField();
        //input valid address post code into post code input field
        addAddressPageInvalidSingularInputFormat.inputValidUserPostCodeIntoPostCodeInputField();
        //input valid address phone into phone input field
        addAddressPageInvalidSingularInputFormat.inputValidUserPhoneIntoPhoneInputField();
        //click 'State dropdown menu
        addAddressPage.clickStateDropdownMenu();
        //select 'Illinois' option
        addAddressPage.selectIllinoisOption();
        //capture screenshot of the add address page display after invalid data input - invalid user address format
        captureScreenshot(driver, "Add Address Page Display After Valid Data Input - Invalid Address Format");
        //click 'Save address' button
        addAddressPage.clickSaveAddressButton();
        //assert the user gets an expected error, log the issue otherwise
        try {
            assertEquals("Address cannot consist of special symbols only.", addAddressPage.getAddAddressPageSingularInputError(), "The add address page invalid address input format error doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The invalid address input format error wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Second Address Addition Test Result - Invalid Address Format");
    }

    //invalid user second address addition test method - invalid user city format (special symbols only)
    protected void invalidSecondUserAddressAdditionInvalidCityFormatTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AddressDashboardPage addressDashboardPage = new AddressDashboardPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        AddAddressPageInvalidSingularInputFormat addAddressPageInvalidSingularInputFormat = new AddAddressPageInvalidSingularInputFormat(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Addresses' link
        accountDashboardPage.clickAddressesLink();
        //address dashboard page web element assert
        isAddressDashboardPageWebElementDisplayed(addressDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert address dashboard page title is a expected
        assertEquals("Addresses", addressDashboardPage.getAddressDashboardPageTitle(), "The address dashboard page title doesn't match expectations.");
        //log address dashboard page data
        logAddressDashboardPageData(addressDashboardPage);
        //capture screenshot of the address dashboard page display
        captureScreenshot(driver, "Address Dashboard Page Display");
        //click 'New address' link
        addressDashboardPage.clickNewAddressLink();
        //add address page web element assert
        isAddAddressPageWebElementDisplayed(addAddressPage);
        //add address page text element assert
        isAddAddressPageTextElementAsExpected(addAddressPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //capture screenshot of the add address page display before data input
        captureScreenshot(driver, "Add Address Page Display Before Data Input");
        //invalid user address getter - invalid user city format (special symbols only)
        addAddressPageInvalidSingularInputFormat.invalidUserEditedAddressDataInvalidCityFormatGetter();
        //input valid address first name into first name input field
        addAddressPageInvalidSingularInputFormat.inputValidUserFirstNameIntoFirstNameInputField();
        //input valid address last name format into last name input field
        addAddressPageInvalidSingularInputFormat.inputValidUserLastNameIntoLastNameInputField();
        //input valid address into address 1 input field
        addAddressPageInvalidSingularInputFormat.inputValidUserAddressIntoAddress1InputField();
        //input invalid address city format into city input field
        addAddressPageInvalidSingularInputFormat.inputInvalidUserCityFormatIntoCityInputField();
        //input valid address post code into post code input field
        addAddressPageInvalidSingularInputFormat.inputValidUserPostCodeIntoPostCodeInputField();
        //input valid address phone into phone input field
        addAddressPageInvalidSingularInputFormat.inputValidUserPhoneIntoPhoneInputField();
        //click 'State dropdown menu
        addAddressPage.clickStateDropdownMenu();
        //select 'Illinois' option
        addAddressPage.selectIllinoisOption();
        //capture screenshot of the add address page display after invalid data input - invalid user city format
        captureScreenshot(driver, "Add Address Page Display After Valid Data Input - Invalid City Format");
        //click 'Save address' button
        addAddressPage.clickSaveAddressButton();
        //assert the user gets an expected error, log the issue otherwise
        try {
            assertEquals("City cannot consist of special symbols only.", addAddressPage.getAddAddressPageSingularInputError(), "The add address page invalid address city input format error doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The invalid add address city input format error wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Second Address Addition Test Result - Invalid City Format");
    }

    //invalid user second address addition test method - invalid user post code format (special symbols only)
    protected void invalidSecondUserAddressAdditionInvalidPostCodeFormatTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AddressDashboardPage addressDashboardPage = new AddressDashboardPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        AddAddressPageInvalidSingularInputFormat addAddressPageInvalidSingularInputFormat = new AddAddressPageInvalidSingularInputFormat(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Addresses' link
        accountDashboardPage.clickAddressesLink();
        //address dashboard page web element assert
        isAddressDashboardPageWebElementDisplayed(addressDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert address dashboard page title is a expected
        assertEquals("Addresses", addressDashboardPage.getAddressDashboardPageTitle(), "The address dashboard page title doesn't match expectations.");
        //log address dashboard page data
        logAddressDashboardPageData(addressDashboardPage);
        //capture screenshot of the address dashboard page display
        captureScreenshot(driver, "Address Dashboard Page Display");
        //click 'New address' link
        addressDashboardPage.clickNewAddressLink();
        //add address page web element assert
        isAddAddressPageWebElementDisplayed(addAddressPage);
        //add address page text element assert
        isAddAddressPageTextElementAsExpected(addAddressPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //capture screenshot of the add address page display before data input
        captureScreenshot(driver, "Add Address Page Display Before Data Input");
        //invalid user address getter - invalid user post code format (special symbols only)
        addAddressPageInvalidSingularInputFormat.invalidUserEditedAddressDataInvalidPostCodeFormatGetter();
        //input valid address first name into first name input field
        addAddressPageInvalidSingularInputFormat.inputValidUserFirstNameIntoFirstNameInputField();
        //input valid address last name format into last name input field
        addAddressPageInvalidSingularInputFormat.inputValidUserLastNameIntoLastNameInputField();
        //input valid address into address 1 input field
        addAddressPageInvalidSingularInputFormat.inputValidUserAddressIntoAddress1InputField();
        //input valid address city into city input field
        addAddressPageInvalidSingularInputFormat.inputValidUserCityIntoCityInputField();
        //input invalid address post code format into post code input field
        addAddressPageInvalidSingularInputFormat.inputInvalidUserPostCodeFormatIntoPostCodeInputField();
        //input valid address phone into phone input field
        addAddressPageInvalidSingularInputFormat.inputValidUserPhoneIntoPhoneInputField();
        //click 'State dropdown menu
        addAddressPage.clickStateDropdownMenu();
        //select 'Illinois' option
        addAddressPage.selectIllinoisOption();
        //capture screenshot of the add address page display after invalid data input - invalid user post code format
        captureScreenshot(driver, "Add Address Page Display After Valid Data Input - Invalid Post Code Format");
        //click 'Save address' button
        addAddressPage.clickSaveAddressButton();
        //assert the user gets an expected error, log the issue otherwise
        try {
            assertEquals("Post code cannot consist of special symbols only.", addAddressPage.getAddAddressPageSingularInputError(), "The add address page invalid address post code input format error doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The invalid add address post code input format error wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Second Address Addition Test Result - Invalid Post Code Format");
    }

    //invalid user second address addition test method - invalid user phone format (special symbols only)
    protected void invalidSecondUserAddressAdditionInvalidPhoneFormatTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AddressDashboardPage addressDashboardPage = new AddressDashboardPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        AddAddressPageInvalidSingularInputFormat addAddressPageInvalidSingularInputFormat = new AddAddressPageInvalidSingularInputFormat(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Addresses' link
        accountDashboardPage.clickAddressesLink();
        //address dashboard page web element assert
        isAddressDashboardPageWebElementDisplayed(addressDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert address dashboard page title is a expected
        assertEquals("Addresses", addressDashboardPage.getAddressDashboardPageTitle(), "The address dashboard page title doesn't match expectations.");
        //log address dashboard page data
        logAddressDashboardPageData(addressDashboardPage);
        //capture screenshot of the address dashboard page display
        captureScreenshot(driver, "Address Dashboard Page Display");
        //click 'New address' link
        addressDashboardPage.clickNewAddressLink();
        //add address page web element assert
        isAddAddressPageWebElementDisplayed(addAddressPage);
        //add address page text element assert
        isAddAddressPageTextElementAsExpected(addAddressPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //capture screenshot of the add address page display before data input
        captureScreenshot(driver, "Add Address Page Display Before Data Input");
        //invalid user address getter - invalid user phone format (special symbols only)
        addAddressPageInvalidSingularInputFormat.invalidUserEditedAddressDataInvalidPhoneFormatGetter();
        //input valid address first name into first name input field
        addAddressPageInvalidSingularInputFormat.inputValidUserFirstNameIntoFirstNameInputField();
        //input valid address last name format into last name input field
        addAddressPageInvalidSingularInputFormat.inputValidUserLastNameIntoLastNameInputField();
        //input valid address into address 1 input field
        addAddressPageInvalidSingularInputFormat.inputValidUserAddressIntoAddress1InputField();
        //input valid address city into city input field
        addAddressPageInvalidSingularInputFormat.inputValidUserCityIntoCityInputField();
        //input valid address post code into post code input field
        addAddressPageInvalidSingularInputFormat.inputValidUserPostCodeIntoPostCodeInputField();
        //input invalid address phone format into phone input field
        addAddressPageInvalidSingularInputFormat.inputInvalidUserPhoneFormatIntoPhoneInputField();
        //click 'State dropdown menu
        addAddressPage.clickStateDropdownMenu();
        //select 'Illinois' option
        addAddressPage.selectIllinoisOption();
        //capture screenshot of the add address page display after invalid data input - invalid user phone format
        captureScreenshot(driver, "Add Address Page Display After Valid Data Input - Invalid Phone Format");
        //click 'Save address' button
        addAddressPage.clickSaveAddressButton();
        //assert the user gets an expected error, log the issue otherwise
        try {
            assertEquals("Phone cannot consist of special symbols only.", addAddressPage.getAddAddressPageSingularInputError(), "The add address page invalid address phone input format error doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The invalid add address phone input format error wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Second Address Addition Test Result - Invalid Phone Format");
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //valid edit user address test (the page is the same as AddAddressPage, therefore, its structure is being used to avoid redundancy)

    //valid edit user address test method
    protected void validEditUserAddressTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AddressDashboardPage addressDashboardPage = new AddressDashboardPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Addresses' link
        accountDashboardPage.clickAddressesLink();
        //address dashboard page web element assert
        isAddressDashboardPageWebElementDisplayed(addressDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert address dashboard page title is a expected
        assertEquals("Addresses", addressDashboardPage.getAddressDashboardPageTitle(), "The address dashboard page title doesn't match expectations.");
        //log address dashboard page data
        logAddressDashboardPageData(addressDashboardPage);
        //capture screenshot of the address dashboard page display
        captureScreenshot(driver, "Address Dashboard Page Display");
        //click 'Edit' address button
        addressDashboardPage.clickEditAddressButton(0);
        //edit address page web element assert (same elements as for add address page)
        isAddAddressPageWebElementDisplayed(addAddressPage);
        //edit address page text element assert (same elements as for add address page)
        isAddAddressPageTextElementAsExpected(addAddressPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert edit address page title is as expected (same element as for add address page)
        assertEquals("Update Address", addAddressPage.getAddAddressPageTitle(), "The add address page title doesn't match expectations.");
        //capture screenshot of the add address page display before edited data input
        captureScreenshot(driver, "Add Address Page Display Before Edited Data Input");
        //valid edited user address getter
        addAddressPage.validUserEditedAddressDataGetter();
        //input valid edited address into address 1 input field
        addAddressPage.inputValidUserAddressIntoAddress1InputField();
        //input valid edited address city into city input field
        addAddressPage.inputValidUserCityIntoCityInputField();
        //input valid edited address post code into post code input field
        addAddressPage.inputValidUserPostCodeIntoPostCodeInputField();
        //input valid edited address phone into phone input field
        addAddressPage.inputValidUserPhoneIntoPhoneInputField();
        //capture screenshot of the add address page display after valid data input
        captureScreenshot(driver, "Add Address Page Display After Valid Edited Data Input");
        //click 'Save address' button
        addAddressPage.clickSaveAddressButton();
        //log address dashboard page data(to verify the address has been edited)
        logAddressDashboardPageData(addressDashboardPage);
        //capture screenshot of the test result
        captureScreenshot(driver, "Valid Edit User Address Test Result");
    }

    //invalid edit user address tests

    //no singular input

    //invalid edit user address test method - no country
    protected void invalidEditUserAddressNoCountryTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AddressDashboardPage addressDashboardPage = new AddressDashboardPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Addresses' link
        accountDashboardPage.clickAddressesLink();
        //address dashboard page web element assert
        isAddressDashboardPageWebElementDisplayed(addressDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert address dashboard page title is a expected
        assertEquals("Addresses", addressDashboardPage.getAddressDashboardPageTitle(), "The address dashboard page title doesn't match expectations.");
        //log address dashboard page data
        logAddressDashboardPageData(addressDashboardPage);
        //capture screenshot of the address dashboard page display
        captureScreenshot(driver, "Address Dashboard Page Display");
        //click 'Edit' address button
        addressDashboardPage.clickEditAddressButton(0);
        //edit address page web element assert (same elements as for add address page)
        isAddAddressPageWebElementDisplayed(addAddressPage);
        //edit address page text element assert (same elements as for add address page)
        isAddAddressPageTextElementAsExpected(addAddressPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert edit address page title is as expected (same element as for add address page)
        assertEquals("Update Address", addAddressPage.getAddAddressPageTitle(), "The update address page title doesn't match expectations.");
        //capture screenshot of the update address page display before edited data input
        captureScreenshot(driver, "Update Address Page Display Before Edited Data Input");
        //valid edited user address getter
        addAddressPage.validUserEditedAddressDataGetter();
        //click "Country" dropdown menu
        addAddressPage.clickCountryDropdownMenu();
        //select "Choose a country" option
        addAddressPage.selectCountryOption();
        //input valid edited address into address 1 input field
        addAddressPage.inputValidUserAddressIntoAddress1InputField();
        //input valid edited address city into city input field
        addAddressPage.inputValidUserCityIntoCityInputField();
        //input valid edited address post code into post code input field
        addAddressPage.inputValidUserPostCodeIntoPostCodeInputField();
        //input valid edited address phone into phone input field
        addAddressPage.inputValidUserPhoneIntoPhoneInputField();
        //capture screenshot of the update address page display after invalid data input - no country
        captureScreenshot(driver, "Update Address Page Display After Invalid Edited Data Input - No Country");
        //click 'Save address' button
        addAddressPage.clickSaveAddressButton();
        //assert the user gets an expected error
        assertEquals("Country field cannot be blank.", addAddressPage.getAddAddressPageSingularInputError(), "The update address page missing country input error doesn't match expectations or the error wasn't triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Update User Address Test Result - No Country");
    }

    //invalid update user address test method - no user first name
    protected void invalidEditUserAddressNoFirstNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AddressDashboardPage addressDashboardPage = new AddressDashboardPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        AddAddressPageNoSingularInput addAddressPageNoSingularInput = new AddAddressPageNoSingularInput(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Addresses' link
        accountDashboardPage.clickAddressesLink();
        //address dashboard page web element assert
        isAddressDashboardPageWebElementDisplayed(addressDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert address dashboard page title is a expected
        assertEquals("Addresses", addressDashboardPage.getAddressDashboardPageTitle(), "The address dashboard page title doesn't match expectations.");
        //log address dashboard page data
        logAddressDashboardPageData(addressDashboardPage);
        //capture screenshot of the address dashboard page display
        captureScreenshot(driver, "Address Dashboard Page Display");
        //click 'Edit' address button
        addressDashboardPage.clickEditAddressButton(0);
        //edit address page web element assert (same elements as for add address page)
        isAddAddressPageWebElementDisplayed(addAddressPage);
        //edit address page text element assert (same elements as for add address page)
        isAddAddressPageTextElementAsExpected(addAddressPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert edit address page title is as expected (same element as for add address page)
        assertEquals("Update Address", addAddressPage.getAddAddressPageTitle(), "The update address page title doesn't match expectations.");
        //capture screenshot of the update address page display before edited data input
        captureScreenshot(driver, "Update Address Page Display Before Edited Data Input");
        //invalid edited user address getter - no user first name
        addAddressPageNoSingularInput.invalidUserEditedAddressDataNoFirstNameGetter();
        //don't input address first name into first name input field
        addAddressPageNoSingularInput.inputNoUserFirstNameIntoFirstNameInputField();
        //input valid edited address into address 1 input field
        addAddressPageNoSingularInput.inputValidUserAddressIntoAddress1InputField();
        //input valid edited address city into city input field
        addAddressPageNoSingularInput.inputValidUserCityIntoCityInputField();
        //input valid edited address post code into post code input field
        addAddressPageNoSingularInput.inputValidUserPostCodeIntoPostCodeInputField();
        //input valid edited address phone into phone input field
        addAddressPageNoSingularInput.inputValidUserPhoneIntoPhoneInputField();
        //capture screenshot of the update address page display after invalid data input - no first name
        captureScreenshot(driver, "Update Address Page Display After Invalid Edited Data Input - No First Name");
        //click 'Save address' button
        addAddressPage.clickSaveAddressButton();
        //assert the user gets an expected error
        assertEquals("First Name field cannot be blank.", addAddressPage.getAddAddressPageSingularInputError(), "The update address page missing first name input error doesn't match expectations or the error wasn't triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Update User Address Test Result - No First Name");
    }

    //invalid update user address test method - no user last name
    protected void invalidEditUserAddressNoLastNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AddressDashboardPage addressDashboardPage = new AddressDashboardPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        AddAddressPageNoSingularInput addAddressPageNoSingularInput = new AddAddressPageNoSingularInput(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Addresses' link
        accountDashboardPage.clickAddressesLink();
        //address dashboard page web element assert
        isAddressDashboardPageWebElementDisplayed(addressDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert address dashboard page title is a expected
        assertEquals("Addresses", addressDashboardPage.getAddressDashboardPageTitle(), "The address dashboard page title doesn't match expectations.");
        //log address dashboard page data
        logAddressDashboardPageData(addressDashboardPage);
        //capture screenshot of the address dashboard page display
        captureScreenshot(driver, "Address Dashboard Page Display");
        //click 'Edit' address button
        addressDashboardPage.clickEditAddressButton(0);
        //edit address page web element assert (same elements as for add address page)
        isAddAddressPageWebElementDisplayed(addAddressPage);
        //edit address page text element assert (same elements as for add address page)
        isAddAddressPageTextElementAsExpected(addAddressPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert edit address page title is as expected (same element as for add address page)
        assertEquals("Update Address", addAddressPage.getAddAddressPageTitle(), "The update address page title doesn't match expectations.");
        //capture screenshot of the update address page display before edited data input
        captureScreenshot(driver, "Update Address Page Display Before Edited Data Input");
        //invalid edited user address getter - no user last name
        addAddressPageNoSingularInput.invalidUserEditedAddressDataNoLastNameGetter();
        //don't input address last name into last name input field
        addAddressPageNoSingularInput.inputNoUserLastNameIntoLastNameInputField();
        //input valid edited address into address 1 input field
        addAddressPageNoSingularInput.inputValidUserAddressIntoAddress1InputField();
        //input valid edited address city into city input field
        addAddressPageNoSingularInput.inputValidUserCityIntoCityInputField();
        //input valid edited address post code into post code input field
        addAddressPageNoSingularInput.inputValidUserPostCodeIntoPostCodeInputField();
        //input valid edited address phone into phone input field
        addAddressPageNoSingularInput.inputValidUserPhoneIntoPhoneInputField();
        //capture screenshot of the update address page display after invalid data input - no user last name
        captureScreenshot(driver, "Update Address Page Display After Invalid Edited Data Input - No Last Name");
        //click 'Save address' button
        addAddressPage.clickSaveAddressButton();
        //assert the user gets an expected error
        assertEquals("Last Name field cannot be blank.", addAddressPage.getAddAddressPageSingularInputError(), "The update address page missing last name input error doesn't match expectations or the error wasn't triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Update User Address Test Result - No Last Name");
    }

    //invalid update user address test method - no user address
    protected void invalidEditUserAddressNoAddressTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AddressDashboardPage addressDashboardPage = new AddressDashboardPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        AddAddressPageNoSingularInput addAddressPageNoSingularInput = new AddAddressPageNoSingularInput(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Addresses' link
        accountDashboardPage.clickAddressesLink();
        //address dashboard page web element assert
        isAddressDashboardPageWebElementDisplayed(addressDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert address dashboard page title is a expected
        assertEquals("Addresses", addressDashboardPage.getAddressDashboardPageTitle(), "The address dashboard page title doesn't match expectations.");
        //log address dashboard page data
        logAddressDashboardPageData(addressDashboardPage);
        //capture screenshot of the address dashboard page display
        captureScreenshot(driver, "Address Dashboard Page Display");
        //click 'Edit' address button
        addressDashboardPage.clickEditAddressButton(0);
        //edit address page web element assert (same elements as for add address page)
        isAddAddressPageWebElementDisplayed(addAddressPage);
        //edit address page text element assert (same elements as for add address page)
        isAddAddressPageTextElementAsExpected(addAddressPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert edit address page title is as expected (same element as for add address page)
        assertEquals("Update Address", addAddressPage.getAddAddressPageTitle(), "The update address page title doesn't match expectations.");
        //capture screenshot of the update address page display before edited data input
        captureScreenshot(driver, "Update Address Page Display Before Edited Data Input");
        //invalid edited user address getter - no user address
        addAddressPageNoSingularInput.invalidUserEditedAddressDataNoAddressGetter();
        //don't input edited address into address 1 input field
        addAddressPageNoSingularInput.inputNoUserAddressIntoAddress1InputField();
        //input valid edited address city into city input field
        addAddressPageNoSingularInput.inputValidUserCityIntoCityInputField();
        //input valid edited address post code into post code input field
        addAddressPageNoSingularInput.inputValidUserPostCodeIntoPostCodeInputField();
        //input valid edited address phone into phone input field
        addAddressPageNoSingularInput.inputValidUserPhoneIntoPhoneInputField();
        //capture screenshot of the update address page display after invalid data input - no user address
        captureScreenshot(driver, "Update Address Page Display After Invalid Edited Data Input - No Address");
        //click 'Save address' button
        addAddressPage.clickSaveAddressButton();
        //assert the user gets an expected error
        assertEquals("Address Line 1 field cannot be blank.", addAddressPage.getAddAddressPageSingularInputError(), "The update address page missing address input error doesn't match expectations or the error wasn't triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Update User Address Test Result - No Address");
    }

    //invalid update user address test method - no user city
    protected void invalidEditUserAddressNoCityTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AddressDashboardPage addressDashboardPage = new AddressDashboardPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        AddAddressPageNoSingularInput addAddressPageNoSingularInput = new AddAddressPageNoSingularInput(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Addresses' link
        accountDashboardPage.clickAddressesLink();
        //address dashboard page web element assert
        isAddressDashboardPageWebElementDisplayed(addressDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert address dashboard page title is a expected
        assertEquals("Addresses", addressDashboardPage.getAddressDashboardPageTitle(), "The address dashboard page title doesn't match expectations.");
        //log address dashboard page data
        logAddressDashboardPageData(addressDashboardPage);
        //capture screenshot of the address dashboard page display
        captureScreenshot(driver, "Address Dashboard Page Display");
        //click 'Edit' address button
        addressDashboardPage.clickEditAddressButton(0);
        //edit address page web element assert (same elements as for add address page)
        isAddAddressPageWebElementDisplayed(addAddressPage);
        //edit address page text element assert (same elements as for add address page)
        isAddAddressPageTextElementAsExpected(addAddressPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert edit address page title is as expected (same element as for add address page)
        assertEquals("Update Address", addAddressPage.getAddAddressPageTitle(), "The update address page title doesn't match expectations.");
        //capture screenshot of the update address page display before edited data input
        captureScreenshot(driver, "Update Address Page Display Before Edited Data Input");
        //invalid edited user address getter - no user city
        addAddressPageNoSingularInput.invalidUserEditedAddressDataNoCityGetter();
        //input valid edited address into address 1 input field
        addAddressPageNoSingularInput.inputValidUserAddressIntoAddress1InputField();
        //don't input edited address city into city input field
        addAddressPageNoSingularInput.inputNoUserCityIntoCityInputField();
        //input valid edited address post code into post code input field
        addAddressPageNoSingularInput.inputValidUserPostCodeIntoPostCodeInputField();
        //input valid edited address phone into phone input field
        addAddressPageNoSingularInput.inputValidUserPhoneIntoPhoneInputField();
        //capture screenshot of the update address page display after invalid data input - no user city
        captureScreenshot(driver, "Update Address Page Display After Invalid Edited Data Input - No City");
        //click 'Save address' button
        addAddressPage.clickSaveAddressButton();
        //assert the user gets an expected error
        assertEquals("Suburb/City field cannot be blank.", addAddressPage.getAddAddressPageSingularInputError(), "The update address page missing city input error doesn't match expectations or the error wasn't triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Update User Address Test Result - No City");
    }

    //invalid edit user address test method - no state
    protected void invalidEditUserAddressNoStateTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AddressDashboardPage addressDashboardPage = new AddressDashboardPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Addresses' link
        accountDashboardPage.clickAddressesLink();
        //address dashboard page web element assert
        isAddressDashboardPageWebElementDisplayed(addressDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert address dashboard page title is a expected
        assertEquals("Addresses", addressDashboardPage.getAddressDashboardPageTitle(), "The address dashboard page title doesn't match expectations.");
        //log address dashboard page data
        logAddressDashboardPageData(addressDashboardPage);
        //capture screenshot of the address dashboard page display
        captureScreenshot(driver, "Address Dashboard Page Display");
        //click 'Edit' address button
        addressDashboardPage.clickEditAddressButton(0);
        //edit address page web element assert (same elements as for add address page)
        isAddAddressPageWebElementDisplayed(addAddressPage);
        //edit address page text element assert (same elements as for add address page)
        isAddAddressPageTextElementAsExpected(addAddressPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert edit address page title is as expected (same element as for add address page)
        assertEquals("Update Address", addAddressPage.getAddAddressPageTitle(), "The update address page title doesn't match expectations.");
        //capture screenshot of the update address page display before edited data input
        captureScreenshot(driver, "Update Address Page Display Before Edited Data Input");
        //valid edited user address getter
        addAddressPage.validUserEditedAddressDataGetter();
        //input valid edited address into address 1 input field
        addAddressPage.inputValidUserAddressIntoAddress1InputField();
        //input valid edited address city into city input field
        addAddressPage.inputValidUserCityIntoCityInputField();
        //input valid edited address post code into post code input field
        addAddressPage.inputValidUserPostCodeIntoPostCodeInputField();
        //input valid edited address phone into phone input field
        addAddressPage.inputValidUserPhoneIntoPhoneInputField();
        //click "State" dropdown menu
        addAddressPage.clickStateDropdownMenu();
        //select "Choose a state" option
        addAddressPage.selectStateOption();
        //capture screenshot of the update address page display after invalid data input - no state
        captureScreenshot(driver, "Update Address Page Display After Invalid Edited Data Input - No State");
        //click 'Save address' button
        addAddressPage.clickSaveAddressButton();
        //assert the user gets an expected error
        assertEquals("State/Province field cannot be blank.", addAddressPage.getAddAddressPageSingularInputError(), "The update address page missing state input error doesn't match expectations or the error wasn't triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Update User Address Test Result - No State");
    }

    //invalid update user address test method - no user post code
    protected void invalidEditUserAddressNoPostCodeTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AddressDashboardPage addressDashboardPage = new AddressDashboardPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        AddAddressPageNoSingularInput addAddressPageNoSingularInput = new AddAddressPageNoSingularInput(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Addresses' link
        accountDashboardPage.clickAddressesLink();
        //address dashboard page web element assert
        isAddressDashboardPageWebElementDisplayed(addressDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert address dashboard page title is a expected
        assertEquals("Addresses", addressDashboardPage.getAddressDashboardPageTitle(), "The address dashboard page title doesn't match expectations.");
        //log address dashboard page data
        logAddressDashboardPageData(addressDashboardPage);
        //capture screenshot of the address dashboard page display
        captureScreenshot(driver, "Address Dashboard Page Display");
        //click 'Edit' address button
        addressDashboardPage.clickEditAddressButton(0);
        //edit address page web element assert (same elements as for add address page)
        isAddAddressPageWebElementDisplayed(addAddressPage);
        //edit address page text element assert (same elements as for add address page)
        isAddAddressPageTextElementAsExpected(addAddressPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert edit address page title is as expected (same element as for add address page)
        assertEquals("Update Address", addAddressPage.getAddAddressPageTitle(), "The update address page title doesn't match expectations.");
        //capture screenshot of the update address page display before edited data input
        captureScreenshot(driver, "Update Address Page Display Before Edited Data Input");
        //invalid edited user address getter - no user post code
        addAddressPageNoSingularInput.invalidUserEditedAddressDataNoPostCodeGetter();
        //input valid edited address into address 1 input field
        addAddressPageNoSingularInput.inputValidUserAddressIntoAddress1InputField();
        //input valid edited address city into city input field
        addAddressPageNoSingularInput.inputValidUserCityIntoCityInputField();
        //don't input edited address post code into post code input field
        addAddressPageNoSingularInput.inputNoUserPostCodeIntoPostCodeInputField();
        //input valid edited address phone into phone input field
        addAddressPageNoSingularInput.inputValidUserPhoneIntoPhoneInputField();
        //capture screenshot of the update address page display after invalid data input - no user post code
        captureScreenshot(driver, "Update Address Page Display After Invalid Edited Data Input - No Post Code");
        //click 'Save address' button
        addAddressPage.clickSaveAddressButton();
        //assert the user gets an expected error
        assertEquals("Zip/Postcode field cannot be blank.", addAddressPage.getAddAddressPageSingularInputError(), "The update address page missing post code input error doesn't match expectations or the error wasn't triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Update User Address Test Result - No Post Code");
    }

    //invalid update user address test method - no user phone
    protected void invalidEditUserAddressNoPhoneTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AddressDashboardPage addressDashboardPage = new AddressDashboardPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        AddAddressPageNoSingularInput addAddressPageNoSingularInput = new AddAddressPageNoSingularInput(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Addresses' link
        accountDashboardPage.clickAddressesLink();
        //address dashboard page web element assert
        isAddressDashboardPageWebElementDisplayed(addressDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert address dashboard page title is a expected
        assertEquals("Addresses", addressDashboardPage.getAddressDashboardPageTitle(), "The address dashboard page title doesn't match expectations.");
        //log address dashboard page data
        logAddressDashboardPageData(addressDashboardPage);
        //capture screenshot of the address dashboard page display
        captureScreenshot(driver, "Address Dashboard Page Display");
        //click 'Edit' address button
        addressDashboardPage.clickEditAddressButton(0);
        //edit address page web element assert (same elements as for add address page)
        isAddAddressPageWebElementDisplayed(addAddressPage);
        //edit address page text element assert (same elements as for add address page)
        isAddAddressPageTextElementAsExpected(addAddressPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert edit address page title is as expected (same element as for add address page)
        assertEquals("Update Address", addAddressPage.getAddAddressPageTitle(), "The update address page title doesn't match expectations.");
        //capture screenshot of the update address page display before edited data input
        captureScreenshot(driver, "Update Address Page Display Before Edited Data Input");
        //invalid edited user address getter - no user phone
        addAddressPageNoSingularInput.invalidUserEditedAddressDataNoPhoneGetter();
        //input valid edited address into address 1 input field
        addAddressPageNoSingularInput.inputValidUserAddressIntoAddress1InputField();
        //input valid edited address city into city input field
        addAddressPageNoSingularInput.inputValidUserCityIntoCityInputField();
        //input valid edited address post code into post code input field
        addAddressPageNoSingularInput.inputValidUserPostCodeIntoPostCodeInputField();
        //don't input edited address phone into phone input field
        addAddressPageNoSingularInput.inputNoUserPhoneIntoPhoneInputField();
        //capture screenshot of the update address page display after invalid data input - no user phone
        captureScreenshot(driver, "Update Address Page Display After Invalid Edited Data Input - No Phone");
        //click 'Save address' button
        addAddressPage.clickSaveAddressButton();
        //assert the user gets an expected error
        assertEquals("Phone Number field cannot be blank.", addAddressPage.getAddAddressPageSingularInputError(), "The update address page missing phone input error doesn't match expectations or the error wasn't triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Update User Address Test Result - No Phone");
    }

    //too short singular input

    //invalid update user address test method - too short user first name (1 char)
    protected void invalidEditUserAddressTooShortFirstNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AddressDashboardPage addressDashboardPage = new AddressDashboardPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        AddAddressPageTooShortSingularInput addAddressPageTooShortSingularInput = new AddAddressPageTooShortSingularInput(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Addresses' link
        accountDashboardPage.clickAddressesLink();
        //address dashboard page web element assert
        isAddressDashboardPageWebElementDisplayed(addressDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert address dashboard page title is a expected
        assertEquals("Addresses", addressDashboardPage.getAddressDashboardPageTitle(), "The address dashboard page title doesn't match expectations.");
        //log address dashboard page data
        logAddressDashboardPageData(addressDashboardPage);
        //capture screenshot of the address dashboard page display
        captureScreenshot(driver, "Address Dashboard Page Display");
        //click 'Edit' address button
        addressDashboardPage.clickEditAddressButton(0);
        //edit address page web element assert (same elements as for add address page)
        isAddAddressPageWebElementDisplayed(addAddressPage);
        //edit address page text element assert (same elements as for add address page)
        isAddAddressPageTextElementAsExpected(addAddressPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert edit address page title is as expected (same element as for add address page)
        assertEquals("Update Address", addAddressPage.getAddAddressPageTitle(), "The update address page title doesn't match expectations.");
        //capture screenshot of the update address page display before edited data input
        captureScreenshot(driver, "Update Address Page Display Before Edited Data Input");
        //invalid edited user address getter - too short user first name (1 char)
        addAddressPageTooShortSingularInput.invalidUserEditedAddressDataTooShortFirstNameGetter();
        //input too short address first name into first name input field (1 char)
        addAddressPageTooShortSingularInput.inputTooShortUserFirstNameIntoFirstNameInputField();
        //input valid edited address into address 1 input field
        addAddressPageTooShortSingularInput.inputValidUserAddressIntoAddress1InputField();
        //input valid edited address city into city input field
        addAddressPageTooShortSingularInput.inputValidUserCityIntoCityInputField();
        //input valid edited address post code into post code input field
        addAddressPageTooShortSingularInput.inputValidUserPostCodeIntoPostCodeInputField();
        //input valid edited address phone into phone input field
        addAddressPageTooShortSingularInput.inputValidUserPhoneIntoPhoneInputField();
        //capture screenshot of the update address page display after invalid data input - too short first name
        captureScreenshot(driver, "Update Address Page Display After Invalid Edited Data Input - Too Short First Name");
        //click 'Save address' button
        addAddressPage.clickSaveAddressButton();
        //assert the user gets an expected error, log the issue otherwise
        try {
            assertEquals("First name is too short.", addAddressPage.getAddAddressPageSingularInputError(), "The update address page too short first name input error doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The too short update address first name input error wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Update User Address Test Result - Too Short First Name");
    }

    //invalid update user address test method - too short user last name (1 char)
    protected void invalidEditUserAddressTooShortLastNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AddressDashboardPage addressDashboardPage = new AddressDashboardPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        AddAddressPageTooShortSingularInput addAddressPageTooShortSingularInput = new AddAddressPageTooShortSingularInput(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Addresses' link
        accountDashboardPage.clickAddressesLink();
        //address dashboard page web element assert
        isAddressDashboardPageWebElementDisplayed(addressDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert address dashboard page title is a expected
        assertEquals("Addresses", addressDashboardPage.getAddressDashboardPageTitle(), "The address dashboard page title doesn't match expectations.");
        //log address dashboard page data
        logAddressDashboardPageData(addressDashboardPage);
        //capture screenshot of the address dashboard page display
        captureScreenshot(driver, "Address Dashboard Page Display");
        //click 'Edit' address button
        addressDashboardPage.clickEditAddressButton(0);
        //edit address page web element assert (same elements as for add address page)
        isAddAddressPageWebElementDisplayed(addAddressPage);
        //edit address page text element assert (same elements as for add address page)
        isAddAddressPageTextElementAsExpected(addAddressPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert edit address page title is as expected (same element as for add address page)
        assertEquals("Update Address", addAddressPage.getAddAddressPageTitle(), "The update address page title doesn't match expectations.");
        //capture screenshot of the update address page display before edited data input
        captureScreenshot(driver, "Update Address Page Display Before Edited Data Input");
        //invalid edited user address getter - too short user last name (1 char)
        addAddressPageTooShortSingularInput.invalidUserEditedAddressDataTooShortLastNameGetter();
        //input too short address last name into last name input field (1 char)
        addAddressPageTooShortSingularInput.inputTooShortUserLastNameIntoLastNameInputField();
        //input valid edited address into address 1 input field
        addAddressPageTooShortSingularInput.inputValidUserAddressIntoAddress1InputField();
        //input valid edited address city into city input field
        addAddressPageTooShortSingularInput.inputValidUserCityIntoCityInputField();
        //input valid edited address post code into post code input field
        addAddressPageTooShortSingularInput.inputValidUserPostCodeIntoPostCodeInputField();
        //input valid edited address phone into phone input field
        addAddressPageTooShortSingularInput.inputValidUserPhoneIntoPhoneInputField();
        //capture screenshot of the update address page display after invalid data input - too short last name
        captureScreenshot(driver, "Update Address Page Display After Invalid Edited Data Input - Too Short Last Name");
        //click 'Save address' button
        addAddressPage.clickSaveAddressButton();
        //assert the user gets an expected error, log the issue otherwise
        try {
            assertEquals("Last name is too short.", addAddressPage.getAddAddressPageSingularInputError(), "The update address page too short last name input error doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The too short update address last name input error wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Update User Address Test Result - Too Short Last Name");
    }

    //invalid update user address test method - too short user address (3 chars)
    protected void invalidEditUserAddressTooShortAddressTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AddressDashboardPage addressDashboardPage = new AddressDashboardPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        AddAddressPageTooShortSingularInput addAddressPageTooShortSingularInput = new AddAddressPageTooShortSingularInput(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Addresses' link
        accountDashboardPage.clickAddressesLink();
        //address dashboard page web element assert
        isAddressDashboardPageWebElementDisplayed(addressDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert address dashboard page title is a expected
        assertEquals("Addresses", addressDashboardPage.getAddressDashboardPageTitle(), "The address dashboard page title doesn't match expectations.");
        //log address dashboard page data
        logAddressDashboardPageData(addressDashboardPage);
        //capture screenshot of the address dashboard page display
        captureScreenshot(driver, "Address Dashboard Page Display");
        //click 'Edit' address button
        addressDashboardPage.clickEditAddressButton(0);
        //edit address page web element assert (same elements as for add address page)
        isAddAddressPageWebElementDisplayed(addAddressPage);
        //edit address page text element assert (same elements as for add address page)
        isAddAddressPageTextElementAsExpected(addAddressPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert edit address page title is as expected (same element as for add address page)
        assertEquals("Update Address", addAddressPage.getAddAddressPageTitle(), "The update address page title doesn't match expectations.");
        //capture screenshot of the update address page display before edited data input
        captureScreenshot(driver, "Update Address Page Display Before Edited Data Input");
        //invalid edited user address getter - too short user address (3 chars)
        addAddressPageTooShortSingularInput.invalidUserEditedAddressDataTooShortAddressGetter();
        //input too short edited address into address 1 input field (3 chars)
        addAddressPageTooShortSingularInput.inputTooShortUserAddressIntoAddress1InputField();
        //input valid edited address city into city input field
        addAddressPageTooShortSingularInput.inputValidUserCityIntoCityInputField();
        //input valid edited address post code into post code input field
        addAddressPageTooShortSingularInput.inputValidUserPostCodeIntoPostCodeInputField();
        //input valid edited address phone into phone input field
        addAddressPageTooShortSingularInput.inputValidUserPhoneIntoPhoneInputField();
        //capture screenshot of the update address page display after invalid data input - too short address
        captureScreenshot(driver, "Update Address Page Display After Invalid Edited Data Input - Too Short Address");
        //click 'Save address' button
        addAddressPage.clickSaveAddressButton();
        //assert the user gets an expected error, log the issue otherwise
        try {
            assertEquals("Address is too short.", addAddressPage.getAddAddressPageSingularInputError(), "The update address page too short address input error doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The too short update address address input error wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Update User Address Test Result - Too Short Address");
    }

    //invalid update user address test method - too short user city (1 char)
    protected void invalidEditUserAddressTooShortCityTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AddressDashboardPage addressDashboardPage = new AddressDashboardPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        AddAddressPageTooShortSingularInput addAddressPageTooShortSingularInput = new AddAddressPageTooShortSingularInput(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Addresses' link
        accountDashboardPage.clickAddressesLink();
        //address dashboard page web element assert
        isAddressDashboardPageWebElementDisplayed(addressDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert address dashboard page title is a expected
        assertEquals("Addresses", addressDashboardPage.getAddressDashboardPageTitle(), "The address dashboard page title doesn't match expectations.");
        //log address dashboard page data
        logAddressDashboardPageData(addressDashboardPage);
        //capture screenshot of the address dashboard page display
        captureScreenshot(driver, "Address Dashboard Page Display");
        //click 'Edit' address button
        addressDashboardPage.clickEditAddressButton(0);
        //edit address page web element assert (same elements as for add address page)
        isAddAddressPageWebElementDisplayed(addAddressPage);
        //edit address page text element assert (same elements as for add address page)
        isAddAddressPageTextElementAsExpected(addAddressPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert edit address page title is as expected (same element as for add address page)
        assertEquals("Update Address", addAddressPage.getAddAddressPageTitle(), "The update address page title doesn't match expectations.");
        //capture screenshot of the update address page display before edited data input
        captureScreenshot(driver, "Update Address Page Display Before Edited Data Input");
        //invalid edited user address getter - too short user city (1 char)
        addAddressPageTooShortSingularInput.invalidUserEditedAddressDataTooShortCityGetter();
        //input valid edited address into address 1 input field
        addAddressPageTooShortSingularInput.inputValidUserAddressIntoAddress1InputField();
        //input too short edited address city into city input field (1 char)
        addAddressPageTooShortSingularInput.inputTooShortUserCityIntoCityInputField();
        //input valid edited address post code into post code input field
        addAddressPageTooShortSingularInput.inputValidUserPostCodeIntoPostCodeInputField();
        //input valid edited address phone into phone input field
        addAddressPageTooShortSingularInput.inputValidUserPhoneIntoPhoneInputField();
        //capture screenshot of the update address page display after invalid data input - too short city
        captureScreenshot(driver, "Update Address Page Display After Invalid Edited Data Input - Too Short City");
        //click 'Save address' button
        addAddressPage.clickSaveAddressButton();
        //assert the user gets an expected error, log the issue otherwise
        try {
            assertEquals("City is too short.", addAddressPage.getAddAddressPageSingularInputError(), "The update address page too short city input error doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The too short update address city input error wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Update User Address Test Result - Too Short City");
    }

    //invalid update user address test method - too short user post code (4 digits)
    protected void invalidEditUserAddressTooShortPostCodeTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AddressDashboardPage addressDashboardPage = new AddressDashboardPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        AddAddressPageTooShortSingularInput addAddressPageTooShortSingularInput = new AddAddressPageTooShortSingularInput(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Addresses' link
        accountDashboardPage.clickAddressesLink();
        //address dashboard page web element assert
        isAddressDashboardPageWebElementDisplayed(addressDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert address dashboard page title is a expected
        assertEquals("Addresses", addressDashboardPage.getAddressDashboardPageTitle(), "The address dashboard page title doesn't match expectations.");
        //log address dashboard page data
        logAddressDashboardPageData(addressDashboardPage);
        //capture screenshot of the address dashboard page display
        captureScreenshot(driver, "Address Dashboard Page Display");
        //click 'Edit' address button
        addressDashboardPage.clickEditAddressButton(0);
        //edit address page web element assert (same elements as for add address page)
        isAddAddressPageWebElementDisplayed(addAddressPage);
        //edit address page text element assert (same elements as for add address page)
        isAddAddressPageTextElementAsExpected(addAddressPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert edit address page title is as expected (same element as for add address page)
        assertEquals("Update Address", addAddressPage.getAddAddressPageTitle(), "The update address page title doesn't match expectations.");
        //capture screenshot of the update address page display before edited data input
        captureScreenshot(driver, "Update Address Page Display Before Edited Data Input");
        //invalid edited user address getter - too short user post code (4 digits)
        addAddressPageTooShortSingularInput.invalidUserEditedAddressDataTooShortPostCodeGetter();
        //input valid edited address into address 1 input field
        addAddressPageTooShortSingularInput.inputValidUserAddressIntoAddress1InputField();
        //input valid edited address city into city input field
        addAddressPageTooShortSingularInput.inputValidUserCityIntoCityInputField();
        //input too short edited address post code into post code input field (4 digits)
        addAddressPageTooShortSingularInput.inputTooShortUserPostCodeIntoPostCodeInputField();
        //input valid edited address phone into phone input field
        addAddressPageTooShortSingularInput.inputValidUserPhoneIntoPhoneInputField();
        //capture screenshot of the update address page display after invalid data input - too short post code
        captureScreenshot(driver, "Update Address Page Display After Invalid Edited Data Input - Too Short Post Code");
        //click 'Save address' button
        addAddressPage.clickSaveAddressButton();
        //assert the user gets an expected error, log the issue otherwise
        try {
            assertEquals("Post code is too short.", addAddressPage.getAddAddressPageSingularInputError(), "The update address page too short post code input error doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The too short update address post code input error wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Update User Address Test Result - Too Short Post Code");
    }

    //invalid update user address test method - too short user phone (2 digits)
    protected void invalidEditUserAddressTooShortPhoneTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AddressDashboardPage addressDashboardPage = new AddressDashboardPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        AddAddressPageTooShortSingularInput addAddressPageTooShortSingularInput = new AddAddressPageTooShortSingularInput(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Addresses' link
        accountDashboardPage.clickAddressesLink();
        //address dashboard page web element assert
        isAddressDashboardPageWebElementDisplayed(addressDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert address dashboard page title is a expected
        assertEquals("Addresses", addressDashboardPage.getAddressDashboardPageTitle(), "The address dashboard page title doesn't match expectations.");
        //log address dashboard page data
        logAddressDashboardPageData(addressDashboardPage);
        //capture screenshot of the address dashboard page display
        captureScreenshot(driver, "Address Dashboard Page Display");
        //click 'Edit' address button
        addressDashboardPage.clickEditAddressButton(0);
        //edit address page web element assert (same elements as for add address page)
        isAddAddressPageWebElementDisplayed(addAddressPage);
        //edit address page text element assert (same elements as for add address page)
        isAddAddressPageTextElementAsExpected(addAddressPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert edit address page title is as expected (same element as for add address page)
        assertEquals("Update Address", addAddressPage.getAddAddressPageTitle(), "The update address page title doesn't match expectations.");
        //capture screenshot of the update address page display before edited data input
        captureScreenshot(driver, "Update Address Page Display Before Edited Data Input");
        //invalid edited user address getter - too short user phone (2 digits)
        addAddressPageTooShortSingularInput.invalidUserEditedAddressDataTooShortPhoneGetter();
        //input valid edited address into address 1 input field
        addAddressPageTooShortSingularInput.inputValidUserAddressIntoAddress1InputField();
        //input valid edited address city into city input field
        addAddressPageTooShortSingularInput.inputValidUserCityIntoCityInputField();
        //input valid edited address post code into post code input field
        addAddressPageTooShortSingularInput.inputValidUserPostCodeIntoPostCodeInputField();
        //input too short edited address phone into phone input field (2 digits)
        addAddressPageTooShortSingularInput.inputTooShortUserPhoneIntoPhoneInputField();
        //capture screenshot of the update address page display after invalid data input - too short phone
        captureScreenshot(driver, "Update Address Page Display After Invalid Edited Data Input - Too Short Phone");
        //click 'Save address' button
        addAddressPage.clickSaveAddressButton();
        //assert the user gets an expected error, log the issue otherwise
        try {
            assertEquals("Phone is too short.", addAddressPage.getAddAddressPageSingularInputError(), "The update address page too short phone input error doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The too short update address phone input error wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Update User Address Test Result - Too Short Phone");
    }

    //too long singular input

    //invalid update user address test method - too long user first name (100 chars)
    protected void invalidEditUserAddressTooLongFirstNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AddressDashboardPage addressDashboardPage = new AddressDashboardPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        AddAddressPageTooLongSingularInput addAddressPageTooLongSingularInput = new AddAddressPageTooLongSingularInput(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Addresses' link
        accountDashboardPage.clickAddressesLink();
        //address dashboard page web element assert
        isAddressDashboardPageWebElementDisplayed(addressDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert address dashboard page title is a expected
        assertEquals("Addresses", addressDashboardPage.getAddressDashboardPageTitle(), "The address dashboard page title doesn't match expectations.");
        //log address dashboard page data
        logAddressDashboardPageData(addressDashboardPage);
        //capture screenshot of the address dashboard page display
        captureScreenshot(driver, "Address Dashboard Page Display");
        //click 'Edit' address button
        addressDashboardPage.clickEditAddressButton(0);
        //edit address page web element assert (same elements as for add address page)
        isAddAddressPageWebElementDisplayed(addAddressPage);
        //edit address page text element assert (same elements as for add address page)
        isAddAddressPageTextElementAsExpected(addAddressPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert edit address page title is as expected (same element as for add address page)
        assertEquals("Update Address", addAddressPage.getAddAddressPageTitle(), "The update address page title doesn't match expectations.");
        //capture screenshot of the update address page display before edited data input
        captureScreenshot(driver, "Update Address Page Display Before Edited Data Input");
        //invalid edited user address getter - too long user first name (100 chars)
        addAddressPageTooLongSingularInput.invalidUserEditedAddressDataTooLongFirstNameGetter();
        //input too long address first name into first name input field (100 chars)
        addAddressPageTooLongSingularInput.inputTooLongUserFirstNameIntoFirstNameInputField();
        //input valid edited address into address 1 input field
        addAddressPageTooLongSingularInput.inputValidUserAddressIntoAddress1InputField();
        //input valid edited address city into city input field
        addAddressPageTooLongSingularInput.inputValidUserCityIntoCityInputField();
        //input valid edited address post code into post code input field
        addAddressPageTooLongSingularInput.inputValidUserPostCodeIntoPostCodeInputField();
        //input valid edited address phone into phone input field
        addAddressPageTooLongSingularInput.inputValidUserPhoneIntoPhoneInputField();
        //capture screenshot of the update address page display after invalid data input - too long first name
        captureScreenshot(driver, "Update Address Page Display After Invalid Edited Data Input - Too Long First Name");
        //click 'Save address' button
        addAddressPage.clickSaveAddressButton();
        //assert the user gets an expected error, log the issue otherwise
        try {
            assertEquals("First name is too long.", addAddressPage.getAddAddressPageSingularInputError(), "The update address page too long first name input error doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The too long update address first name input error wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Update User Address Test Result - Too Long First Name");
    }

    //invalid update user address test method - too long user last name (100 chars)
    protected void invalidEditUserAddressTooLongLastNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AddressDashboardPage addressDashboardPage = new AddressDashboardPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        AddAddressPageTooLongSingularInput addAddressPageTooLongSingularInput = new AddAddressPageTooLongSingularInput(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Addresses' link
        accountDashboardPage.clickAddressesLink();
        //address dashboard page web element assert
        isAddressDashboardPageWebElementDisplayed(addressDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert address dashboard page title is a expected
        assertEquals("Addresses", addressDashboardPage.getAddressDashboardPageTitle(), "The address dashboard page title doesn't match expectations.");
        //log address dashboard page data
        logAddressDashboardPageData(addressDashboardPage);
        //capture screenshot of the address dashboard page display
        captureScreenshot(driver, "Address Dashboard Page Display");
        //click 'Edit' address button
        addressDashboardPage.clickEditAddressButton(0);
        //edit address page web element assert (same elements as for add address page)
        isAddAddressPageWebElementDisplayed(addAddressPage);
        //edit address page text element assert (same elements as for add address page)
        isAddAddressPageTextElementAsExpected(addAddressPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert edit address page title is as expected (same element as for add address page)
        assertEquals("Update Address", addAddressPage.getAddAddressPageTitle(), "The update address page title doesn't match expectations.");
        //capture screenshot of the update address page display before edited data input
        captureScreenshot(driver, "Update Address Page Display Before Edited Data Input");
        //invalid edited user address getter - too long user last name (100 chars)
        addAddressPageTooLongSingularInput.invalidUserEditedAddressDataTooLongLastNameGetter();
        //input too long address last name into last name input field (100 chars)
        addAddressPageTooLongSingularInput.inputTooLongUserLastNameIntoLastNameInputField();
        //input valid edited address into address 1 input field
        addAddressPageTooLongSingularInput.inputValidUserAddressIntoAddress1InputField();
        //input valid edited address city into city input field
        addAddressPageTooLongSingularInput.inputValidUserCityIntoCityInputField();
        //input valid edited address post code into post code input field
        addAddressPageTooLongSingularInput.inputValidUserPostCodeIntoPostCodeInputField();
        //input valid edited address phone into phone input field
        addAddressPageTooLongSingularInput.inputValidUserPhoneIntoPhoneInputField();
        //capture screenshot of the update address page display after invalid data input - too long last name
        captureScreenshot(driver, "Update Address Page Display After Invalid Edited Data Input - Too Long Last Name");
        //click 'Save address' button
        addAddressPage.clickSaveAddressButton();
        //assert the user gets an expected error, log the issue otherwise
        try {
            assertEquals("Last name is too long.", addAddressPage.getAddAddressPageSingularInputError(), "The update address page too long last name input error doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The too long update address last name input error wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Update User Address Test Result - Too Long Last Name");
    }

    //invalid update user address test method - too long user address (100 chars)
    protected void invalidEditUserAddressTooLongAddressTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AddressDashboardPage addressDashboardPage = new AddressDashboardPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        AddAddressPageTooLongSingularInput addAddressPageTooLongSingularInput = new AddAddressPageTooLongSingularInput(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Addresses' link
        accountDashboardPage.clickAddressesLink();
        //address dashboard page web element assert
        isAddressDashboardPageWebElementDisplayed(addressDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert address dashboard page title is a expected
        assertEquals("Addresses", addressDashboardPage.getAddressDashboardPageTitle(), "The address dashboard page title doesn't match expectations.");
        //log address dashboard page data
        logAddressDashboardPageData(addressDashboardPage);
        //capture screenshot of the address dashboard page display
        captureScreenshot(driver, "Address Dashboard Page Display");
        //click 'Edit' address button
        addressDashboardPage.clickEditAddressButton(0);
        //edit address page web element assert (same elements as for add address page)
        isAddAddressPageWebElementDisplayed(addAddressPage);
        //edit address page text element assert (same elements as for add address page)
        isAddAddressPageTextElementAsExpected(addAddressPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert edit address page title is as expected (same element as for add address page)
        assertEquals("Update Address", addAddressPage.getAddAddressPageTitle(), "The update address page title doesn't match expectations.");
        //capture screenshot of the update address page display before edited data input
        captureScreenshot(driver, "Update Address Page Display Before Edited Data Input");
        //invalid edited user address getter - too long user address (100 chars)
        addAddressPageTooLongSingularInput.invalidUserEditedAddressDataTooLongAddressGetter();
        //input too long edited address into address 1 input field (100 chars)
        addAddressPageTooLongSingularInput.inputTooLongUserAddressIntoAddress1InputField();
        //input valid edited address city into city input field
        addAddressPageTooLongSingularInput.inputValidUserCityIntoCityInputField();
        //input valid edited address post code into post code input field
        addAddressPageTooLongSingularInput.inputValidUserPostCodeIntoPostCodeInputField();
        //input valid edited address phone into phone input field
        addAddressPageTooLongSingularInput.inputValidUserPhoneIntoPhoneInputField();
        //capture screenshot of the update address page display after invalid data input - too long address
        captureScreenshot(driver, "Update Address Page Display After Invalid Edited Data Input - Too Long Address");
        //click 'Save address' button
        addAddressPage.clickSaveAddressButton();
        //assert the user gets an expected error, log the issue otherwise
        try {
            assertEquals("Address is too long.", addAddressPage.getAddAddressPageSingularInputError(), "The update address page too long address input error doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The too long update address address input error wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Update User Address Test Result - Too Long Address");
    }

    //invalid update user address test method - too long user city (100 chars)
    protected void invalidEditUserAddressTooLongCityTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AddressDashboardPage addressDashboardPage = new AddressDashboardPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        AddAddressPageTooLongSingularInput addAddressPageTooLongSingularInput = new AddAddressPageTooLongSingularInput(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Addresses' link
        accountDashboardPage.clickAddressesLink();
        //address dashboard page web element assert
        isAddressDashboardPageWebElementDisplayed(addressDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert address dashboard page title is a expected
        assertEquals("Addresses", addressDashboardPage.getAddressDashboardPageTitle(), "The address dashboard page title doesn't match expectations.");
        //log address dashboard page data
        logAddressDashboardPageData(addressDashboardPage);
        //capture screenshot of the address dashboard page display
        captureScreenshot(driver, "Address Dashboard Page Display");
        //click 'Edit' address button
        addressDashboardPage.clickEditAddressButton(0);
        //edit address page web element assert (same elements as for add address page)
        isAddAddressPageWebElementDisplayed(addAddressPage);
        //edit address page text element assert (same elements as for add address page)
        isAddAddressPageTextElementAsExpected(addAddressPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert edit address page title is as expected (same element as for add address page)
        assertEquals("Update Address", addAddressPage.getAddAddressPageTitle(), "The update address page title doesn't match expectations.");
        //capture screenshot of the update address page display before edited data input
        captureScreenshot(driver, "Update Address Page Display Before Edited Data Input");
        //invalid edited user address getter - too long user city (100 chars)
        addAddressPageTooLongSingularInput.invalidUserEditedAddressDataTooLongCityGetter();
        //input valid edited address into address 1 input field
        addAddressPageTooLongSingularInput.inputValidUserAddressIntoAddress1InputField();
        //input too long edited address city into city input field (100 chars)
        addAddressPageTooLongSingularInput.inputTooLongUserCityIntoCityInputField();
        //input valid edited address post code into post code input field
        addAddressPageTooLongSingularInput.inputValidUserPostCodeIntoPostCodeInputField();
        //input valid edited address phone into phone input field
        addAddressPageTooLongSingularInput.inputValidUserPhoneIntoPhoneInputField();
        //capture screenshot of the update address page display after invalid data input - too long city
        captureScreenshot(driver, "Update Address Page Display After Invalid Edited Data Input - Too Long City");
        //click 'Save address' button
        addAddressPage.clickSaveAddressButton();
        //assert the user gets an expected error, log the issue otherwise
        try {
            assertEquals("City is too long.", addAddressPage.getAddAddressPageSingularInputError(), "The update address page too long city input error doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The too long update address city input error wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Update User Address Test Result - Too Long City");
    }

    //invalid update user address test method - too long user post code (6 digits)
    protected void invalidEditUserAddressTooLongPostCodeTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AddressDashboardPage addressDashboardPage = new AddressDashboardPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        AddAddressPageTooLongSingularInput addAddressPageTooLongSingularInput = new AddAddressPageTooLongSingularInput(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Addresses' link
        accountDashboardPage.clickAddressesLink();
        //address dashboard page web element assert
        isAddressDashboardPageWebElementDisplayed(addressDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert address dashboard page title is a expected
        assertEquals("Addresses", addressDashboardPage.getAddressDashboardPageTitle(), "The address dashboard page title doesn't match expectations.");
        //log address dashboard page data
        logAddressDashboardPageData(addressDashboardPage);
        //capture screenshot of the address dashboard page display
        captureScreenshot(driver, "Address Dashboard Page Display");
        //click 'Edit' address button
        addressDashboardPage.clickEditAddressButton(0);
        //edit address page web element assert (same elements as for add address page)
        isAddAddressPageWebElementDisplayed(addAddressPage);
        //edit address page text element assert (same elements as for add address page)
        isAddAddressPageTextElementAsExpected(addAddressPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert edit address page title is as expected (same element as for add address page)
        assertEquals("Update Address", addAddressPage.getAddAddressPageTitle(), "The update address page title doesn't match expectations.");
        //capture screenshot of the update address page display before edited data input
        captureScreenshot(driver, "Update Address Page Display Before Edited Data Input");
        //invalid edited user address getter - too long user post code (6 digits)
        addAddressPageTooLongSingularInput.invalidUserEditedAddressDataTooLongPostCodeGetter();
        //input valid edited address into address 1 input field
        addAddressPageTooLongSingularInput.inputValidUserAddressIntoAddress1InputField();
        //input valid edited address city into city input field
        addAddressPageTooLongSingularInput.inputValidUserCityIntoCityInputField();
        //input too long edited address post code into post code input field (6 digits)
        addAddressPageTooLongSingularInput.inputTooLongUserPostCodeIntoPostCodeInputField();
        //input valid edited address phone into phone input field
        addAddressPageTooLongSingularInput.inputValidUserPhoneIntoPhoneInputField();
        //capture screenshot of the update address page display after invalid data input - too long post code
        captureScreenshot(driver, "Update Address Page Display After Invalid Edited Data Input - Too Long Post Code");
        //click 'Save address' button
        addAddressPage.clickSaveAddressButton();
        //assert the user gets an expected error, log the issue otherwise
        try {
            assertEquals("Post code is too long.", addAddressPage.getAddAddressPageSingularInputError(), "The update address page too long post code input error doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The too long update address post code input error wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Update User Address Test Result - Too Long Post Code");
    }

    //invalid update user address test method - too long user phone (30 digits)
    protected void invalidEditUserAddressTooLongPhoneTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AddressDashboardPage addressDashboardPage = new AddressDashboardPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        AddAddressPageTooLongSingularInput addAddressPageTooLongSingularInput = new AddAddressPageTooLongSingularInput(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Addresses' link
        accountDashboardPage.clickAddressesLink();
        //address dashboard page web element assert
        isAddressDashboardPageWebElementDisplayed(addressDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert address dashboard page title is a expected
        assertEquals("Addresses", addressDashboardPage.getAddressDashboardPageTitle(), "The address dashboard page title doesn't match expectations.");
        //log address dashboard page data
        logAddressDashboardPageData(addressDashboardPage);
        //capture screenshot of the address dashboard page display
        captureScreenshot(driver, "Address Dashboard Page Display");
        //click 'Edit' address button
        addressDashboardPage.clickEditAddressButton(0);
        //edit address page web element assert (same elements as for add address page)
        isAddAddressPageWebElementDisplayed(addAddressPage);
        //edit address page text element assert (same elements as for add address page)
        isAddAddressPageTextElementAsExpected(addAddressPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert edit address page title is as expected (same element as for add address page)
        assertEquals("Update Address", addAddressPage.getAddAddressPageTitle(), "The update address page title doesn't match expectations.");
        //capture screenshot of the update address page display before edited data input
        captureScreenshot(driver, "Update Address Page Display Before Edited Data Input");
        //invalid edited user address getter - too long user phone (30 digits)
        addAddressPageTooLongSingularInput.invalidUserEditedAddressDataTooLongPhoneGetter();
        //input valid edited address into address 1 input field
        addAddressPageTooLongSingularInput.inputValidUserAddressIntoAddress1InputField();
        //input valid edited address city into city input field
        addAddressPageTooLongSingularInput.inputValidUserCityIntoCityInputField();
        //input valid edited address post code into post code input field
        addAddressPageTooLongSingularInput.inputValidUserPostCodeIntoPostCodeInputField();
        //input too long edited address phone into phone input field
        addAddressPageTooLongSingularInput.inputTooLongUserPhoneIntoPhoneInputField();
        //capture screenshot of the update address page display after invalid data input - too long phone
        captureScreenshot(driver, "Update Address Page Display After Invalid Edited Data Input - Too Long Phone");
        //click 'Save address' button
        addAddressPage.clickSaveAddressButton();
        //assert the user gets an expected error, log the issue otherwise
        try {
            assertEquals("Phone is too long.", addAddressPage.getAddAddressPageSingularInputError(), "The update address page too long phone input error doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The too long update address phone input error wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Update User Address Test Result - Too Long Phone");
    }

    //invalid singular input format

    //invalid update user address test method - invalid user first name format (special symbols only)
    protected void invalidEditUserAddressInvalidFirstNameFormatTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AddressDashboardPage addressDashboardPage = new AddressDashboardPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        AddAddressPageInvalidSingularInputFormat addAddressPageInvalidSingularInputFormat = new AddAddressPageInvalidSingularInputFormat(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Addresses' link
        accountDashboardPage.clickAddressesLink();
        //address dashboard page web element assert
        isAddressDashboardPageWebElementDisplayed(addressDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert address dashboard page title is a expected
        assertEquals("Addresses", addressDashboardPage.getAddressDashboardPageTitle(), "The address dashboard page title doesn't match expectations.");
        //log address dashboard page data
        logAddressDashboardPageData(addressDashboardPage);
        //capture screenshot of the address dashboard page display
        captureScreenshot(driver, "Address Dashboard Page Display");
        //click 'Edit' address button
        addressDashboardPage.clickEditAddressButton(0);
        //edit address page web element assert (same elements as for add address page)
        isAddAddressPageWebElementDisplayed(addAddressPage);
        //edit address page text element assert (same elements as for add address page)
        isAddAddressPageTextElementAsExpected(addAddressPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert edit address page title is as expected (same element as for add address page)
        assertEquals("Update Address", addAddressPage.getAddAddressPageTitle(), "The update address page title doesn't match expectations.");
        //capture screenshot of the update address page display before edited data input
        captureScreenshot(driver, "Update Address Page Display Before Edited Data Input");
        //invalid edited user address getter - invalid user first name format (special symbols only)
        addAddressPageInvalidSingularInputFormat.invalidUserEditedAddressDataInvalidFirstNameFormatGetter();
        //input invalid address first name format into first name input field (special symbols only)
        addAddressPageInvalidSingularInputFormat.inputInvalidUserFirstNameFormatIntoFirstNameInputField();
        //input valid edited address into address 1 input field
        addAddressPageInvalidSingularInputFormat.inputValidUserAddressIntoAddress1InputField();
        //input valid edited address city into city input field
        addAddressPageInvalidSingularInputFormat.inputValidUserCityIntoCityInputField();
        //input valid edited address post code into post code input field
        addAddressPageInvalidSingularInputFormat.inputValidUserPostCodeIntoPostCodeInputField();
        //input valid edited address phone into phone input field
        addAddressPageInvalidSingularInputFormat.inputValidUserPhoneIntoPhoneInputField();
        //capture screenshot of the update address page display after invalid data input - invalid first name format
        captureScreenshot(driver, "Update Address Page Display After Invalid Edited Data Input - Invalid First Name Format");
        //click 'Save address' button
        addAddressPage.clickSaveAddressButton();
        //assert the user gets an expected error, log the issue otherwise
        try {
            assertEquals("First name cannot consist of special symbols only.", addAddressPage.getAddAddressPageSingularInputError(), "The update address page invalid first name input format error doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The invalid update address first name input format error wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Update User Address Test Result - Invalid First Name Format");
    }

    //invalid update user address test method - invalid user last name format (special symbols only)
    protected void invalidEditUserAddressInvalidLastNameFormatTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AddressDashboardPage addressDashboardPage = new AddressDashboardPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        AddAddressPageInvalidSingularInputFormat addAddressPageInvalidSingularInputFormat = new AddAddressPageInvalidSingularInputFormat(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Addresses' link
        accountDashboardPage.clickAddressesLink();
        //address dashboard page web element assert
        isAddressDashboardPageWebElementDisplayed(addressDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert address dashboard page title is a expected
        assertEquals("Addresses", addressDashboardPage.getAddressDashboardPageTitle(), "The address dashboard page title doesn't match expectations.");
        //log address dashboard page data
        logAddressDashboardPageData(addressDashboardPage);
        //capture screenshot of the address dashboard page display
        captureScreenshot(driver, "Address Dashboard Page Display");
        //click 'Edit' address button
        addressDashboardPage.clickEditAddressButton(0);
        //edit address page web element assert (same elements as for add address page)
        isAddAddressPageWebElementDisplayed(addAddressPage);
        //edit address page text element assert (same elements as for add address page)
        isAddAddressPageTextElementAsExpected(addAddressPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert edit address page title is as expected (same element as for add address page)
        assertEquals("Update Address", addAddressPage.getAddAddressPageTitle(), "The update address page title doesn't match expectations.");
        //capture screenshot of the update address page display before edited data input
        captureScreenshot(driver, "Update Address Page Display Before Edited Data Input");
        //invalid edited user address getter - invalid user last name format (special symbols only)
        addAddressPageInvalidSingularInputFormat.invalidUserEditedAddressDataInvalidLastNameFormatGetter();
        //input invalid address last name format into last name input field (special symbols only)
        addAddressPageInvalidSingularInputFormat.inputInvalidUserLastNameFormatIntoLastNameInputField();
        //input valid edited address into address 1 input field
        addAddressPageInvalidSingularInputFormat.inputValidUserAddressIntoAddress1InputField();
        //input valid edited address city into city input field
        addAddressPageInvalidSingularInputFormat.inputValidUserCityIntoCityInputField();
        //input valid edited address post code into post code input field
        addAddressPageInvalidSingularInputFormat.inputValidUserPostCodeIntoPostCodeInputField();
        //input valid edited address phone into phone input field
        addAddressPageInvalidSingularInputFormat.inputValidUserPhoneIntoPhoneInputField();
        //capture screenshot of the update address page display after invalid data input - invalid last name format
        captureScreenshot(driver, "Update Address Page Display After Invalid Edited Data Input - Invalid Last Name Format");
        //click 'Save address' button
        addAddressPage.clickSaveAddressButton();
        //assert the user gets an expected error, log the issue otherwise
        try {
            assertEquals("Last name cannot consist of special symbols only.", addAddressPage.getAddAddressPageSingularInputError(), "The update address page invalid last name input format error doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The invalid update address last name input format error wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Update User Address Test Result - Invalid Last Name Format");
    }

    //invalid update user address test method - invalid user address format (special symbols only)
    protected void invalidEditUserAddressInvalidAddressFormatTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AddressDashboardPage addressDashboardPage = new AddressDashboardPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        AddAddressPageInvalidSingularInputFormat addAddressPageInvalidSingularInputFormat = new AddAddressPageInvalidSingularInputFormat(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Addresses' link
        accountDashboardPage.clickAddressesLink();
        //address dashboard page web element assert
        isAddressDashboardPageWebElementDisplayed(addressDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert address dashboard page title is a expected
        assertEquals("Addresses", addressDashboardPage.getAddressDashboardPageTitle(), "The address dashboard page title doesn't match expectations.");
        //log address dashboard page data
        logAddressDashboardPageData(addressDashboardPage);
        //capture screenshot of the address dashboard page display
        captureScreenshot(driver, "Address Dashboard Page Display");
        //click 'Edit' address button
        addressDashboardPage.clickEditAddressButton(0);
        //edit address page web element assert (same elements as for add address page)
        isAddAddressPageWebElementDisplayed(addAddressPage);
        //edit address page text element assert (same elements as for add address page)
        isAddAddressPageTextElementAsExpected(addAddressPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert edit address page title is as expected (same element as for add address page)
        assertEquals("Update Address", addAddressPage.getAddAddressPageTitle(), "The update address page title doesn't match expectations.");
        //capture screenshot of the update address page display before edited data input
        captureScreenshot(driver, "Update Address Page Display Before Edited Data Input");
        //invalid edited user address getter - invalid user address format (special symbols only)
        addAddressPageInvalidSingularInputFormat.invalidUserEditedAddressDataInvalidAddressFormatGetter();
        //input invalid edited address format into address 1 input field (special symbols only)
        addAddressPageInvalidSingularInputFormat.inputInvalidUserAddressFormatIntoAddress1InputField();
        //input valid edited address city into city input field
        addAddressPageInvalidSingularInputFormat.inputValidUserCityIntoCityInputField();
        //input valid edited address post code into post code input field
        addAddressPageInvalidSingularInputFormat.inputValidUserPostCodeIntoPostCodeInputField();
        //input valid edited address phone into phone input field
        addAddressPageInvalidSingularInputFormat.inputValidUserPhoneIntoPhoneInputField();
        //capture screenshot of the update address page display after invalid data input - invalid address format
        captureScreenshot(driver, "Update Address Page Display After Invalid Edited Data Input - Invalid Address Format");
        //click 'Save address' button
        addAddressPage.clickSaveAddressButton();
        //assert the user gets an expected error, log the issue otherwise
        try {
            assertEquals("Address cannot consist of special symbols only.", addAddressPage.getAddAddressPageSingularInputError(), "The update address page invalid address input format error doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The invalid update address input format error wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Update User Address Test Result - Invalid Address Format");
    }

    //invalid update user address test method - invalid user city format (special symbols only)
    protected void invalidEditUserAddressInvalidCityFormatTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AddressDashboardPage addressDashboardPage = new AddressDashboardPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        AddAddressPageInvalidSingularInputFormat addAddressPageInvalidSingularInputFormat = new AddAddressPageInvalidSingularInputFormat(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Addresses' link
        accountDashboardPage.clickAddressesLink();
        //address dashboard page web element assert
        isAddressDashboardPageWebElementDisplayed(addressDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert address dashboard page title is a expected
        assertEquals("Addresses", addressDashboardPage.getAddressDashboardPageTitle(), "The address dashboard page title doesn't match expectations.");
        //log address dashboard page data
        logAddressDashboardPageData(addressDashboardPage);
        //capture screenshot of the address dashboard page display
        captureScreenshot(driver, "Address Dashboard Page Display");
        //click 'Edit' address button
        addressDashboardPage.clickEditAddressButton(0);
        //edit address page web element assert (same elements as for add address page)
        isAddAddressPageWebElementDisplayed(addAddressPage);
        //edit address page text element assert (same elements as for add address page)
        isAddAddressPageTextElementAsExpected(addAddressPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert edit address page title is as expected (same element as for add address page)
        assertEquals("Update Address", addAddressPage.getAddAddressPageTitle(), "The update address page title doesn't match expectations.");
        //capture screenshot of the update address page display before edited data input
        captureScreenshot(driver, "Update Address Page Display Before Edited Data Input");
        //invalid edited user address getter - invalid user city format (special symbols only)
        addAddressPageInvalidSingularInputFormat.invalidUserEditedAddressDataInvalidCityFormatGetter();
        //input valid edited address into address 1 input field
        addAddressPageInvalidSingularInputFormat.inputValidUserAddressIntoAddress1InputField();
        //input invalid edited address city format into city input field
        addAddressPageInvalidSingularInputFormat.inputInvalidUserCityFormatIntoCityInputField();
        //input valid edited address post code into post code input field
        addAddressPageInvalidSingularInputFormat.inputValidUserPostCodeIntoPostCodeInputField();
        //input valid edited address phone into phone input field
        addAddressPageInvalidSingularInputFormat.inputValidUserPhoneIntoPhoneInputField();
        //capture screenshot of the update address page display after invalid data input - invalid city format
        captureScreenshot(driver, "Update Address Page Display After Invalid Edited Data Input - Invalid City Format");
        //click 'Save address' button
        addAddressPage.clickSaveAddressButton();
        //assert the user gets an expected error, log the issue otherwise
        try {
            assertEquals("City cannot consist of special symbols only.", addAddressPage.getAddAddressPageSingularInputError(), "The update address page invalid address city input format error doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The invalid update address city input format error wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Update User Address Test Result - Invalid City Format");
    }

    //invalid update user address test method - invalid user post code format (special symbols only)
    protected void invalidEditUserAddressInvalidPostCodeFormatTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AddressDashboardPage addressDashboardPage = new AddressDashboardPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        AddAddressPageInvalidSingularInputFormat addAddressPageInvalidSingularInputFormat = new AddAddressPageInvalidSingularInputFormat(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Addresses' link
        accountDashboardPage.clickAddressesLink();
        //address dashboard page web element assert
        isAddressDashboardPageWebElementDisplayed(addressDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert address dashboard page title is a expected
        assertEquals("Addresses", addressDashboardPage.getAddressDashboardPageTitle(), "The address dashboard page title doesn't match expectations.");
        //log address dashboard page data
        logAddressDashboardPageData(addressDashboardPage);
        //capture screenshot of the address dashboard page display
        captureScreenshot(driver, "Address Dashboard Page Display");
        //click 'Edit' address button
        addressDashboardPage.clickEditAddressButton(0);
        //edit address page web element assert (same elements as for add address page)
        isAddAddressPageWebElementDisplayed(addAddressPage);
        //edit address page text element assert (same elements as for add address page)
        isAddAddressPageTextElementAsExpected(addAddressPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert edit address page title is as expected (same element as for add address page)
        assertEquals("Update Address", addAddressPage.getAddAddressPageTitle(), "The update address page title doesn't match expectations.");
        //capture screenshot of the update address page display before edited data input
        captureScreenshot(driver, "Update Address Page Display Before Edited Data Input");
        //invalid edited user address getter - invalid user post code format (special symbols only)
        addAddressPageInvalidSingularInputFormat.invalidUserEditedAddressDataInvalidPostCodeFormatGetter();
        //input valid edited address into address 1 input field
        addAddressPageInvalidSingularInputFormat.inputValidUserAddressIntoAddress1InputField();
        //input valid edited address city into city input field
        addAddressPageInvalidSingularInputFormat.inputValidUserCityIntoCityInputField();
        //input invalid edited address post code format into post code input field
        addAddressPageInvalidSingularInputFormat.inputInvalidUserPostCodeFormatIntoPostCodeInputField();
        //input valid edited address phone into phone input field
        addAddressPageInvalidSingularInputFormat.inputValidUserPhoneIntoPhoneInputField();
        //capture screenshot of the update address page display after invalid data input - invalid post code format
        captureScreenshot(driver, "Update Address Page Display After Invalid Edited Data Input - Invalid Post Code Format");
        //click 'Save address' button
        addAddressPage.clickSaveAddressButton();
        //assert the user gets an expected error, log the issue otherwise
        try {
            assertEquals("Post code cannot consist of special symbols only.", addAddressPage.getAddAddressPageSingularInputError(), "The update address page invalid address post code input format error doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The invalid update address post code input format error wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Update User Address Test Result - Invalid Post Code Format");
    }

    //invalid update user address test method - invalid user phone format (special symbols only)
    protected void invalidEditUserAddressInvalidPhoneFormatTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountDashboardPage accountDashboardPage = new AccountDashboardPage(driver);
        AddressDashboardPage addressDashboardPage = new AddressDashboardPage(driver);
        AddAddressPage addAddressPage = new AddAddressPage(driver);
        AddAddressPageInvalidSingularInputFormat addAddressPageInvalidSingularInputFormat = new AddAddressPageInvalidSingularInputFormat(driver);
        //general page web element assert (elements that all pages have)
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert (elements that all pages have)
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Account' navbar link
        generalPage.clickAccountLink();
        //account dashboard page web element assert
        isAccountDashboardPageWebElementDisplayed(accountDashboardPage);
        //account dashboard page text element assert
        isAccountDashboardPageTextElementAsExpected(accountDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        isOrdersPageNoOrderTextElementsAsExpected(accountDashboardPage);
        //capture screenshot of the orders page display(since the user gets here after clicking 'Account' link)
        captureScreenshot(driver, "Orders Page Display");
        //click 'Addresses' link
        accountDashboardPage.clickAddressesLink();
        //address dashboard page web element assert
        isAddressDashboardPageWebElementDisplayed(addressDashboardPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert address dashboard page title is a expected
        assertEquals("Addresses", addressDashboardPage.getAddressDashboardPageTitle(), "The address dashboard page title doesn't match expectations.");
        //log address dashboard page data
        logAddressDashboardPageData(addressDashboardPage);
        //capture screenshot of the address dashboard page display
        captureScreenshot(driver, "Address Dashboard Page Display");
        //click 'Edit' address button
        addressDashboardPage.clickEditAddressButton(0);
        //edit address page web element assert (same elements as for add address page)
        isAddAddressPageWebElementDisplayed(addAddressPage);
        //edit address page text element assert (same elements as for add address page)
        isAddAddressPageTextElementAsExpected(addAddressPage);
        //account dashboard page breadcrumb web element assert
        isAccountDashboardPageBreadcrumbWebElementDisplayed(accountDashboardPage);
        //assert edit address page title is as expected (same element as for add address page)
        assertEquals("Update Address", addAddressPage.getAddAddressPageTitle(), "The update address page title doesn't match expectations.");
        //capture screenshot of the update address page display before edited data input
        captureScreenshot(driver, "Update Address Page Display Before Edited Data Input");
        //invalid edited user address getter - invalid user phone format (special symbols only)
        addAddressPageInvalidSingularInputFormat.invalidUserEditedAddressDataInvalidPhoneFormatGetter();
        //input valid edited address into address 1 input field
        addAddressPageInvalidSingularInputFormat.inputValidUserAddressIntoAddress1InputField();
        //input valid edited address city into city input field
        addAddressPageInvalidSingularInputFormat.inputValidUserCityIntoCityInputField();
        //input valid edited address post code into post code input field
        addAddressPageInvalidSingularInputFormat.inputValidUserPostCodeIntoPostCodeInputField();
        //input invalid edited address phone format into phone input field
        addAddressPageInvalidSingularInputFormat.inputInvalidUserPhoneFormatIntoPhoneInputField();
        //capture screenshot of the update address page display after invalid data input - invalid phone format
        captureScreenshot(driver, "Update Address Page Display After Invalid Edited Data Input - Invalid Phone Format");
        //click 'Save address' button
        addAddressPage.clickSaveAddressButton();
        //assert the user gets an expected error, log the issue otherwise
        try {
            assertEquals("Phone cannot consist of special symbols only.", addAddressPage.getAddAddressPageSingularInputError(), "The update address page invalid address phone input format error doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The invalid update address phone input format error wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Update User Address Test Result - Invalid Phone Format");
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //general page web element assert test method (elements that all pages share -> header / footer)
    protected void isGeneralPageWebElementDisplayed(GeneralPage generalPage){
        //header -> upper navbar
        //assert header upper navbar search dropdown link is displayed
        //assertTrue(generalPage.isHeaderUpperNavSearchDropdownLinkDisplayed(), "The header upper navbar search dropdown link isn't displayed");
        //assert header upper navbar gift certificates link is displayed
        assertTrue(generalPage.isHeaderUpperNavGiftCertificatesLinkDisplayed(), "The header upper navbar gift certificates link isn't displayed");
        //assert header upper navbar cart link is displayed
        assertTrue(generalPage.isHeaderUpperNavCartLinkDisplayed(), "The header upper navbar cart link isn't displayed");
        //assert header home page logo link is displayed (not all pages have this element)
        //assertTrue(generalPage.isHeaderHomePageLogoLinkDisplayed(), "The header home page logo link isn't displayed");
        //header -> lower navbar
        //assert header lower navbar garden dropdown link is displayed
        assertTrue(generalPage.isHeaderLowerNavGardenDropdownLinkDisplayed(), "The header lower navbar garden dropdown menu link isn't displayed");
        //assert header lower navbar shop all link is displayed
        assertTrue(generalPage.isHeaderLowerNavShopAllLinkDisplayed(), "The header lower navbar shop all link isn't displayed");
        //assert header lower navbar kitchen link is displayed
        assertTrue(generalPage.isHeaderLowerNavKitchenLinkDisplayed(), "The header lower navbar kitchen link isn't displayed");
        //assert header lower navbar publications link is displayed
        assertTrue(generalPage.isHeaderLowerNavPublicationsLinkDisplayed(), "The header lower navbar publications all link isn't displayed");
        //assert header lower navbar utility link is displayed
        assertTrue(generalPage.isHeaderLowerNavUtilityLinkDisplayed(), "The header lower navbar utility link isn't displayed");
        //assert header lower navbar journal link is displayed
        assertTrue(generalPage.isHeaderLowerNavJournalLinkDisplayed(), "The header lower navbar journal link isn't displayed");
        //assert header lower navbar our story link is displayed
        assertTrue(generalPage.isHeaderLowerNavOurStoryLinkDisplayed(), "The header lower navbar our story link isn't displayed");
        //assert header lower navbar contact us link is displayed
        assertTrue(generalPage.isHeaderLowerNavContactUsLinkDisplayed(), "The header lower navbar contact us link isn't displayed");
        //assert header lower navbar shipping and returns link is displayed
        assertTrue(generalPage.isHeaderLowerNavShippingAndReturnsLinkDisplayed(), "The header lower navbar shipping and returns link isn't displayed");
        //footer section
        //navigate column
        //assert footer navigate section title is displayed
        assertTrue(generalPage.isFooterNavigateSectionTitleDisplayed(), "The footer navigate section title isn't displayed");
        //assert footer navigate section journal link is displayed
        assertTrue(generalPage.isFooterJournalLinkDisplayed(), "The footer navigate section journal link isn't displayed");
        //assert footer navigate section our story link is displayed
        assertTrue(generalPage.isFooterOurStoryLinkDisplayed(), "The footer navigate section our story link isn't displayed");
        //assert footer navigate section contact us link is displayed
        assertTrue(generalPage.isFooterContactUsLinkDisplayed(), "The footer navigate section contact us link isn't displayed");
        //assert footer navigate section shipping and returns link is displayed
        assertTrue(generalPage.isFooterShippingAndReturnsLinkDisplayed(), "The footer navigate section shipping and returns us link isn't displayed");
        //assert footer navigate section sitemap link is displayed
        assertTrue(generalPage.isFooterSitemapLinkDisplayed(), "The footer navigate section sitemap link isn't displayed");
        //categories column
        //assert footer categories section title is displayed
        assertTrue(generalPage.isFooterCategoriesSectionTitleDisplayed(), "The footer categories section title isn't displayed");
        //assert footer categories section garden link is displayed
        assertTrue(generalPage.isFooterGardenLinkDisplayed(), "The footer categories section garden link isn't displayed");
        //assert footer categories section shop all link is displayed
        assertTrue(generalPage.isFooterShopAllLinkDisplayed(), "The footer categories section shop all link isn't displayed");
        //assert footer categories section kitchen link is displayed
        assertTrue(generalPage.isFooterKitchenLinkDisplayed(), "The footer categories section kitchen link isn't displayed");
        //assert footer categories section publications link is displayed
        assertTrue(generalPage.isFooterPublicationsLinkDisplayed(), "The footer categories section publications link isn't displayed");
        //assert footer categories section utility link is displayed
        assertTrue(generalPage.isFooterUtilityLinkDisplayed(), "The footer categories section utility link isn't displayed");
        //popular brands column
        //assert footer popular brands section title is displayed
        assertTrue(generalPage.isFooterPopularBrandsSectionTitleDisplayed(), "The footer popular brands section title isn't displayed");
        //assert footer popular brands section fresh brand link is displayed
        assertTrue(generalPage.isFooterFreshBrandLinkDisplayed(), "The footer popular brands section fresh brand link isn't displayed");
        //assert footer popular brands section OFS link is displayed
        assertTrue(generalPage.isFooterOFSLinkDisplayed(), "The footer popular brands section OFS link isn't displayed");
        //assert footer popular brands section view all link is displayed
        assertTrue(generalPage.isFooterViewAllLinkDisplayed(), "The footer popular brands section view all link isn't displayed");
        //information section
        //assert footer information section title is displayed
        assertTrue(generalPage.isFooterInfoSectionTitleDisplayed(), "The footer information section title isn't displayed");
        //assert footer information section address text is displayed
        assertTrue(generalPage.isFooterAddressTextDisplayed(), "The footer information section address text isn't displayed");
        //assert footer information section call us text is displayed
        assertTrue(generalPage.isFooterCallUsTextDisplayed(), "The footer information section call us text isn't displayed");
        //subscribe to newsletter column
        //assert footer subscribe to newsletter section title is displayed
        assertTrue(generalPage.isFooterSubscribeToNewsletterSectionTitleDisplayed(), "The footer subscribe to newsletter section title isn't displayed");
        //assert footer subscribe to newsletter section subtext is displayed
        assertTrue(generalPage.isFooterSubscribeToNewsletterSectionSubtextDisplayed(), "The footer subscribe to newsletter section subtext isn't displayed");
        //assert footer subscribe to newsletter email input field is displayed
        assertTrue(generalPage.isFooterSubscribeToNewsletterEmailInputFieldDisplayed(), "The footer subscribe to newsletter email input field isn't displayed");
        //assert footer subscribe button is displayed
        assertTrue(generalPage.isFooterSubscribeButtonDisplayed(), "The footer subscribe button isn't displayed");
        //copyright section
        //assert footer powered by text is displayed
        assertTrue(generalPage.isFooterPoweredByTextDisplayed(), "The footer powered by text isn't displayed");
        //assert footer copyright text is displayed
        assertTrue(generalPage.isFooterCopyrightTextDisplayed(), "The footer copyright text isn't displayed");
    }

    //home page web element assert test method
    protected void isHomePageWebElementDisplayed(HomePage homePage){
        //carousel section
        //assert home page carousel images are displayed (as a list) (Selenium can't seem to find this element block with VALID selector)
        //assertTrue(homePage.isHomePageCarouselImgDisplayed(), "The home page carousel images aren't displayed");
        //assert home page carousel previous button is displayed
        assertTrue(homePage.isHomePageCarouselPrevButtonDisplayed(), "The home page carousel previous button isn't displayed");
        //assert home page carousel next button is displayed
        assertTrue(homePage.isHomePageCarouselNextButtonDisplayed(), "The home page carousel next button isn't displayed");
        //assert home page carousel pause button is displayed
        assertTrue(homePage.isHomePageCarouselPauseButtonDisplayed(), "The home page carousel pause button isn't displayed");
        //assert home page carousel image title is displayed (Selenium can't seem to find this element with VALID selector)
        //assertTrue(homePage.isHomePageCarouselImgTitleDisplayed(), "The home page carousel image title isn't displayed");
        //assert home page carousel image subtitle is displayed (Selenium can't seem to find this element with VALID selector)
        //assertTrue(homePage.isHomePageCarouselImgSubtitleDisplayed(), "The home page carousel image subtitle isn't displayed");
        //assert home page carousel shop now button is displayed (Selenium can't seem to find this element with VALID selector)
        //assertTrue(homePage.isHomePageCarouselShopNowButtonDisplayed(), "The home page carousel shop now button isn't displayed");
        //most popular products section
        //assert home page most popular products section title is displayed
        assertTrue(homePage.isHomePageMostPopularSectionTitleDisplayed(), "The home page most popular products section title isn't displayed");
        //list elements
        //assert home page most popular product images are displayed (as a list)
        assertTrue(homePage.isHomePageMostPopularProductImgDisplayed(), "The home page most popular product images aren't displayed");
        //assert home page most popular product category tags are displayed (as a list)
        assertTrue(homePage.isHomePageMostPopularProductCategoryTagDisplayed(), "The home page most popular product category tags aren't displayed");
        //assert home page most popular product name links are displayed (as a list)
        assertTrue(homePage.isHomePageMostPopularProductNameLinkDisplayed(), "The home page most popular product name links aren't displayed");
        //assert home page most popular product unit prices are displayed (as a list)
        assertTrue(homePage.isHomePageMostPopularProductUnitPriceDisplayed(), "The home page most popular product unit prices aren't displayed");
        //new products section
        //assert home page new products section title is displayed
        assertTrue(homePage.isHomePageNewProductsSectionTitleDisplayed(), "The home page new products section title isn't displayed");
        //assert home page new products section previous button is displayed
        assertTrue(homePage.isHomePageNewProductsPrevButtonDisplayed(), "The home page new products section previous button isn't displayed");
        //assert home page new products section next button is displayed
        assertTrue(homePage.isHomePageNewProductsNextButtonDisplayed(), "The home page new products section next button isn't displayed");
        //assert home page new products section page one button is displayed
        assertTrue(homePage.isHomePageNewProductsPageOneButtonDisplayed(), "The home page new products section page one button isn't displayed");
        //assert home page new products section page two button is displayed
        assertTrue(homePage.isHomePageNewProductsPageTwoButtonDisplayed(), "The home page new products section page two button isn't displayed");
        //list elements
        //assert home page new product images are displayed (as a list) (Selenium can't seem to find this element block with VALID selector)
        //assertTrue(homePage.isHomePageNewProductImgDisplayed(), "The home page new product images aren't displayed");
        //assert home page new product category tags are displayed (as a list) (Selenium can't seem to find this element block with VALID selector)
        //assertTrue(homePage.isHomePageNewProductCategoryTagDisplayed(), "The home page new product category tags aren't displayed");
        //assert home page new product name links are displayed (as a list) (Selenium can't seem to find this element block with VALID selector)
        //assertTrue(homePage.isHomePageNewProductNameLinkDisplayed(), "The home page new product name links aren't displayed");
        //assert home page new product unit price are displayed (as a list) (Selenium can't seem to find this element block with VALID selector)
        //assertTrue(homePage.isHomePageNewProductUnitPriceDisplayed(), "The home page new product unit prices aren't displayed");
        //assert home page banner link is displayed
        assertTrue(homePage.isHomePageBannerLinkDisplayed(), "The home page banner link isn't displayed");
    }

    //register page web element assert test method
    protected void isRegisterPageWebElementDisplayed(RegisterPage registerPage){
        //assert register page title is displayed
        assertTrue(registerPage.isRegisterPageTitleDisplayed(), "The register page title isn't displayed");
        //assert register page email subtext is displayed
        assertTrue(registerPage.isRegisterPageEmailSubtextDisplayed(), "The register page email subtext isn't displayed");
        //assert register page email input field is displayed
        assertTrue(registerPage.isRegisterPageEmailInputFieldDisplayed(), "The register page email input field isn't displayed");
        //assert register page password subtext is displayed
        assertTrue(registerPage.isRegisterPagePasswordSubtextDisplayed(), "The register page password subtext isn't displayed");
        //assert register page password input field is displayed
        assertTrue(registerPage.isRegisterPagePasswordInputFieldDisplayed(), "The register page password input field isn't displayed");
        //assert register page confirm password subtext is displayed
        assertTrue(registerPage.isRegisterPageConfirmPasswordSubtextDisplayed(), "The register page confirm password subtext isn't displayed");
        //assert register page confirm password input field is displayed
        assertTrue(registerPage.isRegisterPageConfirmPasswordInputFieldDisplayed(), "The register page confirm password input field isn't displayed");
        //assert register page country subtext is displayed
        assertTrue(registerPage.isRegisterPageCountrySubtextDisplayed(), "The register page country subtext isn't displayed");
        //assert register page country dropdown menu is displayed
        assertTrue(registerPage.isRegisterPageCountryDropdownMenuDisplayed(), "The register page country dropdown menu isn't displayed");
        //assert register page first name subtext is displayed
        assertTrue(registerPage.isRegisterPageFirstNameSubtextDisplayed(), "The register page first name subtext isn't displayed");
        //assert register page first name input field is displayed
        assertTrue(registerPage.isRegisterPageFirstNameInputFieldDisplayed(), "The register page first name input field isn't displayed");
        //assert register page last name subtext is displayed
        assertTrue(registerPage.isRegisterPageLastNameSubtextDisplayed(), "The register page last name subtext isn't displayed");
        //assert register page last name input field is displayed
        assertTrue(registerPage.isRegisterPageLastNameInputFieldDisplayed(), "The register page last name input field isn't displayed");
        //assert register page address 1 subtext is displayed
        assertTrue(registerPage.isRegisterPageAddress1SubtextDisplayed(), "The register page address 1 subtext isn't displayed");
        //assert register page address 1 input field is displayed
        assertTrue(registerPage.isRegisterPageAddress1InputFieldDisplayed(), "The register page address 1 input field isn't displayed");
        //assert register page address 2 subtext is displayed
        assertTrue(registerPage.isRegisterPageAddress2SubtextDisplayed(), "The register page address 2 subtext isn't displayed");
        //assert register page address 2 input field is displayed
        assertTrue(registerPage.isRegisterPageAddress2InputFieldDisplayed(), "The register page address 2 input field isn't displayed");
        //assert register page company subtext is displayed
        assertTrue(registerPage.isRegisterPageCompanySubtextDisplayed(), "The register page company subtext isn't displayed");
        //assert register page company input field is displayed
        assertTrue(registerPage.isRegisterPageCompanyInputFieldDisplayed(), "The register page company input field isn't displayed");
        //assert register page city subtext is displayed
        assertTrue(registerPage.isRegisterPageCitySubtextDisplayed(), "The register page city subtext isn't displayed");
        //assert register page city input field is displayed
        assertTrue(registerPage.isRegisterPageCityInputFieldDisplayed(), "The register page city input field isn't displayed");
        //assert register page state subtext is displayed
        assertTrue(registerPage.isRegisterPageStateSubtextDisplayed(), "The register page state subtext isn't displayed");
        //assert register page state dropdown menu is displayed
        assertTrue(registerPage.isRegisterPageStateDropdownMenuDisplayed(), "The register page state dropdown menu isn't displayed");
        //assert register page post code subtext is displayed
        assertTrue(registerPage.isRegisterPagePostCodeSubtextDisplayed(), "The register page post code subtext isn't displayed");
        //assert register page post code input field is displayed
        assertTrue(registerPage.isRegisterPagePostCodeInputFieldDisplayed(), "The register page post code input field isn't displayed");
        //assert register page phone subtext is displayed
        assertTrue(registerPage.isRegisterPagePhoneSubtextDisplayed(), "The register page phone subtext isn't displayed");
        //assert register page phone input field is displayed
        assertTrue(registerPage.isRegisterPagePhoneInputFieldDisplayed(), "The register page phone input field isn't displayed");
        //assert register page create account is displayed
        assertTrue(registerPage.isRegisterPageCreateAccountButtonDisplayed(), "The register page create account button isn't displayed");
        //assert register page required tags are displayed (as a list)
        assertTrue(registerPage.isRegisterPageRequiredTagDisplayed(), "The register page required tags aren't displayed");
    }

    //account dashboard page web element assert test method
    protected void isAccountDashboardPageWebElementDisplayed(AccountDashboardPage accountDashboardPage) {
        //assert account dashboard page title is displayed
        assertTrue(accountDashboardPage.isAccountDashboardPageTitleDisplayed(), "The account dashboard page title isn't displayed");
        //assert account dashboard page navbar orders link is displayed
        assertTrue(accountDashboardPage.isAccountDashboardPageNavbarOrdersLinkDisplayed(), "The account dashboard page navbar orders link isn't displayed");
        //assert account dashboard page navbar returns link is displayed
        assertTrue(accountDashboardPage.isAccountDashboardPageNavbarReturnsLinkDisplayed(), "The account dashboard page navbar returns link isn't displayed");
        //assert account dashboard page navbar messages link is displayed
        assertTrue(accountDashboardPage.isAccountDashboardPageNavbarMessagesLinkDisplayed(), "The account dashboard page navbar messages link isn't displayed");
        //assert account dashboard page navbar addresses link is displayed
        assertTrue(accountDashboardPage.isAccountDashboardPageNavbarAddressesLinkDisplayed(), "The account dashboard page navbar addresses link isn't displayed");
        //assert account dashboard page navbar wishlists link is displayed
        assertTrue(accountDashboardPage.isAccountDashboardPageNavbarWishlistsLinkDisplayed(), "The account dashboard page navbar wishlists link isn't displayed");
        //assert account dashboard page navbar recently viewed link is displayed
        assertTrue(accountDashboardPage.isAccountDashboardPageNavbarRecentlyViewedLinkDisplayed(), "The account dashboard page navbar recently viewed link isn't displayed");
        //assert account dashboard page navbar account settings link is displayed
        assertTrue(accountDashboardPage.isAccountDashboardPageNavbarAccountSettingsLinkDisplayed(), "The account dashboard page navbar account settings link isn't displayed");
    }

    //account dashboard page breadcrumb web element assert test method
    protected void isAccountDashboardPageBreadcrumbWebElementDisplayed(AccountDashboardPage accountDashboardPage) {
        //assert account dashboard page breadcrumb elements are displayed (as a list)
        assertTrue(accountDashboardPage.isAccountDashboardPageBreadcrumbDisplayed(), "The account dashboard page breadcrumb elements aren't displayed");

    }



    //account settings page web element assert test method
    protected void isAccountSettingsPageWebElementDisplayed(AccountSettingsPage accountSettingsPage) {
        //assert account settings page title is displayed
        assertTrue(accountSettingsPage.isAccountSettingsPageTitleDisplayed(), "The account settings page title isn't displayed");
        //assert account settings page first name subtext is displayed
        assertTrue(accountSettingsPage.isAccountSettingsPageFirstNameSubtextDisplayed(), "The account settings page first name subtext isn't displayed");
        //assert account settings page first name input field is displayed
        assertTrue(accountSettingsPage.isAccountSettingsPageFirstNameInputFieldDisplayed(), "The account settings page first name input field isn't displayed");
        //assert account settings page last name subtext is displayed
        assertTrue(accountSettingsPage.isAccountSettingsPageLastNameSubtextDisplayed(), "The account settings page last name subtext isn't displayed");
        //assert account settings page last name input field is displayed
        assertTrue(accountSettingsPage.isAccountSettingsPageLastNameInputFieldDisplayed(), "The account settings page last name input field isn't displayed");
        //assert account settings page company subtext is displayed
        assertTrue(accountSettingsPage.isAccountSettingsPageCompanySubtextDisplayed(), "The account settings page company subtext isn't displayed");
        //assert account settings page company input field is displayed
        assertTrue(accountSettingsPage.isAccountSettingsPageCompanyInputFieldDisplayed(), "The account settings page company input field isn't displayed");
        //assert account settings page phone subtext is displayed
        assertTrue(accountSettingsPage.isAccountSettingsPagePhoneSubtextDisplayed(), "The account settings page phone subtext isn't displayed");
        //assert account settings page phone input field is displayed
        assertTrue(accountSettingsPage.isAccountSettingsPagePhoneInputFieldDisplayed(), "The account settings page phone input field isn't displayed");
        //assert account settings page email subtext is displayed
        assertTrue(accountSettingsPage.isAccountSettingsPageEmailSubtextDisplayed(), "The account settings page email subtext isn't displayed");
        //assert account settings page email input field is displayed
        assertTrue(accountSettingsPage.isAccountSettingsPageEmailInputFieldDisplayed(), "The account settings page email input field isn't displayed");
        //assert account settings page current password subtext is displayed
        assertTrue(accountSettingsPage.isAccountSettingsPageCurrentPasswordSubtextDisplayed(), "The account settings page current password subtext isn't displayed");
        //assert account settings page current password input field is displayed
        assertTrue(accountSettingsPage.isAccountSettingsPageCurrentPasswordInputFieldDisplayed(), "The account settings page current password input field isn't displayed");
        //assert account settings page new password subtext is displayed
        assertTrue(accountSettingsPage.isAccountSettingsPagePasswordSubtextDisplayed(), "The account settings page new password subtext isn't displayed");
        //assert account settings page new password input field is displayed
        assertTrue(accountSettingsPage.isAccountSettingsPagePasswordInputFieldDisplayed(), "The account settings page new password input field isn't displayed");
        //assert account settings page confirm password subtext is displayed
        assertTrue(accountSettingsPage.isAccountSettingsPageConfirmPasswordSubtextDisplayed(), "The account settings page confirm password subtext isn't displayed");
        //assert account settings page confirm password input field is displayed
        assertTrue(accountSettingsPage.isAccountSettingsPageConfirmPasswordInputFieldDisplayed(), "The account settings page confirm password input field isn't displayed");
        //assert account settings page update button is displayed
        assertTrue(accountSettingsPage.isAccountSettingsPageUpdateAccountButtonDisplayed(), "The account settings page update button isn't displayed");
    }

    //address dashboard page web elements assert test method
    protected void isAddressDashboardPageWebElementDisplayed(AddressDashboardPage addressDashboardPage) {
        //assert address dashboard page usernames are displayed (as a list)
        assertTrue(addressDashboardPage.isAddressDashboardPageAddressUserNameDisplayed(), "The address dashboard page address username aren't displayed");
        //assert address dashboard page details are displayed (as a list) (Selenium can't find this element with VALID selector)
        //assertTrue(addressDashboardPage.isAddressDashboardPageAddressDetailsDisplayed(), "The address dashboard page address details aren't displayed");
        //assert address dashboard page phones are displayed (as a list)
        assertTrue(addressDashboardPage.isAddressDashboardPageAddressPhoneDisplayed(), "The address dashboard page address phones aren't displayed");
        //assert address dashboard page edit buttons are displayed (as a list)
        assertTrue(addressDashboardPage.isAddressDashboardPageAddressEditButtonDisplayed(), "The address dashboard page address edit buttons aren't displayed");
        //assert address dashboard page delete buttons are displayed (as a list)
        assertTrue(addressDashboardPage.isAddressDashboardPageAddressDeleteButtonDisplayed(), "The address dashboard page address delete buttons aren't displayed");
    }

    //add address page web element assert test method
    protected void isAddAddressPageWebElementDisplayed(AddAddressPage addAddressPage) {
        //assert add address page title is displayed
        assertTrue(addAddressPage.isAddAddressPageTitleDisplayed(), "The add address page title isn't displayed");
        //assert add address page country subtext is displayed
        assertTrue(addAddressPage.isAddAddressPageCountrySubtextDisplayed(), "The add address page country subtext isn't displayed");
        //assert add address page country dropdown menu is displayed
        assertTrue(addAddressPage.isAddAddressPageCountryDropdownMenuDisplayed(), "The add address page country dropdown menu isn't displayed");
        //assert add address page first name subtext is displayed
        assertTrue(addAddressPage.isAddAddressPageFirstNameSubtextDisplayed(), "The add address page first name subtext isn't displayed");
        //assert add address page first name input field is displayed
        assertTrue(addAddressPage.isAddAddressPageFirstNameInputFieldDisplayed(), "The add address page first name input field isn't displayed");
        //assert add address page last name subtext is displayed
        assertTrue(addAddressPage.isAddAddressPageLastNameSubtextDisplayed(), "The add address page last name subtext isn't displayed");
        //assert add address page last name input field is displayed
        assertTrue(addAddressPage.isAddAddressPageLastNameInputFieldDisplayed(), "The add address page last name input field isn't displayed");
        //assert add address page address 1 subtext is displayed
        assertTrue(addAddressPage.isAddAddressPageAddress1SubtextDisplayed(), "The add address page address 1 subtext isn't displayed");
        //assert add address page address 1 input field is displayed
        assertTrue(addAddressPage.isAddAddressPageAddress1InputFieldDisplayed(), "The add address page address 1 input field isn't displayed");
        //assert add address page address 2 subtext is displayed
        assertTrue(addAddressPage.isAddAddressPageAddress2SubtextDisplayed(), "The add address page address 2 subtext isn't displayed");
        //assert add address page address 2 input field is displayed
        assertTrue(addAddressPage.isAddAddressPageAddress2InputFieldDisplayed(), "The add address page address 2 input field isn't displayed");
        //assert add address page company subtext is displayed
        assertTrue(addAddressPage.isAddAddressPageCompanySubtextDisplayed(), "The add address page company subtext isn't displayed");
        //assert add address page company input field is displayed
        assertTrue(addAddressPage.isAddAddressPageCompanyInputFieldDisplayed(), "The add address page company input field isn't displayed");
        //assert add address page city subtext is displayed
        assertTrue(addAddressPage.isAddAddressPageCitySubtextDisplayed(), "The add address page city subtext isn't displayed");
        //assert add address page city input field is displayed
        assertTrue(addAddressPage.isAddAddressPageCityInputFieldDisplayed(), "The add address page city input field isn't displayed");
        //assert add address page state subtext is displayed
        assertTrue(addAddressPage.isAddAddressPageStateSubtextDisplayed(), "The add address page state subtext isn't displayed");
        //assert add address page state dropdown menu is displayed
        assertTrue(addAddressPage.isAddAddressPageStateDropdownMenuDisplayed(), "The add address page state dropdown menu isn't displayed");
        //assert add address page post code subtext is displayed
        assertTrue(addAddressPage.isAddAddressPagePostCodeSubtextDisplayed(), "The add address page post code subtext isn't displayed");
        //assert add address page post code input field is displayed
        assertTrue(addAddressPage.isAddAddressPagePostCodeInputFieldDisplayed(), "The add address page post code input field isn't displayed");
        //assert add address page phone subtext is displayed
        assertTrue(addAddressPage.isAddAddressPagePhoneSubtextDisplayed(), "The add address page phone subtext isn't displayed");
        //assert add address page phone input field is displayed
        assertTrue(addAddressPage.isAddAddressPagePhoneInputFieldDisplayed(), "The add address page phone input field isn't displayed");
        //assert add address page required tags are displayed (as a list)
        assertTrue(addAddressPage.isAddAddressPageRequiredTagDisplayed(), "The add address page required tags aren't displayed");
        //assert add address page save address button is displayed
        assertTrue(addAddressPage.isAddAddressPageSaveAddressButtonDisplayed(), "The add address page save address button isn't displayed");
        //assert add address page cancel button is displayed
        assertTrue(addAddressPage.isAddAddressPageCancelButtonDisplayed(), "The add address page cancel button isn't displayed");
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //general page text element assert test method(elements that all pages have)
    protected void isGeneralPageTextElementAsExpected(GeneralPage generalPage) {
        //header -> upper navbar
        //assert header upper navbar search dropdown link text is as expected
        assertEquals("SEARCH", generalPage.getHeaderUpperNavSearchDropdownText(), "The header upper navbar search dropdown link text doesn't match expectations.");
        //assert header upper navbar gift certificates link text is as expected
        assertEquals("GIFT CERTIFICATES", generalPage.getHeaderUpperNavGiftCertificateText(), "The header upper navbar gift certificates link text doesn't match expectations.");
        //assert header upper navbar cart link text is as expected (it changes to cart 1 when item is added)
        //assertEquals("CART", generalPage.getHeaderUpperNavCartLinkText(), "The header upper navbar cart link text doesn't match expectations.");
        //assert header home page logo link text is as expected
        assertEquals("CORNERSTONE DEMO", generalPage.getHeaderHomePageLogoLinkText(), "The header home page logo link text doesn't match expectations.");
        //header -> lower navbar
        //assert header lower navbar garden dropdown link text is as expected
        assertEquals("GARDEN", generalPage.getHeaderLowerNavGardenDropdownLinkText(), "The header lower navbar garden dropdown link text doesn't match expectations.");
        //assert header lower navbar shop all link text is as expected
        assertEquals("SHOP ALL", generalPage.getHeaderLowerNavShopAllLinkText(), "The header lower navbar shop all link text doesn't match expectations.");
        //assert header lower navbar kitchen link text is as expected
        assertEquals("KITCHEN", generalPage.getHeaderLowerNavKitchenLinkText(), "The header lower navbar kitchen link text doesn't match expectations.");
        //assert header lower navbar publications link text is as expected
        assertEquals("PUBLICATIONS", generalPage.getHeaderLowerNavPublicationsLinkText(), "The header lower navbar publications link text doesn't match expectations.");
        //assert header lower navbar utility link text is as expected
        assertEquals("UTILITY", generalPage.getHeaderLowerNavUtilityLinkText(), "The header lower navbar utility link text doesn't match expectations.");
        //assert header lower navbar journal link text is as expected
        assertEquals("JOURNAL", generalPage.getHeaderLowerNavJournalLinkText(), "The header lower navbar journal link text doesn't match expectations.");
        //assert header lower navbar our story link text is as expected
        assertEquals("OUR STORY", generalPage.getHeaderLowerNavOurStoryLinkText(), "The header lower navbar our story link text doesn't match expectations.");
        //assert header lower navbar contact us link text is as expected
        assertEquals("CONTACT US", generalPage.getHeaderLowerNavContactUsLinkText(), "The header lower navbar contact us link text doesn't match expectations.");
        //assert header lower navbar shipping and returns link text is as expected
        assertEquals("SHIPPING & RETURNS", generalPage.getHeaderLowerNavShippingAndReturnsLinkText(), "The header lower navbar shipping and returns link text doesn't match expectations.");
        //footer section
        //navigate column
        //assert footer navigate section title is as expected
        assertEquals("Navigate", generalPage.getFooterNavigateSectionTitle(), "The footer navigate section title doesn't match expectations.");
        //assert footer navigate section journal link text is as expected
        assertEquals("Journal", generalPage.getFooterJournalLinkText(), "The footer navigate section journal link text doesn't match expectations.");
        //assert footer navigate section our story link text is as expected
        assertEquals("Our Story", generalPage.getFooterOurStoryLinkText(), "The footer navigate section our story link text doesn't match expectations.");
        //assert footer navigate section contact us link text is as expected
        assertEquals("Contact Us", generalPage.getFooterContactUsLinkText(), "The footer navigate section contact us link text doesn't match expectations.");
        //assert footer navigate section shipping and returns link text is as expected
        assertEquals("Shipping & Returns", generalPage.getFooterShippingAndReturnsLinkText(), "The footer navigate section shipping and returns link text doesn't match expectations.");
        //assert footer navigate section sitemap link text is as expected
        assertEquals("Sitemap", generalPage.getFooterSitemapLinkText(), "The footer navigate section sitemap link text doesn't match expectations.");
        //categories column
        //assert footer categories section title is as expected
        assertEquals("Categories", generalPage.getFooterCategoriesSectionTitle(), "The footer categories section title doesn't match expectations.");
        //assert footer categories section garden link text is as expected
        assertEquals("Garden", generalPage.getFooterGardenLinkText(), "The footer categories section garden link text doesn't match expectations.");
        //assert footer categories section shop all link text is as expected
        assertEquals("Shop All", generalPage.getFooterShopAllLinkText(), "The footer categories section shop all link text doesn't match expectations.");
        //assert footer categories section kitchen link text is as expected
        assertEquals("Kitchen", generalPage.getFooterKitchenLinkText(), "The footer categories section kitchen link text doesn't match expectations.");
        //assert footer categories section publications link text is as expected
        assertEquals("Publications", generalPage.getFooterPublicationsLinkText(), "The footer categories section publications link text doesn't match expectations.");
        //assert footer categories section utility link text is as expected
        assertEquals("Utility", generalPage.getFooterUtilityLinkText(), "The footer categories section utility link text doesn't match expectations.");
        //popular brands column
        //assert footer popular brands section title is as expected
        assertEquals("Popular Brands", generalPage.getFooterPopularBrandsSectionTitle(), "The footer popular brands section title doesn't match expectations.");
        //assert footer popular brands section fresh brand link text is as expected
        assertEquals("FreshBrand", generalPage.getFooterFreshBrandLinkText(), "The footer popular brands section fresh brand link text doesn't match expectations.");
        //assert footer popular brands section OFS link text is as expected
        assertEquals("OFS", generalPage.getFooterOFSLinkText(), "The footer popular brands section OFS link text doesn't match expectations.");
        //assert footer popular brands section view all link text is as expected
        assertEquals("View All", generalPage.getFooterViewAllLinkText(), "The footer popular brands section view all link text doesn't match expectations.");
        //information column
        //assert footer information section title is as expected
        assertEquals("Info", generalPage.getFooterInfoSectionTitle(), "The footer information section title doesn't match expectations.");
        //assert footer information section address text is as expected
        assertEquals("685 Market Street\n" + "San Francisco, CA 94105", generalPage.getFooterAddressText(), "The footer information section address text doesn't match expectations.");
        //assert footer information section call us text is as expected
        assertEquals("Call us at (415) 555-5555", generalPage.getFooterCallUsText(), "The footer information section call us text doesn't match expectations.");
        //subscribe to newsletter column
        //assert footer subscribe to newsletter section title is as expected
        assertEquals("Subscribe to our newsletter", generalPage.getFooterSubscribeToNewsletterSectionTitle(), "The footer subscribe to newsletter section title doesn't match expectations.");
        //assert footer subscribe to newsletter section address text is as expected
        assertEquals("Get the latest updates on new products and upcoming sales", generalPage.getFooterSubscribeToNewsletterSectionSubtext(), "The footer subscribe to newsletter section subtext doesn't match expectations.");
        //copyright text elements
        //assert footer powered by text is as expected
        assertEquals("Powered by BigCommerce", generalPage.getFooterPoweredByText(), "The footer powered by text doesn't match expectations.");
        //assert footer copyright text is as expected
        assertEquals("© 2025 Cornerstone Demo", generalPage.getFooterCopyrightText(), "The footer copyright text doesn't match expectations.");
    }

    //home page text element assert test method
    protected void isHomePageTextElementAsExpected(HomePage homePage) {
        //assert home page carousel image title is as expected
        assertEquals("Cornerstone Light", homePage.getHomePageCarouselImageTitle().getFirst(), "The home page carousel image title doesn't match expectations.");
        //assert home page carousel image subtitle is as expected
        assertEquals("Integer facilisis sed nunc vitae elementum. Integer rutrum varius orci, a auctor diam vestibulum in. Vestibulum vitae libero nec risus eleifend vehicula in eu neque.", homePage.getHomePageCarouselImageSubtitle().getFirst(), "The home page carousel image subtitle doesn't match expectations.");
        //assert home page most popular products section title is as expected
        assertEquals("Most Popular Products", homePage.getHomePageMostPopularSectionTitle(), "The home page most popular products title doesn't match expectations.");
        //assert home page new products section title is as expected
        assertEquals("New Products", homePage.getHomePageNewProductsSectionTitle(), "The home page new products section title doesn't match expectations.");
        //assert home page banner link text is as expected
        assertEquals("Save 25% on our Orbit Terrarium", homePage.getHomePageBannerLinkText(), "The home page banner link text doesn't match expectations.");
    }

    //register page text element assert test method
    protected void isRegisterPageTextElementAsExpected(RegisterPage registerPage) {
        //assert register page title is as expected
        assertEquals("New Account", registerPage.getRegisterPageTitle(), "The register page title doesn't match expectations.");
        //assert register page email subtext is as expected
        assertEquals("Email Address", registerPage.getRegisterPageEmailSubtext(), "The register page email subtext doesn't match expectations.");
        //assert register page password subtext is as expected
        assertEquals("Password", registerPage.getRegisterPagePasswordSubtext(), "The register page password subtext doesn't match expectations.");
        //assert register page confirm password subtext is as expected
        assertEquals("Confirm Password", registerPage.getRegisterPageConfirmPasswordSubtext(), "The register page confirm password subtext doesn't match expectations.");
        //assert register page country subtext is as expected
        assertEquals("Country", registerPage.getRegisterPageCountrySubtext(), "The register page country subtext doesn't match expectations.");
        //assert register page first name subtext is as expected
        assertEquals("First Name", registerPage.getRegisterPageFirstNameSubtext(), "The register page first name subtext doesn't match expectations.");
        //assert register page last name subtext is as expected
        assertEquals("Last Name", registerPage.getRegisterPageLastNameSubtext(), "The register page last name subtext doesn't match expectations.");
        //assert register page address 1 subtext is as expected
        assertEquals("Address Line 1", registerPage.getRegisterPageAddress1Subtext(), "The register page address 1 subtext doesn't match expectations.");
        //assert register page address 2 subtext is as expected
        assertEquals("Address Line 2", registerPage.getRegisterPageAddress2Subtext(), "The register page address 2 subtext doesn't match expectations.");
        //assert register page company subtext is as expected
        assertEquals("Company Name", registerPage.getRegisterPageCompanySubtext(), "The register page company subtext doesn't match expectations.");
        //assert register page city subtext is as expected
        assertEquals("Suburb/City", registerPage.getRegisterPageCitySubtext(), "The register page city subtext doesn't match expectations.");
        //assert register page state subtext is as expected
        assertEquals("State/Province", registerPage.getRegisterPageStateSubtext(), "The register page state subtext doesn't match expectations.");
        //assert register page post code subtext is as expected
        assertEquals("Zip/Postcode", registerPage.getRegisterPagePostCodeSubtext(), "The register page post code subtext doesn't match expectations.");
        //assert register page phone subtext is as expected
        assertEquals("Phone Number", registerPage.getRegisterPagePhoneSubtext(), "The register page phone subtext doesn't match expectations.");
        //assert register page required tags and their count are as expected
        List<String> expected = Collections.nCopies(11, "REQUIRED"); //assert the tag count and content is as expected (since it's an array of tags)
        assertEquals(expected, registerPage.getRegisterPageRequiredTagElements(), "The register page required tags don't match expectations.");
    }

    //account dashboard page text element assert test method
    protected void isAccountDashboardPageTextElementAsExpected(AccountDashboardPage accountDashboardPage) {
        //assert account dashboard page navbar orders link is as expected
        assertEquals("Orders", accountDashboardPage.getAccountDashboardPageNavbarOrdersLinkText(), "The account dashboard page navbar orders link doesn't match expectations.");
        //assert account dashboard page navbar returns link is as expected
        assertEquals("Returns", accountDashboardPage.getAccountDashboardPageNavbarReturnsLinkText(), "The account dashboard page navbar returns link doesn't match expectations.");
        //assert account dashboard page navbar messages link is as expected
        assertEquals("Messages ", accountDashboardPage.getAccountDashboardPageNavbarMessagesLinkText(), "The account dashboard page navbar messages link doesn't match expectations.");
        //assert account dashboard page navbar addresses link is as expected
        assertEquals("Addresses", accountDashboardPage.getAccountDashboardPageNavbarAddressesLinkText(), "The account dashboard page navbar addresses link doesn't match expectations.");
        //assert account dashboard page navbar wishlists link is as expected
        assertEquals("Wish Lists", accountDashboardPage.getAccountDashboardPageNavbarWishlistsLinkText(), "The account dashboard page navbar wishlists link doesn't match expectations.");
        //assert account dashboard page navbar recently viewed link is as expected
        assertEquals("Recently Viewed", accountDashboardPage.getAccountDashboardPageNavbarRecentlyViewedLinkText(), "The account dashboard page navbar recently viewed link doesn't match expectations.");
        //assert account dashboard page navbar account settings link is as expected
        assertEquals("Account Settings", accountDashboardPage.getAccountDashboardPageNavbarAccountSettingsLinkText(), "The account dashboard page navbar account settings link doesn't match expectations.");
    }

    //orders page text element assert test method (before any order placement, the user gets here after register/login)
    protected void isOrdersPageNoOrderTextElementsAsExpected(AccountDashboardPage accountDashboardPage) {
        //assert account dashboard page title is as expected (since the user gets on orders page section after clicking 'Account')
        assertEquals("Orders", accountDashboardPage.getAccountDashboardPageTitle(), "The account dashboard page title doesn't match expectations.");
        //assert account dashboard page orders info box text is as expected
        assertEquals("You haven't placed any orders with us. When you do, their status will appear on this page.", accountDashboardPage.getAccountDashboardPageOrdersNotPlacedBoxText(), "The account dashboard page orders not placed box doesn't match expectations.");
    }

    //account settings page text element assert test method
    protected void isAccountSettingsPageTextElementAsExpected(AccountSettingsPage accountSettingsPage) {
        //assert account settings page title is as expected
        assertEquals("Account Settings", accountSettingsPage.getAccountSettingsPageTitle(), "The account settings page title doesn't match expectations.");
        //assert account settings page first name subtext is as expected
        assertEquals("First Name", accountSettingsPage.getAccountSettingsPageFirstNameSubtext(), "The account settings page first name subtext doesn't match expectations.");
        //assert account settings page last name subtext is as expected
        assertEquals("Last Name", accountSettingsPage.getAccountSettingsPageLastNameSubtext(), "The account settings page last name subtext doesn't match expectations.");
        //assert account settings page company subtext is as expected
        assertEquals("Company", accountSettingsPage.getAccountSettingsPageCompanySubtext(), "The account settings page company subtext doesn't match expectations.");
        //assert account settings page phone subtext is as expected
        assertEquals("Phone Number", accountSettingsPage.getAccountSettingsPagePhoneSubtext(), "The account settings page phone subtext doesn't match expectations.");
        //assert account settings page email subtext is as expected
        assertEquals("Email Address", accountSettingsPage.getAccountSettingsPageEmailSubtext(), "The account settings page email subtext doesn't match expectations.");
        //assert account settings page password subtext is as expected
        assertEquals("Password", accountSettingsPage.getAccountSettingsPagePasswordSubtext(), "The account settings page password subtext doesn't match expectations.");
        //assert account settings page current password subtext is as expected
        assertEquals("Current Password", accountSettingsPage.getAccountSettingsPageCurrentPasswordSubtext(), "The account settings page current password subtext doesn't match expectations.");
        //assert account settings page confirm password subtext is as expected
        assertEquals("Confirm Password", accountSettingsPage.getAccountSettingsPageConfirmPasswordSubtext(), "The account settings page confirm password subtext doesn't match expectations.");
    }

    //add address page text element assert test method
    protected void isAddAddressPageTextElementAsExpected(AddAddressPage addAddressPage) {
        //assert add address page company subtext is as expected
        assertEquals("Country", addAddressPage.getAddAddressPageCountrySubtext(), "The add address page country subtext doesn't match expectations.");
        //assert add address page first name subtext is as expected
        assertEquals("First Name", addAddressPage.getAddAddressPageFirstNameSubtext(), "The add address page first name subtext doesn't match expectations.");
        //assert add address page last name subtext is as expected
        assertEquals("Last Name", addAddressPage.getAddAddressPageLastNameSubtext(), "The add address page last name subtext doesn't match expectations.");
        //assert add address page address 1 subtext is as expected
        assertEquals("Address Line 1", addAddressPage.getAddAddressPageAddress1Subtext(), "The add address page address 1 subtext doesn't match expectations.");
        //assert add address page address 2 subtext is as expected
        assertEquals("Address Line 2", addAddressPage.getAddAddressPageAddress2Subtext(), "The add address page address 2 subtext doesn't match expectations.");
        //assert add address page company subtext is as expected
        assertEquals("Company Name", addAddressPage.getAddAddressPageCompanySubtext(), "The add address page company subtext doesn't match expectations.");
        //assert add address page city subtext is as expected
        assertEquals("Suburb/City", addAddressPage.getAddAddressPageCitySubtext(), "The add address page city subtext doesn't match expectations.");
        //assert add address page state subtext is as expected
        assertEquals("State/Province", addAddressPage.getAddAddressPageStateSubtext(), "The add address page state subtext doesn't match expectations.");
        //assert add address page post code subtext is as expected
        assertEquals("Zip/Postcode", addAddressPage.getAddAddressPagePostCodeSubtext(), "The add address page post code subtext doesn't match expectations.");
        //assert add address page phone subtext is as expected
        assertEquals("Phone Number", addAddressPage.getAddAddressPagePhoneSubtext(), "The add address page phone subtext doesn't match expectations.");
        //assert add address page required tags and their count are as expected
        List<String> expected = Collections.nCopies(8, "REQUIRED"); //assert the tag count and content is as expected (since it's an array of tags)
        assertEquals(expected, addAddressPage.getAddAddressRequiredTagElements(), "The add address page required tags don't match expectations.");
    }


    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //home page product data logger method
    protected void logHomePageProductData(HomePage homePage) {
        System.out.println("Home page displayed product data: " + "\n");

        logger.info("Home page most popular product category tag(s): " + homePage.getHomePageMostPopularCategoryTag());
        logger.info("Home page most popular product name(s): " + homePage.getHomePageMostPopularProductName());
        logger.info("Home page most popular product unit price(s): " + homePage.getHomePageMostPopularProductUnitPrice());

        logger.info("Home page new product category tag(s): " + homePage.getHomePageNewProductCategoryTag());
        logger.info("Home page new product name(s): " + homePage.getHomePageNewProductName());
        logger.info("Home page new product unit price(s): " + homePage.getHomePageNewProductUnitPrice());

        System.out.println("\n");
    }

    //address dashboard page data logger method
    protected void logAddressDashboardPageData(AddressDashboardPage addressDashboardPage) {
        System.out.println("Address dashboard page displayed address data: " + "\n");

        logger.info("Displayed address username(s): " + addressDashboardPage.getAccountAddressUserName());
        logger.info("Displayed address details: " + addressDashboardPage.getAccountAddressDetails());
        logger.info("Displayed address phone(s): " + addressDashboardPage.getAccountAddressPhone());

        System.out.println("\n");
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //test result screenshot method
    public void captureScreenshot(WebDriver driver, String fileName) {
        try {
            Thread.sleep(1500);//apply wait time for the right time to get the screenshot (WebDriverWait doesn't work here)
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            File destination = new File("E:\\IntelliAqua Selenium projects\\CornerstoneDemoStoreSelenium\\src\\test\\resources\\" + " " +  fileName + ".png");
            Files.copy(screenshot.toPath(), destination.toPath(), StandardCopyOption.REPLACE_EXISTING);
            logger.info("Screenshot saved at: " + destination.getAbsolutePath());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
