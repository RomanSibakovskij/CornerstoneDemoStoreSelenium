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

}
