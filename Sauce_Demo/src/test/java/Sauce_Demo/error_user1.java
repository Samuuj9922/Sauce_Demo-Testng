package Sauce_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.devtools.v141.browser.model.Bucket;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class error_user1 
{
	EdgeDriver driver;
	

	@Test(priority = 1)
	void login() throws InterruptedException
	{
		driver=new EdgeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.saucedemo.com/");
		Thread.sleep(1000);
		
		 driver.findElement(By.id("user-name")).sendKeys("error_user");
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
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(1000);
		
	}
	
	@Test(priority = 3)
	void checkout_your_info() throws InterruptedException
	{
		driver.findElement(By.id("first-name")).sendKeys("sarthak");
		Thread.sleep(1000);
		driver.findElement(By.id("last-name")).sendKeys("jagtap");//bug
		Thread.sleep(1000);
		driver.findElement(By.id("postal-code")).sendKeys("5555");
		Thread.sleep(1000);
		driver.findElement(By.id("continue")).click();
		Thread.sleep(1000);
		//driver.findElement(By.id("finish")).click();//bug
		
		driver.findElement(By.id("cancel")).click();
		Thread.sleep(1000);
		//driver.findElement(By.id("remove-sauce-labs-backpack")).click();//bug
		
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("remove-sauce-labs-backpack")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("continue-shopping")).click();
	}
	
	@Test(priority = 4)
	void logout() throws InterruptedException
	{
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("logout_sidebar_link")).click();
		
	}
	
	
}
