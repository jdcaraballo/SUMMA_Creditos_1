package creditos01.questions.val_login;

import creditos01.interactions.WaitElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


import static creditos01.userinterfaces.LoginUser.VAL_LOGIN;

public class ValidateLoginDirAct implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(WaitElement.isVisible(VAL_LOGIN));
        return true;

    }
    public static ValidateLoginDirAct inPage() {
        return new ValidateLoginDirAct();
    }
}

