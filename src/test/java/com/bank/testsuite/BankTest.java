package com.bank.testsuite;

import com.bank.pages.*;
import com.bank.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BankTest extends BaseTest {

    BankManagerLoginPage bankManagerLoginPage = new BankManagerLoginPage();
    AddCustomerPage addCustomerPage = new AddCustomerPage();

    CustomerLoginPage customerLoginPage = new CustomerLoginPage();
    CustomersPage customersPage = new CustomersPage();

    AccountPage accountPage = new AccountPage();

    OpenAccountPage openAccountPage = new OpenAccountPage();

    HomePage homePage = new HomePage();

    @Test
    public void bankManagerShouldAddCustomerSuccessfully() {

//    click On "Bank Manager Login" Tab
        homePage.clickOnManagerLogin();
//    click On "Add Customer" Tab
        bankManagerLoginPage.addCustomerByManager();
//    enter FirstName
        addCustomerPage.enterFirstName("Sarvat");
//    enter LastName
        addCustomerPage.enterLastName("Shaikh");
//    enter PostCode
        addCustomerPage.enterPostCode("EN8 7EF");
//    click On "Add Customer" Button
        addCustomerPage.clickOnAddButton();
//    popup display
//    verify message "Customer added successfully"
        addCustomerPage.verifyAlertText();
//    click on 'OK' button on popup.
        addCustomerPage.clickOkAlert();
    }

    @Test
    public void bankManagerShouldOpenAccountSuccessfully() {
        // Homepage
//        homePage.clickOnManagerLogin();

//         Click on the Account
        bankManagerLoginPage.openAccountByManager();

//    click On "Open Account" Tab
        bankManagerLoginPage.openAccountByManager();
//    Search customer that created in first test
        openAccountPage.selectCustomer("Sarvat Shaikh");

//    Select currency "Pound"
        openAccountPage.selectCurrency();
//    click on 'process' button
        openAccountPage.clickOnProButton();
//    popup displayed

//    verify a message "Account created successfully"
        openAccountPage.verifyAlertText1();
//    click on 'OK' button on popup.
        openAccountPage.alertTextAccept();

    }

    @Test
    public void customerShouldLoginAndLogoutSuccessfully() {
        bankManagerLoginPage.clickHomeButton();
//      click on "Customer Login" Tab
        homePage.clickOnLoginCustomer();
//      search customer that you created.
        customerLoginPage.selectTheCustomerName("Sarvat Shaikh");
//      click on "Login" Button
        customerLoginPage.clickOnTheLoginButton();
//      verify "Logout" Tab displayed.
        String expectedLogout = "Logout";
        Assert.assertEquals(customerLoginPage.verifyTheLogoutButton(), expectedLogout, "unable to verify the text");
//      click on "Logout"
        customerLoginPage.clickOnTheLogoutButton();
//       verify "Your Name" text displayed.
        String expectedTextName = "Your Name :";
        Assert.assertEquals(customerLoginPage.verifyYourNameTextAfter(), expectedTextName, "Message not displayed");
    }

    @Test
    public void customerShouldDepositMoneySuccessfully() {
        bankManagerLoginPage.clickHomeButton();
//  click on "Customer Login" Tab
        homePage.clickOnLoginCustomer();
//  search customer that you created.
        customerLoginPage.selectTheCustomerName("Sarvat Shaikh");
//  click on "Login" Button
        customerLoginPage.clickOnTheLoginButton();
//  click on "Deposit" Tab
        accountPage.depositTab();
//  Enter amount 100
        accountPage.enterDepositAmount();
//  click on the 'Deposit' Button
        accountPage.clickOnDepositButton();
//  verify message "Deposit Successful"
        String expected = "Deposit Successful";
        Assert.assertEquals(accountPage.verifyDepositText(), expected, "Not Verified");

    }

    @Test
    public void customerShouldWithdrawMoneySuccessfully() {
     bankManagerLoginPage.clickHomeButton();
//   click on "Customer Login" Tab
     homePage.clickOnLoginCustomer();
//   search customer that you created
     customerLoginPage.selectTheCustomerName("Sarvat Shaikh");
//   click on "Login" Button
     customerLoginPage.clickOnTheLoginButton();
//   click on "Withdrawal" Tab
     customersPage.clickOnWithDrawlTab();
//   Enter amount 50
     customersPage.enterWithDrawlAmount();
//   click on the 'Deposit' Button
     customersPage.clickOnWithDrawlButton();
//   verify message "Transaction Successful"
     String expected = "Transaction successful";
     Assert.assertEquals(customersPage.verifyWithDrawlText(),expected,"Unable to verify the text");
    }


}
