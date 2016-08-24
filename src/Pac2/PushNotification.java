package Pac2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class PushNotification {

	@Test
	public void Notification()
	{
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://52.74.100.186/clarituscore/web/index.php/adminuser/admin/login#");
		driver.findElement(By.id("loginform-username")).sendKeys("email@email.com");
		driver.findElement(By.id("loginform-password")).sendKeys("pass@123"+Keys.ENTER);
		WebElement dropdown = driver.findElement(By.xpath("//a[@class='dropdown-toggle']"));
		Select sel=new Select(dropdown);
		sel.selectByIndex(2);
		
		
		
		
		
	}
	
	
}
