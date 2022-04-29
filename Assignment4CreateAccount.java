package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/login");
driver.manage().window().maximize();
driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.linkText("Create Account")).click();
driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account");
driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
driver.findElement(By.xpath("//input[@name='groupNameLocal']")).sendKeys("locale");
driver.findElement(By.xpath("//input[@name='officeSiteName']")).sendKeys("onsite");
driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("3000000");
driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();		
		
		
		
	}

}
