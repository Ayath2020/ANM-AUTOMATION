package com.ptm.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src\\test\\resources\\features\\CompraMineroSubsistencia.feature",
        glue = "com.ptm.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@ottm_assemble_json",
        plugin = "pretty"
)
public class Runner {
}
