package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/java/features/CreateLead.feature",glue="steps",monochrome =true, plugin= {"pretty","html:cucumber-reports"})
public class RunSteps extends AbstractTestNGCucumberTests{

}
