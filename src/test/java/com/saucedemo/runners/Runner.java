package com.saucedemo.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "C:\\Users\\Andres\\IdeaProjects\\swagLabs_pom\\src\\test\\resources\\features\\ComprarArticulo.feature",
        glue = "com.saucedemo.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = "pretty"
)
public class Runner {
}
