package samplepackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jsexecutordemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");

		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		String domain=jse.executeScript("return document.domain;").toString();
		System.out.println(domain);
		
		String url=jse.executeScript("return document.URL;").toString();
		System.out.println(url);
		
		String title=jse.executeScript("return document.title;").toString();
		System.out.println(title);
		
		//jse.executeScript("window.scrollBy(0,1000)");
		
		jse.executeScript("document.getElementsByName('name')[0].value='Subhashree';");
		
		jse.executeScript("document.getElementsByName('name')[1].value='R';");
		
		jse.executeScript("document.querySelector(\"input[required][type='text']\").value='subhashreerajait@gmail.com';");
		
		jse.executeScript("document.querySelectorAll(\"input[required][type='password']\")[0].value='Subha@123';");
		
		jse.executeScript("document.querySelectorAll(\"input[required][type='password']\")[1].value='Subha@123';");
		
		jse.executeScript("document.getElementsByClassName('btn')[0].click();");
	//driver.quit();
	}

}
