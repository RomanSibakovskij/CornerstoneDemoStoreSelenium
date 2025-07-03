package com.mybigcommerce.demo;

import com.mybigcommerce.demo.utilities.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.*;

public class SingleProductPage extends BasePage {

    //single product page web elements
    @FindBy(xpath = "//h1")
    private WebElement singleProductPageTitle;
    @FindBy(xpath = "//div[@class='productView-img-container']//img")
    private WebElement singleProductPageMainProductImg;
    @FindBy(xpath = "//h2/a")
    private WebElement singleProductPageBrandLink;
    @FindBy(xpath = "//div[@class='price-section price-section--withoutTax price--withoutTax']/span[@class='price']")
    private WebElement singleProductPageProductUnitPrice;
    //list elements
    @FindBy(xpath = "//span[@role='img']/span")
    private List <WebElement> singleProductPageRatingStarElements;
    //singular elements
    @FindBy(xpath = "//div[@class='productView-rating']/span[2]")
    private WebElement singleProductPageReviewCount;
    @FindBy(xpath = "//div[@class='productView-rating']/a")
    private WebElement singleProductPageWriteAReviewLink;
    @FindBy(xpath = "//dt[@class='productView-info-name'][1]")
    private WebElement singleProductPageWeightSubtext;
    @FindBy(xpath = "//dd[@class='productView-info-value'][3]")
    private WebElement singleProductPageProductWeight;
    @FindBy(xpath = "//dt[@class='productView-info-name'][2]")
    private WebElement singleProductPageGiftWrappingSubtext;
    @FindBy(xpath = "//dd[@class='productView-info-value'][4]")
    private WebElement singleProductPageProductGiftWrappingOption;
    @FindBy(xpath = "//dt[@class='productView-info-name'][3]")
    private WebElement singleProductPageShippingSubtext;
    @FindBy(xpath = "//dd[@class='productView-info-value'][5]")
    private WebElement singleProductPageProductShippingOption;
    @FindBy(xpath = "//label[@for='qty[]']")
    private WebElement singleProductPageProductQtySubtext;
    @FindBy(xpath = "//input[@id='qty[]']")
    private WebElement singleProductPageProductQtyInputField;
    @FindBy(xpath = "//div[@class='form-increment']/button[1]")
    private WebElement singleProductPageIncreaseQtyButton;
    @FindBy(xpath = "//div[@class='form-increment']/button[2]")
    private WebElement singleProductPageDecreaseQtyButton;
    @FindBy(xpath = "//input[@id='form-action-addToCart']")
    private WebElement singleProductPageAddToCartButton;
    @FindBy(xpath = "//form[@class='form form-wishlist form-action']/a")
    private WebElement singleProductPageAddToWishlistDropdownMenu;
    @FindBy(xpath = "//ul[@class='dropdown-menu is-open f-open-dropdown']/li[1]/input")
    private WebElement singleProductPageMyWishlistOption;
    //social button elements
    @FindBy(xpath = "//ul[@class='socialLinks']/li[1]/a")
    private WebElement singleProductPageFacebookIconButton;
    @FindBy(xpath = "//ul[@class='socialLinks']/li[2]/a")
    private WebElement singleProductPageMailIconButton;
    @FindBy(xpath = "//ul[@class='socialLinks']/li[3]/a")
    private WebElement singleProductPagePrintIconButton;
    @FindBy(xpath = "//ul[@class='socialLinks']/li[4]/a")
    private WebElement singleProductPageXIconButton;
    //product image list elements
    @FindBy(xpath = "//ul[@class='productView-thumbnails']/li//img")
    private List <WebElement> singleProductPageProductImgElements;
    //singular elements
    @FindBy(xpath = "//ul[@class='tabs']/li[1]/a")
    private WebElement singleProductPageDescriptionLink;
    @FindBy(xpath = "//div[@id='tab-description']")
    private WebElement singleProductPageProductDescription;
    //shopping cart modal elements
    @FindBy(xpath = "//h1[@class='modal-header-title']")
    private WebElement shoppingCartModalTitle;
    @FindBy(xpath = "//div[@id='previewModal']/button[@class='modal-close']")
    private WebElement shoppingCartModalCloseButton;
    @FindBy(xpath = "//div[@class='productView-img-container']//img")
    private WebElement shoppingCartModalProductImage;
    @FindBy(xpath = "//section[@class='previewCartCheckout']/a[1]")
    private WebElement shoppingCartModalProceedToCheckoutButton;
    @FindBy(xpath = "//div[@class='previewCartCheckout-subtotal']")
    private WebElement shoppingCartModalOrderSubtotalSubtext;
    @FindBy(xpath = "//strong[@class='previewCartCheckout-price']")
    private WebElement shoppingCartModalOrderSubtotalPrice;
    @FindBy(xpath = "//section[@class='previewCartCheckout']/p")
    private WebElement shoppingCartModalProductCount;
    @FindBy(xpath = "//section[@class='previewCartCheckout']/a[2]")
    private WebElement shoppingCartModalContinueShoppingButton;
    @FindBy(xpath = "//section[@class='previewCartCheckout']/a[3]")
    private WebElement shoppingCartModalViewOrEditCartButton;
    @FindBy(xpath = "//div[@class='productView-details']/h2")
    private WebElement shoppingCartModalProductName;
    @FindBy(xpath = "//div[@class='productView-details']/div[1]")
    private WebElement shoppingCartModalProductBrand;
    @FindBy(xpath = "//div[@class='productView-details']/div[2]")
    private WebElement shoppingCartModalProductUnitPriceAndCount;
    //single product page error box message element
    @FindBy(xpath = "//span[@id='alertBox-message-text']")
    private WebElement singleProductPageErrorBoxMessage;

    public SingleProductPage(WebDriver driver) {super(driver);}

    //input set product quantity into product quantity input field method
    public void inputSetProductQtyIntoQtyInputField(int quantity){
        singleProductPageProductQtyInputField.clear();
        singleProductPageProductQtyInputField.sendKeys(String.valueOf(quantity));
    }

    //click 'Add to cart' button method
    public void clickAddToCartButton(){
        Actions action = new Actions(driver);
        action.moveToElement(singleProductPageAddToCartButton).click().perform();
    }

    //click shopping cart modal 'View or edit cart' button method
    public void clickViewOrEditCartButton(){
        Actions action = new Actions(driver);
        action.moveToElement(shoppingCartModalViewOrEditCartButton).click().perform();
    }

    //single product page product data getters
    public String getSingleProductPageTitle() {return singleProductPageTitle.getText();}
    public String getSingleProductPageProductBrandLinkText(){return singleProductPageBrandLink.getText();}
    public String getSingleProductPageProductUnitPrice(){return singleProductPageProductUnitPrice.getText();}
    public String getSingleProductPageProductWeight(){return singleProductPageProductWeight.getText();}
    public String getSingleProductPageProductGiftWrappingOptionText(){return singleProductPageProductGiftWrappingOption.getText();}
    public String getSingleProductPageProductShippingOption(){return singleProductPageProductShippingOption.getText();}
    public String getSingleProductPageProductDescription(){return singleProductPageProductDescription.getText();}

    //shopping modal product data getters
    public String getShoppingCartModalOrderSubtotalPrice(){return shoppingCartModalOrderSubtotalPrice.getText();}
    public String getShoppingCartModalProductCount(){return shoppingCartModalProductCount.getText();}
    public String getShoppingCartModalProductName(){return shoppingCartModalProductName.getText();}
    public String getShoppingCartModalProductBrand(){return shoppingCartModalProductBrand.getText();}
    public String getShoppingCartModalProductUnitPriceAndCount(){return shoppingCartModalProductUnitPriceAndCount.getText();}

    //single product page text element getters
    public String getSingleProductPageProductWeightSubtext(){return singleProductPageWeightSubtext.getText();}
    public String getSingleProductPageGiftWrappingSubtext(){return singleProductPageGiftWrappingSubtext.getText();}
    public String getSingleProductPageShippingSubtext(){return singleProductPageShippingSubtext.getText();}
    public String getSingleProductPageProductQtySubtext(){return singleProductPageProductQtySubtext.getText();}

    //shopping cart modal text element getters
    public String getShoppingCartModalTitle(){
        String originalText = shoppingCartModalTitle.getText(); //
        String cleanedText = originalText.replaceAll("\\d+", ""); //remove dynamic digit
        return cleanedText.trim();
    }
    public String getShoppingCartModalOrderSubtotalSubtext(){return shoppingCartModalOrderSubtotalSubtext.getText().split("\n")[0];}

    //single product page error box message getter
    public String getSingleProductPageErrorBoxMessage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1500));
        wait.until(ExpectedConditions.visibilityOf(singleProductPageErrorBoxMessage));
        return singleProductPageErrorBoxMessage.getText();
    }

    //single product page web element assert methods
    public boolean isSingleProductPageTitleDisplayed() {return singleProductPageTitle.isDisplayed();}
    public boolean isSingleProductPageMainProductImgDisplayed() {return singleProductPageMainProductImg.isDisplayed();}
    public boolean isSingleProductPageBrandLinkDisplayed() {return singleProductPageBrandLink.isDisplayed();}
    public boolean isSingleProductPageProductUnitPriceDisplayed() {return singleProductPageProductUnitPrice.isDisplayed();}
    public boolean isSingleProductPageReviewCountDisplayed() {return singleProductPageReviewCount.isDisplayed();}
    public boolean isSingleProductPageWriteAReviewLinkDisplayed() {return singleProductPageWriteAReviewLink.isDisplayed();}
    public boolean isSingleProductPageWeightSubtextDisplayed() {return singleProductPageWeightSubtext.isDisplayed();}
    public boolean isSingleProductPageProductWeightDisplayed() {return singleProductPageProductWeight.isDisplayed();}
    public boolean isSingleProductPageGiftWrappingSubtextDisplayed() {return singleProductPageGiftWrappingSubtext.isDisplayed();}
    public boolean isSingleProductPageProductGiftWrappingOptionDisplayed() {return singleProductPageProductGiftWrappingOption.isDisplayed();}
    public boolean isSingleProductPageShippingSubtextDisplayed() {return singleProductPageShippingSubtext.isDisplayed();}
    public boolean isSingleProductPageProductShippingOptionDisplayed() {return singleProductPageProductShippingOption.isDisplayed();}
    public boolean isSingleProductPageProductQtySubtextDisplayed() {return singleProductPageProductQtySubtext.isDisplayed();}
    public boolean isSingleProductPageProductQtyInputFieldDisplayed() {return singleProductPageProductQtyInputField.isDisplayed();}
    public boolean isSingleProductPageIncreaseQtyButtonDisplayed() {return singleProductPageIncreaseQtyButton.isDisplayed();}
    public boolean isSingleProductPageDecreaseQtyButtonDisplayed() {return singleProductPageDecreaseQtyButton.isDisplayed();}
    public boolean isSingleProductPageAddToCartButtonDisplayed() {return singleProductPageAddToCartButton.isDisplayed();}
    public boolean isSingleProductPageAddToWishlistDropdownMenuDisplayed() {return singleProductPageAddToWishlistDropdownMenu.isDisplayed();}
    //social button elements
    public boolean isSingleProductPageFacebookIconButtonDisplayed() {return singleProductPageFacebookIconButton.isDisplayed();}
    public boolean isSingleProductPageMailIconButtonDisplayed() {return singleProductPageMailIconButton.isDisplayed();}
    public boolean isSingleProductPagePrintIconButtonDisplayed() {return singleProductPagePrintIconButton.isDisplayed();}
    public boolean isSingleProductPageXIconButtonDisplayed() {return singleProductPageXIconButton.isDisplayed();}
    //description section
    public boolean isSingleProductPageDescriptionLinkDisplayed() {return singleProductPageDescriptionLink.isDisplayed();}
    public boolean isSingleProductPageProductDescriptionDisplayed() {return singleProductPageProductDescription.isDisplayed();}
    //list elements
    public boolean isSingleProductPageRatingStarDisplayed() {
        return singleProductPageRatingStarElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isSingleProductPageProductImgElementsDisplayed() {
        return singleProductPageProductImgElements.stream()
                .allMatch(WebElement::isDisplayed);
    }

    //shopping cart modal web element assert methods
    public boolean isShoppingCartModalTitleDisplayed() {return shoppingCartModalTitle.isDisplayed();}
    public boolean isShoppingCartModalCloseButtonDisplayed() {return shoppingCartModalCloseButton.isDisplayed();}
    public boolean isShoppingCartModalProductImageDisplayed() {return shoppingCartModalProductImage.isDisplayed();}
    public boolean isShoppingCartModalProceedToCheckoutButtonDisplayed() {return shoppingCartModalProceedToCheckoutButton.isDisplayed();}
    public boolean isShoppingCartModalOrderSubtotalSubtextDisplayed() {return shoppingCartModalOrderSubtotalSubtext.isDisplayed();}
    public boolean isShoppingCartModalOrderSubtotalPriceDisplayed() {return shoppingCartModalOrderSubtotalPrice.isDisplayed();}
    public boolean isShoppingCartModalProductCountDisplayed() {return shoppingCartModalProductCount.isDisplayed();}
    public boolean isShoppingCartModalContinueShoppingButtonDisplayed() {return shoppingCartModalContinueShoppingButton.isDisplayed();}
    public boolean isShoppingCartModalViewOrEditCartButtonDisplayed() {return shoppingCartModalViewOrEditCartButton.isDisplayed();}
    public boolean isShoppingCartModalProductNameDisplayed() {return shoppingCartModalProductName.isDisplayed();}
    public boolean isShoppingCartModalProductBrandDisplayed() {return shoppingCartModalProductBrand.isDisplayed();}
    public boolean isShoppingCartModalProductUnitPriceAndCountDisplayed() {return shoppingCartModalProductUnitPriceAndCount.isDisplayed();}

}
