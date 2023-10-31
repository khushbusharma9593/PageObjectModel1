package org.example;

import org.testng.annotations.Test;

public class TestSuite extends BaseTest

{ HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();

    LoginPage loginPage = new LoginPage();



    @Test
    public void verifyUserShouldAbleToRegisterSuccessfully() {
        homePage.clickOnRegisterButton();
        registerPage.verifyUserIsOnRegisterPage();
        registerPage.enterRegistrationDetails();
        registerResultPage.verifyUserRegisteredSuccessfully();
    }
//*@Test
//public void verifyRegisteredUserShouldABleToReferAProductToFriendSuccessfully()
//{
    //this.homePage.clickOnRegisterButton();
    //this.registerPage.verifyUserIsOnRegisterPage();
    //this.registerPage.enterRegistrationDetails();
    //this.registerResultPage.verifyUserRegisteredSuccessfully();
//}
@Test
    public void verifyUserShouldBeLoginSuccessfully()
{
    loginPage.verifyUserIsOnLoginPage();
    loginPage.verifyUserShouldAbleToLogInSuccessfully();




}







}
