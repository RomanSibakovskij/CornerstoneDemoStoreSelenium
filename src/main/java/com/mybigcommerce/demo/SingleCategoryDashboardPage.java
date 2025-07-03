package com.mybigcommerce.demo;

import com.mybigcommerce.demo.utilities.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.*;
import java.util.stream.Collectors;

public class SingleCategoryDashboardPage extends BasePage {

    //single category page web elements
    @FindBy(xpath = "//h1")
    private WebElement singleCategoryDashboardPageTitle;
    //aside section
    @FindBy(xpath = "//div[@id='facetedSearch']/div[1]/h2")
    private WebElement singleCategoryDashboardPageRefineBySubtitle;
    //list elements
    @FindBy(xpath = "//ul[@class='inlineList inlineList--labels']/li/a")
    private List <WebElement> singleCategoryDashboardPageRefineByItemClearIconElements;
    //singular elements
    @FindBy(xpath = "//div[@id='facetedSearch']/div[1]/a")
    private WebElement singleCategoryDashboardPageRefineByClearAllLink;
    @FindBy(xpath = "//div[@class='accordion accordion--navList']/div[1]/h2")
    private WebElement singleCategoryDashboardPageBrandSubtitle;
    @FindBy(xpath = "//div[@class='accordion accordion--navList']/div[1]//button")
    private WebElement singleCategoryDashboardPageBrandClearButton;
    @FindBy(xpath = "//div[@class='accordion accordion--navList']/div[3]/h2")
    private WebElement singleCategoryDashboardPageOtherSubtitle;
    @FindBy(xpath = "//div[@class='accordion accordion--navList']/div[3]/h2/button")
    private WebElement singleCategoryDashboardPageOtherSubtitleButton;
    //list elements
    @FindBy(xpath = "//ul[@id='facetedSearch-navList--brand']/li/a")
    private List <WebElement> singleCategoryDashboardPageBrandCheckboxElements;
    //singular elements
    @FindBy(xpath = "//div[@class='accordion accordion--navList']/div[2]/h2")
    private WebElement singleCategoryDashboardPagePriceSubtitle;
    @FindBy(xpath = "//div[@class='accordion accordion--navList']/div[2]//button")
    private WebElement singleCategoryDashboardPagePriceClearButton;
    @FindBy(xpath = "//div[@class='accordion accordion--navList']/div[2]//input[@name='min_price']")
    private WebElement singleCategoryDashboardPagePriceMinInputField;
    @FindBy(xpath = "//div[@class='accordion accordion--navList']/div[2]//input[@name='max_price']")
    private WebElement singleCategoryDashboardPagePriceMaxInputField;
    @FindBy(xpath = "//div[@class='accordion accordion--navList']/div[2]//button[@type='submit']")
    private WebElement singleCategoryDashboardPagePriceUpdateButton;
    //list elements
    @FindBy(xpath = "//ul[@id='facetedSearch-navList--bool']/li/a")
    private List <WebElement> singleCategoryDashboardPageOtherCheckboxElements;
    //main content
    //singular items
    @FindBy(xpath = "//select[@id='sort']")
    private WebElement singleCategoryDashboardPageSortByDropdownMenu;
    @FindBy(xpath = "//select[@id='sort']/option[1]")
    private WebElement singleCategoryDashboardPageSortByFeaturedOption;
    @FindBy(xpath = "//select[@id='sort']/option[2]")
    private WebElement singleCategoryDashboardPageSortByNewestOption;
    @FindBy(xpath = "//select[@id='sort']/option[3]")
    private WebElement singleCategoryDashboardPageSortByBestSellingOption;
    @FindBy(xpath = "//select[@id='sort']/option[4]")
    private WebElement singleCategoryDashboardPageSortByAToZOption;
    @FindBy(xpath = "//select[@id='sort']/option[5]")
    private WebElement singleCategoryDashboardPageSortByZToAOption;
    @FindBy(xpath = "//select[@id='sort']/option[6]")
    private WebElement singleCategoryDashboardPageSortByReviewOption;
    @FindBy(xpath = "//select[@id='sort']/option[7]")
    private WebElement singleCategoryDashboardPageSortByPriceAscOption;
    @FindBy(xpath = "//select[@id='sort']/option[8]")
    private WebElement singleCategoryDashboardPageSortByPriceDescOption;
    //search section elements
    //list elements
    @FindBy(xpath = "//ul[@class='navBar-section account-navigation']/li/a")
    private List <WebElement> singleCategoryDashboardPageSearchLinkListElements;
    //singular elements
    @FindBy(xpath = "//div[@class='search-suggestion']/h5")
    private WebElement singleCategoryDashboardPageCategoriesSubtext;
    @FindBy(xpath = "//div[@class='search-suggestion']//a")
    private WebElement singleCategoryDashboardPageShopAllLink;

    //list elements
    @FindBy(xpath = "//ul[@class='productGrid']/li//img")
    private List <WebElement> singleCategoryDashboardPageProductImgElements;
    @FindBy(xpath = "//ul[@class='productGrid']/li//div[@class='card-figcaption-body']//input")
    private List <WebElement> singleCategoryDashboardPageProductCompareCheckboxElements;
    @FindBy(xpath = "//ul[@class='productGrid']/li//div[@class='card-figcaption-body']/a")
    private List <WebElement> singleCategoryDashboardPageProductAddToCartButtonElements;
    @FindBy(xpath = "//ul[@class='productGrid']/li//p")
    private List <WebElement> singleCategoryDashboardPageProductBrandElements;
    @FindBy(xpath = "//ul[@class='productGrid']/li//h3/a")
    private List <WebElement> singleCategoryDashboardPageProductNameLinkElements;
    @FindBy(xpath = "//ul[@class='productGrid']/li//div[@class='price-section price-section--withoutTax rrp-price--withoutTax']/span[2]")
    private List <WebElement> singleCategoryDashboardPageProductMSRPPriceElements;
    @FindBy(xpath = "//ul[@class='productGrid']/li//div[@class='price-section price-section--withoutTax price--withoutTax']")
    private List <WebElement> singleCategoryDashboardPageProductUnitPriceElements;

    public SingleCategoryDashboardPage(WebDriver driver) {super(driver);}

    //click "Other" dropdown link method
    public void clickOtherDropdownButton(){
        Actions action = new Actions(driver);
        action.moveToElement(singleCategoryDashboardPageOtherSubtitleButton).click().perform();
    }

    //click "Sort by" dropdown menu method
    public void clickSortByDropdownMenu(){
        Actions action = new Actions(driver);
        action.moveToElement(singleCategoryDashboardPageSortByDropdownMenu).click().perform();
    }

    //select "Sort by featured" (default) option method
    public void selectSortByFeaturedOption(){singleCategoryDashboardPageSortByFeaturedOption.click();}
    //select "Sort by newest" option method
    public void selectSortByNewestOption(){singleCategoryDashboardPageSortByNewestOption.click();}
    //select "Sort by bestselling" option method
    public void selectSortByBestSellingOption(){singleCategoryDashboardPageSortByBestSellingOption.click();}
    //select "Sort by Name A to Z" option method
    public void selectSortByAToZOption(){singleCategoryDashboardPageSortByAToZOption.click();}
    //select "Sort by Name Z to A" option method
    public void selectSortByZToAOption(){singleCategoryDashboardPageSortByZToAOption.click();}
    //select "Sort by review" option method
    public void selectSortByReviewOption(){singleCategoryDashboardPageSortByReviewOption.click();}
    //select "Sort by price (ascending)" option method
    public void selectSortByPriceAscOption(){singleCategoryDashboardPageSortByPriceAscOption.click();}
    //select "Sort by price (descending)" option method
    public void selectSortByPriceDescOption(){singleCategoryDashboardPageSortByPriceDescOption.click();}

    //hover over set product image method
    public void hoverOverSetProductImg(int index){
        Actions action = new Actions(driver);
        action.moveToElement(singleCategoryDashboardPageProductImgElements.get(index)).perform();
    }

    //click set product add to cart button method
    public void clickSetProductAddToCartButton(int index){
        Actions action = new Actions(driver);
        action.moveToElement(singleCategoryDashboardPageProductAddToCartButtonElements.get(index)).click().perform();
    }

    //click set product brand checkbox method
    public void clickSetProductBrandCheckbox(int index){
        Actions action = new Actions(driver);
        action.moveToElement(singleCategoryDashboardPageBrandCheckboxElements.get(index)).click().perform();
    }

    //single category dashboard page text element getters
    public String getSingleCategoryDashboardPageTitle() {return singleCategoryDashboardPageTitle.getText();}
    public String getSingleCategoryDashboardPageRefinedBySubtitle(){return singleCategoryDashboardPageRefineBySubtitle.getText();}
    public String getSingleCategoryDashboardPageBrandSubtitle() {return singleCategoryDashboardPageBrandSubtitle.getText();}
    public String getSingleCategoryDashboardPagePriceSubtitle() {return singleCategoryDashboardPagePriceSubtitle.getText();}
    public String getSingleCategoryDashboardPageSearchCategoriesSubtext(){return singleCategoryDashboardPageCategoriesSubtext.getText();}

    //list elements
    public List<String> getSingleCategoryDashboardPageBrandSubtext(){return singleCategoryDashboardPageBrandCheckboxElements.stream().map(WebElement::getText).collect(Collectors.toList());} //there are no actual checkboxes, just the links
    public List<String> getSingleCategoryDashboardPageOtherSubtext(){return singleCategoryDashboardPageOtherCheckboxElements.stream().map(WebElement::getText).collect(Collectors.toList());} //there are no actual checkboxes, just the links

    //product data getters
    public List<String> getSingleCategoryDashboardPageProductBrand(){return singleCategoryDashboardPageProductBrandElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getSingleCategoryDashboardPageProductName(){return singleCategoryDashboardPageProductNameLinkElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getSingleCategoryDashboardPageProductMSRPPrice(){return singleCategoryDashboardPageProductMSRPPriceElements.stream().map(WebElement::getText).filter(text -> !text.isEmpty()).collect(Collectors.toList());}
    public List<String> getSingleCategoryDashboardPageProductUnitPrice(){return singleCategoryDashboardPageProductUnitPriceElements.stream().map(WebElement::getText).collect(Collectors.toList());}

    //single category dashboard page web element assert methods
    public boolean isSingleCategoryDashboardPageTitleDisplayed() {return singleCategoryDashboardPageTitle.isDisplayed();}
    public boolean isSingleCategoryDashboardPageRefineBySubtitleDisplayed() {return singleCategoryDashboardPageRefineBySubtitle.isDisplayed();}
    public boolean isSingleCategoryDashboardPageRefineByClearAllLinkDisplayed() {return singleCategoryDashboardPageRefineByClearAllLink.isDisplayed();}
    public boolean isSingleCategoryDashboardPageBrandSubtitleDisplayed() {return singleCategoryDashboardPageBrandSubtitle.isDisplayed();}
    public boolean isSingleCategoryDashboardPageBrandClearButtonDisplayed() {return singleCategoryDashboardPageBrandClearButton.isDisplayed();}
    public boolean isSingleCategoryDashboardPagePriceSubtitleDisplayed() {return singleCategoryDashboardPagePriceSubtitle.isDisplayed();}
    public boolean isSingleCategoryDashboardPagePriceMinInputFieldDisplayed() {return singleCategoryDashboardPagePriceMinInputField.isDisplayed();}
    public boolean isSingleCategoryDashboardPagePriceMaxInputFieldDisplayed() {return singleCategoryDashboardPagePriceMaxInputField.isDisplayed();}
    public boolean isSingleCategoryDashboardPagePriceUpdateButtonDisplayed() {return singleCategoryDashboardPagePriceUpdateButton.isDisplayed();}
    public boolean isSingleCategoryDashboardPageOtherSubtitleDisplayed() {return singleCategoryDashboardPageOtherSubtitle.isDisplayed();}
    public boolean isSingleCategoryDashboardPageSortByDropdownMenuDisplayed() {return singleCategoryDashboardPageSortByDropdownMenu.isDisplayed();}

    //list elements

    public boolean isSingleCategoryDashboardPageRefineByItemClearIconDisplayed() {
        return singleCategoryDashboardPageRefineByItemClearIconElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isSingleCategoryDashboardPageBrandCheckboxDisplayed() {
        return singleCategoryDashboardPageBrandCheckboxElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isSingleCategoryDashboardPageOtherCheckboxDisplayed() {
        return singleCategoryDashboardPageOtherCheckboxElements.stream()
                .allMatch(WebElement::isDisplayed);
    }

    //product list elements
    public boolean isSingleCategoryDashboardPageProductImgDisplayed() {
        return singleCategoryDashboardPageProductImgElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isSingleCategoryDashboardPageProductBrandDisplayed() {
        return singleCategoryDashboardPageProductBrandElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isSingleCategoryDashboardPageProductNameLinkDisplayed() {
        return singleCategoryDashboardPageProductNameLinkElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isSingleCategoryDashboardPageProductUnitPriceDisplayed() {
        return singleCategoryDashboardPageProductUnitPriceElements.stream()
                .allMatch(WebElement::isDisplayed);
    }

    //search page section elements
    public boolean isSingleCategoryDashboardPageCategoriesSubtextDisplayed() {return singleCategoryDashboardPageCategoriesSubtext.isDisplayed();}
    public boolean isSingleCategoryDashboardPageShopAllLinkDisplayed() {return singleCategoryDashboardPageShopAllLink.isDisplayed();}

    public boolean isSingleCategoryDashboardPageSearchLinkListDisplayed() {
        return singleCategoryDashboardPageSearchLinkListElements.stream()
                .allMatch(WebElement::isDisplayed);
    }

}
