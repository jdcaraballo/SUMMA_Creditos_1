package creditos01.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class LoginUser {
    public static final Target BTN_CEMENTOS=Target.the("Caja USER").locatedBy("//*[@id='Cementos']");
    public static final Target BOX_USER=Target.the("Caja USER").located(By.id("i0116"));
    public static final Target BTN_NEXT=Target.the("BOTTN NEXT").located(By.id("idSIButton9"));
    public static final Target BOX_PASS=Target.the("Caja PASS").located(By.id("passwordInput"));
    public static final Target BTN_SIGN_IN=Target.the("BOTTON SIGN IN").located(By.id("submitButton"));
    public static final Target BTN_DOBLE_VALID_AUTHEN=Target.the("BOTTON SIGN IN").locatedBy("//*[@id='idDiv_SAOTCS_Proofs']/div[1]/div/div/div[2]/div");
    public static final Target BTN_SI_STAY_START=Target.the("BOTON PARA MANTENER INICIADA LA SESION").located(By.id("idSIButton9"));
    public static final Target VAL_LOGIN=Target.the("Validación de LOGIN OK").locatedBy("//*[contains(text(),'¡Hola!, ')]");

}
