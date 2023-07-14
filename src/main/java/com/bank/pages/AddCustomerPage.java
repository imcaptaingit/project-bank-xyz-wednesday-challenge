package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;

public class AddCustomerPage extends Utility {


    By addingNewCustomerPage = By.xpath("//button[contains(text(),'Add Customer')]");

    By openAccount = By.xpath("//button[contains(text(),'Open Account')]");

    By CustomerTab = By.xpath("//button[contains(text(),'Customers')]");

    By FirstName = By.xpath("//input[@placeholder='First Name']");

    By LastName = By.xpath("//input[@placeholder='Last Name']");
    By PostCode = By.xpath("//input[@placeholder='Post Code']");

    By addCustomerButton = By.xpath("//button[@type='submit']");




    public void addCustomerByManager (){
        clickOnElement(addingNewCustomerPage);
    }

    public void enterFirstName (String FName){
        sendTextToElement(FirstName,FName);
    }

    public void enterLastName (String LName){
        sendTextToElement(LastName,LName);
    }

    public void enterPostCode (String PCode){
        sendTextToElement(PostCode,PCode);
    }

    public void clickOnAddButton (){
        clickOnElement(addCustomerButton);
    }

    public void clickOkAlert (){
        acceptAlert();
    }

    public void verifyAlertText (){
        String actual = getTextFromAlert();
        String expected = "Customer added successfully with customer id :6";
        Assert.assertEquals(expected,actual,"incorrect text");
    }

}
