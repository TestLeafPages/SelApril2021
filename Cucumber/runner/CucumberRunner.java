package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(features= {"src/test/java/features"}, 
				 glue = {"steps","hooks"}, 
				 monochrome = true,
				 publish = true
				// tags = "@functional" // to run only functional scenarios
				// tags = "@functional or @regression" // it will executed test cases have @functional or @regression
				// tags = "not @regression" // except regression, all other test cases will be executed
				// tags = "@functional and @smoke" //will execute the test cases with both @functional and @smoke
				 //dryRun = true,
				 //snippets = SnippetType.CAMELCASE
				 )
public class CucumberRunner extends AbstractTestNGCucumberTests{

}
