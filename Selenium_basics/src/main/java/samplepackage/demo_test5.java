package samplepackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo_test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.demoblaze.com/");
		//implicit wait
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.cssSelector("#login2")).click();
        driver.findElement(By.cssSelector("input#loginusername")).sendKeys("admin");
        driver.findElement(By.cssSelector("input#loginpassword")).sendKeys("admin");
        driver.findElement(By.cssSelector("button[onclick='logIn()']")).click();
        driver.quit();
	}

}
