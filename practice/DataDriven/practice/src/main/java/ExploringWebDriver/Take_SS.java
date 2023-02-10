package ExploringWebDriver;


	import java.awt.AWTException;
	import java.awt.Dimension;
	import java.awt.Rectangle;
	import java.awt.Robot;
	import java.awt.Toolkit;
	import java.awt.image.BufferedImage;
	import java.io.File;
	import java.io.IOException;
	import java.util.concurrent.TimeUnit;

	import javax.imageio.ImageIO;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Take_SS {

		public static void main(String[] args) throws AWTException, IOException {
			// TODO Auto-generated method stub
			WebDriver driver;
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			driver = new ChromeDriver();
			
			 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		        
		     driver.navigate().to("https://www.guru99.com/introduction-to-appium.html");
		     
		     
		     //take a screenshot
		     /*TakesScreenshot screenshot = (TakesScreenshot) driver;
		     File soureFile=screenshot.getScreenshotAs(OutputType.FILE);
		     File destinationFile=new File("D:\\sample123423342.png");
		     FileHandler.copy(soureFile, destinationFile);
		     driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click(); */
		     
		     Robot robot = new Robot();
		     Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		     Rectangle rectangle= new Rectangle(screenSize);
		     BufferedImage source=robot.createScreenCapture(rectangle);
		     File destinationsFile=new File("D:\\SS1.png");
		     ImageIO.write(source, "png", destinationsFile);
		     System.out.println("Taken screenshot");
		
		}

	
}
