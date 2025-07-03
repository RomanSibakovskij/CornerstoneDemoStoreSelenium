package com.mybigcommerce.demo.logindashpageinvalidscenarios;

import com.mybigcommerce.demo.RegisterPage;
import com.mybigcommerce.demo.utilities.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class LoginRegisterDashboardPageInvalidScenarios extends BasePage {

    //login section
    @FindBy(xpath = "//input[@id='login_email']")
    private WebElement loginSectionEmailInputField;
    @FindBy(xpath = "//input[@id='login_pass']")
    private WebElement loginSectionPasswordInputField;

    public LoginRegisterDashboardPageInvalidScenarios(WebDriver driver) {super(driver);}


}
