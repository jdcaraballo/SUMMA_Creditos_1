package creditos01.stepdefinitions.serch_all_detail_credit;


import creditos01.interactions.HomePage;
import creditos01.tasks.autentication.LoginDirAct;
import creditos01.tasks.serch_all_credits.SerchCreditByAll;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class SerchAllDetailCreditStep {

    @Given("^que el Gestor Senior de Creditos inicia sesion con usuario (.*) con clave (.*)$")
    public void gestorIniciaSesion(String user, String key) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                HomePage.inPage());
        OnStage.theActorInTheSpotlight().attemptsTo(
                LoginDirAct.login(user, key));
    }

    @When("^el consulta creditos por compania (.*)$")
    public void elConsultaCreditoDeCedula(String company) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SerchCreditByAll.serchCreditsAll(company));
    }

    @Then("^se veran los creditos por Conpania en pantalla$")
    public void seVeraCreditoEnPantalla() {
//        theActorInTheSpotlight().should(seeThat(ValidateDetailCredit.inPage()));
    }




}
