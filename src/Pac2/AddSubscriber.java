package Pac2;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.sun.jna.platform.FileUtils;

public class AddSubscriber {

	public static void main(String[] args) {
WebDriver driver =new FirefoxDriver();
driver.manage().window().maximize();
driver.get("http://52.74.100.186/clarituscore/web/index.php/adminuser/admin/login#");
driver.findElement(By.id("loginform-username")).sendKeys("email@email.com");
driver.findElement(By.id("loginform-password")).sendKeys("pass@123"+Keys.ENTER);
driver.findElement(By.className("small-box-footer")).click();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

driver.findElement(By.xpath("//a[text()='Add']")).click();
driver.findElement(By.id("subscriberform-first_name")).sendKeys("Claritus1"+Keys.TAB);
driver.findElement(By.id("subscriberform-last_name")).sendKeys("Automation1"+Keys.TAB);
driver.findElement(By.id("subscriberform-email")).sendKeys("Clarits@yopmail.com"+Keys.TAB);
driver.findElement(By.id("subscriberform-phone")).sendKeys("7412587630"+Keys.TAB);
WebElement dropDown= driver.findElement(By.name("SubscriberForm[gender]"));
Select sel = new Select (dropDown);
sel.selectByVisibleText("Male");
//driver.findElement(By.name("create-user-button")).click();

//driver.findElement(By.className("form-control")).sendKeys("Claritus");
WebElement dropdown1 = driver.findElement(By.id("subscriberform-marital_status"));
Select sel1 = new Select(dropdown1);
sel1.selectByIndex(2);

WebElement dpD1 =driver.findElement(By.xpath("//select[@id='subscriberform-country']"));
Select sel2 = new Select(dpD1);
sel2.selectByIndex(1);

WebElement dpD2=driver.findElement(By.xpath("//select[@id='subscriberform-state']"));
Select sel3= new Select(dpD2);
sel3.selectByVisibleText("UP");;

WebElement dpD3=driver.findElement(By.xpath("//select[@id='subscriberform-city']"));
Select sel4= new Select(dpD3);
sel4.selectByVisibleText("Agra");

WebElement dpD4=driver.findElement(By.xpath("//select[@id='subscriberform-status']"));
Select sel5=new Select(dpD4);
sel5.selectByIndex(2);

driver.findElement(By.xpath("//input[@id='subscriberform-address']")).sendKeys("Noida Sector-16"+Keys.TAB);
driver.findElement(By.xpath("//button[contains(@name,'create-user-button')]")).click();
String actual_msg=driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
String expect="Email claritus@yopmail.com has already been taken.";
Assert.assertEquals(actual_msg, expect);
	}}



