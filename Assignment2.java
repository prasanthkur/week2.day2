package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("hala@gmail.com");
		driver.findElement(By.xpath("//input[contains(@value,'Append ')]")).sendKeys(""+ "myName");
		System.out.println(driver.findElement(By.name("username")).getAttribute("value"));
		 driver.findElement(By.name("username")).sendKeys(Keys.TAB);
		 
	driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
	  boolean enabled = driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled();
if(enabled==false)
	System.out.println("Text box is disabled");
	//driver.close();
	}

}
