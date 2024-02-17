import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUploadDemo 
{
	@Test
	public void fileUpload() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.id("uploadfile")).sendKeys("C:\\Users\\SSK\\Desktop\\SeleniumFrameWork\\ScreenShotDemo\\test1.png)");
		Thread.sleep(3000);
		System.out.println("Done");
		
	}	

}
//"https://omayo.blogspot.com/"