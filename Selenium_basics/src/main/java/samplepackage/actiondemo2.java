package samplepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actiondemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		WebElement menuElement=driver.findElement(By.id("blogsmenu"));
		Actions act=new Actions(driver);
		
		WebElement searchfield=driver.findElement(By.xpath("//input[@name='q']"));
		act.contextClick(searchfield).perform();
		driver.quit();

	}

}
