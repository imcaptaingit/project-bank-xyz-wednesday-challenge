package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;

public class OpenAccountPage extends Utility {

    By searchCustomer = By.xpath("//select[@id='userSelect']");

    By changeCurrency = By.xpath("//select[@id='currency']");

    By clickOnProcessButton = By.xpath("//button[@type='submit']");


    public void selectCustomer (String CustomerName){
       selectByVisibleTextFromDropDown(searchCustomer,CustomerName);

    }

    public void selectCurrency (){
        selectByValueFromDropDown(changeCurrency,"Pound");
    }

    public void alertTextAccept () {
        acceptAlert();
    }

    public void verifyAlertText1 (){
        String actual = getTextFromAlert();
        String expected = "Account created successfully with account Number :1016";
        Assert.assertEquals(expected,actual,"Cannot Verify the Text");
    }

    public void clickOnProButton (){
        clickOnElement(clickOnProcessButton);
    }

}
