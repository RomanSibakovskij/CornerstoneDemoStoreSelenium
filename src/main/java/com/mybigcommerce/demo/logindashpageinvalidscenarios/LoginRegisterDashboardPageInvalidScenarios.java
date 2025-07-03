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

    //valid user login data (for remaining inputs)
    private String validUserLoginEmail;
    private String validUserLoginPassword;

    //invalid user login data - no singular input
    private String noUserLoginEmail;

    public LoginRegisterDashboardPageInvalidScenarios(WebDriver driver) {super(driver);}

    //invalid user login data getter - no login email
    public void invalidUserLoginDataNoLoginEmailGetter(){

        RegisterPage registerPage = new RegisterPage(driver);

        noUserLoginEmail = "";
        validUserLoginPassword = registerPage.getPassword();

        System.out.println("Invalid user login data (no login email): " + "\n");

        logger.info("No login email: " + noUserLoginEmail);
        logger.info("Valid user login password (no login email): " + validUserLoginPassword);

        System.out.println("\n");

    }

    //invalid user login data input methods - no singular input methods
    public void inputNoLoginEmailIntoEmailInputField(){loginSectionEmailInputField.sendKeys(noUserLoginEmail);}

    //valid user login data input methods (for remaining inputs)
    public void inputLoginEmailIntoEmailInputField(){loginSectionEmailInputField.sendKeys(validUserLoginEmail);}
    public void inputLoginPasswordIntoPasswordInputField(){loginSectionPasswordInputField.sendKeys(validUserLoginPassword);}

}
