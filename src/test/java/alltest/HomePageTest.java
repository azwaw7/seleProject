package alltest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import browser.browser;
import org.testng.annotations.Factory;
import pages.HomePage;
import org.testng.annotations.Test;

import java.time.Duration;

import static pages.HomePage.login;

public class HomePageTest {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        browser.setDriver();
        driver = browser.getDriver();
        driver.navigate().to(browser.getPropertyValue("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }@Test
    public void test1(){
        browser.getDriver();
        PageFactory.initElements(browser.getDriver(),HomePage.class).login();



    }

}
