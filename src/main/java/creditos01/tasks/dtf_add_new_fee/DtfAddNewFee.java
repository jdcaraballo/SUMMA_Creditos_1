package creditos01.tasks.dtf_add_new_fee;

import creditos01.interactions.Wait;
import creditos01.interactions.WaitElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static creditos01.userinterfaces.DtfAddUser.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DtfAddNewFee implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitElement.isVisible(BTN_IN_PORTAL_CREDITOS),
                Click.on(BTN_IN_PORTAL_CREDITOS),
                WaitElement.isPresent(BTN_VER_TASA_DE_INTERES),
                Click.on(BTN_VER_TASA_DE_INTERES),
                WaitElement.isPresent(BTN_AGREGAR_DTF),
                Click.on(BTN_AGREGAR_DTF),
                Wait.aTime(5000)

        );
    }
    public static DtfAddNewFee inPage() {
        return instrumented(DtfAddNewFee.class);
    }
    }

