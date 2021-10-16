package com.rookie.classfile;

import org.openqa.selenium.By;

public class LocateElements {
	
	public By userEmail = By.id("Email");
	public By password = By.id("Password");
	public By loginButton = By.xpath("//button[text()=\"Log in\"]");
	
	
	public By pushBar = By.xpath("//a[@class='brand-link navbar-dark logo-switch']");
	public By catalog = By.xpath("//body/div[3]/aside[1]/div[1]/div[4]/div[1]/div[1]/nav[1]/ul[1]/li[2]/a[1]");
	public By products = By.xpath("/html[1]/body[1]/div[3]/aside[1]/div[1]/div[4]/div[1]/div[1]/nav[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]/p[1]");
	public By addNew = By.xpath("//div[@class='float-right']/a");
	public By productName = By.id("Name");
	public By skuProductUniqueIdentifier = By.id("Sku");
	public By productPrice = By.id("Price");
	public By freeShipping = By.name("IsFreeShipping");
	
	public By saveButton = By.xpath("//button[@name='save']");
	

}
