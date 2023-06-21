package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\OnlineMayEvng\\Cucumber\\src\\feature\\ALogin.feature",
                   glue="stepdefination",monochrome=true)
public class Loginrunner 
{

}
