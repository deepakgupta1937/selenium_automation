package selenium.automation.expedia.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionClassConcepts {

	public static WebDriver driver;

	@Test
	public void moveToSubMenu() throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E://Softwares//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();

		/*
		 * Actions class Click on menu and then sub menu moveToElement build() -
		 * To build method and return action class object perform() - To execute
		 * method and return voids
		 */
		driver.get("http://mrbool.com/");
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.className("menulink"))).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ul[@class='submenu']/li/a[text()='Articles']")).click();
		driver.close();
	}

	@Test
	public void dragAndDrop() throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E://Softwares//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();

		/*
		 * Drag and Drop If frame is available then after clicking on right
		 * click on browser you will see "view frame source"
		 */
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		WebElement souraceElement = driver.findElement(By.id("draggable"));
		WebElement targetElement = driver.findElement(By.id("droppable"));
		Actions action = new Actions(driver);
		Thread.sleep(5000);
		action.clickAndHold(souraceElement).moveToElement(targetElement).release().build().perform();
		driver.close();
	}

	@Test
	public void rightClick() throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E://Softwares//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();

		/*
		 * Drag and Drop If frame is available then after clicking on right
		 * click on browser you will see "view frame source"
		 */
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		WebElement rightClick = driver.findElement(By.cssSelector(".context-menu-one"));
		Actions action = new Actions(driver);
		action.contextClick(rightClick).build().perform();
		WebElement copy = driver.findElement(By.cssSelector(".context-menu-icon-copy"));
		copy.click();
	}
}