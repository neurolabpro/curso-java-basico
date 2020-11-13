public class MedicoDeCabecera extends Medico {
    private boolean visitaLasCasas;

    public MedicoDeCabecera() {
        this(true);
    }

    public MedicoDeCabecera(boolean visitaLasCasas) {
        this.visitaLasCasas = visitaLasCasas;
    }

    public MedicoDeCabecera(boolean trabajaEnHospital, boolean visitaLasCasas) {
        super(trabajaEnHospital);
        this.visitaLasCasas = visitaLasCasas;
    }

    public void aconsejaPacientes() {
        System.out.println("Ofrecer medicamentos");
    }

    public boolean isVisitaLasCasas() {
        return visitaLasCasas;
    }

    public void setVisitaLasCasas(boolean visitaLasCasas) {
        this.visitaLasCasas = visitaLasCasas;
    }
}
