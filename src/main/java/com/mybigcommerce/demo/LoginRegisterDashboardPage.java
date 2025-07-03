package com.mybigcommerce.demo;

import com.mybigcommerce.demo.utilities.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.*;
import java.util.stream.Collectors;

public class LoginRegisterDashboardPage extends BasePage {

    //login register dashboard page web elements
    @FindBy(xpath = "//h1")
    private WebElement loginRegisterDashboardPageTitle;
    //login section
    @FindBy(xpath = "//label[@for='login_email']")
    private WebElement loginSectionEmailSubtext;
    @FindBy(xpath = "//input[@id='login_email']")
    private WebElement loginSectionEmailInputField;
    @FindBy(xpath = "//label[@for='login_pass']")
    private WebElement loginSectionPasswordSubtext;
    @FindBy(xpath = "//input[@id='login_pass']")
    private WebElement loginSectionPasswordInputField;
    @FindBy(xpath = "//input[@class='button button--primary']")
    private WebElement loginSectionSignInButton;
    @FindBy(xpath = "//a[@class='forgot-password']")
    private WebElement loginSectionForgotPasswordLink;
    //new customer (register) section
    @FindBy(xpath = "//h2[@class='panel-title']")
    private WebElement registerSectionTitle;
    @FindBy(xpath = "//p[@class='new-customer-intro']")
    private WebElement registerSectionDescriptionSubtitle;
    @FindBy(xpath = "//ul[@class='new-customer-fact-list']/li")
    private List<WebElement> registerSectionDescriptionElements;
    @FindBy(xpath = "//div[@class='panel-body']/a")
    private WebElement registerSectionCreateAccountButton;
    //logout success message element
    @FindBy(xpath = "//p[@class='alertBox-column alertBox-message']")
    private WebElement logoutSuccessMessage;
    //login section error message elements
    @FindBy(xpath = "//span[@class='form-inlineMessage']")
    private WebElement loginRegDashPageSingularInputError;
    @FindBy(xpath = "//span[@class='form-inlineMessage']")
    private WebElement loginRegDashPageSingularInputBox;
    @FindBy(xpath = "//span[@id='alertBox-message-text']")
    private WebElement loginRegDashPageSingularInputErrorBox;

    //valid user login data
    private String validUserLoginEmail;
    private String validUserLoginPassword;

    public LoginRegisterDashboardPage(WebDriver driver) {super(driver);}

    //valid user login data getter
    public void validUserLoginDataGetter(){

        RegisterPage registerPage = new RegisterPage(driver);

        validUserLoginEmail = registerPage.getEmail();
        validUserLoginPassword = registerPage.getPassword();

        System.out.println("Valid user login data: " + "\n");

        logger.info("Valid user login email: " + validUserLoginEmail);
        logger.info("Valid user login password: " + validUserLoginPassword);

        System.out.println("\n");

    }

    //valid user login data input methods
    public void inputLoginEmailIntoEmailInputField(){loginSectionEmailInputField.sendKeys(validUserLoginEmail);}
    public void inputLoginPasswordIntoPasswordInputField(){loginSectionPasswordInputField.sendKeys(validUserLoginPassword);}

    //click 'Sign in' button method
    public void clickSignInButton(){
        Actions action = new Actions(driver);
        action.moveToElement(loginSectionSignInButton).click().perform();
    }

    //login register dashboard page text element getters
    //login section
    public String getLoginRegisterDashboardPageTitle(){return loginRegisterDashboardPageTitle.getText();}
    public String getLoginSectionEmailSubtext(){return loginSectionEmailSubtext.getText();}
    public String getLoginSectionPasswordSubtext(){return loginSectionPasswordSubtext.getText();}
    public String getLoginSectionForgotPasswordLinkText(){return loginSectionForgotPasswordLink.getText();}
    //new customer (register) section
    public String getRegisterSectionTitle(){return registerSectionTitle.getText();}
    public String getRegisterSectionDescriptionSubtitle(){return registerSectionDescriptionSubtitle.getText();}
    public List <String> getRegisterSectionDescriptionText(){return registerSectionDescriptionElements.stream().map(WebElement::getText).collect(Collectors.toList());}

    //logout success message getter
    public String getLogoutSuccessMessageText(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1850));
        wait.until(ExpectedConditions.visibilityOf(logoutSuccessMessage));
        return logoutSuccessMessage.getText();
    }

    //login register dashboard page singular input error message getters
    public String getLoginRegDashPageSingularInputError() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1000));
        wait.until(ExpectedConditions.visibilityOf(loginRegDashPageSingularInputError));
        return loginRegDashPageSingularInputError.getText();
    }
    public String getLoginRegDashPageSingularInputErrorBoxText() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1000));
        wait.until(ExpectedConditions.visibilityOf(loginRegDashPageSingularInputErrorBox));
        return loginRegDashPageSingularInputErrorBox.getText();
    }

    //login register dashboard page web element assert methods
    //login section
    public boolean isLoginRegisterDashboardPageTitleDisplayed(){return loginRegisterDashboardPageTitle.isDisplayed();}
    public boolean isLoginSectionEmailSubtextDisplayed(){return loginSectionEmailSubtext.isDisplayed();}
    public boolean isLoginSectionEmailInputFieldDisplayed(){return loginSectionEmailInputField.isDisplayed();}
    public boolean isLoginSectionPasswordSubtextDisplayed(){return loginSectionPasswordSubtext.isDisplayed();}
    public boolean isLoginSectionPasswordInputFieldDisplayed(){return loginSectionPasswordInputField.isDisplayed();}
    public boolean isLoginSectionSignInButtonDisplayed(){return loginSectionSignInButton.isDisplayed();}
    public boolean isLoginSectionForgotPasswordLinkDisplayed(){return loginSectionForgotPasswordLink.isDisplayed();}
    //new customer (register) section
    public boolean isRegisterSectionTitleDisplayed(){return registerSectionTitle.isDisplayed();}
    public boolean isRegisterSectionDescriptionSubtitleDisplayed(){return registerSectionDescriptionSubtitle.isDisplayed();}

    public boolean isRegisterSectionDescriptionDisplayed(){
        return registerSectionDescriptionElements.stream()
                .allMatch(WebElement::isDisplayed);}

    public boolean isRegisterSectionCreateAccountButtonDisplayed(){return registerSectionCreateAccountButton.isDisplayed();}

}
