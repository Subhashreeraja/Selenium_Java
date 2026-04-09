package samplepackage;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class simplealert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/alert.xhtml");
		//WebElement alert=driver.findElement(By.cssSelector("button[id='j_idt88:j_idt91']"));
       // alert.click();
        //Alert alerts=driver.switchTo().alert();
       // alerts.accept();
        
       // WebElement alert2=driver.findElement(By.cssSelector("button[id='j_idt88:j_idt95'] "));
       // alert2.click();
       // Alert alerts=driver.switchTo().alert();   
       // alerts.accept();
		
		 WebElement alert3=driver.findElement(By.cssSelector("button[id='j_idt88:j_idt104']"));
		 alert3.click();
		 Alert alerts=driver.switchTo().alert();
		 driver.quit();
		
	}

}
