package com.mybigcommerce.demo;

import com.mybigcommerce.demo.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class AddReviewModalPageTest extends TestMethods{

    //valid add product review test (available only after purchase / order confirmation)

    //Test 035 -> valid add review on single most popular product ("Oak Cheese Grater") test method (as a registered user) (the user cannot leave a review on the purchased item, test has failed)
    @Test
    @DisplayName("Add Review On Single Most Popular Product Test (as a registered user)")
    @Tag("Single_Most_Popular_Product_Review_Submission")
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
        addOakGraterProductReviewRegUserTest();
    }

    //Test 035a -> valid add review on single category dashboard page set single product ("Canvas Laundry Cart") test method (as a guest) (the user cannot leave a review on the purchased item, test has failed)
    @Test
    @DisplayName("Add Review On Single Category Dashboard Page Set Single Product Test (as a guest)")
    @Tag("Single_Set_Category_Product_Review_Submission")
    @Tag("Test_As_A_Guest")
    void addReviewOnSingleMostPopularProductGuestTest() {
        //single category dashboard page set single product ("Canvas Laundry Cart") addition to cart test method (as a guest)
        addSingleUtilityLaundryCartProductToCartTest();
        //single category dashboard page set single product ("Canvas Laundry Cart") addition to check out test method (as a guest)
        addProductToCheckoutTest();
        //single category dashboard page set single product ("Canvas Laundry Cart") check out confirmation test method (as a guest)
        validGuestProductOrderCheckoutTest();
        //navigate back to home page (with driver) (the header home link nor "Continue shopping" button seem to be working during automation run(manually, everything works))
        navigateToHomePageTest();
        //valid add review on single category dashboard page set single product ("Canvas Laundry Cart") test method (as a guest)
        addUtilityLaundryCartProductReviewTest();
    }

}
