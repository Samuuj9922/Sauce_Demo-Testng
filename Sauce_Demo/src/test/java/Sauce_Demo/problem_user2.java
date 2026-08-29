package Sauce_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class problem_user2 
{ 
	EdgeDriver driver;

	@Test(priority = 1)
	void launch() throws InterruptedException
	{
	 driver=new EdgeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.saucedemo.com/");
	Thread.sleep(1000);
	driver.findElement(By.id("user-name")).sendKeys("problem_user");
	Thread.sleep(1000);
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	Thread.sleep(1000);
	driver.findElement(By.id("login-button")).click();
	
	}
	
	@Test(priority = 2)
	void products() throws InterruptedException
	{
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		Thread.sleep(1000);
		//driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirtt")).click();
		Thread.sleep(1000);
		//driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
		Thread.sleep(1000);
	}
	
	@Test(priority = 3)
	void logout() throws InterruptedException
	{
		
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("logout_sidebar_link")).click();
	}
	
}
