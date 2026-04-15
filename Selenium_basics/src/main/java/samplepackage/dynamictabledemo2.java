package samplepackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamictabledemo2 {

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
		List<WebElement> contactnames=driver.findElements(By.xpath("//table[@class='contactTable']/tr/td[2]"));
		String expected = "subha";
		List<WebElement> contactNumber = driver.findElements(By.xpath("//table[@id='myTable']//tr//td[2]"));
		System.out.println(contactNumber.size());
		
		int i=1;
		for(WebElement name:contactnames) {
			if(name.getText().equals(expected)) {
				List<WebElement>actualRowData=driver.findElements(By.xpath("//table[@id='myTable']/tr["+i+"]"));
				for(WebElement row:actualRowData) {
					System.out.println(row.getText());
				}
			}
			i++;
		}
		driver.quit();
		
		
	}

}
