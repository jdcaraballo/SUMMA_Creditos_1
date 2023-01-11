package creditos01.stepdefinitions.uploadfile;


import creditos01.interactions.HomePage;
import creditos01.questions.val_login.ValidateLoginBtoC;
import creditos01.questions.validate_massive_credits.serch_credit_by_company.ValidateCreditByCompanyOk;
import creditos01.tasks.autentication.LoginDirAct;
import creditos01.tasks.masive_credits.SerchCreditByCompanyOk;
import creditos01.tasks.upload_files.UploadFileCorrect;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class UploadFileStep {

    @Managed
    static
    WebDriver myDriver;
    @Before
    public static void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        theActorCalled("David").can(BrowseTheWeb.with(myDriver));
    }
    @Given("^que el Gestor Senior de Creditos inicia sesion con usuario (.*) con clave (.*)$")
    public void gestorIniciaSesion(String user, String key) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                HomePage.inPage());
        OnStage.theActorInTheSpotlight().attemptsTo(
                LoginDirAct.login(user, key));
    }

    @When("^el carga ela plantilla al aplicativo$")
    public void consultaCreditosPorCompania() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                UploadFileCorrect.upLoadFileT());
    }

    @Then("^se veran los beneficios por Conpania en pantalla$")
    public void seVeranBeneficiosCompaniaEnPantalla() {
//        theActorInTheSpotlight().should(seeThat(ValidateCreditByCompanyOk.inPage()));
    }



}
