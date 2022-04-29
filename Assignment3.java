package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.opencart.com/index.php?route=account/register");
driver.findElement(By.id("input-firstname")).sendKeys("Thomas");
driver.findElement(By.id("input-lastname")).sendKeys("Edison");
driver.findElement(By.id("input-email")).sendKeys("edison@gmail.com");
driver.findElement(By.id("input-password")).sendKeys("kathirika");
driver.findElement(By.id("input-country")).sendKeys("India");
	}

}
