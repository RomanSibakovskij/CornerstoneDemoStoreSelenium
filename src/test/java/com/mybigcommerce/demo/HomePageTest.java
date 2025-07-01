package com.mybigcommerce.demo;

import com.mybigcommerce.demo.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class HomePageTest extends TestMethods{

    //user navigation to register page test

    //Test 001 -> user navigation to register page test
    @Test
    @DisplayName("User Navigation To Register Page Test")
    @Tag("Navigate_To_Register_Page")
    void userNavigationToRegisterPageTest() {
        navigateToRegisterPageTest();
    }


}
