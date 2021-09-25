package org.sample;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Test2\\webdriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.way2automation.com/demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//h2[text()='Draggable']")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		ArrayList<String> a= new ArrayList<>(windowHandles);
		String s = a.get(1);
		driver.switchTo().window(s);
		
		   driver.findElement(By.xpath("//input[@name='name']")).sendKeys("venu");
			
			driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("2345678");
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("venu34@gmail.com");
			driver.findElement(By.xpath("//input[@name='city']")).sendKeys("salem");
			driver.findElement(By.xpath("(//input[@name='username'])[2]")).sendKeys("vg");
	        driver.findElement(By.xpath("(//input[@name='password'])[2]")).sendKeys("678%$#");
	        driver.findElement(By.xpath("(//input[@class='button'])[2]")).click();

	 
		
     //driver.close();
	}

}
