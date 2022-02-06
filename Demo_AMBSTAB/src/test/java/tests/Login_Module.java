package tests;

import java.net.MalformedURLException;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Login_Module {
	
	public void Login() throws MalformedURLException, InterruptedException {
		
		AndroidDriver<AndroidElement>  driver = Base.GetInstance();
		
		Thread.sleep(2000);
		driver.findElement(By.id("com.ambs.mobile:id/etLogin_MainActivity")).sendKeys("admin"); //amount 
	    Thread.sleep(2000);
	    
	    
	    driver.findElement(By.id("com.ambs.mobile:id/etPassword_MainActivity")).sendKeys("Test@123"); //amount 
	    Thread.sleep(2000);
	    
	    
	    driver.findElement(By.id("com.ambs.mobile:id/rbOnlineMode_Login")).click(); //amount 
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("com.ambs.mobile:id/btnLogin_MainActivity")).click(); //amount 
	    Thread.sleep(2000);
	    
	  
		//driver.navigate().back();
		
		
		//driver.findElement(By.id("android:id/button1")).click();
		//Thread.sleep(2000);
		
	}

}
