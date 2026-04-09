package samplepackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		String parentwindow=driver.getWindowHandle();
		System.out.println(parentwindow);
		Set<String> allWindowHandles=driver.getWindowHandles();
		System.out.println("Count of Window:"+allWindowHandles.size());
		
		driver.findElement(By.id("windowButton")).click();
		Set<String> newallWindowHandles=driver.getWindowHandles();
		System.out.println("New Count of Window:"+newallWindowHandles.size());
        
		String ParentHandle=driver.getWindowHandle();
		System.out.println("Parent Window:"+ParentHandle);
         
		Iterator<String> iterator=newallWindowHandles.iterator();
		String mainwindow=iterator.next();
		String childwindow=iterator.next();
		System.out.println("Parent Window:"+mainwindow);
		System.out.println("Child Window:"+childwindow);
		
		driver.switchTo().window(childwindow);
		
		WebElement text=driver.findElement(By.id("sampleHeading"));
		System.out.println("Child_Title:"+text.getText());
		 driver.close();
		 
		 driver.switchTo().window(ParentHandle);
			System.out.println("Parent Title:"+driver.getTitle());
			driver.quit();
		
	}

}
