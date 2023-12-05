package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopsPage extends Utility {
    By sortByDropDown = By.xpath("//select[@id='products-orderby']");
    By listOfProducts = By.xpath("//div[@class='item-grid']//div[@class='details']//a");
    By sortPositionNameAscendingOrder = By.name("products-orderby");
    By PressOnBuildYourOwnComputerAddCart = By.xpath("//button[@type='button' and  @class='button-2 product-box-add-to-cart-button']");

    public List<String> clickOnSortByPosition(String option) throws InterruptedException {
        selectByVisibleTextFromDropDown(sortByDropDown, option);

        Thread.sleep(2000);
        List<WebElement> afterApplyingZtoA = driver.findElements(listOfProducts);
        List<String> inDescendingOrder = new ArrayList<>();
        for (WebElement productsAfterSort : afterApplyingZtoA) {
            inDescendingOrder.add(productsAfterSort.getText());
        }
        System.out.println(inDescendingOrder);
        return inDescendingOrder;
    }
    public List<String> productsArrangeInReverseOrder()  {
        List<WebElement> productElements = driver.findElements(listOfProducts);

        List<String> reverseProductNames = new ArrayList<>();
        for (WebElement e : productElements) {
            reverseProductNames.add(e.getText());
        }
        System.out.println(reverseProductNames);
        Collections.sort(reverseProductNames, Collections.reverseOrder());
        System.out.println(reverseProductNames);
        return reverseProductNames;

    }
    public void selectSortPositionNameDescendingOrder(String text){
        selectByVisibleTextFromDropDown(sortByDropDown, text);
    }

    public void verifyByAllProductInDescendingOrder(String sortName){
        sendTextToElement(listOfProducts, sortName);
    }

    public void selectSortPositionNameAscendingOrder(String text){
        selectByVisibleTextFromDropDown(sortPositionNameAscendingOrder, text);

    }

    public void addOnBuildYourOwnComputerAddCart(){
        clickOnElement(PressOnBuildYourOwnComputerAddCart);

    }
}