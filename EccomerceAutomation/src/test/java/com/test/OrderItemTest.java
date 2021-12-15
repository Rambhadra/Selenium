package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.driver.CreateDriver;
import com.page.OrderItem;

public class OrderItemTest {
	WebDriver driver;
	OrderItem  page;
  @Test
  public void buyPrductTest() {
	  page.buyProduct(driver);
  }
  @Test
  public void wishListTest() {
	  page.wishList(driver);
  }
  @Test
  public void veryfyPriceTest() {
	  page.verifyPrice(driver);
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver=CreateDriver.getChromeDriver();
	  driver.get("http://automationpractice.com/index.php");
	  driver.manage().window().maximize();
	  page=PageFactory.initElements(driver, OrderItem.class);
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(5000);
	  driver.close();
  }

}