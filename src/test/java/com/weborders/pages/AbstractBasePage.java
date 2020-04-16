package com.weborders.pages;

//Abstract class, meant to be extended

import com.weborders.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class AbstractBasePage {
                //first, a constructor:  a constructor is a special kind of method
                // that runs automatically (later), when an object is created
                //(comes into existence)

    protected WebDriver driver = Driver.getDriver();        //idk why these two lines  ??
    protected WebDriverWait wait = new WebDriverWait(driver, 20);

    public AbstractBasePage(){
        PageFactory.initElements(driver,this );
                                      //idk what this means: PageFactory is from
                                      // a class that I haven't done yet
                                    // Muge says it's for " @findby annotations "  idk?
                                    //instead of findElement...?
                                // "this serves to initialize the object and find the Elements
                                //without it NO PAGE Object Model class will work
                                //finding web elements in POM : selenium has Page Factory class to improve this process :
                                // It helps to find element easier, syntax is shorter, more organized"

    }

}
