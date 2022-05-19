package org.sample;


import java.util.Hashtable;
import java.util.List;
import java.util.Map;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAcc {
	
  public static void main(String[] args) {
	 
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Tamil\\driver\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.amazon.in/");
	  WebElement findElement = driver.findElement(By.id("twotabsearchtextbox"));
	  findElement.sendKeys("iphone");
	  driver.findElement(By.id("nav-search-submit-button")).click();
	  
	  String BrandName="Blue";
	  String xpath="//span[contains(text(),'"+BrandName+"')]";
	  String xpath1="//span[contains(text(),'"+BrandName+"')]//ancestor::div[@class='a-section a-spacing-none s-padding-right-small s-title-instructions-style']//following-sibling::div[@class='sg-row']//child::span[@class='a-price-whole']";
	  
       List<WebElement>productsName=driver.findElements(By.xpath(xpath));
       List<WebElement> productsPrice = driver.findElements(By.xpath(xpath1));
              for(int i=0;i< productsPrice.size(); i++) {
            	      String name=productsName.get(i).getText();  
                	  String price=productsPrice.get(i).getText();

	                  Map<String,String>m=new Hashtable<String, String>();
	                  m.put(name,price);
	      			  System.out.println(m);
                  }
  }
  
}
  
              