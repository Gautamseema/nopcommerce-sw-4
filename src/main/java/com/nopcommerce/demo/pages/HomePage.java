package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends Utility {
/**
 * ComputerTest
  */
By computerTopManuTab = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']");
By desktopDropDownLinkOfComputers = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Desktops']");

public void mouseHoverToComputer(){
    mouseHoverToElement(computerTopManuTab);
}
public void clickOnDesktopDropDownLinkOfComputers(){
    clickOnElement(desktopDropDownLinkOfComputers);
}
/**
 * ElectronicsTest
 *
 */
By electronicsTopMenuTab = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']");
    By cellPhoneTab = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']");
public void mouseHoverOnElectronicsTopMenuTab() {
    mouseHoverToElement(electronicsTopMenuTab);
}
    public void mouseHoverAndClickOnCellPhonesOptionInElectronics() {
        mouseHoverToElementAndClick(cellPhoneTab);
    }
/**
 * TopMenuTest
 */
By headerMenu = By.xpath("//div[@class = 'header-menu']/ul/li");
By topMenu = By.xpath("//div[@class='page-title']");
public String getTitleOfPage() {
    return getTextFromElement(topMenu);
}

    public void selectMenu(String menu) {
        List<WebElement> menuList = driver.findElements(headerMenu);
        try {
            for (WebElement menuOption : menuList) {
                System.out.println(menuOption.getText());
                if (menuOption.getText().equals(menu)) {
                    menuOption.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            menuList = driver.findElements(headerMenu);
        }
    }
}
