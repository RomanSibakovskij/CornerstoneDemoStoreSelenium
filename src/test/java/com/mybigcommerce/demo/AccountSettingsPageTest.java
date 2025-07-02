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

    //Test 003e -> invalid edit user account data test - no edited password / confirm password
    @Test
    @DisplayName("Invalid Edit User Account Data Test - No Edited Password / Confirm Password")
    @Tag("Invalid_Edit_Account_Data")
    @Tag("No_Singular_Input")
    void invalidEditAccountDataNoPasswordConfirmTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //invalid edit user account data test - no edited password / confirm password
        invalidEditedUserAccountNoPasswordConfirmTest();
    }

    //Test 003f -> invalid edit user account data test - no current password
    @Test
    @DisplayName("Invalid Edit User Account Data Test - No Current Password")
    @Tag("Invalid_Edit_Account_Data")
    @Tag("No_Singular_Input")
    void invalidEditAccountDataNoCurrentPasswordTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //invalid edit user account data test - no current password
        invalidEditedUserAccountNoCurrentPasswordTest();
    }

    //too short singular input

    //Test 003g -> invalid edit user account data test - too short edited first name (1 char) (the account editing wasn't aborted, test has failed)
    @Test
    @DisplayName("Invalid Edit User Account Data Test - Too Short Edited First Name")
    @Tag("Invalid_Edit_Account_Data")
    @Tag("Too_Short_Singular_Input")
    void invalidEditAccountDataTooShortFirstNameTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //invalid edit user account data test - too short edited first name (1 char)
        invalidEditedUserAccountTooShortFirstNameTest();
    }

    //Test 003h -> invalid edit user account data test - too short edited last name (1 char) (the account editing wasn't aborted, test has failed)
    @Test
    @DisplayName("Invalid Edit User Account Data Test - Too Short Edited Last Name")
    @Tag("Invalid_Edit_Account_Data")
    @Tag("Too_Short_Singular_Input")
    void invalidEditAccountDataTooShortLastNameTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //invalid edit user account data test - too short edited last name (1 char)
        invalidEditedUserAccountTooShortLastNameTest();
    }

    //Test 003i -> invalid edit user account data test - too short edited email (1 char -> name, domain) (the account editing wasn't aborted, test has failed)
    @Test
    @DisplayName("Invalid Edit User Account Data Test - Too Short Edited Email")
    @Tag("Invalid_Edit_Account_Data")
    @Tag("Too_Short_Singular_Input")
    void invalidEditAccountDataTooShortEmailTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //invalid edit user account data test - too short edited email (1 char -> name, domain)
        invalidEditedUserAccountTooShortEmailTest();
    }

    //Test 003j -> invalid edit user account data test - too short edited password / confirm password (6 chars)
    @Test
    @DisplayName("Invalid Edit User Account Data Test - Too Short Edited Password / Confirm Password")
    @Tag("Invalid_Edit_Account_Data")
    @Tag("Too_Short_Singular_Input")
    void invalidEditAccountDataTooShortPasswordConfirmTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //invalid edit user account data test - too short edited password / confirm password (6 chars)
        invalidEditedUserAccountTooShortPasswordConfirmTest();
    }

    //too long singular input

    //Test 003k -> invalid edit user account data test - too long edited first name (100 chars) (the account editing wasn't aborted, test has failed)
    @Test
    @DisplayName("Invalid Edit User Account Data Test - Too Long Edited First Name")
    @Tag("Invalid_Edit_Account_Data")
    @Tag("Too_Long_Singular_Input")
    void invalidEditAccountDataTooLongFirstNameTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //invalid edit user account data test - too long edited first name (100 chars)
        invalidEditedUserAccountTooLongFirstNameTest();
    }

    //Test 003l -> invalid edit user account data test - too long edited last name (100 chars) (the account editing wasn't aborted, test has failed)
    @Test
    @DisplayName("Invalid Edit User Account Data Test - Too Long Edited Last Name")
    @Tag("Invalid_Edit_Account_Data")
    @Tag("Too_Long_Singular_Input")
    void invalidEditAccountDataTooLongLastNameTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //invalid edit user account data test - too long edited last name (100 chars)
        invalidEditedUserAccountTooLongLastNameTest();
    }

    //Test 003m -> invalid edit user account data test - too long edited email (100 chars -> name, domain)
    @Test
    @DisplayName("Invalid Edit User Account Data Test - Too Long Edited Email")
    @Tag("Invalid_Edit_Account_Data")
    @Tag("Too_Long_Singular_Input")
    void invalidEditAccountDataTooLongEmailTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //invalid edit user account data test - too long edited email (100 chars -> name, domain)
        invalidEditedUserAccountTooLongEmailTest();
    }

    //Test 003n -> invalid edit user account data test - too long edited password / confirm password (75 chars) (the account editing wasn't aborted, test has failed)
    @Test
    @DisplayName("Invalid Edit User Account Data Test - Too Long Edited Password / Confirm Password")
    @Tag("Invalid_Edit_Account_Data")
    @Tag("Too_Long_Singular_Input")
    void invalidEditAccountDataTooLongPasswordConfirmTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //invalid edit user account data test - too long edited password / confirm password (75 chars)
        invalidEditedUserAccountTooLongPasswordConfirmTest();
    }

    //invalid singular input format

    //Test 003o -> invalid edit user account data test - invalid edited first name format (special symbols only) (the account editing wasn't aborted, test has failed)
    @Test
    @DisplayName("Invalid Edit User Account Data Test - Invalid Edited First Name Format")
    @Tag("Invalid_Edit_Account_Data")
    @Tag("Invalid_Singular_Input_Format")
    void invalidEditAccountDataInvalidFirstNameFormatTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //invalid edit user account data test - invalid edited first name format (special symbols only)
        invalidEditedUserAccountInvalidFirstNameFormatTest();
    }

    //Test 003p -> invalid edit user account data test - invalid edited last name format (special symbols only) (the account editing wasn't aborted, test has failed)
    @Test
    @DisplayName("Invalid Edit User Account Data Test - Invalid Edited Last Name Format")
    @Tag("Invalid_Edit_Account_Data")
    @Tag("Invalid_Singular_Input_Format")
    void invalidEditAccountDataInvalidLastNameFormatTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //invalid edit user account data test - invalid edited last name format (special symbols only)
        invalidEditedUserAccountInvalidLastNameFormatTest();
    }

    //Test 003q -> invalid edit user account data test - invalid edited email format (missing '@')
    @Test
    @DisplayName("Invalid Edit User Account Data Test - Invalid Edited Email Format")
    @Tag("Invalid_Edit_Account_Data")
    @Tag("Invalid_Singular_Input_Format")
    void invalidEditAccountDataInvalidEmailFormatTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //invalid edit user account data test - invalid edited email format (missing '@')
        invalidEditedUserAccountInvalidEmailFormatTest();
    }

    //Test 003r -> invalid edit user account data test - existing email (used beforehand in manual testing)
    @Test
    @DisplayName("Invalid Edit User Account Data Test - Existing Email")
    @Tag("Invalid_Edit_Account_Data")
    @Tag("Invalid_Singular_Input_Format")
    @Tag("Pre_Existing_Input")
    void invalidEditAccountDataExistingEmailTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //invalid edit user account data test - existing email (used beforehand in manual testing)
        invalidEditedUserAccountExistingEmailFormatTest();
    }

}
