package appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Appium {

	public static void main(String[] args) throws Exception {
		
		DesiredCapabilities dc= new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
																																		//u can use 
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "narzo 50A");
		
		//dc.setCapability(MobileCapabilityType.APP, "");
		dc.setCapability("appPackage", "com.google.android.contacts");
		dc.setCapability("appActivity", "com.google.android.apps.contacts.activities.PeopleActivity");
		
		
		URL url=new URL("http://127.0.0.1:5555/wd/hub");
		
		AndroidDriver driver= new AndroidDriver(url,dc);
		WebElement Aateethiya = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Abhishek Kumar\"]"));
		Aateethiya.click();
}
}
	