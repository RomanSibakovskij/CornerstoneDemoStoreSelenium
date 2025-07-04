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

}
