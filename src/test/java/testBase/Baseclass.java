package testBase;

import java.time.Duration;
import java.util.ResourceBundle;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObjects.Loginpage;

public class Baseclass {

	public static WebDriver driver;
	public Logger logger;// for logging
	//public ResourceBundle rb;
	
	//@Parameters({"browser"})
	@BeforeClass
	public void setup() {
		logger=LogManager.getLogger(this.getClass());
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://adactinhotelapp.com/");
	}
	
		@Test
		public void loginfunctionality1() {

	Loginpage lp=new Loginpage(driver);

	lp.setuserName("vamshinani");
	
	lp.setPassword("Vamshi@133");
	
	
	lp.clickContinue();
		}


	
	@AfterClass
	public void close() {
		driver.quit();
		
	}

	}
