package testpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
public class demo_test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		System.out.println("Page title is:"+driver.getTitle());
		System.out.println("length of the title:"+driver.getTitle().length());
		String expectedUrl="https://www.flipkart.com/";
		String currentUrl=driver.getCurrentUrl();
		if(expectedUrl.equals(currentUrl)) {
			System.out.println(" Url is crt");
		}else {
			System.out.println(" Url is mismatch");
		}
		
         
		System.out.println("Page Source is:"+driver.getPageSource());
		System.out.println("Page length is:"+driver.getPageSource().length());
	

	}

}

