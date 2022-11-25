package creditos01.questions.serch_detail_credit;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static creditos01.userinterfaces.SerchDetailCreditUser.*;
import static creditos01.userinterfaces.SerchMassiveCreditsUser.VALIDATE_CURRENT_BALANCE;

public class ValidateDetailCredit implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {

        if(VIEW_MASSIVE_CREDIT.resolveFor(actor).isVisible())
            return false;
        return true;

    }
    public static ValidateDetailCredit inPage() {
        return new ValidateDetailCredit();
    }
}

