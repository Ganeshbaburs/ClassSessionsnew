package steps;

import com.yalla.selenium.api.base.SeleniumBase;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends SeleniumBase{
	@Before
	public void beforeScenario(Scenario sc) {
		System.out.println(sc.getName());
		System.out.println(sc.getId());
		startReport();
		test = extent.createTest(sc.getName(), sc.getId());
		test.assignAuthor("Sethu");
		test.assignCategory("smoke");
		startApp("chrome", "http://leaftaps.com/opentaps");
	}
	@After
	public void afterScenario(Scenario sc) {
		System.out.println(sc.getStatus());	
		close();
		stopReport();
	}


}




