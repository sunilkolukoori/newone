package com.bluenettech.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.bluenettech.frameworkRU.Actiondriver;

public class News extends Actiondriver{
	
	@Test
	
	public void SakshiNewspaper() throws Throwable {
		
		String URL=TestData("fast1", "Url");
		gf_launchUrl(URL);
		
		Thread.sleep(10000);
	
		String Title=TestData("fast1", "Title");
		gf_VerifyTitle(Title);

		Thread.sleep(3000);
		String A=TestData("fast1", "A");
		gf_Click(By.xpath(A), "News");
		
		Thread.sleep(3000);
		String B=TestData("fast1", "B");
		gf_Click(By.xpath(B), "News");
		
		//Thread.sleep(3000);
		//String A=TestData("fast1", "A");
		//gf_Click(By.xpath(A), "News");
		
		Thread.sleep(3000);
		String C=TestData("fast1", "C");
		gf_Click(By.xpath(C), "News");
		
		Thread.sleep(3000);
		String D=TestData("fast1", "D");
		gf_Click(By.xpath(D), "News");
		
		Thread.sleep(3000);
		String E=TestData("fast1", "E");
		gf_Click(By.xpath(E), "News");
		
		Thread.sleep(3000);
		String F=TestData("fast1", "F");
		gf_Click(By.xpath(F), "News");
		
		Thread.sleep(3000);
		String G=TestData("fast1", "G");
		gf_Click(By.xpath(G), "News");
		
		Thread.sleep(3000);
		String I=TestData("fast1", "I");
		gf_Click(By.xpath(I), "News");
		
		Thread.sleep(3000);
		//String J=TestData("fast1", "J");
		//gf_Click(By.xpath(J), "News");
		
	}

}
