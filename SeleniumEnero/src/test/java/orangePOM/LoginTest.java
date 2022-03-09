package orangePOM;

import org.testng.annotations.Test;

import base.Base;
import poc.Login;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class LoginTest {
	
	/*INSTANCIAR*/
	WebDriver driver;
	Base base;
	Login login;
	String username, password, wrgpsw;
	
	@BeforeClass
	public void beforeClass() {
	
		base = new Base(driver);
		driver = base.setUpDriver();
		login = new Login(driver);
	
		username = "Admin";
		password = "admin123";
		wrgpsw = "asdadad";
	}
	
	
	@Test
  public void primerLog() {

		login.loginOrange(username, password);
		login.closeBrowser();
  }
	
	@Test
	
	public void TC007_Validate_Invalid_Password() {
		login.validatedBadCredenctials(username, wrgpsw);
		login.closeBrowser();
	}

	
	
  

  @AfterClass
  public void afterClass() {
  }

}
