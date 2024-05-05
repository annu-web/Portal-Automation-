package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import automation.pageobjects.Login_Page;

//add users in admin tab

public class TC_002 {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new EdgeDriver();
		
		Login_Page abc = new Login_Page(driver);
		
		abc.URL();

		Thread.sleep(5000);

		abc.LoginPortal("Admin", "admin123");
			
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[text()='Admin']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.tagName("h5")); //verification
		
		driver.findElement(By.xpath("//*[text()=' Add ']")).click();


	}

}
