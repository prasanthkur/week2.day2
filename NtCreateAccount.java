package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class NtCreateAccount {
	/* * 1. Launch URL "http://leaftaps.com/opentaps/control/login" 
	 * 2. Enter UserName and Password Using Id Locator 
	 * 3. Click on Login Button using Class Locator 
	 * 4. Click on CRM/SFA Link 
	 * 5. Click on Accounts Button 
	 * 6. Click on Create Account
	 * 7. Select preferred currency as Indian Rupee using SelectByValue 
	 * 8. Enter the Description text as "NRI Account"
	 * 9. Enter LocalName Field Using Xpath Locator
	 * 10. Enter SiteName Field Using Xpath Locator 
	 * 11. Enter value for AnnualRevenue Field using Xpath Locator but class as Attribute
	 * 17. Click on Create Account using Xpath Locator 
	 * 18. Get the Text of Error MessageDisplayed (hint: Red Texts) close the browser
	 */

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
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.xpath("//select[@id='currencyUomId']")).sendKeys("INR");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("NRI Account");
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys(" Adams");
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("hello");
		driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("240000");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		String text1 = driver.findElement(By.xpath("//li[@class='errorMessage']")).getText();
		System.out.println(text1);
		driver.quit();

	}

}
