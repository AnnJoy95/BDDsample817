package runners;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		publish = true,
		features = "src//test//resources//features//",
		glue= {"stepdefs"},
		monochrome=true,
		dryRun=false,
		plugin= {"pretty",
				"html:target/reports/htmlreport.html",
				"usage:target/reports/usageReport",
				"json:target/reports/jsonReport.json",
				"rerun:target/rerun.txt"}
		)
public class GoogleRunner extends AbstractTestNGCucumberTests {

/*@DataProvider(parallel=true)
public Object[][] scenarios(){
	return super.scenarios();
}*/
}
