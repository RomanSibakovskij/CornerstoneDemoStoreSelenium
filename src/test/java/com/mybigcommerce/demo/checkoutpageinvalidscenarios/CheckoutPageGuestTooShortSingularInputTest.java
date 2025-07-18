package com.mybigcommerce.demo.checkoutpageinvalidscenarios;

import com.mybigcommerce.demo.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class CheckoutPageGuestTooShortSingularInputTest extends TestMethods {

    //too short singular input

    //Test 029u -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too short guest email (1 char -> name, domain) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Most Popular Product Addition To Checkout Test (as a guest) - Too Short Email")
    @Tag("Invalid_Single_Most_Popular_Product_Checkout_Confirmation")
    @Tag("Too_Short_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleMostPopularProductCheckoutConfirmationTooShortGuestEmailTest() {
        //single most popular product ("Tiered Wire Basket") addition to cart test method (as a guest)
        addSingleMostPopularProductToCartGuestTest();
        //single most popular product ("Tiered Wire Basket") addition to check out test method (as a guest)
        addProductToCheckoutTest();
        //invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too short guest email (1 char -> name, domain)
        invalidGuestProductOrderCheckoutTooShortGuestEmailTest();
    }

    //Test 029v -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too short guest shipping first name (1 char) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Most Popular Product Addition To Checkout Test (as a guest) - Too Short Shipping First Name")
    @Tag("Invalid_Single_Most_Popular_Product_Checkout_Confirmation")
    @Tag("Too_Short_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleMostPopularProductCheckoutConfirmationTooShortGuestShipFirstNameTest() {
        //single most popular product ("Tiered Wire Basket") addition to cart test method (as a guest)
        addSingleMostPopularProductToCartGuestTest();
        //single most popular product ("Tiered Wire Basket") addition to check out test method (as a guest)
        addProductToCheckoutTest();
        //invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too short guest shipping first name (1 char)
        invalidGuestProductOrderCheckoutTooShortGuestShipFirstNameTest();

    }

    //Test 029w -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too short guest shipping last name (1 char) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Most Popular Product Addition To Checkout Test (as a guest) - Too Short Shipping Last Name")
    @Tag("Invalid_Single_Most_Popular_Product_Checkout_Confirmation")
    @Tag("Too_Short_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleMostPopularProductCheckoutConfirmationTooShortGuestShipLastNameTest() {
        //single most popular product ("Tiered Wire Basket") addition to cart test method (as a guest)
        addSingleMostPopularProductToCartGuestTest();
        //single most popular product ("Tiered Wire Basket") addition to check out test method (as a guest)
        addProductToCheckoutTest();
        //invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too short guest shipping last name (1 char)
        invalidGuestProductOrderCheckoutTooShortGuestShipLastNameTest();
    }

    //Test 029x -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too short guest shipping address (3 chars) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Most Popular Product Addition To Checkout Test (as a guest) - Too Short Shipping Address")
    @Tag("Invalid_Single_Most_Popular_Product_Checkout_Confirmation")
    @Tag("Too_Short_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleMostPopularProductCheckoutConfirmationTooShortGuestShipAddressTest() {
        //single most popular product ("Tiered Wire Basket") addition to cart test method (as a guest)
        addSingleMostPopularProductToCartGuestTest();
        //single most popular product ("Tiered Wire Basket") addition to check out test method (as a guest)
        addProductToCheckoutTest();
        //invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too short guest shipping address (3 chars)
        invalidGuestProductOrderCheckoutTooShortGuestShipAddressTest();
    }

    //Test 029y -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too short guest shipping city (1 char) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Most Popular Product Addition To Checkout Test (as a guest) - Too Short Shipping City")
    @Tag("Invalid_Single_Most_Popular_Product_Checkout_Confirmation")
    @Tag("Too_Short_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleMostPopularProductCheckoutConfirmationTooShortGuestShipCityTest() {
        //single most popular product ("Tiered Wire Basket") addition to cart test method (as a guest)
        addSingleMostPopularProductToCartGuestTest();
        //single most popular product ("Tiered Wire Basket") addition to check out test method (as a guest)
        addProductToCheckoutTest();
        //invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too short guest shipping city (1 char)
        invalidGuestProductOrderCheckoutTooShortGuestShipCityTest();
    }

    //Test 029z -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too short guest shipping post code (4 digits) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Most Popular Product Addition To Checkout Test (as a guest) - Too Short Shipping Post Code")
    @Tag("Invalid_Single_Most_Popular_Product_Checkout_Confirmation")
    @Tag("Too_Short_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleMostPopularProductCheckoutConfirmationTooShortGuestShipPostCodeTest() {
        //single most popular product ("Tiered Wire Basket") addition to cart test method (as a guest)
        addSingleMostPopularProductToCartGuestTest();
        //single most popular product ("Tiered Wire Basket") addition to check out test method (as a guest)
        addProductToCheckoutTest();
        //invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too short guest shipping post code (4 digits)
        invalidGuestProductOrderCheckoutTooShortGuestShipPostCodeTest();
    }

    //Test 029aa -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too short guest shipping phone (2 digits) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Most Popular Product Addition To Checkout Test (as a guest) - Too Short Shipping Phone")
    @Tag("Invalid_Single_Most_Popular_Product_Checkout_Confirmation")
    @Tag("Too_Short_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleMostPopularProductCheckoutConfirmationTooShortGuestShipPhoneTest() {
        //single most popular product ("Tiered Wire Basket") addition to cart test method (as a guest)
        addSingleMostPopularProductToCartGuestTest();
        //single most popular product ("Tiered Wire Basket") addition to check out test method (as a guest)
        addProductToCheckoutTest();
        //invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too short guest shipping phone (2 digits)
        invalidGuestProductOrderCheckoutTooShortGuestShipPhoneTest();
    }

    //Test 029ab -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too short guest billing first name (1 char) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Most Popular Product Addition To Checkout Test (as a guest) - Too Short Billing First Name")
    @Tag("Invalid_Single_Most_Popular_Product_Checkout_Confirmation")
    @Tag("Too_Short_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleMostPopularProductCheckoutConfirmationTooShortGuestBillFirstNameTest() {
        //single most popular product ("Tiered Wire Basket") addition to cart test method (as a guest)
        addSingleMostPopularProductToCartGuestTest();
        //single most popular product ("Tiered Wire Basket") addition to check out test method (as a guest)
        addProductToCheckoutTest();
        //invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too short guest billing first name (1 char)
        invalidGuestProductOrderCheckoutTooShortBillGuestFirstNameTest();
    }

    //Test 029ac -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too short guest billing last name (1 char) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Most Popular Product Addition To Checkout Test (as a guest) - Too Short Billing Last Name")
    @Tag("Invalid_Single_Most_Popular_Product_Checkout_Confirmation")
    @Tag("Too_Short_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleMostPopularProductCheckoutConfirmationTooShortGuestBillLastNameTest() {
        //single most popular product ("Tiered Wire Basket") addition to cart test method (as a guest)
        addSingleMostPopularProductToCartGuestTest();
        //single most popular product ("Tiered Wire Basket") addition to check out test method (as a guest)
        addProductToCheckoutTest();
        //invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too short guest billing last name (1 char)
        invalidGuestProductOrderCheckoutTooShortBillGuestLastNameTest();
    }

    //Test 029ad -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too short guest billing address (3 chars) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Most Popular Product Addition To Checkout Test (as a guest) - Too Short Billing Address")
    @Tag("Invalid_Single_Most_Popular_Product_Checkout_Confirmation")
    @Tag("Too_Short_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleMostPopularProductCheckoutConfirmationTooShortGuestBillAddressTest() {
        //single most popular product ("Tiered Wire Basket") addition to cart test method (as a guest)
        addSingleMostPopularProductToCartGuestTest();
        //single most popular product ("Tiered Wire Basket") addition to check out test method (as a guest)
        addProductToCheckoutTest();
        //invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too short guest billing address (3 chars)
        invalidGuestProductOrderCheckoutTooShortBillGuestAddressTest();
    }

    //Test 029ae -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too short guest billing city (1 char) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Most Popular Product Addition To Checkout Test (as a guest) - Too Short Billing City")
    @Tag("Invalid_Single_Most_Popular_Product_Checkout_Confirmation")
    @Tag("Too_Short_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleMostPopularProductCheckoutConfirmationTooShortGuestBillCityTest() {
        //single most popular product ("Tiered Wire Basket") addition to cart test method (as a guest)
        addSingleMostPopularProductToCartGuestTest();
        //single most popular product ("Tiered Wire Basket") addition to check out test method (as a guest)
        addProductToCheckoutTest();
        //invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too short guest billing city (1 char)
        invalidGuestProductOrderCheckoutTooShortBillGuestCityTest();
    }

    //Test 029af -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too short guest billing post code (4 digits) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Most Popular Product Addition To Checkout Test (as a guest) - Too Short Billing Post Code")
    @Tag("Invalid_Single_Most_Popular_Product_Checkout_Confirmation")
    @Tag("Too_Short_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleMostPopularProductCheckoutConfirmationTooShortGuestBillPostCodeTest() {
        //single most popular product ("Tiered Wire Basket") addition to cart test method (as a guest)
        addSingleMostPopularProductToCartGuestTest();
        //single most popular product ("Tiered Wire Basket") addition to check out test method (as a guest)
        addProductToCheckoutTest();
        //invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too short guest billing post code (4 digits)
        invalidGuestProductOrderCheckoutTooShortBillGuestPostCodeTest();
    }

    //Test 029ag -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too short guest billing phone (4 digits) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Most Popular Product Addition To Checkout Test (as a guest) - Too Short Billing Phone")
    @Tag("Invalid_Single_Most_Popular_Product_Checkout_Confirmation")
    @Tag("Too_Short_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleMostPopularProductCheckoutConfirmationTooShortGuestBillPhoneTest() {
        //single most popular product ("Tiered Wire Basket") addition to cart test method (as a guest)
        addSingleMostPopularProductToCartGuestTest();
        //single most popular product ("Tiered Wire Basket") addition to check out test method (as a guest)
        addProductToCheckoutTest();
        //invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too short guest billing phone (4 digits)
        invalidGuestProductOrderCheckoutTooShortBillGuestPhoneTest();
    }

    //Test 029ah -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too short guest credit card number (15 digits)
    @Test
    @DisplayName("Invalid Single Most Popular Product Addition To Checkout Test (as a guest) - Too Short Credit Card Number")
    @Tag("Invalid_Single_Most_Popular_Product_Checkout_Confirmation")
    @Tag("Too_Short_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleMostPopularProductCheckoutConfirmationTooShortGuestCredCardNumTest() {
        //single most popular product ("Tiered Wire Basket") addition to cart test method (as a guest)
        addSingleMostPopularProductToCartGuestTest();
        //single most popular product ("Tiered Wire Basket") addition to check out test method (as a guest)
        addProductToCheckoutTest();
        //invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too short guest credit card number (15 digits)
        invalidGuestProductOrderCheckoutTooShortPayGuestCredCardNumberTest();
    }

    //Test 029ai -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too short guest credit card expiration date (3 digits)
    @Test
    @DisplayName("Invalid Single Most Popular Product Addition To Checkout Test (as a guest) - Too Short Credit Card Expiration Date")
    @Tag("Invalid_Single_Most_Popular_Product_Checkout_Confirmation")
    @Tag("Too_Short_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleMostPopularProductCheckoutConfirmationTooShortGuestCredCardExpDateTest() {
        //single most popular product ("Tiered Wire Basket") addition to cart test method (as a guest)
        addSingleMostPopularProductToCartGuestTest();
        //single most popular product ("Tiered Wire Basket") addition to check out test method (as a guest)
        addProductToCheckoutTest();
        //invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too short guest credit card expiration date (3 digits)
        invalidGuestProductOrderCheckoutTooShortPayGuestCredCardExpDateTest();
    }

    //Test 029aj -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too short guest credit card name (1 char)
    @Test
    @DisplayName("Invalid Single Most Popular Product Addition To Checkout Test (as a guest) - Too Short Credit Card Name")
    @Tag("Invalid_Single_Most_Popular_Product_Checkout_Confirmation")
    @Tag("Too_Short_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleMostPopularProductCheckoutConfirmationTooShortGuestCredCardNameTest() {
        //single most popular product ("Tiered Wire Basket") addition to cart test method (as a guest)
        addSingleMostPopularProductToCartGuestTest();
        //single most popular product ("Tiered Wire Basket") addition to check out test method (as a guest)
        addProductToCheckoutTest();
        //invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too short guest credit card name (1 char)
        invalidGuestProductOrderCheckoutTooShortPayGuestCredCardNameTest();
    }

    //Test 029ak -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too short guest credit card CVV number (2 digits)
    @Test
    @DisplayName("Invalid Single Most Popular Product Addition To Checkout Test (as a guest) - Too Short Credit Card CVV Number")
    @Tag("Invalid_Single_Most_Popular_Product_Checkout_Confirmation")
    @Tag("Too_Short_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleMostPopularProductCheckoutConfirmationTooShortGuestCredCardCVVTest() {
        //single most popular product ("Tiered Wire Basket") addition to cart test method (as a guest)
        addSingleMostPopularProductToCartGuestTest();
        //single most popular product ("Tiered Wire Basket") addition to check out test method (as a guest)
        addProductToCheckoutTest();
        //invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - too short guest credit card CVV number (2 digits)
        invalidGuestProductOrderCheckoutTooShortPayGuestCredCardCVVTest();
    }

}