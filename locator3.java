package selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class locator3 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://opensource-demo.orangehrmlive...");
		  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		  driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		  driver.findElement(By.className("button")).click();
		  driver.navigate().back();
		  driver.findElement(By.partialLinkText("Forgot your password?")).click();
		  driver.navigate().back();
		  driver.findElement(By.partialLinkText("password")).click();
	}
	
	

}
