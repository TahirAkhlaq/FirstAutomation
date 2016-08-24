/**
 * 
 */
package Pac2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.webdriven.commands.Click;

/**
 * @author Tahir
 *
 */
public class ViewSubscribers 
{

	@Test
	public void View() throws InterruptedException
	{
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://52.74.100.186/clarituscore/web/index.php/adminuser/admin/login#");
		driver.findElement(By.id("loginform-username")).sendKeys("email@email.com");
		driver.findElement(By.id("loginform-password")).sendKeys("pass@123"+Keys.ENTER);
		driver.findElement(By.className("small-box-footer")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement dropdown =driver.findElement(By.xpath("//select[@name='listing-table_length']"));
		Select sel= new Select(dropdown);
		sel.selectByVisibleText("100");
		//Thread.sleep(5000);
		((JavascriptExecutor)driver).executeScript("scroll(0,1600)");
		Thread.sleep(5000);
		((JavascriptExecutor)driver).executeScript("scroll(0,-1600)");
	/*	driver.findElement(By.xpath("//input[@type='search']")).sendKeys("claritus");
		//driver.findElement(By.xpath("//option[@value='100']")).click();
		/*Actions action = new Actions(driver);
		action.moveToElement */
		//driver.findElement(By.xpath("//th[@class='sorting_desc']")).click();//.build().perform();
		//driver.findElement(By.xpath("//a[@href='/clarituscore/web/index.php/adminuser/subscriber/view?id=156']")).click();
		//driver.findElement(By.xpath("//a[@name='edit-user-button']")).click();
		//driver.findElement(By.xpath("//button[@name='create-user-button']")).click();*/
		driver.findElement(By.xpath("//a[@href='/clarituscore/web/index.php/adminuser/subscriber']")).click();	
	}
	
	
	
	
}
