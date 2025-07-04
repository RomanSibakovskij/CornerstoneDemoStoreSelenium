package com.mybigcommerce.demo;

import com.mybigcommerce.demo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.*;
import java.util.stream.Collectors;

public class ShoppingCartPage extends BasePage{

    //shopping cart page web elements
    @FindBy(xpath = "//h1")
    private WebElement shoppingCartPageTitle;
    //shopping cart table elements
    @FindBy(xpath = "//table[@class='cart']/thead//th[1]")
    private WebElement shoppingCartTableItemSubtext;
    @FindBy(xpath = "//table[@class='cart']/thead//th[2]")
    private WebElement shoppingCartTablePriceSubtext;
    @FindBy(xpath = "//table[@class='cart']/thead//th[3]")
    private WebElement shoppingCartTableQuantitySubtext;
    @FindBy(xpath = "//table[@class='cart']/thead//th[4]")
    private WebElement shoppingCartTableTotalSubtext;
    //list elements
    @FindBy(xpath = "//table[@class='cart']/tbody/tr/td[1]/img")
    private List <WebElement> shoppingCartTableProductImageElements;
    @FindBy(xpath = "//table[@class='cart']/tbody/tr/td[2]/p")
    private List <WebElement> shoppingCartTableProductBrandElements;
    @FindBy(xpath = "//table[@class='cart']/tbody/tr/td[2]/h2/a")
    private List <WebElement> shoppingCartTableProductNameLinkElements;
    @FindBy(xpath = "//table[@class='cart']/tbody/tr/td[2]//dt")
    private List <WebElement> shoppingCartTableProductGiftWrapSubtextElements;
    @FindBy(xpath = "//table[@class='cart']/tbody/tr/td[2]//dd/a")
    private List <WebElement> shoppingCartTableProductGiftWrapLinkElements;
    @FindBy(xpath = "//table[@class='cart']/tbody/tr/td[3]/span[2]")
    private List <WebElement> shoppingCartTableProductPriceElements;
    @FindBy(xpath = "//table[@class='cart']/tbody/tr/td[4]//button[1]")
    private List <WebElement> shoppingCartTableProductQtyDecreaseButtonElements;
    @FindBy(xpath = "//table[@class='cart']/tbody/tr/td[4]//input")
    private List <WebElement> shoppingCartTableProductQtyInputFieldElements;
    @FindBy(xpath = "//table[@class='cart']/tbody/tr/td[4]//button[2]")
    private List <WebElement> shoppingCartTableProductQtyIncreaseButtonElements;
    @FindBy(xpath = "//table[@class='cart']/tbody/tr/td[5]//strong")
    private List <WebElement> shoppingCartTableProductTotalPriceElements;
    @FindBy(xpath = "//table[@class='cart']/tbody/tr/td[5]//button")
    private List <WebElement> shoppingCartTableProductRemoveButtonElements;
    //summary table elements
    @FindBy(xpath = "//ul[@class='cart-totals']/li[1]/div[1]")
    private WebElement shoppingCartSummaryTableSubtotalSubtext;
    @FindBy(xpath = "//ul[@class='cart-totals']/li[1]/div[2]")
    private WebElement shoppingCartSummaryTableSubtotalPrice;
    @FindBy(xpath = "//ul[@class='cart-totals']/li[2]/div[1]")
    private WebElement shoppingCartSummaryTableShippingSubtext;
    @FindBy(xpath = "//ul[@class='cart-totals']/li[2]/div[2]/button")
    private WebElement shoppingCartSummaryTableShippingAddInfoLink;
    @FindBy(xpath = "//ul[@class='cart-totals']/li[3]/div[1]")
    private WebElement shoppingCartSummaryTableCouponCodeSubtext;
    @FindBy(xpath = "//ul[@class='cart-totals']/li[3]/div[2]/button")
    private WebElement shoppingCartSummaryTableAddCouponCodeLink;
    @FindBy(xpath = "//ul[@class='cart-totals']/li[4]/div[1]")
    private WebElement shoppingCartSummaryTableGiftCertificateSubtext;
    @FindBy(xpath = "//ul[@class='cart-totals']/li[4]/div[2]/button")
    private WebElement shoppingCartSummaryTableAddGiftCertificateLink;
    @FindBy(xpath = "//ul[@class='cart-totals']/li[5]/div[1]")
    private WebElement shoppingCartSummaryTableGrandTotalSubtext;
    @FindBy(xpath = "//ul[@class='cart-totals']/li[5]/div[2]")
    private WebElement shoppingCartSummaryTableGrandTotalPrice;
    @FindBy(xpath = "//a[@class='button button--primary']")
    private WebElement shoppingCartPageCheckoutButton;
    //shipping section elements
    @FindBy(xpath = "//form[@class='form estimator-form']/dl/dt[1]")
    private WebElement shoppingCartPageShippingCountrySubtext;
    @FindBy(xpath = "//select[@id='shipping-country']")
    private WebElement shoppingCartPageShippingCountryDropdownMenu;
    @FindBy(xpath = "//select[@id='shipping-country']/option[@value='226']")
    private WebElement shoppingCartPageShippingUSCountryOption;
    @FindBy(xpath = "//select[@id='shipping-country']/option[1]")
    private WebElement shoppingCartPageShippingSelectCountryOption;
    @FindBy(xpath = "//form[@class='form estimator-form']/dl/dt[2]")
    private WebElement shoppingCartPageShippingStateSubtext;
    @FindBy(xpath = "//select[@id='shipping-state']")
    private WebElement shoppingCartPageShippingStateDropdownMenu;
    @FindBy(xpath = "//select[@id='shipping-state']/option[@value='23']")
    private WebElement shoppingCartPageShippingIllinoisStateOption;
    @FindBy(xpath = "//select[@id='shipping-state']/option[1]")
    private WebElement shoppingCartPageShippingSelectStateOption;
    @FindBy(xpath = "//form[@class='form estimator-form']/dl/dt[3]")
    private WebElement shoppingCartPageShippingCitySubtext;
    @FindBy(xpath = "//input[@id='shipping-city']")
    private WebElement shoppingCartPageShippingCityInputField;
    @FindBy(xpath = "//form[@class='form estimator-form']/dl/dt[4]")
    private WebElement shoppingCartPageShippingPostCodeSubtext;
    @FindBy(xpath = "//input[@id='shipping-zip']")
    private WebElement shoppingCartPageShippingPostCodeInputField;
    @FindBy(xpath = "//button[@class='button button--primary button--small shipping-estimate-submit']")
    private WebElement shoppingCartPageEstimateShippingButton;
    @FindBy(xpath = "//input[@id='shipping-quote-shipping_peritem-0']")
    private WebElement shoppingCartPageRateShippingRadioButton;
    @FindBy(xpath = "//label[@for='shipping-quote-shipping_peritem-0']")
    private WebElement shoppingCartPageRateShippingPrice;
    @FindBy(xpath = "//input[@class='button button--small button--primary select-shipping-quote']")
    private WebElement shoppingCartPageUpdateShippingCostButton;
    //shopping cart popup modal elements
    @FindBy(xpath = "//div[@id='alert-modal']//span")
    private WebElement shoppingCartPagePopupModalWarningMessage;
    @FindBy(xpath = "//div[@id='alert-modal']//button[@class='confirm button']")
    private WebElement shoppingCartPagePopupModalOKBtn;
    //shopping cart shipping section singular input error elements
    @FindBy(xpath = "//span[@class='form-inlineMessage']")
    private WebElement shoppingCartPageShipSingularInputError;
    @FindBy(xpath = "//div[@role='alert']/ul/li")
    private WebElement shoppingCartPageShipSingularInputAlert;

    //valid input shipping data
    private String validShopCartShipCity = TestDataGenerator.getRandomCity();
    private String validShopCartShipPostCode = String.valueOf(TestDataGenerator.getRandomPostalCode());

    public ShoppingCartPage(WebDriver driver) {super(driver);}

    //click "Add info" button (link) method
    public void clickAddInfoLink() {shoppingCartSummaryTableShippingAddInfoLink.click();}

    //click "Country" dropdown menu method
    public void clickCountryDropdownMenu(){
        Actions action = new Actions(driver);
        action.moveToElement(shoppingCartPageShippingCountryDropdownMenu).click().perform();
    }

    //select "United States" option method
    public void selectUSCountryOption() {shoppingCartPageShippingUSCountryOption.click();}

    //input valid shipping city into shipping city input field method
    public void inputValidShippingCityIntoShippingCityInputField() {
        logger.info("Valid shipping city (shopping cart): " + validShopCartShipCity);
        shoppingCartPageShippingCityInputField.sendKeys(validShopCartShipCity);
    }
    //input valid shipping post code into shipping post code input field method
    public void inputValidShippingPostCodeIntoShippingPostCodeInputField() {
        logger.info("Valid shipping post code (shopping cart): " + validShopCartShipPostCode);
        shoppingCartPageShippingPostCodeInputField.sendKeys(validShopCartShipPostCode);
    }

    //input set product quantity into product quantity input field
    public void inputSetProductQuantityIntoProductQtyInputField(int index, int quantity) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1500));
        wait.until(ExpectedConditions.elementToBeClickable(shoppingCartTableProductQtyInputFieldElements.get(index)));
        shoppingCartTableProductQtyInputFieldElements.get(index).clear();
        shoppingCartTableProductQtyInputFieldElements.get(index).sendKeys(String.valueOf(quantity));
    }

    //click "Increase" quantity button method
    public void clickIncreaseQtyButton(int index) {
        Actions action = new Actions(driver);
        action.moveToElement(shoppingCartTableProductQtyIncreaseButtonElements.get(index)).click().perform();
    }

    //click "Estimate shipping" button method
    public void clickEstimateShippingButton() {
        Actions action = new Actions(driver);
        action.moveToElement(shoppingCartPageEstimateShippingButton).click().perform();
    }

    //click "Shipping rate (flat)" radio button method
    public void clickFlatRateShippingRadioButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1500));
        wait.until(ExpectedConditions.elementToBeClickable(shoppingCartPageRateShippingRadioButton));
        shoppingCartPageRateShippingRadioButton.click();
    }

    //click "State" dropdown menu method
    public void clickStateDropdownMenu(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1500));
        wait.until(ExpectedConditions.elementToBeClickable(shoppingCartPageShippingStateDropdownMenu));
        shoppingCartPageShippingStateDropdownMenu.click();
    }

    //select "Illinois" state option method
    public void selectIllinoisStateOption() {shoppingCartPageShippingIllinoisStateOption.click();}

    //click "Update shipping cost" button method
    public void clickUpdateShippingCostButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1500));
        wait.until(ExpectedConditions.elementToBeClickable(shoppingCartPageUpdateShippingCostButton));
        shoppingCartPageUpdateShippingCostButton.click();
    }

    //click "Checkout" button method
    public void clickCheckoutButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(2000));
        wait.until(ExpectedConditions.elementToBeClickable(shoppingCartPageCheckoutButton));
        shoppingCartPageCheckoutButton.click();
    }

    //shopping cart product data getters
    //shopping cart table
    public List<String> getShoppingCartTableProductBrand(){return shoppingCartTableProductBrandElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getShoppingCartTableProductName(){return shoppingCartTableProductNameLinkElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getShoppingCartTableProductPrice(){return shoppingCartTableProductPriceElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getShoppingCartTableProductQty(){return shoppingCartTableProductQtyInputFieldElements.stream().map(el -> el.getDomAttribute("value")).collect(Collectors.toList());}
    public List<String> getShoppingCartTableProductTotalPrice(){return shoppingCartTableProductPriceElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    //summary table
    public String getShoppingCartSummaryTableSubtotalPrice(){return shoppingCartSummaryTableSubtotalPrice.getText();}
    public String getShoppingCartSummaryTableShippingPrice(){return shoppingCartPageRateShippingPrice.getText();}
    public String getShoppingCartSummaryTableGrandTotalPrice(){return shoppingCartSummaryTableGrandTotalPrice.getText();}

    //shopping cart text element getters
    public String getShoppingCartPageTitle() {
        String fullTitle = shoppingCartPageTitle.getText().trim();
        //remove all text except "Your Cart"
        return fullTitle.replaceAll("\\s*\\(.*?\\)", "").trim();
    }
    //shopping cart table
    public String getShoppingCartTableItemSubtext() {return shoppingCartTableItemSubtext.getText();}
    public String getShoppingCartTablePriceSubtext() {return shoppingCartTablePriceSubtext.getText();}
    public String getShoppingCartTableQuantitySubtext() {return shoppingCartTableQuantitySubtext.getText();}
    public String getShoppingCartTableTotalSubtext() {return shoppingCartTableTotalSubtext.getText();}

    public List<String> getShoppingCartTableProductGiftWrapSubtext() {return shoppingCartTableProductGiftWrapSubtextElements.stream().map(WebElement::getText).collect(Collectors.toList());}

    //summary table
    public String getShoppingCartSummaryTableSubtotalSubtext() {return shoppingCartSummaryTableSubtotalSubtext.getText();}
    public String getShoppingCartSummaryTableShippingSubtext() {return shoppingCartSummaryTableShippingSubtext.getText();}
    public String getShoppingCartSummaryTableCouponCodeSubtext() {return shoppingCartSummaryTableCouponCodeSubtext.getText();}
    public String getShoppingCartSummaryTableGiftCertificateSubtext() {return shoppingCartSummaryTableGiftCertificateSubtext.getText();}
    public String getShoppingCartSummaryTableGrandTotalSubtext() {return shoppingCartSummaryTableGrandTotalSubtext.getText();}

    //shopping cart popup modal warning message getter
    public String getShoppingCartPopupModalWarningMsg(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(2100));
        wait.until(ExpectedConditions.visibilityOf(shoppingCartPagePopupModalWarningMessage));
        return shoppingCartPagePopupModalWarningMessage.getText();
    }

    //shipping section
    public String getShoppingCartShippingCountrySubtext() {return shoppingCartPageShippingCountrySubtext.getText();}
    public String getShoppingCartShippingStateSubtext() {return shoppingCartPageShippingStateSubtext.getText();}
    public String getShoppingCartShippingCitySubtext() {return shoppingCartPageShippingCitySubtext.getText();}
    public String getShoppingCartShippingPostCodeSubtext() {return shoppingCartPageShippingPostCodeSubtext.getText();}

    //shopping cart page web element assert methods
    public boolean isShoppingCartPageTitleDisplayed() {return shoppingCartPageTitle.isDisplayed();}
    public boolean isShoppingCartTableItemSubtextDisplayed() {return shoppingCartTableItemSubtext.isDisplayed();}
    public boolean isShoppingCartTablePriceSubtextDisplayed() {return shoppingCartTablePriceSubtext.isDisplayed();}
    public boolean isShoppingCartTableQuantitySubtextDisplayed() {return shoppingCartTableQuantitySubtext.isDisplayed();}
    public boolean isShoppingCartTableTotalSubtextDisplayed() {return shoppingCartTableTotalSubtext.isDisplayed();}
    //list elements
    public boolean isShoppingCartTableProductImageDisplayed(){
        return shoppingCartTableProductImageElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isShoppingCartTableProductBrandDisplayed(){
        return shoppingCartTableProductBrandElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isShoppingCartTableProductNameLinkDisplayed(){
        return shoppingCartTableProductNameLinkElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isShoppingCartTableProductGiftWrapSubtextDisplayed(){
        return shoppingCartTableProductGiftWrapSubtextElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isShoppingCartTableProductGiftWrapLinkDisplayed(){
        return shoppingCartTableProductGiftWrapLinkElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isShoppingCartTableProductPriceDisplayed(){
        return shoppingCartTableProductPriceElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isShoppingCartTableProductQtyDecreaseButtonDisplayed(){
        return shoppingCartTableProductQtyDecreaseButtonElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isShoppingCartTableProductQtyInputFieldDisplayed(){
        return shoppingCartTableProductQtyInputFieldElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isShoppingCartTableProductQtyIncreaseButtonDisplayed(){
        return shoppingCartTableProductQtyIncreaseButtonElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isShoppingCartTableProductTotalPriceDisplayed(){
        return shoppingCartTableProductTotalPriceElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    //summary table
    public boolean isShoppingCartSummaryTableSubtotalSubtextDisplayed(){return shoppingCartSummaryTableSubtotalSubtext.isDisplayed();}
    public boolean isShoppingCartSummaryTableSubtotalPriceDisplayed(){return shoppingCartSummaryTableSubtotalPrice.isDisplayed();}
    public boolean isShoppingCartSummaryTableShippingSubtextDisplayed(){return shoppingCartSummaryTableShippingSubtext.isDisplayed();}
    public boolean isShoppingCartSummaryTableShippingAddInfoLinkDisplayed(){return shoppingCartSummaryTableShippingAddInfoLink.isDisplayed();}
    public boolean isShoppingCartSummaryTableCouponCodeSubtextDisplayed(){return shoppingCartSummaryTableCouponCodeSubtext.isDisplayed();}
    public boolean isShoppingCartSummaryTableAddCouponCodeLinkDisplayed(){return shoppingCartSummaryTableAddCouponCodeLink.isDisplayed();}
    public boolean isShoppingCartSummaryTableGiftCertificateSubtextDisplayed() {return shoppingCartSummaryTableGiftCertificateSubtext.isDisplayed();}
    public boolean isShoppingCartSummaryTableAddGiftCertificateLinkDisplayed() {return shoppingCartSummaryTableAddGiftCertificateLink.isDisplayed();}
    public boolean isShoppingCartSummaryTableGrandTotalSubtextDisplayed() {return shoppingCartSummaryTableGrandTotalSubtext.isDisplayed();}
    public boolean isShoppingCartSummaryTableGrandTotalPriceDisplayed() {return shoppingCartSummaryTableGrandTotalPrice.isDisplayed();}
    public boolean isShoppingCartPageCheckoutButtonDisplayed() {return shoppingCartPageCheckoutButton.isDisplayed();}
    //shipping section
    public boolean isShoppingCartShippingCountrySubtextDisplayed(){return shoppingCartPageShippingCountrySubtext.isDisplayed();}
    public boolean isShoppingCartShippingCountryDropdownMenuDisplayed(){return shoppingCartPageShippingCountryDropdownMenu.isDisplayed();}
    public boolean isShoppingCartShippingStateSubtextDisplayed() {return shoppingCartPageShippingStateSubtext.isDisplayed();}
    public boolean isShoppingCartShippingStateDropdownMenuDisplayed(){return shoppingCartPageShippingStateDropdownMenu.isDisplayed();}
    public boolean isShoppingCartShippingCitySubtextDisplayed() {return shoppingCartPageShippingCitySubtext.isDisplayed();}
    public boolean isShoppingCartShippingCityInputFieldDisplayed(){return shoppingCartPageShippingCityInputField.isDisplayed();}
    public boolean isShoppingCartShippingPostCodeSubtextDisplayed() {return shoppingCartPageShippingPostCodeSubtext.isDisplayed();}
    public boolean isShoppingCartShippingPostCodeInputFieldDisplayed() {return shoppingCartPageShippingPostCodeInputField.isDisplayed();}
    public boolean isShoppingCartEstimateShippingButtonDisplayed() {return shoppingCartPageEstimateShippingButton.isDisplayed();}

}
