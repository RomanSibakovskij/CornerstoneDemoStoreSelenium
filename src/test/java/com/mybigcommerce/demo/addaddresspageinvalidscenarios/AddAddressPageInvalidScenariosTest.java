package com.mybigcommerce.demo.addaddresspageinvalidscenarios;

import com.mybigcommerce.demo.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class AddAddressPageInvalidScenariosTest extends TestMethods{

    //invalid second user address addition tests

    //no singular input

    //Test 004a -> invalid user second address addition test - no user country
    @Test
    @DisplayName("Invalid User Second Address Addition Test - No Country")
    @Tag("Invalid_Second_User_Address_Addition")
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
    @Tag("Invalid_Second_User_Address_Addition")
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
    @Tag("Invalid_Second_User_Address_Addition")
    @Tag("No_Singular_Input")
    void invalidSecondAddressAdditionNoLastNameTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //invalid user second address addition test - no user last name
        invalidSecondUserAddressAdditionNoLastNameTest();
    }

    //Test 004d -> invalid user second address addition test - no user address
    @Test
    @DisplayName("Invalid User Second Address Addition Test - No Address")
    @Tag("Invalid_Second_User_Address_Addition")
    @Tag("No_Singular_Input")
    void invalidSecondAddressAdditionNoAddressTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //invalid user second address addition test - no user address
        invalidSecondUserAddressAdditionNoAddressTest();
    }

    //Test 004e -> invalid user second address addition test - no user city
    @Test
    @DisplayName("Invalid User Second Address Addition Test - No City")
    @Tag("Invalid_Second_User_Address_Addition")
    @Tag("No_Singular_Input")
    void invalidSecondAddressAdditionNoCityTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //invalid user second address addition test - no user city
        invalidSecondUserAddressAdditionNoCityTest();
    }

    //Test 004f -> invalid user second address addition test - no user state
    @Test
    @DisplayName("Invalid User Second Address Addition Test - No State")
    @Tag("Invalid_Second_User_Address_Addition")
    @Tag("No_Singular_Input")
    void invalidSecondAddressAdditionNoStateTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //invalid user second address addition test - no user state
        invalidSecondUserAddressAdditionNoStateTest();
    }

    //Test 004g -> invalid user second address addition test - no user post code
    @Test
    @DisplayName("Invalid User Second Address Addition Test - No Post Code")
    @Tag("Invalid_Second_User_Address_Addition")
    @Tag("No_Singular_Input")
    void invalidSecondAddressAdditionNoPostCodeTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //invalid user second address addition test - no user post code
        invalidSecondUserAddressAdditionNoPostCodeTest();
    }

    //Test 004h -> invalid user second address addition test - no user phone
    @Test
    @DisplayName("Invalid User Second Address Addition Test - No Phone")
    @Tag("Invalid_Second_User_Address_Addition")
    @Tag("No_Singular_Input")
    void invalidSecondAddressAdditionNoPhoneTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //invalid user second address addition test - no user phone
        invalidSecondUserAddressAdditionNoPhoneTest();
    }

    //too short singular input

    //Test 004i -> invalid user second address addition test - too short user first name (1 char) (new address addition wasn't aborted, test has failed)
    @Test
    @DisplayName("Invalid User Second Address Addition Test - Too Short First Name")
    @Tag("Invalid_Second_User_Address_Addition")
    @Tag("Too_Short_Singular_Input")
    void invalidSecondAddressAdditionTooShortFirstNameTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //invalid user second address addition test - too short user first name (1 char)
        invalidSecondUserAddressAdditionTooShortFirstNameTest();
    }

    //Test 004j -> invalid user second address addition test - too short user last name (1 char) (new address addition wasn't aborted, test has failed)
    @Test
    @DisplayName("Invalid User Second Address Addition Test - Too Short Last Name")
    @Tag("Invalid_Second_User_Address_Addition")
    @Tag("Too_Short_Singular_Input")
    void invalidSecondAddressAdditionTooShortLastNameTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //invalid user second address addition test - too short user last name (1 char)
        invalidSecondUserAddressAdditionTooShortLastNameTest();
    }

    //Test 004k -> invalid user second address addition test - too short user address (3 chars) (new address addition wasn't aborted, test has failed)
    @Test
    @DisplayName("Invalid User Second Address Addition Test - Too Short Address")
    @Tag("Invalid_Second_User_Address_Addition")
    @Tag("Too_Short_Singular_Input")
    void invalidSecondAddressAdditionTooShortAddressTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //invalid user second address addition test - too short user address (3 chars)
        invalidSecondUserAddressAdditionTooShortAddressTest();
    }

    //Test 004l -> invalid user second address addition test - too short user city (1 char) (new address addition wasn't aborted, test has failed)
    @Test
    @DisplayName("Invalid User Second Address Addition Test - Too Short City")
    @Tag("Invalid_Second_User_Address_Addition")
    @Tag("Too_Short_Singular_Input")
    void invalidSecondAddressAdditionTooShortCityTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //invalid user second address addition test - too short user city (1 char)
        invalidSecondUserAddressAdditionTooShortCityTest();
    }

    //Test 004m -> invalid user second address addition test - too short user post code (4 digits) (new address addition wasn't aborted, test has failed)
    @Test
    @DisplayName("Invalid User Second Address Addition Test - Too Short Post Code")
    @Tag("Invalid_Second_User_Address_Addition")
    @Tag("Too_Short_Singular_Input")
    void invalidSecondAddressAdditionTooShortPostCodeTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //invalid user second address addition test - too short user post code (4 digits)
        invalidSecondUserAddressAdditionTooShortPostCodeTest();
    }

}
