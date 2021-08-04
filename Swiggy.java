package com.bluenettech.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.bluenettech.frameworkRU.Actiondriver;

public class Swiggy extends Actiondriver{
	
	@Test
	public void Onlinefood() throws Throwable {
		
		String URL=TestData("Sheet12", "Url");
		gf_launchUrl(URL);
		
		Thread.sleep(3000);
		
		String Title=TestData("Sheet12", "Title");
		gf_VerifyTitle(Title);
	
		Thread.sleep(3000);
		
		String Pin=TestData("Sheet12", "Pin");
		gf_Type(By.xpath(Pin), "500018", "Pin Code");
		
		Thread.sleep(3000);
		
		String Address=TestData("Sheet12", "Address");
		gf_Click(By.xpath(Address), "Adress");
		

		Thread.sleep(3000);
		
		String Search=TestData("Sheet12", "Search");
		gf_Click(By.xpath(Search), "Search");
		
		Thread.sleep(3000);
		
		String Type=TestData("Sheet12", "Type");
		gf_Type(By.xpath(Type), "Chiken Biryani", "Food item");
		
		Thread.sleep(3000);
		
		String Select=TestData("Sheet12", "Select");
		gf_Click(By.xpath(Select), "Select");
		
		Thread.sleep(3000);
		
		String Click=TestData("Sheet12", "Click");
		gf_Click(By.xpath(Click), "Click");
		
		Thread.sleep(3000);
		
		String Selected=TestData("Sheet12", "A");
		gf_Click(By.xpath(Selected), "Click");
		
		Thread.sleep(3000);
		
		String Final=TestData("Sheet12", "Final");
		gf_Click(By.xpath(Final), "Check Out");
		
		Thread.sleep(3000);
		
		String Payment=TestData("Sheet12", "Payment");
		gf_Click(By.xpath(Payment), "Payment");
		
		Thread.sleep(3000);
		
		String Login=TestData("Sheet12", "Login");
		gf_Click(By.xpath(Login), "Login");
		
		String Phone=TestData("Sheet12", "Phone");
		gf_Type(By.xpath(Phone), "9704482087", "Phone number");
		
		String B=TestData("Sheet12", "B");
		gf_Click(By.xpath(B), "Order complete");
		
		
		
	}
	}


