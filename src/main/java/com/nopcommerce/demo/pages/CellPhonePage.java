package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CellPhonePage extends Utility  {
    By cellPhonesText = By.xpath("//h1[normalize-space()='Cell phones']");
    By ListViewTab = By.xpath("//a[normalize-space()='List']");
    By productNokiaLumia = By.xpath("//h2[@class='product-title']//a[contains(text(),'Nokia Lumia 1020')]");
    public String verifyCellPhonesText(){
        return getTextFromElement(cellPhonesText);
    }
    public void clickOnListViewTab(){
        clickOnElement(cellPhonesText);
    }
    public void clickOnNokiaLumiaCellPhone(){
        clickOnElement(productNokiaLumia);
    }
}
