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


}
