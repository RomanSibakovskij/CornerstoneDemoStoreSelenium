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

}
