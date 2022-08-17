package pages;
import browser.browser;
//import static browser.browser.getPropertyValue;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    @FindBy(xpath = "//*[@id='loginPanel']/form/div[1]/input") private static WebElement usernameEl;
    @FindBy(xpath = "") private static WebElement passwordEl;
    @FindBy(xpath= ) private static WebElement loginButton;

    public static void login(){
        usernameEl.sendKeys(browser.getPropertyValue("userName"));
        passwordEl.sendKeys(browser.getPropertyValue("password"));
        loginButton.click();


    }



}
