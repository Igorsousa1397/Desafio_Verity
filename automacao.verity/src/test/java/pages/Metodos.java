package pages;

import static org.junit.Assert.assertEquals;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import driver.Drivers;

public class Metodos extends Drivers {

	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}

	public void validarTexto(String textoEsperado, By elemento) {
		String texto = driver.findElement(elemento).getText();
		assertEquals(textoEsperado, texto);
	}

	public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}

	public void evidencias(String nomeEvidencias) {
		TakesScreenshot srcShot = (TakesScreenshot) driver;
		File srcFile = srcShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./Evidencias/" + nomeEvidencias + ".png");
		try {
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void pause(int tempo) {
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void fecharNavegador() {
		driver.quit();
	}
}
