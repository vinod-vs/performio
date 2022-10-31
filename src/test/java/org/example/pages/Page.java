package org.example.pages;

import org.example.SampleTestNgTest;
import org.openqa.selenium.WebDriver;

import java.util.logging.Logger;

/**
 * Abstract class representation of a Page in the UI. Page object pattern
 */
public abstract class Page {

  protected WebDriver driver;
  protected static Logger LOGGER = Logger.getLogger(Page.class.getName());

  /*
   * Constructor injecting the WebDriver interface
   * 
   * @param webDriver
   */
  public Page(WebDriver driver) {
    this.driver = driver;
  }

  public String getTitle() {
    return driver.getTitle();
  }

}
