public class Medico extends Object {

    protected boolean trabajaEnHospital;

    public Medico() {
    }

    public Medico(boolean trabajaEnHospital) {
        this.trabajaEnHospital = trabajaEnHospital;
    }

    public void tratarPaciente() {
        System.out.println("Realizar un chequeo");
    }

    public boolean isTrabajaEnHospital() {
        return trabajaEnHospital;
    }

    public void setTrabajaEnHospital(boolean trabajaEnHospital) {
        this.trabajaEnHospital = trabajaEnHospital;
    }
}
