package orangePOM;

import org.testng.annotations.Test;

import base.Base;
import poc.Login;
import poc.Admin;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class AdminTest {
	
	/*INSTANCIAR*/
	WebDriver driver;
	Base base;
	Admin admin;
	Login login;
	String username, password, userNotExist, usuario, nombre, contra;
  

	@BeforeClass
	  public void beforeClass() {
		
		base = new Base(driver);
		driver = base.setUpDriver();
		login = new Login(driver);
		admin = new Admin(driver);
		username = "Admin";
		password = "admin123";
		userNotExist = "asdasdasd";
		usuario= "Juan Perez";
		nombre= "Juan Perez 16";
		contra= "Contra1234!";
	  }
	
	@Test
  public void TC001_Admin_SearchEmployee() {
		login.loginOrange(username, password);
		admin.buscarUsuario(username);
		admin.validarUsuarioExistente(username);
		login.logOut();
  }
	
	@Test
	public void TC002_Admin_SearchEmployee_NotExist() {
		login.loginOrange(username, password);
		admin.buscarUsuario(userNotExist);
		admin.validarUsuarioNoExistente();
		login.logOut();
	}
	
	
	@Test
	public void TC003_Admin_AddNewUser() throws InterruptedException {
		login.loginOrange(username, password);
		admin.agregarUsuario(usuario, nombre, contra);
		admin.buscarUsuario(nombre);
		admin.validarUsuarioExistente(nombre);
		login.logOut();
	}
	
	
	/*
	 * FAILED: TC004_Admin_DeleteUser
org.openqa.selenium.NoSuchSessionException: invalid session id
Build info: version: '3.141.59', revision: 'e82be7d358', time: '2018-11-14T08:17:03'
	 * 
	 * 
	 */
	
	@Test
	public void TC004_Admin_DeleteUser() {
		login.loginOrange(username, password);
		admin.buscarUsuario(nombre);
		admin.borrarUsuario();
		admin.buscarUsuario(nombre);
		admin.validarUsuarioNoExistente();
		login.logOut();
		login.closeBrowser();
	}
	
	@Test
	public void TC005_Admin_CreateUserDisabled () throws InterruptedException {
		login.loginOrange(username, password);;
		admin.addUserDisable(usuario, nombre, contra);
		admin.buscarUsuario(nombre);
		admin.validarUsuarioDisable();
		login.logOut();
		login.closeBrowser();
	}
  
	/*
	 *FAILED: TC006_Validate_User_Admin
org.openqa.selenium.NoSuchSessionException: invalid session id
Build info: version: '3.141.59', revision: 'e82be7d358', time: '2018-11-14T08:17:03'
*/
	@Test
	public void TC006_Validate_User_Admin() {
		login.loginOrange(username, password);
		admin.buscarUsuario(username);
		admin.validarUsuarioAdmin();
		login.logOut();
		login.closeBrowser();
	}

  @AfterClass
  public void afterClass() {
  }

}
