package com.bluenettech.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.bluenettech.frameworkRU.Actiondriver;

public class Jewellary extends Actiondriver {
	
	@Test
	
	public void Gold() throws Throwable {
		
		String URL=TestData("fast", "Url");
		gf_launchUrl(URL);
		
		Thread.sleep(5000);
		
		String Title=TestData("fast", "Title");
		gf_VerifyTitle(Title);
		
	Thread.sleep(3000);
	String Type=TestData("fast", "Type");
	gf_Click(By.xpath(Type), "Types");
	
	Thread.sleep(3000);
	String Veg=TestData("fast", "Veg");
	gf_Click(By.xpath(Veg), "Veg");
	
	Thread.sleep(3000);
	String A=TestData("fast", "A");
	gf_Click(By.xpath(A), "Veg ");
	
	Thread.sleep(3000);
	String B=TestData("fast", "B");
	gf_Click(By.xpath(B), "Location");
	
	Thread.sleep(3000);
	String C=TestData("fast", "C");
	gf_Type(By.xpath(C), "Ameerpet", "Adress");
	
	Thread.sleep(3000);
	String D=TestData("fast", "D");
	gf_Click(By.xpath(D), "Location");
	
	}
	
	

}
