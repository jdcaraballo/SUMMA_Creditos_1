package creditos01.tasks.autentication;

import creditos01.interactions.Wait;
import creditos01.interactions.WaitElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static creditos01.userinterfaces.LoginBtoCUser.*;
import static creditos01.userinterfaces.LoginBtoCUser.BTN_SIGN_IN_BTOC;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginB2C implements Task {


    private final String user;
    private final String key;

    public LoginB2C(String user, String key) {
        this.user = user;
        this.key = key;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitElement.isPresent(BOX_USER_BTOC),
                Click.on(BOX_USER_BTOC),
                Enter.theValue(user).into(BOX_USER_BTOC),
                Click.on(BOX_PASS_BTOC),
                Enter.theValue(key).into(BOX_PASS_BTOC));

//        actor.attemptsTo(
//                Wait.aTime(10000));

//        UploadFileTo.validFormat(FILE_INVALID.getPath());

        actor.attemptsTo(
                WaitElement.isClickable(BTN_SIGN_IN_BTOC),
                Click.on(BTN_SIGN_IN_BTOC),
                Wait.aTime(5000));
    }
    public static LoginB2C login(String user, String key) {
        return instrumented(LoginB2C.class, user, key);
    }



}
