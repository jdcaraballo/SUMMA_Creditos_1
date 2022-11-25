package creditos01.questions.validate_massive_credits.serch_credit_by_id;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static creditos01.userinterfaces.SerchMassiveCreditsUser.VALIDATE_EXISTING_RECORD;

public class ValidateCreditById implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {

        if(VALIDATE_EXISTING_RECORD.resolveFor(actor).isVisible())
            return true;
            return false;
    }
    public static ValidateCreditById inPage() {
        return new ValidateCreditById();
    }
}

