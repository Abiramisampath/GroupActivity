package com.rookie.classfile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends BaseClass{
	
	@Before
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
			
	}
	
	
	public Hooks() {
		// TODO Auto-generated constructor stub
	}@After
	public void tearDown() {
		driver.close();
	}

}
