package appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Calculation {

	public static void main(String[] args) throws Exception {
		
		DesiredCapabilities dc= new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
																																		//u can use 
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "narzo 50A");
		
		//dc.setCapability(MobileCapabilityType.APP, "");
		dc.setCapability("appPackage", "com.coloros.calculator");
		dc.setCapability("appActivity", "com.android.calculator2.Calculator");
		
		
		URL url=new URL("http://127.0.0.1:5555/wd/hub");
		
		AndroidDriver driver= new AndroidDriver(url,dc);
		
		WebElement agree = driver.findElement(By.id("com.coloros.calculator:id/btn_confirm"));
		agree .click();
		
		WebElement five = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/com.android.calculator2.ui.widget.a/android.widget.FrameLayout/android.widget.Button[12]"));
		five .click();
		
		WebElement add = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Add\"]"));
     	add.click();
	
     	WebElement seven = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/com.android.calculator2.ui.widget.a/android.widget.FrameLayout/android.widget.Button[8]"));
     	seven .click();
     	
     	WebElement equals = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Equals\"]"));
     	equals .click();
     	
     	WebElement result = driver.findElement(By.className("android.widget.TextView"));
     	result .click();
     	
     	/*WebElement cancel = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Clear\"]"));
     	cancel.click();
     	
     	WebElement one = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/com.android.calculator2.ui.widget.a/android.widget.FrameLayout/android.widget.Button[14]"));
        one.click();
        
        
        WebElement four= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/com.android.calculator2.ui.widget.a/android.widget.FrameLayout/android.widget.Button[11]"));
        four .click();*/
     	
     	
//		
//		String val=driver.findElementById("com.coolbase.androidprograming:id/button").getText();
		
		//System.out.println(val);
		
		//driver.findElementById("").click();
		
		//val=driver.findElementById("").getText();
		
		//2nd round
		
		//driver.findElementById("").click();
		
		//val=driver.findElementById("").getText();
		
		//System.out.println(val);
		driver.quit();
		
	}

}
