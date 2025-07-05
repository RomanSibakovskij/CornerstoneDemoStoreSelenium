package com.mybigcommerce.demo;

import com.mybigcommerce.demo.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class ShoppingCartPageTest extends TestMethods{

    //single most popular product addition to check out tests

    //Test 016 -> single most popular product ("Tiered Wire Basket") addition to check out test method (as a guest)
    @Test
    @DisplayName("Single Most Popular Product Addition To Checkout Test (as a guest)")
    @Tag("Single_Most_Popular_Product_Addition_To_Checkout")
    @Tag("Test_As_A_Guest")
    void singleMostPopularProductAddToCartTest() {
        //single most popular product ("Tiered Wire Basket") addition to cart test method (as a guest)
        addSingleMostPopularProductToCartGuestTest();
        //single most popular product ("Tiered Wire Basket") addition to check out test method (as a guest)
        addProductToCheckoutTest();
    }

    //Test 016a -> single most popular product ("Oak Cheese Grater") addition to check out test method (as a registered user)
    @Test
    @DisplayName("Single Most Popular Product Addition To Checkout Test (as a registered user)")
    @Tag("Single_Most_Popular_Product_Addition_To_Checkout")
    @Tag("Test_As_A_Reg_User")
    void singleMostPopularProductAddToCartRegUserTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //single most popular product ("Oak Cheese Grater") addition to cart test method (as a registered user)
        addSingleMostPopularProductToCartRegUserTest();
        //single most popular product ("Oak Cheese Grater") addition to check out test method (as a registered user)
        addProductToCheckoutTest();
    }

    //multiple most popular products addition to check out tests

    //Test 016b -> multiple most popular products ("Tiered Wire Basket") addition to check out test method (as a guest)
    @Test
    @DisplayName("Multiple Most Popular Products Addition To Checkout Test (as a guest)")
    @Tag("Multiple_Most_Popular_Products_Addition_To_Checkout")
    @Tag("Test_As_A_Guest")
    void multipleMostPopularProductsAddToCheckoutTest() {
        //multiple most popular products ("Tiered Wire Basket") addition to cart test method (as a guest)
        addMultipleMostPopularProductsToCartGuestTest();
        //multiple most popular products ("Tiered Wire Basket") addition to check out test method (as a guest)
        addProductToCheckoutTest();
    }

    //Test 016c -> multiple most popular products ("Oak Cheese Grater") addition to check out test method (as a registered user)
    @Test
    @DisplayName("Multiple Most Popular Products Addition To Checkout Test (as a registered user)")
    @Tag("Multiple_Most_Popular_Products_Addition_To_Checkout")
    @Tag("Test_As_A_Reg_User")
    void multipleMostPopularProductsAddToCheckoutRegUserTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //multiple most popular products ("Oak Cheese Grater") addition to cart test method (as a registered user)
        addMultipleMostPopularProductsToCartRegUserTest();
        //multiple most popular products ("Oak Cheese Grater") addition to check out test method (as a registered user)
        addProductToCheckoutTest();
    }

    //single new product addition to check out tests

    //Test 017 -> single new product ("Smith Journal 13") addition to check out test method (as a guest)
    @Test
    @DisplayName("Single New Product Addition To Checkout Test (as a guest)")
    @Tag("Single_New_Product_Addition_To_Checkout")
    @Tag("Test_As_A_Guest")
    void singleNewProductAddToCheckoutTest() {
        //single new product ("Smith Journal 13") addition to cart test method (as a guest)
        addSingleNewProductToCartGuestTest();
        //single new product ("Smith Journal 13") addition to check out test method (as a guest)
        addProductToCheckoutTest();
    }

    //Test 017a -> single new product ("Kinfolk Issue 16") addition to check out test method (as a registered user)
    @Test
    @DisplayName("Single New Product Addition To Checkout Test (as a registered user)")
    @Tag("Single_New_Product_Addition_To_Checkout")
    @Tag("Test_As_A_Reg_User")
    void singleNewProductAddToCheckoutRegUserTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //single new product ("Kinfolk Issue 16") addition to cart test method (as a registered user)
        addSingleNewProductToCartRegUserTest();
        //single new product ("Kinfolk Issue 16") addition to check out test method (as a registered user)
        addProductToCheckoutTest();
    }

    //multiple new products addition to check out tests

    //Test 017b -> multiple new products ("Smith Journal 13") addition to check out test method (as a guest)
    @Test
    @DisplayName("Multiple New Products Addition To Checkout Test (as a guest)")
    @Tag("Multiple_New_Products_Addition_To_Checkout")
    @Tag("Test_As_A_Guest")
    void multipleNewProductsAddToCheckoutTest() {
        //multiple new products ("Smith Journal 13") addition to cart test method (as a guest)
        addMultipleNewProductsToCartGuestTest();
        //multiple new products ("Smith Journal 13") addition to check out test method (as a guest)
        addProductToCheckoutTest();
    }

    //Test 017c -> multiple new product ("Kinfolk Issue 16") addition to check out test method (as a registered user)
    @Test
    @DisplayName("Multiple New Products Addition To Checkout Test (as a registered user)")
    @Tag("Single_New_Product_Addition_To_Checkout")
    @Tag("Test_As_A_Reg_User")
    void multipleNewProductsAddToCheckoutRegUserTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //multiple new products ("Kinfolk Issue 16") addition to cart test method (as a registered user)
        addMultipleNewProductsToCartRegUserTest();
        //multiple new products ("Kinfolk Issue 16") addition to check out test method (as a registered user)
        addProductToCheckoutTest();
    }

    //single category dashboard page single product addition to check out tests

    //Test 018 -> single category dashboard page set single product ("Canvas Laundry Cart") addition to check out test method (as a guest)
    @Test
    @DisplayName("Single Category Dashboard Page Set Single Product Addition To Checkout Test (as a guest)")
    @Tag("Single_Set_Category_Product_Addition_To_Checkout")
    @Tag("Test_As_A_Guest")
    void singleSetCategoryProductAddToCheckoutTest() {
        //single category dashboard page set single product ("Canvas Laundry Cart") addition to cart test method (as a guest)
        addSingleUtilityLaundryCartProductToCartTest();
        //single category dashboard page set single product ("Canvas Laundry Cart") addition to check out test method (as a guest)
        addProductToCheckoutTest();
    }

    //Test 018a -> single category dashboard page set single product ("Gather Journal Issue 7") addition to check out test method (as a registered user)
    @Test
    @DisplayName("Single Category Dashboard Page Set Single Product Addition To Checkout Test (as a registered user)")
    @Tag("Single_Set_Category_Product_Addition_To_Checkout")
    @Tag("Test_As_A_Reg_User")
    void singleSetCategoryAddToCheckoutRegUserTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //single category dashboard page set single product ("Gather Journal Issue 7") addition to cart test method (as a registered user)
        addSinglePublicationsGatherJournalProductToCartRegUserTest();
        //single category dashboard page set single product ("Gather Journal Issue 7") addition to check out test method (as a registered user)
        addProductToCheckoutTest();
    }

    //single category dashboard page multiple products addition to check out tests

    //Test 018b -> single category dashboard page set multiple products ("Floor Cleaner") addition to check out test method (as a guest)
    @Test
    @DisplayName("Single Category Dashboard Page Set Multiple Products Addition To Checkout Test (as a guest)")
    @Tag("Multiple_Set_Category_Products_Addition_To_Checkout")
    @Tag("Test_As_A_Guest")
    void multipleSetCategoryProductsAddToCheckoutTest() {
        //single category dashboard page set multiple products ("Floor Cleaner") addition to cart test method (as a guest)
        addMultipleUtilityLaundryCartProductToCartTest();
        //single category dashboard page set multiple products ("Floor Cleaner") addition to check out test method (as a guest)
        addProductToCheckoutTest();
    }

    //Test 018c -> single category dashboard page set multiple products ("Openhouse No. 3") addition to check out test method (as a registered user)
    @Test
    @DisplayName("Single Category Dashboard Page Set Multiple Products Addition To Checkout Test (as a registered user)")
    @Tag("Multiple_Set_Category_Products_Addition_To_Checkout")
    @Tag("Test_As_A_Reg_User")
    void multipleSetCategoryAddToCheckoutRegUserTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //single category dashboard page set multiple products ("Openhouse No. 3") addition to cart test method (as a registered user)
        addMultiplePublicationOpenHouseProductToCartRegUserTest();
        //single category dashboard page set multiple products ("Openhouse No. 3") addition to check out test method (as a registered user)
        addProductToCheckoutTest();
    }

    //single searched product addition to check out tests

    //Test 019 -> single searched product ("Living with Plants") addition to check out test method (as a guest)
    @Test
    @DisplayName("Single Searched Product Addition To Checkout Test (as a guest)")
    @Tag("Single_Searched_Product_Addition_To_Checkout")
    @Tag("Test_As_A_Guest")
    void singleSearchedProductAddToCartTest() {
        //single searched product ("Living with Plants") addition to cart test method (as a guest)
        addSingleSearchedPlantPictureProductToCartTest();
        //single searched product ("Living with Plants") addition to check out test method (as a guest)
        addProductToCheckoutTest();
    }

    //Test 019a -> single searched product ("Dustpan & Brush") addition to check out test method (as a registered user)
    @Test
    @DisplayName("Single Searched Product Addition To Checkout Test (as a registered user)")
    @Tag("Single_Searched_Product_Addition_To_Checkout")
    @Tag("Test_As_A_Reg_User")
    void singleSearchedProductAddToCheckoutRegUserTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //single searched product ("Dustpan & Brush") addition to cart test method (as a registered user)
        addSingleSearchedDustpanProductToCartRegUserTest();
        //single searched product ("Dustpan & Brush") addition to check out test method (as a registered user)
        addProductToCheckoutTest();
    }

    //multiple searched products addition to check out tests

    //Test 019b -> multiple searched products ("Orbit Terrarium (Large)") addition to check out test method (as a guest)
    @Test
    @DisplayName("Multiple Searched Products Addition To Checkout Test (as a guest)")
    @Tag("Multiple_Searched_Products_Addition_To_Checkout")
    @Tag("Test_As_A_Guest")
    void multipleSearchedProductsAddToCheckoutTest() {
        //multiple searched products ("Orbit Terrarium (Large)") addition to cart test method (as a guest)
        addMultipleSearchedLargeTerrariumProductToCartTest();
        //multiple searched products ("Orbit Terrarium (Large)") addition to check out test method (as a guest)
        addProductToCheckoutTest();
    }

    //Test 019c -> multiple searched products ("Dustpan & Brush") addition to check out test method (as a registered user)
    @Test
    @DisplayName("Multiple Searched Products Addition To Checkout Test (as a registered user)")
    @Tag("Multiple_Searched_Products_Addition_To_Checkout")
    @Tag("Test_As_A_Reg_User")
    void multipleSearchedProductsAddToCheckoutRegUserTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //multiple searched products ("1L Le Parfait Jar") addition to cart test method (as a registered user)
        addMultipleSearchedJarProductToCartRegUserTest();
        //multiple searched products ("1L Le Parfait Jar") addition to check out test method (as a registered user)
        addProductToCheckoutTest();
    }

    //add products from compare list to check out tests

    //Test 020 -> products ("S Shaped Scrub Brush", "Dish Detergent", "Feather Duster") addition from compare list to check out test method (as a guest)
    @Test
    @DisplayName("Multiple Products Addition From Compare List To Checkout Test (as a guest)")
    @Tag("Multiple_Products_Addition_From_Compare_List_To_Checkout")
    @Tag("Test_As_A_Guest")
    void productsAddFromCompareListToCheckoutTest() {
        //products ("S Shaped Scrub Brush", "Dish Detergent", "Feather Duster") addition to compare list test method (as a guest)
        addProductsToCompareListTest();
        //products ("S Shaped Scrub Brush", "Dish Detergent", "Feather Duster") addition from compare list to cart test method (as a guest)
        addProductsFromCompareListToCartTest();
        //products ("S Shaped Scrub Brush", "Dish Detergent", "Feather Duster") addition from compare list to check out test method (as a guest)
        addProductToCheckoutTest();
    }

    //Test 020a -> products ("Gather Journal Issue 7", "The Kinfolk Table", "Living With Plants") addition from compare list to check out test method (as a registered user)
    @Test
    @DisplayName("Multiple Products Addition From Compare List To Checkout Test (as a registered user)")
    @Tag("Multiple_Products_Addition_From_Compare_List_To_Checkout")
    @Tag("Test_As_A_Reg_User")
    void productsAddFromCompareListToCheckoutRegUserTest() {
        //user navigation to register page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest();
        //single searched product ("Gather Journal Issue 7", "The Kinfolk Table", "Living With Plants") addition to cart test method (as a registered user)
        addProductsToCompareListRegUserTest();
        //products ("Gather Journal Issue 7", "The Kinfolk Table", "Living With Plants") addition from compare list to cart test method (as a registered user)
        addProductsFromCompareListToCartTest();
        //products ("Gather Journal Issue 7", "The Kinfolk Table", "Living With Plants") addition from compare list to check out test method (as a registered user)
        addProductToCheckoutTest();
    }

    //update product quantity in shopping cart tests (guest and registered user will have the same output, so only guest branch is being tested to avoid redundancy)

    //Test 021 -> update products quantity in shopping cart test method (as a guest) (the quantity fails to be updated during automation run)
    @Test
    @DisplayName("Update Products Quantity In Shopping Cart Test (as a guest)")
    @Tag("Update_Products_Quantity_In_Shopping_Cart")
    @Tag("Test_As_A_Guest")
    void updateProductsShopCartQuantityTest() {
        //products ("S Shaped Scrub Brush", "Dish Detergent", "Feather Duster") addition to compare list test method (as a guest)
        addProductsToCompareListTest();
        //products ("S Shaped Scrub Brush", "Dish Detergent", "Feather Duster") addition from compare list to cart test method (as a guest)
        addProductsFromCompareListToCartTest();
        //update products quantity in shopping cart test method (as a guest)
        updateProductQtyShopCartTest();
    }

    //Test 021a -> update products quantity (with increase button) in shopping cart test method (as a guest) (the quantity fails to be updated during automation run)
    @Test
    @DisplayName("Update Products Quantity (Increase Button) In Shopping Cart Test (as a guest)")
    @Tag("Update_Products_Quantity_In_Shopping_Cart")
    @Tag("Quantity_Button")
    @Tag("Test_As_A_Guest")
    void updateProductsShopCartQtyIncreaseBtnTest() {
        //products ("S Shaped Scrub Brush", "Dish Detergent", "Feather Duster") addition to compare list test method (as a guest)
        addProductsToCompareListTest();
        //products ("S Shaped Scrub Brush", "Dish Detergent", "Feather Duster") addition from compare list to cart test method (as a guest)
        addProductsFromCompareListToCartTest();
        //update products quantity (with increase button) in shopping cart test method (as a guest)
        updateProductQtyIncreaseBtnShopCartTest();
    }

    //Test 021b -> update products quantity (with decrease button) in shopping cart test method (as a guest) (the quantity fails to be updated during automation run)
    @Test
    @DisplayName("Update Products Quantity (Decrease Button) In Shopping Cart Test (as a guest)")
    @Tag("Update_Products_Quantity_In_Shopping_Cart")
    @Tag("Quantity_Button")
    @Tag("Test_As_A_Guest")
    void updateProductsShopCartQtyDecreaseBtnTest() {
        //multiple searched products ("Orbit Terrarium (Large)") addition to cart test method (as a guest)
        addMultipleSearchedLargeTerrariumProductToCartTest();
        //update products quantity (with decrease button) in shopping cart test method (as a guest)
        updateProductQtyDecreaseBtnShopCartTest();
    }

    //product removal from shopping cart test (guest and registered user will have the same output, so only guest branch is being tested to avoid redundancy)

    //Test 022 -> product(s) removal from shopping cart test method
    @Test
    @DisplayName("Product(s) Quantity Removal Shopping Cart Test")
    @Tag("Product_Removal_From_Shopping_Cart")
    @Tag("Test_As_A_Guest")
    void productsRemovalFromShopCartTest() {
        //multiple searched products ("Orbit Terrarium (Large)") addition to cart test method (as a guest)
        addMultipleSearchedLargeTerrariumProductToCartTest();
        //product(s) removal from shopping cart test method (as a guest)
        productRemovalFromShoppingCartTest();
    }

}
