package kiosk.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src\\test\\java\\kiosk.feature"},glue = "koisk\\stepdef",dryRun = !true,monochrome = true,
tags = "@TC001 or @TC003 or @TC005 or @TC006",
plugin = "pretty",
publish = true)
public class kioskrunner {
	

}
