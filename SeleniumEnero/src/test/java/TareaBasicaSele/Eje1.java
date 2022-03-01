package TareaBasicaSele;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Eje1 {
	
	public static WebDriver driver;
	
	
	
  @Test
  public void validaFacebook() {
	  System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe");
	  driver = new ChromeDriver();
	  
	  driver.get("https://es-la.facebook.com/");
	  driver.manage().window().maximize();
	  
	  Assert.assertEquals(driver.getTitle(), "Facebook - Inicia sesión o regístrate");
  }
  
  @BeforeTest
  public void beforeTest() {
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
	  
  }

}