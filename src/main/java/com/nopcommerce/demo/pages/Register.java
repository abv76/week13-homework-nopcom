package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import java.time.LocalDateTime;

public class Register extends Utility {
    LocalDateTime now = LocalDateTime.now();
    By verifyRegisterTitle =By.xpath("//h1[normalize-space()='Register']");
    By firstName = By.id("FirstName");
    By lastName = By.id("LastName");
    By email = By.id("Email");
    By password = By.id("Password");
    By ConfirmPassword = By.id("ConfirmPassword");
    By registerButton =By.id("register-button");
    By registrerPageVerify =By.xpath("(//div[@class='result'])[1]");
    By continueTabButton= By.xpath("//a[normalize-space()='Continue']");


    public String setVerifyRegisterTitle(){
        return getTextFromElement(verifyRegisterTitle);
    }
    public void fillBasicFormAndSubmit(){
        sendTextToElement(firstName,"George");
        sendTextToElement(lastName,"Mishra");
        sendTextToElement(email,"GeorgbhaiMishra"+now.getSecond()+"@apnamail.com");
        sendTextToElement(password,"HardWork21@");
        sendTextToElement(ConfirmPassword,"HardWork21@");
        clickOnElement(registerButton);

    }
    public String setVerifyCompleteRegisterPage() {
        return getTextFromElement(registrerPageVerify);
    }
    public void clickOnContinueButton(){
        clickOnElement(continueTabButton);
    }
}
