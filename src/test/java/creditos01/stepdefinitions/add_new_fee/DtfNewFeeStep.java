package creditos01.stepdefinitions.add_new_fee;


import creditos01.interactions.HomePage;
import creditos01.model.dtf_new.DatosDtfBuilder;
import creditos01.tasks.autentication.LoginB2C;
import creditos01.tasks.dtf_add_new_fee.DatosDtf2023;
import creditos01.tasks.dtf_add_new_fee.DtfAddNewFee;
import creditos01.tasks.autentication.LoginDirAct;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;


public class DtfNewFeeStep {
    @Managed
    static
    WebDriver myDriver;
    @Before
    public static void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        theActorCalled("David").can(BrowseTheWeb.with(myDriver));
    }
    @Given("^que el Gestor Senior de Creditos inicia sesion con usuario (.*) con clave (.*)$")
    public void queElGestorSeniorDeCreditosIniciaSesionConUsuarioUpruebasSummaSciComConClaveDXMXhbRUwYoExg(String user, String key) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                HomePage.inPage());
        OnStage.theActorInTheSpotlight().attemptsTo(
                LoginDirAct.login(user, key));
        OnStage.theActorInTheSpotlight().attemptsTo(
                DtfAddNewFee.inPage());
    }

    @When("^el agrega fecha del proximo peridio 2023 con los siguientes valores$")
    public void fechaProximoPeriodo(List<Map<String, String>> datos) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                DatosDtf2023.inPage(DatosDtfBuilder.con()
                        .description(datos)
                        .initialDate(datos)
                        .finalDate(datos)
                        .fee(datos))
        );
    }

    @Then("^se vera mensaje de interes cargado con exito$")
    public void seVeraMensajeExitosoDeCarga() {
//        769101theActorInTheSpotlight().should(seeThat(ValidateBoxAddFee.inPage()));
    }
}
