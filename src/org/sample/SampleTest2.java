package org.sample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Test2\\webdriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.way2automation.com/demo.html");
		driver.manage().window().maximize();
		HashMap<String, Integer> map= new LinkedHashMap<>();
		List<WebElement> findElements = driver.findElements(By.xpath("//div[@class='linkbox margin-bottom-20']//h1"));
		for (WebElement k : findElements) {
			    String Heading = k.getText();
			    int NoOfBox = driver.findElements(By.xpath("//h1[text()='"+Heading+"']//following-sibling::ul//li")).size();
			    
			    map.put(Heading,NoOfBox);
			    System.out.println(Heading);
			    System.out.println(NoOfBox);
			}
		System.out.println(map);
		driver.close();
		
	
	}

}
