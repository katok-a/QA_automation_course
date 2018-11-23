package katok;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/katok/Features/", // path to Features
        glue = "katok.steps",//Path to Steps
        tags = "@Basic_test"
        //tags = "@All_Tests" - use this tag to run both tests
)
public class isHotelTest {
}
