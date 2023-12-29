package com.Adactin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdactinMiniProject {


		public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kokila\\eclipse-workspace\\ProjectClass\\ProjectClass\\driver\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
			
			driver.get("https://adactinhotelapp.com/");
		
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Kokila1029");
			
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Dhaya@1029");
			
			driver.findElement(By.xpath("//input[@type='Submit']")).click();
			
			WebElement dropdown1 = driver.findElement(By.xpath("//select[@name='location']"));
			
			Select s= new Select (dropdown1);
			
			s.selectByIndex(5);
			
			WebElement dropdown2 = driver.findElement(By.xpath("//select[@id='hotels']"));
			
			Select s1=new Select (dropdown2);
			
			s1.selectByVisibleText("Hotel Cornice");
			
			WebElement dropdown3 = driver.findElement(By.xpath("//select[@id='room_type']"));
			
			Select s3=new Select(dropdown3);
			
			s3.selectByValue("Deluxe");
			
			WebElement dropdown4 = driver.findElement(By.xpath("//select[@id='room_nos']"));
			
			Select s4=new Select(dropdown4);
			
			s4.selectByValue("2");
			
			WebElement dropdown5 = driver.findElement(By.xpath("//select[@name='adult_room']"));
			
			Select s5 = new Select(dropdown5);
			
			s5.selectByValue("2");
			
			WebElement dropdown6 = driver.findElement(By.xpath("//select[@name='child_room']"));
			
			Select s6 = new Select(dropdown6);
			
			s6.selectByIndex(2);
			
			driver.findElement(By.xpath("//input[@id='Submit']")).click();
			
			driver.findElement(By.xpath("//input[@name='radiobutton_0']")).click();
			
			driver.findElement(By.xpath("//input[@id='continue']")).click();
			
			driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Kokila");
			
			driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("P");
			
			driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("No.1,Kaviya Colony,Guindy,chennai");
			
			driver.findElement(By.xpath("//input[@name='cc_num']")).sendKeys("1234567891234567");
			
			WebElement dropdown7 = driver.findElement(By.xpath("//select[@name='cc_type']"));
			
			Select s7=new Select(dropdown7);
			
			s7.selectByVisibleText("Master Card");
			
			WebElement dropdown8 = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
			
			Select s8 =new Select(dropdown8);
			
			s8.selectByValue("6");
			
			WebElement dropdown9 = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
			
			Select s9=new Select(dropdown9);
			
			s9.selectByValue("2027");
			
			driver.findElement(By.xpath("//input[@name='cc_cvv']")).sendKeys("346");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@name='book_now']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@id='my_itinerary']")).click();
			
			driver.findElement(By.xpath("//input[@name='logout']")).click();
			
			driver.navigate().back();
			
			driver.quit();
					
			
			
		}

	}

	
	
	
	
	
	
	
	
	
	
	
		
	


