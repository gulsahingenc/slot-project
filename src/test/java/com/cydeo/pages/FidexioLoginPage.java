package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FidexioLoginPage {

    public FidexioLoginPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }
@FindBy(xpath = "//div[@class='form-group field-login']")
  public WebElement userName;
@FindBy(xpath = "//div[@class='form-group field-password']")
    public WebElement password;
@FindBy(xpath = "//button[.='Log in']")
    public WebElement logInButton;
}
