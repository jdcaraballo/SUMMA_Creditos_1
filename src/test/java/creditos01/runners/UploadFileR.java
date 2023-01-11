package creditos01.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/upload_file.feature",
        glue = "creditos01.stepdefinitions.uploadfile",
       snippets= SnippetType.CAMELCASE,
        dryRun = false
)
public class UploadFileR {
}
