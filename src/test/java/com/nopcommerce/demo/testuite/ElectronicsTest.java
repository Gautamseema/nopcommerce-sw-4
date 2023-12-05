package com.nopcommerce.demo.testuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicsTest extends BaseTest {
    HomePage homePage = new HomePage();
    CellPhonePage cellPhonePage = new CellPhonePage();
    ProductPage productPage = new ProductPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    CheckOutPage checkOutPage = new CheckOutPage();
    SignInPage signInPage = new SignInPage();
    LoginPage loginPage = new LoginPage();
    ShippingMethodPage shippingMethodPage = new ShippingMethodPage() ;
    PaymentMethodPage paymentMethodPage = new PaymentMethodPage();
    PaymentInformationPage paymentInformationPage = new PaymentInformationPage();
    ConfirmOrderPage confirmOrderPage = new ConfirmOrderPage();
    GreetingMessagePage greetingMessagePage = new GreetingMessagePage();
    RegisterPage registerPage = new RegisterPage();

 @Test
 public void verifyUserShouldNavigateToCellPhonesPageSuccessfully(){
//Mouse Hover on “Electronics” Tab
    homePage .mouseHoverOnElectronicsTopMenuTab();
//Mouse Hover on “Cell phones” and click
    homePage.mouseHoverAndClickOnCellPhonesOptionInElectronics();
// Verify the text “Cell phones”
     String expectedMessage = "Cell phones";
     String actualMessage = cellPhonePage.verifyCellPhonesText();
     Assert.assertEquals(actualMessage, expectedMessage, "Invalid Text");
 }
 @Test
  public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException{
     Thread.sleep(2000);
 //Mouse Hover on “Electronics” Tab
     homePage.mouseHoverOnElectronicsTopMenuTab();
     //Mouse Hover on “Cell phones” and click
     homePage.mouseHoverAndClickOnCellPhonesOptionInElectronics();
// Verify the text “Cell phones”
     String expectedMessage = "Cell phones";
     String actualMessage = cellPhonePage.verifyCellPhonesText();
     Assert.assertEquals(actualMessage, expectedMessage, "Invalid Text");
//Click on List View Tab
     cellPhonePage.clickOnListViewTab();
     Thread.sleep(2000);
//Click on product name “Nokia Lumia 1020” link
     cellPhonePage.clickOnNokiaLumiaCellPhone();
// Verify the text “Nokia Lumia 1020”
     String expectedMessage1 = "Nokia Lumia 1020";
     String actualMessage1 = productPage.verifyNokiaLumia1020();
     Assert.assertEquals(actualMessage1, expectedMessage1, "Invalid Text");
// Verify the price “$349.00”
     String expectedPrice = "$349.00";
     String actualPrice = productPage.verifyPriceOfNokiaLumia();
     Assert.assertEquals(actualPrice, expectedPrice, "Invalid Text");
//Change quantity to 2
     ProductPage.changeTheQty("2");
//Click on “ADD TO CART” tab
     productPage.addToCartNokiaLumiaCellPhone();
//Verify the Message "The product has been added to your shopping cart" on Topngreen Bar
        String expectedMessage3 = "The product has been added to your shopping cart";
       String actualMessage3 = productPage.verifyTheCartMassage();
        Assert.assertEquals(actualMessage3, expectedMessage3, "Invalid Text");
//After that close the bar clicking on the cross button.
     productPage.clickOnCrossButton();
     Thread.sleep(2000);
//Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        productPage.mouseHoverOnShoppingCartLinkAndClick();
        Thread.sleep(2000);
//Verify the message "Shopping cart"
        String expectedMessage4 = "Shopping cart";
        String actualMessage4 = shoppingCartPage.verifyTitleOfShoppingCartPage();
        Assert.assertEquals(actualMessage4, expectedMessage4, "Invalid Text");
        Thread.sleep(2000);
//Verify the quantity is 2
      shoppingCartPage.changeTheQty("2");
        shoppingCartPage.clickOnUpdateShoppingCartButton();
       Thread.sleep(2000);
//Verify the Total $698.00
        String expectedPrice1 = "$698.00";
        String actualPrice1 = shoppingCartPage.verifyTotalPriceAmount();
        Assert.assertEquals(actualPrice1, expectedPrice1, "Price Not Match");
        Thread.sleep(2000);
//click on checkbox “I agree with the terms of service”
       shoppingCartPage.clickOnAgreeWithTermsOfServiceBox();
//Click on “CHECKOUT”
      //  shoppingCartPage.clickOnCheckoutButton();
//Verify the Text “Welcome, Please Sign In!”
        String expectedText = "Welcome, Please Sign In!";
       String actuaText = signInPage.verifyTitleOfSignPage();
       Assert.assertEquals(actuaText, expectedText, "Invalid Text");
        Thread.sleep(2000);
//Click on “REGISTER” tab
        signInPage.clickOnRegisterButton();
        //2.19 Verify the text “Register”
        String expectedMessage5 = "Register";
        String actualMessage5 = registerPage.verifyRegisterTitle();
        Assert.assertEquals(actualMessage5, expectedMessage5, "Invalid Text");
        Thread.sleep(2000);
//Fill the mandatory fields
       registerPage.enterFirstName("James");
        registerPage.enterLastName("Smith");
        registerPage.enterEmail("JamesS@gmail.com");
       registerPage.enterPassword("Jsmith9999");
       registerPage.enterConfirmPassword("Jsmith9999");
  //   Click on “REGISTER” Button
     registerPage.clickOnRegisterButton();
  //   Verify the message “Your registration completed”
     String expectedResult = "Your registration completed";
     String actualResult = registerPage.verifyRegistrationMessage();
     Assert.assertEquals(actualResult, expectedResult, "Invalid Text");
     Thread.sleep(2000);
  //Click on “CONTINUE” tab
     registerPage.clickOnContinueToShoppingCart();
 //Verify the text “Shopping cart”
     String expectedMessage6 = "Shopping cart";
     String actualMessage6 = shoppingCartPage.verifyTitleOfShoppingCartPage();
     Assert.assertEquals(actualMessage6, expectedMessage6, "Invalid Text");
     Thread.sleep(5000);
//Login again becacuse cart is empty
     shoppingCartPage.clickOnLogInButton();
     signInPage.emailId("JamesS@gmail.com");
     signInPage.password("Jsmith9999");
     signInPage.clickOnLogInButton();
//lick on checkbox “I agree with the terms of service”
       shoppingCartPage.clickOnAgreeWithTermsOfServiceBox();
//Click on “CHECKOUT”
      shoppingCartPage.clickOnCheckOutButton();
//Fill the Mandatory fields
     checkOutPage.enterCompany("Circle");
     checkOutPage.selectCountryFromCountryField("United Kingdom");
     checkOutPage.enterCity("London");
     checkOutPage.enterAddress("10 Hains Way");
     checkOutPage.enterPostalCode("Wd25 8pq");
     checkOutPage.enterNumber("07833399923");
     checkOutPage.clickOnContinueButtonToShippingMethod();
//Click on Radio Button “2nd Day Air ($0.00)”
       shippingMethodPage.clickOnNextDayRadioButton() ;
// Click on “CONTINUE”
     shippingMethodPage.clickOnContinueButton();
//Select Radio Button “Credit Card”
       paymentMethodPage.clickOnCreditCardRadioButton();
  Thread.sleep(2000);
 //    Click on continue
     paymentMethodPage.clickOnContinueButton();
     //2.34Fill all the details
     paymentInformationPage.selectCreditCardType("Visa");
     paymentInformationPage.enterCardHolderName("James Smith");
     paymentInformationPage.enterCardNumber("556767676767676767");
     paymentInformationPage.selectExpiryMonth("09");
     paymentInformationPage.selectExpiryYear("2027");
     paymentInformationPage.enterCardCode("756");
     //2.35 Click on “CONTINUE”
     paymentInformationPage.clickOnContinueToConfirmOrder();
     Thread.sleep(2000);
     //2.36 Verify “Payment Method” is “Credit Card”
     String expectedMessage7 = "Credit Card";
     String actualMessage7 = confirmOrderPage.verifyPaymentMethodName();
     Assert.assertEquals(actualMessage7, expectedMessage7, "Invalid Text");
     Thread.sleep(2000);
     //2.37 Verify “Shipping Method” is “2nd Day Air”
     String expectedMessage8 = "2nd Day Air";
     String actualMessage8 = confirmOrderPage.verifySecondDayShippingMethod();
     Assert.assertEquals(actualMessage8, expectedMessage8, "Invalid Text");
     Thread.sleep(2000);
     //2.38 Verify Total is “$698.00”
     String expectedMessage9 = "$698.00";
     String actualMessage9 = confirmOrderPage.verifyTotalPriceText();
     Assert.assertEquals(actualMessage9, expectedMessage9, "Invalid Text");
     Thread.sleep(2000);
     //2.38 Click on “CONFIRM”
     confirmOrderPage.clickOnConfirmButton();
     //2.39 Verify the Text “Thank you”
     String expectedMessage10 = "Thank you";
     String actualMessage10 = greetingMessagePage.verifyGreetingMessage();
     Assert.assertEquals(actualMessage10, expectedMessage10, "Invalid Text");
     Thread.sleep(2000);
     //2.36 Verify the message “Your order has been successfully processed!”
     String expectedMessage11 = "Your order has been successfully processed!";
     String actualMessage11 = greetingMessagePage.verifyOrderSuccessMessage();
     Assert.assertEquals(actualMessage11, expectedMessage11, "Invalid Text");
     Thread.sleep(2000);
     //2.37 Click on “CONTINUE”
     greetingMessagePage.clickOnContinue();
     //2.37 Verify the text “Welcome to our store”
     String expectedMessage12 = "Welcome to our store";
     String actualMessage12 = loginPage.verifyWelcomeText();
     Assert.assertEquals(actualMessage12, expectedMessage12, "Invalid Text");
     Thread.sleep(2000);
     //2.38 Click on “Logout” link
     loginPage.clickOnLogoutLink();




 }
 }

