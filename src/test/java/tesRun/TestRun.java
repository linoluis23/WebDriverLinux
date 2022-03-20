
// puto de partida de ejecucoin de las pruebas
 package tesRun;


import com.vimalselvam.cucumber.listener.Reporter;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;

import java.io.File;


@RunWith(Cucumber.class)


@CucumberOptions(
        features = "src/test/java/features/",
        glue = {"selenium"},
        //plugin = {"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:test/report/report.html"},
        monochrome = true
)
public class TestRun {
 @AfterClass
 public static void teardown() {
  Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
  Reporter.setSystemInfo("user", System.getProperty("user.name"));
  Reporter.setSystemInfo("os", "Mac OSX");
  Reporter.setTestRunnerOutput("Sample test runner output message");
 }

}

