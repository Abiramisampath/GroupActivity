package com.rookie.classfile;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BaseClass {
	
	public static ChromeDriver driver;
	public WebDriverWait wait;
	
	public long takeSnap() {
		long number=(long) (Math.floor(Math.random()*90000000L) + 10000000L);
		
		try {
			FileUtils.copyFile(driver.getScreenshotAs(OutputType.FILE), new File("/Rookie_Terrain_Group/reports/images"+number+".jpg"));
		}
		catch(WebDriverException e){
			System.out.println("The browser has been closed");
		}
		catch(IOException e){
			System.out.println("Snapshot couldn't be taken");
				}
		return number;
	}
	

}
