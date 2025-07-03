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
    private String noUserLoginPassword;

    //invalid user login data - invalid singular input
    private String invalidUserLoginEmail;
    private String invalidUserLoginPassword;

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

    //invalid user login data getter - no login password
    public void invalidUserLoginDataNoLoginPasswordGetter(){

        RegisterPage registerPage = new RegisterPage(driver);

        validUserLoginEmail = registerPage.getEmail();
        noUserLoginPassword = "";

        System.out.println("Invalid user login data (no login password): " + "\n");

        logger.info("Valid user login email (no login password): " + validUserLoginEmail);
        logger.info("No login password: " + noUserLoginPassword);

        System.out.println("\n");

    }

    //invalid user login data input methods - no singular input methods
    public void inputNoLoginEmailIntoEmailInputField(){loginSectionEmailInputField.sendKeys(noUserLoginEmail);}
    public void inputNoLoginPasswordIntoPasswordInputField(){loginSectionPasswordInputField.sendKeys(noUserLoginPassword);}

    //invalid user login data getter - invalid login email
    public void invalidUserLoginDataInvalidLoginEmailGetter(){

        RegisterPage registerPage = new RegisterPage(driver);

        invalidUserLoginEmail = "fddsgdf@fakemail.com";
        validUserLoginPassword = registerPage.getPassword();

        System.out.println("Invalid user login data (invalid login email): " + "\n");

        logger.info("Invalid user login email: " + invalidUserLoginEmail);
        logger.info("Valid user login password (invalid login email): " + validUserLoginPassword);

        System.out.println("\n");

    }

    //invalid user login data getter - invalid login password
    public void invalidUserLoginDataInvalidLoginPasswordGetter(){

        RegisterPage registerPage = new RegisterPage(driver);

        validUserLoginEmail = registerPage.getEmail();
        invalidUserLoginPassword = "RERfvfdf2343";

        System.out.println("Invalid user login data (invalid login password): " + "\n");

        logger.info("Valid user login email (invalid login password): " + validUserLoginEmail);
        logger.info("Invalid user login password: " + invalidUserLoginPassword);

        System.out.println("\n");

    }

    //invalid user login data input methods - invalid singular input methods
    public void inputInvalidLoginEmailIntoEmailInputField(){loginSectionEmailInputField.sendKeys(invalidUserLoginEmail);}
    public void inputInvalidLoginPasswordIntoPasswordInputField(){loginSectionPasswordInputField.sendKeys(invalidUserLoginPassword);}

    //valid user login data input methods (for remaining inputs)
    public void inputLoginEmailIntoEmailInputField(){loginSectionEmailInputField.sendKeys(validUserLoginEmail);}
    public void inputLoginPasswordIntoPasswordInputField(){loginSectionPasswordInputField.sendKeys(validUserLoginPassword);}

}
