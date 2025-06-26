package CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
/* dryRun =true, required only when we want to compile the code to check any exceptions ,errors, code implementation missing*/
@CucumberOptions(features = "src/test/java/Features",  glue = "StepDefinitionFiles" ,tags="@SmokeTest" ,
plugin= {"pretty","html:target/HTMLReport.html" ,"json:target/JsonReport.json"})

public class TESTNGRunner extends AbstractTestNGCucumberTests  
{

	
}
