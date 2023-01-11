package creditos01.tasks.serch_all_credits;

import creditos01.interactions.Wait;
import creditos01.interactions.WaitElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import static creditos01.userinterfaces.SerchMassiveCreditsUser.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.openqa.selenium.Keys.BACK_SPACE;

public class SerchCreditByAll implements Task {

    private final String company;

    public SerchCreditByAll(String company) {
        this.company = company;
}
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_VER_CREDITOS_MASIVOS),
                WaitElement.isClickable(BOX_CONSULTAR_CRED_COMPANIA),
                Click.on(BOX_CONSULTAR_CRED_COMPANIA),
                Enter.theValue(company).into(BOX_CONSULTAR_CRED_COMPANIA),
//                Hit.the(ENTER).into(BOX_CONSULTAR_CRED_COMPANIA),
                Wait.aTime(5000),

                Click.on(BOX_CONSULTAR_CRED_COMPANIA_FILLED),


//                DoubleClick.on(BOX_CONSULTAR_CRED_COMPANIA),
                SendKeys.of(BACK_SPACE).into(BOX_CONSULTAR_CRED_COMPANIA_FILLED),
                Hit.the(BACK_SPACE).into(BOX_CONSULTAR_CRED_COMPANIA),
                Hit.the(BACK_SPACE).into(BOX_CONSULTAR_CRED_COMPANIA),
                Hit.the(BACK_SPACE).into(BOX_CONSULTAR_CRED_COMPANIA),
                Hit.the(BACK_SPACE).into(BOX_CONSULTAR_CRED_COMPANIA),
                Hit.the(BACK_SPACE).into(BOX_CONSULTAR_CRED_COMPANIA),
//                Hit.the(BACK_SPACE).into(BOX_CONSULTAR_CRED_COMPANIA),
//                Hit.the(BACK_SPACE).into(BOX_CONSULTAR_CRED_COMPANIA),
//                Hit.the(BACK_SPACE).into(BOX_CONSULTAR_CRED_COMPANIA),
//                Hit.the(BACK_SPACE).into(BOX_CONSULTAR_CRED_COMPANIA),
//                Hit.the(BACK_SPACE).into(BOX_CONSULTAR_CRED_COMPANIA),
//                Hit.the(BACK_SPACE).into(BOX_CONSULTAR_CRED_COMPANIA),

//                Click.on(BOX_CONSULTAR_CRED_COMPANIA_FILLED),


                Enter.theValue("DAvid").into(BOX_CONSULTAR_CRED_COMPANIA)



        );
    }
    public static SerchCreditByAll serchCreditsAll(String company) {
        return instrumented(SerchCreditByAll.class, company);
  }


    }
