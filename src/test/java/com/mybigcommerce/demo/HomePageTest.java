package com.mybigcommerce.demo;

import com.mybigcommerce.demo.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class HomePageTest extends TestMethods{

    //user navigation to register page test

    //Test 001 -> user navigation to register page test
    @Test
    @DisplayName("User Navigation To Register Page Test")
    @Tag("Navigate_To_Register_Page")
    void userNavigationToRegisterPageTest() {
        navigateToRegisterPageTest();
    }

    //single most popular product addition to cart tests

    //Test 009 -> single most popular product ("Tiered Wire Basket") addition to cart test method (as a guest)
    @Test
    @DisplayName("Single Most Popular Product Addition To Cart Test (as a guest)")
    @Tag("Single_Most_Popular_Product_Addition_To_Cart")
    @Tag("Test_As_A_Guest")
    void singleMostPopularProductAddToCartTest() {
        addSingleMostPopularProductToCartGuestTest();
    }

}
