package com.mybigcommerce.demo;

import com.mybigcommerce.demo.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class AddAddressPageTest extends TestMethods {

    //valid second user address addition test

    //Test 004 -> valid user second address addition test
    @Test
    @DisplayName("Valid User Second Address Addition Test")
    @Tag("Valid_Second_User_Addition")
    void validSecondAddressAdditionTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //valid user second address addition test
        validSecondUserAddressAdditionTest();
    }

    
}
