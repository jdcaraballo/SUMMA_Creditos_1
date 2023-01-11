package creditos01.tasks.autentication;

import creditos01.interactions.Wait;
import creditos01.interactions.WaitElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static creditos01.userinterfaces.LoginUser.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginDirAct implements Task {


    private final String user;
    private final String key;

    public LoginDirAct(String user, String key) {
        this.user = user;
        this.key = key;
}
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_CEMENTOS),
                WaitElement.isPresent(BOX_USER),
                Click.on(BOX_USER),
                Enter.theValue(user).into(BOX_USER),
                Click.on(BTN_NEXT),
                WaitElement.isPresent(BOX_PASS),
                Click.on(BOX_PASS),
                Enter.theValue(key).into(BOX_PASS),
                Click.on(BTN_SIGN_IN),
                WaitElement.isPresent(BTN_DOBLE_VALID_AUTHEN),
                Click.on(BTN_DOBLE_VALID_AUTHEN),
                Wait.aTime(15000),
                Click.on(BTN_SI_STAY_START),
                Wait.aTime(5000));
    }
    public static LoginDirAct login(String user, String key) {
        return instrumented(LoginDirAct.class, user, key);
  }


    }
