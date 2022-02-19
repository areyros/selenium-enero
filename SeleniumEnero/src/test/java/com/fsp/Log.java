package com.fsp;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;





public class Log {

	public static WebDriver driver;
	
	@Test
  public void Login() {
		
		//Asignación del webdriver
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe");
		driver = new ChromeDriver();
		
		//Abir portal con el objeto
		driver.get("https://www.farmaciasanpablo.com.mx/");
		//maximizar la pagina
		driver.manage().window().maximize();
		//cerrar el modal de envios foráneos
		driver.findElement(By.xpath("//*[@id=\"modalForaneo\"]/div/div/button")).click();
		//posicionarse en la parte que despliega los menus de login y registro
		driver.findElement(By.xpath("/html/body/main/header/div[2]/nav/div[2]")).click();
		//clic para abir el login
		driver.findElement(By.id("login-show-modal")).click();
		//esperar a que muestre el modal del login
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//driver.findElement(By.cssSelector("#common-modal .close > span")).click();
		
		//clic para el campo de nombre de usuario
		driver.findElement(By.xpath("//*[@id=\"j_username\"]")).click();
		//escribir sobre el campo el correo
		driver.findElement(By.xpath("//*[@id=\"j_username\"]")).sendKeys("sppruebasprod@gmail.com");
		//clic sobre el campo de contraseña
		driver.findElement(By.id("j_password")).click();
		//escribir sobre el campo contraseña
		driver.findElement(By.id("j_password")).sendKeys("Contra1234");
		//clic sobre el campo del botón para iniciar el login
		driver.findElement(By.id("loginBtn")).click();
		
		//driver.close();
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
