package samplepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class framedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/frames");
		
		WebElement iframeElement=driver.findElement(By.id("frame1"));
		driver.switchTo().frame(iframeElement);
		
		String Frame_1=driver.findElement(By.id("sampleHeading")).getText();
		System.out.println("Switch by Locator:"+Frame_1);
		
		driver.switchTo().defaultContent();
		String mainpage=driver.findElement(By.xpath("//*[@id='framesWrapper']/h1")).getText();
		System.out.println("Back to Main page:"+mainpage);
		
		
		driver.switchTo().frame(1);
		String Frame_2=driver.findElement(By.id("sampleHeading")).getText();
        System.out.println("Switch by index: "+Frame_2);
        driver.quit();

	}

}
