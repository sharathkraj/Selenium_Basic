package ExploringWebDriver;


	import java.io.File;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class FileDownloadExample {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.get("https://www.leafground.com/file.xhtml;jsessionid=node01w7nb2bgpfpwvkmegrddzpcpj455581.node0");
			 
			driver.manage().window().maximize();
			
			WebElement downloadLink = driver.findElement(By.id("j_idt93:j_idt95"));
			downloadLink.click();
			System.out.println("Downloaded");
			
			Thread.sleep(3000);
			
			File fileLocation = new File("C://Users//hp//Downloads");
			File[] totalfiles = fileLocation.listFiles();
			System.out.println("my computer");
			
			for (File file : totalfiles) {
				System.out.println("Checking");
				if(file.getName().equals("TestLeaf Logo (4).png")) 
				System.out.println("File is dowmloaded");
				break;
					

		}
		}
}
