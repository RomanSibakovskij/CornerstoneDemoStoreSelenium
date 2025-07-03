package com.mybigcommerce.demo;

import com.mybigcommerce.demo.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class SingleCategoryDashboardPageTest extends TestMethods{

    //single category dashboard page single product addition to cart tests

    //Test 011 -> single category dashboard page set single product ("Canvas Laundry Cart") addition to cart test method (as a guest)
    @Test
    @DisplayName("Single Category Dashboard Page Set Single Product Addition To Cart Test (as a guest)")
    @Tag("Single_Set_Category_Product_Addition_To_Cart")
    @Tag("Test_As_A_Guest")
    void singleSetCategoryProductAddToCartTest() {
        addSingleUtilityLaundryCartProductToCartTest();
    }

    //Test 011a -> single category dashboard page set single product ("Gather Journal Issue 7") addition to cart test method (as a registered user)
    @Test
    @DisplayName("Single Category Dashboard Page Set Single Product Addition To Cart Test (as a registered user)")
    @Tag("Single_Set_Category_Product_Addition_To_Cart")
    @Tag("Test_As_A_Reg_User")
    void singleSetCategoryAddToCartRegUserTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //single category dashboard page set single product ("Gather Journal Issue 7") addition to cart test method (as a registered user)
        addSinglePublicationsGatherJournalProductToCartRegUserTest();
    }

}
