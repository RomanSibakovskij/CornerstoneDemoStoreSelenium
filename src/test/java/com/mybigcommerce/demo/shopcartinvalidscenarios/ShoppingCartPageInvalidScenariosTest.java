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

}
