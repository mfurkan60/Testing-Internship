package appium.demo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class HelloAppium {

	@Test
	public void openApplication() throws MalformedURLException {
	
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "10");
		caps.setCapability("deviceName", "GalaxyNote9");
		caps.setCapability("app", "C:\\Users\\waelk\\Downloads\\orgTask.apk");
		
		
		AndroidDriver<WebElement> driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
	}
}