package com.mybigcommerce.demo;

import com.mybigcommerce.demo.utilities.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.*;
import java.util.stream.Collectors;

public class AddToCompareListPage extends BasePage {

    //add to compare list page web elements
    @FindBy(xpath = "//h1")
    private WebElement addToCompareListPageTitle;
    @FindBy(xpath = "//table[@class='compareTable']/tbody/tr[3]/th")
    private WebElement addToCompareListPageDescriptionSubtext;
    @FindBy(xpath = "//table[@class='compareTable']/tbody/tr[4]/th")
    private WebElement addToCompareListPageRatingSubtext;
    @FindBy(xpath = "//table[@class='compareTable']/tbody/tr[5]/th")
    private WebElement addToCompareListPageAvailabilitySubtext;
    @FindBy(xpath = "//table[@class='compareTable']/tbody/tr[6]/th")
    private WebElement addToCompareListPageOtherDetailsSubtext;
    //list elements
    @FindBy(xpath = "//table[@class='compareTable']/tbody/tr[1]/th//a[@class='compareTable-removeProduct']")
    private List <WebElement> addToCompareListPageProductRemoveButtonElements;
    @FindBy(xpath = "//table[@class='compareTable']/tbody/tr[1]/th//img")
    private List <WebElement> addToCompareListPageProductImgElements;
    @FindBy(xpath = "//table[@class='compareTable']/tbody/tr[1]/th//p[@class='card-text']/a")
    private List <WebElement> addToCompareListPageProductBrandLinkElements;
    @FindBy(xpath = "//table[@class='compareTable']/tbody/tr[1]/th//h3[@class='card-title']/a")
    private List <WebElement> addToCompareListPageProductNameLinkElements;
    @FindBy(xpath = "//table[@class='compareTable']/tbody/tr[1]/th//div[@class='price-section price-section--withoutTax price--withoutTax']/span[3]")
    private List <WebElement> addToCompareListPageProductUnitPriceElements;
    @FindBy(xpath = "//table[@class='compareTable']/tbody/tr[2]/td[@class='compareTable-action']/a")
    private List <WebElement> addToCompareListPageProductAddToCartButtonElements;
    @FindBy(xpath = "//table[@class='compareTable']/tbody/tr[3]/td[@class='compareTable-item']")
    private List <WebElement> addToCompareListPageProductDescriptionElements;
    @FindBy(xpath = "//table[@class='compareTable']/tbody/tr[4]/td[@class='compareTable-item']")
    private List <WebElement> addToCompareListPageProductRatingElements;
    @FindBy(xpath = "//table[@class='compareTable']/tbody/tr[5]/td[@class='compareTable-item']")
    private List <WebElement> addToCompareListPageProductAvailabilityElements;
    @FindBy(xpath = "//table[@class='compareTable']/tbody/tr[6]/td[@class='compareTable-item']")
    private List <WebElement> addToCompareListPageProductOtherDetailsElements;
    //product removal from compare list modal element
    @FindBy(xpath = "//div[@class='modal-content']/span")
    private WebElement addToCompareListRemovalFailureMessage;

    public AddToCompareListPage(WebDriver driver) {super(driver);}

    //click set product "Add to cart" button method
    public void clickSetAddToCartButton(int index){
        Actions action = new Actions(driver);
        action.moveToElement(addToCompareListPageProductAddToCartButtonElements.get(index)).click().perform();
    }

    //add to compare page text element getters
    public String getAddToCompareListPageTitle() {return addToCompareListPageTitle.getText();}
    public String getAddToCompareListPageDescriptionSubtext() {return addToCompareListPageDescriptionSubtext.getText();}
    public String getAddToCompareListPageRatingSubtext() {return addToCompareListPageRatingSubtext.getText();}
    public String getAddToCompareListPageAvailabilitySubtext() {return addToCompareListPageAvailabilitySubtext.getText();}
    public String getAddToCompareListPageOtherDetailsSubtext() {return addToCompareListPageOtherDetailsSubtext.getText();}

    //product removal from compare list failure message getter
    public String getAddToCompareListPageProductRemovalFailureMessage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(3000));
        wait.until(ExpectedConditions.visibilityOf(addToCompareListRemovalFailureMessage));
        return addToCompareListRemovalFailureMessage.getText();
    }

    //add to compare list product data getters
    public List<String> getAddToCompareListPageProductBrand() {return addToCompareListPageProductBrandLinkElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getAddToCompareListPageProductName() {return addToCompareListPageProductNameLinkElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getAddToCompareListPageProductUnitPrice() {return addToCompareListPageProductUnitPriceElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getAddToCompareListPageProductDescription() {return addToCompareListPageProductDescriptionElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getAddToCompareListPageProductRating() {return addToCompareListPageProductRatingElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getAddToCompareListPageProductAvailability() {return addToCompareListPageProductAvailabilityElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getAddToCompareListPageProductOtherDetails(){return addToCompareListPageProductOtherDetailsElements.stream().map(WebElement::getText).collect(Collectors.toList());}

    //add to compare list page web element assert methods
    public boolean isAddToCompareListPageTitleDisplayed() {return addToCompareListPageTitle.isDisplayed();}
    public boolean isAddToCompareListPageDescriptionSubtextDisplayed() {return addToCompareListPageDescriptionSubtext.isDisplayed();}
    public boolean isAddToCompareListPageRatingSubtextDisplayed() {return addToCompareListPageRatingSubtext.isDisplayed();}
    public boolean isAddToCompareListPageAvailabilitySubtextDisplayed() {return addToCompareListPageAvailabilitySubtext.isDisplayed();}
    public boolean isAddToCompareListPageOtherDetailsSubtextDisplayed() {return addToCompareListPageOtherDetailsSubtext.isDisplayed();}
    //list elements
    public boolean isAddToCompareListPageProductRemoveButtonDisplayed() {
        return addToCompareListPageProductRemoveButtonElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isAddToCompareListPageProductImgDisplayed() {
        return addToCompareListPageProductImgElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isAddToCompareListPageProductBrandLinkDisplayed() {
        return addToCompareListPageProductBrandLinkElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isAddToCompareListPageProductNameLinkDisplayed() {
        return addToCompareListPageProductNameLinkElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isAddToCompareListPageProductUnitPriceDisplayed() {
        return addToCompareListPageProductUnitPriceElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isAddToCompareListPageProductAddToCartButtonDisplayed() {
        return addToCompareListPageProductAddToCartButtonElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isAddToCompareListPageProductDescDisplayed() {
        return addToCompareListPageProductDescriptionElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isAddToCompareListPageProductRatingDisplayed() {
        return addToCompareListPageProductRatingElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isAddToCompareListPageProductAvailabilityDisplayed() {
        return addToCompareListPageProductAvailabilityElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isAddToCompareListPageProductOtherDetailsDisplayed() {
        return addToCompareListPageProductOtherDetailsElements.stream()
                .allMatch(WebElement::isDisplayed);
    }

}
