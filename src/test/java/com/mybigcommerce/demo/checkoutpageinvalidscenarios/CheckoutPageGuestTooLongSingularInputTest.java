package com.mybigcommerce.demo.checkoutpageinvalidscenarios;

import com.mybigcommerce.demo.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class CheckoutPageGuestTooLongSingularInputTest extends TestMethods{

    //too long singular input

    //Test 029al -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too long guest email (100 chars -> name, domain) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Most Popular Product Addition To Checkout Test (as a guest) - Too Long Email")
    @Tag("Invalid_Single_Most_Popular_Product_Checkout_Confirmation")
    @Tag("Too_Long_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleMostPopularProductCheckoutConfirmationTooLongGuestEmailTest() {
        //single most popular product ("Tiered Wire Basket") addition to cart test method (as a guest)
        addSingleMostPopularProductToCartGuestTest();
        //single most popular product ("Tiered Wire Basket") addition to check out test method (as a guest)
        addProductToCheckoutTest();
        //invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too long guest email (100 chars -> name, domain)
        invalidGuestProductOrderCheckoutTooLongGuestEmailTest();
    }

    //Test 029am -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too long guest shipping first name (100 chars) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Most Popular Product Addition To Checkout Test (as a guest) - Too Long Shipping First Name")
    @Tag("Invalid_Single_Most_Popular_Product_Checkout_Confirmation")
    @Tag("Too_Long_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleMostPopularProductCheckoutConfirmationTooLongGuestShipFirstNameTest() {
        //single most popular product ("Tiered Wire Basket") addition to cart test method (as a guest)
        addSingleMostPopularProductToCartGuestTest();
        //single most popular product ("Tiered Wire Basket") addition to check out test method (as a guest)
        addProductToCheckoutTest();
        //invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too long guest first name (100 chars)
        invalidGuestProductOrderCheckoutTooLongGuestShipFirstNameTest();
    }

    //Test 029an -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too long guest shipping last name (100 chars) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Most Popular Product Addition To Checkout Test (as a guest) - Too Long Shipping Last Name")
    @Tag("Invalid_Single_Most_Popular_Product_Checkout_Confirmation")
    @Tag("Too_Long_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleMostPopularProductCheckoutConfirmationTooLongGuestShipLastNameTest() {
        //single most popular product ("Tiered Wire Basket") addition to cart test method (as a guest)
        addSingleMostPopularProductToCartGuestTest();
        //single most popular product ("Tiered Wire Basket") addition to check out test method (as a guest)
        addProductToCheckoutTest();
        //invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too long guest last name (100 chars)
        invalidGuestProductOrderCheckoutTooLongGuestShipLastNameTest();
    }

    //Test 029ao -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too long guest shipping address (100 chars) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Most Popular Product Addition To Checkout Test (as a guest) - Too Long Shipping Address")
    @Tag("Invalid_Single_Most_Popular_Product_Checkout_Confirmation")
    @Tag("Too_Long_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleMostPopularProductCheckoutConfirmationTooLongGuestShipAddressTest() {
        //single most popular product ("Tiered Wire Basket") addition to cart test method (as a guest)
        addSingleMostPopularProductToCartGuestTest();
        //single most popular product ("Tiered Wire Basket") addition to check out test method (as a guest)
        addProductToCheckoutTest();
        //invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too long guest address (100 chars)
        invalidGuestProductOrderCheckoutTooLongGuestShipAddressTest();
    }

    //Test 029ap -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too long guest shipping city (100 chars) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Most Popular Product Addition To Checkout Test (as a guest) - Too Long Shipping City")
    @Tag("Invalid_Single_Most_Popular_Product_Checkout_Confirmation")
    @Tag("Too_Long_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleMostPopularProductCheckoutConfirmationTooLongGuestShipCityTest() {
        //single most popular product ("Tiered Wire Basket") addition to cart test method (as a guest)
        addSingleMostPopularProductToCartGuestTest();
        //single most popular product ("Tiered Wire Basket") addition to check out test method (as a guest)
        addProductToCheckoutTest();
        //invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too long guest city (100 chars)
        invalidGuestProductOrderCheckoutTooLongGuestShipCityTest();
    }

    //Test 029aq -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too long guest shipping post code (6 digits) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Most Popular Product Addition To Checkout Test (as a guest) - Too Long Shipping Post Code")
    @Tag("Invalid_Single_Most_Popular_Product_Checkout_Confirmation")
    @Tag("Too_Long_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleMostPopularProductCheckoutConfirmationTooLongGuestShipPostCodeTest() {
        //single most popular product ("Tiered Wire Basket") addition to cart test method (as a guest)
        addSingleMostPopularProductToCartGuestTest();
        //single most popular product ("Tiered Wire Basket") addition to check out test method (as a guest)
        addProductToCheckoutTest();
        //invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too long guest post code (6 digits)
        invalidGuestProductOrderCheckoutTooLongGuestShipPostCodeTest();
    }

    //Test 029ar -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too long guest shipping phone (30 digits) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Most Popular Product Addition To Checkout Test (as a guest) - Too Long Shipping Phone")
    @Tag("Invalid_Single_Most_Popular_Product_Checkout_Confirmation")
    @Tag("Too_Long_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleMostPopularProductCheckoutConfirmationTooLongGuestShipPhoneTest() {
        //single most popular product ("Tiered Wire Basket") addition to cart test method (as a guest)
        addSingleMostPopularProductToCartGuestTest();
        //single most popular product ("Tiered Wire Basket") addition to check out test method (as a guest)
        addProductToCheckoutTest();
        //invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too long guest phone (30 digits)
        invalidGuestProductOrderCheckoutTooLongGuestShipPhoneTest();
    }

    //Test 029as -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too long guest billing first name (100 chars) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Most Popular Product Addition To Checkout Test (as a guest) - Too Long Billing First Name")
    @Tag("Invalid_Single_Most_Popular_Product_Checkout_Confirmation")
    @Tag("Too_Long_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleMostPopularProductCheckoutConfirmationTooLongGuestBillFirstNameTest() {
        //single most popular product ("Tiered Wire Basket") addition to cart test method (as a guest)
        addSingleMostPopularProductToCartGuestTest();
        //single most popular product ("Tiered Wire Basket") addition to check out test method (as a guest)
        addProductToCheckoutTest();
        //invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too long guest billing first name (100 chars)
        invalidGuestProductOrderCheckoutTooLongBillGuestFirstNameTest();
    }

    //Test 029at -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too long guest billing last name (100 chars) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Most Popular Product Addition To Checkout Test (as a guest) - Too Long Billing Last Name")
    @Tag("Invalid_Single_Most_Popular_Product_Checkout_Confirmation")
    @Tag("Too_Long_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleMostPopularProductCheckoutConfirmationTooLongGuestBillLastNameTest() {
        //single most popular product ("Tiered Wire Basket") addition to cart test method (as a guest)
        addSingleMostPopularProductToCartGuestTest();
        //single most popular product ("Tiered Wire Basket") addition to check out test method (as a guest)
        addProductToCheckoutTest();
        //invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too long guest billing last name (100 chars)
        invalidGuestProductOrderCheckoutTooLongBillGuestLastNameTest();
    }

}
