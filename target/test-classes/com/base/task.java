package com.base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class task extends Base {
	static WebDriver driver;
	public static void amazon() {
List<WebElement> categoryList = driver.findElements(By.xpath("//a[@id=\"nav-link-shopall\"]"));
for (int i = 0; i < categoryList.size(); i++) {
	if(categoryList.get(i).equals("Mobiles, Computers"))
	{
		WebElement category = driver.findElement(By.xpath("//span[text()='Mobiles, Computers']"));
		Mouseover(category);
	}
	
}
	}
	
	

}
