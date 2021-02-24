package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {
	
	WebDriver driver;
	
	public void abrirBrowser (String site) {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(site);
		driver.manage().window().maximize();
	}
		
	public void fecharNavegador() {
		driver.quit();
		
	}
	public void escrever(String texto, By elemento) {
		
		driver.findElement(elemento).sendKeys(texto);
		
	}
	
		public void click(By elemento) {
			driver.findElement(elemento).click();
				
	}
		public void time () throws InterruptedException {
			Thread.sleep(5000);
		}
		public void esperaImplicita() {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

}
}