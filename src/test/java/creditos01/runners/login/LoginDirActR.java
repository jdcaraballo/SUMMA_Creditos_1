package creditos01.runners.login;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/login/login_da.feature",
        glue = "creditos01.stepdefinitions.login.login_da",
       snippets= SnippetType.CAMELCASE,
        dryRun = false
)
public class LoginDirActR {
}
