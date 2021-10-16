package com.rookie.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features",
				 glue = {"com.rookie.steps","com.rookie.classfile"},
				 plugin= {"pretty","html:target/site/cucumber-pretty","html:target/cucumber.html"},
				 monochrome = true,
				 publish = true)
public class ECommerceRunner {

}
