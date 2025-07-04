package com.mybigcommerce.demo;

import com.mybigcommerce.demo.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class ShoppingCartPageTest extends TestMethods{

    //single most popular product addition to check out tests

    //Test 016 -> single most popular product ("Tiered Wire Basket") addition to check out test method (as a guest)
    @Test
    @DisplayName("Single Most Popular Product Addition To Checkout Test (as a guest)")
    @Tag("Single_Most_Popular_Product_Addition_To_Checkout")
    @Tag("Test_As_A_Guest")
    void singleMostPopularProductAddToCartTest() {
        //single most popular product ("Tiered Wire Basket") addition to cart test method (as a guest)
        addSingleMostPopularProductToCartGuestTest();
        //single most popular product ("Tiered Wire Basket") addition to check out test method (as a guest)
        addProductToCheckoutTest();
    }

    //Test 016a -> single most popular product ("Oak Cheese Grater") addition to check out test method (as a registered user)
    @Test
    @DisplayName("Single Most Popular Product Addition To Checkout Test (as a registered user)")
    @Tag("Single_Most_Popular_Product_Addition_To_Checkout")
    @Tag("Test_As_A_Reg_User")
    void singleMostPopularProductAddToCartRegUserTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //single most popular product ("Oak Cheese Grater") addition to cart test method (as a registered user)
        addSingleMostPopularProductToCartRegUserTest();
        //single most popular product ("Oak Cheese Grater") addition to check out test method (as a registered user)
        addProductToCheckoutTest();
    }

    //multiple most popular products addition to check out tests

    //Test 016b -> multiple most popular products ("Tiered Wire Basket") addition to check out test method (as a guest)
    @Test
    @DisplayName("Multiple Most Popular Products Addition To Checkout Test (as a guest)")
    @Tag("Multiple_Most_Popular_Products_Addition_To_Checkout")
    @Tag("Test_As_A_Guest")
    void multipleMostPopularProductsAddToCheckoutTest() {
        //multiple most popular products ("Tiered Wire Basket") addition to cart test method (as a guest)
        addMultipleMostPopularProductsToCartGuestTest();
        //multiple most popular products ("Tiered Wire Basket") addition to check out test method (as a guest)
        addProductToCheckoutTest();
    }

}
