package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src\\test\\java\\features\\Login.feature",
glue = {"com.yalla.pages", "steps"}, 
monochrome = true,
dryRun = false,
snippets = SnippetType.CAMELCASE
/*tags = "~@reg"*/
				)
public class RunTest {

}





