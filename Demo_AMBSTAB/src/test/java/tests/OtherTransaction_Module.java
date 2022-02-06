package tests;

import java.net.MalformedURLException;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class OtherTransaction_Module {
	
	public void OtherTransaction() throws MalformedURLException, InterruptedException
	{
		
		 AndroidDriver<AndroidElement>  driver = Base.GetInstance();
		
		
		 Thread.sleep(1000); 
		 driver.findElementByAndroidUIAutomator("text(\"Others Transaction\")").click(); // click select branch
		 Thread.sleep(2000);
		 
		////.........select Branch........//////////
		 
		driver.findElementByAndroidUIAutomator("text(\"Select Branch\")").click(); // click select branch
		Thread.sleep(2000);
			
		driver.findElementByAndroidUIAutomator("text(\"ASHA MFB ABAKPA (270) [2021-10-29]\")").click(); //select branch
		Thread.sleep(1000);
		 
		 ////////////....Select Loan Officer......../////////////////
		
		driver.findElementByAndroidUIAutomator("text(\"Select Loan Officer\")").click(); //click on select loan officer
		Thread.sleep(2000);
		
		driver.findElementByAndroidUIAutomator("text(\"AGOM IFEOMA (2651)\")").click(); // select loan officer
		Thread.sleep(2000);
		 
		 
		/////////////.........Group Select.....//////////////
		
		driver.findElementByAndroidUIAutomator("text(\"EBERECHUKWU GROUP(FRI)\")").click(); //group selected
	     Thread.sleep(2000);
		    
	     driver.findElementByAndroidUIAutomator("text(\"LOVE OF GOD(FRI)\")").click(); //group selected
	     Thread.sleep(2000);
	     
	     
	    ///////...........Mmeber Select.....////////
	     
	     
	    driver.findElementByAndroidUIAutomator("text(\"Select Member\")").click(); //click on select loan officer
		Thread.sleep(2000);
		
		driver.findElementByAndroidUIAutomator("text(\"ESTHER (1)\")").click(); //group selected
	     Thread.sleep(2000);
	     
	     ///////////............Select Process....////////////
	     
	     driver.findElementByAndroidUIAutomator("text(\"Select Process\")").click(); //click on select loan officer
	     Thread.sleep(2000);
			
	     driver.findElementByAndroidUIAutomator("text(\"Cash\")").click(); //group selected
		 Thread.sleep(2000);
	     
		     
	    ///////////............Select Type....////////////
		     
		driver.findElementByAndroidUIAutomator("text(\"Select Type\")").click(); //
	    Thread.sleep(2000);
				
	    driver.findElementByAndroidUIAutomator("text(\"Passbook\")").click(); //group selected
		Thread.sleep(2000);
	    
	    
	    //////////..........Amount..........///////////
	    driver.findElement(By.id("com.ambs.mobile:id/etAmount_P_OthersTransaction")).sendKeys("200"); //amount 
	    Thread.sleep(2000);
	    
	    ///////////...Description......///////
	    driver.findElement(By.id("com.ambs.mobile:id/etDescription_P_OthersTransaction")).sendKeys("nill"); //description
	    Thread.sleep(2000);
	    
	    
	    /////////...save.....///
	    driver.findElement(By.id("com.ambs.mobile:id/action_save_p_others_transaction")).click(); // 
	    Thread.sleep(2000);
	    
				
	    //////////Button Yes Click////////////
	    driver.findElementByAndroidUIAutomator("text(\"Yes\")").click(); //
	    Thread.sleep(2000);
				
		driver.navigate().back();
			
	}

}
