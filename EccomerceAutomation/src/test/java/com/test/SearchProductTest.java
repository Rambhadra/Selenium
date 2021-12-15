package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.driver.CreateDriver;
import com.page.SearchItemPage;

public class SearchProductTest {
	WebDriver wd;
	SearchItemPage page;
  @Test
  public void User_Scenario_2() {
	  page.scenenario_02();
  }
  @BeforeMethod
  public void beforeMethod() {
	  wd=CreateDriver.getChromeDriver();
	  wd.get("http://automationpractice.com/index.php");
	  wd.manage().window().maximize();
	  page=PageFactory.initElements(wd, SearchItemPage.class);
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(3000);
	  wd.close();
  }

}
