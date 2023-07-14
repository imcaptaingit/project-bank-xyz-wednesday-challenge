package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class CustomerLoginPage extends Utility {

    By dropDownCustomerSelect = By.xpath("//select[@id='userSelect']");

    By loginButtonCustomer = By.xpath("//button[contains(text(),'Login')]");

    By logoutButton = By.xpath("//button[@class='btn logout']");

    By verifyYourNameAfter = By.xpath("//label[contains(text(),'Your Name :')]");


    public void selectTheCustomerName(String customerName) {
        selectByVisibleTextFromDropDown(dropDownCustomerSelect, customerName);
    }

    public void clickOnTheLoginButton() {
        clickOnElement(loginButtonCustomer);
    }

    public void clickOnTheLogoutButton (){
        clickOnElement(logoutButton);
    }
    public String verifyTheLogoutButton (){
        return getTextFromElement(logoutButton);
    }

    public String verifyYourNameTextAfter (){
        return getTextFromElement(verifyYourNameAfter);
    }


}
