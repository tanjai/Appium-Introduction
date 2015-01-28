import static org.junit.Assert.*;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

import java.io.File;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;


public class desiredcapab {

	@Test
	public void test() {
		       File appDir = new File("src");
		
		     File app = new File(appDir,"bookMyShow-ucb.apk");
		     
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		
		
		
	}

}
