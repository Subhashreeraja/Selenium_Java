package samplepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
public class practicedemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/dashboard.xhtml");
		System.out.println("TITLE:"+driver.getTitle());
		
		driver.navigate().to("https://www.leafground.com/window.xhtml");
		//driver.navigate().back();
		
		WebElement button=driver.findElement(By.xpath("//button[@id='j_idt88:new']"));
		button.click();
		
driver.quit();
	}

}
