package com.mybigcommerce.demo;

import com.mybigcommerce.demo.utilities.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

import java.util.*;
import java.util.stream.Collectors;

import java.time.Duration;

public class AddressDashboardPage extends BasePage {

    //address dashboard page main content web elements (list)
    @FindBy(xpath = "//ul[@class='addressList']/li//div[@class='panel-body']/h5")
    private List<WebElement> addressDashboardPageAddressUserNameElements;
    @FindBy(xpath = "//ul[@class='address-details address-details--postal']/li")
    private List<WebElement> addressDashboardPageAddressDetailsElements;
    @FindBy(xpath = "//dl[@class='address-details']")
    private List<WebElement> addressDashboardPageAddressPhoneElements;
    @FindBy(xpath = "//div[@class='form-actions']/a")
    private List<WebElement> addressDashboardPageAddressEditButton;
    @FindBy(xpath = "//div[@class='form-actions']/button")
    private List<WebElement> addressDashboardPageAddressDeleteButton;
    //singular elements
    @FindBy(xpath = "//h2[@class='page-heading']")
    private WebElement addressDashboardPageTitle;
    @FindBy(xpath = "//a[@class='panel panel--address panel--newAddress']")
    private WebElement newAddressLink;

    public AddressDashboardPage(WebDriver driver) {super(driver);}

    //click 'New address' link method
    public void clickNewAddressLink(){newAddressLink.click();}

    //click 'Edit' address button method
    public void clickEditAddressButton(int index) {
        WebElement button = addressDashboardPageAddressEditButton.get(index);
        Actions action = new Actions(driver);
        action.moveToElement(button).click().perform();
    }

    //click 'Delete' address button method
    public void clickDeleteAddressButton(int index) {
        WebElement button = addressDashboardPageAddressDeleteButton.get(index);
        Actions action = new Actions(driver);
        action.moveToElement(button).click().perform();
    }

    //user address removal alert accept method
    public void confirmUserAddressRemoval(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1700));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    //account dashboard page text element getters
    public String getAddressDashboardPageTitle(){return addressDashboardPageTitle.getText();}
    public List<String> getAccountAddressUserName() {return addressDashboardPageAddressUserNameElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getAccountAddressDetails() {return addressDashboardPageAddressDetailsElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getAccountAddressPhone() {return addressDashboardPageAddressPhoneElements.stream().map(WebElement::getText).collect(Collectors.toList());}

    //address dashboard page web element assert methods
    public boolean isAddressDashboardPageAddressUserNameDisplayed() {
        return addressDashboardPageAddressUserNameElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isAddressDashboardPageAddressDetailsDisplayed() {
        return addressDashboardPageAddressDetailsElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isAddressDashboardPageAddressPhoneDisplayed() {
        return addressDashboardPageAddressPhoneElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isAddressDashboardPageAddressEditButtonDisplayed() {
        return addressDashboardPageAddressEditButton.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isAddressDashboardPageAddressDeleteButtonDisplayed() {
        return addressDashboardPageAddressDeleteButton.stream()
                .allMatch(WebElement::isDisplayed);
    }

}
