package selenium.automation.expedia.pages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Myntra {

	WebDriver driver;

	@Test

	public void extractProductList() throws InterruptedException {

		// Create a instance of ChromeOptions class
		ChromeOptions options = new ChromeOptions();

		// Add chrome switch to disable notification -
		// "**--disable-notifications**"
		options.addArguments("--disable-notifications");

		System.setProperty("webdriver.chrome.driver", "E://Softwares//chromedriver_win32//chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();

		Actions act = new Actions(driver);

		WebElement mouceHoverMenMenu = driver.findElement(By.xpath("//a[@data-group='men']"));

		Thread.sleep(3000);
		act.moveToElement(mouceHoverMenMenu).build().perform();

		List<WebElement> productMenMenu = driver.findElements(By.xpath("//li/a[starts-with(@href,'/men')]"));

		for (WebElement ele : productMenMenu) {
			System.out.println("productMenMenu+++++++++++++++++" + ele.getText());
		}

		driver.close();
	}

}
