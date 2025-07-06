package com.mybigcommerce.demo;

import com.mybigcommerce.demo.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class AddReviewModalPageTest extends TestMethods{

    //valid add product review test (available only after purchase / order confirmation)

    //Test 035 -> valid add review on single most popular product ("Oak Cheese Grater") test method (as a registered user) (the user cannot leave a review on the purchased item, test has failed)
    @Test
    @DisplayName("Add Review On Single Most Popular Product Test (as a registered user)")
    @Tag("Single_Most_Popular_Product_Order_Submission_Confirmation")
    @Tag("Test_As_A_Reg_User")
    void addReviewOnSingleMostPopularProductRegUserTest() {
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
        //navigate back to home page (with driver) (the header home link nor "Continue shopping" button seem to be working during automation run(manually, everything works))
        navigateToHomePageTest();
        //valid add review on single most popular product ("Oak Cheese Grater") test method (as a registered user)
        addOakGraterProductReviewTest();
    }

}
