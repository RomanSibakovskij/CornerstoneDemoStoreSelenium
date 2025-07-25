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

    //Test 002s -> invalid user account creation test - too long user password / confirm password (75 chars) (the user account gets created, test has failed)
    @Test
    @DisplayName("Invalid User Account Creation Test - Too Long User Password / Confirm Password")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Long_Singular_Input")
    void invalidAccountCreationTooLongUserPasswordConfirmTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //invalid user account creation test - too long user password / confirm password (75 chars)
        invalidUserAccountCreationTooLongPasswordConfirmTest();
    }

    //Test 002t -> invalid user account creation test - too long user first name (100 chars) (the user account gets created, test has failed)
    @Test
    @DisplayName("Invalid User Account Creation Test - Too Long User First Name")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Long_Singular_Input")
    void invalidAccountCreationTooLongUserFirstNameTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //invalid user account creation test - too long user first name (100 chars)
        invalidUserAccountCreationTooLongFirstNameTest();
    }

    //Test 002u -> invalid user account creation test - too long user last name (100 chars) (the user account gets created, test has failed)
    @Test
    @DisplayName("Invalid User Account Creation Test - Too Long User Last Name")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Long_Singular_Input")
    void invalidAccountCreationTooLongUserLastNameTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //invalid user account creation test - too long user last name (100 chars)
        invalidUserAccountCreationTooLongLastNameTest();
    }

    //Test 002v -> invalid user account creation test - too long user address (100 chars) (the user account gets created, test has failed)
    @Test
    @DisplayName("Invalid User Account Creation Test - Too Long User Address")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Long_Singular_Input")
    void invalidAccountCreationTooLongUserAddressTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //invalid user account creation test - too long user address (100 chars)
        invalidUserAccountCreationTooLongAddressTest();
    }

    //Test 002w -> invalid user account creation test - too long user city (100 chars) (the user account gets created, test has failed)
    @Test
    @DisplayName("Invalid User Account Creation Test - Too Long User City")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Long_Singular_Input")
    void invalidAccountCreationTooLongUserCityTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //invalid user account creation test - too long user city (100 chars)
        invalidUserAccountCreationTooLongCityTest();
    }

    //Test 002x -> invalid user account creation test - too long user post code (6 digits) (the user account gets created, test has failed)
    @Test
    @DisplayName("Invalid User Account Creation Test - Too Long User Post Code")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Long_Singular_Input")
    void invalidAccountCreationTooLongUserPostCodeTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //invalid user account creation test - too long user post code (6 digits)
        invalidUserAccountCreationTooLongPostCodeTest();
    }

    //Test 002y -> invalid user account creation test - too long user phone (6 digits) (the user account gets created, test has failed)
    @Test
    @DisplayName("Invalid User Account Creation Test - Too Long User Phone")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Long_Singular_Input")
    void invalidAccountCreationTooLongUserPhoneTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //invalid user account creation test - too long user phone (30 digits)
        invalidUserAccountCreationTooLongPhoneTest();
    }

    //invalid singular input format

    //Test 002z -> invalid user account creation test - invalid user email format (missing '@')
    @Test
    @DisplayName("Invalid User Account Creation Test - Invalid User Email Format")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Invalid_Singular_Input_Format")
    void invalidAccountCreationInvalidUserEmailFormatTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //invalid user account creation test - invalid user email format (missing '@')
        invalidUserAccountCreationInvalidEmailFormatTest();
    }

    //Test 002aa -> invalid user account creation test - existing user email (used beforehand in manual testing)
    @Test
    @DisplayName("Invalid User Account Creation Test - Existing User Email")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Invalid_Singular_Input_Format")
    @Tag("Pre_Existing_Email")
    void invalidAccountCreationExistingUserEmailTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //invalid user account creation test - existing user email (used beforehand in manual testing)
        invalidUserAccountCreationExistingEmailTest();
    }

    //Test 002ab -> invalid user account creation test - invalid user password and confirm password format (strings only)
    @Test
    @DisplayName("Invalid User Account Creation Test - Invalid User Password / Confirm Password Format")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Invalid_Singular_Input_Format")
    void invalidAccountCreationInvalidUserPasswordConfirmFormatTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //invalid user account creation test - invalid user password and confirm password format (strings only)
        invalidUserAccountCreationInvalidPasswordConfirmTest();
    }

    //Test 002ac -> invalid user account creation test - mismatching user confirm password
    @Test
    @DisplayName("Invalid User Account Creation Test - Mismatching User Confirm Password")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Invalid_Singular_Input_Format")
    @Tag("Mismatch_Password_Input")
    void invalidAccountCreationMismatchingConfirmPasswordTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //invalid user account creation test - mismatching user confirm password
        invalidUserAccountCreationMismatchingConfirmPasswordTest();
    }

    //Test 002ad -> invalid user account creation test - invalid user first name format (special symbols only) (the user account got created, test has failed)
    @Test
    @DisplayName("Invalid User Account Creation Test - Invalid User First Name Format")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Invalid_Singular_Input_Format")
    void invalidAccountCreationInvalidFirstNameFormatTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //invalid user account creation test - invalid user first name format (special symbols only)
        invalidUserAccountCreationInvalidFirstNameFormatTest();
    }

    //Test 002ae -> invalid user account creation test - invalid user last name format (special symbols only) (the user account got created, test has failed)
    @Test
    @DisplayName("Invalid User Account Creation Test - Invalid User Last Name Format")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Invalid_Singular_Input_Format")
    void invalidAccountCreationInvalidLastNameFormatTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //invalid user account creation test - invalid user last name format (special symbols only)
        invalidUserAccountCreationInvalidLastNameFormatTest();
    }

    //Test 002af -> invalid user account creation test - invalid user address format (special symbols only) (the user account got created, test has failed)
    @Test
    @DisplayName("Invalid User Account Creation Test - Invalid User Address Format")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Invalid_Singular_Input_Format")
    void invalidAccountCreationInvalidAddressFormatTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //invalid user account creation test - invalid user address format (special symbols only)
        invalidUserAccountCreationInvalidAddressFormatTest();
    }

    //Test 002ag -> invalid user account creation test - invalid user city format (special symbols only) (the user account got created, test has failed)
    @Test
    @DisplayName("Invalid User Account Creation Test - Invalid User City Format")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Invalid_Singular_Input_Format")
    void invalidAccountCreationInvalidCityFormatTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //invalid user account creation test - invalid user city format (special symbols only)
        invalidUserAccountCreationInvalidCityFormatTest();
    }

    //Test 002ah -> invalid user account creation test - invalid user post code format (special symbols only) (the user account got created, test has failed)
    @Test
    @DisplayName("Invalid User Account Creation Test - Invalid User Post Code Format")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Invalid_Singular_Input_Format")
    void invalidAccountCreationInvalidPostCodeFormatTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //invalid user account creation test - invalid user post code format (special symbols only)
        invalidUserAccountCreationInvalidPostCodeFormatTest();
    }

    //Test 002ai -> invalid user account creation test - invalid user phone format (special symbols only) (the user account got created, test has failed)
    @Test
    @DisplayName("Invalid User Account Creation Test - Invalid User Phone Format")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Invalid_Singular_Input_Format")
    void invalidAccountCreationInvalidPhoneFormatTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //invalid user account creation test - invalid user phone format (special symbols only)
        invalidUserAccountCreationInvalidPhoneFormatTest();
    }

}
