package ExploringWebDriver;


	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class RightClickAction {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.get("http://demo.guru99.com/test/simple_context_menu.html");

			driver.manage().window().maximize();

			//Double click the button to launch an alertbox
			Actions action = new Actions(driver);
			WebElement link =driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
			action.doubleClick(link).perform();
			//Switch to the alert box and click on OK button
			Alert alert = driver.switchTo().alert();
			System.out.println("Alert Text\n" +alert.getText());
			alert.accept();
			//Closing the driver instance
			//driver.quit();

			WebElement link1 = driver.findElement(By.cssSelector(".context-menu-one"));
			action.contextClick(link1).perform();
			// Click on Edit link on the displayed menu options
			WebElement element = driver.findElement(By.cssSelector(".context-menu-icon-copy"));
			element.click();
			// Accept the alert displayed
			driver.switchTo().alert().accept();
			System.out.println(" Text " +element.getText());
			// Closing the driver instance
			//driver.quit();
		}

}
