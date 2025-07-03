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

    //Test 004n -> invalid user second address addition test - too short user phone (2 digits) (new address addition wasn't aborted, test has failed)
    @Test
    @DisplayName("Invalid User Second Address Addition Test - Too Short Phone")
    @Tag("Invalid_Second_User_Address_Addition")
    @Tag("Too_Short_Singular_Input")
    void invalidSecondAddressAdditionTooShortPhoneTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //invalid user second address addition test - too short user phone (2 digits)
        invalidSecondUserAddressAdditionTooShortPhoneTest();
    }

    //too long singular input

    //Test 004o -> invalid user second address addition test - too long user first name (100 chars) (new address addition wasn't aborted, test has failed)
    @Test
    @DisplayName("Invalid User Second Address Addition Test - Too Long First Name")
    @Tag("Invalid_Second_User_Address_Addition")
    @Tag("Too_Long_Singular_Input")
    void invalidSecondAddressAdditionTooLongFirstNameTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //invalid user second address addition test - too long user first name (100 chars)
        invalidSecondUserAddressAdditionTooLongFirstNameTest();
    }

    //Test 004p -> invalid user second address addition test - too long user last name (100 chars) (new address addition wasn't aborted, test has failed)
    @Test
    @DisplayName("Invalid User Second Address Addition Test - Too Long Last Name")
    @Tag("Invalid_Second_User_Address_Addition")
    @Tag("Too_Long_Singular_Input")
    void invalidSecondAddressAdditionTooLongLastNameTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //invalid user second address addition test - too long user last name (100 chars)
        invalidSecondUserAddressAdditionTooLongLastNameTest();
    }

    //Test 004q -> invalid user second address addition test - too long user address (100 chars) (new address addition wasn't aborted, test has failed)
    @Test
    @DisplayName("Invalid User Second Address Addition Test - Too Long Address")
    @Tag("Invalid_Second_User_Address_Addition")
    @Tag("Too_Long_Singular_Input")
    void invalidSecondAddressAdditionTooLongAddressTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //invalid user second address addition test - too long user address (100 chars)
        invalidSecondUserAddressAdditionTooLongAddressTest();
    }

    //Test 004r -> invalid user second address addition test - too long user city (100 chars) (new address addition wasn't aborted, test has failed)
    @Test
    @DisplayName("Invalid User Second Address Addition Test - Too Long City")
    @Tag("Invalid_Second_User_Address_Addition")
    @Tag("Too_Long_Singular_Input")
    void invalidSecondAddressAdditionTooLongCityTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //invalid user second address addition test - too long user city (100 chars)
        invalidSecondUserAddressAdditionTooLongCityTest();
    }

    //Test 004s -> invalid user second address addition test - too long user post code (6 digits) (new address addition wasn't aborted, test has failed)
    @Test
    @DisplayName("Invalid User Second Address Addition Test - Too Long Post Code")
    @Tag("Invalid_Second_User_Address_Addition")
    @Tag("Too_Long_Singular_Input")
    void invalidSecondAddressAdditionTooLongPostCodeTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //invalid user second address addition test - too long user post code (6 digits))
        invalidSecondUserAddressAdditionTooLongPostCodeTest();
    }

    //Test 004t -> invalid user second address addition test - too long user phone (30 digits) (new address addition wasn't aborted, test has failed)
    @Test
    @DisplayName("Invalid User Second Address Addition Test - Too Long Phone")
    @Tag("Invalid_Second_User_Address_Addition")
    @Tag("Too_Long_Singular_Input")
    void invalidSecondAddressAdditionTooLongPhoneTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //invalid user second address addition test - too long user phone (30 digits))
        invalidSecondUserAddressAdditionTooLongPhoneTest();
    }

    //invalid singular input format

    //Test 004u -> invalid user second address addition test - invalid user first name format (special symbols only) (new address addition wasn't aborted, test has failed)
    @Test
    @DisplayName("Invalid User Second Address Addition Test - Invalid First Name Format")
    @Tag("Invalid_Second_User_Address_Addition")
    @Tag("Invalid_Singular_Input_Format")
    void invalidSecondAddressAdditionInvalidFirstNameFormatTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //invalid user second address addition test - invalid user first name format (special symbols only)
        invalidSecondUserAddressAdditionInvalidFirstNameFormatTest();
    }

    //Test 004v -> invalid user second address addition test - invalid user last name format (special symbols only) (new address addition wasn't aborted, test has failed)
    @Test
    @DisplayName("Invalid User Second Address Addition Test - Invalid Last Name Format")
    @Tag("Invalid_Second_User_Address_Addition")
    @Tag("Invalid_Singular_Input_Format")
    void invalidSecondAddressAdditionInvalidLastNameFormatTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //invalid user second address addition test - invalid user last name format (special symbols only)
        invalidSecondUserAddressAdditionInvalidLastNameFormatTest();
    }

    //Test 004w -> invalid user second address addition test - invalid user address format (special symbols only) (new address addition wasn't aborted, test has failed)
    @Test
    @DisplayName("Invalid User Second Address Addition Test - Invalid Address Format")
    @Tag("Invalid_Second_User_Address_Addition")
    @Tag("Invalid_Singular_Input_Format")
    void invalidSecondAddressAdditionInvalidAddressFormatTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //invalid user second address addition test - invalid user address format (special symbols only)
        invalidSecondUserAddressAdditionInvalidAddressFormatTest();
    }

    //Test 004x -> invalid user second address addition test - invalid user city format (special symbols only) (new address addition wasn't aborted, test has failed)
    @Test
    @DisplayName("Invalid User Second Address Addition Test - Invalid City Format")
    @Tag("Invalid_Second_User_Address_Addition")
    @Tag("Invalid_Singular_Input_Format")
    void invalidSecondAddressAdditionInvalidCityFormatTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //invalid user second address addition test - invalid user city format (special symbols only)
        invalidSecondUserAddressAdditionInvalidCityFormatTest();
    }

    //Test 004y -> invalid user second address addition test - invalid user post code format (special symbols only) (new address addition wasn't aborted, test has failed)
    @Test
    @DisplayName("Invalid User Second Address Addition Test - Invalid Post Code Format")
    @Tag("Invalid_Second_User_Address_Addition")
    @Tag("Invalid_Singular_Input_Format")
    void invalidSecondAddressAdditionInvalidPostCodeFormatTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //invalid user second address addition test - invalid user post code format (special symbols only)
        invalidSecondUserAddressAdditionInvalidPostCodeFormatTest();
    }

}
