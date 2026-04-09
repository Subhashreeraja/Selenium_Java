package samplepackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tabledemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
	
		List<WebElement> row=driver.findElements(By.xpath("//table[@id='table1']//tr"));
		int rowcount=row.size();
		System.out.println("Row size:"+rowcount);

		
		List<WebElement> column=driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th"));
		int columncount=column.size();
		System.out.println("Column size:"+columncount);
		
		for(int r=1;r<rowcount;r++) {
			for(int c=1;c<=columncount;c++) {
				WebElement data;
				if(r==1) {
					data=driver.findElement(By.xpath("//table[@id='table']//tr["+r+"]//th["+c+"]"));
				}else {
					data=driver.findElement(By.xpath("//table[@id='table1']//tr[" + r + "]//td[" + c + "]"));
				}
				System.out.print(data.getText());
				}
			}
		
		driver.quit();
		}
        
        

	}


