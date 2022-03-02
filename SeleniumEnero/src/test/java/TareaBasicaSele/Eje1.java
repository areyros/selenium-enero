package TareaBasicaSele;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Eje1 {
	
	public static WebDriver driver;
	
	
	
  @Test
  public void Ejercicio1() {
	  System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe");
	  driver = new ChromeDriver();
	  
	  driver.get("https://es-la.facebook.com/");
	  driver.manage().window().maximize();
	  
	  Assert.assertEquals(driver.getTitle(), "Facebook - Inicia sesión o regístrate");
  }
  
  @Test
  public void Ejercicio2() {
	  System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe");
	  driver = new ChromeDriver();
	  
	  driver.get("https://es-la.facebook.com/");
	  Assert.assertEquals(driver.getCurrentUrl(), "https://es-la.facebook.com/");
	  
  }
  
  
  @Test
  public void Ejercicio3() {
	  System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://es-la.facebook.com/");
	  driver.manage().window().maximize();
	  
	  driver.findElement(By.id("email")).sendKeys("areyros@protonmail.com");
	  driver.findElement(By.xpath("//*[@id=\"passContainer\"]")).click();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//*[@id=\"passContainer\"]")).sendKeys("Contra1234)!");
	  driver.findElement(By.name("login")).click();
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  
  }

  @AfterTest
  public void afterTest() {
	  //driver.close();
	  
  }

}