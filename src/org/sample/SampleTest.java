package org.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Test2\\webdriver\\chromedriver.exe");
	WebDriver dr= new ChromeDriver();
	dr.get("http://www.way2automation.com/demo.html");
	dr.manage().window().maximize();
	List<WebElement> elements = dr.findElements(By.xpath("//div[@class='linkbox margin-bottom-20']//h1"));
	for (WebElement k : elements) {
		System.out.println(k.getText());
		
	}

}
}
