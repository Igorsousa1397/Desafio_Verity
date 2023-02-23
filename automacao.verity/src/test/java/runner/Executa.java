package runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import driver.Drivers;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = "steps", 
		tags = "@contato", 
		plugin = {"pretty","html:target/cucumber-report.html" }, 
		dryRun = false, 
		monochrome = true, 
		snippets = SnippetType.CAMELCASE)

public class Executa extends Drivers {

	public static void abrirNavegador() {
		String verity = "https://www.verity.com.br";
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--disable-notifications");
		driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.get(verity);
	}
}
