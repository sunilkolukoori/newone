package com.bluenettech.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.bluenettech.frameworkRU.Actiondriver;

public class As extends Actiondriver {
	
	@Test
	
	public void Cars() throws Throwable {
		
		String URL=TestData("fast", "Url");
		gf_launchUrl(URL);
			
		Thread.sleep(2000);
		String Not=TestData("fast", "Not");
		gf_Click(By.xpath(Not), "Location");
		
		Thread.sleep(3000);
		String Title=TestData("fast", "Title");
		gf_VerifyTitle(Title);
		
		
		Thread.sleep(3000);
		String Car=TestData("fast", "Car");
		gf_Click(By.xpath(Car), "Car brand");
		
		Thread.sleep(3000);
		String Select=TestData("fast", "Select");
		gf_Click(By.xpath(Select), "Select");
		
		Thread.sleep(3000);
		String Year=TestData("fast", "Year");
		gf_Click(By.xpath(Year), "Year");
		
		Thread.sleep(3000);
		String Type=TestData("fast", "Type");
		gf_Click(By.xpath(Type), "Type");
		
		
		Thread.sleep(3000);
		String Gear=TestData("fast", "Gear");
		gf_Click(By.xpath(Gear), "Gear");
		
			
		Thread.sleep(3000);
		String A=TestData("fast", "A");
		gf_Click(By.xpath(A), "Variant");
		
		Thread.sleep(3000);
		String B=TestData("fast", "B");
		gf_Click(By.xpath(B), "Variant");
		
		Thread.sleep(3000);
		String C=TestData("fast", "C");
		gf_Click(By.xpath(C), "Car");
		
		Thread.sleep(2000);
		String D=TestData("fast", "D");
		gf_Type(By.xpath(D), "9704482087", "Number");
		
		Thread.sleep(3000);
		String E=TestData("fast", "E");
		gf_Click(By.xpath(E), "Confirm");
		
		Thread.sleep(3000);
		
		
		
	}

}
