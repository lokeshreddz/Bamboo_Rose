package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class SolutionsPage {

    private WebDriver driver;
    @FindBy(xpath = "//ul[@id=\"desktop-menu\"]/li/a")
    WebElement solutions;

    @FindBy(xpath = "(//ul[@class=\"sub-menu\"]/li/a)[1]")
    WebElement b2bMarketPlace;

    @FindBy(xpath = "(//ul[@class=\"sub-menu\"]/li/a)[2]")
    WebElement productLifeCycleManagement;

    @FindBy(xpath = "(//ul[@class=\"sub-menu\"]/li/a)[3]")
    WebElement globalSourcing;

    @FindBy(xpath = "(//ul[@class=\"sub-menu\"]/li/a)[4]")
    WebElement orderManagement;

    @FindBy(xpath = "(//ul[@class=\"sub-menu\"]/li/a)[5]")
    WebElement globalTradeManagement;
    @FindBy(xpath = "//div[contains(text(),'BAMBOO ROSE MARKETPLACE')]")
    WebElement b2bHomePage;

    public SolutionsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void navigateToB2BMarketPlace(){

        Actions action = new Actions(driver);
        action.moveToElement(solutions).moveToElement(b2bMarketPlace).pause(2).click().build().perform();
    }

    public boolean isB2BPageDisplayed(){

        return b2bHomePage.getText().contains("BAMBOO ROSE MARKETPLACE");
    }


}
