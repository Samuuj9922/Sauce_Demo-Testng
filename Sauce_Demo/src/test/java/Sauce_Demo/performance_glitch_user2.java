package Sauce_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.devtools.v141.browser.model.Bucket;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class performance_glitch_user2 
{
	 EdgeDriver driver;

		@Test(priority = 0)
		void launch() throws InterruptedException
		{
	       driver=new EdgeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.saucedemo.com/");
		
		
		 driver.findElement(By.id("user-name")).sendKeys("performance_glitch_user");
		
		 driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		 driver.findElement(By.id("login-button")).click();
		}
	
	@Test(priority = 1)	
   void product()
   {
	   
	   driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
	   
	   driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
	   
	   driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
	   
	   driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
	   
	   driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
	   
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
