package creditos01.stepdefinitions.serch_all_detail_credit;


import creditos01.interactions.HomePage;
import creditos01.questions.serch_detail_credit.ValidateDetailCredit;
import creditos01.tasks.Login;
import creditos01.tasks.SerchCreditByAll;
import creditos01.tasks.masive_credits.SerchCreditById;
import creditos01.tasks.serch_detail_credit.SerchDetailCreditByLastName;
import creditos01.tasks.serch_detail_credit.SerchDetailCreditByName;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class SerchAllDetailCreditStep {

    @Given("^que el Gestor Senior de Creditos inicia sesion con usuario (.*) con clave (.*)$")
    public void gestorIniciaSesion(String user, String key) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                HomePage.inPage());
        OnStage.theActorInTheSpotlight().attemptsTo(
                Login.login(user, key));
    }

    @When("^el consulta creditos por compania (.*)$")
    public void elConsultaCreditoDeCedula(String company) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SerchCreditByAll.serchCreditsAll(company));
    }

    @Then("^se vera en pantalla el credito del colaborador con esa cedula$")
    public void seVeraCreditoEnPantalla() {
        theActorInTheSpotlight().should(seeThat(ValidateDetailCredit.inPage()));
    }




}
