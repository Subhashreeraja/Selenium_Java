package samplepackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Keys;

public class dropdownwithoutselectclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/select.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement searchbox=driver.findElement(By.cssSelector("input[id='j_idt87:auto-complete_input']"));
		searchbox.sendKeys("Selenium WebDriver");
		Actions act=new Actions(driver);
		WebElement sele=driver.findElement(By.xpath("//li[normalize-space()='Selenium WebDriver']"));
		act.moveToElement(sele).click().perform();
		driver.quit();
		
	}

}
