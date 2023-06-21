package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"D:\\OnlineMayEvng\\Ebanking\\src\\feature\\Login.feature",
		                    "D:\\OnlineMayEvng\\Ebanking\\src\\feature\\Role.feature"},
                     glue="stepdefination",monochrome=true,
                     plugin= {"pretty","json:Target/Role/Roleresult.json"})

public class LoginRunner 
{

	
}
