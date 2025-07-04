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

    //Test 024a -> single most popular product ("Oak Cheese Grater") check out confirmation test method (as a registered user)
    @Test
    @DisplayName("Single Most Popular Product Addition Checkout Confirmation Test (as a registered user)")
    @Tag("Single_Most_Popular_Product_Checkout_Confirmation")
    @Tag("Test_As_A_Reg_User")
    void singleMostPopularProductCheckoutConfirmationRegUserTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //single most popular product ("Oak Cheese Grater") addition to cart test method (as a registered user)
        addSingleMostPopularProductToCartRegUserTest();
        //single most popular product ("Oak Cheese Grater") addition to check out test method (as a registered user)
        addProductToCheckoutTest();
        //single most popular product ("Oak Cheese Grater") check out confirmation test method (as a registered user)
        validRegUserProductOrderCheckoutTest();
    }

}
