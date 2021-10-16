package com.rookie.steps;

import java.util.concurrent.TimeUnit;

import com.rookie.classfile.LocateElements;
import com.rookie.classfile.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class AdminStepDefinition extends BaseClass{
	
	LocateElements locateElements = new LocateElements();
	
	  @Given("^User Navigates to NopCommerce URL as ([^\"]*)$") 
	  public void user_navigates_to_nop_commerce_url(String baseURL) {
	  driver.get(baseURL);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
	  
	  }
	  
	  @Given("^Enter admin email id as ([^\"]*)$") public void
	  enter_admin_email_id(String userEmailId) {
	  driver.findElement(locateElements.userEmail).clear();
	  driver.findElement(locateElements.userEmail).sendKeys(userEmailId);
	  
	  }
	  
	  @Given("^Enter admin password as ([^\"]*)$") public void
	  enter_admin_password(String userPassword) {
	  driver.findElement(locateElements.password).clear();
	  driver.findElement(locateElements.password).sendKeys(userPassword);
	  
	  }
	  
	  @Given("User Navigates to NopCommerce URL as {string}")
	  public void user_navigates_to_nop_commerce_url_as(String baseURL) {
		  driver.get(baseURL);
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
	  }
	  
	  @Given("Enter admin email id as {string}")
	  public void enter_admin_email_id_as(String userEmailId) {
		  driver.findElement(locateElements.userEmail).clear();
		  driver.findElement(locateElements.userEmail).sendKeys(userEmailId);
	      
	  }
	  
	  @Given("Enter admin password as {string}")
	  public void enter_admin_password_as(String userPassword) {
		  driver.findElement(locateElements.password).clear();
		  driver.findElement(locateElements.password).sendKeys(userPassword);
	     
	  }
	  
		@When("Click on Login button")
		public void click_on_login_button() {
		    driver.findElement(locateElements.loginButton).click();
		    takeSnap();
		}
		
		@Then("Home page should be displayed")
		public void home_page_should_be_displayed() {
		    System.out.println("Home Page is displayed");
		    takeSnap();
		}
		
		
		
	
}
