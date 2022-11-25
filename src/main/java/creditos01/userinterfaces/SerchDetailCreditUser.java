package creditos01.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class SerchDetailCreditUser {
    public static final Target ICON_LUPA_WATCH_DETAIL=Target.the("ICONO VER DETALLES DEL CREDITO").locatedBy("(//*[@class='p-button-icon pi pi-search'])[1]");
    public static final Target VALIDATION_VIEW_DETAIL_CREDIT=Target.the("Validación de vista de DETALLES DEL CREDITO").locatedBy("//*[@class='p-button-label']");
    public static final Target VIEW_MASSIVE_CREDIT=Target.the("vista de  CREDITOS MASIVO").locatedBy("//*[@id='p-panel-7-titlebar' and contains(.,('Créditos'))]");



}
