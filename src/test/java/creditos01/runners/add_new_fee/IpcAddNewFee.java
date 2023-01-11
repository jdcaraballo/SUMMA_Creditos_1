package creditos01.runners.add_new_fee;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/login_da.feature",
        glue = "creditos01.stepdefinitions.login",
       snippets= SnippetType.CAMELCASE,
        dryRun = false
)
public class IpcAddNewFee {
}
