package com.app.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\HP\\eclipse-workspace\\Develop\\new"
		+ "\\new\\oct\\Dec_Cucumber\\src\\test\\java\\com\\app\\feature",
		glue = "com.app.stepdefinition",
		dryRun = false,
		tags = "@RunAll",
		publish = true,
		monochrome = true)
public class Runner {

}
