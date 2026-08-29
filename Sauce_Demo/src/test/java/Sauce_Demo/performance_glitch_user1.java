package Sauce_Demo;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class performance_glitch_user1 
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
	void name()
	{
		WebElement order1=driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select"));
		Select s1=new Select(order1);
		s1.selectByVisibleText("Name (Z to A)");
		
		WebElement order2=driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select"));
		Select s2=new Select(order2);
		s2.selectByVisibleText("Price (low to high)");
		
		WebElement order3=driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select"));
		Select s3=new Select(order3);
		s3.selectByVisibleText("Price (high to low)");
		
		WebElement order4=driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select"));
		Select s4=new Select(order4);
		s4.selectByVisibleText("Name (A to Z)");
		
	}
	
	@Test(priority = 2)
	void add_to_cart() throws InterruptedException
	{
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("checkout")).click();
		
	}
	
	@Test(priority = 3)
	void checkout_your_info() throws InterruptedException
	{
		driver.findElement(By.id("first-name")).sendKeys("Sanjana");
		Thread.sleep(1000);
		driver.findElement(By.id("last-name")).sendKeys("Jagtap");
		Thread.sleep(1000);
		driver.findElement(By.id("postal-code")).sendKeys("443322");
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
