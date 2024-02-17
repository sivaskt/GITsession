package analysis;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllCheckBoxes
{
	//sai siva
//	@Test 
//	public void allCheckBoxes()
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://faculty.washington.edu/chudler/java/boxes.html");
	List<WebElement>checkBoxes =driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("Total checkBoxes : "+checkBoxes.size());
		for(WebElement chBox:checkBoxes)
		{
			chBox.click();

		}
		
		int totalChBoxes = checkBoxes.size();
		for(int i=0;i<=totalChBoxes;i++)
					{
						if(i%2==0)
						{
							checkBoxes.get(i).click();
							
						}
						
					}
		for(WebElement chBox:checkBoxes)
		{
			chBox.click();

		}

		
//		
//		List<WebElement>checkBoxes1 =driver.findElements(By.xpath("//input[@type='checkbox']"));
//		for(WebElement chBox1:checkBoxes1)
//		{
//			chBox1.click();
//		}
		//int totalChBoxes1 = checkBoxes1.size();
	/*	for(int i=0;i<=totalChBoxes;i++)
					{
						if(i%2!=0&i<=totalChBoxes)
						{
							checkBoxes1.get(i).click();
						}
						
					}   */
	}

}
