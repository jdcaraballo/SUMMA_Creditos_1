package creditos01.interactions;

import creditos01.model.dtf_new.DatosDtfBuilder;
import creditos01.tasks.dtf_add_new_fee.DatosDtf2023;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class InTo {


//    public static Login iniciarSesion(LoginBuilder createLogin) {
//        return instrumented(IniciarSesion.class, createLogin.build());
//    }


    public static DatosDtf2023 dtfAddNewFee2023(DatosDtfBuilder createDtf) {
        return instrumented(DatosDtf2023.class, createDtf.build());
        }

//    public static CreateDtf createDtf(DatosDtfBuilder createDtf) {
//        return instrumented(CreateDtf.class, createDtf.build());
//    }

}
