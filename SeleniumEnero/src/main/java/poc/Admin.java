package poc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import base.Base;

public class Admin extends Base{

	public Admin(WebDriver driver) {
		super(driver);
	}

	/*OBJETOS*/
	
	By menuAdmin = By.xpath("//a[@id='menu_admin_viewAdminModule']");
	By txtUserName = By.id("searchSystemUser_userName");
	By btnSearch = By.id("searchBtn");
	By tblUsername = By.xpath("//tbody/tr[1]/td[2]");
	By tblUserNoExist = By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[4]/table/tbody/tr/td");
	By btnAdd = By.id("btnAdd");
	By txtNameEmp = By.id("systemUser_employeeName_empName");
	By txtSystemUser = By.id("systemUser_userName");
	By txtSystemPsw = By.id("systemUser_password");
	By txtConfirpsw = By.id("systemUser_confirmPassword");
	By btnSave = By.id("btnSave");
	By cbSelectAll = By.id("ohrmList_chkSelectAll");
	By btnDelete = By.id("btnDelete");
	By mdlConfirDelete = By.xpath("//*[@id=\"deleteConfModal\"]/div[2]/p");
	By btnDeleteConfir = By.id("dialogDeleteBtn");
	By txtStatus = By.id("systemUser_status");
	By tblStatus = By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td[5]");
	By tblRol = By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td[3]");
	
	private String txtNoExist="No Records Found";
	private String deleteConfir ="Delete records?";
	private String statusDisable = "Disable";
	private String statustblDisable = "Disabled";
	public String rolAdmin = "Admin";
	
	public void buscarUsuario (String username) {
		reporterLog("Buscar usuario");
		click(menuAdmin);
		escribir(txtUserName, username);
		implicitWait();
		waitForElementPresent(btnSearch);
		click(btnSearch);
	}
	
	public void validarUsuarioExistente (String username) {
		reporterLog("validar usuario existente");
		String actual = getText(tblUsername);
		validation(actual, username);
	}
	
	public void validarUsuarioNoExistente () {
		reporterLog("Rep usuario no existe");
		String actual = getText(tblUserNoExist);
		validation(actual, txtNoExist);
	}
	
	public void agregarUsuario(String user, String nombre, String contra) throws InterruptedException {
		reporterLog("Agregar usuario");
		click(menuAdmin);
		click(btnAdd);
		escribir(txtNameEmp, user);
		escribir(txtSystemUser, nombre);
		escribir(txtSystemPsw, contra);
		escribir(txtConfirpsw, contra);
		hardWait();
		click(btnSave);
	}
	
	public void addUserDisable (String user, String nombre, String contra) throws InterruptedException {
		reporterLog("Agregar usuario Desabilitado");
		click(menuAdmin);
		click(btnAdd);
		escribir(txtNameEmp, user);
		escribir(txtSystemUser, nombre);
		escribir(txtSystemPsw, contra);
		escribir(txtConfirpsw, contra);
		escribir(txtStatus, statusDisable);
		hardWait();
		click(btnSave);		
	}
	
	public void validarUsuarioDisable () {
		reporterLog("Validación usuario Disable");
		String texto = getText(tblStatus);
		validation(texto, statustblDisable);
	}
	
	public void validarUsuarioAdmin() {
		reporterLog("Validar si el usaurio es admin");
		String texto = getText(tblRol);
		validation(texto, rolAdmin);
	}
	
	
	public void borrarUsuario() {
		reporterLog("Borrar usuario");
		click(cbSelectAll);
		implicitWait();
		click(btnDelete);
		String actual = getText(mdlConfirDelete);
		validation (actual, deleteConfir);
		waitForElementPresent(btnDeleteConfir);
		click(btnDeleteConfir);
		implicitWait();
	}
	
}
