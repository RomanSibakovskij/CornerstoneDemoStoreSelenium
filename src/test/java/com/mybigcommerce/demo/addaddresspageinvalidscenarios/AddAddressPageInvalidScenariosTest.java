package com.mybigcommerce.demo.addaddresspageinvalidscenarios;

import com.mybigcommerce.demo.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class AddAddressPageInvalidScenariosTest extends TestMethods{

    //invalid second user address addition tests

    //no singular input

    //Test 004a -> invalid user second address addition test - no user country
    @Test
    @DisplayName("Invalid User Second Address Addition Test - No Country")
    @Tag("Invalid_Second_User_Addition")
    @Tag("No_Singular_Input")
    void invalidSecondAddressAdditionNoCountryTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //invalid user second address addition test - no user country
        invalidSecondUserAddressAdditionNoCountryTest();
    }

    //Test 004b -> invalid user second address addition test - no user first name
    @Test
    @DisplayName("Invalid User Second Address Addition Test - No First Name")
    @Tag("Invalid_Second_User_Addition")
    @Tag("No_Singular_Input")
    void invalidSecondAddressAdditionNoFirstNameTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //invalid user second address addition test - no user first name
        invalidSecondUserAddressAdditionNoFirstNameTest();
    }

    //Test 004c -> invalid user second address addition test - no user last name
    @Test
    @DisplayName("Invalid User Second Address Addition Test - No Last Name")
    @Tag("Invalid_Second_User_Addition")
    @Tag("No_Singular_Input")
    void invalidSecondAddressAdditionNoLastNameTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //invalid user second address addition test - no user last name
        invalidSecondUserAddressAdditionNoLastNameTest();
    }

}
