package com.vytrack.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
//
        plugin = {
              //  "pretty",
                "json:target/cucumber.json"
               // ,"junit:target/JunitReports/report.xml",
                 //"html:target/cucumber-report.html",
                ,"rerun:target/rerun.txt"
        },

        features = "src/test/resources/features",
        glue = "com/vytrack/step_definitions",
        dryRun = false,
        tags = "@negative_login",
        publish = true

)

public class CucumberRunner {

    //tags = "@s_o and @with_two_columns",
    // scenario must have BOTH tags
    //java logic if(@s_o && @with_two_columns)

    //tags = "@s_o or @with_two_columns",
    // scenario must have EITHER OR tags
    //java logic if(@s_o || @with_two_columns),

}
