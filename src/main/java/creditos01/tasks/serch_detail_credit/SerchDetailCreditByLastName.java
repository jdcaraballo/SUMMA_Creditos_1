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
import static creditos01.userinterfaces.SerchMassiveCreditsUser.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.openqa.selenium.Keys.ENTER;

public class SerchDetailCreditByLastName implements Task {

    private final String lastName;

    public SerchDetailCreditByLastName(String lastName) {
        this.lastName = lastName;
}
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_VER_CREDITOS),
                WaitElement.isClickable(BOX_CONSULTAR_CRED_LASTNAME),
                Click.on(BOX_CONSULTAR_CRED_LASTNAME),
                Enter.theValue(lastName).into(BOX_CONSULTAR_CRED_LASTNAME),
                Hit.the(ENTER).into(BOX_CONSULTAR_CRED_LASTNAME),
                Click.on(ICON_LUPA_WATCH_DETAIL),
                Wait.aTime(5000),
                Click.on(VALIDATION_VIEW_DETAIL_CREDIT));



    }
    public static SerchDetailCreditByLastName serchDetailCreditBylastName(String lastName) {
        return instrumented(SerchDetailCreditByLastName.class, lastName);
  }


    }
