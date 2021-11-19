package runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

	
	@CucumberOptions(
			publish = true,
			features = "src//test//resources//taggedFeatures//",
			glue= {"stepdefs"},
			monochrome=true,
			dryRun=false,
			//tags="@RegressionTest",
		    //tags="@Smoketest",
			//tags="@RegressionTest or @Smoketest",
			//tags="@RegressionTes and @Smoketest"
			//tags="@phaseone and @RegressionTest"
			//phaseone at feature level
			//tags="@phaseone and not @RegressionTest",
			//tags="not @phaseone and  @RegressionTest"
			plugin= {"pretty",
					"html:target/reports/htmlreport.html",
					"usage:target/reports/usageReport",
					"json:target/reports/jsonReport.json",
					"rerun:target/rerun.txt"}
			)
	public class CRMtaggdRunner extends AbstractTestNGCucumberTests {

	}

