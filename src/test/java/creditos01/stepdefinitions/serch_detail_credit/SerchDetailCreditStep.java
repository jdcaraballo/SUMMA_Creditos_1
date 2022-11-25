package creditos01.stepdefinitions.serch_detail_credit;


import creditos01.interactions.HomePage;
import creditos01.questions.serch_detail_credit.ValidateDetailCredit;
import creditos01.tasks.Login;
import creditos01.tasks.masive_credits.*;
import creditos01.tasks.serch_detail_credit.SerchDetailCreditByLastName;
import creditos01.tasks.serch_detail_credit.SerchDetailCreditByName;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class SerchDetailCreditStep {

    @Given("^que el Gestor Senior de Creditos inicia sesion con usuario (.*) con clave (.*)$")
    public void gestorIniciaSesion(String user, String key) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                HomePage.inPage());
        OnStage.theActorInTheSpotlight().attemptsTo(
                Login.login(user, key));
    }

    @When("^el consulta detalles del credito por cédula (.*)$")
    public void elConsultaCreditoDeCedula(String id) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SerchCreditById.serchCreditById(id));
    }

    @Then("^se vera en pantalla el credito del colaborador con esa cedula$")
    public void seVeraCreditoEnPantalla() {
        theActorInTheSpotlight().should(seeThat(ValidateDetailCredit.inPage()));
    }

    @When("^el consulta detalles del credito por nombre (.*)$")
    public void elConsultaDetallesCreditoPorNombre(String name) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SerchDetailCreditByName.serchDetailCreditByName(name));
    }

    @Then("^se vera el detalle del credito en pantalla$")
    public void seVeraDetallesCreditoPorNombreEnPantalla() {
        theActorInTheSpotlight().should(seeThat(ValidateDetailCredit.inPage()));
    }

    @When("^el consulta detalles del credito por apellido (.*)$")
    public void elConsultaDetallesCreditoPorApellido(String lastName) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SerchDetailCreditByLastName.serchDetailCreditBylastName(lastName));
    }

    @Then("^se vera el detalle del credito en la pantalla$")
    public void seVeraDetallesCreditoPorApellidoEnLaPantalla() {
        theActorInTheSpotlight().should(seeThat(ValidateDetailCredit.inPage()));
    }
}
