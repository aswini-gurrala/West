package tet;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


 @RunWith(Cucumber.class)
@CucumberOptions(format = {"html:target/whisper-html-report","json:target/whisper_report.json"})



public class runTest {


}
