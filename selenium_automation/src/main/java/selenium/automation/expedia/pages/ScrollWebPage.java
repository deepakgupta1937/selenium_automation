package selenium.automation.expedia.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ScrollWebPage {

	public static WebDriver driver;

	@Test
	public void base() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E://Softwares//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		
		//Scrolling down webpage
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(5000);

		// Scrolling up webpage
		jse.executeScript("window.scrollBy(0,-1000)");
		Thread.sleep(5000);

		driver.quit();

	}
}
