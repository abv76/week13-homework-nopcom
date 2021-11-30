package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

import java.time.LocalDateTime;

public class CheckOut extends Utility {
    LocalDateTime now = LocalDateTime.now();
By inputFirstName = By.id("BillingNewAddress_FirstName");
By inputLastName = By.id("BillingNewAddress_LastName");
By inputEMailAddress = By.id("BillingNewAddress_Email");
By inputCompanyName = By.id("BillingNewAddress_Company");
By inputCountyName = By.id("BillingNewAddress_CountryId");
By inputStateName= By.id("BillingNewAddress_StateProvinceId");
By inputCityName= By.id("BillingNewAddress_City");
By inputAddressLineOne= By.id("BillingNewAddress_Address1");
By inputAddressLineTwo= By.id("BillingNewAddress_Address2");
By inputZipPostalCode= By.id("BillingNewAddress_ZipPostalCode");
By inputPhoneNumber= By.id("BillingNewAddress_PhoneNumber");
By inputFaxNumber= By.id("BillingNewAddress_FaxNumber");
By clickSaveButton= By.xpath("//button[@onclick='Billing.save()']");
By shippingMethodSelect =By.id("shippingoption_1");
By clickOnContinueButton =By.xpath("(//button[@class='button-1 shipping-method-next-step-button'])[1]");
By selectCreditCardOption =By.id("paymentmethod_1");
By clickOnCreditCardContinueButton = By.xpath("(//button[@class='button-1 payment-method-next-step-button'])[1]");
By creditCardDropDownList= By.id("CreditCardType");
By cardHolderName=By.id("CardholderName");
By cardHolderNumber=By.id("CardNumber");
By cardHolderCVVCode=By.id("CardCode");
By cardHolderExpYearDropDown=By.id("ExpireYear");
By cardHolderExpMonthDropDown=By.id("ExpireMonth");
By confirmCreditCardButton =By.xpath("//button[@onclick='PaymentInfo.save()']");
By verifyCreditCardPayment =By.xpath("//span[contains(text(),'Credit Card')]");
By verifyAirShippingMethod =By.xpath("//span[contains(text(),'Next Day Air')]");
By verifyTotalAmount=By.xpath("//span[contains(text(),'$2,950.00')]");
By verifyTotalAmount1=By.xpath("//span[contains(text(),'$698.00')]");
By clickOnConfirmOrder =By.xpath("//button[contains(text(),'Confirm')]");
By verifyThankYou =By.xpath("//h1[contains(text(),'Thank you')]");
By verifyOrderSuccessfulMessage =By.xpath("//div[@class='page checkout-page order-completed-page']//div/strong[contains(text(),'Your order has been successfully processed!')]");
By clickOnFinalContinueButton =By.xpath("//button[contains(text(),'Continue')]");
By verifyWelcomeMessage=By.xpath("//h2[contains(text(),'Welcome to our store')]");
By verify2ndDayAirShippingMethod =By.id("shippingoption_2");
By verify2ndDayAir = By.xpath("//span[normalize-space()='2nd Day Air']");

    public void basicFormFillUp(){
        doubleClickAndSendKeysOnElement(inputFirstName,"Harry");
        doubleClickAndSendKeysOnElement(inputLastName,"Potter");
        doubleClickAndSendKeysOnElement(inputEMailAddress,"harpot123"+now.getSecond()+"@gmail.com");
        doubleClickAndSendKeysOnElement(inputCompanyName,"IPC Inc");
        selectByValueFromDropDown(inputCountyName,"133");
        clickOnElement(inputStateName);
        doubleClickAndSendKeysOnElement(inputCityName,"London");
        doubleClickAndSendKeysOnElement(inputAddressLineOne,"1 Westminster Road");
        doubleClickAndSendKeysOnElement(inputAddressLineTwo,"Bh Buckingham palace");
        doubleClickAndSendKeysOnElement(inputZipPostalCode,"999863");
        doubleClickAndSendKeysOnElement(inputPhoneNumber,"07834234545");
        doubleClickAndSendKeysOnElement(inputFaxNumber,"02088886665");
        clickOnElement(clickSaveButton);
            }
        public void setShippingMethodSelect(){
        clickOnElement(shippingMethodSelect);
        clickOnElement(clickOnContinueButton);
        }
        public void selectCreditCardOption(){
        clickOnElement(selectCreditCardOption);
        clickOnElement(clickOnCreditCardContinueButton);
        }
        public void fillCreditCardDetails(){
        selectByValueFromDropDown(creditCardDropDownList,"MasterCard");
        doubleClickAndSendKeysOnElement(cardHolderName,"Harry Potter");
        doubleClickAndSendKeysOnElement(cardHolderNumber,"5412 5412 5434 5436");
        selectByValueFromDropDown(cardHolderExpMonthDropDown,"8");
        selectByValueFromDropDown(cardHolderExpYearDropDown,"2024");
        doubleClickAndSendKeysOnElement(cardHolderCVVCode,"356");
        clickOnElement(confirmCreditCardButton);
        }
        public String setVerifyCreditCardPayment(){
        return getTextFromElement(verifyCreditCardPayment);
        }
        public String setVerifyAirShippingMethod(){
        return getTextFromElement(verifyAirShippingMethod);
        }
        public String setVerifyTotalAmount(){
        return getTextFromElement(verifyTotalAmount);
        }
        public String setVerifyTotalAmount1(){ return getTextFromElement(verifyTotalAmount1);
        }
        public void setClickOnConfirmOrder(){
        clickOnElement(clickOnConfirmOrder);
        }
        public String setVerifyThankyou(){
        return getTextFromElement(verifyThankYou);
           }
        public String setVerifyOrderSuccessfulMessage(){
        return getTextFromElement(verifyOrderSuccessfulMessage);
        }
        public void finalContinueButton(){
        clickOnElement(clickOnFinalContinueButton);
        }
        public String setVerifyWelcomeMessage(){
        return getTextFromElement(verifyWelcomeMessage);
        }
        public void setclickon2ndDayAirShippingAndContinue(){clickOnElement(verify2ndDayAirShippingMethod);
            clickOnElement(clickOnContinueButton);}

    public void fillVisaCreditCardDetails() throws InterruptedException {
        selectByValueFromDropDown(creditCardDropDownList,"visa");
        doubleClickAndSendKeysOnElement(cardHolderName,"Harry Potter");
        doubleClickAndSendKeysOnElement(cardHolderNumber,"4434 4434 4434 4434");
        selectByValueFromDropDown(cardHolderExpMonthDropDown,"8");
        selectByValueFromDropDown(cardHolderExpYearDropDown,"2024");
        doubleClickAndSendKeysOnElement(cardHolderCVVCode,"366");
        clickOnElement(confirmCreditCardButton);
    }
    public void basicFormWithoutEmail(){

            doubleClickAndSendKeysOnElement(inputFirstName,"Harry");
            doubleClickAndSendKeysOnElement(inputLastName,"Potter");
           // doubleClickAndSendKeysOnElement(inputEMailAddress,"GeoSmit123@gmail.com");
            doubleClickAndSendKeysOnElement(inputCompanyName,"IPC Inc");
            selectByValueFromDropDown(inputCountyName,"133");
            clickOnElement(inputStateName);
            doubleClickAndSendKeysOnElement(inputCityName,"london");
            doubleClickAndSendKeysOnElement(inputAddressLineOne,"1 Westminster Road");
            doubleClickAndSendKeysOnElement(inputAddressLineTwo,"Nr Buckingham Palace");
            doubleClickAndSendKeysOnElement(inputZipPostalCode,"999863");
            doubleClickAndSendKeysOnElement(inputPhoneNumber,"07844332211");
            doubleClickAndSendKeysOnElement(inputFaxNumber,"02083453456");
            clickOnElement(clickSaveButton);
        }
    public String setVerify2ndDayAir(){
        return getTextFromElement(verify2ndDayAir);
    }
    }


