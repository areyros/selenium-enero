package poc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.Base;

public class Login extends Base{

	public Login(WebDriver driver) {
		super(driver);
	}
	
	/* OBJETOS*/
	
	By txtUsername= By.id("txtUsername");
	By txtPassword= By.name("txtPassword");
	By btnLogin= By.id("btnLogin");
	
	By lnkWelcome = By.xpath("//a[@id='welcome']");
	By lnkLogout = By.xpath("//a[contains(@href, 'logout')]");
	By lblError = By.id("spanMessage");

	private String mensajeError="Invalid credentials";
	
	
	/* METODOS */ 
	
	public void loginOrange(String username, String password){
		reporterLog("Login");
		launchBrowers();
		escribir(txtUsername, username);
		escribir(txtPassword, password);
		click(btnLogin);
		waitForElementPresent(lnkWelcome);
	}
	
	public void logOut() {
		reporterLog("Log Out");
		click(lnkWelcome);
		click(lnkLogout);
		implicitWait();
		closeBrowser();
	}
	
	public void validatedBadCredenctials(String username, String badpsw) {
		reporterLog("Validación de malas credenciales");
		launchBrowers();
		escribir(txtUsername, username );
		escribir(txtPassword, badpsw );
		click(btnLogin);
		String texto = getText(lblError);
		validation(texto , mensajeError);
		
	}
	
}
