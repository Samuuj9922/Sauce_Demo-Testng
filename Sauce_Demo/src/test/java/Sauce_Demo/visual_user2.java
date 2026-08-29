package Sauce_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class visual_user2 
{
	
	 EdgeDriver driver;
		

		@Test(priority = 1)
		void login() throws InterruptedException
		{
			driver=new EdgeDriver();
			 driver.manage().window().maximize();
			 driver.get("https://www.saucedemo.com/");
			Thread.sleep(1000);
			
			 driver.findElement(By.id("user-name")).sendKeys("visual_user");
			 Thread.sleep(1000);
			 driver.findElement(By.id("password")).sendKeys("secret_sauce");
			 Thread.sleep(1000);
			 driver.findElement(By.id("login-button")).click();
		}	
		
		@Test(priority = 2)
		void name() throws InterruptedException
		{
			
		WebElement	order=driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select"));
		Select s1=new Select(order);
		s1.selectByVisibleText("Name (Z to A)");
		Thread.sleep(1000);
		
		WebElement	order1=driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select"));
		Select s2=new Select(order1);
		s2.selectByVisibleText("Price (low to high)");
		Thread.sleep(1000);
		
		WebElement	order2=driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select"));
		Select s3=new Select(order2);
		s3.selectByVisibleText("Price (high to low)");
		Thread.sleep(1000);
		
		WebElement	order3=driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select"));
		Select s4=new Select(order3);
		s4.selectByVisibleText("Name (A to Z)");
			
		}
		
		
		@Test(priority = 3)
		void products() throws InterruptedException
		{
			
			driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
		}
		
		@Test(priority = 4)
		void logout() throws InterruptedException
		{
			driver.findElement(By.id("react-burger-menu-btn")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("logout_sidebar_link")).click();
			
		}


}
