package com.orange.qa;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class Naranja {
	
	public static WebDriver driver;
	
  @Test
  public void TC001_Admin_SearchEmployee() {
	  
	  //PREPARATIVOS
	  System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe");
	  driver = new ChromeDriver();
	  //Step 1	Open Browser "OrangeHRM" web page
	  Reporter.log("Paso 1");
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  driver.manage().window().maximize();
	  //Step 2	Enter Username, Password and click Login
	  Reporter.log("Paso 2");
	  driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	  driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	  driver.findElement(By.id("btnLogin")).click();
	  //Step 3	Validate that you have logged in successfully
	  Reporter.log("Paso 3");
	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	  //Step 4	Click Admin - Go to the admin page
	  Reporter.log("Paso 4");
	  driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  //Step 5	Search username in field "Username"
	  Reporter.log("Paso 5");
	  driver.findElement(By.id("searchSystemUser_userName")).sendKeys("adash");
	  //Step 6	Click Search
	  Reporter.log("Paso 6");
	  driver.findElement(By.id("searchBtn")).click();
	  //Step 7	Verify username exist in table
	  Reporter.log("Paso 7");
	  driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
	  String nombre = driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td[2]")).getText();
	  System.out.println("ESte es el nombre que pusiste "+nombre);
	  Assert.assertEquals(nombre, "adash");
	  //Step 8	Log out
	  Reporter.log("Paso 8");
	  driver.findElement(By.id("welcome")).click();
	  driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[3]/a")).click();
	 // Step 9	Close Browser
	  Reporter.log("Paso 9");
	  driver.close();  
  }
  
  
  @Test
  public void TC002_Admin_SearchEmployee_NotExist() {
	  
	  //PREPARATIVOS
	  System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe");
	  driver = new ChromeDriver();
	  
	  //Step 1	Open Browser "OrangeHRM" web page
	  Reporter.log("Paso 1");
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  driver.manage().window().maximize();
	  //Step 2	Enter Username, Password and click Login
	  Reporter.log("Paso 2");
	  driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	  driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	  driver.findElement(By.id("btnLogin")).click();
	  //Step 3	Validate that you have logged in successfully
	  Reporter.log("Paso 3");
	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	  //Step 4	Click Admin - Go to the admin page
	  Reporter.log("Paso 4");
	  driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  //Step 5	Search username in field "Username"
	  Reporter.log("Paso 5");
	  driver.findElement(By.id("searchSystemUser_userName")).sendKeys("asdasdasdasdasd");
	  //Step 6	Click Search
	  Reporter.log("Paso 6");
	  driver.findElement(By.id("searchBtn")).click();

	  
	  //	  Step 7	Verify username is not exist in table
	  Reporter.log("Paso 7");
	  String noExisto = driver.findElement(By.xpath("//*[@id=\'resultTable\']/tbody/tr/td")).getText();
	  Assert.assertEquals(noExisto, "No Records Found");
	 
	  //Step 8	Log out
	  Reporter.log("Paso 8");
	  driver.findElement(By.id("welcome")).click();
	  driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[3]/a")).click();
	 // Step 9	Close Browser
	  Reporter.log("Paso 9");
	  driver.close();  

	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("SE INICIAN LAS PRUEBAS");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("ACABARON LAS PRUEBAS");
  }

}
