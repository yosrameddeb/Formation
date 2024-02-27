package Run;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(tags = "@ LoginAutomation"	
,features = "src/test/features/TesttCucumber/Authentification.feature"
,glue={"CucumberTest"}
,publish = true
,plugin= {"pretty"
		,"html:target/cucumber-reports.html"
		,"json:target/cucumber-reports"
		,}
,snippets = io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE
,monochrome = true)



public class Runner {

}
