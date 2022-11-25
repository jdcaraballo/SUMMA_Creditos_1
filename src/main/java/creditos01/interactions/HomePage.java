package creditos01.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class HomePage implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url("https://app-expcolaborador-frontend-qa.azurewebsites.net")
        );
    }
    public static HomePage inPage(){ return instrumented(HomePage.class);
    }
}
