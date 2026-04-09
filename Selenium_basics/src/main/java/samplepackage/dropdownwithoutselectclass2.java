package samplepackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//sendkeys method
public class dropdownwithoutselectclass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/select.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement searchbox=driver.findElement(By.cssSelector("input[id='j_idt87:auto-complete_input']"));
		searchbox.sendKeys("Selenium WebDriver");
		searchbox.sendKeys("AWS");
		searchbox.sendKeys(Keys.ENTER);
		searchbox.sendKeys("Aws");
		searchbox.sendKeys(Keys.ENTER);
		driver.quit();
	}

}
