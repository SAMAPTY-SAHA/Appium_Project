package tests;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.opencsv.exceptions.CsvException;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class OtherTransaction_Module {
	
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
	    
	  
		//driver.navigate().back();
		
		
		//driver.findElement(By.id("android:id/button1")).click();
		//Thread.sleep(2000);
		
	}
	
	
	@Test
	public void OtherTransaction() throws InterruptedException, IOException, CsvException
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
        	 
    		 Thread.sleep(1000); 
           	 driver.findElementByAndroidUIAutomator("text(\"Others Transaction\")").click(); // click select branch
             Thread.sleep(2000);
        		 
        	 System.out.println(data[i][0]);
        	 //
        	
        	for(int j=0;j<columns;j++)
        	{
        		
    		try { 
    			
    			TouchAction ac = new TouchAction(driver);
			
    		//for(int j=0;j<columns;j++)
    		//{
    		////.........select Branch........//////////
       		 driver.findElementByAndroidUIAutomator("text(\"Select Branch\")").click(); 
       		 Thread.sleep(1000);
       		 
       		//driver.findElementByAndroidUIAutomator("text(\"Bamoi (37) [2021-11-22]\")").click(); //select branch
       		 driver.findElementByAndroidUIAutomator(s+ data[i][j] + s1).click();		
       		 Thread.sleep(1000);
       		 j=j+1;
       		 
       		 ////////////....Select Loan Officer......../////////////////
       		
       		driver.findElementByAndroidUIAutomator("text(\"Select Loan Officer\")").click(); //click on select loan officer
       		Thread.sleep(2000);
       		
       		//driver.findElementByAndroidUIAutomator("text(\"AMINATA E KHANU (194)\")").click(); // select loan officer
       		driver.findElementByAndroidUIAutomator(s+ data[i][j]+ s1).click();
       		Thread.sleep(2000);
       		j=j+1;
       		 
       		 
       		/////////////.........Group Select.....//////////////
       		
       		driver.findElementByAndroidUIAutomator("text(\"FAITH IN GOD(TUE)\")").click(); //group selected
       	     Thread.sleep(2000);
       		    
       	    // driver.findElementByAndroidUIAutomator("text(\"HOLD SORBEH(MON)\")").click(); //group selected
       	     driver.findElementByAndroidUIAutomator(s+ data[i][j] + s1).click();
       	     Thread.sleep(2000);
       	     j=j+1;
       	     
       	     
       	    ///////...........Mmeber Select.....////////
       	     
       	     
       	    driver.findElementByAndroidUIAutomator("text(\"Select Member\")").click(); //click on select loan officer
       		Thread.sleep(2000);
       		
       		//driver.findElementByAndroidUIAutomator("text(\"FATMATA SANTAGIE KAMARA (1)\")").click(); //group selected
       		driver.findElementByAndroidUIAutomator(s+ data[i][j] + s1).click();
       	     Thread.sleep(2000);
       	     
       	     ///////////............Select Process....////////////
       	     
       	     driver.findElementByAndroidUIAutomator("text(\"Select Process\")").click(); //click on select loan officer
       	     Thread.sleep(2000);
       			
       	     driver.findElementByAndroidUIAutomator("text(\"Cash\")").click(); //group selected
       		 Thread.sleep(2000);
       	     
       		     
       	    ///////////............Select Type....////////////
       		     
       		driver.findElementByAndroidUIAutomator("text(\"Select Type\")").click(); //
       	    Thread.sleep(2000);
       				
       	    //driver.findElementByAndroidUIAutomator("text(\"Admission Fee\")").click(); //group selected
       	    driver.findElementByAndroidUIAutomator("text(\"Passbook\")").click();
       		Thread.sleep(2000);
       	    
       	    
       	    //////////..........Amount..........///////////
       	    driver.findElement(By.id("com.ambs.mobile:id/etAmount_P_OthersTransaction")).sendKeys("20"); //amount 
       	    Thread.sleep(2000);
       	    
       	    ///////////...Description......///////
       	    driver.findElement(By.id("com.ambs.mobile:id/etDescription_P_OthersTransaction")).sendKeys("Other Transaction"); //description
       	    Thread.sleep(2000);
       	    
       	    
       	    /////////...save.....///
       	    driver.findElement(By.id("com.ambs.mobile:id/action_save_p_others_transaction")).click(); // 
       	    Thread.sleep(2000);
       	    
       				
       	    //////////Button Yes Click////////////
       	    driver.findElementByAndroidUIAutomator("text(\"Yes\")").click(); //
       	    Thread.sleep(2000);
       				
       		driver.navigate().back();
            }
    		//}
    		catch (Exception e) {
    			e.printStackTrace();
    			//System.out.println("Screen Shot is Captured");
				flag=true;
				driver.navigate().back();
				break;
			
			}
    		
    		
    		}
        	
        	//if(flag==false)
    			//continue;
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
