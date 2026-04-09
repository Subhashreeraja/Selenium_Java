package samplepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddropdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.leafground.com/drag.xhtml;jsessionid=node0uqtv81be1tt21el7vtsgjbaeu14534159.node0");
		 WebElement source = driver.findElement(By.id("form:drag"));
	        WebElement target = driver.findElement(By.id("form:drop"));
		Actions act=new Actions(driver);
		//there are 2 ways to locate the element
		//this is first method:
	    act.dragAndDrop(source, target).perform();
		//this is second method:
		act.clickAndHold(source).moveToElement(target).perform();
		
		driver.quit();

	}

}
