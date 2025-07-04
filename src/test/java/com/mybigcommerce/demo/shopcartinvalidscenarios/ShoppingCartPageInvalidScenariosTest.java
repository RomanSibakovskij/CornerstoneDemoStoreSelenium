package com.mybigcommerce.demo.shopcartinvalidscenarios;

import com.mybigcommerce.demo.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class ShoppingCartPageInvalidScenariosTest extends TestMethods{

    //invalid shopping cart tests (invalid shipping data addition) -> only guest branch is tested to avoid redundancy

    //no singular input

    //Test 023 -> invalid products addition to check out test method (as a guest) - no shipping country (addition to check out wasn't aborted, test has failed)
    @Test
    @DisplayName("Invalid Products Addition To Checkout Test (as a guest) - No Shipping Country")
    @Tag("Multiple_Searched_Products_Addition_To_Checkout")
    @Tag("No_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidProductsAdditionToCheckoutNoShipCountryTest() {
        //multiple searched products ("Orbit Terrarium (Large)" addition to cart test method (as a guest)
        addMultipleSearchedLargeTerrariumProductToCartTest();
        //invalid products addition to check out test method (as a guest) - no shipping country
        invalidAddProductToCheckoutNoShipCountryTest();
    }

    //Test 023a -> invalid products addition to check out test method (as a guest) - no shipping state (addition to check out wasn't aborted, test has failed)
    @Test
    @DisplayName("Invalid Products Addition To Checkout Test (as a guest) - No Shipping State")
    @Tag("Multiple_Searched_Products_Addition_To_Checkout")
    @Tag("No_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidProductsAdditionToCheckoutNoShipStateTest() {
        //multiple searched products ("Orbit Terrarium (Large)" addition to cart test method (as a guest)
        addMultipleSearchedLargeTerrariumProductToCartTest();
        //invalid products addition to check out test method (as a guest) - no shipping state
        invalidAddProductToCheckoutNoShipStateTest();
    }

    //Test 023b -> invalid products addition to check out test method (as a guest) - no shipping city (addition to check out wasn't aborted, test has failed)
    @Test
    @DisplayName("Invalid Products Addition To Checkout Test (as a guest) - No Shipping City")
    @Tag("Multiple_Searched_Products_Addition_To_Checkout")
    @Tag("No_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidProductsAdditionToCheckoutNoShipCityTest() {
        //multiple searched products ("Orbit Terrarium (Large)" addition to cart test method (as a guest)
        addMultipleSearchedLargeTerrariumProductToCartTest();
        //invalid products addition to check out test method (as a guest) - no shipping city
        invalidAddProductToCheckoutNoShipCityTest();
    }

    //Test 023c -> invalid products addition to check out test method (as a guest) - no shipping post code (addition to check out wasn't aborted, test has failed)
    @Test
    @DisplayName("Invalid Products Addition To Checkout Test (as a guest) - No Shipping Post Code")
    @Tag("Multiple_Searched_Products_Addition_To_Checkout")
    @Tag("No_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidProductsAdditionToCheckoutNoShipPostCodeTest() {
        //multiple searched products ("Orbit Terrarium (Large)" addition to cart test method (as a guest)
        addMultipleSearchedLargeTerrariumProductToCartTest();
        //invalid products addition to check out test method (as a guest) - no shipping post code
        invalidAddProductToCheckoutNoShipPostCodeTest();
    }

    //too short singular input

    //Test 023d -> invalid products addition to check out test method (as a guest) - too short shipping city (1 char) (addition to check out wasn't aborted, test has failed)
    @Test
    @DisplayName("Invalid Products Addition To Checkout Test (as a guest) - Too Short Shipping City")
    @Tag("Multiple_Searched_Products_Addition_To_Checkout")
    @Tag("Too_Short_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidProductsAdditionToCheckoutTooShortShipCityTest() {
        //multiple searched products ("Orbit Terrarium (Large)" addition to cart test method (as a guest)
        addMultipleSearchedLargeTerrariumProductToCartTest();
        //invalid products addition to check out test method (as a guest) - too short shipping city (1 char)
        invalidAddProductToCheckoutTooShortShipCityTest();
    }

    //Test 023e -> invalid products addition to check out test method (as a guest) - too short shipping post code (4 digits) (addition to check out wasn't aborted, test has failed)
    @Test
    @DisplayName("Invalid Products Addition To Checkout Test (as a guest) - Too Short Shipping Post Code")
    @Tag("Multiple_Searched_Products_Addition_To_Checkout")
    @Tag("Too_Short_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidProductsAdditionToCheckoutTooShortShipPostCodeTest() {
        //multiple searched products ("Orbit Terrarium (Large)" addition to cart test method (as a guest)
        addMultipleSearchedLargeTerrariumProductToCartTest();
        //invalid products addition to check out test method (as a guest) - too short shipping post code (4 digits)
        invalidAddProductToCheckoutTooShortShipPostCodeTest();
    }

    //too long singular input

    //Test 023f -> invalid product addition to check out test method (as a guest) - too long shipping city (100 chars) (addition to check out wasn't aborted, test has failed)
    @Test
    @DisplayName("Invalid Product Addition To Checkout Test (as a guest) - Too Long Shipping City")
    @Tag("Multiple_Searched_Products_Addition_To_Checkout")
    @Tag("Too_Long_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidProductsAdditionToCheckoutTooLongShipCityTest() {
        //single category dashboard page set single product ("Canvas Laundry Cart") addition to cart test method (as a guest)
        addSingleUtilityLaundryCartProductToCartTest();
        //invalid products addition to check out test method (as a guest) - too long shipping city (100 chars)
        invalidAddProductToCheckoutTooLongShipCityTest();
    }

    //Test 023g -> invalid product addition to check out test method (as a guest) - too long shipping post code (6 digits) (addition to check out wasn't aborted, test has failed)
    @Test
    @DisplayName("Invalid Product Addition To Checkout Test (as a guest) - Too Long Shipping Post Code")
    @Tag("Multiple_Searched_Products_Addition_To_Checkout")
    @Tag("Too_Long_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidProductsAdditionToCheckoutTooLongShipPostCodeTest() {
        //single category dashboard page set single product ("Canvas Laundry Cart") addition to cart test method (as a guest)
        addSingleUtilityLaundryCartProductToCartTest();
        //invalid products addition to check out test method (as a guest) - too long shipping post code (6 digits)
        invalidAddProductToCheckoutTooLongShipPostCodeTest();
    }

    //invalid singular input format

    //Test 023h -> invalid products addition to check out test method (as a guest) - invalid shipping city format (special symbols only) (addition to check out wasn't aborted, test has failed)
    @Test
    @DisplayName("Invalid Product Addition To Checkout Test (as a guest) - Invalid Shipping City Format")
    @Tag("Multiple_Searched_Products_Addition_To_Checkout")
    @Tag("Invalid_Singular_Input_Format")
    @Tag("Test_As_A_Guest")
    void invalidProductsAdditionToCheckoutInvalidShipCityFormatTest() {
        //single category dashboard page set single product ("Canvas Laundry Cart") addition to cart test method (as a guest)
        addSingleUtilityLaundryCartProductToCartTest();
        //invalid products addition to check out test method (as a guest) - invalid shipping city format (special symbols only)
        invalidAddProductToCheckoutInvalidShipCityFormatTest();
    }

}
