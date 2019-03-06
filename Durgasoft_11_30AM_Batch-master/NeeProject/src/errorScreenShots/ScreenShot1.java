package errorScreenShots;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class ScreenShot1 
{

	public static void main(String[] args) throws IOException 
	{
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(srcfile, new File("C:\\Users\\DELL\\Desktop\\img1.png"));
		FileHandler.copy(srcfile, new File("C:\\Users\\DELL\\Desktop\\img11.png"));
		
		
	}
}
