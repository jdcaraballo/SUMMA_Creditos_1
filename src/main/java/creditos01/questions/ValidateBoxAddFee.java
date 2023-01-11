package creditos01.questions;

import creditos01.interactions.WaitElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static creditos01.userinterfaces.DtfAddUser.VALIDATE_BOX_ADD_FEE;

public class ValidateBoxAddFee implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(WaitElement.isVisible(VALIDATE_BOX_ADD_FEE));
        return true;

    }
    public static ValidateBoxAddFee inPage() {
        return new ValidateBoxAddFee();
    }
}

