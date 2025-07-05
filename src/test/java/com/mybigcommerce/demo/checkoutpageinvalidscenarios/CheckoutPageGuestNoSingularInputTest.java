package com.mybigcommerce.demo.checkoutpageinvalidscenarios;

import com.mybigcommerce.demo.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class CheckoutPageGuestNoSingularInputTest extends TestMethods{

    //invalid guest checkout tests

    //no singular input

    //Test 029 -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - no guest email
    @Test
    @DisplayName("Invalid Single Most Popular Product Addition To Checkout Test (as a guest) - No Email")
    @Tag("Invalid_Single_Most_Popular_Product_Checkout_Confirmation")
    @Tag("No_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleMostPopularProductCheckoutConfirmationNoGuestEmailTest() {
        //single most popular product ("Tiered Wire Basket") addition to cart test method (as a guest)
        addSingleMostPopularProductToCartGuestTest();
        //single most popular product ("Tiered Wire Basket") addition to check out test method (as a guest)
        addProductToCheckoutTest();
        //invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - no guest email
        invalidGuestProductOrderCheckoutNoGuestEmailTest();
    }

    //Test 029a -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - no guest shipping country
    @Test
    @DisplayName("Invalid Single Most Popular Product Addition To Checkout Test (as a guest) - No Shipping Country")
    @Tag("Invalid_Single_Most_Popular_Product_Checkout_Confirmation")
    @Tag("No_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleMostPopularProductCheckoutConfirmationNoGuestShipCountryTest() {
        //single most popular product ("Tiered Wire Basket") addition to cart test method (as a guest)
        addSingleMostPopularProductToCartGuestTest();
        //single most popular product ("Tiered Wire Basket") addition to check out test method (as a guest)
        addProductToCheckoutTest();
        //invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - no guest shipping country
        invalidGuestProductOrderCheckoutNoGuestCountryTest();
    }

    //Test 029b -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - no guest shipping first name
    @Test
    @DisplayName("Invalid Single Most Popular Product Addition To Checkout Test (as a guest) - No Shipping First Name")
    @Tag("Invalid_Single_Most_Popular_Product_Checkout_Confirmation")
    @Tag("No_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleMostPopularProductCheckoutConfirmationNoGuestShipFirstNameTest() {
        //single most popular product ("Tiered Wire Basket") addition to cart test method (as a guest)
        addSingleMostPopularProductToCartGuestTest();
        //single most popular product ("Tiered Wire Basket") addition to check out test method (as a guest)
        addProductToCheckoutTest();
        //invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - no guest shipping first name
        invalidGuestProductOrderCheckoutNoGuestFirstNameTest();
    }

    //Test 029c -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - no guest shipping last name
    @Test
    @DisplayName("Invalid Single Most Popular Product Addition To Checkout Test (as a guest) - No Shipping Last Name")
    @Tag("Invalid_Single_Most_Popular_Product_Checkout_Confirmation")
    @Tag("No_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleMostPopularProductCheckoutConfirmationNoGuestShipLastNameTest() {
        //single most popular product ("Tiered Wire Basket") addition to cart test method (as a guest)
        addSingleMostPopularProductToCartGuestTest();
        //single most popular product ("Tiered Wire Basket") addition to check out test method (as a guest)
        addProductToCheckoutTest();
        //invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - no guest shipping last name
        invalidGuestProductOrderCheckoutNoGuestLastNameTest();
    }

    //Test 029d -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - no guest shipping address
    @Test
    @DisplayName("Invalid Single Most Popular Product Addition To Checkout Test (as a guest) - No Shipping Address")
    @Tag("Invalid_Single_Most_Popular_Product_Checkout_Confirmation")
    @Tag("No_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleMostPopularProductCheckoutConfirmationNoGuestShipAddressTest() {
        //single most popular product ("Tiered Wire Basket") addition to cart test method (as a guest)
        addSingleMostPopularProductToCartGuestTest();
        //single most popular product ("Tiered Wire Basket") addition to check out test method (as a guest)
        addProductToCheckoutTest();
        //invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - no guest shipping address
        invalidGuestProductOrderCheckoutNoGuestAddressTest();
    }

    //Test 029e -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - no guest shipping city (the error wasn't triggered, test has failed (during manual testing, it does get triggered))
    @Test
    @DisplayName("Invalid Single Most Popular Product Addition To Checkout Test (as a guest) - No Shipping City")
    @Tag("Invalid_Single_Most_Popular_Product_Checkout_Confirmation")
    @Tag("No_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleMostPopularProductCheckoutConfirmationNoGuestShipCityTest() {
        //single most popular product ("Tiered Wire Basket") addition to cart test method (as a guest)
        addSingleMostPopularProductToCartGuestTest();
        //single most popular product ("Tiered Wire Basket") addition to check out test method (as a guest)
        addProductToCheckoutTest();
        //invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - no guest shipping city
        invalidGuestProductOrderCheckoutNoGuestCityTest();
    }

    //Test 029f -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - no guest shipping post code (the error wasn't triggered, test has failed (during manual testing, it does get triggered))
    @Test
    @DisplayName("Invalid Single Most Popular Product Addition To Checkout Test (as a guest) - No Shipping Post Code")
    @Tag("Invalid_Single_Most_Popular_Product_Checkout_Confirmation")
    @Tag("No_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleMostPopularProductCheckoutConfirmationNoGuestShipPostCodeTest() {
        //single most popular product ("Tiered Wire Basket") addition to cart test method (as a guest)
        addSingleMostPopularProductToCartGuestTest();
        //single most popular product ("Tiered Wire Basket") addition to check out test method (as a guest)
        addProductToCheckoutTest();
        //invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - no guest shipping post code
        invalidGuestProductOrderCheckoutNoGuestPostCodeTest();
    }

    //Test 029g -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - no guest shipping phone
    @Test
    @DisplayName("Invalid Single Most Popular Product Addition To Checkout Test (as a guest) - No Shipping Phone")
    @Tag("Invalid_Single_Most_Popular_Product_Checkout_Confirmation")
    @Tag("No_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleMostPopularProductCheckoutConfirmationNoGuestShipPhoneTest() {
        //single most popular product ("Tiered Wire Basket") addition to cart test method (as a guest)
        addSingleMostPopularProductToCartGuestTest();
        //single most popular product ("Tiered Wire Basket") addition to check out test method (as a guest)
        addProductToCheckoutTest();
        //invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - no guest shipping phone
        invalidGuestProductOrderCheckoutNoGuestPhoneTest();
    }

    //Test 029h -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - no guest shipping state (the "Select state" option fails to be selected, test has failed)
    @Test
    @DisplayName("Invalid Single Most Popular Product Addition To Checkout Test (as a guest) - No Shipping State")
    @Tag("Invalid_Single_Most_Popular_Product_Checkout_Confirmation")
    @Tag("No_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleMostPopularProductCheckoutConfirmationNoGuestShipStateTest() {
        //single most popular product ("Tiered Wire Basket") addition to cart test method (as a guest)
        addSingleMostPopularProductToCartGuestTest();
        //single most popular product ("Tiered Wire Basket") addition to check out test method (as a guest)
        addProductToCheckoutTest();
        //invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - no guest shipping state
        invalidGuestProductOrderCheckoutNoGuestStateTest();
    }

    //Test 029i -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - no guest billing country
    @Test
    @DisplayName("Invalid Single Most Popular Product Addition To Checkout Test (as a guest) - No Billing Country")
    @Tag("Invalid_Single_Most_Popular_Product_Checkout_Confirmation")
    @Tag("No_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleMostPopularProductCheckoutConfirmationNoGuestBillCountryTest() {
        //single most popular product ("Tiered Wire Basket") addition to cart test method (as a guest)
        addSingleMostPopularProductToCartGuestTest();
        //single most popular product ("Tiered Wire Basket") addition to check out test method (as a guest)
        addProductToCheckoutTest();
        //invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - no guest billing country
        invalidGuestProductOrderCheckoutNoBillGuestCountryTest();
    }

    //Test 029j -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - no guest billing first name
    @Test
    @DisplayName("Invalid Single Most Popular Product Addition To Checkout Test (as a guest) - No Billing First Name")
    @Tag("Invalid_Single_Most_Popular_Product_Checkout_Confirmation")
    @Tag("No_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleMostPopularProductCheckoutConfirmationNoGuestBillFirstNameTest() {
        //single most popular product ("Tiered Wire Basket") addition to cart test method (as a guest)
        addSingleMostPopularProductToCartGuestTest();
        //single most popular product ("Tiered Wire Basket") addition to check out test method (as a guest)
        addProductToCheckoutTest();
        //invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - no guest billing first name
        invalidGuestProductOrderCheckoutNoBillGuestFirstNameTest();
    }

    //Test 029k -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - no guest billing last name
    @Test
    @DisplayName("Invalid Single Most Popular Product Addition To Checkout Test (as a guest) - No Billing Last Name")
    @Tag("Invalid_Single_Most_Popular_Product_Checkout_Confirmation")
    @Tag("No_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleMostPopularProductCheckoutConfirmationNoGuestBillLastNameTest() {
        //single most popular product ("Tiered Wire Basket") addition to cart test method (as a guest)
        addSingleMostPopularProductToCartGuestTest();
        //single most popular product ("Tiered Wire Basket") addition to check out test method (as a guest)
        addProductToCheckoutTest();
        //invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - no guest billing last name
        invalidGuestProductOrderCheckoutNoBillGuestLastNameTest();
    }

    //Test 029l -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - no guest billing address
    @Test
    @DisplayName("Invalid Single Most Popular Product Addition To Checkout Test (as a guest) - No Billing Address")
    @Tag("Invalid_Single_Most_Popular_Product_Checkout_Confirmation")
    @Tag("No_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleMostPopularProductCheckoutConfirmationNoGuestBillAddressTest() {
        //single most popular product ("Tiered Wire Basket") addition to cart test method (as a guest)
        addSingleMostPopularProductToCartGuestTest();
        //single most popular product ("Tiered Wire Basket") addition to check out test method (as a guest)
        addProductToCheckoutTest();
        //invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - no guest billing address
        invalidGuestProductOrderCheckoutNoBillGuestAddressTest();
    }

    //Test 029m -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - no guest billing city (the error wasn't triggered, test has failed(the error gets triggered during manual testing))
    @Test
    @DisplayName("Invalid Single Most Popular Product Addition To Checkout Test (as a guest) - No Billing City")
    @Tag("Invalid_Single_Most_Popular_Product_Checkout_Confirmation")
    @Tag("No_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleMostPopularProductCheckoutConfirmationNoGuestBillCityTest() {
        //single most popular product ("Tiered Wire Basket") addition to cart test method (as a guest)
        addSingleMostPopularProductToCartGuestTest();
        //single most popular product ("Tiered Wire Basket") addition to check out test method (as a guest)
        addProductToCheckoutTest();
        //invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - no guest billing city
        invalidGuestProductOrderCheckoutNoBillGuestCityTest();
    }

    //Test 029n -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - no guest billing post code (the error wasn't triggered, test has failed(the error gets triggered during manual testing))
    @Test
    @DisplayName("Invalid Single Most Popular Product Addition To Checkout Test (as a guest) - No Billing Post Code")
    @Tag("Invalid_Single_Most_Popular_Product_Checkout_Confirmation")
    @Tag("No_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleMostPopularProductCheckoutConfirmationNoGuestBillPostCodeTest() {
        //single most popular product ("Tiered Wire Basket") addition to cart test method (as a guest)
        addSingleMostPopularProductToCartGuestTest();
        //single most popular product ("Tiered Wire Basket") addition to check out test method (as a guest)
        addProductToCheckoutTest();
        //invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - no guest billing post code
        invalidGuestProductOrderCheckoutNoBillGuestPostCodeTest();
    }

    //Test 029o -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - no guest billing phone
    @Test
    @DisplayName("Invalid Single Most Popular Product Addition To Checkout Test (as a guest) - No Billing Phone")
    @Tag("Invalid_Single_Most_Popular_Product_Checkout_Confirmation")
    @Tag("No_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleMostPopularProductCheckoutConfirmationNoGuestBillPhoneTest() {
        //single most popular product ("Tiered Wire Basket") addition to cart test method (as a guest)
        addSingleMostPopularProductToCartGuestTest();
        //single most popular product ("Tiered Wire Basket") addition to check out test method (as a guest)
        addProductToCheckoutTest();
        //invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - no guest billing phone
        invalidGuestProductOrderCheckoutNoBillGuestPhoneTest();
    }

    //Test 029p -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - no guest billing state
    @Test
    @DisplayName("Invalid Single Most Popular Product Addition To Checkout Test (as a guest) - No Billing State")
    @Tag("Invalid_Single_Most_Popular_Product_Checkout_Confirmation")
    @Tag("No_Singular_Input")
    @Tag("Test_As_A_Guest")
    void invalidSingleMostPopularProductCheckoutConfirmationNoGuestBillStateTest() {
        //single most popular product ("Tiered Wire Basket") addition to cart test method (as a guest)
        addSingleMostPopularProductToCartGuestTest();
        //single most popular product ("Tiered Wire Basket") addition to check out test method (as a guest)
        addProductToCheckoutTest();
        //invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - no guest billing state
        invalidGuestProductOrderCheckoutNoBillGuestStateTest();
    }

}
