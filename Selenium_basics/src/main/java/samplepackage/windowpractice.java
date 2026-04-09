package samplepackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/window.xhtml");
		String parentwindow=driver.getWindowHandle();
		
		driver.findElement(By.id("j_idt88:j_idt93")).click();
		Set<String> newallWindowid=driver.getWindowHandles();
		System.out.println("New Count of Window:"+newallWindowid.size());
        
		for(String id:newallWindowid) {
			driver.switchTo().window(id);
			if(driver.getTitle().equals("Alert")){

				driver.close();
				
			}
			if(driver.getTitle().equals("Input Components")){

				driver.close();
				
			}
			if(driver.getTitle().equals("Dashboard")){

				driver.close();
				
			}
		}
		driver.quit();
		
		

	}

}
