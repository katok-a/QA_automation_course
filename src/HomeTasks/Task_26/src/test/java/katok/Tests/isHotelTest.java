package katok.Tests;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/katok/Features/", // path to Features
        glue = "katok.Steps",//Path to Steps
       //tags = "@Basic_test"
        tags = "@All_Tests"
)
public class isHotelTest {
}
