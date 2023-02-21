package Initialization;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TextTamil extends Initialization  {
	
	public static void main(String[] args) {
		
		driver.get("https://www.amazon.in/");
		
		List<WebElement> allText = driver.findElements(By.tagName("a"));
		
		for(WebElement ele: allText) {
			
			String attribute = ele.getAttribute("href");
			
			System.out.println(attribute);
			
		}
		
		
	}

}
