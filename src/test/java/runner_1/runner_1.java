package runner_1;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/Login/Login.feature"},glue={"defination_1"},tags="@NegativeTesting",plugin= {"html:testoutput/cucumberdipak.html"})

public class  runner_1 {
}
