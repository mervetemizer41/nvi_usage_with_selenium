package com.mervetemizer41.webscrapper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.manager.SeleniumManagerOutput;
import org.openqa.selenium.remote.service.DriverFinder;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import java.time.Duration;
import java.util.List;
import java.io.File;


public class NviCerceve {

WebDriver driver;
WebElement pasaportLink;

	public void surucuYap(){
		 driver = new ChromeDriver();
	}
	
	public void taranacakSayfayiKur(){

		driver.get("https://randevu.nvi.gov.tr/default/index?type=3");
	    

		System.out.println(driver.getTitle());
        
       	}

	public void sayfaBileseniBul(){
		pasaportLink = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/form/div/a[3]"));
		
		/*
		.findElement(By.tagName("div")).findElements(By.tagName("div")).get(1)
		.findElement(By.tagName("form")).findElement(By.tagName("div")).findElements(By.tagName("a")).get(2).findElement(By.tagName("div"))
		.findElement(By.tagName("div")).findElement(By.tagName("div")).findElement(By.tagName("p"));
        */
//        /html/body/div[1]/div[1]/div/div/div[2]/form/div/a[3]/div/div/div/p
	//	System.out.println(paragraph.getText());
        
        }
        
        public void sayfaBilesenineTikla(){
       
        
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(1));
		
		
	       
		
		JavascriptExecutor executor = (JavascriptExecutor) driver;
	executor.executeScript("arguments[0].click();", pasaportLink);

		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div/div/div/div[4]/button[1]")));
        }
        
        public void surucuDurdur(){
		driver.quit();
	}
	  
	  
         

        
    
}
