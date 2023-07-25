package com.example.AppSebra;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(format = "pretty", features = "src/test/java/com/example/AppSebra/conta")
public class ContaTest {
}
