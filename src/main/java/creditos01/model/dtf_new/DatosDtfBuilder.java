package creditos01.model.dtf_new;

import java.util.List;
import java.util.Map;

public class DatosDtfBuilder {

    private String description;
    private String initialDate;
    private String finalDate;
    private String fee;

    public String getDescription() {
        return description;
    }
    public String getInitialDate() {
        return initialDate;
    }
    public String getFinalDate() {return finalDate; }
    public String getFee() {return fee; }

    public static DatosDtfBuilder con() {
        return new DatosDtfBuilder();
    }

    public DatosDtfBuilder description (List<Map<String, String>> datos) {
        this.description = datos.get(0).get("description");
        return this; }

    public DatosDtfBuilder initialDate (List<Map<String, String>> datos) {
        this.initialDate = datos.get(0).get("initialDate");
        return this;}

    public DatosDtfBuilder finalDate (List<Map<String, String>> datos) {
        this.finalDate = datos.get(0).get("finalDate");
        return this; }

    public DatosDtfBuilder fee (List<Map<String, String>> datos) {
        this.fee = datos.get(0).get("fee");
        return this; }

    public CreateDtf build() {
        return new CreateDtf(this);
    }

}
