package tests;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class SecurityTransaction_Module {
	
	    @BeforeMethod
		public void Login() throws MalformedURLException, InterruptedException {
			
			AndroidDriver<AndroidElement>  driver = Base.GetInstance();
			
			Thread.sleep(3000);
			driver.findElementByAndroidUIAutomator("text(\"User Login\")").sendKeys("admin");
		    Thread.sleep(2000);
		   
		   
		    driver.findElementByAndroidUIAutomator("text(\"Password\")").sendKeys("Test@123");
		    Thread.sleep(2000);
		    
		    
		    driver.findElementByAndroidUIAutomator("text(\"Online Mode\")").click();
		    Thread.sleep(2000);
		    
		    driver.findElementByAndroidUIAutomator("text(\"Login\")").click(); 
		    Thread.sleep(2000);
		    
		  
		}
		
		
		@Test
		public void SecurityTransaction() throws MalformedURLException, InterruptedException
		{
			
			String csvFile = "src/test/java/TestData.csv";
	        int rows = 4;
	        int columns = 4;
	        
	        String[][] data = CSVFileReader.getCSVdata(csvFile, rows, columns);
	        boolean flag = false;
	        
	        for (int i = 1; i < rows; i++)
	        {
	          AndroidDriver<AndroidElement>  driver = Base.GetInstance();
	          ////*** to match text method ****///////
	     	 String s = "text(\"";
	 		 String s1 = "\")";
	    		
	    	
	 		for(int j=0;j<columns;j++)
	    	{
	 			try {
	 				Thread.sleep(1000);		 
	 		   		 driver.findElementByAndroidUIAutomator("text(\"Security Transaction\")").click(); // click select branch
	 		   		 Thread.sleep(2000);
	 		   		 
	 		   		////.........select Branch........//////////
	 		   		 
	 		   		driver.findElementByAndroidUIAutomator("text(\"Select Branch\")").click(); // click select branch
	 		   		Thread.sleep(2000);
	 		   			
	 		   		//driver.findElementByAndroidUIAutomator("text(\"Bamoi (37) [2021-11-22]\")").click(); //select branch
	 		   	     driver.findElementByAndroidUIAutomator(s+ data[i][j] + s1).click();
	 		   		Thread.sleep(1000);
	 		   		 j=j+1;
	 		   		 ////////////....Select Loan Officer......../////////////////
	 		   		
	 		   		driver.findElementByAndroidUIAutomator("text(\"Select Loan Officer\")").click(); //click on select loan officer
	 		   		Thread.sleep(2000);
	 		   		
	 		   		//driver.findElementByAndroidUIAutomator("text(\"AMINATA E KHANU (194)\")").click(); // select loan officer
	 		   	    driver.findElementByAndroidUIAutomator(s+ data[i][j] + s1).click();
	 		   		Thread.sleep(2000);
	 		   		 j=j+1;
	 		   		 
	 		   		/////////////.........Group Select.....//////////////
	 		   		
	 		   		driver.findElementByAndroidUIAutomator("text(\"FAITH IN GOD(TUE)\")").click(); //group selected
	 		   	     Thread.sleep(2000);
	 		   		    
	 		   	     //driver.findElementByAndroidUIAutomator("text(\"HOLD SORBEH(MON)\")").click(); //group selected
	 		   	    driver.findElementByAndroidUIAutomator(s+ data[i][j] + s1).click();
	 		   	     Thread.sleep(2000);
	 		   	     j=j+1;
	 		   	     
	 		   	    ///////...........Mmeber Select.....////////
	 		   	     
	 		   	     
	 		   	    driver.findElementByAndroidUIAutomator("text(\"Select Member\")").click(); //click on select loan officer
	 		   		Thread.sleep(2000);
	 		   		
	 		   		//driver.findElementByAndroidUIAutomator("text(\"ZAINAB BANGURA (2)\")").click(); //group selected
	 		   	   driver.findElementByAndroidUIAutomator(s+ data[i][j] + s1).click();
	 		   	     Thread.sleep(2000);
	 		   	     
	 		   	     
	 		   	     
	 		   	     //////////////..............Account Select......///////////
	 		   	     
	 		   	    /* driver.findElementByAndroidUIAutomator("text(\"Select Security Account\")").click(); //click on select security
	 		   		 Thread.sleep(2000);
	 		   			
	 		   		 driver.findElementByAndroidUIAutomator("text(\"Small Security\")").click(); //account selected
	 		   		 Thread.sleep(2000);*/
	 		   	     
	 		   	     
	 		   	     
	 		   	     ///////////............Select Process....////////////
	 		   	     
	 		   	     driver.findElementByAndroidUIAutomator("text(\"Select Process\")").click(); //click on select loan officer
	 		   	     Thread.sleep(2000);
	 		   			
	 		   	     driver.findElementByAndroidUIAutomator("text(\"Cash\")").click(); //group selected
	 		   		 Thread.sleep(2000);
	 		   	     
	 		   		     
	 		   	    ///////////............Select Type....////////////
	 		   		     
	 		   		driver.findElementByAndroidUIAutomator("text(\"Select Type\")").click(); //
	 		   	    Thread.sleep(2000);
	 		   				
	 		   	    driver.findElementByAndroidUIAutomator("text(\"Security Deposit\")").click(); //type select
	 		   		Thread.sleep(2000);
	 		   	    
	 		   	    
	 		   	    //////////..........Amount..........///////////
	 		   	    driver.findElement(By.id("com.ambs.mobile:id/etAmount_P_SecurityTransaction")).sendKeys("2"); //amount 
	 		   	    Thread.sleep(2000);
	 		   	    
	 		   	    ///////////...Description......///////
	 		   	    driver.findElement(By.id("com.ambs.mobile:id/etDescription_P_SecurityTransaction")).sendKeys("Security Transaction"); //description
	 		   	    Thread.sleep(2000);
	 		   	    
	 		   	    
	 		   	    /////////...save.....///
	 		   	    driver.findElement(By.id("com.ambs.mobile:id/action_save_p_security_transaction")).click(); // 
	 		   	    Thread.sleep(2000);
	 		   	    
	 		   	    
	 		   	    //////////Button Yes Click////////////
	 		   	    
	 		   	    driver.findElementByAndroidUIAutomator("text(\"Yes\")").click(); //
	 		   	    Thread.sleep(2000);
	 		   				
	 		   		
	 		   		driver.navigate().back();
	 		   			
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
					flag=true;
					driver.navigate().back();
					break;
				}
	    	}
	   		 
	        }
					 
		}
		
		@AfterMethod
		public void LogOut() throws MalformedURLException, InterruptedException {
			
			AndroidDriver<AndroidElement>  driver = Base.GetInstance();
		
		    
			Thread.sleep(2000);
	        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]")).click(); //click more options(three dot)
	        
		    driver.findElementByAndroidUIAutomator("text(\"Logout\")").click();
		    Thread.sleep(2000);
		    
		    driver.findElementByAndroidUIAutomator("text(\"YES\")").click();
		    Thread.sleep(2000);
		    	
		}

}
