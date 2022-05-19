package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbCss {
		
		  public static void main(String[] args) throws InterruptedException {
			 
			  System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Tamil\\driver\\chromedriver.exe");
			  WebDriver driver=new ChromeDriver();
			  driver.manage().window().maximize();
			  driver.get("https://www.facebook.com/");
			  
			  String user="//input[@class='inputtext _55r1 _6luy']";
			  driver.findElement(By.xpath(user)).sendKeys("Dk");
              
         String pass=""+user+"//parent::div[@class='_6lux']//following-sibling::div[@class='_6lux']//child::div[@id='passContainer']//child::input[@name='pass']";   
         driver.findElement(By.xpath(pass)).sendKeys("Siddharth");
         
         
         String log=""+pass+"//ancestor::div[@class='_6lux']//parent::div//following-sibling::div[@class='_6ltg']//child::button[@name='login']";
         Thread.sleep(4000);
         driver.findElement(By.xpath(log)).click();
               
}
}