package com.bluenettech.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.bluenettech.frameworkRU.Actiondriver;

public class Youtube extends Actiondriver{
	
	@Test
	
	public void Youtubeplay() throws Throwable {
		
		
		String URL=TestData("fast", "Url");
		gf_launchUrl(URL);
		
		String Title=TestData("fast", "Title");
		
		gf_VerifyTitle(Title);
		
		Thread.sleep(3000);
		
		
		
		String Explore=TestData("fast", "Explore");
		gf_Click(By.xpath(Explore), "Explore");
		
		Thread.sleep(3000);
		
		String Title1=TestData("fast", "Title1");
		gf_VerifyTitle(Title1);
	

		Thread.sleep(3000);
		
		String Sub=TestData("fast", "Sub");
		gf_Click(By.xpath(Sub), "Subscription");
		
		Thread.sleep(3000);
		
		String Title2=TestData("fast", "Title2");
		gf_VerifyTitle(Title2);
		

		Thread.sleep(3000);
		
		String Library=TestData("fast", "Library");
		gf_Click(By.xpath(Library), "Library");
		
		Thread.sleep(3000);
		
		String Title3=TestData("fast", "Title3");
		gf_VerifyTitle(Title3);
		

		Thread.sleep(3000);
		
		String History=TestData("fast", "History");
		gf_Click(By.xpath(History), "History");
		
		Thread.sleep(3000);
		
		String Title4=TestData("fast", "Title4");
		gf_VerifyTitle(Title4);
		
		Thread.sleep(3000);
		
		//String Movies=TestData("fast", "Movies");
		//gf_MouseHover(By.xpath(Movies), "Movies");
		
		String Home=TestData("fast", "Home");
		gf_Click(By.xpath(Home), "Home");
		
		Thread.sleep(3000);
		String Search=TestData("fast", "Search");
		gf_Type(By.xpath(Search), "sarileru neekevvaru songs", "Search");
		
		String Buuton=TestData("fast", "Button");
		gf_Click(By.xpath(Buuton), "Button");
		
		Thread.sleep(3000);
		String Song=TestData("fast", "Song");
		gf_Click(By.xpath(Song), "Song");
		
		Thread.sleep(50000);
		
		
	}

}
