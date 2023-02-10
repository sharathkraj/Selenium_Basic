package ExploringWebDriver;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class DragAndDropExample {

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.get("https://www.leafground.com/drag.xhtml");
			 
			driver.manage().window().maximize();
			
			WebElement from = driver.findElement(By.id("form:drag_content"));
			WebElement to = driver.findElement(By.id("form:drop_content"));
			
			Actions act = new Actions(driver);
			//act.clickAndHold(from).moveToElement(to).release().build().perform();
			act.dragAndDrop(from, to).build().perform();
			
			WebElement name = driver.findElement(By.id("form:j_idt94:j_idt95"));
			WebElement category = driver.findElement(By.id("form:j_idt94:j_idt97"));
			
			act.dragAndDrop(category, name).build().perform();
			
			WebElement brown = driver.findElement(By.xpath("//*[@id=\"form:j_idt111_data\"]/tr[6]/td[1]"));
			WebElement game = driver.findElement(By.xpath("//*[@id=\"form:j_idt111_data\"]/tr[9]/td[1]"));
			
			act.dragAndDrop(game, brown).build().perform();
			
			
		}
}
