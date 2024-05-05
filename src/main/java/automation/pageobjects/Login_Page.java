package automation.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page 

{	
	WebDriver driver;
//	
//	WebElement username = driver.findElement(By.name("username"));
//
//	WebElement Password = driver.findElement(By.name("password"));
//	
//	WebElement Submit =  driver.findElement(By.xpath("//*[@type='submit']"));
	
	@FindBy(name="username")
	WebElement username_1;
	
	@FindBy(name="password")
	WebElement password_1;
	
	@FindBy(xpath="//*[@type='submit']")
	WebElement submit;
	

    public Login_Page(WebDriver driver) //Constructor
	
	{
		this.driver = driver ;
		
		PageFactory.initElements(driver, this);
	}
	
  //methods
	
	public void LoginPortal(String username1,String password1)
	
	{
		
		username_1.sendKeys(username1);
	    password_1.sendKeys(password1);
	    submit.click();
	}
	
	public void URL()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
}
