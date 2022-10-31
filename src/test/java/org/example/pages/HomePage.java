package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.util.List;
import java.util.logging.Logger;

/**
 * Sample page
 */
public class HomePage extends Page {


    @FindBy(how = How.TAG_NAME, using = "h1")
    public WebElement header;

    @FindBy(how = How.XPATH, using = "//li[.//a[text()='Why Performio']]")
    public WebElement whyPerformioSection;

    @FindBy(how = How.XPATH, using = "//h2[normalize-space()='API']")
    public WebElement API;


    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public void selectSubmenu(WebElement menuItem, String subMenuSection) {
        driver.manage().window().fullscreen();
        menuItem.click();
        List<WebElement> subMenu = menuItem.findElements(By.className("sub-menu"));
        /* looping the list of web-elements  which has the submenu and click on it */
        for (WebElement we : subMenu) {
            if (we.getText().contains(subMenuSection)) {
                LOGGER.info(subMenuSection+" was found ");
                we.click();
            }
        }
    }

    public void verifyIfFeatureExists(String feature) {
        Assert.assertTrue(driver.findElement(By.xpath("//h2[normalize-space()='" + feature + "']")).isDisplayed(), feature + " does not exist.");
        LOGGER.info(feature + " is present in the list");
    }
}

