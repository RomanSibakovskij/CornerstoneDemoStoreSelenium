package com.mybigcommerce.demo;

import com.mybigcommerce.demo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.*;
import java.util.stream.Collectors;

public class CheckoutPage extends BasePage{

    //checkout page web elements
    //checkout section
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[1]//h2")
    private WebElement checkoutPageCheckoutSectionTitle;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[1]//label[@for='email']")
    private WebElement checkoutPageGuestEmailSubtext;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[1]//input[@id='email']")
    private WebElement checkoutPageGuestEmailInputField; //guest will have this element only
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[1]//button")
    private WebElement checkoutPageCheckoutSectionContinueButton;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[1]//label[@for='shouldSubscribe']")
    private WebElement checkoutPageCheckoutSectionNewsletterSubSubtext;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[1]//input[@id='shouldSubscribe']")
    private WebElement checkoutPageCheckoutSectionNewsletterSubCheckbox;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[1]//label[@for='privacyPolicy']")
    private WebElement checkoutPageCheckoutSectionPrivacyPolicySubtext;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[1]//label[@for='privacyPolicy']//a")
    private WebElement checkoutPageCheckoutSectionPrivacyPolicyLink;
    @FindBy(xpath = "//input[@id='privacyPolicy']")
    private WebElement checkoutPageCheckoutSectionPrivacyPolicyCheckbox;
    @FindBy(xpath = "//form[@id='checkout-customer-guest']//p")
    private WebElement checkoutPageCheckoutSectionSignInOfferSubtext;
    @FindBy(xpath = "//form[@id='checkout-customer-guest']//p/a")
    private WebElement checkoutPageCheckoutSectionSignInLink;
    //shipping section
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[2]//h2")
    private WebElement checkoutPageShippingSectionTitle;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[2]//legend[@data-test='shipping-address-heading']")
    private WebElement checkoutPageShippingSectionSubtext;
    @FindBy(xpath = "//div[@class='form-legend-container shipping-header']/a")
    private WebElement checkoutPageShippingSectionShipMultipleAddressesLink;
    //input form
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[2]//label[@for='countryCodeInput']")
    private WebElement checkoutPageShippingCountrySubtext;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[2]//select[@id='countryCodeInput']")
    private WebElement checkoutPageShippingCountryDropdownMenu;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[2]//select[@id='countryCodeInput']/option[@value='US']")
    private WebElement checkoutPageShippingUSCountryOption;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[2]//select[@id='countryCodeInput']/option[1]")
    private WebElement checkoutPageShippingSelectCountryOption;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[2]//label[@for='firstNameInput']")
    private WebElement checkoutPageShippingFirstNameSubtext;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[2]//input[@id='firstNameInput']")
    private WebElement checkoutPageShippingFirstNameInputField;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[2]//label[@for='lastNameInput']")
    private WebElement checkoutPageShippingLastNameSubtext;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[2]//input[@id='lastNameInput']")
    private WebElement checkoutPageShippingLastNameInputField;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[2]//label[@for='addressLine1Input']")
    private WebElement checkoutPageShippingAddressSubtext;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[2]//input[@id='addressLine1Input']")
    private WebElement checkoutPageShippingAddressInputField;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[2]//label[@for='addressLine2Input']")
    private WebElement checkoutPageShippingApartmentSubtext;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[2]//input[@id='addressLine2Input']")
    private WebElement checkoutPageShippingApartmentInputField;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[2]//label[@for='companyInput']")
    private WebElement checkoutPageShippingCompanySubtext;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[2]//input[@id='companyInput']")
    private WebElement checkoutPageShippingCompanyInputField;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[2]//label[@for='cityInput']")
    private WebElement checkoutPageShippingCitySubtext;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[2]//input[@id='cityInput']")
    private WebElement checkoutPageShippingCityInputField;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[2]//label[@for='provinceCodeInput']")
    private WebElement checkoutPageShippingStateSubtext;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[2]//select[@id='provinceCodeInput']")
    private WebElement checkoutPageShippingStateInputField;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[2]//label[@for='postCodeInput']")
    private WebElement checkoutPageShippingPostCodeSubtext;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[2]//input[@id='postCodeInput']")
    private WebElement checkoutPageShippingPostCodeInputField;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[2]//label[@for='phoneInput']")
    private WebElement checkoutPageShippingPhoneSubtext;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[2]//input[@id='phoneInput']")
    private WebElement checkoutPageShippingPhoneInputField;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[2]//select[@id='provinceCodeInput']")
    private WebElement checkoutPageShippingStateDropdownMenu;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[2]//select[@id='provinceCodeInput']/option[1]")
    private WebElement checkoutPageShippingSelectStateOption;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[2]//label[@for='sameAsBilling']")
    private WebElement checkoutPageShippingAndBillAddressSameSubtext;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[2]//input[@id='sameAsBilling']")
    private WebElement checkoutPageShippingAndBillAddressSameCheckbox;
    //shipping method
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[2]//fieldset[@id='checkout-shipping-options']/legend")
    private WebElement checkoutPageShippingMethodSubtitle;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[2]//input[@id='shippingOptionRadio-683699ce5a144-0eb9730e33b10cf310bbb7bf4cef9806']")
    private WebElement checkoutPageShippingMethodRadioButton;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[2]//span[@class='shippingOption-desc']")
    private WebElement checkoutPageShippingMethodSubtext;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[2]//span[@class='shippingOption-price']")
    private WebElement checkoutPageShippingMethodPrice;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[2]//fieldset[@data-test='checkout-shipping-comments']/legend")
    private WebElement checkoutPageShippingOrderCommentsSubtext;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[2]//fieldset[@data-test='checkout-shipping-comments']//input")
    private WebElement checkoutPageShippingOrderCommentsInputField;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[2]//button")
    private WebElement checkoutPageShippingContinueButton; //click this one only if addresses are the same
    //billing address section
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[3]//h2")
    private WebElement checkoutPageBillingSectionTitle;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[3]//legend")
    private WebElement checkoutPageBillingSectionSubtext;
    //input form
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[3]//label[@for='countryCodeInput']")
    private WebElement checkoutPageBillingCountrySubtext;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[3]//select[@id='countryCodeInput']")
    private WebElement checkoutPageBillingCountryDropdownMenu;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[3]//select[@id='countryCodeInput']/option[@value='US']")
    private WebElement checkoutPageBillingUSCountryOption;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[3]//select[@id='countryCodeInput']/option[1]")
    private WebElement checkoutPageBillingSelectCountryOption;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[3]//label[@for='firstNameInput']")
    private WebElement checkoutPageBillingFirstNameSubtext;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[3]//input[@id='firstNameInput']")
    private WebElement checkoutPageBillingFirstNameInputField;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[3]//label[@for='lastNameInput']")
    private WebElement checkoutPageBillingLastNameSubtext;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[3]//input[@id='lastNameInput']")
    private WebElement checkoutPageBillingLastNameInputField;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[3]//label[@for='addressLine1Input']")
    private WebElement checkoutPageBillingAddressSubtext;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[3]//input[@id='addressLine1Input']")
    private WebElement checkoutPageBillingAddressInputField;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[3]//label[@for='addressLine2Input']")
    private WebElement checkoutPageBillingApartmentSubtext;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[3]//input[@id='addressLine2Input']")
    private WebElement checkoutPageBillingApartmentInputField;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[3]//label[@for='companyInput']")
    private WebElement checkoutPageBillingCompanySubtext;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[3]//input[@id='companyInput']")
    private WebElement checkoutPageBillingCompanyInputField;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[3]//label[@for='cityInput']")
    private WebElement checkoutPageBillingCitySubtext;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[3]//input[@id='cityInput']")
    private WebElement checkoutPageBillingCityInputField;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[3]//label[@for='provinceInput']")
    private WebElement checkoutPageBillingStateSubtext;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[3]//input[@id='provinceInput']")
    private WebElement checkoutPageBillingStateInputField;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[3]//select[@id='provinceCodeInput']")
    private WebElement checkoutPageBillingStateDropdownMenu;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[3]//select[@id='provinceCodeInput']/option[1]")
    private WebElement checkoutPageBillingSelectStateOption;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[3]//label[@for='postCodeInput']")
    private WebElement checkoutPageBillingPostCodeSubtext;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[3]//input[@id='postCodeInput']")
    private WebElement checkoutPageBillingPostCodeInputField;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[3]//label[@for='phoneInput']")
    private WebElement checkoutPageBillingPhoneSubtext;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[3]//input[@id='phoneInput']")
    private WebElement checkoutPageBillingPhoneInputField;
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[3]//button")
    private WebElement checkoutPageBillingContinueButton;
    //payment section
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[4]//h2")
    private WebElement checkoutPagePaymentSectionTitle;
    //input form
    @FindBy(xpath = "//ul[@class='form-checklist optimizedCheckout-form-checklist']/li//div[@class='paymentProviderHeader-name']")
    private WebElement checkoutPagePaymentSectionTestGatewaySubtext;
    //list elements
    @FindBy(xpath = "//ul[@class='form-checklist optimizedCheckout-form-checklist']/li//div[@class='paymentProviderHeader-name']")
    private List <WebElement> checkoutPagePaymentSectionCardIconElements;
    //singular elements
    @FindBy(xpath = "//div[@class='paymentMethod paymentMethod--creditCard']//label[@for='ccNumber']")
    private WebElement checkoutPagePaymentCreditCardNumberSubtext;
    @FindBy(xpath = "//div[@class='paymentMethod paymentMethod--creditCard']//input[@id='ccNumber']")
    private WebElement checkoutPagePaymentCreditCardNumberInputField; //input only 4111 1111 1111 1111, others don't work
    @FindBy(xpath = "//div[@class='paymentMethod paymentMethod--creditCard']//label[@for='ccExpiry']")
    private WebElement checkoutPagePaymentCreditCardExpDateSubtext;
    @FindBy(xpath = "//div[@class='paymentMethod paymentMethod--creditCard']//input[@id='ccExpiry']")
    private WebElement checkoutPagePaymentCreditCardExpDateInputField;
    @FindBy(xpath = "//div[@class='paymentMethod paymentMethod--creditCard']//label[@for='ccName']")
    private WebElement checkoutPagePaymentCreditCardNameSubtext;
    @FindBy(xpath = "//div[@class='paymentMethod paymentMethod--creditCard']//input[@id='ccName']")
    private WebElement checkoutPagePaymentCreditCardNameInputField;
    @FindBy(xpath = "//div[@class='paymentMethod paymentMethod--creditCard']//label[@for='ccCvv']")
    private WebElement checkoutPagePaymentCVVNumberSubtext;
    @FindBy(xpath = "//div[@class='paymentMethod paymentMethod--creditCard']//input[@id='ccCvv']")
    private WebElement checkoutPagePaymentCVVNumberInputField;
    //list elements
    @FindBy(xpath = "//div[@class='paymentMethod paymentMethod--creditCard']//div[@class='icon']")
    private List <WebElement> checkoutPagePaymentSectionIconElements;
    //singular elements
    @FindBy(xpath = "//ol[@class='checkout-steps']/li[4]//button")
    private WebElement checkoutPagePaymentPlaceOrderButton;
    //order summary section elements
    @FindBy(xpath = "//aside[@class='layout-cart']//header//h3")
    private WebElement checkoutPageOrderSummarySectionTitle;
    @FindBy(xpath = "//aside[@class='layout-cart']//header/a")
    private WebElement checkoutPageOrderSummaryEditCartLink;
    //order table
    @FindBy(xpath = "//aside[@class='layout-cart']//section[@class='cart-section optimizedCheckout-orderSummary-cartSection'][1]/h3")
    private WebElement checkoutPageOrderSummaryProductCount;
    @FindBy(xpath = "//ul[@class='productList']/li//img")
    private List <WebElement> checkoutPageOrderSummaryProductImgElements;
    @FindBy(xpath = "//ul[@class='productList']/li//h4")
    private List <WebElement> checkoutPageOrderSummaryProductCountAndNameElements;
    @FindBy(xpath = "//ul[@class='productList']/li//div[@class='product-price optimizedCheckout-contentPrimary']")
    private List <WebElement> checkoutPageOrderSummaryProductUnitPriceElements;
    //summary
    @FindBy(xpath = "//aside[@class='layout-cart']//div[@data-test='cart-subtotal']//span[@class='cart-priceItem-label']")
    private WebElement checkoutPageOrderSummarySubtotalPriceSubtext;
    @FindBy(xpath = "//aside[@class='layout-cart']//div[@data-test='cart-subtotal']//span[@class='cart-priceItem-value']")
    private WebElement checkoutPageOrderSummarySubtotalPrice;
    @FindBy(xpath = "//aside[@class='layout-cart']//div[@data-test='cart-shipping']//span[@class='cart-priceItem-label']")
    private WebElement checkoutPageOrderSummaryShippingPriceSubtext;
    @FindBy(xpath = "//aside[@class='layout-cart']//div[@data-test='cart-shipping']//span[@class='cart-priceItem-value']")
    private WebElement checkoutPageOrderSummaryShippingPrice;
    @FindBy(xpath = "//aside[@class='layout-cart']//div[@data-test='cart-taxes']//span[@class='cart-priceItem-label']")
    private WebElement checkoutPageOrderSummaryTaxSubtext;
    @FindBy(xpath = "//aside[@class='layout-cart']//div[@data-test='cart-taxes']//span[@class='cart-priceItem-value']")
    private WebElement checkoutPageOrderSummaryTaxAmount;
    @FindBy(xpath = "//aside[@class='layout-cart']//a[@class='redeemable-label']")
    private WebElement checkoutPageOrderSummaryCouponLink;
    @FindBy(xpath = "//aside[@class='layout-cart']//div[@data-test='cart-total']//span[@class='cart-priceItem-label']")
    private WebElement checkoutPageOrderSummaryTotalPriceSubtext;
    @FindBy(xpath = "//aside[@class='layout-cart']//div[@data-test='cart-total']//span[@class='cart-priceItem-value']")
    private WebElement checkoutPageOrderSummaryTotalPrice;
    //order checkout confirmation elements
    @FindBy(xpath = "//h1[@class='optimizedCheckout-headingPrimary']")
    private WebElement checkoutConfirmationMessageTitle;
    @FindBy(xpath = "//section[@class='orderConfirmation-section']/p[1]")
    private WebElement checkoutConfirmationOrderNumberText;
    @FindBy(xpath = "//section[@class='orderConfirmation-section']/p[2]")
    private WebElement checkoutConfirmationMessage;
    @FindBy(xpath = "//section[@class='orderConfirmation-section']/p[2]//a[1]")
    private WebElement checkoutConfirmationMessageContactLink;
    @FindBy(xpath = "//section[@class='orderConfirmation-section']/p[2]//a[2]")
    private WebElement checkoutConfirmationMessagePhoneLink;
    @FindBy(xpath = "//h2[@class='checkoutHeader-heading']/a")
    private WebElement checkoutConfirmationHeaderHomeLink;
    @FindBy(xpath = "//button")
    private WebElement checkoutConfirmationContinueShoppingButton;
    //checkout page singular input error element
    @FindBy(xpath = "//label[@role='alert']")
    private WebElement checkoutPageSingularInputError;

    public CheckoutPage(WebDriver driver) {super(driver);}

    //checkout page order summary product data getters
    public String getCheckoutPageOrderSummaryProductCount() {return checkoutPageOrderSummaryProductCount.getText();}

    //list elements
    public List <String> getCheckoutPageOrderSummaryProductCountAndName(){return checkoutPageOrderSummaryProductCountAndNameElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List <String> getCheckoutPageOrderSummaryProductUnitPrice(){return checkoutPageOrderSummaryProductUnitPriceElements.stream().map(WebElement::getText).collect(Collectors.toList());}

    //singular elements
    public String getCheckoutPageOrderSummarySubtotalPrice(){return checkoutPageOrderSummarySubtotalPrice.getText();}
    public String getCheckoutPageOrderSummaryShippingPrice(){return checkoutPageOrderSummaryShippingPrice.getText();}
    public String getCheckoutPageOrderSummaryTaxAmount(){return checkoutPageOrderSummaryTaxAmount.getText();}
    public String getCheckoutPageOrderSummaryTotalPrice(){return checkoutPageOrderSummaryTotalPrice.getText();}

    //checkout page text element getters

    //checkout (customer) section
    public String getCheckoutPageCheckoutSectionTitle() {return checkoutPageCheckoutSectionTitle.getText();}
    public String getCheckoutPageGuestEmailSubtext() {return checkoutPageGuestEmailSubtext.getText();}
    public String getCheckoutPageCheckoutSectionNewsletterSubSubtext() {return checkoutPageCheckoutSectionNewsletterSubSubtext.getText();}
    public String getCheckoutPageCheckoutSectionPrivacyPolicySubtext() {return checkoutPageCheckoutSectionPrivacyPolicySubtext.getText();}
    public String getCheckoutPageCheckoutSectionSignInOfferSubtext() {return checkoutPageCheckoutSectionSignInOfferSubtext.getText();}

    //shipping section
    public String getCheckoutPageShippingSectionTitle() {return checkoutPageShippingSectionTitle.getText();}
    public String getCheckoutPageShippingSectionSubtext() {return checkoutPageShippingSectionSubtext.getText();}
    public String getCheckoutPageShippingSectionShipMultipleAddressesLinkText(){return checkoutPageShippingSectionShipMultipleAddressesLink.getText();}

    //input form
    public String getCheckoutPageShippingCountrySubtext() {return checkoutPageShippingCountrySubtext.getText();}
    public String getCheckoutPageShippingFirstNameSubtext() {return checkoutPageShippingFirstNameSubtext.getText();}
    public String getCheckoutPageShippingLastNameSubtext() {return checkoutPageShippingLastNameSubtext.getText();}
    public String getCheckoutPageShippingAddressSubtext() {return checkoutPageShippingAddressSubtext.getText();}
    public String getCheckoutPageShippingApartmentSubtext() {return checkoutPageShippingApartmentSubtext.getText();}
    public String getCheckoutPageShippingCompanySubtext() {return checkoutPageShippingCompanySubtext.getText();}
    public String getCheckoutPageShippingCitySubtext() {return checkoutPageShippingCitySubtext.getText();}
    public String getCheckoutPageShippingStateSubtext() {return checkoutPageShippingStateSubtext.getText();}
    public String getCheckoutPageShippingPostCodeSubtext() {return checkoutPageShippingPostCodeSubtext.getText();}
    public String getCheckoutPageShippingPhoneSubtext() {return checkoutPageShippingPhoneSubtext.getText();}
    public String getCheckoutPageShippingAndBillAddressSameSubtext(){return checkoutPageShippingAndBillAddressSameSubtext.getText();}
    public String getCheckoutPageShippingOrderCommentsSubtext() {return checkoutPageShippingOrderCommentsSubtext.getText();}

    //shipping method
    public String getCheckoutPageShippingMethodSubtitle() {return checkoutPageShippingMethodSubtitle.getText();}
    public String getCheckoutPageShippingMethodSubtext() {return checkoutPageShippingMethodSubtext.getText();}

    //billing address section
    public String getCheckoutPageBillingSectionTitle() {return checkoutPageBillingSectionTitle.getText();}
    public String getCheckoutPageBillingSectionSubtext() {return checkoutPageBillingSectionSubtext.getText();}

    //input form
    public String getCheckoutPageBillingCountrySubtext() {return checkoutPageBillingCountrySubtext.getText();}
    public String getCheckoutPageBillingFirstNameSubtext() {return checkoutPageBillingFirstNameSubtext.getText();}
    public String getCheckoutPageBillingLastNameSubtext() {return checkoutPageBillingLastNameSubtext.getText();}
    public String getCheckoutPageBillingAddressSubtext() {return checkoutPageBillingAddressSubtext.getText();}
    public String getCheckoutPageBillingApartmentSubtext() {return checkoutPageBillingApartmentSubtext.getText();}
    public String getCheckoutPageBillingCompanySubtext() {return checkoutPageBillingCompanySubtext.getText();}
    public String getCheckoutPageBillingCitySubtext() {return checkoutPageBillingCitySubtext.getText();}
    public String getCheckoutPageBillingStateSubtext() {return checkoutPageBillingStateSubtext.getText();}
    public String getCheckoutPageBillingPostCodeSubtext() {return checkoutPageBillingPostCodeSubtext.getText();}
    public String getCheckoutPageBillingPhoneSubtext() {return checkoutPageBillingPhoneSubtext.getText();}

    //payment section
    public String getCheckoutPagePaymentSectionTitle() {return checkoutPagePaymentSectionTitle.getText();}

    //input form
    public String getCheckoutPagePaymentSectionTestGatewaySubtext() {return checkoutPagePaymentSectionTestGatewaySubtext.getText();}
    public String getCheckoutPagePaymentCreditCardNumberSubtext() {return checkoutPagePaymentCreditCardNumberSubtext.getText();}
    public String getCheckoutPagePaymentCreditCardExpDateSubtext() {return checkoutPagePaymentCreditCardExpDateSubtext.getText();}
    public String getCheckoutPagePaymentCreditCardNameSubtext() {return checkoutPagePaymentCreditCardNameSubtext.getText();}
    public String getCheckoutPagePaymentCVVNumberSubtext() {return checkoutPagePaymentCVVNumberSubtext.getText();}

    //order summary section
    public String getCheckoutPageOrderSummarySectionTitle() {return checkoutPageOrderSummarySectionTitle.getText();}
    public String getCheckoutPageOrderSummaryEditCartLinkText() {return checkoutPageOrderSummaryEditCartLink.getText();}

    //summary
    public String getCheckoutPageOrderSummarySubtotalPriceSubtext() {return checkoutPageOrderSummarySubtotalPriceSubtext.getText();}
    public String getCheckoutPageOrderSummaryShippingPriceSubtext() {return checkoutPageOrderSummaryShippingPriceSubtext.getText();}
    public String getCheckoutPageOrderSummaryTaxSubtext() {return checkoutPageOrderSummaryTaxSubtext.getText();}
    public String getCheckoutPageOrderSummaryCouponLinkText() {return checkoutPageOrderSummaryCouponLink.getText();}
    public String getCheckoutPageOrderSummaryTotalPriceSubtext() {return checkoutPageOrderSummaryTotalPriceSubtext.getText();}

    //order checkout confirmation section
    public String getCheckoutConfirmationMessageTitle() {return checkoutConfirmationMessageTitle.getText();}
    public String getCheckoutConfirmationOrderNumberSubtext() {return checkoutConfirmationOrderNumberText.getText();}
    public String getCheckoutConfirmationMessage() {return checkoutConfirmationMessage.getText();}

    //checkout page singular input error message getter
    public String getCheckoutPageSingularInputError() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1000));
        wait.until(ExpectedConditions.visibilityOf(checkoutPageSingularInputError));
        return checkoutPageSingularInputError.getText();
    }

    //checkout page web element assert methods

    //checkout section
    public boolean isCheckoutPageCheckoutSectionTitleDisplayed() {return checkoutPageCheckoutSectionTitle.isDisplayed();}
    public boolean isCheckoutPageGuestEmailSubtextDisplayed() {return checkoutPageGuestEmailSubtext.isDisplayed();}
    public boolean isCheckoutPageGuestEmailInputFieldDisplayed() {return checkoutPageGuestEmailInputField.isDisplayed();}
    public boolean isCheckoutPageCheckoutSectionContinueButtonDisplayed() {return checkoutPageCheckoutSectionContinueButton.isDisplayed();}
    public boolean isCheckoutPageCheckoutSectionNewsletterSubSubtextDisplayed() {return checkoutPageCheckoutSectionNewsletterSubSubtext.isDisplayed();}
    public boolean isCheckoutPageCheckoutSectionNewsletterSubCheckboxDisplayed() {return checkoutPageCheckoutSectionNewsletterSubCheckbox.isDisplayed();}
    public boolean isCheckoutPageCheckoutSectionPrivacyPolicySubtextDisplayed() {return checkoutPageCheckoutSectionPrivacyPolicySubtext.isDisplayed();}
    public boolean isCheckoutPageCheckoutSectionPrivacyPolicyLinkDisplayed() {return checkoutPageCheckoutSectionPrivacyPolicyLink.isDisplayed();}
    public boolean isCheckoutPageCheckoutSectionPrivacyPolicyCheckboxDisplayed() {return checkoutPageCheckoutSectionPrivacyPolicyCheckbox.isDisplayed();}

    public boolean isCheckoutPageCheckoutSectionSignInOfferSubtextDisplayed() {return checkoutPageCheckoutSectionSignInOfferSubtext.isDisplayed();}

    public boolean isCheckoutPageCheckoutSectionSignInLinkDisplayed() {return checkoutPageCheckoutSectionSignInLink.isDisplayed();}

    //shipping section
    public boolean isCheckoutPageShippingSectionTitleDisplayed() {return checkoutPageShippingSectionTitle.isDisplayed();}
    public boolean isCheckoutPageShippingSectionSubtextDisplayed() {return checkoutPageShippingSectionSubtext.isDisplayed();}
    public boolean isCheckoutPageShippingSectionShipMultipleAddressesLinkDisplayed() {return checkoutPageShippingSectionShipMultipleAddressesLink.isDisplayed();}

    //input form
    public boolean isCheckoutPageShippingCountrySubtextDisplayed() {return checkoutPageShippingCountrySubtext.isDisplayed();}
    public boolean isCheckoutPageShippingCountryDropdownMenuDisplayed() {return checkoutPageShippingCountryDropdownMenu.isDisplayed();}
    public boolean isCheckoutPageShippingFirstNameSubtextDisplayed() {return checkoutPageShippingFirstNameSubtext.isDisplayed();}
    public boolean isCheckoutPageShippingFirstNameInputFieldDisplayed() {return checkoutPageShippingFirstNameInputField.isDisplayed();}
    public boolean isCheckoutPageShippingLastNameSubtextDisplayed() {return checkoutPageShippingLastNameSubtext.isDisplayed();}
    public boolean isCheckoutPageShippingLastNameInputFieldDisplayed() {return checkoutPageShippingLastNameInputField.isDisplayed();}
    public boolean isCheckoutPageShippingAddressSubtextDisplayed() {return checkoutPageShippingAddressSubtext.isDisplayed();}
    public boolean isCheckoutPageShippingAddressInputFieldDisplayed() {return checkoutPageShippingAddressInputField.isDisplayed();}
    public boolean isCheckoutPageShippingApartmentSubtextDisplayed() {return checkoutPageShippingApartmentSubtext.isDisplayed();}
    public boolean isCheckoutPageShippingApartmentInputFieldDisplayed() {return checkoutPageShippingApartmentInputField.isDisplayed();}
    public boolean isCheckoutPageShippingCompanySubtextDisplayed() {return checkoutPageShippingCompanySubtext.isDisplayed();}
    public boolean isCheckoutPageShippingCompanyInputFieldDisplayed() {return checkoutPageShippingCompanyInputField.isDisplayed();}
    public boolean isCheckoutPageShippingCitySubtextDisplayed() {return checkoutPageShippingCitySubtext.isDisplayed();}
    public boolean isCheckoutPageShippingCityInputFieldDisplayed() {return checkoutPageShippingCityInputField.isDisplayed();}
    public boolean isCheckoutPageShippingStateSubtextDisplayed() {return checkoutPageShippingStateSubtext.isDisplayed();}
    public boolean isCheckoutPageShippingStateInputFieldDisplayed() {return checkoutPageShippingStateInputField.isDisplayed();}
    public boolean isCheckoutPageShippingPostCodeSubtextDisplayed() {return checkoutPageShippingPostCodeSubtext.isDisplayed();}
    public boolean isCheckoutPageShippingPostCodeInputFieldDisplayed() {return checkoutPageShippingPostCodeInputField.isDisplayed();}
    public boolean isCheckoutPageShippingPhoneSubtextDisplayed() {return checkoutPageShippingPhoneSubtext.isDisplayed();}
    public boolean isCheckoutPageShippingPhoneInputFieldDisplayed() {return checkoutPageShippingPhoneInputField.isDisplayed();}
    public boolean isCheckoutPageShippingAndBillAddressSameSubtextDisplayed() {return checkoutPageShippingAndBillAddressSameSubtext.isDisplayed();}
    public boolean isCheckoutPageShippingAndBillAddressSameCheckboxDisplayed() {return checkoutPageShippingAndBillAddressSameCheckbox.isDisplayed();}
    public boolean isCheckoutPageShippingMethodSubtitleDisplayed() {return checkoutPageShippingMethodSubtitle.isDisplayed();}
    public boolean isCheckoutPageShippingMethodRadioButtonDisplayed() {return checkoutPageShippingMethodRadioButton.isDisplayed();}
    public boolean isCheckoutPageShippingMethodSubtextDisplayed() {return checkoutPageShippingMethodSubtext.isDisplayed();}
    public boolean isCheckoutPageShippingMethodPriceDisplayed() {return checkoutPageShippingMethodPrice.isDisplayed();}
    public boolean isCheckoutPageShippingOrderCommentsSubtextDisplayed() {return checkoutPageShippingOrderCommentsSubtext.isDisplayed();}
    public boolean isCheckoutPageShippingOrderCommentsInputFieldDisplayed() {return checkoutPageShippingOrderCommentsInputField.isDisplayed();}
    public boolean isCheckoutPageShippingContinueButtonDisplayed() {return checkoutPageShippingContinueButton.isDisplayed();}

    //billing address section
    public boolean isCheckoutPageBillingSectionTitleDisplayed() {return checkoutPageBillingSectionTitle.isDisplayed();}
    public boolean isCheckoutPageBillingSectionSubtextDisplayed() {return checkoutPageBillingSectionSubtext.isDisplayed();}

    //input form
    public boolean isCheckoutPageBillingCountrySubtextDisplayed() {return checkoutPageBillingCountrySubtext.isDisplayed();}
    public boolean isCheckoutPageBillingCountryDropdownMenuDisplayed() {return checkoutPageBillingCountryDropdownMenu.isDisplayed();}
    public boolean isCheckoutPageBillingFirstNameSubtextDisplayed() {return checkoutPageBillingFirstNameSubtext.isDisplayed();}
    public boolean isCheckoutPageBillingFirstNameInputFieldDisplayed() {return checkoutPageBillingFirstNameInputField.isDisplayed();}
    public boolean isCheckoutPageBillingLastNameSubtextDisplayed() {return checkoutPageBillingLastNameSubtext.isDisplayed();}
    public boolean isCheckoutPageBillingLastNameInputFieldDisplayed() {return checkoutPageBillingLastNameInputField.isDisplayed();}
    public boolean isCheckoutPageBillingAddressSubtextDisplayed() {return checkoutPageBillingAddressSubtext.isDisplayed();}
    public boolean isCheckoutPageBillingAddressInputFieldDisplayed() {return checkoutPageBillingAddressInputField.isDisplayed();}
    public boolean isCheckoutPageBillingApartmentSubtextDisplayed() {return checkoutPageBillingApartmentSubtext.isDisplayed();}
    public boolean isCheckoutPageBillingApartmentInputFieldDisplayed() {return checkoutPageBillingApartmentInputField.isDisplayed();}
    public boolean isCheckoutPageBillingCompanySubtextDisplayed() {return checkoutPageBillingCompanySubtext.isDisplayed();}
    public boolean isCheckoutPageBillingCompanyInputFieldDisplayed() {return checkoutPageBillingCompanyInputField.isDisplayed();}
    public boolean isCheckoutPageBillingCitySubtextDisplayed() {return checkoutPageBillingCitySubtext.isDisplayed();}
    public boolean isCheckoutPageBillingCityInputFieldDisplayed() {return checkoutPageBillingCityInputField.isDisplayed();}
    public boolean isCheckoutPageBillingStateSubtextDisplayed() {return checkoutPageBillingStateSubtext.isDisplayed();}
    public boolean isCheckoutPageBillingStateInputFieldDisplayed() {return checkoutPageBillingStateInputField.isDisplayed();}
    public boolean isCheckoutPageBillingPostCodeSubtextDisplayed() {return checkoutPageBillingPostCodeSubtext.isDisplayed();}
    public boolean isCheckoutPageBillingPostCodeInputFieldDisplayed() {return checkoutPageBillingPostCodeInputField.isDisplayed();}
    public boolean isCheckoutPageBillingPhoneSubtextDisplayed() {return checkoutPageBillingPhoneSubtext.isDisplayed();}
    public boolean isCheckoutPageBillingPhoneInputFieldDisplayed() {return checkoutPageBillingPhoneInputField.isDisplayed();}
    public boolean isCheckoutPageBillingContinueButtonDisplayed() {return checkoutPageBillingContinueButton.isDisplayed();}

    //payment section
    public boolean isCheckoutPagePaymentSectionTitleDisplayed() {return checkoutPagePaymentSectionTitle.isDisplayed();}

    //input form
    public boolean isCheckoutPagePaymentSectionTestGatewaySubtextDisplayed() {return checkoutPagePaymentSectionTestGatewaySubtext.isDisplayed();}

    //list elements
    public boolean isCheckoutPagePaymentSectionCardIconDisplayed(){
        return checkoutPagePaymentSectionCardIconElements.stream()
                .allMatch(WebElement::isDisplayed);
    }

    //singular elements
    public boolean isCheckoutPagePaymentCreditCardSubtextDisplayed() {return checkoutPagePaymentCreditCardNumberSubtext.isDisplayed();}
    public boolean isCheckoutPagePaymentCreditCardInputFieldDisplayed() {return checkoutPagePaymentCreditCardNumberInputField.isDisplayed();}
    public boolean isCheckoutPagePaymentCreditCardExpDateSubtextDisplayed() {return checkoutPagePaymentCreditCardExpDateSubtext.isDisplayed();}
    public boolean isCheckoutPagePaymentCreditCardExpDateInputFieldDisplayed() {return checkoutPagePaymentCreditCardExpDateInputField.isDisplayed();}
    public boolean isCheckoutPagePaymentCreditCardNameSubtextDisplayed() {return checkoutPagePaymentCreditCardNameSubtext.isDisplayed();}
    public boolean isCheckoutPagePaymentCreditCardNameInputFieldDisplayed() {return checkoutPagePaymentCreditCardNameInputField.isDisplayed();}
    public boolean isCheckoutPagePaymentCVVNumberSubtextDisplayed() {return checkoutPagePaymentCVVNumberSubtext.isDisplayed();}
    public boolean isCheckoutPagePaymentCVVNumberInputFieldDisplayed() {return checkoutPagePaymentCVVNumberInputField.isDisplayed();}

    //list elements
    public boolean isCheckoutPagePaymentSectionIconDisplayed(){
        return checkoutPagePaymentSectionIconElements.stream()
                .allMatch(WebElement::isDisplayed);
    }

    //singular elements
    public boolean isCheckoutPagePaymentPlaceOrderButtonDisplayed() {return checkoutPagePaymentPlaceOrderButton.isDisplayed();}

    //order summary section
    public boolean isCheckoutPageOrderSummarySectionTitleDisplayed() {return checkoutPageOrderSummarySectionTitle.isDisplayed();}
    public boolean isCheckoutPageOrderSummaryEditCartLinkDisplayed() {return checkoutPageOrderSummaryEditCartLink.isDisplayed();}

    //order summary product table
    public boolean isCheckoutPageOrderSummaryProductCountDisplayed() {return checkoutPageOrderSummaryProductCount.isDisplayed();}

    //list elements
    public boolean isCheckoutPageOrderSummaryProductImageDisplayed(){
        return checkoutPageOrderSummaryProductImgElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isCheckoutPageOrderSummaryProductCountAndNameDisplayed(){
        return checkoutPageOrderSummaryProductCountAndNameElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isCheckoutPageOrderSummaryProductUnitPriceDisplayed(){
        return checkoutPageOrderSummaryProductUnitPriceElements.stream()
                .allMatch(WebElement::isDisplayed);
    }

    //summary
    public boolean isCheckoutPageOrderSummarySubtotalPriceSubtextDisplayed() {return checkoutPageOrderSummarySubtotalPriceSubtext.isDisplayed();}
    public boolean isCheckoutPageOrderSummarySubtotalPriceDisplayed() {return checkoutPageOrderSummarySubtotalPrice.isDisplayed();}
    public boolean isCheckoutPageOrderSummaryShippingPriceSubtextDisplayed() {return checkoutPageOrderSummaryShippingPriceSubtext.isDisplayed();}
    public boolean isCheckoutPageOrderSummaryShippingPriceDisplayed() {return checkoutPageOrderSummaryShippingPrice.isDisplayed();}
    public boolean isCheckoutPageOrderSummaryTaxSubtextDisplayed() {return checkoutPageOrderSummaryTaxSubtext.isDisplayed();}
    public boolean isCheckoutPageOrderSummaryTaxAmountDisplayed() {return checkoutPageOrderSummaryTaxAmount.isDisplayed();}
    public boolean isCheckoutPageOrderSummaryCouponLinkDisplayed() {return checkoutPageOrderSummaryCouponLink.isDisplayed();}
    public boolean isCheckoutPageOrderSummaryTotalPriceSubtextDisplayed() {return checkoutPageOrderSummaryTotalPriceSubtext.isDisplayed();}
    public boolean isCheckoutPageOrderSummaryTotalPriceDisplayed() {return checkoutPageOrderSummaryTotalPrice.isDisplayed();}

    //order confirmation section
    public boolean isCheckoutConfirmationMessageTitleDisplayed() {return checkoutConfirmationMessageTitle.isDisplayed();}
    public boolean isCheckoutConfirmationOrderNumberTextDisplayed(){return checkoutConfirmationOrderNumberText.isDisplayed();}
    public boolean isCheckoutConfirmationMessageDisplayed(){return checkoutConfirmationMessage.isDisplayed();}
    public boolean isCheckoutConfirmationMessageContactLinkDisplayed() {return checkoutConfirmationMessageContactLink.isDisplayed();}
    public boolean isCheckoutConfirmationMessagePhoneLinkDisplayed() {return checkoutConfirmationMessagePhoneLink.isDisplayed();}
    public boolean isCheckoutConfirmationContinueShoppingButtonDisplayed() {return checkoutConfirmationContinueShoppingButton.isDisplayed();}

}
