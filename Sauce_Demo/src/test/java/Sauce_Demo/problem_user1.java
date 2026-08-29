package Sauce_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class problem_user1 
{

EdgeDriver driver;
     
	
	@Test(priority = -1)
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
	
//	@Test(priority = 0)
//	void name()
//	{
//		WebElement order1=driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select"));
//		Select s1=new Select(order1);
//		s1.selectByVisibleText("Name (Z to A)");
//		
//	}
	
	@Test(priority = 1)
	void add_to_cart() throws InterruptedException
	{
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("checkout")).click();
	}
	
	
		
	
	@Test(priority = 2)
	void checkout_your_info() throws InterruptedException
	{
		driver.findElement(By.id("first-name")).sendKeys("sarthak");
		Thread.sleep(1000);
		driver.findElement(By.id("last-name")).sendKeys("patil");//bug
		Thread.sleep(1000);
		driver.findElement(By.id("postal-code")).sendKeys("1233");
		Thread.sleep(1000);
		driver.findElement(By.id("continue")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("cancel")).click();
		Thread.sleep(1000);
         driver.findElement(By.id("remove-sauce-labs-backpack")).click();
         Thread.sleep(1000);
		driver.findElement(By.id("continue-shopping")).click();
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
