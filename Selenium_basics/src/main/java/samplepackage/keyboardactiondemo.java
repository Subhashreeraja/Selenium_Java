package samplepackage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;

import java.util.Set;

import org.openqa.selenium.By;
public class keyboardactiondemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		Actions act=new Actions(driver);
		WebElement compoundiumDevlink=driver.findElement(By.linkText("compendiumdev"));
		act.keyDown(Keys.CONTROL).moveToElement(compoundiumDevlink).click().keyUp(Keys.CONTROL).build().perform();

		String parentWindowHandle=driver.getWindowHandle();
		Set<String>windowhandles=driver.getWindowHandles();
		
		for(String handles:windowhandles) {
			driver.switchTo().window(handles);
		}
		Thread.sleep(3000);
		System.out.println("Child Window:"+windowhandles);
		driver.switchTo().window(parentWindowHandle);
		driver.quit();
		
	}

}
