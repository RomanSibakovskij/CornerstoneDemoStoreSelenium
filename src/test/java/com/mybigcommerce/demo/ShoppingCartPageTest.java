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

    //Test 016c -> multiple most popular products ("Oak Cheese Grater") addition to check out test method (as a registered user)
    @Test
    @DisplayName("Multiple Most Popular Products Addition To Checkout Test (as a registered user)")
    @Tag("Multiple_Most_Popular_Products_Addition_To_Checkout")
    @Tag("Test_As_A_Reg_User")
    void multipleMostPopularProductsAddToCheckoutRegUserTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //multiple most popular products ("Oak Cheese Grater") addition to cart test method (as a registered user)
        addMultipleMostPopularProductsToCartRegUserTest();
        //multiple most popular products ("Oak Cheese Grater") addition to check out test method (as a registered user)
        addProductToCheckoutTest();
    }

    //single new product addition to check out tests

    //Test 017 -> single new product ("Smith Journal 13") addition to check out test method (as a guest)
    @Test
    @DisplayName("Single New Product Addition To Checkout Test (as a guest)")
    @Tag("Single_New_Product_Addition_To_Checkout")
    @Tag("Test_As_A_Guest")
    void singleNewProductAddToCheckoutTest() {
        //single new product ("Smith Journal 13") addition to cart test method (as a guest)
        addSingleNewProductToCartGuestTest();
        //single new product ("Smith Journal 13") addition to check out test method (as a guest)
        addProductToCheckoutTest();
    }

    //Test 017a -> single new product ("Kinfolk Issue 16") addition to check out test method (as a registered user)
    @Test
    @DisplayName("Single New Product Addition To Checkout Test (as a registered user)")
    @Tag("Single_New_Product_Addition_To_Checkout")
    @Tag("Test_As_A_Reg_User")
    void singleNewProductAddToCheckoutRegUserTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //single most popular product ("Kinfolk Issue 16") addition to cart test method (as a registered user)
        addSingleNewProductToCartRegUserTest();
        //single new product ("Kinfolk Issue 16") addition to check out test method (as a registered user)
        addProductToCheckoutTest();
    }

    //multiple new products addition to check out tests

    //Test 017b -> multiple new products ("Smith Journal 13") addition to check out test method (as a guest)
    @Test
    @DisplayName("Multiple New Products Addition To Checkout Test (as a guest)")
    @Tag("Multiple_New_Products_Addition_To_Checkout")
    @Tag("Test_As_A_Guest")
    void multipleNewProductsAddToCheckoutTest() {
        //multiple new products ("Smith Journal 13") addition to cart test method (as a guest)
        addMultipleNewProductsToCartGuestTest();
        //multiple new products ("Smith Journal 13") addition to check out test method (as a guest)
        addProductToCheckoutTest();
    }

    //Test 017c -> multiple new product ("Kinfolk Issue 16") addition to check out test method (as a registered user)
    @Test
    @DisplayName("Multiple New Products Addition To Checkout Test (as a registered user)")
    @Tag("Single_New_Product_Addition_To_Checkout")
    @Tag("Test_As_A_Reg_User")
    void multipleNewProductsAddToCheckoutRegUserTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //multiple new products ("Kinfolk Issue 16") addition to cart test method (as a registered user)
        addMultipleNewProductsToCartRegUserTest();
        //multiple new product ("Kinfolk Issue 16") addition to check out test method (as a registered user)
        addProductToCheckoutTest();
    }

    //single category dashboard page single product addition to check out tests

    //Test 018 -> single category dashboard page set single product ("Canvas Laundry Cart") addition to check out test method (as a guest)
    @Test
    @DisplayName("Single Category Dashboard Page Set Single Product Addition To Checkout Test (as a guest)")
    @Tag("Single_Set_Category_Product_Addition_To_Checkout")
    @Tag("Test_As_A_Guest")
    void singleSetCategoryProductAddToCheckoutTest() {
        //single category dashboard page set single product ("Canvas Laundry Cart") addition to cart test method (as a guest)
        addSingleUtilityLaundryCartProductToCartTest();
        //single category dashboard page set single product ("Canvas Laundry Cart") addition to check out test method (as a guest)
        addProductToCheckoutTest();
    }

    //Test 018a -> single category dashboard page set single product ("Gather Journal Issue 7") addition to check out test method (as a registered user)
    @Test
    @DisplayName("Single Category Dashboard Page Set Single Product Addition To Checkout Test (as a registered user)")
    @Tag("Single_Set_Category_Product_Addition_To_Checkout")
    @Tag("Test_As_A_Reg_User")
    void singleSetCategoryAddToCheckoutRegUserTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //single category dashboard page set single product ("Gather Journal Issue 7") addition to cart test method (as a registered user)
        addSinglePublicationsGatherJournalProductToCartRegUserTest();
        //single category dashboard page set single product ("Gather Journal Issue 7") addition to check out test method (as a registered user)
        addProductToCheckoutTest();
    }

}
