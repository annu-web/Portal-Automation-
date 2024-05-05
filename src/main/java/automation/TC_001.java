package automation;

import java.io.File;

import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import automation.pageobjects.Login_Page;

//Login application 

public class TC_001{

public static void main(String[] args) throws IOException, InterruptedException
{
	WebDriver driver = new EdgeDriver();
	
	
//	EdgeOptions options = new EdgeOptions(); 
//	
//	options.addArguments("--remote-allow-origins=*");
//
//	options.addArguments("--disable notifications");
	
	//driver.manage().timeouts();

	
	Thread.sleep(5000);
	
	Login_Page abc = new Login_Page(driver);
	
	abc.URL();

	Thread.sleep(10000);

	abc.LoginPortal("Admin", "admin123");
		
	Thread.sleep(5000);
	
	 File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	 FileUtils.copyFile(file,new File("C://users//at.quality//Screenshot.png"));//Verification
	
}

}