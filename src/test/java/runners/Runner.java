package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="//Users//rashmikanduluvavikraman//selenium-workspace//CucumberProject//src//test/java//features//NewAccount.feature",
		glue="steps",
		//tags="",
		monochrome=true,
		dryRun=false,
		plugin=
			{
			"pretty",
			"html:target/cucumber",
			"json:target/cucumber.json"
			},
		strict=true)

public class Runner {

}
