package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class BankManagerLoginPage extends Utility {
    By addingNewCustomerPage = By.xpath("//button[contains(text(),'Add Customer')]");

    By openAccount = By.xpath("//button[contains(text(),'Open Account')]");

    By CustomerTab = By.xpath("//button[contains(text(),'Customers')]");

    By homeButton = By.xpath("//button[@class='btn home']");


    public void addCustomerByManager() {
        clickOnElement(addingNewCustomerPage);
    }

    public void openAccountByManager() {
        clickOnElement(openAccount);
    }

    public void customersTabInManager() {
        clickOnElement(CustomerTab);
    }

    public void clickHomeButton (){
        clickOnElement(homeButton);
    }

}
