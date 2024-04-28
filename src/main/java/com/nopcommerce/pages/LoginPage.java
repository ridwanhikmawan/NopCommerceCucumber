package com.nopcommerce.pages;

//import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

  private WebDriver driver;

  // Locators
  private By usernameInputLocator = By.xpath("//input[@id='Email']");
  private By passwordInputLocator = By.xpath("//input[@id='Password']");
  private By loginButtonLocator = By.xpath("//button[normalize-space()='Log in']");
  private By forgottenPasswordLinkLocator = By.xpath("//span[@class='forgot-password']");
  private By logoutLinkLocator = By.xpath("//a[normalize-space()='Log out']");


  // Constructor
  public LoginPage(WebDriver driver) {
      this.driver = driver;
  }

  // Methods
  public void enterUsername(String username) {
      WebElement usernameInput = driver.findElement(usernameInputLocator);
      usernameInput.sendKeys(username);
  }

  public void enterPassword(String password) {
      WebElement passwordInput = driver.findElement(passwordInputLocator);
      passwordInput.sendKeys(password);
  }

  public void clickLoginButton() {
      WebElement loginButton = driver.findElement(loginButtonLocator);
      loginButton.click();
  }

  public void clickForgottenPasswordLink() {
      WebElement forgottenPasswordLink = driver.findElement(forgottenPasswordLinkLocator);
      forgottenPasswordLink.click();
  }

  public boolean checkForgotPwdLink(){
      return driver.findElement(forgottenPasswordLinkLocator).isDisplayed();
  }

  public boolean checkLogoutLink(){
      return driver.findElement(logoutLinkLocator).isDisplayed();
  }

  public void login(String email, String password) {
      enterUsername(email);
      enterPassword(password);
      clickLoginButton();
  }

  public String getForgotPwdPageUrl(){
      String forgotPwdPageUrl = driver.getCurrentUrl();
      return forgotPwdPageUrl;
  }


}

