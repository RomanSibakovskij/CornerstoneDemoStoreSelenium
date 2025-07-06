package com.mybigcommerce.demo;

import com.mybigcommerce.demo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.*;
import java.util.stream.Collectors;

public class AddReviewModalPage extends BasePage{

    //add review page web elements
    @FindBy(xpath = "//div[@class='modal-header']/h2")
    private WebElement addReviewPageModalTitle;
    @FindBy(xpath = "//div[@class='modal-header']/button")
    private WebElement addReviewPageModalCloseButton;
    @FindBy(xpath = "//div[@class='writeReview-productDetails']//img")
    private WebElement addReviewPageModalProductImage;
    @FindBy(xpath = "//div[@class='writeReview-productDetails']//h6")
    private WebElement addReviewPageModalProductBrand;
    @FindBy(xpath = "//div[@class='writeReview-productDetails']//h5")
    private WebElement addReviewPageModalProductName;
    //input form
    @FindBy(xpath = "//fieldset[@class='form-fieldset']//label[@for='rating-rate']")
    private WebElement addReviewPageModalRatingSubtext;
    @FindBy(xpath = "//fieldset[@class='form-fieldset']//select")
    private WebElement addReviewPageModalRatingDropdownMenu;
    @FindBy(xpath = "//fieldset[@class='form-fieldset']//select/option")
    private List<WebElement> addReviewPageModalRatingStarOptionElements;
    @FindBy(xpath = "//fieldset[@class='form-fieldset']//label[@for='revfromname_input']")
    private WebElement addReviewPageModalNameSubtext;
    @FindBy(xpath = "//fieldset[@class='form-fieldset']//input[@id='revfromname_input']")
    private WebElement addReviewPageModalNameInputField;
    @FindBy(xpath = "//fieldset[@class='form-fieldset']//label[@for='email_input']")
    private WebElement addReviewPageModalEmailSubtext;
    @FindBy(xpath = "//fieldset[@class='form-fieldset']//input[@id='email_input']")
    private WebElement addReviewPageModalEmailInputField;
    @FindBy(xpath = "//fieldset[@class='form-fieldset']//label[@for='revtitle_input']")
    private WebElement addReviewPageModalReviewSubjectSubtext;
    @FindBy(xpath = "//fieldset[@class='form-fieldset']//input[@id='revtitle_input']")
    private WebElement addReviewPageModalReviewSubjectInputField;
    @FindBy(xpath = "//fieldset[@class='form-fieldset']//label[@for='revtext_input']")
    private WebElement addReviewPageModalCommentsSubtext;
    @FindBy(xpath = "//fieldset[@class='form-fieldset']//textarea[@id='revtext_input']")
    private WebElement addReviewPageModalCommentsTextArea;
    @FindBy(xpath = "//small")
    private List<WebElement> addReviewPageModalNameRequiredTagElements;
    @FindBy(xpath = "//fieldset[@class='form-fieldset']//input[@class='button button--primary']")
    private WebElement addReviewPageModalSubmitReviewButton;

    public AddReviewModalPage(WebDriver driver) {super(driver);}

    //add review page text element getters
    public String getAddReviewPageModalTitle() {return addReviewPageModalTitle.getText();}
    public String getAddReviewPageModalRatingSubtext() {return addReviewPageModalRatingSubtext.getText().trim().split("\\n")[0];}
    public String getAddReviewPageModalNameSubtext() {return addReviewPageModalNameSubtext.getText().trim().split("\\n")[0];}
    public String getAddReviewPageModalEmailSubtext() {return addReviewPageModalEmailSubtext.getText().trim().split("\\n")[0];}
    public String getAddReviewPageModalReviewSubjectSubtext() {return addReviewPageModalReviewSubjectSubtext.getText().trim().split("\\n")[0];}
    public String getAddReviewPageModalCommentsSubtext() {return addReviewPageModalCommentsSubtext.getText().trim().split("\\n")[0];}
    public List <String> getAddReviewPageModalRequiredTag(){return addReviewPageModalNameRequiredTagElements.stream().map(WebElement::getText).collect(Collectors.toList());}

    //add review page web element assert methods
    public boolean isAddReviewPageModalTitleDisplayed() {return addReviewPageModalTitle.isDisplayed();}
    public boolean isAddReviewPageModalCloseButtonDisplayed() {return addReviewPageModalCloseButton.isDisplayed();}
    public boolean isAddReviewPageModalProductImageDisplayed() {return addReviewPageModalProductImage.isDisplayed();}
    public boolean isAddReviewPageModalProductBrandDisplayed() {return addReviewPageModalProductBrand.isDisplayed();}
    public boolean isAddReviewPageModalProductNameDisplayed() {return addReviewPageModalProductName.isDisplayed();}
    public boolean isAddReviewPageModalRatingSubtextDisplayed() {return addReviewPageModalRatingSubtext.isDisplayed();}
    public boolean isAddReviewPageModalRatingDropdownMenuDisplayed() {return addReviewPageModalRatingDropdownMenu.isDisplayed();}
    public boolean isAddReviewPageModalNameSubtextDisplayed() {return addReviewPageModalNameSubtext.isDisplayed();}
    public boolean isAddReviewPageModalNameInputFieldDisplayed() {return addReviewPageModalNameInputField.isDisplayed();}
    public boolean isAddReviewPageModalEmailSubtextDisplayed() {return addReviewPageModalEmailSubtext.isDisplayed();}
    public boolean isAddReviewPageModalEmailInputFieldDisplayed() {return addReviewPageModalEmailInputField.isDisplayed();}
    public boolean isAddReviewPageModalReviewSubjectSubtextDisplayed() {return addReviewPageModalReviewSubjectSubtext.isDisplayed();}
    public boolean isAddReviewPageModalReviewSubjectInputFieldDisplayed() {return addReviewPageModalReviewSubjectInputField.isDisplayed();}
    public boolean isAddReviewPageModalCommentsSubtextDisplayed() {return addReviewPageModalCommentsSubtext.isDisplayed();}
    public boolean isAddReviewPageModalCommentsInputFieldDisplayed() {return addReviewPageModalCommentsTextArea.isDisplayed();}
    public boolean isAddReviewPageModalSubmitReviewButtonDisplayed() {return addReviewPageModalSubmitReviewButton.isDisplayed();}
    //list elements
    public boolean isAddReviewPageModalNameRequiredTagDisplayed() {
        return addReviewPageModalNameRequiredTagElements.stream()
                .allMatch(WebElement::isDisplayed);
    }

}
