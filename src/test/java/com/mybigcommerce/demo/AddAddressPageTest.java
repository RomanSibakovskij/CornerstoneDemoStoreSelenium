package com.mybigcommerce.demo;

import com.mybigcommerce.demo.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class AddAddressPageTest extends TestMethods {

    //valid second user address addition test

    //Test 004 -> valid user second address addition test
    @Test
    @DisplayName("Valid User Second Address Addition Test")
    @Tag("Valid_Second_User_Address_Addition")
    void validSecondAddressAdditionTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //valid user second address addition test
        validSecondUserAddressAdditionTest();
    }

    //valid update user address test

    //Test 005 -> valid update user address test
    @Test
    @DisplayName("Valid Update User Address Test")
    @Tag("Valid_Update_User_Address")
    void validAddressEditTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //valid edit user address test
        validEditUserAddressTest();
    }

    //Test 005e -> invalid update user address test - no user city
    @Test
    @DisplayName("Invalid Update User Address Test - No City")
    @Tag("Invalid_Update_User_Address")
    @Tag("No_Singular_Input")
    void invalidAddressEditNoCityTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //invalid update user address test - no user city
        invalidEditUserAddressNoCityTest();
    }



}
