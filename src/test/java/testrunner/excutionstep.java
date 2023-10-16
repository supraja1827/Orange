package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\Eclipse\\Cucumber\\featurefile\\login.feature",glue="stefdefinition",dryRun =false)

public class excutionstep {

}
