package creditos01.runners.add_new_fee;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/new_fee/dtf_add_new_fee.feature",
        glue = "creditos01.stepdefinitions.add_new_fee",
       snippets= SnippetType.CAMELCASE
//        dryRun = false
)
public class DtfAddNewFee {
}
