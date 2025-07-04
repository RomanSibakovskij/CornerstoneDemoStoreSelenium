package com.mybigcommerce.demo;

import com.mybigcommerce.demo.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class AddToCompareListPageTest extends TestMethods{

    //multiple products addition to compare list tests

    //Test 013 -> products ("S Shaped Scrub Brush", "Dish Detergent", "Feather Duster") addition to compare list test method (as a guest)
    @Test
    @DisplayName("Multiple Products Addition To Compare List Test (as a guest)")
    @Tag("Multiple_Products_Addition_To_Compare_List")
    @Tag("Test_As_A_Guest")
    void productsAddToCompareListTest() {
        addProductsToCompareListTest();
    }

    //Test 013a -> products ("Gather Journal Issue 7", "The Kinfolk Table", "Living With Plants") addition to compare list test method (as a registered user)
    @Test
    @DisplayName("Multiple Products Addition To Compare List Test (as a registered user)")
    @Tag("Multiple_Products_Addition_To_Compare_List")
    @Tag("Test_As_A_Reg_User")
    void productsAddToCompareListRegUserTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //single searched product ("Dustpan & Brush") addition to cart test method (as a registered user)
        addProductsToCompareListRegUserTest();
    }

    //add products from compare list to cart tests

    //Test 014 -> products ("S Shaped Scrub Brush", "Dish Detergent", "Feather Duster") addition from compare list to cart test method (as a guest)
    @Test
    @DisplayName("Multiple Products Addition From Compare List To Cart Test (as a guest)")
    @Tag("Multiple_Products_Addition_From_Compare_List_To_Cart")
    @Tag("Test_As_A_Guest")
    void productsAddFromCompareListToCartTest() {
        //products ("S Shaped Scrub Brush", "Dish Detergent", "Feather Duster") addition to compare list test method (as a guest)
        addProductsToCompareListTest();
        //products ("S Shaped Scrub Brush", "Dish Detergent", "Feather Duster") addition from compare list to cart test method (as a guest)
        addProductsFromCompareListToCartTest();
    }

    //Test 014a -> products ("Gather Journal Issue 7", "The Kinfolk Table", "Living With Plants") addition from compare list to cart test method (as a registered user)
    @Test
    @DisplayName("Multiple Products Addition From Compare List To Cart Test (as a registered user)")
    @Tag("Multiple_Products_Addition_From_Compare_List_To_Cart")
    @Tag("Test_As_A_Reg_User")
    void productsAddFromCompareListToCartRegUserTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //single searched product ("Dustpan & Brush") addition to cart test method (as a registered user)
        addProductsToCompareListRegUserTest();
        //products ("Gather Journal Issue 7", "The Kinfolk Table", "Living With Plants") addition from compare list to cart test method (as a registered user)
        addProductsFromCompareListToCartTest();
    }

    //product removal from compare list tests

    //Test 015 -> products ("S Shaped Scrub Brush", "Dish Detergent", "Feather Duster") removal from compare list test method (as a guest)
    @Test
    @DisplayName("Multiple Products Removal From Compare List Test (as a guest)")
    @Tag("Multiple_Products_Removal_From_Compare_List")
    @Tag("Test_As_A_Guest")
    void productsRemoveFromCompareListToCartTest() {
        //products ("S Shaped Scrub Brush", "Dish Detergent", "Feather Duster") addition to compare list test method (as a guest)
        addProductsToCompareListTest();
        //products ("S Shaped Scrub Brush", "Dish Detergent", "Feather Duster") removal from compare list test method (as a guest)
        removeProductsFromCompareListTest();
    }

}
