package Sauce_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class visual_user1 
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
	void add_to_cart() throws InterruptedException
	{
		
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click(); //bug in position of add to cart
		Thread.sleep(1000);
		
		driver.findElement(By.id("checkout")).click();//position of checkout
		Thread.sleep(1000);	
		
	}
	
	@Test(priority = 3)
	void checkout_your_info() throws InterruptedException
	{
		driver.findElement(By.id("first-name")).sendKeys("Utkarsh");
		Thread.sleep(1000);
		driver.findElement(By.id("last-name")).sendKeys("jagtap");
		Thread.sleep(1000);
		driver.findElement(By.id("postal-code")).sendKeys("9999");
		Thread.sleep(1000);
		driver.findElement(By.id("continue")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("finish")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("back-to-products")).click();
		
	}
	

	@Test(priority = 4)
	void logout() throws InterruptedException
	{
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("logout_sidebar_link")).click();
		
	}
	

}
