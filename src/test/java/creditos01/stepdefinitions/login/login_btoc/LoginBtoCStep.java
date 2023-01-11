package creditos01.stepdefinitions.login.login_btoc;


import creditos01.interactions.HomePage;
import creditos01.questions.val_login.ValidateLoginBtoC;
import creditos01.tasks.autentication.LoginB2C;
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


public class LoginBtoCStep {
    @Managed
    static
    WebDriver myDriver;
    @Before
    public static void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        theActorCalled("David").can(BrowseTheWeb.with(myDriver));
    }
    @Given("^que el abre pagina principal$")
    public void queElAbrePaginaPrincipal() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                HomePage.inPage());
    }

    @When("^el inicia sesion con usuario (.*) con clave (.*)$")
    public void gestorIniciaSesion(String user, String key) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                LoginB2C.login(user, key));
    }
    @Then("^se vera pantalla de inicio del gestor senior$")
    public void pantallaDeInicioDelGestorSenior() {
        theActorInTheSpotlight().should(seeThat(ValidateLoginBtoC.inPage()));
    }




}
