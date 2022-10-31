package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class GooglePage extends Page{
    @FindBy(how = How.CSS, using = "input[title='Search']")
    public WebElement search;

    @FindBy(how = How.XPATH, using = "//a[@href='https://www.performio.co/']")
    public WebElement searchTerm;

    public GooglePage(WebDriver driver) {
        super(driver);
    }

    public void searchGoogle(String searchTerm) {
        search.sendKeys(searchTerm);
        search.sendKeys(Keys.ENTER);
    }

    public void openHomePage() {
        searchTerm.click();
        driver.manage().window().fullscreen();
    }
}
