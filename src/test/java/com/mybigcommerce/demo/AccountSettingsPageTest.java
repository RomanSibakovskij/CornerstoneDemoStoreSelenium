package com.mybigcommerce.demo;

import com.mybigcommerce.demo.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class AccountSettingsPageTest extends TestMethods{

    //valid edit user account data tests

    //Test 003 -> valid edit user account data (with login email) test
    @Test
    @DisplayName("Valid Edit User Account Data (With Login Email) Test")
    @Tag("Valid_Edit_Account_Data")
    void validEditAccountDataLoginEmailTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //valid edit user account data (with login email) test
        validEditUserAccountDataWithLoginEmailTest();
    }

    //Test 003a -> valid edit user account data (with login password) test
    @Test
    @DisplayName("Valid Edit User Account Data (With Login Password) Test")
    @Tag("Valid_Edit_Account_Data")
    void validEditAccountDataLoginPasswordTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //valid edit user account data (with login password) test
        validEditUserAccountDataWithLoginPasswordTest();
    }

    //invalid edit user account data tests

    //no singular input

    //Test 003b -> invalid edit user account data test - no edited first name
    @Test
    @DisplayName("Invalid Edit User Account Data Test - No Edited First Name")
    @Tag("Invalid_Edit_Account_Data")
    @Tag("No_Singular_Input")
    void invalidEditAccountDataNoFirstNameTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //invalid edit user account data test - no edited first name
        invalidEditedUserAccountNoFirstNameTest();
    }

    //Test 003c -> invalid edit user account data test - no edited last name
    @Test
    @DisplayName("Invalid Edit User Account Data Test - No Edited Last Name")
    @Tag("Invalid_Edit_Account_Data")
    @Tag("No_Singular_Input")
    void invalidEditAccountDataNoLastNameTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //invalid edit user account data test - no edited last name
        invalidEditedUserAccountNoLastNameTest();
    }

    //Test 003d -> invalid edit user account data test - no edited email
    @Test
    @DisplayName("Invalid Edit User Account Data Test - No Edited Email")
    @Tag("Invalid_Edit_Account_Data")
    @Tag("No_Singular_Input")
    void invalidEditAccountDataNoEmailTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //invalid edit user account data test - no edited email
        invalidEditedUserAccountNoEmailTest();
    }

}
