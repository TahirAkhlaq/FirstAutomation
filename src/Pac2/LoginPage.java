package Pac2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPage {
	
	WebDriver driver = new FirefoxDriver();
	@BeforeMethod
	public void preCondition(){
		System.out.println("Executing Before Methos");
		driver.get("http://52.74.100.186/clarituscore/web/index.php/adminuser/admin/login#");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@Test
	public void invalidLoginTest(){
		System.out.println("Executing invalid logintest");
		driver.findElement(By.id("loginform-username")).sendKeys("email2@email.com");
		driver.findElement(By.id("loginform-password")).sendKeys("pass@123"+Keys.ENTER);
	}
	@Test
	public void loginTest(){
		System.out.println("Executing logintest");
		driver.findElement(By.id("loginform-username")).sendKeys("email@email.com");
		driver.findElement(By.id("loginform-password")).sendKeys("pass@123"+Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	}

	
	@AfterMethod
	public void postCondition(){
		System.out.println("Executinf after method");
		driver.close();
	}
	}
