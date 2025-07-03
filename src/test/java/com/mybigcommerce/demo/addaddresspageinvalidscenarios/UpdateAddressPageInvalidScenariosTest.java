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

    //too short singular input

    //Test 005i -> invalid update user address test - too short user first name (1 char) (the user address edit hasn't been aborted, test has failed)
    @Test
    @DisplayName("Invalid Update User Address Test - Too Short First Name")
    @Tag("Invalid_Update_User_Address")
    @Tag("Too_Short_Singular_Input")
    void invalidAddressEditTooShortFirstNameTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //invalid update user address test - too short user first name (1 char)
        invalidEditUserAddressTooShortFirstNameTest();
    }

    //Test 005j -> invalid update user address test - too short user last name (1 char) (the user address edit hasn't been aborted, test has failed)
    @Test
    @DisplayName("Invalid Update User Address Test - Too Short Last Name")
    @Tag("Invalid_Update_User_Address")
    @Tag("Too_Short_Singular_Input")
    void invalidAddressEditTooShortLastNameTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //invalid update user address test - too short user last name (1 char)
        invalidEditUserAddressTooShortLastNameTest();
    }

    //Test 005k -> invalid update user address test - too short user address (3 chars) (the user address edit hasn't been aborted, test has failed)
    @Test
    @DisplayName("Invalid Update User Address Test - Too Short Address")
    @Tag("Invalid_Update_User_Address")
    @Tag("Too_Short_Singular_Input")
    void invalidAddressEditTooShortAddressTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //invalid update user address test - too short user address (3 chars)
        invalidEditUserAddressTooShortAddressTest();
    }

    //Test 005l -> invalid update user address test - too short user city (1 char) (the user address edit hasn't been aborted, test has failed)
    @Test
    @DisplayName("Invalid Update User Address Test - Too Short City")
    @Tag("Invalid_Update_User_Address")
    @Tag("Too_Short_Singular_Input")
    void invalidAddressEditTooShortCityTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //invalid update user address test - too short user city (1 char)
        invalidEditUserAddressTooShortCityTest();
    }

    //Test 005m -> invalid update user address test - too short user post code (4 digits) (the user address edit hasn't been aborted, test has failed)
    @Test
    @DisplayName("Invalid Update User Address Test - Too Short Post Code")
    @Tag("Invalid_Update_User_Address")
    @Tag("Too_Short_Singular_Input")
    void invalidAddressEditTooShortPostCodeTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //invalid update user address test - too short user post code (4 digits)
        invalidEditUserAddressTooShortPostCodeTest();
    }

    //Test 005n -> invalid update user address test - too short user phone (2 digits) (the user address edit hasn't been aborted, test has failed)
    @Test
    @DisplayName("Invalid Update User Address Test - Too Short Phone")
    @Tag("Invalid_Update_User_Address")
    @Tag("Too_Short_Singular_Input")
    void invalidAddressEditTooShortPhoneTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //invalid update user address test - too short user phone (2 digits)
        invalidEditUserAddressTooShortPhoneTest();
    }

    //too long singular input

    //Test 005o -> invalid update user address test - too long user first name (100 chars) (the user address edit hasn't been aborted, test has failed)
    @Test
    @DisplayName("Invalid Update User Address Test - Too Long First Name")
    @Tag("Invalid_Update_User_Address")
    @Tag("Too_Long_Singular_Input")
    void invalidAddressEditTooLongFirstNameTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //invalid update user address test - too long user first name (100 chars)
        invalidEditUserAddressTooLongFirstNameTest();
    }

    //Test 005p -> invalid update user address test - too long user last name (100 chars) (the user address edit hasn't been aborted, test has failed)
    @Test
    @DisplayName("Invalid Update User Address Test - Too Long Last Name")
    @Tag("Invalid_Update_User_Address")
    @Tag("Too_Long_Singular_Input")
    void invalidAddressEditTooLongLastNameTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //invalid update user address test - too long user last name (100 chars)
        invalidEditUserAddressTooLongLastNameTest();
    }

    //Test 005q -> invalid update user address test - too long user address (100 chars) (the user address edit hasn't been aborted, test has failed)
    @Test
    @DisplayName("Invalid Update User Address Test - Too Long Address")
    @Tag("Invalid_Update_User_Address")
    @Tag("Too_Long_Singular_Input")
    void invalidAddressEditTooLongAddressTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //invalid update user address test - too long user address (100 chars)
        invalidEditUserAddressTooLongAddressTest();
    }

    //Test 005r -> invalid update user address test - too long user city (100 chars) (the user address edit hasn't been aborted, test has failed)
    @Test
    @DisplayName("Invalid Update User Address Test - Too Long City")
    @Tag("Invalid_Update_User_Address")
    @Tag("Too_Long_Singular_Input")
    void invalidAddressEditTooLongCityTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //invalid update user address test - too long user city (100 chars)
        invalidEditUserAddressTooLongCityTest();
    }

    //Test 005s -> invalid update user address test - too long user post code (6 digits) (the user address edit hasn't been aborted, test has failed)
    @Test
    @DisplayName("Invalid Update User Address Test - Too Long Post Code")
    @Tag("Invalid_Update_User_Address")
    @Tag("Too_Long_Singular_Input")
    void invalidAddressEditTooLongPostCodeTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //invalid update user address test - too long user post code (6 digits)
        invalidEditUserAddressTooLongPostCodeTest();
    }

    //Test 005t -> invalid update user address test - too long user phone (30 digits) (the user address edit hasn't been aborted, test has failed)
    @Test
    @DisplayName("Invalid Update User Address Test - Too Long Phone")
    @Tag("Invalid_Update_User_Address")
    @Tag("Too_Long_Singular_Input")
    void invalidAddressEditTooLongPhoneTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //invalid update user address test - too long user phone (30 digits)
        invalidEditUserAddressTooLongPhoneTest();
    }

    //invalid singular input format

    //Test 005u -> invalid update user address test - invalid user first name format (special symbols only) (the user address edit hasn't been aborted, test has failed)
    @Test
    @DisplayName("Invalid Update User Address Test - Invalid First Name Format")
    @Tag("Invalid_Update_User_Address")
    @Tag("Invalid_Singular_Input_Format")
    void invalidAddressEditInvalidFirstNameFormatTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //invalid update user address test - invalid user first name format (special symbols only)
        invalidEditUserAddressInvalidFirstNameFormatTest();
    }

    //Test 005v -> invalid update user address test - invalid user last name format (special symbols only) (the user address edit hasn't been aborted, test has failed)
    @Test
    @DisplayName("Invalid Update User Address Test - Invalid Last Name Format")
    @Tag("Invalid_Update_User_Address")
    @Tag("Invalid_Singular_Input_Format")
    void invalidAddressEditInvalidLastNameFormatTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //invalid update user address test - invalid user last name format (special symbols only)
        invalidEditUserAddressInvalidLastNameFormatTest();
    }

}
