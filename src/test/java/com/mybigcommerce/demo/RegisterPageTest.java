package com.mybigcommerce.demo;

import com.mybigcommerce.demo.utilities.TestMethods;
import org.junit.jupiter.api.*;


public class RegisterPageTest extends TestMethods {

    //due to possible backend server issues, the user account creation may fail, it's not due to test script in any way

    //valid user account creation test

    //Test 002 -> valid user account creation test
    @Test
    @DisplayName("Valid User Account Creation Test")
    @Tag("Valid_User_Account_Creation")
    void validAccountCreationTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
    }

    //invalid user account creation tests

    //no singular input

    //Test 002a -> invalid user account creation test - no user email
    @Test
    @DisplayName("Invalid User Account Creation Test - No User Email")
    @Tag("Invalid_User_Account_Creation")
    @Tag("No_Singular_Input")
    void invalidAccountCreationNoUserEmailTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //invalid user account creation test - no user email
        invalidUserAccountCreationNoEmailTest();
    }

    //Test 002b -> invalid user account creation test - no user password / confirm password
    @Test
    @DisplayName("Invalid User Account Creation Test - No User Password and Confirm Password")
    @Tag("Invalid_User_Account_Creation")
    @Tag("No_Singular_Input")
    void invalidAccountCreationNoUserPasswordConfirmTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //invalid user account creation test - no user password / confirm password
        invalidUserAccountCreationNoPasswordConfirmTest();
    }

    //Test 002c -> invalid user account creation test - no user country
    @Test
    @DisplayName("Invalid User Account Creation Test - No User Country")
    @Tag("Invalid_User_Account_Creation")
    @Tag("No_Singular_Input")
    void invalidAccountCreationNoUserCountryTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //invalid user account creation test - no user country
        invalidUserAccountCreationNoCountryTest();
    }

    //Test 002d -> invalid user account creation test - no user first name
    @Test
    @DisplayName("Invalid User Account Creation Test - No User First Name")
    @Tag("Invalid_User_Account_Creation")
    @Tag("No_Singular_Input")
    void invalidAccountCreationNoUserFirstNameTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //invalid user account creation test - no user first name
        invalidUserAccountCreationNoFirstNameTest();
    }

    //Test 002e -> invalid user account creation test - no user first name
    @Test
    @DisplayName("Invalid User Account Creation Test - No User Last Name")
    @Tag("Invalid_User_Account_Creation")
    @Tag("No_Singular_Input")
    void invalidAccountCreationNoUserLastNameTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //invalid user account creation test - no user last name
        invalidUserAccountCreationNoLastNameTest();
    }

    //Test 002f -> invalid user account creation test - no user address
    @Test
    @DisplayName("Invalid User Account Creation Test - No User Address")
    @Tag("Invalid_User_Account_Creation")
    @Tag("No_Singular_Input")
    void invalidAccountCreationNoUserAddressTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //invalid user account creation test - no user address
        invalidUserAccountCreationNoAddressTest();
    }

    //Test 002g -> invalid user account creation test - no user city
    @Test
    @DisplayName("Invalid User Account Creation Test - No User City")
    @Tag("Invalid_User_Account_Creation")
    @Tag("No_Singular_Input")
    void invalidAccountCreationNoUserCityTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //invalid user account creation test - no user city
        invalidUserAccountCreationNoCityTest();
    }

    //Test 002h -> invalid user account creation test - no user post code
    @Test
    @DisplayName("Invalid User Account Creation Test - No User Post Code")
    @Tag("Invalid_User_Account_Creation")
    @Tag("No_Singular_Input")
    void invalidAccountCreationNoPostCodeTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //invalid user account creation test - no user post code
        invalidUserAccountCreationNoPostCodeTest();
    }

    //Test 002i -> invalid user account creation test - no user phone
    @Test
    @DisplayName("Invalid User Account Creation Test - No User Phone")
    @Tag("Invalid_User_Account_Creation")
    @Tag("No_Singular_Input")
    void invalidAccountCreationNoPhoneTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //invalid user account creation test - no user phone
        invalidUserAccountCreationNoPhoneTest();
    }

    //too short singular input

    //Test 002j -> invalid user account creation test - too short user email (1 char -> name, domain) (the user account gets created, test has failed)
    @Test
    @DisplayName("Invalid User Account Creation Test - Too Short User Email")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Short_Singular_Input")
    void invalidAccountCreationTooShortUserEmailTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //invalid user account creation test - too short user email (1 char -> name, domain)
        invalidUserAccountCreationTooShortEmailTest();
    }

    //Test 002k -> invalid user account creation test - too short user password / confirm password (6 chars)
    @Test
    @DisplayName("Invalid User Account Creation Test - Too Short User Password / Confirm Password")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Short_Singular_Input")
    void invalidAccountCreationTooShortPasswordConfirmTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //invalid user account creation test - too short user password / confirm password (6 chars)
        invalidUserAccountCreationTooShortPasswordConfirmTest();
    }

    //Test 002l -> invalid user account creation test - too short user first name (1 char) (the user account gets created, test has failed)
    @Test
    @DisplayName("Invalid User Account Creation Test - Too Short User First Name")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Short_Singular_Input")
    void invalidAccountCreationTooShortFirstNameTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //invalid user account creation test - too short user first name (1 char)
        invalidUserAccountCreationTooShortFirstNameTest();
    }

    //Test 002m -> invalid user account creation test - too short user last name (1 char) (the user account gets created, test has failed)
    @Test
    @DisplayName("Invalid User Account Creation Test - Too Short User Last Name")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Short_Singular_Input")
    void invalidAccountCreationTooShortLastNameTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //invalid user account creation test - too short user last name (1 char)
        invalidUserAccountCreationTooShortLastNameTest();
    }

    //Test 002n -> invalid user account creation test - too short user address (3 chars) (the user account gets created, test has failed)
    @Test
    @DisplayName("Invalid User Account Creation Test - Too Short User Address")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Short_Singular_Input")
    void invalidAccountCreationTooShortAddressTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //invalid user account creation test - too short user address (3 chara)
        invalidUserAccountCreationTooShortAddressTest();
    }

    //Test 002o -> invalid user account creation test - too short user city (1 char) (the user account gets created, test has failed)
    @Test
    @DisplayName("Invalid User Account Creation Test - Too Short User City")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Short_Singular_Input")
    void invalidAccountCreationTooShortCityTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //invalid user account creation test - too short user city (1 char)
        invalidUserAccountCreationTooShortCityTest();
    }

    //Test 002p -> invalid user account creation test - too short user post code (4 digits) (the user account gets created, test has failed)
    @Test
    @DisplayName("Invalid User Account Creation Test - Too Short User Post Code")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Short_Singular_Input")
    void invalidAccountCreationTooShortPostCodeTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //invalid user account creation test - too short user post code (4 digits)
        invalidUserAccountCreationTooShortPostCodeTest();
    }

    //Test 002q -> invalid user account creation test - too short user phone (2 digits) (the user account gets created, test has failed)
    @Test
    @DisplayName("Invalid User Account Creation Test - Too Short User Phone")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Short_Singular_Input")
    void invalidAccountCreationTooShortPhoneTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //invalid user account creation test - too short user phone (2 digits)
        invalidUserAccountCreationTooShortPhoneTest();
    }

    //too long singular input

    //Test 002r -> invalid user account creation test - too long user email (100 chars -> name, domain)
    @Test
    @DisplayName("Invalid User Account Creation Test - Too Long User Email")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Long_Singular_Input")
    void invalidAccountCreationTooLongUserEmailTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //invalid user account creation test - too long user email (100 chars -> name, domain)
        invalidUserAccountCreationTooLongEmailTest();
    }

}
