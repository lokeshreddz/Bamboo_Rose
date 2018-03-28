package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.HomePage;
import testbase.BaseClass;

import java.util.concurrent.TimeUnit;

public class HomePageTest extends BaseClass {

    private WebDriver driver;
    private String url = "https://www.bamboorose.com/";

    @BeforeMethod
    public void launch() {

        System.setProperty("webdriver.gecko.driver", "C:\\SeleniumProject\\demoframwork\\geckodriver.exe");
        driver = new FirefoxDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);

    }


    @Test
    public void verifyHomePage() {

        HomePage home = new HomePage(driver);

        Assert.assertTrue(home.verifyHomePageTitle());
        Assert.assertTrue(home.isHomePageSolutionsTabDisplayed());
        Assert.assertTrue(home.isHomePageIndustriesTabDisplayed());
        Assert.assertTrue(home.isHomePageResourcesTabDisplayed());
    }

    


    @AfterMethod
    public void teardown() {

       driver.close();
    }
}
