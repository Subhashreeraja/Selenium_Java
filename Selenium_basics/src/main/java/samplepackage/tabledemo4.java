package samplepackage;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class tabledemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		//size of row & column
		List<WebElement> row=driver.findElements(By.xpath("//table[@id='table1']//tr"));
        System.out.println("Row size:"+row.size());

		
		List<WebElement> column=driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th"));
        System.out.println("Column size:"+column.size());
        driver.quit();
	}

}
