package tests;

import java.net.MalformedURLException;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class MM_Entity extends Base{
	
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
        AndroidDriver<AndroidElement> driver = Capabilities();
		
		////////////..........Login Online Mode............///////////////////
			
        Thread.sleep(2000);
		driver.findElement(By.id("com.ambs.mobile:id/etLogin_MainActivity")).sendKeys("admin"); //amount 
	    Thread.sleep(2000);
	    
	    
	    driver.findElement(By.id("com.ambs.mobile:id/etPassword_MainActivity")).sendKeys("Test@123"); //amount 
	    Thread.sleep(2000);
	    
	    
	    driver.findElement(By.id("com.ambs.mobile:id/rbOnlineMode_Login")).click(); //amount 
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("com.ambs.mobile:id/btnLogin_MainActivity")).click(); //amount 
	    Thread.sleep(2000);
	    
		
		
		
		 
		 
		
		
	
	}


}
