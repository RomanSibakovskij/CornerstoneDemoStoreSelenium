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

    //single category dashboard page multiple products addition to cart tests

    //Test 011b -> single category dashboard page set multiple products ("Floor Cleaner") addition to cart test method (as a guest)
    @Test
    @DisplayName("Single Category Dashboard Page Set Multiple Products Addition To Cart Test (as a guest)")
    @Tag("Multiple_Set_Category_Products_Addition_To_Cart")
    @Tag("Test_As_A_Guest")
    void multipleSetCategoryProductsAddToCartTest() {
        addMultipleUtilityLaundryCartProductToCartTest();
    }

    //Test 011c -> single category dashboard page set multiple products ("Openhouse No. 3") addition to cart test method (as a registered user)
    @Test
    @DisplayName("Single Category Dashboard Page Set Multiple Products Addition To Cart Test (as a registered user)")
    @Tag("Multiple_Set_Category_Products_Addition_To_Cart")
    @Tag("Test_As_A_Reg_User")
    void multipleSetCategoryAddToCartRegUserTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //single category dashboard page set multiple products ("Openhouse No. 3") addition to cart test method (as a registered user)
        addMultiplePublicationOpenHouseProductToCartRegUserTest();
    }

    //single searched product addition to cart tests

    //Test 012 -> single searched product ("Living with Plants") addition to cart test method (as a guest)
    @Test
    @DisplayName("Single Searched Product Addition To Cart Test (as a guest)")
    @Tag("Single_Searched_Product_Addition_To_Cart")
    @Tag("Test_As_A_Guest")
    void singleSearchedProductAddToCartTest() {
        addSingleSearchedPlantPictureProductToCartTest();
    }

    //Test 012a -> single searched product ("Dustpan & Brush") addition to cart test method (as a registered user)
    @Test
    @DisplayName("Single Searched Product Addition To Cart Test (as a registered user)")
    @Tag("Single_Searched_Product_Addition_To_Cart")
    @Tag("Test_As_A_Reg_User")
    void singleSearchedProductAddToCartRegUserTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //single searched product ("Dustpan & Brush") addition to cart test method (as a registered user)
        addSingleSearchedDustpanProductToCartRegUserTest();
    }

    //multiple searched products addition to cart tests

    //Test 012b -> multiple searched products ("Orbit Terrarium (Large)") addition to cart test method (as a guest)
    @Test
    @DisplayName("Multiple Searched Products Addition To Cart Test (as a guest)")
    @Tag("Multiple_Searched_Products_Addition_To_Cart")
    @Tag("Test_As_A_Guest")
    void multipleSearchedProductsAddToCartTest() {
        addMultipleSearchedLargeTerrariumProductToCartTest();
    }

    //Test 012c -> multiple searched products ("Dustpan & Brush") addition to cart test method (as a registered user)
    @Test
    @DisplayName("Multiple Searched Products Addition To Cart Test (as a registered user)")
    @Tag("Multiple_Searched_Products_Addition_To_Cart")
    @Tag("Test_As_A_Reg_User")
    void multipleSearchedProductsAddToCartRegUserTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //multiple searched products ("1L Le Parfait Jar") addition to cart test method (as a registered user)
        addMultipleSearchedJarProductToCartRegUserTest();
    }

}
