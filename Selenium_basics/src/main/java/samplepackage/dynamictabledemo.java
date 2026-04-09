package samplepackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamictabledemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://thinking-tester-contact-list.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("subhashreerajait@gmail.com",Keys.ENTER);
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("Subha123",Keys.ENTER);
		List<WebElement> headings=driver.findElements(By.xpath("//table[@class='contactTable']/tr"));
		 for(WebElement head:headings) {
	     	   System.out.println(head.getText());
	     }
		 driver.quit();
		 }
	

}
