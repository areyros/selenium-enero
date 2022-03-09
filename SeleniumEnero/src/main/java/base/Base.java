package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class Base {

	//Instancias
	private WebDriver driver;
	
	/*
	 * CONSTRUCTOR DEL WERB DRIVER
	 * @param: WebDriver 
	 * @return: 
	 * @throws:
	 * @author: alejandro.reyes
	 * @date: 8/Mar/2021
	 */
	public Base(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	
	/*
	 * LOG DE REPORTE
	 * @param: String 
	 * @return: 
	 * @throws:
	 * @author: alejandro.reyes
	 * @date: 8/Mar/2021
	 */
	public void reporterLog(String log) {
		Reporter.log(log);
	}
	
	
	/*
	 * SETEAR EL WEB DRIVER CON EL NOMBRE DEL DRIVER Y SU RUTA
	 * @param:  
	 * @return:WebDriver 
	 * @throws:
	 * @author: alejandro.reyes
	 * @date: 8/Mar/2021
	 */
	public WebDriver setUpDriver() {
		System.setProperty(VariablesGlobales.NAME_DRIVER,VariablesGlobales.PATH_CHROME_DRIVER);
		driver = new ChromeDriver();
		return driver;
	}
	
	/*
	 * LANZAR EL NAVEGADOR Y MAXIMIZARLO
	 * @param:
	 * @return: 
	 * @throws:
	 * @author: alejandro.reyes
	 * @date: 8/Mar/2021
	 */
	public void launchBrowers() {
		try {
		reporterLog("Lanzando navegador");
		driver.get(VariablesGlobales.QA_URL);
		driver.manage().window().maximize();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void closeBrowser() {
		driver.close();
	}
	
	/*
	 * ESCRIBIR SOBRE UN LOCATOR
	 * @param: Locator, texto a mandar
	 * @return: 
	 * @throws:
	 * @author: alejandro.reyes
	 * @date: 8/Mar/2021
	 */
	public void escribir (By locator, String texto) {
		if(texto.equals("")) {
			return;
		}
		driver.findElement(locator).sendKeys(texto);
	}
	
	
	/*
	 * HACER CLICK SOBRE ALGO
	 * @param: locator
	 * @return: 
	 * @throws:
	 * @author: alejandro.reyes
	 * @date: 8/Mar/2021
	 */
	public void click (By locator) {
		try {
			driver.findElement(locator).click();
		}catch(NoSuchElementException e) {
			e.printStackTrace();
		}
	}
	
	
	/*
	 * OBTENER EL TEXTO DE UN ELEMENTO
	 * @param: locator
	 * @return: 
	 * @throws:
	 * @author: alejandro.reyes
	 * @date: 8/Mar/2021
	 */
	public String getText(By locator) {
		return driver.findElement(locator).getText();
	}
	
	
	/*
	 * OBTENER EL CSS DE UN ELEMENTO
	 * @param: locator
	 * @return: 
	 * @throws:
	 * @author: alejandro.reyes
	 * @date: 8/Mar/2021
	 */
	public String getCss(By locator, String ccsValue) {
		return driver.findElement(locator).getCssValue(ccsValue);
	}
	
	
	/*
	 * VALIDADOR DE COMPARACIÓN ACTUAL VS ESPERADO
	 * @param: texto actual, texto esperado
	 * @return: 
	 * @throws:
	 * @author: alejandro.reyes
	 * @date: 8/Mar/2021
	 */
	public void validation(String actual, String esperado) {
		Assert.assertEquals(actual, esperado);
	}
	
	
	/*
	 * ESPERA EXPLICITA POR UN ELEMENTO
	 * @param: locator
	 * @return: 
	 * @throws:
	 * @author: alejandro.reyes
	 * @date: 8/Mar/2021
	 */
	public void waitForElementPresent(By locator) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, VariablesGlobales.STANDARD_TIME_OUT);
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		}catch(TimeoutException e) {
			e.printStackTrace();
		}
	}
	/*
	 * Wait for element present(Overloading)
	 */
	public void waitForElementPresent(By locator, int specificTimeout) {
		WebDriverWait wait = new WebDriverWait(driver, specificTimeout);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	
	/*
	 * ESPERA IMPLICITA DE UN ELEMENTO
	 * @param: locator
	 * @return: 
	 * @throws:
	 * @author: alejandro.reyes
	 * @date: 8/Mar/2021
	 */
	public void implicitWait() {
		driver.manage().timeouts().implicitlyWait(VariablesGlobales.STANDARD_TIME_OUT, TimeUnit.SECONDS);
	}
	

	public void hardWait() throws InterruptedException {
		Thread.sleep(base.VariablesGlobales.HARD_WAIT_TIME);
	}
	
}
