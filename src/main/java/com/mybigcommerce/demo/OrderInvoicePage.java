package com.mybigcommerce.demo;

import com.mybigcommerce.demo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

import java.util.*;
import java.util.stream.Collectors;

public class OrderInvoicePage extends BasePage{

    //order invoice page web elements
    @FindBy(xpath = "//h2[@class='page-heading title']")
    private WebElement orderNumber;
    //contents section
    @FindBy(xpath = "//div[@class='account-content account-content--fixedSmall']/h3")
    private WebElement orderContentsSectionTitle;
    @FindBy(xpath = "//ul[@class='account-list']/li[1]/h5")
    private WebElement orderContentsItemShippedSubtext;
    //list elements
    @FindBy(xpath = "//ul[@class='account-list']/li[2]//input[@class='form-checkbox']")
    private List<WebElement> orderContentsItemCheckboxElements;
    @FindBy(xpath = "//ul[@class='account-list']/li//img")
    private List<WebElement> orderContentsItemImgElements;
    @FindBy(xpath = "//ul[@class='account-list']/li//h5[@class='account-product-title']")
    private List<WebElement> orderContentsItemNameCountElements;
    @FindBy(xpath = "//ul[@class='account-list']/li//span[@class='account-product-price']")
    private List<WebElement> orderContentsItemUnitPriceElements;
    //order summary
    @FindBy(xpath = "//dl[@class='account-orderTotal']/dt[1]")
    private WebElement orderContentsSubtotalSubtext;
    @FindBy(xpath = "//dl[@class='account-orderTotal']/dd[1]")
    private WebElement orderContentsSubtotalPrice;
    @FindBy(xpath = "//dl[@class='account-orderTotal']/dt[2]")
    private WebElement orderContentsGrandTotalSubtext;
    @FindBy(xpath = "//dl[@class='account-orderTotal']/dd[2]")
    private WebElement orderContentsGrandTotalPrice;
    //order details section
    @FindBy(xpath = "//aside[@class='account-sidebar']/section[1]/h3")
    private WebElement orderContentsOrderDetailsSectionTitle;
    @FindBy(xpath = "//aside[@class='account-sidebar']/section[1]/dl/dt[1]")
    private WebElement orderContentsOrderStatusSubtext;
    @FindBy(xpath = "//aside[@class='account-sidebar']/section[1]/dl/dd[1]")
    private WebElement orderContentsOrderStatus;
    @FindBy(xpath = "//aside[@class='account-sidebar']/section[1]/dl/dt[2]")
    private WebElement orderContentsOrderDateSubtext;
    @FindBy(xpath = "//aside[@class='account-sidebar']/section[1]/dl/dd[2]")
    private WebElement orderContentsOrderDate;
    @FindBy(xpath = "//aside[@class='account-sidebar']/section[1]/dl/dt[3]")
    private WebElement orderContentsOrderTotalSubtext;
    @FindBy(xpath = "//aside[@class='account-sidebar']/section[1]/dl/dd[3]")
    private WebElement orderContentsOrderTotal;
    @FindBy(xpath = "//aside[@class='account-sidebar']/section[1]/dl/dt[4]")
    private WebElement orderContentsPayMethodSubtext;
    @FindBy(xpath = "//aside[@class='account-sidebar']/section[1]/dl/dd[4]")
    private WebElement orderContentsPayMethod;
    @FindBy(xpath = "//aside[@class='account-sidebar']/section[1]/button")
    private WebElement orderContentsPrintInvoiceButton;
    //ship to section
    @FindBy(xpath = "//aside[@class='account-sidebar']/section[2]/h3")
    private WebElement orderContentsShipToSectionTitle;
    @FindBy(xpath = "//aside[@class='account-sidebar']/section[2]/ul/li[1]")
    private WebElement orderContentsShippingName;
    @FindBy(xpath = "//aside[@class='account-sidebar']/section[2]/ul/li[3]")
    private WebElement orderContentsShippingAddress;
    @FindBy(xpath = "//aside[@class='account-sidebar']/section[2]/ul/li[5]")
    private WebElement orderContentsShippingAddressTwo;
    @FindBy(xpath = "//aside[@class='account-sidebar']/section[2]/ul/li[6]")
    private WebElement orderContentsShippingCountry;
    //bill to section
    @FindBy(xpath = "//aside[@class='account-sidebar']/section[3]/h3")
    private WebElement orderContentsBillToSectionTitle;
    @FindBy(xpath = "//aside[@class='account-sidebar']/section[3]/ul/li[1]")
    private WebElement orderContentsBillingName;
    @FindBy(xpath = "//aside[@class='account-sidebar']/section[3]/ul/li[3]")
    private WebElement orderContentsBillingAddress;
    @FindBy(xpath = "//aside[@class='account-sidebar']/section[3]/ul/li[5]")
    private WebElement orderContentsBillingAddressTwo;
    @FindBy(xpath = "//aside[@class='account-sidebar']/section[3]/ul/li[6]")
    private WebElement orderContentsBillingCountry;
    //actions section
    @FindBy(xpath = "//aside[@class='account-sidebar']/section[4]/h3")
    private WebElement orderContentsActionsSectionTitle;
    @FindBy(xpath = "//aside[@class='account-sidebar']/section[4]//input[@class='button']")
    private WebElement orderContentsReorderButton;

    public OrderInvoicePage(WebDriver driver) {super(driver);}

    //order invoice data getters
    public String getOrderNumber() {return orderNumber.getText();}
    public String getOrderContentsItemShippedSubtext() {return orderContentsItemShippedSubtext.getText();}
    //list elements
    public List<String> getOrderContentsItemNameCount() {return orderContentsItemNameCountElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getOrderContentsItemUnitPriceCount() {return orderContentsItemUnitPriceElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    //singular elements
    public String getOrderStatus() {return orderContentsOrderStatus.getText();}
    public String getOrderDate() {return orderContentsOrderDate.getText();}
    public String getOrderTotal() {return orderContentsOrderTotal.getText();}
    public String getOrderPaymentMethod() {return orderContentsPayMethod.getText();}
    //ship to
    public String getOrderShippingName() {return orderContentsShippingName.getText();}
    public String getOrderShippingAddress() {return orderContentsShippingAddress.getText();}
    public String getOrderShippingAddressTwo() {return orderContentsShippingAddressTwo.getText();}
    public String getOrderShippingCountry() {return orderContentsShippingCountry.getText();}
    //bill to
    public String getOrderBillingName() {return orderContentsBillingName.getText();}
    public String getOrderBillingAddress() {return orderContentsBillingAddress.getText();}
    public String getOrderBillingAddressTwo() {return orderContentsBillingAddressTwo.getText();}
    public String getOrderBillingCountry() {return orderContentsBillingCountry.getText();}

    //order invoice page text element getters
    public String getOrderContentsSectionTitle() {return orderContentsSectionTitle.getText();}
    public String getOrderContentsSubtotalSubtext() {return orderContentsSubtotalSubtext.getText();}
    public String getOrderContentsGrandTotalSubtext() {return orderContentsGrandTotalSubtext.getText();}
    public String getOrderContentsOrderDetailsSectionTitle() {return orderContentsOrderDetailsSectionTitle.getText();}
    public String getOrderContentsOrderStatusSubtext() {return orderContentsOrderStatusSubtext.getText();}
    public String getOrderContentsOrderDateSubtext() {return orderContentsOrderDateSubtext.getText();}
    public String getOrderContentsOrderTotalSubtext() {return orderContentsOrderTotalSubtext.getText();}
    public String getOrderContentsPayMethodSubtext() {return orderContentsPayMethodSubtext.getText();}
    public String getOrderContentsShipToSectionTitle() {return orderContentsShipToSectionTitle.getText();}
    public String getOrderContentsBillToSectionTitle() {return orderContentsBillToSectionTitle.getText();}
    public String getOrderContentsActionsSectionTitle() {return orderContentsActionsSectionTitle.getText();}

    //order invoice page web element assert methods
    public boolean isOrderNumberDisplayed(){return orderNumber.isDisplayed();}
    //contents
    public boolean isOrderContentsSectionTitleDisplayed(){return orderContentsSectionTitle.isDisplayed();}
    public boolean isOrderContentsSectionItemShippedSubtextDisplayed(){return orderContentsItemShippedSubtext.isDisplayed();}

    //list elements
    public boolean isOrderContentsItemCheckboxElementDisplayed(){
        return orderContentsItemCheckboxElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isOrderContentsItemImgElementDisplayed(){
        return orderContentsItemImgElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isOrderContentsItemNameCountElementDisplayed(){
        return orderContentsItemNameCountElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isOrderContentsItemUnitPriceElementDisplayed(){
        return orderContentsItemUnitPriceElements.stream()
                .allMatch(WebElement::isDisplayed);
    }

    //order summary
    public boolean isOrderContentsSubtotalSubtextDisplayed(){return orderContentsSubtotalSubtext.isDisplayed();}
    public boolean isOrderContentsSubtotalPriceDisplayed(){return orderContentsSubtotalPrice.isDisplayed();}
    public boolean isOrderContentsGrandTotalSubtextDisplayed(){return orderContentsGrandTotalSubtext.isDisplayed();}
    public boolean isOrderContentsGrandTotalPriceDisplayed(){return orderContentsGrandTotalPrice.isDisplayed();}
    //order details
    public boolean isOrderContentsOrderDetailsSectionTitleDisplayed(){return orderContentsOrderDetailsSectionTitle.isDisplayed();}
    public boolean isOrderContentsOrderStatusSubtextDisplayed(){return orderContentsOrderStatusSubtext.isDisplayed();}
    public boolean isOrderContentsOrderStatusDisplayed(){return orderContentsOrderStatus.isDisplayed();}
    public boolean isOrderContentsOrderDateSubtextDisplayed(){return orderContentsOrderDateSubtext.isDisplayed();}
    public boolean isOrderContentsOrderDateDisplayed(){return orderContentsOrderDate.isDisplayed();}
    public boolean isOrderContentsOrderTotalSubtextDisplayed(){return orderContentsOrderTotalSubtext.isDisplayed();}
    public boolean isOrderContentsOrderTotalDisplayed(){return orderContentsOrderTotal.isDisplayed();}
    public boolean isOrderContentsPayMethodSubtextDisplayed(){return orderContentsPayMethodSubtext.isDisplayed();}
    public boolean isOrderContentsPayMethodDisplayed(){return orderContentsPayMethod.isDisplayed();}
    public boolean isOrderContentsPrintInvoiceButtonDisplayed(){return orderContentsPrintInvoiceButton.isDisplayed();}
    //ship to
    public boolean isOrderContentsShipToSectionTitleDisplayed(){return orderContentsShipToSectionTitle.isDisplayed();}
    public boolean isOrderContentsShippingNameDisplayed(){return orderContentsShippingName.isDisplayed();}
    public boolean isOrderContentsShippingAddressDisplayed(){return orderContentsShippingAddress.isDisplayed();}
    public boolean isOrderContentsShippingAddressTwoDisplayed(){return orderContentsShippingAddressTwo.isDisplayed();}
    public boolean isOrderContentsShippingCountryDisplayed(){return orderContentsShippingCountry.isDisplayed();}
    //bill to
    public boolean isOrderContentsBillToSectionTitleDisplayed(){return orderContentsBillToSectionTitle.isDisplayed();}
    public boolean isOrderContentsBillingNameDisplayed(){return orderContentsBillingName.isDisplayed();}
    public boolean isOrderContentsBillingAddressDisplayed(){return orderContentsBillingAddress.isDisplayed();}
    public boolean isOrderContentsBillingAddressTwoDisplayed(){return orderContentsBillingAddressTwo.isDisplayed();}
    public boolean isOrderContentsBillingCountryDisplayed(){return orderContentsBillingCountry.isDisplayed();}
    //actions
    public boolean isOrderContentsActionsSectionTitleDisplayed(){return orderContentsActionsSectionTitle.isDisplayed();}
    public boolean isOrderContentsReorderButtonDisplayed(){return orderContentsReorderButton.isDisplayed();}

}
