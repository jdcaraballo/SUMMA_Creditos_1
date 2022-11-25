package creditos01.tasks;

import creditos01.interactions.Wait;
import creditos01.interactions.WaitElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import static creditos01.userinterfaces.SerchMassiveCreditsUser.BOX_CONSULTAR_CRED_COMPANIA;
import static creditos01.userinterfaces.SerchMassiveCreditsUser.BTN_VER_CREDITOS;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.openqa.selenium.Keys.BACK_SPACE;
import static org.openqa.selenium.Keys.ENTER;

public class SerchCreditByAll implements Task {

    private final String company;

    public SerchCreditByAll(String company) {
        this.company = company;
}
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_VER_CREDITOS),
                WaitElement.isClickable(BOX_CONSULTAR_CRED_COMPANIA),
                Click.on(BOX_CONSULTAR_CRED_COMPANIA),
                Enter.theValue(company).into(BOX_CONSULTAR_CRED_COMPANIA),
//                Hit.the(ENTER).into(BOX_CONSULTAR_CRED_COMPANIA),
                Wait.aTime(5000),
//
//                DoubleClick.on(BOX_CONSULTAR_CRED_COMPANIA),
                Hit.the(BACK_SPACE).into(BOX_CONSULTAR_CRED_COMPANIA),
                Hit.the(BACK_SPACE).into(BOX_CONSULTAR_CRED_COMPANIA),
                Hit.the(BACK_SPACE).into(BOX_CONSULTAR_CRED_COMPANIA),
                Hit.the(BACK_SPACE).into(BOX_CONSULTAR_CRED_COMPANIA),
                Hit.the(BACK_SPACE).into(BOX_CONSULTAR_CRED_COMPANIA),
                Hit.the(BACK_SPACE).into(BOX_CONSULTAR_CRED_COMPANIA),
                Hit.the(BACK_SPACE).into(BOX_CONSULTAR_CRED_COMPANIA),
                Hit.the(BACK_SPACE).into(BOX_CONSULTAR_CRED_COMPANIA),
                Hit.the(BACK_SPACE).into(BOX_CONSULTAR_CRED_COMPANIA),
                Hit.the(BACK_SPACE).into(BOX_CONSULTAR_CRED_COMPANIA),
                Hit.the(BACK_SPACE).into(BOX_CONSULTAR_CRED_COMPANIA),


                Enter.theValue("DAvid").into(BOX_CONSULTAR_CRED_COMPANIA)



        );
    }
    public static SerchCreditByAll serchCreditsAll(String company) {
        return instrumented(SerchCreditByAll.class, company);
  }


    }
