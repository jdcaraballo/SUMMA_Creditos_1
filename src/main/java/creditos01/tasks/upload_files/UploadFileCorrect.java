package creditos01.tasks.upload_files;

import creditos01.interactions.Wait;
import creditos01.interactions.WaitElement;
import creditos01.utils.UploadFile;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;


import static creditos01.userinterfaces.UploadFileUser.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class UploadFileCorrect implements Task {



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitElement.isClickable(BTON_BENEFITS_MODUL),
                Scroll.to(BTON_BENEFITS_MODUL),
                Click.on(BTON_BENEFITS_MODUL),

                WaitElement.isClickable(BTN_LOAD_CURRENT_BENEFITS),
                Click.on(BTN_LOAD_CURRENT_BENEFITS),
                WaitElement.isClickable(DROPDOWN_SELECT_TYPE_BENEFIT),
                Click.on(DROPDOWN_SELECT_TYPE_BENEFIT),
                WaitElement.isClickable(OPTION_AUXILIOS),
                Click.on(OPTION_POLIZAS),
                Wait.aTime(2000),
                Click.on(BTN_SELECT_FILE),
                Wait.aTime(3000));

                UploadFile.inImat();

        actor.attemptsTo(
               WaitElement.isClickable(BTN_SEND),
                Click.on(BTN_SEND),
                Wait.aTime(5000)
        );
    }
    public static UploadFileCorrect upLoadFileT() {
        return instrumented(UploadFileCorrect.class);
  }

    }
