package Sauce_Demo;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class standard_user2 
{
      EdgeDriver driver;
     
	
	@Test(priority = -1)
	void launch() throws InterruptedException
	{
	 driver=new EdgeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.saucedemo.com/");
	Thread.sleep(1000);
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	Thread.sleep(1000);
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	Thread.sleep(1000);
	driver.findElement(By.id("login-button")).click();
	
	}
	
//	@Test(priority = 0)
//	void name() throws InterruptedException
//	{
		
//		WebElement name=driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select"));
//		Select s1=new Select(name);
//		s1.selectByVisibleText("Name (A to Z)");//bug
		
//		WebElement name1=driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select"));
//		name1.click();
//		Thread.sleep(1000);
//		Select s2=new Select(name1);
//		s2.selectByValue("za");
//		
		
//	}
	
	
	@Test(priority = 1)
	void products() throws InterruptedException
	{
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
		
	}
	
	@Test(priority = 2)
	void logout() throws InterruptedException
	{
		
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("logout_sidebar_link")).click();
	}
}
