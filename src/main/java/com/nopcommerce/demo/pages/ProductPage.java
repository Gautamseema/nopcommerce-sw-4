package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ProductPage extends Utility {
    /****ComputerTest***/
    By buildYourOwnComputerText = By.xpath("//h1[contains(text(),'Build your own computer')]");
    By processorOfBuildYourOwnComputer = By.id("product_attribute_1");
    By ramOfBuildYourOwnComputer = By.id("product_attribute_2");
    By hddOfBuildYourOwnComputer = By.id("product_attribute_3_7");
    By osOfBuildYourOwnComputer = By.id("product_attribute_4_9");

    By softwareOfBuildYourOwnComputer = By.id("product_attribute_5_12");
    By priceOfTotalText = By.id("price-value-1");
    By addToCartButton = By.xpath("//button[@id='add-to-cart-button-1']");
    By productAddToCartMessage = By.xpath("//p[@class='content']");
    By closePopUP = By.xpath("//span[@title='Close']");
    By shoppingCartLinkAndGoToCart = By.xpath("//span[@class='cart-label']");

    public String verifyTitleOfBuildYourOwnComputer() {
        return getTextFromElement(buildYourOwnComputerText);
    }

    public void selectProcessorOfBuildYourOwnComputer(String processor) {
        selectByVisibleTextFromDropDown(processorOfBuildYourOwnComputer, processor);
    }

    public void selectRamOfBuildYourOwnComputer(String ram) {
        selectByVisibleTextFromDropDown(ramOfBuildYourOwnComputer, ram);
    }

    public void clickOnHddOfBuildYourOwnComputer() {
        clickOnElement(hddOfBuildYourOwnComputer);
    }

    public void clickOnOsOfBuildYourOwnComputer() {
        clickOnElement(osOfBuildYourOwnComputer);
    }

    public void clickOnSoftwareOfBuildYourOwnComputer() {
        clickOnElement(softwareOfBuildYourOwnComputer);
    }

    public String verifyPriceOfBuildYourOwnComputer() {
        return getTextFromElement(priceOfTotalText);
    }

    public void pressAddToCart() {
        clickOnElement(addToCartButton);
    }

    public String verifyMassageOfProductAddedToCart() {
        return getTextFromElement(productAddToCartMessage);
    }

    public void clickOnCloseBar() {
        clickOnElement(closePopUP);
    }

    public void mouseHoverOnShoppingCartLinkAndClickOnGoToCartButton() {
        mouseHoverToElementAndClick(shoppingCartLinkAndGoToCart);

    }
//___________ElectronicsTest___________//

   By nokiaLumiaText = By.xpath("//h1[normalize-space()='Nokia Lumia 1020']");
    By priceTextOfNokiaLumia = By.xpath("//span[@id='price-value-20']");
    static By qtyTextBox = By.id("product_enteredQuantity_20");
    By addToCartTab = By.xpath("//button[@id='add-to-cart-button-20']");
    By CartMassage = By.xpath("//p[@class='content']");
    By closeCrossButton = By.xpath("//span[@title='Close']");
    By shoppingCartLinkAndClickOnGoTOCart = By.xpath("//span[@class='cart-label']");
    public String verifyNokiaLumia1020() {
        return getTextFromElement(nokiaLumiaText);
    }

    public String verifyPriceOfNokiaLumia() {
        return getTextFromElement(priceTextOfNokiaLumia);
    }

    public static void changeTheQty(String qty) {
        clearField(qtyTextBox);
        sendTextToElement(qtyTextBox, qty);
    }

    public void addToCartNokiaLumiaCellPhone() {
        clickOnElement(addToCartTab);
    }

    public String verifyTheCartMassage() {
        return getTextFromElement(CartMassage);
    }

    public void clickOnCrossButton() {
        clickOnElement(closeCrossButton);
    }

    public void mouseHoverOnShoppingCartLinkAndClick() {
        mouseHoverToElementAndClick(shoppingCartLinkAndClickOnGoTOCart);
    }
}