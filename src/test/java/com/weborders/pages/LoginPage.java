package com.weborders.pages;
//This is day 24, April5, Framework Review

import com.weborders.utilities.ConfigurationReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractBasePage {
                        // "This is when we start building page objects"
                        // every page of our application has corresponding page class.
                        // this is real Page Object Model
                        //there is a class, and then it corresponds to some page.
                        // login class corresponds to login page.

                        //first, use the FindBy annotations to find the id of the first 2 elements:
            @FindBy (id = "ctl00_MainContent_username")
            private WebElement userName;
            @FindBy (id= "ctl00_MainContent_password")
            private WebElement password;

                        //now create a method, and this method will login for us:
            public void login(){
                String usernameValue = ConfigurationReader.getProperty("username");
                String passwordValue = ConfigurationReader.getProperty("password");

                userName.sendKeys(usernameValue);
                password.sendKeys(passwordValue, Keys.ENTER);

                        //this is a very simple Page class - 2 elements and one method.
                        //it logs in with the username and password found in the config.properties file.


            }
}
