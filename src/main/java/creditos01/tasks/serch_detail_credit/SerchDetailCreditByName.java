package creditos01.tasks.serch_detail_credit;

import creditos01.interactions.Wait;
import creditos01.interactions.WaitElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;

import static creditos01.userinterfaces.SerchDetailCreditUser.ICON_LUPA_WATCH_DETAIL;
import static creditos01.userinterfaces.SerchDetailCreditUser.VALIDATION_VIEW_DETAIL_CREDIT;
import static creditos01.userinterfaces.SerchMassiveCreditsUser.BOX_CONSULTAR_CRED_NAME;
import static creditos01.userinterfaces.SerchMassiveCreditsUser.BTN_VER_CREDITOS;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.openqa.selenium.Keys.ENTER;

public class SerchDetailCreditByName implements Task {

    private final String name;

    public SerchDetailCreditByName(String name) {
        this.name = name;
}
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_VER_CREDITOS),
                WaitElement.isClickable(BOX_CONSULTAR_CRED_NAME),
                Click.on(BOX_CONSULTAR_CRED_NAME),
                Enter.theValue(name).into(BOX_CONSULTAR_CRED_NAME),
                Hit.the(ENTER).into(BOX_CONSULTAR_CRED_NAME),
                Click.on(ICON_LUPA_WATCH_DETAIL),
                Wait.aTime(5000),
                Click.on(VALIDATION_VIEW_DETAIL_CREDIT));



    }
    public static SerchDetailCreditByName serchDetailCreditByName(String name) {
        return instrumented(SerchDetailCreditByName.class, name);
  }


    }
