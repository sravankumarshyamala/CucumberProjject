package testRunner;

//import org.junit.runner.RunWith;

//import org.junit.runner.RunWith;

//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//import io.cucumber.junit.Cucumber;

//@RunWith(Cucumber.class)
@CucumberOptions(
		         features="FeatureFiles/Supplier.feature",
		          monochrome=true,
		          glue="stepDefination",
		          dryRun=false
		          
		       )

public class AppTest extends AbstractTestNGCucumberTests 
{

}
