package SeleniumGrid.UdemySelenium_SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumGrid {

	@Test
	public void Grid() throws MalformedURLException
	{
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setBrowserName("chrome");                
//		caps.setPlatform(Platform.WIN10);  
//		caps.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
//		caps.setCapability(CapabilityType.BROWSER_NAME, "chrome");
		
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.107:4444"), caps);
		driver.get("https://mvnrepository.com");
		System.out.println(driver.getTitle());
		System.out.println("bujji");
		driver.close();
	}
}
