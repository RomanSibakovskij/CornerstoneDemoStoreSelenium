package com.mybigcommerce.demo;

import com.mybigcommerce.demo.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class CheckoutPageTest extends TestMethods{

    //valid checkout tests

    //single most popular product check out confirmation tests

    //Test 024 -> single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest)
    @Test
    @DisplayName("Single Most Popular Product Addition To Checkout Test (as a guest)")
    @Tag("Single_Most_Popular_Product_Checkout_Confirmation")
    @Tag("Test_As_A_Guest")
    void singleMostPopularProductCheckoutConfirmationTest() {
        //single most popular product ("Tiered Wire Basket") addition to cart test method (as a guest)
        addSingleMostPopularProductToCartGuestTest();
        //single most popular product ("Tiered Wire Basket") addition to check out test method (as a guest)
        addProductToCheckoutTest();
        //single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest)
        validGuestProductOrderCheckoutTest();
    }


}
