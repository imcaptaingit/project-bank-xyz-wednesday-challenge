package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class AccountPage extends Utility {

    By clickOnDepositTab = By.xpath("//button[contains(text(),'Deposit')]");

    By depositAmount = By.xpath("//input[@type='number']");

    By depositButton = By.xpath("//button[@type='submit']");

    By verifySuccessfullyDeposit = By.xpath("//span[@class='error ng-binding']");


    public void depositTab (){
        clickOnElement(clickOnDepositTab);
    }

    public void enterDepositAmount (){
        sendTextToElement(depositAmount,"100");
    }

    public void clickOnDepositButton (){
        clickOnElement(depositButton);
    }

    public String verifyDepositText (){
        return getTextFromElement(verifySuccessfullyDeposit);
    }

}
