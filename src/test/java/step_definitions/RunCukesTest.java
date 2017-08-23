package step_definitions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by July on 7/7/17.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        plugin = {"pretty", "html:target/cucumber-html-report"},
        tags = {}
)

//@CucumberOptions(
//        strict = true,
//        features = "classpath:features",
//        plugin = {"json:target/cucumber-report.json","pretty", "html:target/cucumber-html-report"},
//        //tags = {}
//        tags = "@bvt",
//        monochrome = true,
//        glue = "step_definitions",
//        dryRun = false
//)
public class RunCukesTest {

}
//public class RunCukesTest extends AbstractTestNGCucumberTests {
//
//}