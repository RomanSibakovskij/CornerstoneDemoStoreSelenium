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

    //Test 026aae -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - invalid guest shipping last name format (special symbols only) (the error wasn't triggered, test has failed)
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

    //Test 026aaf -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - invalid guest shipping address format (special symbols only) (the error wasn't triggered, test has failed)
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

    //Test 026aag -> invalid single most popular product ("Tiered Wire Basket") check out confirmation test method (as a guest) - invalid guest shipping city format (special symbols only) (the error wasn't triggered, test has failed)
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

}
