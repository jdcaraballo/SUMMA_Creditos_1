package creditos01.model.dtf_new;

public class CreateDtf {

    private final String description;
    private final String initialDate;
    private final String finalDate;
    private final String fee;

    public CreateDtf(DatosDtfBuilder builder) {
        this.description = builder.getDescription();
        this.initialDate = builder.getInitialDate();
        this.finalDate = builder.getFinalDate();
        this.fee = builder.getFee();
    }

    public String getDescription() {return description;}
    public String getInitialDate() { return initialDate;}
    public String getFinalDate() {  return finalDate;}
    public String getFee() {  return fee;}

}
