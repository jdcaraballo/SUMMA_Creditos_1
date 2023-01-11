package creditos01.tasks.dtf_add_new_fee;


import creditos01.interactions.SecondTabs;
import creditos01.interactions.Wait;
import creditos01.interactions.WaitElement;
import creditos01.model.dtf_new.CreateDtf;
import creditos01.model.dtf_new.DatosDtfBuilder;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static creditos01.userinterfaces.DtfAddUser.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class DatosDtf2023 implements Task {
    public final CreateDtf createDtf;

    public DatosDtf2023(CreateDtf createDtf) {
        this.createDtf = createDtf;
    }

    public static DatosDtf2023 inPage (DatosDtfBuilder createDtf){
       return instrumented(DatosDtf2023.class, createDtf.build());
    }

//
//    public DatosDtf2023(CreateDtf createDtf) {
//        this.createDtf = createDtf;
//    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitElement.isVisible(BTN_IN_PORTAL_CREDITOS),
                Click.on(BTN_IN_PORTAL_CREDITOS),
                WaitElement.isVisible(BTN_VER_TASA_DE_INTERES),
                Click.on(BTN_VER_TASA_DE_INTERES),
                Click.on(BTN_AGREGAR_DTF),
                WaitElement.isVisible(VALIDATE_BOX_ADD_FEE),
                Wait.aTime(5000),

                SecondTabs.a("Agregar indicador de tasas para DTF"),
                Wait.aTime(5000),
//                WaitElement.isVisible(BOX_DESCRIPTION),
//                JavaScriptClick.on(BOX_DESCRIPTION),
//                Click.on(BOX_DESCRIPTION),
//                Enter.theValue("asdfasdf").into(BOX_DESCRIPTION),
//                Enter.theValue(createDtf.getDescription()).into(BOX_DESCRIPTION),
                Click.on(BOX_INITIAL_DATE),
//                Enter.theValue(createDtf.getInitialDate()).into(BOX_INITIAL_DATE),
//                Click.on(BOX_FINAL_DATE),
//                Enter.theValue(createDtf.getFinalDate()).into(BOX_FINAL_DATE),
//                Click.on(BOX_ADD_FEE),
//                Enter.theValue(createDtf.getFee()).into(BOX_ADD_FEE),
//                Click.on(SAVE_FEE),
                Wait.aTime(1000)

        );
    }


}
