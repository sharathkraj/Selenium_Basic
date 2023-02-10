package ExploringWebDriver;



	import java.util.Set;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;


	public class WindowHandling {
		
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.get("https://www.leafground.com/window.xhtml");
			String oldwindow = driver.getWindowHandle();
			
			WebElement openHomeButton = driver.findElement(By.xpath("//*[@id=\"j_idt88:new\"]/span"));
			openHomeButton.click();
			
			Set<String> handles = driver.getWindowHandles();
			
			for (String newwindows : handles) {
				driver.switchTo().window(newwindows);
			}
			
			WebElement browser = driver.findElement(By.xpath("//*[@id=\"menuform:j_idt39\"]/a"));
			browser.click();
			
			 //driver.close();
			 
			 driver.switchTo().window(oldwindow);
			 WebElement openMultiple = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]/span"));
			 openMultiple.click();
			 Thread.sleep(3000);
			 int n = driver.getWindowHandles().size();
			 System.out.println("No of windows opened : "+n);
			 
			WebElement closewindow = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]/span[2]"));
			  closewindow.click();
			  Thread.sleep(3000);
			  Set<String> newWindowHandle = driver.getWindowHandles();
			  
			  for (String allwindows : handles) {
				if(!allwindows.equals(oldwindow)) {
					driver.switchTo().window(allwindows);
					driver.close();
				}
			}
			 
	driver.quit(); 
		}
}
