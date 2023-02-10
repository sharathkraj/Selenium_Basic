package ExploringWebDriver;


	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class HyperLinkExample {

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.navigate().to("https://www.leafground.com/link.xhtml");
			 
			driver.manage().window().maximize();
			
			WebElement dashboardlink = driver.findElement(By.linkText("Go to Dashboard"));
			dashboardlink.click();
			
			driver.navigate().back();
			
			WebElement whereToGo = driver.findElement(By.partialLinkText("Find the URL"));
			String where = whereToGo.getAttribute("href");
			System.out.println("The link is going to "+where);
			
			WebElement brokenlink = driver.findElement(By.linkText("Broken?"));
			brokenlink.click();
			
			String title = driver.getTitle();
			if(title.contains("404")) {
				System.out.println("the link is broken");
				} 
			driver.navigate().back();
			WebElement dashboardlink1 = driver.findElement(By.linkText("Go to Dashboard"));
			dashboardlink1.click();
			driver.navigate().back();
			
			List<WebElement> totalLinks = driver.findElements(By.tagName("a"));
			int linkcount = totalLinks.size();
			System.out.println("Total links : "+linkcount);
			}
			

		
}
