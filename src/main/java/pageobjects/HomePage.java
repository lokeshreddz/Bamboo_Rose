package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private WebDriver driver;

    @FindBy(xpath = "//a[contains(text(),'Log')]")
    WebElement login;

    @FindBy(xpath = "//a[contains(text(),'About')]")
    WebElement abousus;

    @FindBy(xpath = "(//ul[@id=\"desktop-menu\"]/li/a)[1]")
    WebElement solutions;

    @FindBy(xpath = "(//ul[@id=\"desktop-menu\"]/li/a)[2]")
    WebElement industries;

    @FindBy(xpath = "(//ul[@id=\"desktop-menu\"]/li/a)[3]")
    WebElement resources;

    @FindBy(xpath = "//a[contains(text(),'Schedule a Meeting')]")
    WebElement schedulemeeting;


    public HomePage(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver, this);
    }


    public boolean verifyHomePageTitle() {

        String title = driver.getTitle();

        String expected_title = "Retail Management Software | PLM & Supply Chain Solutions";

        if (title.equals(expected_title)) {
            System.out.println("Homepage title is " + title);
            return true;
        } else
            System.out.println("Home Page title is not displayed and  " + title);
            return false;

    }

    public boolean isHomePageSolutionsTabDisplayed() {

       return solutions.getText().contains("SOLUTIONS");
    }

    public boolean isHomePageIndustriesTabDisplayed() {

        return industries.getText().contains("INDUSTRIES");
    }

    public boolean isHomePageResourcesTabDisplayed() {

        return resources.getText().contains("RESOURCES");
    }
}
