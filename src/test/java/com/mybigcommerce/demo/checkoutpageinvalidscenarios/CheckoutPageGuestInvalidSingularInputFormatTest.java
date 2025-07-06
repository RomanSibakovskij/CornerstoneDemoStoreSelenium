package com.mybigcommerce.demo.checkoutpageinvalidscenarios;

import com.mybigcommerce.demo.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class CheckoutPageGuestInvalidSingularInputFormatTest extends TestMethods{

    //invalid singular input format

    //Test 029aac -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - invalid guest email format (missing '@')
    @Test
    @DisplayName("Invalid Single Most Popular Product Addition To Checkout Test (as a guest) - Invalid Email Format")
    @Tag("Invalid_Single_Most_Popular_Product_Checkout_Confirmation")
    @Tag("Invalid_Singular_Input_Format")
    @Tag("Test_As_A_Guest")
    void invalidSingleMostPopularProductCheckoutConfirmationInvalidGuestEmailFormatTest() {
        //single most popular product ("Tiered Wire Basket") addition to cart test method (as a guest)
        addSingleMostPopularProductToCartGuestTest();
        //single most popular product ("Tiered Wire Basket") addition to check out test method (as a guest)
        addProductToCheckoutTest();
        //invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - invalid guest email format (missing '@')
        invalidGuestProductOrderCheckoutInvalidGuestEmailFormatTest();
    }

    //Test 029aad -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - invalid guest shipping first name format (special symbols only) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Most Popular Product Addition To Checkout Test (as a guest) - Invalid Shipping First Name Format")
    @Tag("Invalid_Single_Most_Popular_Product_Checkout_Confirmation")
    @Tag("Invalid_Singular_Input_Format")
    @Tag("Test_As_A_Guest")
    void invalidSingleMostPopularProductCheckoutConfirmationInvalidGuestShipFirstNameFormatTest() {
        //single most popular product ("Tiered Wire Basket") addition to cart test method (as a guest)
        addSingleMostPopularProductToCartGuestTest();
        //single most popular product ("Tiered Wire Basket") addition to check out test method (as a guest)
        addProductToCheckoutTest();
        //invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - invalid guest shipping first name format (special symbols only)
        invalidGuestProductOrderCheckoutInvalidGuestShipFirstNameFormatTest();
    }

    //Test 029aae -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - invalid guest shipping last name format (special symbols only) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Most Popular Product Addition To Checkout Test (as a guest) - Invalid Shipping Last Name Format")
    @Tag("Invalid_Single_Most_Popular_Product_Checkout_Confirmation")
    @Tag("Invalid_Singular_Input_Format")
    @Tag("Test_As_A_Guest")
    void invalidSingleMostPopularProductCheckoutConfirmationInvalidGuestShipLastNameFormatTest() {
        //single most popular product ("Tiered Wire Basket") addition to cart test method (as a guest)
        addSingleMostPopularProductToCartGuestTest();
        //single most popular product ("Tiered Wire Basket") addition to check out test method (as a guest)
        addProductToCheckoutTest();
        //invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - invalid guest shipping last name format (special symbols only)
        invalidGuestProductOrderCheckoutInvalidGuestShipLastNameFormatTest();
    }

    //Test 029aaf -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - invalid guest shipping address format (special symbols only) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Most Popular Product Addition To Checkout Test (as a guest) - Invalid Shipping Address Format")
    @Tag("Invalid_Single_Most_Popular_Product_Checkout_Confirmation")
    @Tag("Invalid_Singular_Input_Format")
    @Tag("Test_As_A_Guest")
    void invalidSingleMostPopularProductCheckoutConfirmationInvalidGuestShipAddressFormatTest() {
        //single most popular product ("Tiered Wire Basket") addition to cart test method (as a guest)
        addSingleMostPopularProductToCartGuestTest();
        //single most popular product ("Tiered Wire Basket") addition to check out test method (as a guest)
        addProductToCheckoutTest();
        //invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - invalid guest shipping address format (special symbols only)
        invalidGuestProductOrderCheckoutInvalidGuestShipAddressFormatTest();
    }

    //Test 029aag -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - invalid guest shipping city format (special symbols only) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Most Popular Product Addition To Checkout Test (as a guest) - Invalid Shipping City Format")
    @Tag("Invalid_Single_Most_Popular_Product_Checkout_Confirmation")
    @Tag("Invalid_Singular_Input_Format")
    @Tag("Test_As_A_Guest")
    void invalidSingleMostPopularProductCheckoutConfirmationInvalidGuestShipCityFormatTest() {
        //single most popular product ("Tiered Wire Basket") addition to cart test method (as a guest)
        addSingleMostPopularProductToCartGuestTest();
        //single most popular product ("Tiered Wire Basket") addition to check out test method (as a guest)
        addProductToCheckoutTest();
        //invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - invalid guest shipping city format (special symbols only)
        invalidGuestProductOrderCheckoutInvalidGuestShipCityFormatTest();
    }

    //Test 029aah -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - invalid guest shipping post code format (special symbols only) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Most Popular Product Addition To Checkout Test (as a guest) - Invalid Shipping Post Code Format")
    @Tag("Invalid_Single_Most_Popular_Product_Checkout_Confirmation")
    @Tag("Invalid_Singular_Input_Format")
    @Tag("Test_As_A_Guest")
    void invalidSingleMostPopularProductCheckoutConfirmationInvalidGuestShipPostCodeFormatTest() {
        //single most popular product ("Tiered Wire Basket") addition to cart test method (as a guest)
        addSingleMostPopularProductToCartGuestTest();
        //single most popular product ("Tiered Wire Basket") addition to check out test method (as a guest)
        addProductToCheckoutTest();
        //invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - invalid guest shipping post code format (special symbols only)
        invalidGuestProductOrderCheckoutInvalidGuestShipPostCodeFormatTest();
    }

    //Test 029aai -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - invalid guest shipping phone format (special symbols only) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Most Popular Product Addition To Checkout Test (as a guest) - Invalid Shipping Phone Format")
    @Tag("Invalid_Single_Most_Popular_Product_Checkout_Confirmation")
    @Tag("Invalid_Singular_Input_Format")
    @Tag("Test_As_A_Guest")
    void invalidSingleMostPopularProductCheckoutConfirmationInvalidGuestShipPhoneFormatTest() {
        //single most popular product ("Tiered Wire Basket") addition to cart test method (as a guest)
        addSingleMostPopularProductToCartGuestTest();
        //single most popular product ("Tiered Wire Basket") addition to check out test method (as a guest)
        addProductToCheckoutTest();
        //invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - invalid guest shipping phone format (special symbols only)
        invalidGuestProductOrderCheckoutInvalidGuestShipPhoneFormatTest();
    }

    //Test 029aaj -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - invalid guest billing first name format (special symbols only) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Most Popular Product Addition To Checkout Test (as a guest) - Invalid Billing First Name Format")
    @Tag("Invalid_Single_Most_Popular_Product_Checkout_Confirmation")
    @Tag("Invalid_Singular_Input_Format")
    @Tag("Test_As_A_Guest")
    void invalidSingleMostPopularProductCheckoutConfirmationInvalidGuestBillFirstNameFormatTest() {
        //single most popular product ("Tiered Wire Basket") addition to cart test method (as a guest)
        addSingleMostPopularProductToCartGuestTest();
        //single most popular product ("Tiered Wire Basket") addition to check out test method (as a guest)
        addProductToCheckoutTest();
        //invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - invalid guest billing first name format (special symbols only)
        invalidGuestProductOrderCheckoutInvalidBillGuestFirstNameFormatTest();
    }

    //Test 029aak -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - invalid guest billing last name format (special symbols only) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Most Popular Product Addition To Checkout Test (as a guest) - Invalid Billing Last Name Format")
    @Tag("Invalid_Single_Most_Popular_Product_Checkout_Confirmation")
    @Tag("Invalid_Singular_Input_Format")
    @Tag("Test_As_A_Guest")
    void invalidSingleMostPopularProductCheckoutConfirmationInvalidGuestBillLastNameFormatTest() {
        //single most popular product ("Tiered Wire Basket") addition to cart test method (as a guest)
        addSingleMostPopularProductToCartGuestTest();
        //single most popular product ("Tiered Wire Basket") addition to check out test method (as a guest)
        addProductToCheckoutTest();
        //invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - invalid guest billing last name format (special symbols only)
        invalidGuestProductOrderCheckoutInvalidBillGuestLastNameFormatTest();
    }

    //Test 029aal -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - invalid guest billing address format (special symbols only) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Most Popular Product Addition To Checkout Test (as a guest) - Invalid Billing Address Format")
    @Tag("Invalid_Single_Most_Popular_Product_Checkout_Confirmation")
    @Tag("Invalid_Singular_Input_Format")
    @Tag("Test_As_A_Guest")
    void invalidSingleMostPopularProductCheckoutConfirmationInvalidGuestBillAddressFormatTest() {
        //single most popular product ("Tiered Wire Basket") addition to cart test method (as a guest)
        addSingleMostPopularProductToCartGuestTest();
        //single most popular product ("Tiered Wire Basket") addition to check out test method (as a guest)
        addProductToCheckoutTest();
        //invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - invalid guest billing address format (special symbols only)
        invalidGuestProductOrderCheckoutInvalidBillGuestAddressFormatTest();
    }

    //Test 029aam -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - invalid guest billing city format (special symbols only) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Most Popular Product Addition To Checkout Test (as a guest) - Invalid Billing City Format")
    @Tag("Invalid_Single_Most_Popular_Product_Checkout_Confirmation")
    @Tag("Invalid_Singular_Input_Format")
    @Tag("Test_As_A_Guest")
    void invalidSingleMostPopularProductCheckoutConfirmationInvalidGuestBillCityFormatTest() {
        //single most popular product ("Tiered Wire Basket") addition to cart test method (as a guest)
        addSingleMostPopularProductToCartGuestTest();
        //single most popular product ("Tiered Wire Basket") addition to check out test method (as a guest)
        addProductToCheckoutTest();
        //invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - invalid guest billing city format (special symbols only)
        invalidGuestProductOrderCheckoutInvalidBillGuestCityFormatTest();
    }

    //Test 029aan -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - invalid guest billing post code format (special symbols only) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Most Popular Product Addition To Checkout Test (as a guest) - Invalid Billing Post Code Format")
    @Tag("Invalid_Single_Most_Popular_Product_Checkout_Confirmation")
    @Tag("Invalid_Singular_Input_Format")
    @Tag("Test_As_A_Guest")
    void invalidSingleMostPopularProductCheckoutConfirmationInvalidGuestBillPostCodeFormatTest() {
        //single most popular product ("Tiered Wire Basket") addition to cart test method (as a guest)
        addSingleMostPopularProductToCartGuestTest();
        //single most popular product ("Tiered Wire Basket") addition to check out test method (as a guest)
        addProductToCheckoutTest();
        //invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - invalid guest billing post code format (special symbols only)
        invalidGuestProductOrderCheckoutInvalidBillGuestPostCodeFormatTest();
    }

    //Test 029aao -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - invalid guest billing phone format (special symbols only) (the error wasn't triggered, test has failed)
    @Test
    @DisplayName("Invalid Single Most Popular Product Addition To Checkout Test (as a guest) - Invalid Billing Phone Format")
    @Tag("Invalid_Single_Most_Popular_Product_Checkout_Confirmation")
    @Tag("Invalid_Singular_Input_Format")
    @Tag("Test_As_A_Guest")
    void invalidSingleMostPopularProductCheckoutConfirmationInvalidGuestBillPhoneFormatTest() {
        //single most popular product ("Tiered Wire Basket") addition to cart test method (as a guest)
        addSingleMostPopularProductToCartGuestTest();
        //single most popular product ("Tiered Wire Basket") addition to check out test method (as a guest)
        addProductToCheckoutTest();
        //invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - invalid guest billing phone format (special symbols only)
        invalidGuestProductOrderCheckoutInvalidBillGuestPhoneFormatTest();
    }

    //Test 029aap -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - invalid guest credit card number (any other than test number)
    @Test
    @DisplayName("Invalid Single Most Popular Product Addition To Checkout Test (as a guest) - Invalid Credit Card Number")
    @Tag("Invalid_Single_Most_Popular_Product_Checkout_Confirmation")
    @Tag("Invalid_Singular_Input_Format")
    @Tag("Test_As_A_Guest")
    void invalidSingleMostPopularProductCheckoutConfirmationInvalidGuestCredCardNumberTest() {
        //single most popular product ("Tiered Wire Basket") addition to cart test method (as a guest)
        addSingleMostPopularProductToCartGuestTest();
        //single most popular product ("Tiered Wire Basket") addition to check out test method (as a guest)
        addProductToCheckoutTest();
        //invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - invalid guest credit card number (any other than test number)
        invalidGuestProductOrderCheckoutInvalidPayGuestCredCardNumberTest();
    }

    //Test 029aaq -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - invalid guest credit card number format (chars only) (the input form doesn't allow strings input, test has passed)
    @Test
    @DisplayName("Invalid Single Most Popular Product Addition To Checkout Test (as a guest) - Invalid Credit Card Number Format")
    @Tag("Invalid_Single_Most_Popular_Product_Checkout_Confirmation")
    @Tag("Invalid_Singular_Input_Format")
    @Tag("Test_As_A_Guest")
    void invalidSingleMostPopularProductCheckoutConfirmationInvalidGuestCredCardNumberFormatTest() {
        //single most popular product ("Tiered Wire Basket") addition to cart test method (as a guest)
        addSingleMostPopularProductToCartGuestTest();
        //single most popular product ("Tiered Wire Basket") addition to check out test method (as a guest)
        addProductToCheckoutTest();
        //invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - invalid guest credit card number format (chars only)
        invalidGuestProductOrderCheckoutInvalidPayGuestCredCardNumberFormatTest();
    }

    //Test 029aar -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - invalid guest credit card expiration date format (chars only)
    @Test
    @DisplayName("Invalid Single Most Popular Product Addition To Checkout Test (as a guest) - Invalid Credit Card Exp Date Format")
    @Tag("Invalid_Single_Most_Popular_Product_Checkout_Confirmation")
    @Tag("Invalid_Singular_Input_Format")
    @Tag("Test_As_A_Guest")
    void invalidSingleMostPopularProductCheckoutConfirmationInvalidGuestCredCardExpDateFormatTest() {
        //single most popular product ("Tiered Wire Basket") addition to cart test method (as a guest)
        addSingleMostPopularProductToCartGuestTest();
        //single most popular product ("Tiered Wire Basket") addition to check out test method (as a guest)
        addProductToCheckoutTest();
        //invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - invalid guest credit card expiration date format (chars only)
        invalidGuestProductOrderCheckoutInvalidPayGuestCredCardExpDateFormatTest();
    }

    //Test 029aas -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - reversed guest credit card expiration date
    @Test
    @DisplayName("Invalid Single Most Popular Product Addition To Checkout Test (as a guest) - Reversed Credit Card Exp Date")
    @Tag("Invalid_Single_Most_Popular_Product_Checkout_Confirmation")
    @Tag("Invalid_Singular_Input_Format")
    @Tag("Test_As_A_Guest")
    void invalidSingleMostPopularProductCheckoutConfirmationReversedGuestCredCardExpDateTest() {
        //single most popular product ("Tiered Wire Basket") addition to cart test method (as a guest)
        addSingleMostPopularProductToCartGuestTest();
        //single most popular product ("Tiered Wire Basket") addition to check out test method (as a guest)
        addProductToCheckoutTest();
        //invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - reversed guest credit card expiration date
        invalidGuestProductOrderCheckoutReversedPayGuestCredCardExpDateFormatTest();
    }

    //Test 029aat -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - invalid guest credit card name format (special symbols only) (the error doesn't get triggered , test has failed)
    @Test
    @DisplayName("Invalid Single Most Popular Product Addition To Checkout Test (as a guest) - Invalid Credit Card Name Format")
    @Tag("Invalid_Single_Most_Popular_Product_Checkout_Confirmation")
    @Tag("Invalid_Singular_Input_Format")
    @Tag("Test_As_A_Guest")
    void invalidSingleMostPopularProductCheckoutConfirmationInvalidGuestCredCardNameFormatTest() {
        //single most popular product ("Tiered Wire Basket") addition to cart test method (as a guest)
        addSingleMostPopularProductToCartGuestTest();
        //single most popular product ("Tiered Wire Basket") addition to check out test method (as a guest)
        addProductToCheckoutTest();
        //invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - invalid guest credit card name format (special symbols only)
        invalidGuestProductOrderCheckoutInvalidPayGuestCredCardNameFormatTest();
    }

    //Test 029aau -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - invalid guest credit card CVV number format (chars only) (the error doesn't get triggered , test has failed)
    @Test
    @DisplayName("Invalid Single Most Popular Product Addition To Checkout Test (as a guest) - Invalid Credit Card CVV Number Format")
    @Tag("Invalid_Single_Most_Popular_Product_Checkout_Confirmation")
    @Tag("Invalid_Singular_Input_Format")
    @Tag("Test_As_A_Guest")
    void invalidSingleMostPopularProductCheckoutConfirmationInvalidGuestCVVFormatTest() {
        //single most popular product ("Tiered Wire Basket") addition to cart test method (as a guest)
        addSingleMostPopularProductToCartGuestTest();
        //single most popular product ("Tiered Wire Basket") addition to check out test method (as a guest)
        addProductToCheckoutTest();
        //invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - invalid guest credit card CVV number format (chars only)
        invalidGuestProductOrderCheckoutInvalidPayGuestCVVFormatTest();
    }

}
