package com.mervetemizer41.webscrapper;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.time.Duration;
import java.util.List;


public class NviAsil {


	public static void main(String[] args) {
		NviCerceve nc = new NviCerceve();
		nc.surucuYap();
		nc.taranacakSayfayiKur();
		nc.sayfaBileseniBul();
		nc.sayfaBilesenineTikla();
		//nc.surucuDurdur();
	}
 
 }
