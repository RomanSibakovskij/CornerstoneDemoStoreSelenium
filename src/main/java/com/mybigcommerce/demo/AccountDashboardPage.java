package com.mybigcommerce.demo;

import com.mybigcommerce.demo.utilities.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

import java.util.*;

public class AccountDashboardPage extends BasePage {

    //account dashboard page web elements
    @FindBy(xpath = "//ol[@class='breadcrumbs']/li")
    private List<WebElement> accountPageBreadcrumbElements;
    @FindBy(xpath = "//h1")
    private WebElement accountDashboardPageTitle;
    //account dashboard page navbar web elements
    //account page breadcrumb (move to account page later)
    @FindBy(xpath = "//ul[@class='navBar-section']/li[1]/a")
    private WebElement accountDashboardPageNavbarOrdersLink;
    @FindBy(xpath = "//ul[@class='navBar-section']/li[2]/a")
    private WebElement accountDashboardPageNavbarReturnsLink;
    @FindBy(xpath = "//ul[@class='navBar-section']/li[3]/a")
    private WebElement accountDashboardPageNavbarMessagesLink;
    @FindBy(xpath = "//ul[@class='navBar-section']/li[4]/a")
    private WebElement accountDashboardPageNavbarAddressesLink;
    @FindBy(xpath = "//ul[@class='navBar-section']/li[5]/a")
    private WebElement accountDashboardPageNavbarWishlistsLink;
    @FindBy(xpath = "//ul[@class='navBar-section']/li[6]/a")
    private WebElement accountDashboardPageNavbarRecentlyViewedLink;
    @FindBy(xpath = "//ul[@class='navBar-section']/li[7]/a")
    private WebElement accountDashboardPageNavbarAccountSettingsLink;
    //orders section
    //list elements
    @FindBy(xpath = "//div[@class='account-product-figure']/img")
    private List <WebElement> accountDashboardPageOrdersProductImgElements;
    @FindBy(xpath = "//h5[@class='account-product-title']/a")
    private List <WebElement> accountDashboardPageOrderNumberLinkElements;
    @FindBy(xpath = "//p[@class='account-product-description']")
    private List <WebElement> accountDashboardPageProductCountTotalCostElements;
    @FindBy(xpath = "//div[@class='account-product-details']/div[@class='account-product-detail'][1]/h6[@class='account-product-detail-heading']")
    private List <WebElement> accountDashboardPageOrdersPlacedSubtextElements;
    @FindBy(xpath = "//div[@class='account-product-details']/div[@class='account-product-detail'][2]/h6[@class='account-product-detail-heading']")
    private List <WebElement> accountDashboardPageOrdersLastUpdateSubtextElements;
    @FindBy(xpath = "//h6[@class='account-orderStatus-label']")
    private List <WebElement> accountDashboardPageOrdersAwaitFulfillTagElements;
    @FindBy(xpath = "//div[@class='account-product-details']/div[@class='account-product-detail'][1]/span")
    private List <WebElement> accountDashboardPageOrderPlacedDateElements;
    @FindBy(xpath = "//div[@class='account-product-details']/div[@class='account-product-detail'][2]/span")
    private List <WebElement> accountDashboardPageOrderLastUpdateDateElements;
    //orders not placed box web element
    @FindBy(xpath = "//p[@class='alertBox-column alertBox-message']")
    private WebElement accountDashboardPageOrdersNotPlacedBoxText;

    public AccountDashboardPage(WebDriver driver) {super(driver);}


}
