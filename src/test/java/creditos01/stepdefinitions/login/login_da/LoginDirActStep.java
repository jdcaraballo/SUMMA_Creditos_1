package creditos01.stepdefinitions.login.login_da;


import creditos01.interactions.HomePage;
import creditos01.questions.val_login.ValidateLoginBtoC;
import creditos01.tasks.autentication.LoginDirAct;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class LoginDirActStep {

    @Given("^que el abre pagina principal$")
    public void queElAbrePaginaPrincipal() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                HomePage.inPage());
    }

    @When("^el inicia sesion desde el DA con usuario (.*) con clave (.*)$")
    public void gestorIniciaSesionFronDirAct(String user, String key) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                LoginDirAct.login(user, key));
    }
    @Then("^se vera pantalla de inicio del gestor senior$")
    public void pantallaDeInicioDelGestorSenior() {
        theActorInTheSpotlight().should(seeThat(ValidateLoginBtoC.inPage()));
    }




}
