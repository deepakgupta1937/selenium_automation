package selenium.automation.expedia.pages;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class ChromeGridTest {

	@Test

	public void chromeGridTestChrome() throws MalformedURLException {

		// Define desire capabilities
		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);

		// Chrome option definition
		ChromeOptions options = new ChromeOptions();
		options.merge(cap);

		String hubUrl = "http://192.168.225.29:4444/wd/hub";
		WebDriver driver = new RemoteWebDriver(new URL(hubUrl), options);

		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());

	}

}
