package creditos01.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class LoginBtoCUser {

    public static final Target BOX_USER_BTOC=Target.the("Caja USER").located(By.id("email"));

   public static final Target BOX_PASS_BTOC=Target.the("Caja PASS").located(By.id("password"));
    public static final Target BTN_SIGN_IN_BTOC=Target.the("BOTTON SIGN IN").located(By.id("next"));

    public static final Target VAL_LOGIN=Target.the("Validación de LOGIN OK").locatedBy("//*[contains(text(),'¡Hola!, ')]");

}
