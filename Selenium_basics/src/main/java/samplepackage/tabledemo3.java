package samplepackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tabledemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		List<WebElement> headings=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr[2]/td[3]"));
       // System.out.println(headings.size());
        for(WebElement head:headings) {
     	   System.out.println(head.getText());
     	  driver.quit();
     }

	}

}
