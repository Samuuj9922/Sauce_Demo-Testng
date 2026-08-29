package Sauce_Demo;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.devtools.v141.browser.model.Bucket;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class standard_user1 

{
	EdgeDriver driver;
	
	@Test(priority = 0)
	void login() throws InterruptedException
	{
		
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(1000);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(1000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(1000);
	}
	
	@Test(priority = 1)
	void add_to_cart() throws InterruptedException
	{
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(1000);
		
	}
	
	@Test(priority = 2)
	void checkout_your_information() throws InterruptedException
	{
		
		driver.findElement(By.id("first-name")).sendKeys("Samruddhi");
		Thread.sleep(1000);
		driver.findElement(By.id("last-name")).sendKeys("Jagtap");
		Thread.sleep(1000);
		driver.findElement(By.id("postal-code")).sendKeys("413132");
		Thread.sleep(1000);
		driver.findElement(By.id("continue")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("finish")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("back-to-products")).click();
	}
	
	
	@Test(priority = 3)
	void logout() throws InterruptedException
	{
		
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("logout_sidebar_link")).click();
	}

}
