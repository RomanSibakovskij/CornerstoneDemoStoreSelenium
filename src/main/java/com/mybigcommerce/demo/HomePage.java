package com.mybigcommerce.demo;

import com.mybigcommerce.demo.utilities.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.*;
import java.util.stream.Collectors;

public class HomePage extends BasePage {

    //home page web elements
    //carousel section
    @FindBy(xpath = "//section[@class='heroCarousel slick-initialized slick-slider slick-dotted']/div/div//img[@class=' heroCarousel-image']")
    private List<WebElement> homePageCarouselImageElements;
    @FindBy(xpath = "//section[@class='heroCarousel slick-initialized slick-slider slick-dotted']/button[@class='slick-prev slick-arrow']")
    private WebElement homePageCarouselPrevButton;
    @FindBy(xpath = "//section[@class='heroCarousel slick-initialized slick-slider slick-dotted']/button[@class='slick-next slick-arrow']")
    private WebElement homePageCarouselNextButton;
    @FindBy(xpath = "//section[@class='heroCarousel slick-initialized slick-slider slick-dotted']/button[@class='carousel-play-pause-button']")
    private WebElement homePageCarouselPauseButton;
    @FindBy(xpath = "//p[@class='heroCarousel-title']")
    private List <WebElement> homePageCarouselImgTitle;
    @FindBy(xpath = "//p[@class='heroCarousel-description']")
    private List <WebElement> homePageCarouselImgSubtitle;
    @FindBy(xpath = "//a[@class='heroCarousel-action button button--primary button--large']")
    private List <WebElement> homePageCarouselShopNowButton;
    //most popular products section
    @FindBy(xpath = "//div[@class='main full']/h2[1]")
    private WebElement homePageMostPopularSectionTitle;
    //list elements
    @FindBy(xpath = "//ul[@class='productGrid productGrid--maxCol4']/li//img")
    private List <WebElement> homePageMostPopularProductImgElements;
    @FindBy(xpath = "//ul[@class='productGrid productGrid--maxCol4']/li//p")
    private List <WebElement> homePageMostPopularProductCategoryTagElements;
    @FindBy(xpath = "//ul[@class='productGrid productGrid--maxCol4']/li//h3/a")
    private List <WebElement> homePageMostPopularProductNameLinkElements;
    @FindBy(xpath = "//ul[@class='productGrid productGrid--maxCol4']/li//div[@class='price-section price-section--withoutTax price--withoutTax']/span[@class='price']")
    private List <WebElement> homePageMostPopularProductUnitPriceElements;
    @FindBy(xpath = "//ul[@class='productGrid productGrid--maxCol4']//div[@class='card-figcaption-body']/a")
    private List <WebElement> homePageMostPopularProductAddToCartButtonElements;
    //new products section
    @FindBy(xpath = "//h2[@class='page-heading'][2]")
    private WebElement homePageNewProductsSectionTitle;
    @FindBy(xpath = "//section[@class='productCarousel slick-initialized slick-slider slick-dotted']/button[1]")
    private WebElement homePageNewProductsPrevButton;
    @FindBy(xpath = "//section[@class='productCarousel slick-initialized slick-slider slick-dotted']/button[2]")
    private WebElement homePageNewProductsNextButton;
    @FindBy(xpath = "//section[@class='productCarousel slick-initialized slick-slider slick-dotted']/ul/li[1]//button")
    private WebElement homePageNewProductsPageOneButton;
    @FindBy(xpath = "//section[@class='productCarousel slick-initialized slick-slider slick-dotted']/ul/li[2]//button")
    private WebElement homePageNewProductsPageTwoButton;
    //list elements
    @FindBy(xpath = "//section[@class='productCarousel slick-initialized slick-slider slick-dotted']/div/div//img")
    private List <WebElement> homePageNewProductImgElements;
    @FindBy(xpath = "//section[@class='productCarousel slick-initialized slick-slider slick-dotted']/div/div//p[@class='card-text']")
    private List <WebElement> homePageNewProductCategoryTagElements;
    @FindBy(xpath = "//section[@class='productCarousel slick-initialized slick-slider slick-dotted']/div/div//h3/a")
    private List <WebElement> homePageNewProductNameLinkElements;
    @FindBy(xpath = "//section[@class='productCarousel slick-initialized slick-slider slick-dotted']/div/div//div[@class='price-section price-section--withoutTax price--withoutTax']//span[@class='price']")
    private List <WebElement> homePageNewProductUnitPriceElements;
    @FindBy(xpath = "//section[@class='productCarousel slick-initialized slick-slider slick-dotted']//div[@class='card-figcaption-body']/a")
    private List <WebElement> homePageNewProductAddToCartButtonElements;
    //banner element
    @FindBy(xpath = "//div[@class='banner']//a")
    private WebElement homePageBannerLink;

    public HomePage(WebDriver driver) {super(driver);}

    //hover over most popular products image method
    public void hoverOverMostPopularProductImg(int index){
        Actions action = new Actions(driver);
        action.moveToElement(homePageMostPopularProductImgElements.get(index)).perform();
    }

    //click set 'Most popular products' add to cart button method
    public void clickMostPopularProductAddToCartButton(int index){
        Actions action = new Actions(driver);
        action.moveToElement(homePageMostPopularProductAddToCartButtonElements.get(index)).click().perform();
    }

    //click set 'Most popular products' product name link method
    public void clickMostPopularProductNameLink(int index){
        Actions action = new Actions(driver);
        action.moveToElement(homePageMostPopularProductNameLinkElements.get(index)).click().perform();
    }

    //hover over new products image method
    public void hoverOverNewProductImg(int index){
        Actions action = new Actions(driver);
        action.moveToElement(homePageNewProductImgElements.get(index)).perform();
    }

    //click set 'New products' add to cart button method
    public void clickNewProductAddToCartButton(int index){
        Actions action = new Actions(driver);
        action.moveToElement(homePageNewProductAddToCartButtonElements.get(index)).click().perform();
    }

    //click set 'New products' product name link method
    public void clickNewProductNameLinkButton(int index){
        Actions action = new Actions(driver);
        action.moveToElement(homePageNewProductNameLinkElements.get(index)).click().perform();
    }

    //home page product data getters
    //most popular section
    public List<String> getHomePageMostPopularCategoryTag(){return homePageMostPopularProductCategoryTagElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getHomePageMostPopularProductName(){return homePageMostPopularProductNameLinkElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getHomePageMostPopularProductUnitPrice(){return homePageMostPopularProductNameLinkElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    //new products section
    public List<String> getHomePageNewProductCategoryTag(){return homePageNewProductCategoryTagElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getHomePageNewProductName(){return homePageNewProductNameLinkElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getHomePageNewProductUnitPrice(){return homePageNewProductUnitPriceElements.stream().map(WebElement::getText).collect(Collectors.toList());}

    //home page text element getters
    public List<String> getHomePageCarouselImageTitle() {return homePageCarouselImgTitle.stream().map(WebElement::getText).map(String::trim).filter(s -> !s.isEmpty()).collect(Collectors.toList());}
    public List<String> getHomePageCarouselImageSubtitle() {return homePageCarouselImgSubtitle.stream().map(WebElement::getText).map(String::trim).filter(s -> !s.isEmpty()).collect(Collectors.toList());}
    public String getHomePageMostPopularSectionTitle() {return homePageMostPopularSectionTitle.getText();}
    public String getHomePageNewProductsSectionTitle() {return homePageNewProductsSectionTitle.getText();}
    public String getHomePageBannerLinkText() {return homePageBannerLink.getText();}

    //homepage web element assert methods
    //carousel section
    public boolean isHomePageCarouselImgDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1300));
        wait.until(ExpectedConditions.visibilityOf(homePageCarouselImageElements.getFirst()));
        return homePageCarouselImageElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    //singular elements
    public boolean isHomePageCarouselPrevButtonDisplayed() {return homePageCarouselPrevButton.isDisplayed();}
    public boolean isHomePageCarouselNextButtonDisplayed() {return homePageCarouselNextButton.isDisplayed();}
    public boolean isHomePageCarouselPauseButtonDisplayed() {return homePageCarouselPauseButton.isDisplayed();}
    //list elements
    public boolean isHomePageCarouselImgTitleDisplayed() {
        return homePageCarouselImgTitle.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isHomePageCarouselImgSubtitleDisplayed() {
        return homePageCarouselImgSubtitle.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isHomePageCarouselIShopNowButtonDisplayed() {
        return homePageCarouselShopNowButton.stream()
                .allMatch(WebElement::isDisplayed);
    }
    //most popular products section
    public boolean isHomePageMostPopularSectionTitleDisplayed() {return homePageMostPopularSectionTitle.isDisplayed();}
    //list elements
    public boolean isHomePageMostPopularProductImgDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1300));
        wait.until(ExpectedConditions.visibilityOfAllElements(homePageMostPopularProductImgElements));
        return homePageMostPopularProductImgElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isHomePageMostPopularProductCategoryTagDisplayed() {
        return homePageMostPopularProductCategoryTagElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isHomePageMostPopularProductNameLinkDisplayed() {
        return homePageMostPopularProductNameLinkElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isHomePageMostPopularProductUnitPriceDisplayed() {
        return homePageMostPopularProductUnitPriceElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    //new products section
    public boolean isHomePageNewProductsSectionTitleDisplayed() {return homePageNewProductsSectionTitle.isDisplayed();}
    public boolean isHomePageNewProductsPrevButtonDisplayed() {return homePageNewProductsPrevButton.isDisplayed();}
    public boolean isHomePageNewProductsNextButtonDisplayed() {return homePageNewProductsNextButton.isDisplayed();}
    public boolean isHomePageNewProductsPageOneButtonDisplayed() {return homePageNewProductsPageOneButton.isDisplayed();}
    public boolean isHomePageNewProductsPageTwoButtonDisplayed() {return homePageNewProductsPageTwoButton.isDisplayed();}
    //list elements
    public boolean isHomePageNewProductImgDisplayed() {
        return homePageNewProductImgElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isHomePageNewProductCategoryTagDisplayed() {
        return homePageNewProductCategoryTagElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isHomePageNewProductNameLinkDisplayed() {
        return homePageNewProductNameLinkElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isHomePageNewProductUnitPriceDisplayed() {
        return homePageNewProductUnitPriceElements.stream()
                .allMatch(WebElement::isDisplayed);
    }

    public boolean isHomePageBannerLinkDisplayed() {return homePageBannerLink.isDisplayed();}

}
