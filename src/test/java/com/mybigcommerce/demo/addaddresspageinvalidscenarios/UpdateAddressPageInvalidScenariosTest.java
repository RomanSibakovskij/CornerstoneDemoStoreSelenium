package com.mybigcommerce.demo.addaddresspageinvalidscenarios;

import com.mybigcommerce.demo.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class UpdateAddressPageInvalidScenariosTest extends TestMethods {

    //invalid update user address tests

    //no singular input

    //Test 005a -> invalid update user address test - no country
    @Test
    @DisplayName("Invalid Update User Address Test - No Country")
    @Tag("Invalid_Update_User_Address")
    @Tag("No_Singular_Input")
    void invalidAddressEditNoCountryTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //invalid update user address test - no country
        invalidEditUserAddressNoCountryTest();
    }

    //Test 005b -> invalid update user address test - no user first name
    @Test
    @DisplayName("Invalid Update User Address Test - No First Name")
    @Tag("Invalid_Update_User_Address")
    @Tag("No_Singular_Input")
    void invalidAddressEditNoFirstNameTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //invalid update user address test - no user first name
        invalidEditUserAddressNoFirstNameTest();
    }

    //Test 005c -> invalid update user address test - no user last name
    @Test
    @DisplayName("Invalid Update User Address Test - No Last Name")
    @Tag("Invalid_Update_User_Address")
    @Tag("No_Singular_Input")
    void invalidAddressEditNoLastNameTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //invalid update user address test - no user last name
        invalidEditUserAddressNoLastNameTest();
    }

    //Test 005d -> invalid update user address test - no user address
    @Test
    @DisplayName("Invalid Update User Address Test - No Address")
    @Tag("Invalid_Update_User_Address")
    @Tag("No_Singular_Input")
    void invalidAddressEditNoAddressTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //invalid update user address test - no user address
        invalidEditUserAddressNoAddressTest();
    }

    //Test 005f -> invalid update user address test - no user state
    @Test
    @DisplayName("Invalid Update User Address Test - No State")
    @Tag("Invalid_Update_User_Address")
    @Tag("No_Singular_Input")
    void invalidAddressEditNoStateTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //invalid update user address test - no user state
        invalidEditUserAddressNoStateTest();
    }

    //Test 005g -> invalid update user address test - no user post code
    @Test
    @DisplayName("Invalid Update User Address Test - No Post Code")
    @Tag("Invalid_Update_User_Address")
    @Tag("No_Singular_Input")
    void invalidAddressEditNoPostCodeTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //invalid update user address test -  no user post code
        invalidEditUserAddressNoPostCodeTest();
    }

    //Test 005h -> invalid update user address test - no user phone
    @Test
    @DisplayName("Invalid Update User Address Test - No Phone")
    @Tag("Invalid_Update_User_Address")
    @Tag("No_Singular_Input")
    void invalidAddressEditNoPhoneTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //invalid update user address test -  no user phone
        invalidEditUserAddressNoPhoneTest();
    }

}
