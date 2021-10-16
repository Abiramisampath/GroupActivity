package com.rookie.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.rookie.classfile.BaseClass;
import com.rookie.classfile.LocateElements;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddProduct extends BaseClass {
	
LocateElements locateElements = new LocateElements();
	
	String productName = "Watch";
	String sku = "258";
	String productPrice = "23000.69";
	
	@Given("Click on Catalog")
	public void click_on_catalog() {
		
		WebElement pushBar = driver.findElement(locateElements.pushBar);
		Actions action = new Actions(driver);
		action.moveToElement(pushBar).perform();
		
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(locateElements.catalog));
	    driver.findElement(locateElements.catalog).click();
	}
	
	
	@Given("Click on Product")
	public void click_on_product() {
	    driver.findElement(locateElements.products).click();
	}
	
	@Given("Click on Add New button")
	public void click_on_add_new_button() {
	   driver.findElement(locateElements.addNew).click();
	}
	
	@Given("Enter Product Name")
	public void enter_product_name() throws InterruptedException {
		Thread.sleep(3000);
	    driver.findElement(locateElements.productName).sendKeys(productName);
	}
	
	@Given("Enter SKU number")
	public void enter_sku_number() {
		//WebElement skufield = driver.findElement(locateElements.skuProductUniqueIdentifier);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
	    driver.findElement(locateElements.skuProductUniqueIdentifier).sendKeys(sku);
	}
	
	@Given("Enter Product Price")
	public void enter_product_price() throws InterruptedException {
		Actions action = new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		  Thread.sleep(3000);
		  driver.findElement(locateElements.productPrice).click();
		  driver.findElement(locateElements.productPrice).sendKeys(productPrice);
		 System.out.println("price");
	}
	
	@Given("Enter Free Shipping")
	public void enter_free_shipping() throws InterruptedException {
		Actions action = new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(3000);
	    driver.findElement(locateElements.freeShipping).click();
	}
	
	@When("Click on Save Button")
	public void click_on_save_button() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(locateElements.saveButton));
	    driver.findElement(locateElements.saveButton).click();
	}
	
	
	@Then("Succefully added message should be driven")
	public void succefully_added_message_should_be_driven() throws InterruptedException {
		Thread.sleep(3000);
		String successMessage;
		String message="×\r\n"
				+ "The new product has been added successfully.";
		successMessage=driver.findElement(By.xpath("//div[@class='content-wrapper']/div")).getText();
	    System.out.println(successMessage.trim());
	    Assert.assertEquals(successMessage, message);		    
	}



}
