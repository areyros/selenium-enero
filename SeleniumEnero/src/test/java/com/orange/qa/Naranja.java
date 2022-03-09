package com.orange.qa;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class Naranja {
	
	public static WebDriver driver;
	public String datos = "UserX1234512";
	
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
	  Assert.assertEquals(driver.findElement(By.id("welcome")).getText(), "Welcome Paul");
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
	  Assert.assertEquals(driver.findElement(By.id("welcome")).getText(), "Welcome Paul");
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
  
  
  @Test
  public void TC003_Admin_AddNewUser() throws InterruptedException {
	  
	  //PREPARATIVOS
	  System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver99.exe");
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
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  Assert.assertEquals(driver.findElement(By.id("welcome")).getText(), "Welcome Paul");
	  //Step 4	Click Admin - Go to the admin page
	  Reporter.log("Paso 4");
	  driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  
	  //Step 5	Click Add
	  Reporter.log("Paso 5");
	  driver.findElement(By.id("btnAdd")).click();
	  
	  //Step 6	Enter valid Employee Name
	  //Step 7	Enter valid username
	  //Step 8	Enter new password 
	  //Step 9	Enter  confirm password
	  //Step 10	Click Save
	  
	  Reporter.log("Paso 6,7,8,9,10");
	  driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys("No Me Borres");
	  driver.findElement(By.id("systemUser_userName")).sendKeys(datos);
	  driver.findElement(By.id("systemUser_password")).sendKeys(datos);
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(datos);
	  Thread.sleep(2000); //HARD WAIT--> SOLO USAR PARA CASOS EXTREMOS, SE GENERA DEUDA TECNICA, USAR MEJOR ESPERA DE ELEMENTOS
	  driver.findElement(By.id("btnSave")).click();
	  
	  //Step 11	Search username in field "Username"
	  Reporter.log("Paso 11");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.id("searchSystemUser_userName")).sendKeys(datos);
	  //Step 12	Click Search
	  Reporter.log("Paso 12");
	  driver.findElement(By.id("searchBtn")).click();
	  //Step 13	Verify username exist in table
	  Reporter.log("Paso 13");
	  driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
	  String nombre = driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td[2]")).getText();
	  System.out.println("ESte es el nombre que pusiste "+datos);
	  Assert.assertEquals(nombre, datos);
	  //Step 14	Log out
	  Reporter.log("Paso 14");
	  driver.findElement(By.id("welcome")).click();
	  driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[3]/a")).click();
	 // Step 15	Close Browser
	  Reporter.log("Paso 15");
	  driver.close();  
  }
  
  
  @Test
  public void TC004_Admin_DeleteUser() throws InterruptedException {
	  
	  //PREPARATIVOS
	  System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver99.exe");
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
	  Assert.assertEquals(driver.findElement(By.id("welcome")).getText(), "Welcome Paul");
	  //Step 4	Click Admin - Go to the admin page
	  Reporter.log("Paso 4");
	  driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  //Step 5	Search username in field "Username"
	  Reporter.log("Paso 5");
	  driver.findElement(By.id("searchSystemUser_userName")).sendKeys(datos);
	  //Step 6	Click Search
	  Reporter.log("Paso 6");
	  driver.findElement(By.id("searchBtn")).click();
	  //Step 7	Verify username exist in table
	  Reporter.log("Paso 7");
	  driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
	  String nombre = driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td[2]")).getText();
	  System.out.println("ESte es el nombre que pusiste "+nombre);
	  Assert.assertEquals(nombre, datos);
//	  Step 8	Select User
	  Reporter.log("Paso 8");
	  driver.findElement((By.id("ohrmList_chkSelectAll"))).click();

//	  Step 9	Click Delete
	  Reporter.log("Paso 9");
	  driver.findElement((By.id("btnDelete"))).click();
	  
//	  Step 10	Validate pop-window is displayed: "Delete Records?"
	  Reporter.log("Paso 10");
	  String texto = driver.findElement((By.xpath("//*[@id=\'deleteConfModal\']/div[2]/p"))).getText();
	  Assert.assertEquals(texto, "Delete records?");
//	  Step 11	Click Ok to confirm delete user
	  Reporter.log("Paso 11");
	  driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
	  driver.findElement((By.id("dialogDeleteBtn"))).click();
	  Thread.sleep(2000);
//	  Step 12	Validate in table that user was delete successfully
	  ///WebDriverWait wait = new WebDriverWait(driver, 5);
	  //wait.until(ExpectedConditions.attributeContains(By.id("successBodyDelete"), "data-backdrop", "null"));
	  //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("successBodyDelete")));
	  //texto = driver.findElement(By.id("successBodyDelete")).getText();
	  //Assert.assertEquals(texto, "Successfully Deleted");
	  
	  //Step 12 validando con búsqueda en la tabla
	  Reporter.log("Paso 12");
	  driver.findElement(By.id("searchSystemUser_userName")).sendKeys(datos);
	  driver.findElement(By.id("searchBtn")).click();
	  String noExisto = driver.findElement(By.xpath("//*[@id=\'resultTable\']/tbody/tr/td")).getText();
	  Assert.assertEquals(noExisto, "No Records Found");
//	  Step 13	Log out
	  Reporter.log("Paso 13");
	  driver.findElement(By.id("welcome")).click();
	  driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[3]/a")).click();
//	  Step 14	Close Browser
	  driver.close();  
  }
  
  @Test
  
  public void TC005_Admin_CreateUserDisabled () throws InterruptedException {
	  
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
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  Assert.assertEquals(driver.findElement(By.id("welcome")).getText(), "Welcome Paul");
	  //Step 4	Click Admin - Go to the admin page
	  Reporter.log("Paso 4");
	  driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  //Step 5	Click Add
	  Reporter.log("Paso 5");
	  driver.findElement(By.id("btnAdd")).click();
	  //Step 6	Enter valid Employee Name
	  //Step 7	Enter valid username
	  Reporter.log("Paso 6,7");
	  driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys("No Me Borres");
	  driver.findElement(By.id("systemUser_userName")).sendKeys(datos);	
	  //Step 8	Change Status Disabled
	  driver.findElement(By.id("systemUser_status")).sendKeys("Disabled");
	  
	  
	  //Step 9	Enter new password 
	  //Step 10	Enter  confirm password
	  //Step 11	Click Save
	  driver.findElement(By.id("systemUser_password")).sendKeys(datos);
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(datos);
	  Thread.sleep(2000); //HARD WAIT--> SOLO USAR PARA CASOS EXTREMOS, SE GENERA DEUDA TECNICA, USAR MEJOR ESPERA DE ELEMENTOS
	  driver.findElement(By.id("btnSave")).click();
	  //Step 12	Search username in field "Username"
	  Reporter.log("Paso 12");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.id("searchSystemUser_userName")).sendKeys(datos);
	  //Step 13	Click Search
	  Reporter.log("Paso 13");
	  driver.findElement(By.id("searchBtn")).click();
	  
	  //Step 14	Verify username exist in table
	  Reporter.log("Paso 14");
	  driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
	  
	  String desactivado = driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr[1]/td[5]")).getText();
	  System.out.println("ESte es el nombre que pusiste "+datos);
	  Assert.assertEquals(desactivado, "Disabled");
	  //Step 15	Log out
	  Reporter.log("Paso 15");
	  driver.findElement(By.id("welcome")).click();
	  driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[3]/a")).click();
	 // Step 16	Close Browser
	  Reporter.log("Paso 16");
	  driver.close();  
	  
  }
  
  @Test
  
  public void TC006_Validate_User_Admin() {
	//PREPARATIVOS
	  System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver99.exe");
	  driver = new ChromeDriver();
	  //Step 1	Launch browser
	  Reporter.log("Paso 1");
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  driver.manage().window().maximize();
	  //Step 2	Enter username and password
	  Reporter.log("Paso 2");
	  driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	  driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	  //Step 3	Click Login
	  Reporter.log("Paso 3");
	  driver.findElement(By.id("btnLogin")).click();
	  //Step 4	Verify user is logged successfully
	  Reporter.log("Paso 4");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  //Assert.assertEquals(driver.findElement(By.id("welcome")).getText(), "Welcome Paul");	  
	  //Step 5 	Click Admin tab
	  Reporter.log("Paso 5");
	  driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);  	  
	  //Step 6	Enter 'Admin' username text box
	  Reporter.log("Paso 6");
	  driver.findElement(By.id("searchSystemUser_userName")).sendKeys("Admin");
	  //Step 7	Click Search button
	  Reporter.log("Paso 7");
	  driver.findElement(By.id("searchBtn")).click();
	  //Step 8	Validate 'Admin' exist in result table
	  driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
	  String texto = driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td[3]")).getText();
	  Assert.assertEquals(texto, "Admin");
	  
	//LOG OUT AND CLOSE DRIVER
	  driver.findElement(By.id("welcome")).click();
	  driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[3]/a")).click();
	  driver.close();  
  }
  
  
  @Test
  
  public void TC007_Validate_Invalid_Password()	{
	//PREPARATIVOS
	  System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe");
	  driver = new ChromeDriver();
	  //Step 1	Launch browser
	  Reporter.log("Paso 1");
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  
	  //Step 2	Enter username and incorrect password
	  Reporter.log("Paso 2");
	  driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	  driver.findElement(By.name("txtPassword")).sendKeys("SDAFAWFAWFAF");
	 
	  //Step 3	Click Login
	  Reporter.log("Paso 3");
	  driver.findElement(By.id("btnLogin")).click();  
	  
	  //Step 4	Verify error message when enter invalid password
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  String texto = driver.findElement(By.id("spanMessage")).getText();
	  Assert.assertEquals(texto, "Invalid credentials");
	  
	  
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
