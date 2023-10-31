package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import static org.example.BasePage.driver;
import static org.example.Utils.*;

public class LoginPage extends Utils
{
    public void verifyUserIsOnLoginPage()
    {
        //Click on log in button
        clickOnElement(By.cssSelector(".ico-login"));

        Assert.assertTrue(driver.getCurrentUrl().contains("login"));//check the URL of login


    }

    public void verifyUserShouldAbleToLogInSuccessfully ()
    {
        typeText(By.id("Email"),email); //enter email id by using typeText method
        System.out.println(email);//Print of email id

        typeText(By.xpath("//input[@id=\"Password\"]"), "H@12345");//enter password

        clickOnElement(By.xpath("//button[@class=\"button-1 login-button\"]"));//click on login button



    }
}
