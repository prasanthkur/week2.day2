package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("(//input[@class='inputLogin'])[1]")).sendKeys("Demosalesmanager");
	 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("crmsfa");
	 driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
	 driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
	 driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
	 driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("DXC");
	 driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("hamara");
	 driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("bajaj");
	 driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	 String text = driver.findElement(By.linkText("//span[contains(text(),'gg (11227)')]")).getText();
	 System.out.println(text);

	}

}
