package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import static org.example.Utils.*;

public class RegisterPage
{

    public void verifyUserIsOnRegisterPage() {

        clickOnElement(By.linkText("Register"));  //click on register button by using reusability method

        Assert.assertTrue(driver.getCurrentUrl().contains("register"), "User is NOT on register page");

    }

    public void enterRegistrationDetails()
    {


        clickOnElement(By.id("gender-female")); //clicking on female option by using this method

        typeText(By.name("FirstName"), "Khushi");//enter first name by using typeText method

        typeText(By.name("LastName"), "Verma"); //enter last name by using typeText method

        selectByText(By.name("DateOfBirthDay"), "21");//Create object of selectDay

        selectByText(By.name("DateOfBirthMonth"), "May");//Create object of selectMonth

        selectByText(By.name("DateOfBirthYear"), "1995");//Create object of selectYear

        typeText(By.name("Email"), email);//enter email id

        typeText(By.name("Password"), password);//enter password  by using typeText method

        typeText(By.name("ConfirmPassword"), password);//enter confirm password  by using typeText method

        //click on register button fill all the information by using this method
        clickOnElement(By.id("register-button"));


    }
}
