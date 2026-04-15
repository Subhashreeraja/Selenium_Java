package samplepackage;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
public class screenshotdemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/select.xhtml");
		
		TakesScreenshot screenshot=(TakesScreenshot)driver;
		File source=screenshot.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(source,new File("./SeleniumScreenshots/Screen.png"));
		
		System.out.println("Screenshot is captured");
		driver.quit();
		

	}

}
