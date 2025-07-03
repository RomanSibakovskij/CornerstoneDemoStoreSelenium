package com.mybigcommerce.demo;

import com.mybigcommerce.demo.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class LoginRegisterDashboardPageTest extends TestMethods{

    //valid edit user logout test

    //Test 007 -> valid user logout test
    @Test
    @DisplayName("Valid User Account Logout Test")
    @Tag("Valid_User_Logout")
    void validLogoutTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //valid user logout test
        validUserLogoutTest();
    }

    //valid edit user login tests

    //Test 008 -> valid user login test
    @Test
    @DisplayName("Valid User Account Login Test")
    @Tag("Valid_User_Login")
    void validLoginTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //valid user logout test
        validUserLogoutTest();
        //valid user login test
        validUserLoginTest();
    }

    //Test 008a -> valid user login with edited login email test
    @Test
    @DisplayName("Valid User Account Login With Edited Login Email Test")
    @Tag("Valid_User_Login")
    @Tag("Valid_Edited_User_Login")
    void validEditedLoginEmailTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //valid edit user account data (with login email) test
        validEditUserAccountDataWithLoginEmailTest();
        //valid user logout test
        validUserLogoutTest();
        //valid user login with edited login email test
        validUserEditedLoginEmailTest();
    }

    //Test 008b -> valid user login with edited login password test
    @Test
    @DisplayName("Valid User Account Login With Edited Login Password Test")
    @Tag("Valid_User_Login")
    @Tag("Valid_Edited_User_Login")
    void validEditedLoginPasswordTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //valid edit user account data (with login password) test
        validEditUserAccountDataWithLoginPasswordTest();
        //valid user login with edited login password test
        validUserEditedLoginPasswordTest();
    }

    //invalid user login tests

    //no singular input

    //Test 008c -> invalid user login test - no login email
    @Test
    @DisplayName("Invalid User Account Login Test - No Login Email")
    @Tag("Invalid_User_Login")
    @Tag("No_Singular_Input")
    void invalidLoginNoLoginEmailTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //valid user logout test
        validUserLogoutTest();
        //invalid user login test - no login email
        invalidUserLoginNoEmailTest();
    }

    //Test 008d -> invalid user login test - no login password
    @Test
    @DisplayName("Invalid User Account Login Test - No Login Password")
    @Tag("Invalid_User_Login")
    @Tag("No_Singular_Input")
    void invalidLoginNoLoginPasswordTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //valid user logout test
        validUserLogoutTest();
        //invalid user login test - no login password
        invalidUserLoginNoPasswordTest();
    }

    //invalid singular input

    //Test 008e -> invalid user login test - invalid login email
    @Test
    @DisplayName("Invalid User Account Login Test - Invalid Login Email")
    @Tag("Invalid_User_Login")
    @Tag("Invalid_Singular_Input")
    void invalidLoginInvalidLoginEmailTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //valid user logout test
        validUserLogoutTest();
        //invalid user login test - invalid login email
        invalidUserLoginInvalidEmailTest();
    }

    //Test 008f -> invalid user login test - invalid login password
    @Test
    @DisplayName("Invalid User Account Login Test - Invalid Login Password")
    @Tag("Invalid_User_Login")
    @Tag("Invalid_Singular_Input")
    void invalidLoginInvalidLoginPasswordTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //valid user logout test
        validUserLogoutTest();
        //invalid user login test - invalid login password
        invalidUserLoginInvalidPasswordTest();
    }

}
