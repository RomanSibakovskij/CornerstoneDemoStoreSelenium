package com.mybigcommerce.demo;

import com.mybigcommerce.demo.utilities.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.*;
import java.util.stream.Collectors;

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

    //click 'Addresses' link method
    public void clickAddressesLink(){accountDashboardPageNavbarAddressesLink.click();}

    //click 'Account settings' link method
    public void clickAccountSettingsLink(){accountDashboardPageNavbarAccountSettingsLink.click();}

    //click set order number link method
    public void clickSetOrderNumberLink(int index){accountDashboardPageOrderNumberLinkElements.get(index).click();}

    //account dashboard page orders section (page) placed order data getters
    public List<String> getAccountDashboardPageOrderNumber() {return accountDashboardPageOrderNumberLinkElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getAccountDashboardPageOrderProductCountTotalCost() {return accountDashboardPageProductCountTotalCostElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getAccountDashboardPageOrderPlacedDate() {return accountDashboardPageOrderPlacedDateElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getAccountDashboardPageOrderLastUpdateDate() {return accountDashboardPageOrderLastUpdateDateElements.stream().map(WebElement::getText).collect(Collectors.toList());}

    //account dashboard page text element getters
    public String getAccountDashboardPageTitle() {return accountDashboardPageTitle.getText();}
    public String getAccountDashboardPageNavbarOrdersLinkText() {return accountDashboardPageNavbarOrdersLink.getText();}
    public String getAccountDashboardPageNavbarReturnsLinkText() {return accountDashboardPageNavbarReturnsLink.getText();}
    public String getAccountDashboardPageNavbarMessagesLinkText() {return accountDashboardPageNavbarMessagesLink.getText().trim().split("\\(")[0];}
    public String getAccountDashboardPageNavbarAddressesLinkText() {return accountDashboardPageNavbarAddressesLink.getText();}
    public String getAccountDashboardPageNavbarWishlistsLinkText() {return accountDashboardPageNavbarWishlistsLink.getText();}
    public String getAccountDashboardPageNavbarRecentlyViewedLinkText() {return accountDashboardPageNavbarRecentlyViewedLink.getText();}
    public String getAccountDashboardPageNavbarAccountSettingsLinkText() {return accountDashboardPageNavbarAccountSettingsLink.getText();}

    public String getAccountDashboardPageOrdersNotPlacedBoxText() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1700));
        wait.until(ExpectedConditions.visibilityOf(accountDashboardPageOrdersNotPlacedBoxText));
        return accountDashboardPageOrdersNotPlacedBoxText.getText();
    }

    //account dashboard page orders section (page) text element getters
    public List<String> getAccountDashboardPageOrdersPlacedSubtext() {return accountDashboardPageOrdersPlacedSubtextElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getAccountDashboardPageOrdersLastUpdateSubtext() {return accountDashboardPageOrdersLastUpdateSubtextElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getAccountDashboardPageOrdersAwaitFulfillTag() {return accountDashboardPageOrdersAwaitFulfillTagElements.stream().map(WebElement::getText).collect(Collectors.toList());}

    //account dashboard page web element assert methods
    public boolean isAccountDashboardPageBreadcrumbDisplayed() {
        return accountPageBreadcrumbElements.stream()
                .allMatch(WebElement::isDisplayed);
    }

    public boolean isAccountDashboardPageTitleDisplayed() {return accountDashboardPageTitle.isDisplayed();}
    public boolean isAccountDashboardPageNavbarOrdersLinkDisplayed() {return accountDashboardPageNavbarOrdersLink.isDisplayed();}
    public boolean isAccountDashboardPageNavbarReturnsLinkDisplayed() {return accountDashboardPageNavbarReturnsLink.isDisplayed();}
    public boolean isAccountDashboardPageNavbarMessagesLinkDisplayed() {return accountDashboardPageNavbarMessagesLink.isDisplayed();}
    public boolean isAccountDashboardPageNavbarAddressesLinkDisplayed() {return accountDashboardPageNavbarAddressesLink.isDisplayed();}
    public boolean isAccountDashboardPageNavbarWishlistsLinkDisplayed() {return accountDashboardPageNavbarWishlistsLink.isDisplayed();}
    public boolean isAccountDashboardPageNavbarRecentlyViewedLinkDisplayed() {return accountDashboardPageNavbarRecentlyViewedLink.isDisplayed();}
    public boolean isAccountDashboardPageNavbarAccountSettingsLinkDisplayed() {return accountDashboardPageNavbarAccountSettingsLink.isDisplayed();}

    //orders section (page) web element assert methods (appear only after order placement)
    public boolean isAccountDashboardPageOrdersProductImgElementsDisplayed() {
        return accountDashboardPageOrdersProductImgElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isAccountDashboardPageOrderNumberLinkDisplayed() {
        return accountDashboardPageOrderNumberLinkElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isAccountDashboardPageProductCountTotalCostDisplayed() {
        return accountDashboardPageProductCountTotalCostElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isAccountDashboardPageOrdersPlacedSubtextDisplayed() {
        return accountDashboardPageOrdersPlacedSubtextElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isAccountDashboardPageOrdersLastUpdateSubtextDisplayed() {
        return accountDashboardPageOrdersLastUpdateSubtextElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isAccountDashboardPageOrdersAwaitFulfillTagDisplayed() {
        return accountDashboardPageOrdersAwaitFulfillTagElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isAccountDashboardPageOrderPlacedDateDisplayed() {
        return accountDashboardPageOrderPlacedDateElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isAccountDashboardPageOrderLastUpdateDateDisplayed() {
        return accountDashboardPageOrderLastUpdateDateElements.stream()
                .allMatch(WebElement::isDisplayed);
    }

}
