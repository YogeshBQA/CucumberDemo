package runner;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.DataProvider;

@CucumberOptions(features = "src/test/resources/features",
        glue={"org.example.stepdefinition"},
        plugin = {"pretty","html:target/cucumber-reports","json:target/cucumber.json "},
        monochrome=true,
        publish = true)
public class Testrunner extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios( ){
        return super.scenarios();
}
}
