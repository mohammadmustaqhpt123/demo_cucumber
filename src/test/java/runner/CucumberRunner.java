package runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/cucumber_test", // Location of your feature files
    glue = {"step_defination"}, // Package where your step definitions are located
    tags = "@tag1", // Tags to filter scenarios to run
    plugin = {"pretty", "html:target/cucumber-reports"} // Plugins for reporting
)
public class CucumberRunner {
}
