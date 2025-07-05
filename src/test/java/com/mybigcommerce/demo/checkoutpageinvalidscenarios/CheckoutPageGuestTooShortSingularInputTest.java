package com.mybigcommerce.demo.checkoutpageinvalidscenarios;

import com.mybigcommerce.demo.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class CheckoutPageGuestTooShortSingularInputTest extends TestMethods {

    //too short singular input

    //Test 029u -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too short guest email (1 char -> name, domain) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Most Popular Product Addition To Checkout Test (as a guest) - Too Short Email")
    @Tag("Invalid_Single_Most_Popular_Product_Checkout_Confirmation")
    @Tag("Too_Short_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleMostPopularProductCheckoutConfirmationTooShortGuestEmailTest() {
        //single most popular product ("Tiered Wire Basket") addition to cart test method (as a guest)
        addSingleMostPopularProductToCartGuestTest();
        //single most popular product ("Tiered Wire Basket") addition to check out test method (as a guest)
        addProductToCheckoutTest();
        //invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too short guest email (1 char -> name, domain)
        invalidGuestProductOrderCheckoutTooShortGuestEmailTest();
    }

    //Test 029v -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too short guest shipping first name (1 char) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Most Popular Product Addition To Checkout Test (as a guest) - Too Short Shipping First Name")
    @Tag("Invalid_Single_Most_Popular_Product_Checkout_Confirmation")
    @Tag("Too_Short_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleMostPopularProductCheckoutConfirmationTooShortGuestShipFirstNameTest() {
        //single most popular product ("Tiered Wire Basket") addition to cart test method (as a guest)
        addSingleMostPopularProductToCartGuestTest();
        //single most popular product ("Tiered Wire Basket") addition to check out test method (as a guest)
        addProductToCheckoutTest();
        //invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too short guest shipping first name (1 char)
        invalidGuestProductOrderCheckoutTooShortGuestShipFirstNameTest();


    }


}