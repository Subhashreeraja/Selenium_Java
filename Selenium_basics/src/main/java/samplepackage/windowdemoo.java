package samplepackage;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowdemoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://demoqa.com/browser-windows");
		
	}

}
