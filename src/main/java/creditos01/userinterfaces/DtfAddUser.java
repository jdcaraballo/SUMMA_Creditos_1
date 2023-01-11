package creditos01.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DtfAddUser {
    public static final Target BTN_IN_PORTAL_CREDITOS=Target.the("Boton ingresar al portal CRÉDITOS").locatedBy("//*[contains(text(),'Créditos')]");
    public static final Target BTN_VER_TASA_DE_INTERES=Target.the("Boton ver tasas de interés").locatedBy("//*[@class='container']//*[contains(text(),'Indicadores tasas de interés')]");
    public static final Target BTN_AGREGAR_DTF=Target.the("Boton AGREGAR DTF").locatedBy("(//*[contains(text(),'Agregar')])[2]");
    public static final Target BTN_AGREGAR_DTF_FULL=Target.the("Boton AGREGAR DTF").locatedBy("(//*[@class='p-panel-content ng-tns-c33-0']//*[contains(.,'DTF')]//*[contains(.,'Agregar')])[10]");
    public static final Target VALIDATE_BOX_ADD_FEE=Target.the("Validar box para agregar fee").locatedBy("//*[contains(text(),'Agregar indicador de tasas par')]");
    public static final Target BOX_DESCRIPTION=Target.the("CAJA PARA AGREGAR DESCRIPCIÓN DE LA FEE").locatedBy("//*[@id='description']");
    public static final Target BOX_INITIAL_DATE=Target.the("CAJA FECHA INICIAL").locatedBy("//*[@class='ng-tns-c71-3 p-calendar']//*[@id='basic']");
    public static final Target BOX_FINAL_DATE=Target.the("CAJA FECHA FINAL").locatedBy("//*[@class='ng-tns-c71-4 p-calendar']//*[@id='basic']");
    public static final Target BOX_ADD_FEE=Target.the("CAJA AGREGAR FEE").locatedBy("//*[@class='p-inputnumber p-component']//*[@class='p-inputtext p-component p-element p-inputnumber-input']");
    public static final Target SAVE_FEE=Target.the("GUARDAR FEE").locatedBy("//*[contains(text(),'Save')]");
}
