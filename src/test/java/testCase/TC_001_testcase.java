package testCase;
import org.testng.annotations.Test;
import pageObjects.Loginpage;
import testBase.Baseclass;


			public class TC_001_testcase extends Baseclass{
				@Test
				public void loginfunctionality() {
		
			Loginpage lp=new Loginpage(driver);
		
			lp.setuserName("vamshinani");
			
			lp.setPassword("Vamshi@133");
			
			
			lp.clickContinue();
			
		}

	}

