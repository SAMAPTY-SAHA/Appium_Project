package tests;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {
	
	
	private static Base base ;
	private static AndroidDriver<AndroidElement>  driver ;
	
	private Base() {		
	}
	
	public static AndroidDriver<AndroidElement>  GetInstance() throws MalformedURLException
	{
		if (base==null) {
			
			
			base= new Base();
			driver = Capabilities();
			
		}
		
		return driver;
	}
	
	
	
	//public static void main(String[] args) throws MalformedURLException {
    private static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {
	// TODO Auto-generated method stub
	
	
    File appDir = new File("src/test/java/tests");
	
	//File app = new File(appDir,"ApiDemos-debug.apk"); //app-Ghana-debug-offline.apk //NG_SP16.apk //ApiDemos-debug.apk
	
	File app = new File(appDir,"SL.apk");
	
	DesiredCapabilities cap = new DesiredCapabilities();
	
	
	/// Desired Capabilities for Emulator............//////////
	//cap.setCapability(MobileCapabilityType.DEVICE_NAME,"PIXEL2XL");
	
	//cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel2API28");
	//cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,"1000");
	
	/*connect with mobile device*/
	
	cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"ANDROID");
	cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11");
		
	
	cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
	
	cap.setCapability("autoGrantPermissions", "true"); //app permission remover
	
	
    cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
	
	AndroidDriver<AndroidElement> driver =new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
	
	
	return driver;
	
    }
}
