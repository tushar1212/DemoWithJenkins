package com.jbk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login {
	@Test
			public String login(){
					System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
					WebDriver driver = new ChromeDriver();
					driver.get("file:///G:/Tushar/Software/Offline%20Website%20FULL/Offline%20Website/Offline%20Website/index.html");
					driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
					driver.findElement(By.id("password")).sendKeys("123456");
					driver.findElement(By.xpath("//button")).click();

					return driver.getTitle();
				}

}
