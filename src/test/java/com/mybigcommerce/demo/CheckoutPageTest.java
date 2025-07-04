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

    //multiple most popular products check out confirmation tests

    //Test 024b -> multiple most popular products ("Tiered Wire Basket") check out confirmation test method (as a guest)
    @Test
    @DisplayName("Multiple Most Popular Products Checkout Confirmation Test (as a guest)")
    @Tag("Multiple_Most_Popular_Products_Checkout_Confirmation")
    @Tag("Test_As_A_Guest")
    void multipleMostPopularProductsCheckoutConfirmationTest() {
        //multiple most popular products ("Tiered Wire Basket") addition to cart test method (as a guest)
        addMultipleMostPopularProductsToCartGuestTest();
        //multiple most popular products ("Tiered Wire Basket") addition to check out test method (as a guest)
        addProductToCheckoutTest();
        //multiple most popular products ("Tiered Wire Basket") check out confirmation test method (as a guest)
        validGuestProductOrderCheckoutTest();
    }

    //Test 024c -> multiple most popular products ("Oak Cheese Grater") check out confirmation test method (as a registered user)
    @Test
    @DisplayName("Multiple Most Popular Products Checkout Confirmation Test (as a registered user)")
    @Tag("Multiple_Most_Popular_Products_Checkout_Confirmation")
    @Tag("Test_As_A_Reg_User")
    void multipleMostPopularProductsCheckoutConfirmationRegUserTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //multiple most popular products ("Oak Cheese Grater") addition to cart test method (as a registered user)
        addMultipleMostPopularProductsToCartRegUserTest();
        //multiple most popular products ("Oak Cheese Grater") addition to check out test method (as a registered user)
        addProductToCheckoutTest();
        //multiple most popular products ("Oak Cheese Grater") check out confirmation test method (as a registered user)
        validRegUserProductOrderCheckoutTest();
    }

    //single new product check out confirmation tests

    //Test 025 -> single new product ("Smith Journal 13") check out confirmation test method (as a guest)
    @Test
    @DisplayName("Single New Product Checkout Confirmation Test (as a guest)")
    @Tag("Single_New_Product_Checkout_Confirmation")
    @Tag("Test_As_A_Guest")
    void singleNewProductCheckoutConfirmationTest() {
        //single new product ("Smith Journal 13") addition to cart test method (as a guest)
        addSingleNewProductToCartGuestTest();
        //single new product ("Smith Journal 13") addition to check out test method (as a guest)
        addProductToCheckoutTest();
        //single new product ("Smith Journal 13") check out confirmation test method (as a guest)
        validGuestProductOrderCheckoutTest();
    }

    //Test 025a -> single new product ("Kinfolk Issue 16") check out confirmation test method (as a registered user)
    @Test
    @DisplayName("Single New Product Checkout Confirmation Test (as a registered user)")
    @Tag("Single_New_Product_Checkout_Confirmation")
    @Tag("Test_As_A_Reg_User")
    void singleNewProductCheckoutConfirmationRegUserTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //single new popular product ("Kinfolk Issue 16") addition to cart test method (as a registered user)
        addSingleNewProductToCartRegUserTest();
        //single new product ("Kinfolk Issue 16") addition to check out test method (as a registered user)
        addProductToCheckoutTest();
        //single new product ("Kinfolk Issue 16") check out confirmation test method (as a registered user)
        validRegUserProductOrderCheckoutTest();
    }

    //multiple new products check out confirmation tests

    //Test 025b -> multiple new products ("Smith Journal 13") check out confirmation test method (as a guest)
    @Test
    @DisplayName("Multiple New Products Checkout Confirmation Test (as a guest)")
    @Tag("Multiple_New_Products_Checkout_Confirmation")
    @Tag("Test_As_A_Guest")
    void multipleNewProductsCheckoutConfirmationTest() {
        //multiple new products ("Smith Journal 13") addition to cart test method (as a guest)
        addMultipleNewProductsToCartGuestTest();
        //multiple new products ("Smith Journal 13") addition to check out test method (as a guest)
        addProductToCheckoutTest();
        //multiple new products ("Smith Journal 13") check out confirmation test method (as a guest)
        validGuestProductOrderCheckoutTest();
    }

    //Test 025c -> multiple new products ("Kinfolk Issue 16") check out confirmation test method (as a registered user)
    @Test
    @DisplayName("Multiple New Products Checkout Confirmation Test (as a registered user)")
    @Tag("Multiple_New_Products_Checkout_Confirmation")
    @Tag("Test_As_A_Reg_User")
    void multipleNewProductsCheckoutConfirmationRegUserTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //multiple new products ("Kinfolk Issue 16") addition to cart test method (as a registered user)
        addMultipleNewProductsToCartRegUserTest();
        //multiple new products ("Kinfolk Issue 16") addition to check out test method (as a registered user)
        addProductToCheckoutTest();
        //multiple new products ("Kinfolk Issue 16") check out confirmation test method (as a registered user)
        validRegUserProductOrderCheckoutTest();
    }

    //single category dashboard page single product check out confirmation tests

    //Test 026 -> single category dashboard page set single product ("Canvas Laundry Cart") check out confirmation test method (as a guest)
    @Test
    @DisplayName("Single Category Dashboard Page Set Single Product Checkout Confirmation Test (as a guest)")
    @Tag("Single_Set_Category_Product_Checkout_Confirmation")
    @Tag("Test_As_A_Guest")
    void singleSetCategoryProductCheckoutConfirmationTest() {
        //single category dashboard page set single product ("Canvas Laundry Cart") addition to cart test method (as a guest)
        addSingleUtilityLaundryCartProductToCartTest();
        //single category dashboard page set single product ("Canvas Laundry Cart") addition to check out test method (as a guest)
        addProductToCheckoutTest();
        //single category dashboard page set single product ("Canvas Laundry Cart") check out confirmation test method (as a guest)
        validGuestProductOrderCheckoutTest();
    }

    //Test 026a -> single category dashboard page set single product ("Gather Journal Issue 7") check out confirmation test method (as a registered user)
    @Test
    @DisplayName("Single Category Dashboard Page Set Single Product Checkout Confirmation Test (as a registered user)")
    @Tag("Single_Set_Category_Product_Checkout_Confirmation")
    @Tag("Test_As_A_Reg_User")
    void singleSetCategoryProductCheckoutConfirmationRegUserTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //single category dashboard page set single product ("Gather Journal Issue 7") addition to cart test method (as a registered user)
        addSinglePublicationsGatherJournalProductToCartRegUserTest();
        //single category dashboard page set single product ("Gather Journal Issue 7") addition to check out test method (as a registered user)
        addProductToCheckoutTest();
        //single category dashboard page set single product ("Gather Journal Issue 7") check out confirmation test method (as a registered user)
        validRegUserProductOrderCheckoutTest();
    }

    //single category dashboard page multiple products check out confirmation tests

    //Test 026b -> single category dashboard page set multiple products ("Floor Cleaner") check out confirmation test method (as a guest)
    @Test
    @DisplayName("Single Category Dashboard Page Set Multiple Products Checkout Confirmation Test (as a guest)")
    @Tag("Multiple_Set_Category_Products_Checkout_Confirmation")
    @Tag("Test_As_A_Guest")
    void multipleSetCategoryProductsCheckoutConfirmationTest() {
        //single category dashboard page set multiple products ("Floor Cleaner") addition to cart test method (as a guest)
        addMultipleUtilityLaundryCartProductToCartTest();
        //single category dashboard page set multiple products ("Floor Cleaner") addition to check out test method (as a guest)
        addProductToCheckoutTest();
        //single category dashboard page set multiple products ("Floor Cleaner") check out confirmation test method (as a guest)
        validGuestProductOrderCheckoutTest();
    }

    //Test 026c -> single category dashboard page set multiple products ("Openhouse No. 3") check out confirmation test method (as a registered user)
    @Test
    @DisplayName("Single Category Dashboard Page Set Multiple Products Checkout Confirmation Test (as a registered user)")
    @Tag("Multiple_Set_Category_Products_Checkout_Confirmation")
    @Tag("Test_As_A_Reg_User")
    void multipleSetCategoryProductsCheckoutConfirmationRegUserTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //single category dashboard page set multiple products ("Openhouse No. 3") addition to cart test method (as a registered user)
        addMultiplePublicationOpenHouseProductToCartRegUserTest();
        //single category dashboard page set multiple products ("Openhouse No. 3") addition to check out test method (as a registered user)
        addProductToCheckoutTest();
        //single category dashboard page set multiple products ("Openhouse No. 3") check out confirmation test method (as a registered user)
        validRegUserProductOrderCheckoutTest();
    }

    //single searched product check out confirmation tests

    //Test 027 -> single searched product ("Living with Plants") check out confirmation test method (as a guest)
    @Test
    @DisplayName("Single Searched Product Checkout Confirmation Test (as a guest)")
    @Tag("Single_Searched_Product_Checkout_Confirmation")
    @Tag("Test_As_A_Guest")
    void singleSearchedProductCheckoutConfirmationTest() {
        //single searched product ("Living with Plants") addition to cart test method (as a guest)
        addSingleSearchedPlantPictureProductToCartTest();
        //single searched product ("Living with Plants") addition to check out test method (as a guest)
        addProductToCheckoutTest();
        //single searched product ("Living with Plants") check out confirmation test method (as a guest)
        validGuestProductOrderCheckoutTest();
    }

    //Test 027a -> single searched product ("Dustpan & Brush") check out confirmation test method (as a registered user)
    @Test
    @DisplayName("Single Searched Product Checkout Confirmation Test (as a registered user)")
    @Tag("Single_Searched_Product_Checkout_Confirmation")
    @Tag("Test_As_A_Reg_User")
    void singleSearchedProductCheckoutConfirmationRegUserTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //single searched product ("Dustpan & Brush") addition to cart test method (as a registered user)
        addSingleSearchedDustpanProductToCartRegUserTest();
        //single searched product ("Dustpan & Brush") addition to check out test method (as a registered user)
        addProductToCheckoutTest();
        //single searched product ("Dustpan & Brush") check out confirmation test method (as a registered user)
        validRegUserProductOrderCheckoutTest();
    }

}
