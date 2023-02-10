package ExploringWebDriver;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class UploadImageExample {

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			/*driver.get("https://imgbb.com/");
			 
			driver.manage().window().maximize();
			
			WebElement startupload = driver.findElement(By.xpath("//*[@id=\"top-bar\"]/div/ul[2]/li[1]"));
			startupload.click();
			System.out.println("Start Image upload button clicked");
			WebElement addImage = driver.findElement(By.xpath("//*[@id=\"anywhere-upload\"]/div[1]/div/div[1]/div/div[1]/span"));
			System.out.println("Image upload button found");
			addImage.sendKeys("Downloads\\1.jpg");
			System.out.println("Button found");
			WebElement uploadButton = driver.findElement(By.xpath("//*[@id=\"anywhere-upload-submit\"]/div[1]/button"));
			uploadButton.click();
			System.out.println("Image uploaded");*/
			
			

		
			        
			        // Navigate to the website
			        driver.get("https://www.leafground.com/file.xhtml;jsessionid=node014mq8sy75y2r61fuyzjqvvkyrp91821.node0");
			        
			        driver.manage().window().maximize();
			        
			        driver.findElement(By.xpath("//*[@id=\"j_idt97:j_idt98_label\"]")).sendKeys("Downloads\\1.jpg");

			        // Locate the file input element
			        //WebElement fileInput = driver.findElement(By.id("file_input"));

			        // Send the file path to the file input element
			        //fileInput.

			        // Submit the form
			        driver.findElement(By.xpath("//*[@id=\"j_idt97:j_idt98\"]/div[1]/button[1]")).click();

			        // Close the browser
			        driver.quit();
			    }
			


		}

