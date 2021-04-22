package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="/Users/Gurjit/eclipse-workspace/TeamDynamic/src/test/resources/Features", glue= {"step_definitions"})

public class TestRunner {

}
