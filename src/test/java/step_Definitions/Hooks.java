package step_Definitions;

import org.openqa.selenium.chrome.ChromeDriver;

import base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Hooks extends Base{
	
	@Before
	public void setUp() throws MalformedURLException {
		ChromeOptions opt = new ChromeOptions();

		driver = new RemoteWebDriver(new URL("http://3.145.197.131:4444"),opt);
		System.out.println("Before Run");
	}
	
	@After
	public void tearDown() {
		driver.close();
		System.out.println("After Run");
	}

}//class
