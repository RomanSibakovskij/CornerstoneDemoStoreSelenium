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

    //Test 009a -> single most popular product ("Oak Cheese Grater") addition to cart test method (as a registered user)
    @Test
    @DisplayName("Single Most Popular Product Addition To Cart Test (as a registered user)")
    @Tag("Single_Most_Popular_Product_Addition_To_Cart")
    @Tag("Test_As_A_Reg_User")
    void singleMostPopularProductAddToCartRegUserTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //single most popular product ("Oak Cheese Grater") addition to cart test method (as a registered user)
        addSingleMostPopularProductToCartRegUserTest();
    }

    //multiple most popular products addition to cart tests

    //Test 009b -> multiple most popular products ("Tiered Wire Basket") addition to cart test method (as a guest)
    @Test
    @DisplayName("Multiple Most Popular Products Addition To Cart Test (as a guest)")
    @Tag("Multiple_Most_Popular_Products_Addition_To_Cart")
    @Tag("Test_As_A_Guest")
    void multipleMostPopularProductsAddToCartTest() {
        addMultipleMostPopularProductsToCartGuestTest();
    }

    //Test 009c -> multiple most popular products ("Oak Cheese Grater") addition to cart test method (as a registered user)
    @Test
    @DisplayName("Multiple Most Popular Products Addition To Cart Test (as a registered user)")
    @Tag("Multiple_Most_Popular_Products_Addition_To_Cart")
    @Tag("Test_As_A_Reg_User")
    void multipleMostPopularProductsAddToCartRegUserTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //multiple most popular products ("Oak Cheese Grater") addition to cart test method (as a registered user)
        addMultipleMostPopularProductsToCartRegUserTest();
    }

    //single new product addition to cart tests

    //Test 010 -> single new product ("Smith Journal 13") addition to cart test method (as a guest)
    @Test
    @DisplayName("Single New Product Addition To Cart Test (as a guest)")
    @Tag("Single_New_Product_Addition_To_Cart")
    @Tag("Test_As_A_Guest")
    void singleNewProductAddToCartTest() {
        addSingleNewProductToCartGuestTest();
    }

    //Test 010a -> single new product ("Kinfolk Issue 16") addition to cart test method (as a registered user)
    @Test
    @DisplayName("Single New Product Addition To Cart Test (as a registered user)")
    @Tag("Single_New_Product_Addition_To_Cart")
    @Tag("Test_As_A_Reg_User")
    void singleNewProductAddToCartRegUserTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //single most popular product ("Kinfolk Issue 16") addition to cart test method (as a registered user)
        addSingleNewProductToCartRegUserTest();
    }

}
