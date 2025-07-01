package com.mybigcommerce.demo;

import com.mybigcommerce.demo.utilities.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

public class GeneralPage extends BasePage {

    //general page web elements (elements that all pages share)
    //header
    @FindBy(xpath = "//ul[@class='navUser-section navUser-section--alt']/li[1]/a")
    private WebElement headerUpperNavCompareLink;
    @FindBy(xpath = "//ul[@class='navUser-section navUser-section--alt']/li[2]/button")
    private WebElement headerUpperNavSearchDropdownLink;
    @FindBy(xpath = "//div[@id='quickSearch']//input")
    private WebElement headerUpperNavSearchInputField;
    @FindBy(xpath = "//ul[@class='navUser-section navUser-section--alt']/li[3]/a")
    private WebElement headerUpperNavGiftCertificatesLink;
    @FindBy(xpath = "//ul[@class='navUser-section navUser-section--alt']/li[4]/a")
    private WebElement headerUpperNavAccountLink;
    @FindBy(xpath = "//ul[@class='navUser-section navUser-section--alt']/li[4]/a[1]")
    private WebElement headerUpperNavSignInLink; //doubles as 'Account' link after login
    @FindBy(xpath = "//ul[@class='navUser-section navUser-section--alt']/li[4]/a[2]")
    private WebElement headerUpperNavRegisterLink; //doubles as 'Logout' link after login
    @FindBy(xpath = "//ul[@class='navUser-section navUser-section--alt']/li[5]/a")
    private WebElement headerUpperNavCartLink;
    @FindBy(xpath = "//a[@class='header-logo__link']")
    private WebElement headerHomePageLogoLink;
    //lower navbar
    @FindBy(xpath = "//ul[@class='navPages-list']/li[1]/a")
    private WebElement headerLowerNavGardenDropdownLink;
    @FindBy(xpath = "//ul[@class='navPages-list']/li[2]/a")
    private WebElement headerLowerNavShopAllLink;
    @FindBy(xpath = "//ul[@class='navPages-list']/li[3]/a")
    private WebElement headerLowerNavKitchenLink;
    @FindBy(xpath = "//ul[@class='navPages-list']/li[4]/a")
    private WebElement headerLowerNavPublicationsLink;
    @FindBy(xpath = "//ul[@class='navPages-list']/li[5]/a")
    private WebElement headerLowerNavUtilityLink;
    @FindBy(xpath = "//ul[@class='navPages-list']/li[6]/a")
    private WebElement headerLowerNavJournalLink;
    @FindBy(xpath = "//ul[@class='navPages-list']/li[7]/a")
    private WebElement headerLowerNavOurStoryLink;
    @FindBy(xpath = "//ul[@class='navPages-list']/li[8]/a")
    private WebElement headerLowerNavContactUsLink;
    @FindBy(xpath = "//ul[@class='navPages-list']/li[9]/a")
    private WebElement headerLowerNavShippingAndReturnsLink;
    //footer section
    //navigate column
    @FindBy(xpath = "//article[@class='footer-info-col footer-info-col--small'][1]/h3")
    private WebElement footerNavigateSectionTitle;
    @FindBy(xpath = "//article[@class='footer-info-col footer-info-col--small'][1]//li[1]/a")
    private WebElement footerJournalLink;
    @FindBy(xpath = "//article[@class='footer-info-col footer-info-col--small'][1]//li[2]/a")
    private WebElement footerOurStoryLink;
    @FindBy(xpath = "//article[@class='footer-info-col footer-info-col--small'][1]//li[3]/a")
    private WebElement footerContactUsLink;
    @FindBy(xpath = "//article[@class='footer-info-col footer-info-col--small'][1]//li[4]/a")
    private WebElement footerShippingAndReturnsLink;
    @FindBy(xpath = "//article[@class='footer-info-col footer-info-col--small'][1]//li[5]/a")
    private WebElement footerSitemapLink;
    //categories column
    @FindBy(xpath = "//article[@class='footer-info-col footer-info-col--small'][2]/h3")
    private WebElement footerCategoriesSectionTitle;
    @FindBy(xpath = "//article[@class='footer-info-col footer-info-col--small'][2]//li[1]/a")
    private WebElement footerGardenLink;
    @FindBy(xpath = "//article[@class='footer-info-col footer-info-col--small'][2]//li[2]/a")
    private WebElement footerShopAllLink;
    @FindBy(xpath = "//article[@class='footer-info-col footer-info-col--small'][2]//li[3]/a")
    private WebElement footerKitchenLink;
    @FindBy(xpath = "//article[@class='footer-info-col footer-info-col--small'][2]//li[4]/a")
    private WebElement footerPublicationsLink;
    @FindBy(xpath = "//article[@class='footer-info-col footer-info-col--small'][2]//li[5]/a")
    private WebElement footerUtilityLink;
    //popular brands column
    @FindBy(xpath = "//article[@class='footer-info-col footer-info-col--small'][3]/h3")
    private WebElement footerPopularBrandsSectionTitle;
    @FindBy(xpath = "//article[@class='footer-info-col footer-info-col--small'][3]//li[1]/a")
    private WebElement footerFreshBrandLink;
    @FindBy(xpath = "//article[@class='footer-info-col footer-info-col--small'][3]//li[2]/a")
    private WebElement footerOFSLink;
    @FindBy(xpath = "//article[@class='footer-info-col footer-info-col--small'][3]//li[3]/a")
    private WebElement footerViewAllLink;
    //information column
    @FindBy(xpath = "//article[@class='footer-info-col footer-info-col--small'][4]/h3")
    private WebElement footerInfoSectionTitle;
    @FindBy(xpath = "//article[@class='footer-info-col footer-info-col--small'][4]/address")
    private WebElement footerAddressText;
    @FindBy(xpath = "//article[@class='footer-info-col footer-info-col--small'][4]/strong")
    private WebElement footerCallUsText;
    //subscribe to newsletter column
    @FindBy(xpath = "//article[@class='footer-info-col']/h3")
    private WebElement footerSubscribeToNewsletterSectionTitle;
    @FindBy(xpath = "//article[@class='footer-info-col']/p")
    private WebElement footerSubscribeToNewsletterSectionSubtext;
    @FindBy(xpath = "//input[@id='nl_email']")
    private WebElement footerSubscribeToNewsletterEmailInputField;
    @FindBy(xpath = "//input[@class='button button--primary form-prefixPostfix-button--postfix']")
    private WebElement footerSubscribeButton;
    //copyright text elements
    @FindBy(xpath = "//div[@class='footer-copyright'][1]/p")
    private WebElement footerPoweredByText;
    @FindBy(xpath = "//div[@class='footer-copyright'][2]/p")
    private WebElement footerCopyrightText;
    //accept cookies button (this element is being clicked only once at the start of each test)
    @FindBy(xpath = "//div[@id='consent-manager']//button[3]")
    private WebElement generalPageAcceptCookiesButton;

    public GeneralPage(WebDriver driver) {super(driver);}

    //click 'Accept cookies' button method
    public void clickAcceptCookiesButton() {
        Actions actions = new Actions(driver);
        actions.moveToElement(generalPageAcceptCookiesButton).click().perform();
    }

    //general page text element getters
    //header -> upper navbar
    public String getHeaderUpperNavSearchDropdownText() {return headerUpperNavSearchDropdownLink.getText();}
    public String getHeaderUpperNavGiftCertificateText() {return headerUpperNavGiftCertificatesLink.getText();}
    public String getHeaderUpperNavCartLinkText() {return headerUpperNavCartLink.getText();}
    public String getHeaderHomePageLogoLinkText() {return headerHomePageLogoLink.getText();}
    //header -> lower navbar
    public String getHeaderLowerNavGardenDropdownLinkText() {return headerLowerNavGardenDropdownLink.getText();}
    public String getHeaderLowerNavShopAllLinkText() {return headerLowerNavShopAllLink.getText();}
    public String getHeaderLowerNavKitchenLinkText() {return headerLowerNavKitchenLink.getText();}
    public String getHeaderLowerNavPublicationsLinkText() {return headerLowerNavPublicationsLink.getText();}
    public String getHeaderLowerNavUtilityLinkText() {return headerLowerNavUtilityLink.getText();}
    public String getHeaderLowerNavJournalLinkText() {return headerLowerNavJournalLink.getText();}
    public String getHeaderLowerNavOurStoryLinkText() {return headerLowerNavOurStoryLink.getText();}
    public String getHeaderLowerNavContactUsLinkText() {return headerLowerNavContactUsLink.getText();}
    public String getHeaderLowerNavShippingAndReturnsLinkText() {return headerLowerNavShippingAndReturnsLink.getText();}
    //footer section
    //navigate column
    public String getFooterNavigateSectionTitle() {return footerNavigateSectionTitle.getText();}
    public String getFooterJournalLinkText() {return footerJournalLink.getText();}
    public String getFooterOurStoryLinkText() {return footerOurStoryLink.getText();}
    public String getFooterContactUsLinkText() {return footerContactUsLink.getText();}
    public String getFooterShippingAndReturnsLinkText() {return footerShippingAndReturnsLink.getText();}
    public String getFooterSitemapLinkText() {return footerSitemapLink.getText();}
    //categories column
    public String getFooterCategoriesSectionTitle() {return footerCategoriesSectionTitle.getText();}
    public String getFooterGardenLinkText() {return footerGardenLink.getText();}
    public String getFooterShopAllLinkText() {return footerShopAllLink.getText();}
    public String getFooterKitchenLinkText() {return footerKitchenLink.getText();}
    public String getFooterPublicationsLinkText() {return footerPublicationsLink.getText();}
    public String getFooterUtilityLinkText() {return footerUtilityLink.getText();}
    //popular brands column
    public String getFooterPopularBrandsSectionTitle() {return footerPopularBrandsSectionTitle.getText();}
    public String getFooterFreshBrandLinkText() {return footerFreshBrandLink.getText();}
    public String getFooterOFSLinkText() {return footerOFSLink.getText();}
    public String getFooterViewAllLinkText() {return footerViewAllLink.getText();}
    //information section
    public String getFooterInfoSectionTitle() {return footerInfoSectionTitle.getText();}
    public String getFooterAddressText() {return footerAddressText.getText();}
    public String getFooterCallUsText() {return footerCallUsText.getText();}
    //subscribe to newsletter column
    public String getFooterSubscribeToNewsletterSectionTitle() {return footerSubscribeToNewsletterSectionTitle.getText();}
    public String getFooterSubscribeToNewsletterSectionSubtext() {return footerSubscribeToNewsletterSectionSubtext.getText();}
    //copyright text elements
    public String getFooterPoweredByText() {return footerPoweredByText.getText();}
    public String getFooterCopyrightText() {return footerCopyrightText.getText();}

    //general page web element assert methods
    //header -> upper navbar
    public boolean isHeaderUpperNavSearchDropdownLinkDisplayed(){return headerUpperNavSearchDropdownLink.isDisplayed();}
    public boolean isHeaderUpperNavGiftCertificatesLinkDisplayed(){return headerUpperNavGiftCertificatesLink.isDisplayed();}
    public boolean isHeaderUpperNavSignInLinkDisplayed(){return headerUpperNavSignInLink.isDisplayed();}
    public boolean isHeaderUpperNavRegisterLinkDisplayed(){return headerUpperNavRegisterLink.isDisplayed();}
    public boolean isHeaderUpperNavCartLinkDisplayed(){return headerUpperNavCartLink.isDisplayed();}
    public boolean isHeaderHomePageLogoLinkDisplayed(){return headerHomePageLogoLink.isDisplayed();}
    //header -> lower navbar
    public boolean isHeaderLowerNavGardenDropdownLinkDisplayed() {return headerLowerNavGardenDropdownLink.isDisplayed();}
    public boolean isHeaderLowerNavShopAllLinkDisplayed() {return headerLowerNavShopAllLink.isDisplayed();}
    public boolean isHeaderLowerNavKitchenLinkDisplayed() {return headerLowerNavKitchenLink.isDisplayed();}
    public boolean isHeaderLowerNavPublicationsLinkDisplayed() {return headerLowerNavPublicationsLink.isDisplayed();}
    public boolean isHeaderLowerNavUtilityLinkDisplayed() {return headerLowerNavUtilityLink.isDisplayed();}
    public boolean isHeaderLowerNavJournalLinkDisplayed() {return headerLowerNavJournalLink.isDisplayed();}
    public boolean isHeaderLowerNavOurStoryLinkDisplayed() {return headerLowerNavOurStoryLink.isDisplayed();}
    public boolean isHeaderLowerNavContactUsLinkDisplayed() {return headerLowerNavContactUsLink.isDisplayed();}
    public boolean isHeaderLowerNavShippingAndReturnsLinkDisplayed() {return headerLowerNavShippingAndReturnsLink.isDisplayed();}
    //footer section
    //navigate column
    public boolean isFooterNavigateSectionTitleDisplayed() {return footerNavigateSectionTitle.isDisplayed();}
    public boolean isFooterJournalLinkDisplayed() {return footerJournalLink.isDisplayed();}
    public boolean isFooterOurStoryLinkDisplayed() {return footerOurStoryLink.isDisplayed();}
    public boolean isFooterContactUsLinkDisplayed() {return footerContactUsLink.isDisplayed();}
    public boolean isFooterShippingAndReturnsLinkDisplayed() {return footerShippingAndReturnsLink.isDisplayed();}
    public boolean isFooterSitemapLinkDisplayed() {return footerSitemapLink.isDisplayed();}
    //categories column
    public boolean isFooterCategoriesSectionTitleDisplayed() {return footerCategoriesSectionTitle.isDisplayed();}
    public boolean isFooterGardenLinkDisplayed() {return footerGardenLink.isDisplayed();}
    public boolean isFooterShopAllLinkDisplayed() {return footerShopAllLink.isDisplayed();}
    public boolean isFooterKitchenLinkDisplayed() {return footerKitchenLink.isDisplayed();}
    public boolean isFooterPublicationsLinkDisplayed() {return footerPublicationsLink.isDisplayed();}
    public boolean isFooterUtilityLinkDisplayed() {return footerUtilityLink.isDisplayed();}
    //popular brands column
    public boolean isFooterPopularBrandsSectionTitleDisplayed() {return footerPopularBrandsSectionTitle.isDisplayed();}
    public boolean isFooterFreshBrandLinkDisplayed() {return footerFreshBrandLink.isDisplayed();}
    public boolean isFooterOFSLinkDisplayed() {return footerOFSLink.isDisplayed();}
    public boolean isFooterViewAllLinkDisplayed() {return footerViewAllLink.isDisplayed();}
    //information column
    public boolean isFooterInfoSectionTitleDisplayed() {return footerInfoSectionTitle.isDisplayed();}
    public boolean isFooterAddressTextDisplayed() {return footerAddressText.isDisplayed();}
    public boolean isFooterCallUsTextDisplayed() {return footerCallUsText.isDisplayed();}
    //subscribe to newsletter column
    public boolean isFooterSubscribeToNewsletterSectionTitleDisplayed() {return footerSubscribeToNewsletterSectionTitle.isDisplayed();}
    public boolean isFooterSubscribeToNewsletterSectionSubtextDisplayed() {return footerSubscribeToNewsletterSectionSubtext.isDisplayed();}
    public boolean isFooterSubscribeToNewsletterEmailInputFieldDisplayed() {return footerSubscribeToNewsletterEmailInputField.isDisplayed();}
    public boolean isFooterSubscribeButtonDisplayed() {return footerSubscribeButton.isDisplayed();}
    //copyright text elements
    public boolean isFooterPoweredByTextDisplayed() {return footerPoweredByText.isDisplayed();}
    public boolean isFooterCopyrightTextDisplayed() {return footerCopyrightText.isDisplayed();}

}
