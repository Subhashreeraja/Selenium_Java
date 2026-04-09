package samplepackage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import static org.openqa.selenium.support.locators.RelativeLocator.with;
public class demo_test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		WebElement firstname=driver.findElement(By.name("name"));
		firstname.sendKeys("Subha",Keys.ENTER);
		WebElement lastname_below=driver.findElement(By.name("name"));
		
		WebElement lastnames_below=driver.findElement(with(By.tagName("input")).below(lastname_below));
		lastname_below.sendKeys("shree",Keys.ENTER);
		driver.quit();
	}

}
