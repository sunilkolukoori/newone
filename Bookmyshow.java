package com.bluenettech.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.bluenettech.frameworkRU.Actiondriver;

public class Bookmyshow extends Actiondriver{
	
	@Test
	public void Booktickets() throws Throwable {
		
		String URL=TestData("Sheet13", "Url");
		gf_launchUrl(URL);
		
		Thread.sleep(3000);
		
		String Popup=TestData("Sheet13", "Popup");
		gf_Click(By.xpath(Popup), "Popup");
		
		Thread.sleep(3000);
		
		String City=TestData("Sheet13", "City");
		gf_Click(By.xpath(City), "City");
		
		Thread.sleep(3000);
		String Title=TestData("Sheet13", "Title");
		gf_VerifyTitle(Title);
		
		Thread.sleep(3000);
		
		String Moive=TestData("Sheet13", "Moive");
		gf_Click(By.xpath(Moive), "Moive");
		
		Thread.sleep(3000);
		
		String Book=TestData("Sheet13", "Book");
		gf_Click(By.xpath(Book), "Book");
		
		Thread.sleep(3000);
		
		String Time=TestData("Sheet13", "Time");
		gf_Click(By.xpath(Time), "Time");
		
		Thread.sleep(3000);
		
		String Click=TestData("Sheet13", "Click");
		gf_Click(By.xpath(Click), "Click");
		
		Thread.sleep(3000);
		
		String Seat=TestData("Sheet13", "Seat");
		gf_Click(By.xpath(Seat), "No of Seats");
		
		Thread.sleep(3000);
		
		String A=TestData("Sheet13", "A");
		gf_Click(By.xpath(A), "Seats");
		
		Thread.sleep(3000);
		
		String Pay=TestData("Sheet13", "Pay");
		gf_Click(By.xpath(Pay), "Payment");
		
		Thread.sleep(10000);
		
		String Final=TestData("Sheet13", "Final");
		gf_Click(By.xpath(Final), "Proceed");
		
		
	}

}
