package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By customerLogin = By.xpath("//button[contains(text(),'Customer Login')]");

    By MangerLogin = By.xpath("//button[contains(text(),'Bank Manager Login')]");


    public void clickOnLoginCustomer (){
        clickOnElement(customerLogin);
    }

    public void clickOnManagerLogin (){
        clickOnElement(MangerLogin);
    }







}
