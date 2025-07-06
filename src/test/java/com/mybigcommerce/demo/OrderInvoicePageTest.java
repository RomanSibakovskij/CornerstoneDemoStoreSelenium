package com.mybigcommerce.demo;

import com.mybigcommerce.demo.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class OrderInvoicePageTest extends TestMethods {

    //most popular product(s) order submission confirmation tests

    //Test 030 -> single most popular product ("Oak Cheese Grater") order submission confirmation test method (as a registered user)
    @Test
    @DisplayName("Single Most Popular Product Order Submission Confirmation Test (as a registered user)")
    @Tag("Single_Most_Popular_Product_Order_Submission_Confirmation")
    @Tag("Test_As_A_Reg_User")
    void singleMostPopularProductOrderConfirmationRegUserTest() {
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
        //navigate back to home page (with driver) (the header home link nor "Continue shopping" button seem to be working during automation run(manually, everything works)
        navigateToHomePageTest();
        //single most popular product ("Oak Cheese Grater") order submission confirmation test method (as a registered user)
        orderInvoicePageOrderConfirmationTest();
    }

    //Test 030a -> multiple most popular products ("Oak Cheese Grater") order submission confirmation test method (as a registered user)
    @Test
    @DisplayName("Multiple Most Popular Products Order Submission Confirmation Test (as a registered user)")
    @Tag("Multiple_Most_Popular_Products_Checkout_Submission_Confirmation")
    @Tag("Test_As_A_Reg_User")
    void multipleMostPopularProductsOrderConfirmationRegUserTest() {
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
        //navigate back to home page (with driver) (the header home link nor "Continue shopping" button seem to be working during automation run(manually, everything works)
        navigateToHomePageTest();
        //multiple most popular products ("Oak Cheese Grater") order submission confirmation test method (as a registered user)
        orderInvoicePageOrderConfirmationTest();
    }

    //new product(s) order submission confirmation tests

    //Test 031 -> single new product ("Kinfolk Issue 16") order submission confirmation test method (as a registered user)
    @Test
    @DisplayName("Single New Product Order Submission Confirmation Test (as a registered user)")
    @Tag("Single_New_Product_Checkout_Submission_Confirmation")
    @Tag("Test_As_A_Reg_User")
    void singleNewProductOrderConfirmationRegUserTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //single most popular product ("Kinfolk Issue 16") addition to cart test method (as a registered user)
        addSingleNewProductToCartRegUserTest();
        //single new product ("Kinfolk Issue 16") addition to check out test method (as a registered user)
        addProductToCheckoutTest();
        //single new product ("Kinfolk Issue 16") check out confirmation test method (as a registered user)
        validRegUserProductOrderCheckoutTest();
        //navigate back to home page (with driver) (the header home link nor "Continue shopping" button seem to be working during automation run(manually, everything works)
        navigateToHomePageTest();
        //single new product ("Kinfolk Issue 16") order submission confirmation test method (as a registered user)
        orderInvoicePageOrderConfirmationTest();
    }

    //Test 031a -> multiple new products ("Kinfolk Issue 16") order submission confirmation test method (as a registered user)
    @Test
    @DisplayName("Multiple New Products Order Submission Confirmation Test (as a registered user)")
    @Tag("Multiple_New_Products_Checkout_Submission_Confirmation")
    @Tag("Test_As_A_Reg_User")
    void multipleNewProductsOrderConfirmationRegUserTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //multiple new products ("Kinfolk Issue 16") addition to cart test method (as a registered user)
        addMultipleNewProductsToCartRegUserTest();
        //multiple new product ("Kinfolk Issue 16") addition to check out test method (as a registered user)
        addProductToCheckoutTest();
        //multiple new product ("Kinfolk Issue 16") check out confirmation test method (as a registered user)
        validRegUserProductOrderCheckoutTest();
        //navigate back to home page (with driver) (the header home link nor "Continue shopping" button seem to be working during automation run(manually, everything works)
        navigateToHomePageTest();
        //multiple new products ("Kinfolk Issue 16") order submission confirmation test method (as a registered user)
        orderInvoicePageOrderConfirmationTest();
    }

    //single category dashboard page set product(s) order submission confirmation tests

    //Test 032 -> single category dashboard page set single product ("Gather Journal Issue 7") order submission confirmation test method (as a registered user)
    @Test
    @DisplayName("Single Category Dashboard Page Set Single Product Order Submission Confirmation Test (as a registered user)")
    @Tag("Single_Set_Category_Product_Checkout_Submission_Confirmation")
    @Tag("Test_As_A_Reg_User")
    void singleSetCategoryProductOrderConfirmationRegUserTest() {
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
        //navigate back to home page (with driver) (the header home link nor "Continue shopping" button seem to be working during automation run(manually, everything works)
        navigateToHomePageTest();
        //single category dashboard page set single product ("Gather Journal Issue 7") order submission confirmation test method (as a registered user)
        orderInvoicePageOrderConfirmationTest();
    }

    //Test 032a -> single category dashboard page set multiple products ("Openhouse No. 3") order submission confirmation test method (as a registered user)
    @Test
    @DisplayName("Single Category Dashboard Page Set Multiple Products Order Submission Confirmation Test (as a registered user)")
    @Tag("Multiple_Set_Category_Products_Checkout_Submission_Confirmation")
    @Tag("Test_As_A_Reg_User")
    void multipleSetCategoryOrderCheckoutConfirmationRegUserTest() {
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
        //navigate back to home page (with driver) (the header home link nor "Continue shopping" button seem to be working during automation run(manually, everything works)
        navigateToHomePageTest();
        //single category dashboard page set multiple products ("Openhouse No. 3") order submission confirmation test method (as a registered user)
        orderInvoicePageOrderConfirmationTest();
    }

    //searched product(s) order submission confirmation tests

    //Test 033 -> single searched product ("Dustpan & Brush") order submission confirmation test method (as a registered user)
    @Test
    @DisplayName("Single Searched Product Order Submission Confirmation Test (as a registered user)")
    @Tag("Single_Searched_Product_Checkout_Submission_Confirmation")
    @Tag("Test_As_A_Reg_User")
    void singleSearchedOrderCheckoutConfirmationRegUserTest() {
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
        //navigate back to home page (with driver) (the header home link nor "Continue shopping" button seem to be working during automation run(manually, everything works)
        navigateToHomePageTest();
        //single searched product ("Dustpan & Brush") order submission confirmation test method (as a registered user)
        orderInvoicePageOrderConfirmationTest();
    }

    //Test 033a -> multiple searched products ("Dustpan & Brush") order submission confirmation test method (as a registered user)
    @Test
    @DisplayName("Multiple Searched Products Order Submission Confirmation Test (as a registered user)")
    @Tag("Multiple_Searched_Products_Checkout_Submission_Confirmation")
    @Tag("Test_As_A_Reg_User")
    void multipleSearchedOrderCheckoutConfirmationRegUserTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //multiple searched products ("1L Le Parfait Jar") addition to cart test method (as a registered user)
        addMultipleSearchedJarProductToCartRegUserTest();
        //multiple searched products ("Dustpan & Brush") addition to check out test method (as a registered user)
        addProductToCheckoutTest();
        //multiple searched products ("Dustpan & Brush") check out confirmation test method (as a registered user)
        validRegUserProductOrderCheckoutTest();
        //navigate back to home page (with driver) (the header home link nor "Continue shopping" button seem to be working during automation run(manually, everything works)
        navigateToHomePageTest();
        //multiple searched products ("Dustpan & Brush") order submission confirmation test method (as a registered user)
        orderInvoicePageOrderConfirmationTest();
    }

    //products addition from compare list order submission confirmation tests

    //Test 034 -> products ("Gather Journal Issue 7", "The Kinfolk Table", "Living With Plants") addition from compare list order submission confirmation test method (as a registered user)
    @Test
    @DisplayName("Multiple Products Addition From Compare List Order Submission Confirmation Test (as a registered user)")
    @Tag("Multiple_Products_Addition_From_Compare_List_Checkout_Submission_Confirmation")
    @Tag("Test_As_A_Reg_User")
    void productsAddFromCompareListOrderConfirmationRegUserTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //single searched product ("Dustpan & Brush") addition to cart test method (as a registered user)
        addProductsToCompareListRegUserTest();
        //products ("Gather Journal Issue 7", "The Kinfolk Table", "Living With Plants") addition from compare list to cart test method (as a registered user)
        addProductsFromCompareListToCartTest();
        //products ("Gather Journal Issue 7", "The Kinfolk Table", "Living With Plants") addition from compare list to check out test method (as a registered user)
        addProductToCheckoutTest();
        //products ("Gather Journal Issue 7", "The Kinfolk Table", "Living With Plants") addition from compare list check out confirmation test method (as a registered user)
        validRegUserProductOrderCheckoutTest();
        //navigate back to home page (with driver) (the header home link nor "Continue shopping" button seem to be working during automation run(manually, everything works)
        navigateToHomePageTest();
        //products ("Gather Journal Issue 7", "The Kinfolk Table", "Living With Plants") addition from compare list order submission confirmation test method (as a registered user)
        orderInvoicePageOrderConfirmationTest();
    }

}
