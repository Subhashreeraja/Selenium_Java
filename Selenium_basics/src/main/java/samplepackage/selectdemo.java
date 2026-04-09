package samplepackage;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/select.xhtml");
		/*WebElement UIAutomation=driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select dropdown =new Select(UIAutomation);
		List<WebElement> list1=dropdown.getOptions();
		System.out.println("The Dropdown option size:"+list1.size());
		for(WebElement ls:list1) {
			System.out.println("The drop down options are:"+ls.getText());
			
		}
		Boolean multiple=dropdown.isMultiple();
		System.out.println("The multiple options available:"+multiple);
		dropdown.selectByIndex(1);
		dropdown.selectByVisibleText("Puppeteer");
		dropdown.deselectByIndex(4);
		*/
		WebElement Automation=driver.findElement(By.xpath("//input[@id='j_idt87:auto-complete_input']"));
		Select dropdown2 =new Select(Automation);
		List<WebElement> list2=dropdown2.getOptions();
		System.out.println("The Dropdown option size:"+list2.size());
		for(WebElement ls:list2) {
			System.out.println("The drop down options are:"+ls.getText());
			
		}
		Boolean multiple2=dropdown2.isMultiple();
		System.out.println("The multiple options available:"+multiple2);
		driver.quit();
	}

}
