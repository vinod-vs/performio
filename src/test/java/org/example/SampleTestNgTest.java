package org.example;

import org.example.pages.GooglePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import org.example.pages.HomePage;

import java.util.List;
import java.util.logging.Logger;

public class SampleTestNgTest extends TestNgTestBase {

  private HomePage homepage;
  private GooglePage googlePage;
  protected static Logger LOGGER = Logger.getLogger(SampleTestNgTest.class.getName());


  @BeforeMethod
  public void initPageObjects() {
    homepage = PageFactory.initElements(driver, HomePage.class);
    googlePage = PageFactory.initElements(driver,GooglePage.class);
  }

  @Test
  public void test() {
    driver.get(baseUrl);
    googlePage.searchGoogle("performio");
    googlePage.openHomePage();
    homepage.selectSubmenu(homepage.whyPerformioSection,"Our Technology");
    homepage.verifyIfFeatureExists("Custom Tables");
    homepage.verifyIfFeatureExists("Reporting");
    homepage.verifyIfFeatureExists("Salesforce Integration");
  }
}
