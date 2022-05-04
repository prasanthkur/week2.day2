package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Find Accounts")).click();
		driver.findElement(By.xpath("(//input[@name='accountName'])[2]")).sendKeys("Credit Limited Account");
		driver.findElement(By.xpath("//button[contains(text(),'Find Accounts')]")).click();
		driver.findElement(By.linkText("Credit Limited Account")).click();
		driver.findElement(By.linkText("Edit")).click();
		String text1 = driver.findElement(By.id("accountName")).getText();
		String text2="Credit Limited Account";
		if(text1.equalsIgnoreCase(text2))
		{
			System.out.println("Text is correct");	
		
		}
		
		else
			System.out.println("text is incorrect");
			
				
			System.out.println(driver.getTitle());
				
		}
	

	}


