package com.cydeo.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-report.html",
        "rerun:target/rerun.txt",
        "me.jvt.cucumber.report.PrettyReports:target/cucumber" },
        features = "src/test/resources/features", //  comes from "feature folder"->right click->copy path->click->path from content/root
        glue = "com/cydeo/step_definitions",  // glue means step definitions classes -> step_definitions->right click->copy path->click->path from source/root

        dryRun = false, // To get [snippets = true] [false for none]
        //Make dryRun False when you need to run Implementation
        tags = "@smoke",
        publish = true
// tags = "@smoke"
//        plugin = "html:target/cucumber-report.html"
        //dryRun = true, // to get snippets we must make true

)
public class CukesRunner {

}
