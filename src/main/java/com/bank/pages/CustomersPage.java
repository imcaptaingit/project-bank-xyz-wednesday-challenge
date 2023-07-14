package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class CustomersPage extends Utility {

    By withDrawlTab = By.xpath("//button[contains(text(),'Withdrawl')]");
    By withDrawlAmount = By.xpath("//input[@type='number']");
    By withDrawlButton = By.xpath("//button[@type='submit']");
    By withDrawlText = By.xpath("//span[@class='error ng-binding']");


    public void clickOnWithDrawlTab (){
        clickOnElement(withDrawlTab);
    }

    public void enterWithDrawlAmount (){
        sendTextToElement(withDrawlAmount,"50");
    }

    public void clickOnWithDrawlButton (){
        clickOnElement(withDrawlButton);
    }

    public String verifyWithDrawlText(){
        return getTextFromElement(withDrawlText);
    }
}
